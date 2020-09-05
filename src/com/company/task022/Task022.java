package com.company.task022;

public class Task022 {
    public static void run() {
        System.out.println(BaseConverter.convert(40, TemperatureSystem.FAHRENHEIT));
        System.out.println(BaseConverter.convert(-273, TemperatureSystem.KELVIN));
        System.out.println(BaseConverter.convert(0, TemperatureSystem.FAHRENHEIT));
        System.out.println(BaseConverter.convert(0, TemperatureSystem.KELVIN));
    }
}
