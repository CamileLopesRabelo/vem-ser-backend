package com.dbc.pessoaapi.repository;


import com.dbc.pessoaapi.entity.PessoaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.time.LocalDate;
import java.util.List;

@Repository
public interface PessoaRepository extends JpaRepository<PessoaEntity, Integer> {
    List<PessoaEntity>findByNomeContainingIgnoreCase(String nome);
    PessoaEntity findByCpf (String cpf);
    List<PessoaEntity> findByDataNascimentoBetween(LocalDate dataInicial, LocalDate dataFinal);
    //JPQL
    @Query("select p from Pessoa p " +
            "left join p.enderecos e")
    List<PessoaEntity> EnderecoPessoa();

    @Query("select p from Pessoa p where p.dataNascimento between :inicio and :fim")
    List<PessoaEntity> pessoaPorDataNasc(LocalDate inicio, LocalDate fim);

    @Query("select distinct p" +
            " from Pessoa p " +
            "inner join p.enderecos e")
    List<PessoaEntity> pessoaQuePossuemEndereco();

    //NATIVA
    @Query(value = "SELECT * " +
            " FROM PESSOA p " +
            " LEFT JOIN PESSOA_X_PESSOA_ENDERECO pxpe ON (p.ID_PESSOA = pxpe.ID_PESSOA)" +
            " WHERE pxpe.ID_PESSOA IS NULL",nativeQuery = true)
    List<PessoaEntity> pessoaSemEndereco();
}
