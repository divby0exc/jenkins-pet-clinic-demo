package com.divby0exc.petclinic.model;

import java.util.Date;
import java.util.List;

public class SickReport {
    private String ownersName;
    private String animalsName;
    private String reasonOfSickness;
    private Date pointOfArrival;
    private Date pointOfDeparture;
    private List<SickReport> sickReportList;
}
