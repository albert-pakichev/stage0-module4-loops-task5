package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        String eight = "8";                 
        String dot = " ";                
        for (var i = 0; i < height; i++) {
            for (var j = 0; j < height; j++) {
                boolean eights = (j >= i && j <= height - 1 - i
                        || j <= i && j >= height - 1 - i);
                boolean dots = (i > j);
                if(eights){
                    System.out.print(eight);
                } else if (dots) {
                    System.out.print(dot);
                }
            }
            System.out.println();
        }
    }
}
