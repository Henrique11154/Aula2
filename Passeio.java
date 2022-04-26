public class Passeio {
    public static void main(String[] args) {

        Caminhada caminhada = new Caminhada();
        Pessoa pessoa = new Pessoa();        

        Cachorro cao = new Cachorro();
        cao.idade = 5;
        cao.nome = "Thor";
        cao.raca = "Galgo Alfegão";
        cao.sexo = 'M';

        pessoa.cachorro = cao;
        pessoa.nome = "Talles";

        caminhada.andar(pessoa);
    }

}
