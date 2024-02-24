package jobsheet2;

public class dragon07 {
    int x, y, width, height;

    void detectCollision(){
        System.out.println("Game Over");
    }

    void moveLeft(){
        x -= 1;
        System.out.println("x: " + x + "  y: " + y);
        if(x < 0 || x > width){
            detectCollision();
        }
    }

    void moveRight(){
        x += 1;
        System.out.println("x: " + x + "  y: " + y);
        if(x < 0 || x > width){
            detectCollision();
        }
    }

    void moveUp(){
        y -= 1;
        System.out.println("x: " + x + "  y: " + y);
        if(y < 0 || y > width){
            detectCollision();
        }
    }

    void moveDown(){
        y += 1;
        System.out.println("x: " + x + "  y: " + y);
        if(y < 0 || y > width){
            detectCollision();
        }
    }
}