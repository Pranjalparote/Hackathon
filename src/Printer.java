public class Printer {
    private String name;
    private double tonerLevel = 100;
    private int ammountOfPaper;
    private int numberOfPagesPrinted;
    private boolean isDoubleSided;

    public Printer(String name, double tonerLevel, int ammountOfPaper, boolean isDoubleSided) {
        this.name = name;
        if (tonerLevel >= 0 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        }
        this.ammountOfPaper = ammountOfPaper;
        this.isDoubleSided = isDoubleSided;
    }

    private boolean isOutOfToner(double numberToPrint) {
        return (tonerLevel - (numberToPrint / 2) < 0);
    }


    private boolean isOutOfPaper(double numberToPrint) {
        return ((ammountOfPaper - numberToPrint) < 0);
    }

    private boolean twoSideNoPaperEven(double numberToPrint) {
        return (ammountOfPaper - ((int) numberToPrint / 2)) < 0;
    }

    private boolean twoSideNoPaperOdd(double numberToPrint) {
        return ((ammountOfPaper - ((int) numberToPrint / 2)) - 1) < 0;
    }
}



