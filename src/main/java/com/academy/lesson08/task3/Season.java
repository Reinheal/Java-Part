package com.academy.lesson08.task3;

public enum Season {
    SPRING, SUMMER, FALL, WINTER;

    static public Season of(Month month) {
        switch (month) {
            case DECEMBER:
            case JANUARY:
            case FEBRUARY:
                return WINTER;
            case MARCH:
            case APRIL:
            case MAY:
                return SPRING;
            case JUNE:
            case JULY:
            case AUGUST:
                return SUMMER;
            case OCTOBER:
            case NOVEMBER:
            case SEPTEMBER:
                return FALL;
            default:
                System.out.println("Error");
                return null;
        }
    }

    public String getNextSeas() {
        Season s = values()[(ordinal() + 1) % values().length];
        System.out.println("Next Season " + s);
        return toString();
    }
    public String getPrevSeas() {
        Season s1 = values()[(ordinal()+values().length - 1) % values().length];
        System.out.println("Previous Season " + s1);
        return toString();
    }
}

