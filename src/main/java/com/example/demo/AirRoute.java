package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class AirRoute {

    @Id
    private long id;

    private Date startTime;

    private Date finishTime;

    private long planeId;

    private String fromCity;

    private String toCity;

    public AirRoute(long id, Date startTime, Date finishTime, long planeId, String fromCity, String toCity) {
        this.id = id;
        this.startTime = startTime;
        this.finishTime = finishTime;
        this.planeId = planeId;
        this.fromCity = fromCity;
        this.toCity = toCity;
    }

    public AirRoute() {

    }
}
