import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CitiesTask {
    public static void main(String[] args) {
        Map<String, Integer> cityToCount = new HashMap<>();
        cityToCount.put("Москва", 12400);
        cityToCount.put("Астана", 1300);
        cityToCount.put("Киев", 5700);
        cityToCount.put("Алмата", 2200);

        Set<String> keys = cityToCount.keySet();
        for(String key : keys){
            if(cityToCount.get(key) > 5000){
                System.out.println(key);
            }
        }

        String keyMax = "";
        int max = 0;
        for(String key : keys){
            if(cityToCount.get(key) > max){
                max = cityToCount.get(key);
                keyMax = key;
            }
        }
        System.out.println(keyMax);
    }
}
