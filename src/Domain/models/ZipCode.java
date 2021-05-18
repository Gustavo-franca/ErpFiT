/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain.models;

import Domain.interfaces.IDistrict;
import Domain.interfaces.IZipCode;
import Domain.valueObjects.IDescription;

/**
 *
 * @author gustavo
 */
public class ZipCode implements IZipCode{
    private int id;
    private IDescription zipCode;
    private IDistrict district;

    public ZipCode(int id, IDescription zipCode, IDistrict district) {
        this.id = id;
        this.zipCode = zipCode;
        this.district = district;
    }

    public ZipCode(IDescription zipCode, IDistrict district2) {
        this.zipCode = zipCode;
        this.district = district2;
    }

    public int id() {
        return id;
    }

    @Override
    public String district() {
        return this.district.district();
    }

    @Override
    public String city() {
        return this.district.city();
    }

    @Override
    public String state() {
        return this.district.state();
    }

    @Override
    public String country() {
       return this.district.country();
    }

    @Override
    public String zipCode() {
        return this.zipCode.getValue();
    }
    
    
    
    
    
    
}
