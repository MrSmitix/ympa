package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Date;
import org.openapitools.model.GoodsFeedbackDescriptionDTO;
import org.openapitools.model.GoodsFeedbackIdentifiersDTO;
import org.openapitools.model.GoodsFeedbackMediaDTO;
import org.openapitools.model.GoodsFeedbackStatisticsDTO;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Отзыв о товаре.
 */

@Schema(name = "GoodsFeedbackDTO", description = "Отзыв о товаре.")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-09-09T22:19:44.552145407Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GoodsFeedbackDTO {

  private Long feedbackId;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private Date createdAt;

  private Boolean needReaction;

  private GoodsFeedbackIdentifiersDTO identifiers;

  private String author;

  private GoodsFeedbackDescriptionDTO description;

  private GoodsFeedbackMediaDTO media;

  private GoodsFeedbackStatisticsDTO statistics;

  public GoodsFeedbackDTO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public GoodsFeedbackDTO(Long feedbackId, Date createdAt, Boolean needReaction, GoodsFeedbackIdentifiersDTO identifiers, GoodsFeedbackStatisticsDTO statistics) {
    this.feedbackId = feedbackId;
    this.createdAt = createdAt;
    this.needReaction = needReaction;
    this.identifiers = identifiers;
    this.statistics = statistics;
  }

  public GoodsFeedbackDTO feedbackId(Long feedbackId) {
    this.feedbackId = feedbackId;
    return this;
  }

  /**
   * Идентификатор отзыва. 
   * @return feedbackId
   */
  @NotNull 
  @Schema(name = "feedbackId", description = "Идентификатор отзыва. ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("feedbackId")
  public Long getFeedbackId() {
    return feedbackId;
  }

  public void setFeedbackId(Long feedbackId) {
    this.feedbackId = feedbackId;
  }

  public GoodsFeedbackDTO createdAt(Date createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Дата и время создания отзыва.
   * @return createdAt
   */
  @NotNull @Valid 
  @Schema(name = "createdAt", description = "Дата и время создания отзыва.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("createdAt")
  public Date getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }

  public GoodsFeedbackDTO needReaction(Boolean needReaction) {
    this.needReaction = needReaction;
    return this;
  }

  /**
   * Нужен ли ответ на отзыв.
   * @return needReaction
   */
  @NotNull 
  @Schema(name = "needReaction", description = "Нужен ли ответ на отзыв.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("needReaction")
  public Boolean getNeedReaction() {
    return needReaction;
  }

  public void setNeedReaction(Boolean needReaction) {
    this.needReaction = needReaction;
  }

  public GoodsFeedbackDTO identifiers(GoodsFeedbackIdentifiersDTO identifiers) {
    this.identifiers = identifiers;
    return this;
  }

  /**
   * Get identifiers
   * @return identifiers
   */
  @NotNull @Valid 
  @Schema(name = "identifiers", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("identifiers")
  public GoodsFeedbackIdentifiersDTO getIdentifiers() {
    return identifiers;
  }

  public void setIdentifiers(GoodsFeedbackIdentifiersDTO identifiers) {
    this.identifiers = identifiers;
  }

  public GoodsFeedbackDTO author(String author) {
    this.author = author;
    return this;
  }

  /**
   * Имя автора отзыва.
   * @return author
   */
  
  @Schema(name = "author", description = "Имя автора отзыва.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("author")
  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public GoodsFeedbackDTO description(GoodsFeedbackDescriptionDTO description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
   */
  @Valid 
  @Schema(name = "description", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public GoodsFeedbackDescriptionDTO getDescription() {
    return description;
  }

  public void setDescription(GoodsFeedbackDescriptionDTO description) {
    this.description = description;
  }

  public GoodsFeedbackDTO media(GoodsFeedbackMediaDTO media) {
    this.media = media;
    return this;
  }

  /**
   * Get media
   * @return media
   */
  @Valid 
  @Schema(name = "media", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("media")
  public GoodsFeedbackMediaDTO getMedia() {
    return media;
  }

  public void setMedia(GoodsFeedbackMediaDTO media) {
    this.media = media;
  }

  public GoodsFeedbackDTO statistics(GoodsFeedbackStatisticsDTO statistics) {
    this.statistics = statistics;
    return this;
  }

  /**
   * Get statistics
   * @return statistics
   */
  @NotNull @Valid 
  @Schema(name = "statistics", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("statistics")
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

