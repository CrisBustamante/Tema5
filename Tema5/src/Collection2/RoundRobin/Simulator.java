package Collection2.RoundRobin;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Simulator {
    private final Queue<Process> processQueue;
    private Random random;

    public Simulator() {
        this.processQueue = new LinkedList<>();
        this.random = new Random();
    }

    public void simulate(int howManyMinutes) {
        int howManySeconds = 0;
        int processId = 1;

        while (howManySeconds < howManyMinutes * 60) {
            if (howManySeconds % 2 == 0) {
                int executionTime = random.nextInt(4) + 1;
                Process process = new Process("P" + processId, executionTime);
                processQueue.offer(process);
                System.out.println("MEW PROCESS= " + process.getId() + " WITH " + executionTime + " SECONDS OF EXECUTION TIME.");
                processId++;
            }


            if (!processQueue.isEmpty()) {
                Process thisProcess = processQueue.poll();
                thisProcess.run(1);
                System.out.println("EXECUTING PROCESS= " + thisProcess.getId() + ", REMAINING TIME: " + thisProcess.getTimeLeft() + " SECONDS.");

                if (!thisProcess.itsFinished()) {
                    processQueue.offer(thisProcess);
                } else {
                    System.out.println("PROCESS " + thisProcess.getId() + " HAS FINISHED.");
                }
            }

            howManySeconds++;
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
