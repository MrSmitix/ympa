package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Фото и видео.
 **/
@ApiModel(description = "Фото и видео.")
@JsonTypeName("GoodsFeedbackMediaDTO")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-09-09T22:25:08.792192529Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GoodsFeedbackMediaDTO   {
  private @Valid List<String> photos;
  private @Valid List<String> videos;

  /**
   * Ссылки на фото.
   **/
  public GoodsFeedbackMediaDTO photos(List<String> photos) {
    this.photos = photos;
    return this;
  }

  
  @ApiModelProperty(value = "Ссылки на фото.")
  @JsonProperty("photos")
  public List<String> getPhotos() {
    return photos;
  }

  @JsonProperty("photos")
  public void setPhotos(List<String> photos) {
    this.photos = photos;
  }

  public GoodsFeedbackMediaDTO addPhotosItem(String photosItem) {
    if (this.photos == null) {
      this.photos = new ArrayList<>();
    }

    this.photos.add(photosItem);
    return this;
  }

  public GoodsFeedbackMediaDTO removePhotosItem(String photosItem) {
    if (photosItem != null && this.photos != null) {
      this.photos.remove(photosItem);
    }

    return this;
  }
  /**
   * Ссылки на видео.
   **/
  public GoodsFeedbackMediaDTO videos(List<String> videos) {
    this.videos = videos;
    return this;
  }

  
  @ApiModelProperty(value = "Ссылки на видео.")
  @JsonProperty("videos")
  public List<String> getVideos() {
    return videos;
  }

  @JsonProperty("videos")
  public void setVideos(List<String> videos) {
    this.videos = videos;
  }

  public GoodsFeedbackMediaDTO addVideosItem(String videosItem) {
    if (this.videos == null) {
      this.videos = new ArrayList<>();
    }

    this.videos.add(videosItem);
    return this;
  }

  public GoodsFeedbackMediaDTO removeVideosItem(String videosItem) {
    if (videosItem != null && this.videos != null) {
      this.videos.remove(videosItem);
    }

    return this;
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

