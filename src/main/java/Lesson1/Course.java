package Lesson1;

public class Course {
    /**
     * 3. Добавить класс Course (полоса препятствий), в котором будут находиться:
     * массив препятствий;
     * метод, который будет просить команду пройти всю полосу.;
     */
    Trassa[] course = new Trassa[3];
    public Course(Trassa p1, Trassa p2, Trassa p3) {
        course[0] = p1;
        course[1] = p2;
        course[2] = p3;
    }


    public void doIt(Team team) {
        System.out.println("\nКоманда " + team.teamName + " начинает забег:\n");
        for (Participant participant : team.getTeammates()) {
            for (Trassa let: course) let.doIt(participant);
        }
    }
}
