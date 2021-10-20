package sample.equals;

import java.util.Objects;

//従業員クラス
 class Enployee {
     private int id;
     private  String name;

    public Enployee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Enployee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Enployee enployee = (Enployee) o;
        return id == enployee.id && Objects.equals(name, enployee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
