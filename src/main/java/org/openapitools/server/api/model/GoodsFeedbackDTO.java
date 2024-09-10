package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import org.openapitools.server.api.model.GoodsFeedbackDescriptionDTO;
import org.openapitools.server.api.model.GoodsFeedbackIdentifiersDTO;
import org.openapitools.server.api.model.GoodsFeedbackMediaDTO;
import org.openapitools.server.api.model.GoodsFeedbackStatisticsDTO;

/**
 * Отзыв о товаре.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GoodsFeedbackDTO   {
  
  private Long feedbackId;
  private OffsetDateTime createdAt;
  private Boolean needReaction;
  private GoodsFeedbackIdentifiersDTO identifiers;
  private String author;
  private GoodsFeedbackDescriptionDTO description;
  private GoodsFeedbackMediaDTO media;
  private GoodsFeedbackStatisticsDTO statistics;

  public GoodsFeedbackDTO () {

  }

  public GoodsFeedbackDTO (Long feedbackId, OffsetDateTime createdAt, Boolean needReaction, GoodsFeedbackIdentifiersDTO identifiers, String author, GoodsFeedbackDescriptionDTO description, GoodsFeedbackMediaDTO media, GoodsFeedbackStatisticsDTO statistics) {
    this.feedbackId = feedbackId;
    this.createdAt = createdAt;
    this.needReaction = needReaction;
    this.identifiers = identifiers;
    this.author = author;
    this.description = description;
    this.media = media;
    this.statistics = statistics;
  }

    
  @JsonProperty("feedbackId")
  public Long getFeedbackId() {
    return feedbackId;
  }
  public void setFeedbackId(Long feedbackId) {
    this.feedbackId = feedbackId;
  }

    
  @JsonProperty("createdAt")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }
  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

    
  @JsonProperty("needReaction")
  public Boolean getNeedReaction() {
    return needReaction;
  }
  public void setNeedReaction(Boolean needReaction) {
    this.needReaction = needReaction;
  }

    
  @JsonProperty("identifiers")
  public GoodsFeedbackIdentifiersDTO getIdentifiers() {
    return identifiers;
  }
  public void setIdentifiers(GoodsFeedbackIdentifiersDTO identifiers) {
    this.identifiers = identifiers;
  }

    
  @JsonProperty("author")
  public String getAuthor() {
    return author;
  }
  public void setAuthor(String author) {
    this.author = author;
  }

    
  @JsonProperty("description")
  public GoodsFeedbackDescriptionDTO getDescription() {
    return description;
  }
  public void setDescription(GoodsFeedbackDescriptionDTO description) {
    this.description = description;
  }

    
  @JsonProperty("media")
  public GoodsFeedbackMediaDTO getMedia() {
    return media;
  }
  public void setMedia(GoodsFeedbackMediaDTO media) {
    this.media = media;
  }

    
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
