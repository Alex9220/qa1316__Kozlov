package Lessom1;

public class Team {
     /**
      * * 2. Добавить класс Team, который будет содержать:
      * название команды;
      * массив из четырех участников — в конструкторе можно сразу всех участников указывать);
      * метод для вывода информации о членах команды, прошедших дистанцию;
      * метод вывода информации обо всех членах команды.
     */

    String teamName;

    Participant[] participants = new Participant[4];
    public Team(String teamName, Participant participant1, Participant participant2, Participant participant3,Participant participant4 ) {
        this.teamName  = teamName;

        participants[0] = participant1;
        participants[1] = participant2;
        participants[2] = participant3;
        participants[3] = participant4;
    }
     public void showResults() {
        for (Participant participant : participants) {
            participant.info();
        }
    }

    public void passedTheTrack() {
        for (Participant participant : participants) {
            if (participant.isOnTrack()) participant.info();
        }
    }


    public Participant[] getTeammates() {
        return participants;
    }

    public void getTeamInfo() {
        System.out.println("\nКоманда " + teamName + ": " );
        for (Participant participant : participants) {
            if (participant instanceof Dog) {
                System.out.println("Собака " + ((Dog) participant).name);
            }
            if (participant instanceof Cat) {
                System.out.println("Кот " + ((Cat) participant).name);
            }
            if (participant instanceof Horse) {
                System.out.println("Лошадь " + ((Horse) participant).name);
            }
            if (participant instanceof Hippopotamus) {
                System.out.println("Гиппопотам " + ((Hippopotamus) participant).name);
            }
        }
    }
}
