package com.company.task022;

public class BaseConverter {
    public static double convert(double degree, TemperatureSystem temperatureSystem) {
        Double result = null;
        switch (temperatureSystem) {
            case FAHRENHEIT:
                result = (degree * 9.) / 5. + 32.;
                break;
            case KELVIN:
                result = degree + 273.15;
                break;
            case CELSIUS:
                result = degree;
                break;
        }
        return result;
    }
}
