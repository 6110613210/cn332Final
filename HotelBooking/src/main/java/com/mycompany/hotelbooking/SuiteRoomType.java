/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.hotelbooking;

/**
 *
 * @author oontoon
 */
public class SuiteRoomType extends RoomType{
    int RoomID;
    int RoomSize;
    int NumberOfBed;
    String Facility;
    
    public void getDescription(int RoomID, int RoomSize, String Facility){
        System.out.println("Your room type is : Suite" );
        System.out.println("Your Room Number is :" + RoomID);
        System.out.println("Your Room Size is :" + RoomSize);
        System.out.println("You have "+ NumberOfBed+ " bed");
    }
    
}
