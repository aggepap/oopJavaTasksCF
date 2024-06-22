package oop.java.tasks.ch16.uml1;

public abstract class AbstractShape implements IShape {
    private long id;

    @Override
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "AbstractShape{" +
                "id=" + id +
                '}';
    }
}
