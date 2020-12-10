package itschool.classes;

import java.util.ArrayList;

public class Queue {

    private int lastID;
    private ArrayList<Process> queue;


    public int getLastID() {
        return lastID;
    }


    public Queue() {
        queue = new ArrayList<>();
        this.lastID = 1;

    }

    public void add(Process process){
        this.queue.add(process);
    }

    public boolean add(){
        Process process = new Process(this.lastID++);
        this.add(process);
        return false;
    }

    public void add(final int N){

        for(int i = 0; i < N; i++){
            this.add();
        }
    }

    @Override
    public String toString() {
        String result ="";
        for(Process process:queue){
            result += process + "\n";
        }
        return result;
    }
// todo Scheduling algorithm
}
