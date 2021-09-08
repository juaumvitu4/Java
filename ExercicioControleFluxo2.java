public class ExercicioControleFluxo2 {
    public static void main(String[] args) {
        // Crie um switch que dado um valor de 1 a 7
        // Considerando 1 domingo imprima se é dia util ou final de semana
        byte dia = 5;
        // char, int, byte, short, enum e String
        switch (dia) {
            case 1:
                System.out.println("Domingo é Final De Semana");
                break;
            case 2:
                System.out.println("Segunda, Dia util");
                break;
            case 3:
                System.out.println("Terça, Dia util");
                break;
            case 4:
                System.out.println("quarta, Dia Util");
                break;
            case 5:
                System.out.println("Quinta, Dia Util");
                break;
            case 6:
                System.out.println("Sexta, Dia Util");
                break;
            case 7:
                System.out.println("Sabado, Final De Semana");
                break;
        }
    }
}
