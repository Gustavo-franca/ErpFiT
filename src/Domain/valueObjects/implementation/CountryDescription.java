package Domain.valueObjects.implementation;

import Domain.valueObjects.IDescription;

public class CountryDescription implements IDescription{
    private String value;

    public CountryDescription(String value){
        if(!isvalid(value)){
            throw new IllegalArgumentException("the country’s description doesn’t follow the pattern");
        }
        this.value = value;
    }
    @Override
    public String getValue() {
        return this.value;
    }
    public boolean isvalid(String value){
        return value.matches("\\w+");
    }
    @Override
    public void setValue(String newDescription) {
        if(!isvalid(newDescription)){
            throw new IllegalArgumentException("the description doesn’t follow the pattern");
        }
        this.value = newDescription;
    }
}
