package com.killoran.Week9;

/**
 * Created by mak1115 on 3/12/2020.
 */
abstract class SMSSender{

    abstract public void establishConnectionWithYourTower();

    abstract public void destroyConnectionWithYourTower();

    public void checkForDND(){
        //check for number present in DND.
    }

    public void checkForTelecomRules(){
        //Check for telecom rules
    }

    public void sendSMS(){
    /*establishConnectionWithYourTower();
        checkForDND();
        checkForTelecomRules();
        sending SMS to numbers...numbers.*/
    }
}
