/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package railway.reservation;

/**
 *
 * @author Options
 */
public class Station {
    private int station_id;
    private String station_name;

    public String getStation_name() {
        return station_name;
    }

    public int getStation_id() {
        return station_id;
    }

    public void setStation_id(int station_id) {
        this.station_id = station_id;
    }

    public void setStation_name(String station_name) {
        this.station_name = station_name;
    }
}
