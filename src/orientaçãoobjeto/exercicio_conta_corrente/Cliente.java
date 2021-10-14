package orientaçãoobjeto.exercicio_conta_corrente;

public class Cliente {
 private String nome;
 private String cpf;
 private Contato contatos[] = new Contato[2];
 private Endereco enderecos[] = new Endereco[2];

 public Cliente(String nome, String cpf, Contato[] contatos, Endereco[] enderecos) {
  this.nome = nome;
  this.cpf = cpf;
  this.contatos = contatos;
  this.enderecos = enderecos;
 }

 public void imprimirContatos() {
  for (Contato cont : contatos) {
   if (contatos != null) {
    cont.imprimirContato();
   }
  }
 }
 public void imprimirEndereco() {
  for (Endereco end: enderecos) {
   end.imprimirEndereço();
  }
 }
 public void imprimirCliente() {
  System.out.println("Nome: " + nome);
  System.out.println("cpf: " + cpf);
 }


 public String getNome() {
  return nome;
 }

 public void setNome(String nome) {
  this.nome = nome;
 }

 public String getCpf() {
  return cpf;
 }

 public void setCpf(String cpf) {
  this.cpf = cpf;
 }
}
