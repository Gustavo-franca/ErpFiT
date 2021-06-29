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
public interface IState{
    public String description();
    public String country();
    public void description(String newStateName);
    
}
