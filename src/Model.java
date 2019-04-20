import com.sun.org.apache.xpath.internal.SourceTree;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Model {

    private Viewer viewer;
    int x,x1;
    int y,y1;


    Model(Viewer viewer){
        this.viewer = viewer;
        x=150;x1=50;
        y=50;y1=150;
    }

    public void move(String direction){
        //System.out.println(direction);
        x=x+10;
        y1=y1+10;
        viewer.update();
    }
}
