package congodb_project.Kernel;

/*
*Ce fichier contient tous ce qui concerne la creation
*et les operations sur des tables
*/

 //import package
 import java.util.List;
 import java.util.ArrayList;

 //class
public class Table{
     //fields
     private int id;
     private static int nbreInstance = 0 ;
     private String nom;
     private List<Field> champs = new ArrayList<Field>();

     //constructer
     public Table(String nom){
         this.nom = nom;
     }
     
     //getters and setters
     public int getId(){
         return this.id;
     }
     public String getNom(){
         return this.nom;
     }
     public List<Field> getField(){
         return this.champs;
     }
     public void setNom(String nom){
         this.nom = nom;
     }
     public void addField(Field champ){
         this.champs.add(champ);
     }
     
     //table operations
     public boolean createTable(){

     }
     public boolean insertData(){

     }
     public String selectData(){

     }
     public boolean updateData(){

     }
     public boolean deleteData(){

     }
     


 }