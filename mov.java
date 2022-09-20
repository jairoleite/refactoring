                                                       package com.treinamento.refactoring.v1;

import java.time.LocalDateTime;

public class Mov {

    private Double dist;
    private LocalDateTime ds;

    public Mov(Double dist, LocalDateTime ds) {
        this.dist = dist;
        this.ds = ds;
    }

    public Double getDist() {
        return dist;
    }

    public void setDist(Double dist) {
        this.dist = dist;
    }

    public LocalDateTime getDs() {
        return ds;
    }

    public void setDs(LocalDateTime ds) {
        this.ds = ds;
    }

    public static double roundAvoid(double value, int places) {
        double scale = Math.pow(10, places);
        return Math.round(value * scale) / scale;
    }
}
