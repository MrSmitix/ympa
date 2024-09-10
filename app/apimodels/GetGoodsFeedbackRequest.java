package apimodels;

import apimodels.FeedbackReactionStatusType;
import java.time.OffsetDateTime;
import java.util.LinkedHashSet;
import java.util.Set;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Фильтр запроса отзывов в кабинете. 
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class GetGoodsFeedbackRequest   {
  @JsonProperty("dateTimeFrom")
  @Valid

  private OffsetDateTime dateTimeFrom;

  @JsonProperty("dateTimeTo")
  @Valid

  private OffsetDateTime dateTimeTo;

  @JsonProperty("reactionStatus")
  @Valid

  private FeedbackReactionStatusType reactionStatus;

  @JsonProperty("ratingValues")
  @Size(max=5)

  private Set<Integer> ratingValues = null;

  @JsonProperty("modelIds")
  @Size(max=20)

  private Set<Long> modelIds = null;

  @JsonProperty("paid")
  
  private Boolean paid;

  public GetGoodsFeedbackRequest dateTimeFrom(OffsetDateTime dateTimeFrom) {
    this.dateTimeFrom = dateTimeFrom;
    return this;
  }

   /**
   * Начало периода. Не включительно.  Если параметр не указан, возвращается информация за 6 месяцев до указанной в `dateTimeTo` даты. 
   * @return dateTimeFrom
  **/
  public OffsetDateTime getDateTimeFrom() {
    return dateTimeFrom;
  }

  public void setDateTimeFrom(OffsetDateTime dateTimeFrom) {
    this.dateTimeFrom = dateTimeFrom;
  }

  public GetGoodsFeedbackRequest dateTimeTo(OffsetDateTime dateTimeTo) {
    this.dateTimeTo = dateTimeTo;
    return this;
  }

   /**
   * Конец периода. Не включительно.  Если параметр не указан, используется текущая дата. 
   * @return dateTimeTo
  **/
  public OffsetDateTime getDateTimeTo() {
    return dateTimeTo;
  }

  public void setDateTimeTo(OffsetDateTime dateTimeTo) {
    this.dateTimeTo = dateTimeTo;
  }

  public GetGoodsFeedbackRequest reactionStatus(FeedbackReactionStatusType reactionStatus) {
    this.reactionStatus = reactionStatus;
    return this;
  }

   /**
   * Get reactionStatus
   * @return reactionStatus
  **/
  public FeedbackReactionStatusType getReactionStatus() {
    return reactionStatus;
  }

  public void setReactionStatus(FeedbackReactionStatusType reactionStatus) {
    this.reactionStatus = reactionStatus;
  }

  public GetGoodsFeedbackRequest ratingValues(Set<Integer> ratingValues) {
    this.ratingValues = ratingValues;
    return this;
  }

  public GetGoodsFeedbackRequest addRatingValuesItem(Integer ratingValuesItem) {
    if (this.ratingValues == null) {
      this.ratingValues = new LinkedHashSet<>();
    }
    this.ratingValues.add(ratingValuesItem);
    return this;
  }

   /**
   * Оценка товара.
   * @return ratingValues
  **/
  public Set<Integer> getRatingValues() {
    return ratingValues;
  }

  public void setRatingValues(Set<Integer> ratingValues) {
    this.ratingValues = ratingValues;
  }

  public GetGoodsFeedbackRequest modelIds(Set<Long> modelIds) {
    this.modelIds = modelIds;
    return this;
  }

  public GetGoodsFeedbackRequest addModelIdsItem(Long modelIdsItem) {
    if (this.modelIds == null) {
      this.modelIds = new LinkedHashSet<>();
    }
    this.modelIds.add(modelIdsItem);
    return this;
  }

   /**
   * Фильтр по идентификатору модели товара.  Получить идентификатор модели можно с помощью одного из запросов:  * [POST businesses/{businessId}/offer-mappings](../../reference/business-assortment/getOfferMappings.md);  * [POST businesses/{businessId}/offer-cards](../../reference/content/getOfferCardsContentStatus.md);  * [POST models](../../reference/models/getModels.md). 
   * @return modelIds
  **/
  public Set<Long> getModelIds() {
    return modelIds;
  }

  public void setModelIds(Set<Long> modelIds) {
    this.modelIds = modelIds;
  }

  public GetGoodsFeedbackRequest paid(Boolean paid) {
    this.paid = paid;
    return this;
  }

   /**
   * Фильтр отзывов за баллы Плюса.
   * @return paid
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

