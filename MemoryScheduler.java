package itschool.classes;

import java.util.ArrayList;

public class MemoryScheduler {
    private static ArrayList<MemoryBlock> memoryBlocks = new ArrayList<>();

    public static String print(){

        String result = "[ ";
        for(MemoryBlock memoryBlock: memoryBlocks){
            result += memoryBlock + " ";
        }
        return result + " ]";
    }


    private static int findFreeBlock(int size){
        System.out.println(print());
        memoryBlocks.sort(MemoryBlock.byEnd);
        System.out.println(print());

        ArrayList<MemoryBlock> tempMemoryBlocks = new ArrayList<>();
        // TODO find free block using given stratedy (1,2,3)
        for (int i = 0; i < memoryBlocks.size()-1; i++){
            if(memoryBlocks.get(i+1).start - memoryBlocks.get(i).end > size){
                MemoryBlock tempMemomyBlock = new MemoryBlock(memoryBlocks.get(i+1).start, memoryBlocks.get(i).end);
                tempMemoryBlocks.add(tempMemomyBlock);

            }
        }
        if (Configuration.memoryVolume - memoryBlocks.get(memoryBlocks.size()-1).end > size){
            MemoryBlock tempMemoryBlock = new MemoryBlock(memoryBlocks.get(memoryBlocks.size()-1).end, Configuration.memoryVolume);
            tempMemoryBlocks.add(tempMemoryBlock);
        }
        // Choose fit block
        return 0;
    }

    public static boolean fillMemoryBlock(int size){
        findFreeBlock(size);
        return false;
    }

    public static void realeseMemoryBlock(MemoryBlock memoryBlock){

        memoryBlocks.remove(memoryBlock);

        return;
    }

    public static void add(MemoryBlock memoryBlock) {
        memoryBlocks.add(memoryBlock);
    }

    @Override
    public String toString(){
        String result = "[";
        for (int i = 0; i < memoryBlocks.size(); i++){
            result += memoryBlocks.get(i) + " ";
        }
        return result + ']';
    }

}
