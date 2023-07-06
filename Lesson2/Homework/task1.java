// 1) Дана строка sql-запроса "select * from students where ". Сформируйте часть WHERE этого запроса, используя StringBuilder. Данные для фильтрации приведены ниже в виде json-строки.
// Если значение null, то параметр не должен попадать в запрос.
// Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}

package Lesson2.Homework;

import java.util.HashMap;
import java.util.Map;

public class task1 {
    public static void main(String[] args) {
        Map < String, String > parameter = new HashMap<String, String>();
        parameter.put("name","Ivanov");
        parameter.put("country","Russia");
        parameter.put("city","Moscow");
        parameter.put("age",null);
        System.out.println(getQuery(parameter));
    }
    public static String getQuery(Map < String, String > params){
        StringBuilder choice = new StringBuilder();
        for (Map.Entry < String, String > couple : params.entrySet())
        {
            if (couple.getValue() != null)
            {
                choice.append(couple.getKey() + " = " + couple.getValue() + " and ");
            }
        }
        choice.delete(choice.toString().length()-5, choice.toString().length());
        return choice.toString();
    }
}
