package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Фото и видео.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GoodsFeedbackMediaDTO   {
  
  private List<String> photos;
  private List<String> videos;

  public GoodsFeedbackMediaDTO () {

  }

  public GoodsFeedbackMediaDTO (List<String> photos, List<String> videos) {
    this.photos = photos;
    this.videos = videos;
  }

    
  @JsonProperty("photos")
  public List<String> getPhotos() {
    return photos;
  }
  public void setPhotos(List<String> photos) {
    this.photos = photos;
  }

    
  @JsonProperty("videos")
  public List<String> getVideos() {
    return videos;
  }
  public void setVideos(List<String> videos) {
    this.videos = videos;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoodsFeedbackMediaDTO goodsFeedbackMediaDTO = (GoodsFeedbackMediaDTO) o;
    return Objects.equals(photos, goodsFeedbackMediaDTO.photos) &&
        Objects.equals(videos, goodsFeedbackMediaDTO.videos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(photos, videos);
  }

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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
