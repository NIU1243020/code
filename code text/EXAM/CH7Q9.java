package EXAM;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CH7Q9 {
    public static void main(String[] args) {
        HashMap<String, Double> hitRateMap = new HashMap<>();
        hitRateMap.put("一朗", 0.315);
        hitRateMap.put("柯南", 0.298);
        hitRateMap.put("邏輯林", 0.301);
        hitRateMap.put("大雄", 0.250);
        hitRateMap.put("魯夫", 0.278);

        List<Map.Entry<String, Double>> hitRateList = new ArrayList<>(hitRateMap.entrySet());

        Collections.sort(hitRateList, new Comparator<Map.Entry<String, Double>>() {
            @Override
            public int compare(Map.Entry<String, Double> o1, Map.Entry<String, Double> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });

        System.out.println("打擊率排名: ");
        for (int i = 0; i < hitRateList.size(); i++) {
            System.out.println((i + 1) + ". " + hitRateList.get(i).getKey() + ": " + hitRateList.get(i).getValue());
        }
    }
}
