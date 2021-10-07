package orientaçãoobjeto;

public class Cliente {
 public Cliente(String nome, String cpf) {
  this.nome = nome;
  this.cpf = cpf;
 }

 public String nome;
 public String cpf;
 public Contato contatos[] = new Contato[2];
 public Endereco enderecos[] = new Endereco[2];

 public void imprimirContatos() {
  for (Contato cont:contatos) {
   cont.imprimirContato();
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





}
