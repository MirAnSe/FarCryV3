public class Model {

    private Viewer viewer;
    int x1;
    int y1;


    Model(Viewer viewer){
        this.viewer = viewer;

        x1=50;
        y1=50;
    }

    public void move(String direction){
        if (direction.equals("Up") && y1>50){
            y1=y1-100;
        }else if(direction.equals("Right") && x1<650){
            x1=x1+100;
        }else if(direction.equals("Down") && y1<650){
            y1=y1+100;
        }else if(direction.equals("Left") && x1>50){
            x1=x1-100;
        }
        viewer.update();
    }
}
