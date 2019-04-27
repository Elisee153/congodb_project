package congodb_projet.Kernel;

class Database{

    private int id ;
    private int static nbrInstance = 0;
    private String nom;

    public Database(String nom){
        this.nom = nom;
        this.id = ++Database.nbrInstance;
    }

    public int getID(){
        return this.id;
    }

    public String getNom(){
        return this.nom;
    }

    public void setNom(String nom){
        this.nom = nom;
    }
    public boolean createDB(){

    }

    public boolean dropDB(){

    }


}