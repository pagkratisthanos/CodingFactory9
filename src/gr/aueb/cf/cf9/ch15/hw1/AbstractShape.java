package gr.aueb.cf.cf9.ch15.hw1;

public class AbstractShape implements IShape{

    private long id;

    public AbstractShape(long id) {
        this.id = id;
    }

    @Override
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
