import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

public class Controller implements KeyListener {
    private Model model;

    Controller(Viewer viewer){
        model = new Model(viewer);
    }

    public Model getModel(){
        return model;
    }

    public void keyTyped(KeyEvent event){

    }

    public void keyPressed(KeyEvent event){
        int keyCode = event.getKeyCode();
        //System.out.println(keyCode);

        String direction = "";
        switch (keyCode){
            case 38:
                direction = "Up";
            break;

            case 87:
                //System.out.println("Up");
                direction = "Up";
                break;

            case 39:
                //System.out.println("Right");
                direction = "Right";
                break;
            case 68:
                //System.out.println("Right");
                direction = "Right";
                break;

            case 40:
                //System.out.println("Down");
                direction = "Down";
                break;

            case 83:
                //System.out.println("Down");
                direction = "Down";
                break;

                case 37:
                //System.out.println("Left");
                    direction = "Left";
                break;

            case 65:
                //System.out.println("Left");
                direction = "Left";
                break;
        }
        model.move(direction);
    }

    public void keyReleased(KeyEvent event){

    }

}
