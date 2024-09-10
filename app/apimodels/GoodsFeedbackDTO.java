package apimodels;

import apimodels.GoodsFeedbackDescriptionDTO;
import apimodels.GoodsFeedbackIdentifiersDTO;
import apimodels.GoodsFeedbackMediaDTO;
import apimodels.GoodsFeedbackStatisticsDTO;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Отзыв о товаре.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class GoodsFeedbackDTO   {
  @JsonProperty("feedbackId")
  @NotNull

  private Long feedbackId;

  @JsonProperty("createdAt")
  @NotNull
@Valid

  private OffsetDateTime createdAt;

  @JsonProperty("needReaction")
  @NotNull

  private Boolean needReaction;

  @JsonProperty("identifiers")
  @NotNull
@Valid

  private GoodsFeedbackIdentifiersDTO identifiers;

  @JsonProperty("author")
  
  private String author;

  @JsonProperty("description")
  @Valid

  private GoodsFeedbackDescriptionDTO description;

  @JsonProperty("media")
  @Valid

  private GoodsFeedbackMediaDTO media;

  @JsonProperty("statistics")
  @NotNull
@Valid

  private GoodsFeedbackStatisticsDTO statistics;

  public GoodsFeedbackDTO feedbackId(Long feedbackId) {
    this.feedbackId = feedbackId;
    return this;
  }

   /**
   * Идентификатор отзыва. 
   * @return feedbackId
  **/
  public Long getFeedbackId() {
    return feedbackId;
  }

  public void setFeedbackId(Long feedbackId) {
    this.feedbackId = feedbackId;
  }

  public GoodsFeedbackDTO createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Дата и время создания отзыва.
   * @return createdAt
  **/
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public GoodsFeedbackDTO needReaction(Boolean needReaction) {
    this.needReaction = needReaction;
    return this;
  }

   /**
   * Нужен ли ответ на отзыв.
   * @return needReaction
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
    return Objects.equals(feedbackId, goodsFeedbackDTO.feedbackId) &&
        Objects.equals(createdAt, goodsFeedbackDTO.createdAt) &&
        Objects.equals(needReaction, goodsFeedbackDTO.needReaction) &&
        Objects.equals(identifiers, goodsFeedbackDTO.identifiers) &&
        Objects.equals(author, goodsFeedbackDTO.author) &&
        Objects.equals(description, goodsFeedbackDTO.description) &&
        Objects.equals(media, goodsFeedbackDTO.media) &&
        Objects.equals(statistics, goodsFeedbackDTO.statistics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(feedbackId, createdAt, needReaction, identifiers, author, description, media, statistics);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

