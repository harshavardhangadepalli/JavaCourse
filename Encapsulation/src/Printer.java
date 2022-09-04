public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this.tonerLevel = tonerLevel;
        this.duplex = duplex;
        if(tonerLevel < 0 || tonerLevel > 100)
            this.tonerLevel = -1;
        this.pagesPrinted = 0;
    }

    public int addToner(int tonerAmount) {
        if (tonerAmount < 0 || tonerAmount > 100)
            return -1;
        this.tonerLevel += tonerAmount;
        return this.tonerLevel;
    }

    public int printPages(int pages) {
        if (this.duplex){
            this.pagesPrinted += pages%2 + (int)pages/2;
            return pages%2 + (int)pages/2;
        }
        this.pagesPrinted += pages;
        return pages;
    }

    public int  getPagesPrinted() {
        return this.pagesPrinted;
    }

}
