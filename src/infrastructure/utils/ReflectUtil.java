package infrastructure.utils;

import java.lang.reflect.Field;

import Domain.factories.CountryFactory;
import Domain.models.address.Country;
import infrastructure.entity.CountryData;

public class ReflectUtil {

    public static void main(String[] args) {
        System.out.println(ReflectUtil.getFieldValue(new CountryData(10,"Teste"),"description"));
    }
    public static <T> Object getFieldValue(T t, String name){
        try {
            return t.getClass().getField(name).get(t);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }

    public static <T> Field[] getFieldsDirectly(Class<T> clazz, boolean b) {
        return clazz.getFields();
    }

}
