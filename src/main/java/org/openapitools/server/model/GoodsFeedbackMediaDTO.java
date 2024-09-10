package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Фото и видео.
 */
public class GoodsFeedbackMediaDTO   {

    private List<String> photos;
    private List<String> videos;

    /**
     * Default constructor.
     */
    public GoodsFeedbackMediaDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create GoodsFeedbackMediaDTO.
     *
     * @param photos Ссылки на фото.
     * @param videos Ссылки на видео.
     */
    public GoodsFeedbackMediaDTO(
        List<String> photos, 
        List<String> videos
    ) {
        this.photos = photos;
        this.videos = videos;
    }



    /**
     * Ссылки на фото.
     * @return photos
     */
    public List<String> getPhotos() {
        return photos;
    }

    public void setPhotos(List<String> photos) {
        this.photos = photos;
    }

    /**
     * Ссылки на видео.
     * @return videos
     */
    public List<String> getVideos() {
        return videos;
    }

    public void setVideos(List<String> videos) {
        this.videos = videos;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GoodsFeedbackMediaDTO {\n");
        
        sb.append("    photos: ").append(toIndentedString(photos)).append("\n");
        sb.append("    videos: ").append(toIndentedString(videos)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
    */
    private static String toIndentedString(Object o) {
        if (o == null) {
          return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}

