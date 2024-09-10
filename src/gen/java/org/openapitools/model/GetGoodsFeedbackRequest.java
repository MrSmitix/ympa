package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.Set;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.FeedbackReactionStatusType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Фильтр запроса отзывов в кабинете. 
 */
@ApiModel(description="Фильтр запроса отзывов в кабинете. ")

public class GetGoodsFeedbackRequest  {
  
 /**
  * Начало периода. Не включительно.  Если параметр не указан, возвращается информация за 6 месяцев до указанной в `dateTimeTo` даты. 
  */
  @ApiModelProperty(value = "Начало периода. Не включительно.  Если параметр не указан, возвращается информация за 6 месяцев до указанной в `dateTimeTo` даты. ")
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'hh:mm:ss.SSSX")
  private Date dateTimeFrom;

 /**
  * Конец периода. Не включительно.  Если параметр не указан, используется текущая дата. 
  */
  @ApiModelProperty(value = "Конец периода. Не включительно.  Если параметр не указан, используется текущая дата. ")
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'hh:mm:ss.SSSX")
  private Date dateTimeTo;

  @ApiModelProperty(value = "")
  @Valid
  private FeedbackReactionStatusType reactionStatus;

 /**
  * Оценка товара.
  */
  @ApiModelProperty(value = "Оценка товара.")
  private Set<Integer> ratingValues;

 /**
  * Фильтр по идентификатору модели товара.  Получить идентификатор модели можно с помощью одного из запросов:  * [POST businesses/{businessId}/offer-mappings](../../reference/business-assortment/getOfferMappings.md);  * [POST businesses/{businessId}/offer-cards](../../reference/content/getOfferCardsContentStatus.md);  * [POST models](../../reference/models/getModels.md). 
  */
  @ApiModelProperty(value = "Фильтр по идентификатору модели товара.  Получить идентификатор модели можно с помощью одного из запросов:  * [POST businesses/{businessId}/offer-mappings](../../reference/business-assortment/getOfferMappings.md);  * [POST businesses/{businessId}/offer-cards](../../reference/content/getOfferCardsContentStatus.md);  * [POST models](../../reference/models/getModels.md). ")
  private Set<Long> modelIds;

 /**
  * Фильтр отзывов за баллы Плюса.
  */
  @ApiModelProperty(value = "Фильтр отзывов за баллы Плюса.")
  private Boolean paid;
 /**
  * Начало периода. Не включительно.  Если параметр не указан, возвращается информация за 6 месяцев до указанной в &#x60;dateTimeTo&#x60; даты. 
  * @return dateTimeFrom
  */
  @JsonProperty("dateTimeFrom")
  public Date getDateTimeFrom() {
    return dateTimeFrom;
  }

  /**
   * Sets the <code>dateTimeFrom</code> property.
   */
 public void setDateTimeFrom(Date dateTimeFrom) {
    this.dateTimeFrom = dateTimeFrom;
  }

  /**
   * Sets the <code>dateTimeFrom</code> property.
   */
  public GetGoodsFeedbackRequest dateTimeFrom(Date dateTimeFrom) {
    this.dateTimeFrom = dateTimeFrom;
    return this;
  }

 /**
  * Конец периода. Не включительно.  Если параметр не указан, используется текущая дата. 
  * @return dateTimeTo
  */
  @JsonProperty("dateTimeTo")
  public Date getDateTimeTo() {
    return dateTimeTo;
  }

  /**
   * Sets the <code>dateTimeTo</code> property.
   */
 public void setDateTimeTo(Date dateTimeTo) {
    this.dateTimeTo = dateTimeTo;
  }

  /**
   * Sets the <code>dateTimeTo</code> property.
   */
  public GetGoodsFeedbackRequest dateTimeTo(Date dateTimeTo) {
    this.dateTimeTo = dateTimeTo;
    return this;
  }

 /**
  * Get reactionStatus
  * @return reactionStatus
  */
  @JsonProperty("reactionStatus")
  public FeedbackReactionStatusType getReactionStatus() {
    return reactionStatus;
  }

  /**
   * Sets the <code>reactionStatus</code> property.
   */
 public void setReactionStatus(FeedbackReactionStatusType reactionStatus) {
    this.reactionStatus = reactionStatus;
  }

  /**
   * Sets the <code>reactionStatus</code> property.
   */
  public GetGoodsFeedbackRequest reactionStatus(FeedbackReactionStatusType reactionStatus) {
    this.reactionStatus = reactionStatus;
    return this;
  }

 /**
  * Оценка товара.
  * @return ratingValues
  */
  @JsonProperty("ratingValues")
 @Size(max=5)  public Set<Integer> getRatingValues() {
    return ratingValues;
  }

  /**
   * Sets the <code>ratingValues</code> property.
   */
 public void setRatingValues(Set<Integer> ratingValues) {
    this.ratingValues = ratingValues;
  }

  /**
   * Sets the <code>ratingValues</code> property.
   */
  public GetGoodsFeedbackRequest ratingValues(Set<Integer> ratingValues) {
    this.ratingValues = ratingValues;
    return this;
  }

  /**
   * Adds a new item to the <code>ratingValues</code> list.
   */
  public GetGoodsFeedbackRequest addRatingValuesItem(Integer ratingValuesItem) {
    this.ratingValues.add(ratingValuesItem);
    return this;
  }

 /**
  * Фильтр по идентификатору модели товара.  Получить идентификатор модели можно с помощью одного из запросов:  * [POST businesses/{businessId}/offer-mappings](../../reference/business-assortment/getOfferMappings.md);  * [POST businesses/{businessId}/offer-cards](../../reference/content/getOfferCardsContentStatus.md);  * [POST models](../../reference/models/getModels.md). 
  * @return modelIds
  */
  @JsonProperty("modelIds")
 @Size(max=20)  public Set<Long> getModelIds() {
    return modelIds;
  }

  /**
   * Sets the <code>modelIds</code> property.
   */
 public void setModelIds(Set<Long> modelIds) {
    this.modelIds = modelIds;
  }

  /**
   * Sets the <code>modelIds</code> property.
   */
  public GetGoodsFeedbackRequest modelIds(Set<Long> modelIds) {
    this.modelIds = modelIds;
    return this;
  }

  /**
   * Adds a new item to the <code>modelIds</code> list.
   */
  public GetGoodsFeedbackRequest addModelIdsItem(Long modelIdsItem) {
    this.modelIds.add(modelIdsItem);
    return this;
  }

 /**
  * Фильтр отзывов за баллы Плюса.
  * @return paid
  */
  @JsonProperty("paid")
  public Boolean getPaid() {
    return paid;
  }

  /**
   * Sets the <code>paid</code> property.
   */
 public void setPaid(Boolean paid) {
    this.paid = paid;
  }

  /**
   * Sets the <code>paid</code> property.
   */
  public GetGoodsFeedbackRequest paid(Boolean paid) {
    this.paid = paid;
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
    GetGoodsFeedbackRequest getGoodsFeedbackRequest = (GetGoodsFeedbackRequest) o;
    return Objects.equals(this.dateTimeFrom, getGoodsFeedbackRequest.dateTimeFrom) &&
        Objects.equals(this.dateTimeTo, getGoodsFeedbackRequest.dateTimeTo) &&
        Objects.equals(this.reactionStatus, getGoodsFeedbackRequest.reactionStatus) &&
        Objects.equals(this.ratingValues, getGoodsFeedbackRequest.ratingValues) &&
        Objects.equals(this.modelIds, getGoodsFeedbackRequest.modelIds) &&
        Objects.equals(this.paid, getGoodsFeedbackRequest.paid);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

