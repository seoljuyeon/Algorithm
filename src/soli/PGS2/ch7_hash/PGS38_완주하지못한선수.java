package soli.PGS2.ch7_hash;

import java.util.HashMap;
import java.util.Map;

public class PGS38_완주하지못한선수 {
    public String solution(String[] participant, String[] completion) {
        String answer = "";

        Map<String, Integer> map = new HashMap<>();

        for(String str : participant) {
            map.put(str, map.getOrDefault(str, 0) + 1) ;
        }

        for(String str : completion) {
            map.put(str, map.get(str)-1);
        }

        for(String str : map.keySet()) {
            if(map.get(str) != 0) {
                answer = str;
            }
        }

        return answer;
        // return map.keySet().iterator().next();
    }

    public static void main(String[] args) {
        PGS38_완주하지못한선수 pgs38_완주하지못한선수 = new PGS38_완주하지못한선수();

        System.out.println("Test code : " + pgs38_완주하지못한선수.solution(new String[]{"leo", "kiki", "eden"}, new String[]{"eden", "kiki"}));
        System.out.println("Test code : " + pgs38_완주하지못한선수.solution(new String[]{"marina", "josipa", "nikola", "vinko", "filipa"}, new String[]{"josipa", "filipa", "marina", "nikola"}));
        System.out.println("Test code : " + pgs38_완주하지못한선수.solution(new String[]{"mislav", "stanko", "mislav", "ana"}, new String[]{"stanko", "ana", "mislav"}));

    }
}
