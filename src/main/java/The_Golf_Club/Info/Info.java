package The_Golf_Club.Info;

public class Info {
    private final long id;
    private final String information;

    public Info(long id, String information){
        this.id = id;
        this.information = information;
    }

    public long getId() {
        return id;
    }

    public String getInformation(){
        return information;
    }
}
