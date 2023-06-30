import java.util.HashMap;
import java.util.Map;

public class home2_1 {
    public static void main(String[] args) {
        Map<String, String> params1 = new HashMap<String,String>();
        params1.put("name","Ivanov");
        params1.put("country","Russia");
        params1.put("city","Moscow");
        params1.put("age",null);
        System.out.println(Sort(params1));
    }
    public static String Sort(Map<String, String> params)
    {
        StringBuilder filter = new StringBuilder();
        for (Map.Entry<String,String> line : params.entrySet())
        {
            if (line.getValue() != null)
            {
                filter.append(line.getKey() +" = " + line.getValue()+", ");
            }
        }
        return filter.toString();
    }
}
