package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Фото и видео.
 */
@ApiModel(description="Фото и видео.")

public class GoodsFeedbackMediaDTO  {
  
 /**
  * Ссылки на фото.
  */
  @ApiModelProperty(value = "Ссылки на фото.")
  private List<String> photos;

 /**
  * Ссылки на видео.
  */
  @ApiModelProperty(value = "Ссылки на видео.")
  private List<String> videos;
 /**
  * Ссылки на фото.
  * @return photos
  */
  @JsonProperty("photos")
  public List<String> getPhotos() {
    return photos;
  }

  /**
   * Sets the <code>photos</code> property.
   */
 public void setPhotos(List<String> photos) {
    this.photos = photos;
  }

  /**
   * Sets the <code>photos</code> property.
   */
  public GoodsFeedbackMediaDTO photos(List<String> photos) {
    this.photos = photos;
    return this;
  }

  /**
   * Adds a new item to the <code>photos</code> list.
   */
  public GoodsFeedbackMediaDTO addPhotosItem(String photosItem) {
    this.photos.add(photosItem);
    return this;
  }

 /**
  * Ссылки на видео.
  * @return videos
  */
  @JsonProperty("videos")
  public List<String> getVideos() {
    return videos;
  }

  /**
   * Sets the <code>videos</code> property.
   */
 public void setVideos(List<String> videos) {
    this.videos = videos;
  }

  /**
   * Sets the <code>videos</code> property.
   */
  public GoodsFeedbackMediaDTO videos(List<String> videos) {
    this.videos = videos;
    return this;
  }

  /**
   * Adds a new item to the <code>videos</code> list.
   */
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

