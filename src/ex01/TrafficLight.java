package ex01;


public class TrafficLight {    
    int currentNumber;

    public static final int TIME_RED = 5;

    public static final int TIME_YELLOW = 3;

    public static final int TIME_GREEN = 2;

    int period = TIME_RED + TIME_YELLOW + TIME_GREEN;


    public String color(int timeInterval) { // расчитывает какой свет должен гореть
        currentNumber = timeInterval;
        while (currentNumber >= period) {
            currentNumber -= period;
        }
        return mechanism(currentNumber);
    }


    private String mechanism(int currentNumber) {     // рассчитывает механизм выбора света
        if (currentNumber > (TIME_GREEN + TIME_YELLOW)) {
            return "КРАСНЫЙ";
        } else {
            if (currentNumber > (TIME_GREEN) && (currentNumber <= (TIME_GREEN + TIME_YELLOW))) {
                return "ЖЕЛТЫЙ";
            } else {
                return "ЗЕЛЕНЫЙ";
            }
        }
    }
}
