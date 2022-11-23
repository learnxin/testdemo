package com.example.demo.test1.request;

import lombok.Data;

/**
 * @Author: wangran
 * @Description:
 * @Date: 2021/8/6 下午4:58
 */
@Data
public class FlightInfo {
    public String salesScene;
    public String depAirport;
    public String arrAirport;
    public String flightDate;
    public String flightArrDate;
    public String isABA;
    public String depTime;
    public String timezone;
    public String flightNo;
    public String actualCarrier;
    public String cabinCode;
    public String isTransit;
    public String channel;
    public String flightSegmentTag;
    public String ticketStatus;
    public String flowName;
    public String firstFlightDate;
    public String lastflightArrDate;
    public String firstDepAirport;
    public String firstArrAirport;
    public String segOrder;
    public String isSaleForSegment;
}
