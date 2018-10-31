package com.udea;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
class Reservation  implements Serializable{

    @Id
    @GeneratedValue
    private Long id;
    private String reservationName;
    
    @Override
    public String toString() {
        return "A reservation{"
                + "id:" + id
                + ", reservationName='" + reservationName + '\''
                + '}';
    }
    public Reservation() {
    }

    public Reservation(String reservationName) {
        this.reservationName = reservationName;
    }
      public Long getId() {
        return id;
    }
       public String getReservationName() {
        return reservationName;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setReservationName(String reservationName) {
        this.reservationName = reservationName;
    }
   
}
    
