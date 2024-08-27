public class Time {
    // 속성 : 시, 분, 초(float)
    private int hour;
    private int min;
    private float second;

    // 생성자

    // public Time(int hour, int min, float second) {
    // this.hour = hour;
    // this.min = min;
    // this.second = second;
    // }

    // getter 메소드 작성

    public int getHours() {
        return hour;
    }

    public int getMins() {
        return min;
    }

    public float getSecond() {
        return second;
    }

    public void setHour(int hour) {
        if (hour < 0 || hour > 23) {
            return;
        }
        this.hour = hour;
    }

    public void setMin(int min) {
        if (min < 0 || min > 59) {
            return;
        }
        this.min = min;
    }

    public void setSecond(float second) {
        if (second < 0 || second > 59) {
            return;
        }
        this.second = second;
    }

    @Override
    public String toString() {
        return "Time [hour=" + hour + ", min=" + min + ", second=" + second + "]";
    }

}
