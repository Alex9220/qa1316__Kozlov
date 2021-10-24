package Lessom1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Course c = new Course(new Race(80), new Swim(3), new Wall(4));
        Team team = new Team("NationalGeographic",
                new Horse("Белла"),
                new Cat("Борис Николаевич"),
                new Dog("Джессика"),
                new Hippopotamus("Мото-Мото"));
        team.getTeamInfo();
        c.doIt(team);

        System.out.println("\nРезультат:");
        team.showResults();

        System.out.println("\nПрошел трек:");
        team.passedTheTrack();
    }
    }

