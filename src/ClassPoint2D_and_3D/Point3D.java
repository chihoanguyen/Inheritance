package ClassPoint2D_and_3D;

public class Point3D extends Point2D {
    private float z=0f;
    public Point3D() {
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x,float  y,float z){
        super.setXY(x,y);
        this.z=z;
    }
    public float[] getXYZ(){
        float[] arr=new float[3];
        arr[0]=this.x;
        arr[1]=this.y;
        arr[2]=this.z;
        return arr;
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "z=" + z +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
