package soli.PGS.ch9_data_structure;

// https://school.programmers.co.kr/learn/courses/30/lessons/42583
// ✨feat: PGS46_다리를 지나는 트럭
public class PGS46 {
    public int solution (int bridge_length, int weight, int[] truck_weights){
        int answer = 0;
        return answer;
    }

    public static void main(String[] args) {

        PGS46 pgs46 = new PGS46();

        System.out.println("TEST CASE : " + pgs46.solution(2, 4, new int[] {7, 4, 5, 6}));
        System.out.println("TEST CASE : " + pgs46.solution(100, 100, new int[] {10}));
        System.out.println("TEST CASE : " + pgs46.solution(100, 100, new int[] {10,10,10,10,10,10,10,10,10,10}));
    }
}
