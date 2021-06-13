package Classes;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Basem
 */
public class myexciption {
   private  String message="";
 public myexciption(String message){
     this.message=message;
 }   

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
 public String view_exciption(){
    return this.message;
}
}
