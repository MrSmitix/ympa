package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Фото и видео.
 */

@Schema(name = "GoodsFeedbackMediaDTO", description = "Фото и видео.")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-09-09T22:19:44.552145407Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GoodsFeedbackMediaDTO {

  @Valid
  private JsonNullable<List<String>> photos = JsonNullable.<List<String>>undefined();

  @Valid
  private JsonNullable<List<String>> videos = JsonNullable.<List<String>>undefined();

  public GoodsFeedbackMediaDTO photos(List<String> photos) {
    this.photos = JsonNullable.of(photos);
    return this;
  }

  public GoodsFeedbackMediaDTO addPhotosItem(String photosItem) {
    if (this.photos == null || !this.photos.isPresent()) {
      this.photos = JsonNullable.of(new ArrayList<>());
    }
    this.photos.get().add(photosItem);
    return this;
  }

  /**
   * Ссылки на фото.
   * @return photos
   */
  
  @Schema(name = "photos", description = "Ссылки на фото.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("photos")
  public JsonNullable<List<String>> getPhotos() {
    return photos;
  }

  public void setPhotos(JsonNullable<List<String>> photos) {
    this.photos = photos;
  }

  public GoodsFeedbackMediaDTO videos(List<String> videos) {
    this.videos = JsonNullable.of(videos);
    return this;
  }

  public GoodsFeedbackMediaDTO addVideosItem(String videosItem) {
    if (this.videos == null || !this.videos.isPresent()) {
      this.videos = JsonNullable.of(new ArrayList<>());
    }
    this.videos.get().add(videosItem);
    return this;
  }

  /**
   * Ссылки на видео.
   * @return videos
   */
  
  @Schema(name = "videos", description = "Ссылки на видео.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("videos")
  public JsonNullable<List<String>> getVideos() {
    return videos;
  }

  public void setVideos(JsonNullable<List<String>> videos) {
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
    return equalsNullable(this.photos, goodsFeedbackMediaDTO.photos) &&
        equalsNullable(this.videos, goodsFeedbackMediaDTO.videos);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(photos), hashCodeNullable(videos));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
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

