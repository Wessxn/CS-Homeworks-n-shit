public class Main {
    public static void main(String[] args) {
        Presentation presentation1 = new Presentation("MOTIVATIONAL");
        Presentation presentation2 = new Presentation("DARK");
        Presentation presentation3 = new Presentation("SUMMER");

        System.out.println(presentation1 + "\n");
        System.out.println(presentation2 + "\n");
        System.out.println(presentation3 + "\n");
        presentation1.setThemeName("CITY");
        presentation2.setPresentationTime(600);
        presentation3.setSlideNumber(15);
        System.out.println(presentation1 + "\n");
        System.out.println(presentation2 + "\n");
        System.out.println(presentation3 + "\n");
    }
}