package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Фото и видео.
 **/
@ApiModel(description="Фото и видео.")

public class GoodsFeedbackMediaDTO  {
  
  @ApiModelProperty(value = "Ссылки на фото.")
 /**
   * Ссылки на фото.
  **/
  private List<String> photos;

  @ApiModelProperty(value = "Ссылки на видео.")
 /**
   * Ссылки на видео.
  **/
  private List<String> videos;
 /**
   * Ссылки на фото.
   * @return photos
  **/
  @JsonProperty("photos")
  public List<String> getPhotos() {
    return photos;
  }

  public void setPhotos(List<String> photos) {
    this.photos = photos;
  }

  public GoodsFeedbackMediaDTO photos(List<String> photos) {
    this.photos = photos;
    return this;
  }

  public GoodsFeedbackMediaDTO addPhotosItem(String photosItem) {
    this.photos.add(photosItem);
    return this;
  }

 /**
   * Ссылки на видео.
   * @return videos
  **/
  @JsonProperty("videos")
  public List<String> getVideos() {
    return videos;
  }

  public void setVideos(List<String> videos) {
    this.videos = videos;
  }

  public GoodsFeedbackMediaDTO videos(List<String> videos) {
    this.videos = videos;
    return this;
  }

  public GoodsFeedbackMediaDTO addVideosItem(String videosItem) {
    this.videos.add(videosItem);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

