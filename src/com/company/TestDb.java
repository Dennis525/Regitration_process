package com.company;

import java.util.Scanner;

public class TestDb {
    public static void main(String[] args) {
        Database db = new Database();



        registerDetails rD = new registerDetails("DENNIS ODHIAMBO",36887,"SIAYA", 750440528);
        db.addID(rD);
        registerDetails d = new registerDetails("MARK MARUKI",367809,"KITUI",756097325);
        db.addID(d);
        registerDetails r = new registerDetails("FELIX OUMA",389887,"KISUMU",778498909);
        db.addID(r);
        System.out.println("DETAILS:"+d.getName() +"\t" +d.getID() +"\t" +d.getCounty() +"\t" +d.getPhone_no());
        System.out.println("DETAILS:"+rD.getName() +"\t"+rD.getID() +"\t"  +rD.getCounty() +"\t"  +rD.getPhone_no());
        System.out.println("DETAILS:"+r.getName() +"\t"+r.getID() +"\t" +r.getCounty()+"\t" +r.getPhone_no());

        }
    }
