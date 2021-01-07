package hr.rassus.lab.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="measurements")
public class Measurement {

    @Id
    private int id;
    @Column(name="value")
    private int value;

    public Measurement(int id, int value) {
        this.id = id;
        this.value = value;
    }

    public Measurement(){}

    @Override
    public String toString(){
        return this.id + " " + this.value;
    }

    public int getId() {
        return id;
    }

    public int getValue() {
        return value;
    }
}
