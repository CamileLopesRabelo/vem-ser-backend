package com.dbc.pessoaapi.repository;
import com.dbc.pessoaapi.entity.ContatoEntity;
import com.dbc.pessoaapi.entity.TipoContato;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ContatoRepository extends JpaRepository<ContatoEntity, Integer> {
    //JPQL
    @Query("select c from Contato c where c.tipoContato = :tipoContato")
    List<ContatoEntity> contatoByTipo(TipoContato tipoContato);

    // NATIVO
    @Query(value = "select * from CONTATO c where ID_PESSOA = ?1",nativeQuery = true)
    List<ContatoEntity> contatoByIdPessoa(Integer idPessoa);

}