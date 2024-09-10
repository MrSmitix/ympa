package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.Date;
import org.openapitools.model.GoodsFeedbackDescriptionDTO;
import org.openapitools.model.GoodsFeedbackIdentifiersDTO;
import org.openapitools.model.GoodsFeedbackMediaDTO;
import org.openapitools.model.GoodsFeedbackStatisticsDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Отзыв о товаре.
 */
@ApiModel(description="Отзыв о товаре.")

public class GoodsFeedbackDTO  {
  
 /**
  * Идентификатор отзыва. 
  */
  @ApiModelProperty(required = true, value = "Идентификатор отзыва. ")
  private Long feedbackId;

 /**
  * Дата и время создания отзыва.
  */
  @ApiModelProperty(required = true, value = "Дата и время создания отзыва.")
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'hh:mm:ss.SSSX")
  private Date createdAt;

 /**
  * Нужен ли ответ на отзыв.
  */
  @ApiModelProperty(required = true, value = "Нужен ли ответ на отзыв.")
  private Boolean needReaction;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private GoodsFeedbackIdentifiersDTO identifiers;

 /**
  * Имя автора отзыва.
  */
  @ApiModelProperty(value = "Имя автора отзыва.")
  private String author;

  @ApiModelProperty(value = "")
  @Valid
  private GoodsFeedbackDescriptionDTO description;

  @ApiModelProperty(value = "")
  @Valid
  private GoodsFeedbackMediaDTO media;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private GoodsFeedbackStatisticsDTO statistics;
 /**
  * Идентификатор отзыва. 
  * @return feedbackId
  */
  @JsonProperty("feedbackId")
  @NotNull
  public Long getFeedbackId() {
    return feedbackId;
  }

  /**
   * Sets the <code>feedbackId</code> property.
   */
 public void setFeedbackId(Long feedbackId) {
    this.feedbackId = feedbackId;
  }

  /**
   * Sets the <code>feedbackId</code> property.
   */
  public GoodsFeedbackDTO feedbackId(Long feedbackId) {
    this.feedbackId = feedbackId;
    return this;
  }

 /**
  * Дата и время создания отзыва.
  * @return createdAt
  */
  @JsonProperty("createdAt")
  @NotNull
  public Date getCreatedAt() {
    return createdAt;
  }

  /**
   * Sets the <code>createdAt</code> property.
   */
 public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }

  /**
   * Sets the <code>createdAt</code> property.
   */
  public GoodsFeedbackDTO createdAt(Date createdAt) {
    this.createdAt = createdAt;
    return this;
  }

 /**
  * Нужен ли ответ на отзыв.
  * @return needReaction
  */
  @JsonProperty("needReaction")
  @NotNull
  public Boolean getNeedReaction() {
    return needReaction;
  }

  /**
   * Sets the <code>needReaction</code> property.
   */
 public void setNeedReaction(Boolean needReaction) {
    this.needReaction = needReaction;
  }

  /**
   * Sets the <code>needReaction</code> property.
   */
  public GoodsFeedbackDTO needReaction(Boolean needReaction) {
    this.needReaction = needReaction;
    return this;
  }

 /**
  * Get identifiers
  * @return identifiers
  */
  @JsonProperty("identifiers")
  @NotNull
  public GoodsFeedbackIdentifiersDTO getIdentifiers() {
    return identifiers;
  }

  /**
   * Sets the <code>identifiers</code> property.
   */
 public void setIdentifiers(GoodsFeedbackIdentifiersDTO identifiers) {
    this.identifiers = identifiers;
  }

  /**
   * Sets the <code>identifiers</code> property.
   */
  public GoodsFeedbackDTO identifiers(GoodsFeedbackIdentifiersDTO identifiers) {
    this.identifiers = identifiers;
    return this;
  }

 /**
  * Имя автора отзыва.
  * @return author
  */
  @JsonProperty("author")
  public String getAuthor() {
    return author;
  }

  /**
   * Sets the <code>author</code> property.
   */
 public void setAuthor(String author) {
    this.author = author;
  }

  /**
   * Sets the <code>author</code> property.
   */
  public GoodsFeedbackDTO author(String author) {
    this.author = author;
    return this;
  }

 /**
  * Get description
  * @return description
  */
  @JsonProperty("description")
  public GoodsFeedbackDescriptionDTO getDescription() {
    return description;
  }

  /**
   * Sets the <code>description</code> property.
   */
 public void setDescription(GoodsFeedbackDescriptionDTO description) {
    this.description = description;
  }

  /**
   * Sets the <code>description</code> property.
   */
  public GoodsFeedbackDTO description(GoodsFeedbackDescriptionDTO description) {
    this.description = description;
    return this;
  }

 /**
  * Get media
  * @return media
  */
  @JsonProperty("media")
  public GoodsFeedbackMediaDTO getMedia() {
    return media;
  }

  /**
   * Sets the <code>media</code> property.
   */
 public void setMedia(GoodsFeedbackMediaDTO media) {
    this.media = media;
  }

  /**
   * Sets the <code>media</code> property.
   */
  public GoodsFeedbackDTO media(GoodsFeedbackMediaDTO media) {
    this.media = media;
    return this;
  }

 /**
  * Get statistics
  * @return statistics
  */
  @JsonProperty("statistics")
  @NotNull
  public GoodsFeedbackStatisticsDTO getStatistics() {
    return statistics;
  }

  /**
   * Sets the <code>statistics</code> property.
   */
 public void setStatistics(GoodsFeedbackStatisticsDTO statistics) {
    this.statistics = statistics;
  }

  /**
   * Sets the <code>statistics</code> property.
   */
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

