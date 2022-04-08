/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package railway.reservation;

// import java.util.ArrayList;
import java.util.Scanner;
// import java.util.Vector;

/**
 *
 * @author moham
 */
public class RailwayReservation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // to do code application logic here
        Scanner sc = new Scanner(System.in);
        
        Ticket_Clerk clerk = new Ticket_Clerk();
        System.out.println("******************************************************");
        System.out.println("****************** Welcome Here ('_') ****************");
        System.out.println("******************************************************");
        while(true){
            System.out.println("Please Enter 1 To Add Reservation Or 2 To Remove Reservation Or 0 To Exit Program");
            int chose = sc.nextInt();

            if(chose == 1){
                clerk.Reserve_Ticket();
            }else if(chose == 2){
                clerk.Remove_Ticket();
            }else if(chose == 0){
                System.out.println("******************************************************");
                System.out.println("******************** Good Bay ('_') ******************");
                System.out.println("******************************************************");
                break;
            }else{
                System.out.println("Please Enter Valid Number From Below");
            }
        }
        
        
    }
}
