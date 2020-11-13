package Vector;

public class Vector2D {
    public float x;
    public float y;
    public Vector2D(float x, float y){
        this.x = x;
        this.y = y;
    }
    public Vector2D addition(Vector2D vector1){
        float x1 = x + vector1.x;
        float y1 = y + vector1.y;
        Vector2D vector3 = new Vector2D(x1,y1);
        return vector3;
    }
    public float scalarProduct(Vector2D vector1){
        return x*vector1.x + y*vector1.y;
    }
    public float magnitude(){
        return (float)Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
    }
    public Vector2D normalization(){
        float x1 = x/(magnitude());
        float y1 = y/(magnitude());
        return new Vector2D(x1,y1);
    }
}
