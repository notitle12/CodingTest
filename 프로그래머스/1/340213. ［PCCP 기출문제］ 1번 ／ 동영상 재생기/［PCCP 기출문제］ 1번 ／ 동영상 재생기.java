class Solution {

    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        int videoLenSec = timeToSeconds(video_len);
        int currentPosSec = timeToSeconds(pos);
        int opStartSec = timeToSeconds(op_start);
        int opEndSec = timeToSeconds(op_end);

        if (currentPosSec >= opStartSec && currentPosSec <= opEndSec) {
            currentPosSec = opEndSec;
        }

        for (String command : commands) {
            if (command.equals("prev")) {
                currentPosSec -= 10;
                if (currentPosSec < 0) {
                    currentPosSec = 0;
                }
            } else {
                currentPosSec += 10;
                if (currentPosSec > videoLenSec) {
                    currentPosSec = videoLenSec;
                }
            }

            if (currentPosSec >= opStartSec && currentPosSec <= opEndSec) {
                currentPosSec = opEndSec;
            }
        }

        return secondsToTime(currentPosSec);
    }

    private int timeToSeconds(String time) {
        String[] parts = time.split(":");
        int minutes = Integer.parseInt(parts[0]);
        int seconds = Integer.parseInt(parts[1]);
        return minutes * 60 + seconds;
    }

    private String secondsToTime(int totalSeconds) {
        int minutes = totalSeconds / 60;
        int seconds = totalSeconds % 60;
        return String.format("%02d:%02d", minutes, seconds);
    }
}