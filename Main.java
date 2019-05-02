import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        menu();
        //recupere le choix        
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine();
        char choix = choice.charAt(0);
        //============================
        switch (choix) {                      
            case '1':
                break;
            case '2':
                break;
            case '3':
                break;
            case '4':
                break;
            case '5':
                break;
            case '6':
                break;
            case '7':
                break;
            case '8':
                break;
            case '0':
                quitter();
                break;        
            default:
                break;
        }
    }
    public static void menu(){
        System.out.println("*****CONGO DATABASE*****");
        System.out.println("=============================================================");
        System.out.println("Le menu ci-dessous presente les differentes actions que vous pouvez executer.");
        System.out.println("===============================================================================");
        System.out.println("-Creer une BD: 1");
        System.out.println("-Supprimer une BD: 2");
        System.out.println("-Creer une table: 3");
        System.out.println("-Supprimer une table: 4");        
        System.out.println("-Inserer de donnees: 5");
        System.out.println("-Selectionner des donnees: 6");
        System.out.println("-Mis a jours des donnees: 7");
        System.out.println("-Supprimer des donnees: 8");
        System.out.println("Quitter: 0");
        
    }

    public static void quitter(){
        
        System.out.println("Programme termine");
    }
}