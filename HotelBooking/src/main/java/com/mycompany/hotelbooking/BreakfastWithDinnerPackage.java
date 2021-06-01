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
public class BreakfastWithDinnerPackage extends PackageDecorator {
    public BreakfastWithDinnerPackage(RoomType roomdetail){
        super(roomdetail);
    }
    public void addPackage(){
        super.getDescription();
        System.out.println("Breakfast and Dinner Included");
    }
}
