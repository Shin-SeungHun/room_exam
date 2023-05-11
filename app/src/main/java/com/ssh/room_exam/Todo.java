package com.ssh.room_exam;
import androidx.room.Entity;
import androidx.room.Room;
import androidx.room.PrimaryKey;

@Entity
public class Todo {
    @PrimaryKey(autoGenerate = true)
    private int id;
    private String title;

    public Todo(){}

    public Todo(int id, String title) {
        this.id = id;
        this.title = title;
    }

    public Todo(String title) {
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

//    @Override
//    public String toString() {
//        return "Todo{" +
//                "id=" + id +
//                ", title='" + title + '\'' +
//                '}';
//    }

    public String toString(){
        final StringBuffer sb = new StringBuffer("Todo{");
        sb.append("id=").append(id);
        sb.append(", title='").append(title).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
