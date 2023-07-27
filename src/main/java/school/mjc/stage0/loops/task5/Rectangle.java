package school.mjc.stage0.loops.task5;

public class Rectangle {
    public void printRectangleFrom8s(int length, int height){
        for (int i = 0; i < heigth; i++) {
            for (int j = 0; j < length; j++) {
                if (i == 0 || i == heigth - 1) {
                    System.out.print('8');
                } else {
                    if (j == 0 || j == length - 1) {
                        System.out.print('8');
                    } else {
                        System.out.print(' ');
                    }
                }
            }
            System.out.print("\n\r");
        }
    }
}
