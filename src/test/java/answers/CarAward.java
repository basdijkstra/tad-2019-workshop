package answers;

public class CarAward extends Car {

    private String awardTitle = "Useless award";
    private int yearAwarded = 2019;

    public CarAward() {
    }

    public String printAnnouncement() {

        return String.format("The %d %s %s won the '%s' in %d", this.getYear(), this.getMake(), this.getModel(), this.getAwardTitle(), this.getYearAwarded());
    }

    public String getAwardTitle() {
        return awardTitle;
    }

    public void setAwardTitle(String awardTitle) {
        this.awardTitle = awardTitle;
    }

    public int getYearAwarded() {
        return yearAwarded;
    }

    public void setYearAwarded(int yearAwarded) {
        this.yearAwarded = yearAwarded;
    }
}
