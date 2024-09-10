package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.Date;
import org.openapitools.model.GoodsFeedbackDescriptionDTO;
import org.openapitools.model.GoodsFeedbackIdentifiersDTO;
import org.openapitools.model.GoodsFeedbackMediaDTO;
import org.openapitools.model.GoodsFeedbackStatisticsDTO;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Отзыв о товаре.
 **/
@ApiModel(description="Отзыв о товаре.")

public class GoodsFeedbackDTO  {
  
  @ApiModelProperty(required = true, value = "Идентификатор отзыва. ")
 /**
   * Идентификатор отзыва. 
  **/
  private Long feedbackId;

  @ApiModelProperty(required = true, value = "Дата и время создания отзыва.")
 /**
   * Дата и время создания отзыва.
  **/
  private Date createdAt;

  @ApiModelProperty(required = true, value = "Нужен ли ответ на отзыв.")
 /**
   * Нужен ли ответ на отзыв.
  **/
  private Boolean needReaction;

  @ApiModelProperty(required = true, value = "")
  private GoodsFeedbackIdentifiersDTO identifiers;

  @ApiModelProperty(value = "Имя автора отзыва.")
 /**
   * Имя автора отзыва.
  **/
  private String author;

  @ApiModelProperty(value = "")
  private GoodsFeedbackDescriptionDTO description;

  @ApiModelProperty(value = "")
  private GoodsFeedbackMediaDTO media;

  @ApiModelProperty(required = true, value = "")
  private GoodsFeedbackStatisticsDTO statistics;
 /**
   * Идентификатор отзыва. 
   * @return feedbackId
  **/
  @JsonProperty("feedbackId")
  public Long getFeedbackId() {
    return feedbackId;
  }

  public void setFeedbackId(Long feedbackId) {
    this.feedbackId = feedbackId;
  }

  public GoodsFeedbackDTO feedbackId(Long feedbackId) {
    this.feedbackId = feedbackId;
    return this;
  }

 /**
   * Дата и время создания отзыва.
   * @return createdAt
  **/
  @JsonProperty("createdAt")
  public Date getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }

  public GoodsFeedbackDTO createdAt(Date createdAt) {
    this.createdAt = createdAt;
    return this;
  }

 /**
   * Нужен ли ответ на отзыв.
   * @return needReaction
  **/
  @JsonProperty("needReaction")
  public Boolean getNeedReaction() {
    return needReaction;
  }

  public void setNeedReaction(Boolean needReaction) {
    this.needReaction = needReaction;
  }

  public GoodsFeedbackDTO needReaction(Boolean needReaction) {
    this.needReaction = needReaction;
    return this;
  }

 /**
   * Get identifiers
   * @return identifiers
  **/
  @JsonProperty("identifiers")
  public GoodsFeedbackIdentifiersDTO getIdentifiers() {
    return identifiers;
  }

  public void setIdentifiers(GoodsFeedbackIdentifiersDTO identifiers) {
    this.identifiers = identifiers;
  }

  public GoodsFeedbackDTO identifiers(GoodsFeedbackIdentifiersDTO identifiers) {
    this.identifiers = identifiers;
    return this;
  }

 /**
   * Имя автора отзыва.
   * @return author
  **/
  @JsonProperty("author")
  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public GoodsFeedbackDTO author(String author) {
    this.author = author;
    return this;
  }

 /**
   * Get description
   * @return description
  **/
  @JsonProperty("description")
  public GoodsFeedbackDescriptionDTO getDescription() {
    return description;
  }

  public void setDescription(GoodsFeedbackDescriptionDTO description) {
    this.description = description;
  }

  public GoodsFeedbackDTO description(GoodsFeedbackDescriptionDTO description) {
    this.description = description;
    return this;
  }

 /**
   * Get media
   * @return media
  **/
  @JsonProperty("media")
  public GoodsFeedbackMediaDTO getMedia() {
    return media;
  }

  public void setMedia(GoodsFeedbackMediaDTO media) {
    this.media = media;
  }

  public GoodsFeedbackDTO media(GoodsFeedbackMediaDTO media) {
    this.media = media;
    return this;
  }

 /**
   * Get statistics
   * @return statistics
  **/
  @JsonProperty("statistics")
  public GoodsFeedbackStatisticsDTO getStatistics() {
    return statistics;
  }

  public void setStatistics(GoodsFeedbackStatisticsDTO statistics) {
    this.statistics = statistics;
  }

  public GoodsFeedbackDTO statistics(GoodsFeedbackStatisticsDTO statistics) {
    this.statistics = statistics;
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
    GoodsFeedbackDTO goodsFeedbackDTO = (GoodsFeedbackDTO) o;
    return Objects.equals(this.feedbackId, goodsFeedbackDTO.feedbackId) &&
        Objects.equals(this.createdAt, goodsFeedbackDTO.createdAt) &&
        Objects.equals(this.needReaction, goodsFeedbackDTO.needReaction) &&
        Objects.equals(this.identifiers, goodsFeedbackDTO.identifiers) &&
        Objects.equals(this.author, goodsFeedbackDTO.author) &&
        Objects.equals(this.description, goodsFeedbackDTO.description) &&
        Objects.equals(this.media, goodsFeedbackDTO.media) &&
        Objects.equals(this.statistics, goodsFeedbackDTO.statistics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(feedbackId, createdAt, needReaction, identifiers, author, description, media, statistics);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoodsFeedbackDTO {\n");
    
    sb.append("    feedbackId: ").append(toIndentedString(feedbackId)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    needReaction: ").append(toIndentedString(needReaction)).append("\n");
    sb.append("    identifiers: ").append(toIndentedString(identifiers)).append("\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    media: ").append(toIndentedString(media)).append("\n");
    sb.append("    statistics: ").append(toIndentedString(statistics)).append("\n");
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

