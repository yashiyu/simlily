package org.simlily;

public class Output {

    private final long id;
    private final String content;

    public Output(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
    
}
