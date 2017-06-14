package br.com.cinq.spring.data.sample.entity;

/**
 * Created by fernando on 09/06/17.
 */
public class HelloWorld {

    private int id;
    private String message;


    public HelloWorld(){
        this.setId(1);
        this.setMessage("HelloWorld!");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


}
