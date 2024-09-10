package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.Set;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.FeedbackReactionStatusType;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Фильтр запроса отзывов в кабинете. 
 **/
@ApiModel(description="Фильтр запроса отзывов в кабинете. ")

public class GetGoodsFeedbackRequest  {
  
  @ApiModelProperty(value = "Начало периода. Не включительно.  Если параметр не указан, возвращается информация за 6 месяцев до указанной в `dateTimeTo` даты. ")
 /**
   * Начало периода. Не включительно.  Если параметр не указан, возвращается информация за 6 месяцев до указанной в `dateTimeTo` даты. 
  **/
  private Date dateTimeFrom;

  @ApiModelProperty(value = "Конец периода. Не включительно.  Если параметр не указан, используется текущая дата. ")
 /**
   * Конец периода. Не включительно.  Если параметр не указан, используется текущая дата. 
  **/
  private Date dateTimeTo;

  @ApiModelProperty(value = "")
  private FeedbackReactionStatusType reactionStatus;

  @ApiModelProperty(value = "Оценка товара.")
 /**
   * Оценка товара.
  **/
  private Set<Integer> ratingValues;

  @ApiModelProperty(value = "Фильтр по идентификатору модели товара.  Получить идентификатор модели можно с помощью одного из запросов:  * [POST businesses/{businessId}/offer-mappings](../../reference/business-assortment/getOfferMappings.md);  * [POST businesses/{businessId}/offer-cards](../../reference/content/getOfferCardsContentStatus.md);  * [POST models](../../reference/models/getModels.md). ")
 /**
   * Фильтр по идентификатору модели товара.  Получить идентификатор модели можно с помощью одного из запросов:  * [POST businesses/{businessId}/offer-mappings](../../reference/business-assortment/getOfferMappings.md);  * [POST businesses/{businessId}/offer-cards](../../reference/content/getOfferCardsContentStatus.md);  * [POST models](../../reference/models/getModels.md). 
  **/
  private Set<Long> modelIds;

  @ApiModelProperty(value = "Фильтр отзывов за баллы Плюса.")
 /**
   * Фильтр отзывов за баллы Плюса.
  **/
  private Boolean paid;
 /**
   * Начало периода. Не включительно.  Если параметр не указан, возвращается информация за 6 месяцев до указанной в &#x60;dateTimeTo&#x60; даты. 
   * @return dateTimeFrom
  **/
  @JsonProperty("dateTimeFrom")
  public Date getDateTimeFrom() {
    return dateTimeFrom;
  }

  public void setDateTimeFrom(Date dateTimeFrom) {
    this.dateTimeFrom = dateTimeFrom;
  }

  public GetGoodsFeedbackRequest dateTimeFrom(Date dateTimeFrom) {
    this.dateTimeFrom = dateTimeFrom;
    return this;
  }

 /**
   * Конец периода. Не включительно.  Если параметр не указан, используется текущая дата. 
   * @return dateTimeTo
  **/
  @JsonProperty("dateTimeTo")
  public Date getDateTimeTo() {
    return dateTimeTo;
  }

  public void setDateTimeTo(Date dateTimeTo) {
    this.dateTimeTo = dateTimeTo;
  }

  public GetGoodsFeedbackRequest dateTimeTo(Date dateTimeTo) {
    this.dateTimeTo = dateTimeTo;
    return this;
  }

 /**
   * Get reactionStatus
   * @return reactionStatus
  **/
  @JsonProperty("reactionStatus")
  public FeedbackReactionStatusType getReactionStatus() {
    return reactionStatus;
  }

  public void setReactionStatus(FeedbackReactionStatusType reactionStatus) {
    this.reactionStatus = reactionStatus;
  }

  public GetGoodsFeedbackRequest reactionStatus(FeedbackReactionStatusType reactionStatus) {
    this.reactionStatus = reactionStatus;
    return this;
  }

 /**
   * Оценка товара.
   * @return ratingValues
  **/
  @JsonProperty("ratingValues")
  public Set<Integer> getRatingValues() {
    return ratingValues;
  }

  public void setRatingValues(Set<Integer> ratingValues) {
    this.ratingValues = ratingValues;
  }

  public GetGoodsFeedbackRequest ratingValues(Set<Integer> ratingValues) {
    this.ratingValues = ratingValues;
    return this;
  }

  public GetGoodsFeedbackRequest addRatingValuesItem(Integer ratingValuesItem) {
    this.ratingValues.add(ratingValuesItem);
    return this;
  }

 /**
   * Фильтр по идентификатору модели товара.  Получить идентификатор модели можно с помощью одного из запросов:  * [POST businesses/{businessId}/offer-mappings](../../reference/business-assortment/getOfferMappings.md);  * [POST businesses/{businessId}/offer-cards](../../reference/content/getOfferCardsContentStatus.md);  * [POST models](../../reference/models/getModels.md). 
   * @return modelIds
  **/
  @JsonProperty("modelIds")
  public Set<Long> getModelIds() {
    return modelIds;
  }

  public void setModelIds(Set<Long> modelIds) {
    this.modelIds = modelIds;
  }

  public GetGoodsFeedbackRequest modelIds(Set<Long> modelIds) {
    this.modelIds = modelIds;
    return this;
  }

  public GetGoodsFeedbackRequest addModelIdsItem(Long modelIdsItem) {
    this.modelIds.add(modelIdsItem);
    return this;
  }

 /**
   * Фильтр отзывов за баллы Плюса.
   * @return paid
  **/
  @JsonProperty("paid")
  public Boolean getPaid() {
    return paid;
  }

  public void setPaid(Boolean paid) {
    this.paid = paid;
  }

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

