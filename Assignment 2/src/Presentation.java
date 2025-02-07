import java.util.Random;


public class Presentation {
    private String themeName;
    private int slideNumber;
    private int presentationTime;

    //Constructor for class
    public Presentation(String themeName) {
        this.themeName = themeName;
        Random random = new Random();
        this.slideNumber = random.nextInt(10, 51); // Random slide number between 10 and 50
        this.presentationTime = random.nextInt(300, 1001); // Random presentation time between 300 and 1000 seconds

    }

    //Getters for presentation details
    public String getThemeName() {
        return themeName;
    }

    public Integer getSlideNumber() {
        return slideNumber;
    }

    public Integer getPresentationTime() {
        return presentationTime;
    }

    //Setters for presentation details
    public void setThemeName(String newThemeName) { this.themeName = newThemeName; }

    public void setSlideNumber(Integer newSlideNumber) {this.slideNumber = newSlideNumber; }

    public void setPresentationTime(Integer newPresentationTime) {
        this.presentationTime = newPresentationTime;
    }

    //Class Methods
    public Double timePerSlide() {
        return (double) (presentationTime / slideNumber);
    }

    //Capitalises first letter
    public String formattedTheme() {
        return themeName.substring(0,1).toUpperCase() + themeName.substring(1);
    }

    //Overrides original toString method with one that displays all presentation details
    @Override
    public String toString() {
        return "Presentation stats:\n" + slideNumber + " slides\n" + themeName + " theme\n" + timePerSlide() + " seconds per slide";

    }
}
