package com.dbc.pessoaapi.repository;

import com.dbc.pessoaapi.entity.Endereco;
import com.dbc.pessoaapi.entity.TipoEndereco;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

@Repository
public class EnderecoRepository {
    private static List<Endereco> listaEnderecos = new ArrayList<>();
    private AtomicInteger COUNTER = new AtomicInteger();
    private AtomicInteger COUNTER2 = new AtomicInteger();

    public EnderecoRepository() {

        listaEnderecos.add(new Endereco(COUNTER.incrementAndGet(), COUNTER2.incrementAndGet(), TipoEndereco.RESIDENCIAL,"Rua Mandacaru",50,null,"54768-90","Porto Alegre","RS","BR"));
    }

    public List<Endereco> list() {
        return listaEnderecos;
    }

    public List<Endereco> listByIdEndereco(Integer idEndereco) {
        return listaEnderecos.stream()
                .filter(endereco -> endereco.getIdEndereco().equals(idEndereco))
                .collect(Collectors.toList());
    }

    public List<Endereco> listByIdPessoa(Integer idPessoa) {
        return listaEnderecos.stream()
                .filter(endereco -> endereco.getIdPessoa().equals(idPessoa))
                .collect(Collectors.toList());
    }

    public Endereco create( Integer IdPessoa,Endereco endereco) {
        endereco.setIdPessoa(IdPessoa);
        endereco.setIdEndereco(COUNTER.incrementAndGet());
        listaEnderecos.add(endereco);
        return endereco;
    }

    public Endereco update(Integer idEndereco, Endereco enderecoAtual) throws Exception {
        Endereco enderecoBackup = listaEnderecos.stream()
                .filter(endereco -> endereco.getIdEndereco().equals(idEndereco))
                .findFirst()
                .orElseThrow(() -> new Exception("Endereço não  foi encontrado"));
        enderecoBackup.setIdPessoa(enderecoAtual.getIdPessoa());
        enderecoBackup.setTipo(enderecoAtual.getTipo());
        enderecoBackup.setLogradouro(enderecoAtual.getLogradouro());
        enderecoBackup.setNumero(enderecoAtual.getNumero());
        enderecoBackup.setComplemento(enderecoAtual.getComplemento());
        enderecoBackup.setCep(enderecoAtual.getCep());
        enderecoBackup.setCidade(enderecoAtual.getCidade());
        enderecoBackup.setEstado(enderecoAtual.getEstado());
        enderecoBackup.setPais(enderecoAtual.getPais());
        return enderecoBackup;
    }

    public void delete(Integer idEndereco) throws Exception {
        Endereco enderecoRec = listaEnderecos.stream()
                .filter(endereco -> endereco.getIdEndereco().equals(idEndereco))
                .findFirst()
                .orElseThrow(() -> new Exception("Endereço não encontrado"));
        listaEnderecos.remove(enderecoRec);
    }

}
