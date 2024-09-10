package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.GoodsFeedbackDescriptionDTO;
import org.openapitools.model.GoodsFeedbackIdentifiersDTO;
import org.openapitools.model.GoodsFeedbackMediaDTO;
import org.openapitools.model.GoodsFeedbackStatisticsDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Отзыв о товаре.
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "Отзыв о товаре.")
public class GoodsFeedbackDTO   {
  
  private Long feedbackId;

  private java.util.Date createdAt;

  private Boolean needReaction;

  private GoodsFeedbackIdentifiersDTO identifiers;

  private String author;

  private GoodsFeedbackDescriptionDTO description;

  private GoodsFeedbackMediaDTO media;

  private GoodsFeedbackStatisticsDTO statistics;

  /**
   * Идентификатор отзыва. 
   **/
  public GoodsFeedbackDTO feedbackId(Long feedbackId) {
    this.feedbackId = feedbackId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Идентификатор отзыва. ")
  @JsonProperty("feedbackId")
  @NotNull
  public Long getFeedbackId() {
    return feedbackId;
  }
  public void setFeedbackId(Long feedbackId) {
    this.feedbackId = feedbackId;
  }


  /**
   * Дата и время создания отзыва.
   **/
  public GoodsFeedbackDTO createdAt(java.util.Date createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Дата и время создания отзыва.")
  @JsonProperty("createdAt")
  @NotNull
  public java.util.Date getCreatedAt() {
    return createdAt;
  }
  public void setCreatedAt(java.util.Date createdAt) {
    this.createdAt = createdAt;
  }


  /**
   * Нужен ли ответ на отзыв.
   **/
  public GoodsFeedbackDTO needReaction(Boolean needReaction) {
    this.needReaction = needReaction;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Нужен ли ответ на отзыв.")
  @JsonProperty("needReaction")
  @NotNull
  public Boolean getNeedReaction() {
    return needReaction;
  }
  public void setNeedReaction(Boolean needReaction) {
    this.needReaction = needReaction;
  }


  /**
   **/
  public GoodsFeedbackDTO identifiers(GoodsFeedbackIdentifiersDTO identifiers) {
    this.identifiers = identifiers;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("identifiers")
  @NotNull
  public GoodsFeedbackIdentifiersDTO getIdentifiers() {
    return identifiers;
  }
  public void setIdentifiers(GoodsFeedbackIdentifiersDTO identifiers) {
    this.identifiers = identifiers;
  }


  /**
   * Имя автора отзыва.
   **/
  public GoodsFeedbackDTO author(String author) {
    this.author = author;
    return this;
  }

  
  @ApiModelProperty(value = "Имя автора отзыва.")
  @JsonProperty("author")
  public String getAuthor() {
    return author;
  }
  public void setAuthor(String author) {
    this.author = author;
  }


  /**
   **/
  public GoodsFeedbackDTO description(GoodsFeedbackDescriptionDTO description) {
    this.description = description;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("description")
  public GoodsFeedbackDescriptionDTO getDescription() {
    return description;
  }
  public void setDescription(GoodsFeedbackDescriptionDTO description) {
    this.description = description;
  }


  /**
   **/
  public GoodsFeedbackDTO media(GoodsFeedbackMediaDTO media) {
    this.media = media;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("media")
  public GoodsFeedbackMediaDTO getMedia() {
    return media;
  }
  public void setMedia(GoodsFeedbackMediaDTO media) {
    this.media = media;
  }


  /**
   **/
  public GoodsFeedbackDTO statistics(GoodsFeedbackStatisticsDTO statistics) {
    this.statistics = statistics;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("statistics")
  @NotNull
  public GoodsFeedbackStatisticsDTO getStatistics() {
    return statistics;
  }
  public void setStatistics(GoodsFeedbackStatisticsDTO statistics) {
    this.statistics = statistics;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

