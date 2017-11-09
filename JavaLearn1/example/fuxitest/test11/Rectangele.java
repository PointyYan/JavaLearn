package fuxitest.test11;

public class Rectangele {
    private float width;
    private float height;

    public Rectangele(float width, float height) {
        this.width = width;
        this.height = height;
    }

    private float zc() {
        float zc;
        zc = 2 * (width + height);
        return zc;
    }

    private float mj() {
        float mj;
        mj = width * height;
        return mj;
    }

    public float getzc() {
        return zc();
    }

    public float getmj() {
        return mj();
    }

}
