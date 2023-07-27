package school.mjc.stage0.loops.task5;

public class Triangle {
    public void printTriangle(int cathetusLength) {
    for(int i=0;i<cathetusLength;i++) {
            for (int j=i;j>0;j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
