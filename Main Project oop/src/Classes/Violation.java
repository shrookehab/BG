/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author Basem
 */
public class Violation {

   private String name;
   private   String id;
  private    String complain;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getComplain() {
        return complain;
    }

    public String getAdress() {
        return adress;
    }

    public String getInsp_name() {
        return insp_name;
    }

    public String getPath() {
        return path;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setComplain(String complain) {
        this.complain = complain;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setInsp_name(String insp_name) {
        this.insp_name = insp_name;
    }

    public void setPath(String path) {
        this.path = path;
    }
     private String adress;
     private String insp_name;
      private String path;

    public Violation(String Id, String Name, String Adress, String Complain,String insp_name,String path) {
    this.name = Name;
    this.id = Id;
    this.complain = Complain;
    this.adress = Adress;
    this.insp_name=insp_name;
    this.path=path;
    }
     public Violation() {
 
    }
}
