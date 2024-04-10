package dev.sharukh.movies;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;

@Document(collection = "movies")
@Data //this annotation takes care of all getters, setters and string methods
@AllArgsConstructor // an addition for creating a constructor that takes all the private fields as arguments
@NoArgsConstructor //a constructor that takes no parameters
public class Movie {

    @Id                     //this lets the framework know that id should be treated as the unique identifier
    private ObjectId id;
    private String imdbId;
    private String title;
    private String releaseDate;
    private String trailerLink;
    private String poster;
    private List<String> genres;
    private List<String> backdrops;

    @DocumentReference
    private List<Review> reviewIds;
}
