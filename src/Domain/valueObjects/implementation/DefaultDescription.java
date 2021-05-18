package Domain.valueObjects.implementation;

import Domain.valueObjects.IDescription;

public class DefaultDescription implements IDescription {
    private String value;

    public DefaultDescription(String value){
        if(!isvalid(value)){
            throw new IllegalArgumentException("the description doesn’t follow the pattern");
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
    
}
