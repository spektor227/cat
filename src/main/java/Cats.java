import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
public class Cats {
    private final String id;
    private final String text;
    private final String type;
    private final String user;
    private final Integer upvotes;

    public Cats(
            @JsonProperty("id") String id,
            @JsonProperty("text")String text,
            @JsonProperty("type")String type,
            @JsonProperty("user")String user,
            @JsonProperty("upvotes")Integer upvotes)
    {
        this.id = id;
        this.text = text;
        this.type = type;
        this.user = user;
        this.upvotes = upvotes;
    }
    public String getId(){
        return id;
    }
    public String getText(){
        return text;
    }
    public String getType(){
        return type;
    }
    public String getUser(){
        return user;
    }
    public Integer getUpvotes(){
        return upvotes;
    }
    @Override
    public String toString() {
        return "Cat "+
                "\n id " + id +
                "\n text " + text +
                "\n tupe " + type +
                "\n user " + user +
                "\n unvoter " + upvotes;
    }
}
