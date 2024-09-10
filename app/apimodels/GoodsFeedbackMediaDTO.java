package apimodels;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Фото и видео.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class GoodsFeedbackMediaDTO   {
  @JsonProperty("photos")
  
  private List<String> photos = null;

  @JsonProperty("videos")
  
  private List<String> videos = null;

  public GoodsFeedbackMediaDTO photos(List<String> photos) {
    this.photos = photos;
    return this;
  }

  public GoodsFeedbackMediaDTO addPhotosItem(String photosItem) {
    if (this.photos == null) {
      this.photos = new ArrayList<>();
    }
    this.photos.add(photosItem);
    return this;
  }

   /**
   * Ссылки на фото.
   * @return photos
  **/
  public List<String> getPhotos() {
    return photos;
  }

  public void setPhotos(List<String> photos) {
    this.photos = photos;
  }

  public GoodsFeedbackMediaDTO videos(List<String> videos) {
    this.videos = videos;
    return this;
  }

  public GoodsFeedbackMediaDTO addVideosItem(String videosItem) {
    if (this.videos == null) {
      this.videos = new ArrayList<>();
    }
    this.videos.add(videosItem);
    return this;
  }

   /**
   * Ссылки на видео.
   * @return videos
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

