/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package railway.reservation;

import java.util.Scanner;

/**
 *
 * @author moham
 */
class Train {
    private String train_Id;
    private Station[] train_Stations = new Station[4];
    private int[][] railroad_cars = new int[3][4]; //Row Is Cars || Columns Is Seats

    Scanner ob=new Scanner(System.in); 

    public int[][] getRailroad_cars() {
        return railroad_cars;
    }

    public void setRailroad_cars(int[][] arr){
        this.railroad_cars = arr;
    }

    public String getTrain_Id() {
        return train_Id;
    }

    public Station[] getTrain_Stations() {
        return train_Stations;
    }

    public void setTrain_Stations(Station[] train_Stations) {
        for (int i = 0 ; i < 4 ; i++) {
            this.train_Stations[i] = train_Stations[i];
        }
    }

    public void setTrain_Id(String train_Id) {
        this.train_Id = train_Id;
    }

    public void View_The_Reserved_seats_At_Train(){

        System.out.println("The Reserved seats At Train No ("+this.getTrain_Id()+") is Seats That Have Value 1 In This Table: ");
        System.out.print("Seat Number    : ");
        for(int a = 0; a < 4; a++){
            System.out.print("(" + (a+1) + ") ");
        } 
        System.out.println();
          for (int i = 0; i < 3; i++) {
              System.out.print("Car Number (" + (i+1) + ") : ");
            for (int j = 0; j < 4; j++) {
                System.out.print(" " + getRailroad_cars()[i][j] + "  ");
            }
  
            System.out.println();
        }
        
    }

    public boolean add_aseat(int s,int n){
        boolean test=false;
        System.out.println();
        if( getRailroad_cars()[n-1][s-1]==0){
            //adding 1 to (n,s) that n is railroad_car and  s is seat 
            railroad_cars[n-1][s-1]=1;
             test=true;
         }
         else
            System.out.println("*************** This Seat Is Reserved ***************");  
       
        
        return test;
    }
    
    public boolean revmove_seat(int n,int s){
    
        boolean test=false;
       
         if( railroad_cars[n-1][s-1]==1)
         {
            //removing 1 to (n,s) that n is railroad_car and  s is seat 
            railroad_cars[n-1][s-1]=0;
            test=true;
         }
         else
            System.out.println(" ***************This Seat Is empty***************");  
       
        
        return test;
    }
    
    public boolean search_seat(int s,int n){
        boolean test=false;
    if( railroad_cars[n-1][s-1]==1)
         {
            test=true;
         }
        
    return test;
        
    }
    
}
