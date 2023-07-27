package com.examly.springapp.model;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Crackers {
    @Id
    
    int crackersId;
    String crackersName;
    String crackersType;
    String crackersBrand;
    String manufacturedIn;
    String crackersPrice;

public Crackers(){}

public Crackers(
      int crackersId,
      String crackersName,
      String crackersType,
      String crackersPrice,
      String crackersBrand,
      String manufacturedIn)
      
      {
    this.crackersId = crackersId;
    this.crackersName = crackersName;
    this.crackersType=crackersType;
    this.crackersPrice=crackersPrice;
    this.crackersBrand = crackersBrand;
    this.manufacturedIn = manufacturedIn;
}

public int getcrackersId() {
    return crackersId;
}

public void setId(int crackersId) {
    this.crackersId = crackersId;
}

public String getcrackersName() {
    return crackersName;
}

public void setcrackersName(String crackersName) {
   this.crackersName = crackersName;
}

public String getcrackersType() {
    return crackersType;
}

public void setcrackersType(String crackersType) {
   this.crackersType = crackersType;
}

public String getcrackersPrice() {
    return crackersPrice;
}

public void setcrackersPrice(String crackersPrice) {
   this.crackersPrice = crackersPrice;
}

public String getcrackersBrand() {
    return crackersBrand;
}

public void setcrackersBrand(String crackersBrand) {
   this.crackersBrand = crackersBrand;
}

public String getManufacturedIn() {
    return manufacturedIn;
}

public void setManufacturedIn(String manufacturedIn) {
   this.manufacturedIn = manufacturedIn;
}

}