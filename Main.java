
public class Main{
    public static void main(String[] args) {
        menu();
    }
    public static void menu(){
        System.out.println("*****CONGO DATABASE*****");
        System.out.println("=============================");
        System.out.println("Le menu ci-dessous presente les differentes actions que vous pouvez executer.");
        System.out.println("================================================================================");
        System.out.println("Creer une BD: java Main -cbd");
        System.out.println("Supprimer une BD: java Main -dbd");
        System.out.println("Creer une table: java Main -ctb");
        System.out.println("Supprimer une table: java Main -dtb");        
        System.out.println("Inserer de donnees: java Main -idt");
        System.out.println("Selectionner des donnees: java Main -sdata");
        System.out.println("Mis a jours des donnees: java Main -udata");
        System.out.println("Supprimer des donnees: java Main -dldata");
    }
}