package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/**
 * Информация о последней публикации предложений из прайс-листа на Маркете. 
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FeedPublicationFullDTO   {
  
  private OffsetDateTime fileTime;
  private OffsetDateTime publishedTime;

  public FeedPublicationFullDTO () {

  }

  public FeedPublicationFullDTO (OffsetDateTime fileTime, OffsetDateTime publishedTime) {
    this.fileTime = fileTime;
    this.publishedTime = publishedTime;
  }

    
  @JsonProperty("fileTime")
  public OffsetDateTime getFileTime() {
    return fileTime;
  }
  public void setFileTime(OffsetDateTime fileTime) {
    this.fileTime = fileTime;
  }

    
  @JsonProperty("publishedTime")
  public OffsetDateTime getPublishedTime() {
    return publishedTime;
  }
  public void setPublishedTime(OffsetDateTime publishedTime) {
    this.publishedTime = publishedTime;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeedPublicationFullDTO feedPublicationFullDTO = (FeedPublicationFullDTO) o;
    return Objects.equals(fileTime, feedPublicationFullDTO.fileTime) &&
        Objects.equals(publishedTime, feedPublicationFullDTO.publishedTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileTime, publishedTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeedPublicationFullDTO {\n");
    
    sb.append("    fileTime: ").append(toIndentedString(fileTime)).append("\n");
    sb.append("    publishedTime: ").append(toIndentedString(publishedTime)).append("\n");
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
