package day08.final_;

public enum WeatherConstants {
    MAX_TEMPERATURE_ALERT(40.0)
    , MIN_TEMPERATURE_ALERT(-10.0)
    , PRECIPITATION_ALERT(50.0);

    // 상수에 값을 넣는 경우 위에 상수를 저장할 필드를 생성해야 한다.
    private double numericDate;

    WeatherConstants(double numericDate) {
        this.numericDate = numericDate;
    }

    public double getNumericDate() {
        return numericDate;
    }
    //    public static final double MAX_TEMPERATURE_ALERT = 40.0;
//    public static final double MIN_TEMPERATURE_ALERT = -10.0;
//    public static final double PRECIPITATION_ALERT = 50.0;


    // 객체를 생성할 일 없으니, 생성자를 private 으로 차단.
//    private WeatherConstants() {
//
//    }

}
