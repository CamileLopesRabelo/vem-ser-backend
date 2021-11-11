package com.dbc.pessoaapi.repository;
import com.dbc.pessoaapi.entity.EnderecoEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface EnderecoRepository extends JpaRepository<EnderecoEntity, Integer> {

    //QUEry com Jpql
    @Query("select p " +
            " from endereco_pessoa p " +
            "where upper(pais) = :pais ")
    List<EnderecoEntity> enderecoByPais(String pais);


    @Query("select ep from endereco_pessoa ep " +
            "join ep.pessoas p where p.idPessoa = ?1 ")
    List<EnderecoEntity> enderecoBYIdPessoa(Integer idPessoa);

    //Query Nativa
    @Query(value = "select * from VEM_SER.ENDERECO_PESSOA ep " +
            "where ep.PAIS = ?1 or ep.CIDADE = ?2 ", nativeQuery = true)
    List<EnderecoEntity> enderecoPaisCidade(String pais, String Cidade);

    @Query(value = " select * from VEM_SER.ENDERECO_PESSOA ep " +
            "where ep.COMPLEMENTO is null",nativeQuery = true)
    List<EnderecoEntity> enderecoSemComplemento ();

    @Query("select p " +
            " from endereco_pessoa p " +
            "where upper(pais) = upper(:pais) ")
    Page<EnderecoEntity> enderecoByPaisPageable(String pais, Pageable pageable);

}
