package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@ApiModel(description="Фото и видео.")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2024-09-09T22:24:34.340132557Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GoodsFeedbackMediaDTO   {
  
  private List<String> photos;
  private List<String> videos;

  /**
   * Ссылки на фото.
   **/
  
  @ApiModelProperty(value = "Ссылки на фото.")
  @JsonProperty("photos")
  public List<String> getPhotos() {
    return photos;
  }
  public void setPhotos(List<String> photos) {
    this.photos = photos;
  }

  /**
   * Ссылки на видео.
   **/
  
  @ApiModelProperty(value = "Ссылки на видео.")
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
    return Objects.equals(this.photos, goodsFeedbackMediaDTO.photos) &&
        Objects.equals(this.videos, goodsFeedbackMediaDTO.videos);
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

