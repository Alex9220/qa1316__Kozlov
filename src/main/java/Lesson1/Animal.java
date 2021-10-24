package Lesson1;


abstract class Animal implements Participant{

    String name;
    String type;
        int maxRunLength;
        int maxSwimLength;
        int maxJumpHeight;

        boolean onTrack;


            public Animal(String type, String name, int maxRunLength, int maxSwimLength, int maxJumpHeight) {
            this.type = type;
            this.name = name;
            this.maxRunLength = maxRunLength;
            this.maxSwimLength = maxSwimLength;
            this.maxJumpHeight = maxJumpHeight;
            this.onTrack = true;
            }
    @Override
    public void run(int runDistance) {
        if (runDistance <= maxRunLength) {
            System.out.println(type + " " + name + " успешно пробежал");
        } else {
            System.out.println(type + " " + name + " не смог пробежать");
            onTrack = false;
        }
    }

    @Override
    public void swim(int swimDistance) {
        if (swimDistance <= maxSwimLength) {
            System.out.println(type + " " + name + " успешно проплыл");
        } else {
            System.out.println(type + " " + name + " не смог проплыть");
            onTrack = false;
        }
    }

    @Override
    public void jump(int jumpHeight) {
        if (jumpHeight <= maxJumpHeight) {
            System.out.println(type + " " + name + " перепрыгнул барьер");
        } else {
            System.out.println(type + " " + name + " не смог перепрыгнуть");
            onTrack = false;
        }
    }

    @Override
    public boolean isOnTrack() {
        return onTrack;
    }

    @Override
    public void info() {
        System.out.println(type + " " + name + " " + onTrack);
    }



}
