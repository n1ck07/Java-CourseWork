package itschool.classes;

import java.util.Comparator;

public class MemoryBlock {
    int start;
    int end;

    public static Comparator<MemoryBlock> byEnd = new Comparator<MemoryBlock>() {
        @Override
        public int compare(MemoryBlock o1, MemoryBlock o2) {
            return o2.end - o1.end;
        }
    };

    @Override
    public String toString() {
        return "{" + start + ", " + end + "}";
    }

    public MemoryBlock(int start, int end){
        this.start = start;
        this.end = end;
    }
}
