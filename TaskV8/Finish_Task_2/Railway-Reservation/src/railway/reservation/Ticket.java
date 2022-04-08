/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package railway.reservation;

/**
 *
 * @author moham
 */
public class Ticket {
    private int Ticket_No;
    private String Clerck_Ticket_Id;
    private String train_id;
    private String Start_location;
    private String Destination_location;
    private int passenger_no;
    private int seat_no;
    private int railroad_car_number;
    private float ticket_price;

    public int getSeat_no() {
        return seat_no;
    }
    public String getClerck_Ticket_Id() {
        return Clerck_Ticket_Id;
    }
    public void setClerck_Ticket_Id(String clerck_Ticket_Id) {
        this.Clerck_Ticket_Id = clerck_Ticket_Id;
    }
    public void setSeat_no(int seat_no) {
        this.seat_no = seat_no;
    }

    public float getTicket_price() {
        return ticket_price;
    }

    public void setTicket_price(float ticket_price) {
        this.ticket_price = ticket_price;
    }

    public String getTrain_id() {
        return train_id;
    }

    public void setTrain_id(String train_id) {
        this.train_id = train_id;
    }
    
    public void setRailroad_car_number(int railroad_car_number) {
        this.railroad_car_number = railroad_car_number;
    }

    public int getRailroad_car_number() {
        return railroad_car_number;
    }

    public int getTicket_No() {
        return Ticket_No;
    }

    public void setTicket_No(int Ticket_No) {
        this.Ticket_No = Ticket_No;
    }

    public String getStart_location() {
        return Start_location;
    }

    public void setStart_location(String Start_location) {
        this.Start_location = Start_location;
    }

    public String getDestination_location() {
        return Destination_location;
    }

    public void setDestination_location(String Destination_location) {
        this.Destination_location = Destination_location;
    }

    public int getPassenger_no() {
        return passenger_no;
    }

    public void setPassenger_no(int passenger_no) {
        this.passenger_no = passenger_no;
    }
    
    
}
