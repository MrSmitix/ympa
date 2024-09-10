package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.LinkedHashSet;
import java.util.Set;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.vertxweb.server.model.FeedbackReactionStatusType;

/**
 * Фильтр запроса отзывов в кабинете. 
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetGoodsFeedbackRequest   {
  
  private OffsetDateTime dateTimeFrom;
  private OffsetDateTime dateTimeTo;
  private FeedbackReactionStatusType reactionStatus;
  private Set<Integer> ratingValues;
  private Set<Long> modelIds;
  private Boolean paid;

  public GetGoodsFeedbackRequest () {

  }

  public GetGoodsFeedbackRequest (OffsetDateTime dateTimeFrom, OffsetDateTime dateTimeTo, FeedbackReactionStatusType reactionStatus, Set<Integer> ratingValues, Set<Long> modelIds, Boolean paid) {
    this.dateTimeFrom = dateTimeFrom;
    this.dateTimeTo = dateTimeTo;
    this.reactionStatus = reactionStatus;
    this.ratingValues = ratingValues;
    this.modelIds = modelIds;
    this.paid = paid;
  }

    
  @JsonProperty("dateTimeFrom")
  public OffsetDateTime getDateTimeFrom() {
    return dateTimeFrom;
  }
  public void setDateTimeFrom(OffsetDateTime dateTimeFrom) {
    this.dateTimeFrom = dateTimeFrom;
  }

    
  @JsonProperty("dateTimeTo")
  public OffsetDateTime getDateTimeTo() {
    return dateTimeTo;
  }
  public void setDateTimeTo(OffsetDateTime dateTimeTo) {
    this.dateTimeTo = dateTimeTo;
  }

    
  @JsonProperty("reactionStatus")
  public FeedbackReactionStatusType getReactionStatus() {
    return reactionStatus;
  }
  public void setReactionStatus(FeedbackReactionStatusType reactionStatus) {
    this.reactionStatus = reactionStatus;
  }

    
  @JsonProperty("ratingValues")
  public Set<Integer> getRatingValues() {
    return ratingValues;
  }
  public void setRatingValues(Set<Integer> ratingValues) {
    this.ratingValues = ratingValues;
  }

    
  @JsonProperty("modelIds")
  public Set<Long> getModelIds() {
    return modelIds;
  }
  public void setModelIds(Set<Long> modelIds) {
    this.modelIds = modelIds;
  }

    
  @JsonProperty("paid")
  public Boolean getPaid() {
    return paid;
  }
  public void setPaid(Boolean paid) {
    this.paid = paid;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetGoodsFeedbackRequest getGoodsFeedbackRequest = (GetGoodsFeedbackRequest) o;
    return Objects.equals(dateTimeFrom, getGoodsFeedbackRequest.dateTimeFrom) &&
        Objects.equals(dateTimeTo, getGoodsFeedbackRequest.dateTimeTo) &&
        Objects.equals(reactionStatus, getGoodsFeedbackRequest.reactionStatus) &&
        Objects.equals(ratingValues, getGoodsFeedbackRequest.ratingValues) &&
        Objects.equals(modelIds, getGoodsFeedbackRequest.modelIds) &&
        Objects.equals(paid, getGoodsFeedbackRequest.paid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateTimeFrom, dateTimeTo, reactionStatus, ratingValues, modelIds, paid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetGoodsFeedbackRequest {\n");
    
    sb.append("    dateTimeFrom: ").append(toIndentedString(dateTimeFrom)).append("\n");
    sb.append("    dateTimeTo: ").append(toIndentedString(dateTimeTo)).append("\n");
    sb.append("    reactionStatus: ").append(toIndentedString(reactionStatus)).append("\n");
    sb.append("    ratingValues: ").append(toIndentedString(ratingValues)).append("\n");
    sb.append("    modelIds: ").append(toIndentedString(modelIds)).append("\n");
    sb.append("    paid: ").append(toIndentedString(paid)).append("\n");
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
