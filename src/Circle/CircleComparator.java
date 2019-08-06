package Circle;

import Circle.Circle;

import java.util.Comparator;
//Comparator la mot lop interface san co trong java, ta chi can import vào bai
public class CircleComparator implements Comparator<Circle> {

    @Override
    public int compare(Circle c1, Circle c2) {
        if(c1.getRadius()<c2.getRadius()){
            return -1;
        }else if(c1.getRadius()>c2.getRadius()){
            return 1;
        }else {
            return 0;
        }

    }
    public void ccc(Circle c1){
        System.out.println(c1.getRadius());
    }
}
