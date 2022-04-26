public class Paciente {
    
    double peso;
    double altura;

    IMC calculaIndiceMassaCorporal(){

        IMC imc = new IMC();
        double indice = peso/(altura*altura);

        imc.indice = indice;

        if(indice < 18.5){
            imc.abaixoDoPeso = true;     
        }else if(indice < 25){
            imc.pesoIdeal = true;
        }else{
            imc.obeso = true;
            if (indice < 30){
                System.out.println("Acima do peso");
            }else if(indice < 35){
                System.out.println("Obesidade Grau I");
            }else if(indice < 40){
                System.out.println("Obesidade Grau II");
            }else{
                System.out.println("Obesidade Grau III");
            }
        }
        return imc;
    }

    double calculaIMC(){
        double indice = peso/(altura*altura);

        if(indice < 18.5){
            System.out.println("Esta abaixo do peso");
        }else if(indice < 25){
            System.out.println("Esta no peso ideal");
        }else{
            System.out.println("Está obeso");
            if (indice < 30){
                System.out.println("Acima do peso");
            }else if(indice < 35){
                System.out.println("Obesidade Grau I");
            }else if(indice < 40){
                System.out.println("Obesidade Grau II");
            }else{
                System.out.println("Obesidade Grau III");
            }
        }
        return indice;
    }
    
}
