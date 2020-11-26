package Vector3D;

public class Vector3D implements Comparable<Vector3D>{
    private final int x;
    private final int y;
    private final int z;
    public Vector3D(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public Vector3D(int x){
        this.x = x;
        this.y = x;
        this.z = x;
    }
    public Vector3D(){
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }

    @Override
    public int compareTo(Vector3D o) {
        int a = Integer.compare(z, o.z);
        if (a != 0){
            return a;
        }
        int b = Integer.compare(y, o.y);
        if (b != 0){
            return b;
        }
        return Integer.compare(x, o.x);
    }
}
