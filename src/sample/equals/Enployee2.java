package sample.equals;

import java.util.Objects;

//従業員クラス
 class Enployee2 {
    private int id;
    private String name;

    public Enployee2(int id, String name) {
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
        Enployee2 enployee2 = (Enployee2) o;
        return id == enployee2.id && Objects.equals(name, enployee2.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
