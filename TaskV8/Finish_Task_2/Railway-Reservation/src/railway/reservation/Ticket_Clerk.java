    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package railway.reservation;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author moham
 */
public class Ticket_Clerk {
    private String Name_of_Ticket_Clerk;
    private String Ticket_Clerk_Id;
    private ArrayList<Ticket> Tickets = new ArrayList<Ticket>(); 
    private  Train[] Trains_data_Base= new Train[10];
    int ticket_count = 0;

    Train t1 = new Train();
    Train t2 = new Train();
    Train t3 = new Train();
    Train t4 = new Train();
    Train t5 = new Train();
    Train t6 = new Train();
    Train t7 = new Train();
    Train t8 = new Train();
    Train t9 = new Train();
    Train t10 = new Train();

    private ArrayList<Train> getValideTrains(Ticket tick){
        //location info
        Scanner obj2=new Scanner(System.in);
        ArrayList<Train> valid_trains = new ArrayList<Train>();
        while(true){
            while(true){
                System.out.println("Enter The Start_location");
                String start_location = obj2.nextLine();
                
                if(start_location.equals("a") || start_location.equals("b") || start_location.equals("c") || start_location.equals("d") || start_location.equals("e") || start_location.equals("f") || start_location.equals("g") || start_location.equals("h") || start_location.equals("i") || start_location.equals("j")){
                    tick.setStart_location(start_location);
                    break;
                }else{
                    System.out.println("!!! Location Invalide !!!");
                    continue;
                }
            }
            while(true){
                System.out.println("Enter The Destination_location");
                String destination_location = obj2.nextLine();
    
                if(destination_location.equals("a") || destination_location.equals("b") ||    destination_location.equals("c") || destination_location.equals("d") || destination_location.equals("e") || destination_location.equals("f") || destination_location.equals("g") || destination_location.equals("h") || destination_location.equals("i") || destination_location.equals("j")){
                    tick.setDestination_location(destination_location);
                    break;
                }else{
                    System.out.println("!!! Location Invalide !!!");
                    continue;
                }
            }
    
            // valid Trains_data_Base
            boolean start_check = false;
            boolean destination_check = false;
            int destunation_search_index = 0;
            Database_Of_Trains();
    
            for (Train train : Trains_data_Base) {
                for(int i=0;i<train.getTrain_Stations().length;i++)
                {
                    if(tick.getStart_location().equalsIgnoreCase(train.getTrain_Stations()[i].getStation_name())){
                        start_check = true;
                        destunation_search_index = i+1;
                    }
                }
                if(destunation_search_index == 0){
                    break;
                }
                for(int i=destunation_search_index; i<train.getTrain_Stations().length;i++)
                {
                    if(tick.getDestination_location().equalsIgnoreCase(train.getTrain_Stations()[i].getStation_name())){
                        destination_check = true;
                    }
                }
    
                if(start_check == true && destination_check == true)
                {
                    valid_trains.add(train);
                    start_check = false;
                    destination_check = false;
                }
            }
            if(valid_trains.isEmpty()){
                System.out.println("************************* Not Valide Trains ***********************");
                continue;
            }else{
                break;
            }
        }

        return valid_trains;
    } 
    
    private void Database_Of_Trains() {
           
        t1.setTrain_Id("1");
        t2.setTrain_Id("2");
        t3.setTrain_Id("3");
        t4.setTrain_Id("4");
        t5.setTrain_Id("5");
        t6.setTrain_Id("6");
        t7.setTrain_Id("7");
        t8.setTrain_Id("8");
        t9.setTrain_Id("9");
        t10.setTrain_Id("10");
        // Stations

        Station a = new Station();
        Station b = new Station();
        Station c = new Station();
        Station d = new Station();
        Station e = new Station();
        Station f = new Station();
        Station g = new Station();
        Station h = new Station();
        Station i = new Station();
        Station j = new Station();
        // ID
        a.setStation_id(1);
        b.setStation_id(2);
        c.setStation_id(3);
        d.setStation_id(4);
        e.setStation_id(5);
        f.setStation_id(6);
        g.setStation_id(7);
        h.setStation_id(8);
        i.setStation_id(9);
        j.setStation_id(10);
        // Name
        a.setStation_name("a");
        b.setStation_name("b");
        c.setStation_name("c");
        d.setStation_name("d");
        e.setStation_name("e");
        f.setStation_name("f");
        g.setStation_name("g");
        h.setStation_name("h");
        i.setStation_name("i");
        j.setStation_name("j");

        // Stations
        Station[] stations_t1 = {a, b, c, d};
        Station[] stations_t2 = {a, b, e, d};
        Station[] stations_t3 = {a, f, e, d};
        Station[] stations_t4 = {e, f, g, a};
        Station[] stations_t5 = {i, j, c, f};
        Station[] stations_t6 = {a, j, c, h};
        Station[] stations_t7 = {a, h, g, d};
        Station[] stations_t8 = {a, h, c, j};
        Station[] stations_t9 = {a, e, d, f};
        Station[] stations_t10 = {a, d, c, i};

        t1.setTrain_Stations(stations_t1);
        t2.setTrain_Stations(stations_t2);
        t3.setTrain_Stations(stations_t3);
        t4.setTrain_Stations(stations_t4);
        t5.setTrain_Stations(stations_t5);
        t6.setTrain_Stations(stations_t6);
        t7.setTrain_Stations(stations_t7);
        t8.setTrain_Stations(stations_t8);
        t9.setTrain_Stations(stations_t9);
        t10.setTrain_Stations(stations_t10);

        Trains_data_Base[0] = t1;
        Trains_data_Base[1] = t2;
        Trains_data_Base[2] = t3;
        Trains_data_Base[3] = t4;
        Trains_data_Base[4] = t5;
        Trains_data_Base[5] = t6;
        Trains_data_Base[6] = t7;
        Trains_data_Base[7] = t8;
        Trains_data_Base[8] = t9;
        Trains_data_Base[9] = t10;
        
        

    }   
    
    
    public ArrayList<Ticket> getTickets() {
        return Tickets;
    }
    
    public void addTickets(Ticket tick) {
        Tickets.add(tick);
        System.out.println("****************************************************************");
        System.out.println("********************* Reservation Successfull ******************");
        System.out.println("****************************************************************");
        System.out.println();
        System.out.println();

        System.out.println("************************** The Ticket **************************");
        System.out.println("Ticket Number => " + tick.getTicket_No());
        System.out.println("Clerk Ticket ID => " + tick.getClerck_Ticket_Id());
        System.out.println("Passenger ID => " + tick.getPassenger_no());
        System.out.println("Train Number => " + tick.getTrain_id());
        System.out.println("Start Location => " + tick.getStart_location());
        System.out.println("Destination Location => " + tick.getDestination_location());
        System.out.println("Seate Number => " + tick.getSeat_no());
        System.out.println("Railroad Car Number => " + tick.getRailroad_car_number());
        System.out.println("Ticket Price => " + tick.getTicket_price());

        System.out.println("****************************************************************");
        ticket_count++;

    }
    
    
    public String getName_of_Ticket_Clerk() {
        return Name_of_Ticket_Clerk;
    }
    
    public void setName_of_Ticket_Clerk(String Name_of_Ticket_Clerk) {
        this.Name_of_Ticket_Clerk = Name_of_Ticket_Clerk;
    }
    
    
    public String getTicket_Clerk_Id() {
        return Ticket_Clerk_Id;
    }
    
    public void setTicket_Clerk_Id(String Ticket_Clerk_Id) {
        this.Ticket_Clerk_Id = Ticket_Clerk_Id;
    } 
    
    
    public void Reserve_Ticket(){

        // Ticket_Clerk info
        Scanner c = new Scanner(System.in);
        System.out.println("Please Enter The Ticket Clerk Name");
        setName_of_Ticket_Clerk(c.nextLine());
        System.out.println("Please Enter The Ticket Clerk ID");
        setTicket_Clerk_Id(c.nextLine());

        // Ticket info
        Ticket tick=new Ticket();
        int tkno = Tickets.size() + 1;
        tick.setTicket_No(tkno);
        
        // passemger info
        Scanner p = new Scanner(System.in);
        Passenger pass = new Passenger();
        System.out.println("Please Enter Passenger Name");
        pass.setName(p.nextLine());
        System.out.println("Please Enter Passenger ID");
        pass.setid(p.nextInt());

        // Get Valide Trains_data_Base
        ArrayList<Train> valid_trains = getValideTrains(tick);
        System.out.println("The Valide Trains Is : ");
        for (Train tr : valid_trains) {
            System.out.println("    Train Id => " + tr.getTrain_Id());
            System.out.print("    Train Stations => { ");
            for (Station station : tr.getTrain_Stations()) {
                System.out.print(station.getStation_name() + "  ");
            }
            System.out.println(" }");
            System.out.println();
        }

        //Train Info 
        Scanner ob3=new Scanner(System.in); 
        boolean check_train_id = false;
        while (true) {
            System.out.println("Choose Train From Above Trains By Id : ");
            String train_id = ob3.nextLine();
            // System.out.println(tr.getTrain_Id());
            for (Train train : valid_trains) {
                if(train_id.equals(train.getTrain_Id())){
                    check_train_id = true;
                }else{
                    continue;
                }
            }
            if (check_train_id == true) {

                    boolean test = false;
                    Scanner ob4=new Scanner(System.in);
                    int count=0;
                    for(Train t:Trains_data_Base)
                    { 
                        if(t.getTrain_Id().equalsIgnoreCase(train_id))
                        {
                            
                            //******************************** 
                            int start=0, destination=0;
                            for (int i = 0; i < t.getTrain_Stations().length; i++) {
                                if(t.getTrain_Stations()[i].getStation_name().equals(tick.getStart_location())){
                                    start = i;

                                }
                                if(t.getTrain_Stations()[i].getStation_name().equals(tick.getDestination_location())){
                                    destination = i;
                                }
                            }
                            tick.setTicket_price((destination - start) * 10);
                            // System.out.println(tick.getTicket_price());

                            // *******************************
                            int n, s;
                            t.View_The_Reserved_seats_At_Train();
                            while (true) {
                                System.out.println("Please Enter the railroad_car that you want to reserve  it At Train No (" + train_id + ") : ");
                                n=ob4.nextInt();
                                if(n > t.getRailroad_cars().length){
                                    System.out.println("******************* Error Choose Please Enter Valid Car From Above Table *******************");
                                }else{
                                    break;
                                }
                            }
                            while (true) {
                                System.out.println("Please Enter the seat number that you want to reserve  it At Train No : (" + train_id + ")");
                                s=ob4.nextInt();
                                if(s > t.getRailroad_cars()[0].length){
                                    System.out.println("******************* Error Choose Please Enter Valid Seate From Above Table *******************");
                                }else{
                                    break;
                                }
                            }
                            test=t.add_aseat(s, n);
                            
                            
                            if(test==true){
                                t.View_The_Reserved_seats_At_Train();
                                Trains_data_Base[count].setRailroad_cars(t.getRailroad_cars());
                                tick.setTrain_id(train_id);
                                tick.setClerck_Ticket_Id(this.Ticket_Clerk_Id);
                                tick.setSeat_no(s);
                                tick.setRailroad_car_number(n);
                                tick.setPassenger_no(pass.getid());
                                addTickets(tick);
                            }

                        }
                        count++;
                    }               
                break;
            }else{
                System.out.println("*************** Error Choose ***************");  
                System.out.println();
            }
        }

       
        
    }
    
    public void Remove_Ticket(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter Ticket Number That You Want To Remove It");
        int tno = sc.nextInt();
        boolean ch = false;
        for (Ticket ticket : Tickets) {
            if(tno == ticket.getTicket_No()){
                int count=0;
                for(Train t:Trains_data_Base)
                {
                    
                    if(t.getTrain_Id().equals(ticket.getTrain_id()))
                    {
                        Trains_data_Base[count].revmove_seat(ticket.getRailroad_car_number(),ticket.getSeat_no());
                    }
                    count++;
                }
                Tickets.remove(ticket);
                System.out.println("**********Remove Success**********");
                ticket_count--;
                ch = true;
                break;
            }else{
                continue;
            }            
        }
        if(ch == false){
            System.out.println("*************** This Ticket Not Exist ***************");
        }
    }
   
   
}
