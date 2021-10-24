package Lessom1;

public abstract class Trassa {
    public abstract void doIt(Participant participant);
}

class Wall extends Trassa {
    int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public void doIt(Participant participant) {
        participant.jump(height);
    }
}

class Swim extends Trassa {
    int length;

    public Swim(int length) {
        this.length = length;
    }

    @Override
    public void doIt(Participant participant) {
        participant.swim(length);
    }
}

class Race extends Trassa {
    int length;

    public Race(int length) {
        this.length = length;
    }

    @Override
    public void doIt(Participant participant) {
        participant.run(length);
    }
}
