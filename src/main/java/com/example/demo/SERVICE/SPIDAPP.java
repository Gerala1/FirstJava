package com.example.demo.SERVICE;

import com.example.demo.ENTITIES.SPID;
import com.example.demo.ENTITIES.Status;
import com.example.demo.ENTITIES.USER;

import java.util.HashMap;

//import static sun.net.ftp.FtpDirEntry.Permission.USER;

public class SPIDAPP {
    public static void main(String[] args) throws Exception {
        USER firstUser;
        firstUser = new USER(1, "GERA", "LAJTHIA", "GLAJTHIA");
        SPID firstSPID = new SPID(1, firstUser, Status.PENDING, "jhjhb");
        com.example.demo.ENTITIES.USER secondUser = new USER();
        SPID secondSPID = new SPID(2, secondUser, Status.PENDING, "ohvkjh");
        USER thirdUser = new USER();
        SPID thirdSPID = new SPID(3, thirdUser, Status.PENDING, "gfjk");
        USER fourthUser = new USER();
        SPID fourthSPID = new SPID(4, fourthUser, Status.PENDING, "arsiu");
        USER fifthUser = new USER();
        SPID fifthSPID = new SPID(5, fifthUser, Status.PENDING, "Lodwl");

        firstUser.setId(2);
        firstUser.setName("Megi");
        firstUser.setSurname("Lajthia");
        firstUser.setUsername("Megila");

        secondUser = new USER(3, "LEDIA", "LAMCE", "LOLO");
        firstSPID.setUser(secondUser);
        firstSPID.setStatus(Status.APPROVED);
        firstSPID.setDescripton("leggo");

        HashMap<Integer, SPID> listSPID = new HashMap();
        listSPID.put(0, firstSPID);
        listSPID.put(1, secondSPID);
        listSPID.put(2, thirdSPID);
        listSPID.put(3, fourthSPID);
        listSPID.put(4, fifthSPID);
        listSPID.put(5, null);
        for (HashMap.Entry<Integer, SPID> list :
                listSPID.entrySet()) {
            if (list.getValue() == null) throw new Exception("Null values for SPID are not Allowed");
            System.out.println(list.toString());
        }

        //Spid connected to a user
        System.out.println("User:" + firstUser.getName() + "is connected to SPID with description " + listSPID.get(0).getStatus());
        secondSPID.setStatus(Status.APPROVED);
    }

}
