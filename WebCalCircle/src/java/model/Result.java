/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author taveesap
 */
@XmlRootElement
public class Result {
    
    private double circle;

    public double getCircle() {
        return circle;
    }
@XmlElement
    public void setCircle(double circle) {
        this.circle = circle;
    }

    private double circumference;

    public double getCircumference() {
        return circumference;
    }
@XmlElement
    public void setCircumference(double circumference) {
        this.circumference = circumference;
    }

}
