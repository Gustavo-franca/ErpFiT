/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain.interfaces;

/**
 *
 * @author gustavo
 */
public interface IZipCode   {
    public String description();
    public String district();
    public String city();
    public String state();
    public String country();
    public void description(String newZipCodeName);
}
