package exercises;

public class CarAward {

    private String awardTitle = "Useless award";
    private int yearAwarded = 2019;

    public CarAward() {
    }

    public String printAnnouncement() {

        return String.format("The <YEAR> <MAKE> <MODEL> won the '%s' in %d", this.getAwardTitle(), this.getYearAwarded());
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
