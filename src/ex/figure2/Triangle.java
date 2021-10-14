package ex.figure2;



//三角形クラス
class Triangle extends Figure {
    //フィールド
    private double height;//高さ
    private double base;//底辺

    public Triangle(double height, double base) {
        this.height = height;
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public double getBase() {
        return base;
    }

    /**
     * 面積を求める getArea()
     * @return double 図形の面積
     */
    public double getArea() {
        return base * height / 2;
    }

    @Override
    public String toString() {
        //https://docs.oracle.com/javase/jp/11/docs/api/java.base/java/lang/String.html#format(java.lang.String,java.lang.Object...)
        //https://java-code.jp/173
        return String.format("三角形 底辺:%.2f 高さ:%.2f 面積:%.2f",
                base,height,getArea());
    }
}