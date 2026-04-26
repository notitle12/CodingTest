import java.util.*;

class Solution {
    public int[] solution(int[] fees, String[] records) {
        Map<String, Integer> parkingTime = new HashMap<>();
        Map<String, Integer> entryLog = new HashMap<>();
        TreeMap<String, Integer> finalResult = new TreeMap<>();

        for (String record : records) {
            String[] split = record.split(" ");
            int time = parseTime(split[0]);
            String carNum = split[1];
            String type = split[2];

            if (type.equals("IN")) {
                entryLog.put(carNum, time);
            } else {
                int duration = time - entryLog.remove(carNum);
                parkingTime.put(carNum, parkingTime.getOrDefault(carNum, 0) + duration);
            }
        }

        int lastTime = parseTime("23:59");
        for (String carNum : entryLog.keySet()) {
            int duration = lastTime - entryLog.get(carNum);
            parkingTime.put(carNum, parkingTime.getOrDefault(carNum, 0) + duration);
        }

        int[] answer = new int[parkingTime.size()];
        int idx = 0;
        List<String> sortedCars = new ArrayList<>(parkingTime.keySet());
        Collections.sort(sortedCars);

        for (String car : sortedCars) {
            int totalTime = parkingTime.get(car);
            int fee = fees[1];
            if (totalTime > fees[0]) {
                fee += Math.ceil((double) (totalTime - fees[0]) / fees[2]) * fees[3];
            }
            answer[idx++] = fee;
        }

        return answer;
    }

    private int parseTime(String time) {
        String[] split = time.split(":");
        return Integer.parseInt(split[0]) * 60 + Integer.parseInt(split[1]);
    }
}