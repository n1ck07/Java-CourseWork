package itschool.classes;

public class Scheduler {
    ProcessQueue processQueue;
    RejectsQueue rejectsQueue;
    CPU cpu;
    MemoryScheduler memoryScheduler;
    ClockGenerator clockGenerator;

    public Scheduler(final int cpuCoresNumber, int memoryVolume) {
        this.processQueue = new ProcessQueue();
        this.rejectsQueue = new RejectsQueue();
        this.cpu = new CPU(cpuCoresNumber);
        this.memoryScheduler = new MemoryScheduler();
        Configuration.memoryVolume = memoryVolume;
        init();
        clockGenerator = new ClockGenerator();
        clockGenerator.run();
    }

    public void init(){
        memoryScheduler.add(new MemoryBlock(0, 100));
        memoryScheduler.add(new MemoryBlock(1000, 1100));
        memoryScheduler.add(new MemoryBlock(500, 800));
        memoryScheduler.add(new MemoryBlock(250, 450));

        processQueue.add(3);
        rejectsQueue.add(2);
    }


    @Override
    public String toString() {
        return "Scheduler{" +
                "processes = " + processQueue +
                "rejects = " + rejectsQueue +
                ", cpu = " + cpu +
                ", memoryScheduler=" + memoryScheduler +
                '}';
    }
}
