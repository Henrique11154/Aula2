public class Principal {
    public static void main(String[] args) {
        Paciente p = new Paciente();
        p.peso = 1.77;
        p.altura = 90;
        //double imc = p.calculaIMC();
        //System.out.println("O valor do IMC: " + imc);
        IMC imc = p.calculaIndiceMassaCorporal();
        System.out.println(imc);
 
    }
}
