package infrastructure.utils;

public class StrUtil {

    public static String removeSuffix(String sql, String string) {
        System.out.println(sql);
        var regex = string  + "$";
        return sql.replaceFirst(regex, "");
    }

}
