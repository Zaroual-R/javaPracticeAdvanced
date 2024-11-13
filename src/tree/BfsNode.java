package tree;

import java.util.ArrayList;
import java.util.List;

public class BfsNode {
    public boolean isVesited=false;
    public int data;
    public BfsNode(int data){
        this.data = data;
    }
    public void setVisited(){
        isVesited=true;
    }
    List<BfsNode> neighbors=new ArrayList<BfsNode>();
    public List<BfsNode> getNeighbors(){
        return neighbors;
    }
    public boolean isVesited(){
        return isVesited;
    }

    public String toString(){
        return "( data ="+data+", vesited="+isVesited+" )";
    }
}
