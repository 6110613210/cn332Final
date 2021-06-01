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
abstract public class PackageDecorator extends RoomType {
    private RoomType myRoom;
    public PackageDecorator(RoomType roomdetail){
        myRoom=roomdetail;
    }
    public void callRoomDetail(){
        myRoom.getDescription();
    }
        
}
