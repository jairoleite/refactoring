package com.treinamento.refactoring.v1;

public class Calculador {

    public static double calcula(Mov... movArray) {

        double result = 0.0;

        for (Mov mov : movArray) {
            if (mov.getDist() != null && mov.getDist() > 0) {
                if (mov.getDs() != null) {

                    // durante a noite

                    if (mov.getDs().getHour() >= 22 || mov.getDs().getHour() <= 6) {

                        // não é domingo
                        if (mov.getDs().getDayOfWeek().getValue() != 7) {

                            result += mov.getDist() * 3.99;

                            // domingo
                        } else {
                            result += mov.getDist() * 5;
                        }

                    } else {
                        // domingo
                        if (mov.getDs().getDayOfWeek().getValue() == 7) {
                            result += mov.getDist() * 2.9;
                        } else {
                            result += mov.getDist() * 2.10;
                        }
                    }

                } else {
//                 System.out.println(result);
                    return -2D;
                }

            } else {
//                System.out.println(mov.getDist());
                return -1D;
            }
        }

        if(result < 10) {
            return 10D;
        } else {
            return Mov.roundAvoid(result, 1);
        }

    }

}
