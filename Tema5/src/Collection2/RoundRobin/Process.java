package Collection2.RoundRobin;

public class Process {
    private final String id;
    private int timeLeft;

    public Process(String id, int executionTime) {
        this.id = id;
        this.timeLeft = executionTime;
    }

    public String getId() {
        return id;
    }

    public int getTimeLeft() {
        return timeLeft;
    }

    public void run(int quantum) {
        if (timeLeft > quantum) {
            timeLeft -= quantum;
        } else {
            timeLeft = 0;
        }
    }

    public boolean itsFinished() {
        return timeLeft == 0;
    }
}
