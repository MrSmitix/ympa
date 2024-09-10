/*
 * Партнерский API Маркета
 *
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * OpenAPI document version: LATEST
 * 
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.Set;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.FeedbackReactionStatusType;



/**
 * Фильтр запроса отзывов в кабинете. 
 */

@ApiModel(description = "Фильтр запроса отзывов в кабинете. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2024-09-09T22:22:14.220683748Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GetGoodsFeedbackRequest   {
  
  private Date dateTimeFrom;
  private Date dateTimeTo;
  private FeedbackReactionStatusType reactionStatus;
  private Set<Integer> ratingValues;
  private Set<Long> modelIds;
  private Boolean paid;

  /**
   * Начало периода. Не включительно.  Если параметр не указан, возвращается информация за 6 месяцев до указанной в `dateTimeTo` даты. 
   */
  public GetGoodsFeedbackRequest dateTimeFrom(Date dateTimeFrom) {
    this.dateTimeFrom = dateTimeFrom;
    return this;
  }

  
  @ApiModelProperty(value = "Начало периода. Не включительно.  Если параметр не указан, возвращается информация за 6 месяцев до указанной в `dateTimeTo` даты. ")
  @JsonProperty("dateTimeFrom")
  public Date getDateTimeFrom() {
    return dateTimeFrom;
  }
  public void setDateTimeFrom(Date dateTimeFrom) {
    this.dateTimeFrom = dateTimeFrom;
  }

  /**
   * Конец периода. Не включительно.  Если параметр не указан, используется текущая дата. 
   */
  public GetGoodsFeedbackRequest dateTimeTo(Date dateTimeTo) {
    this.dateTimeTo = dateTimeTo;
    return this;
  }

  
  @ApiModelProperty(value = "Конец периода. Не включительно.  Если параметр не указан, используется текущая дата. ")
  @JsonProperty("dateTimeTo")
  public Date getDateTimeTo() {
    return dateTimeTo;
  }
  public void setDateTimeTo(Date dateTimeTo) {
    this.dateTimeTo = dateTimeTo;
  }

  /**
   */
  public GetGoodsFeedbackRequest reactionStatus(FeedbackReactionStatusType reactionStatus) {
    this.reactionStatus = reactionStatus;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("reactionStatus")
  public FeedbackReactionStatusType getReactionStatus() {
    return reactionStatus;
  }
  public void setReactionStatus(FeedbackReactionStatusType reactionStatus) {
    this.reactionStatus = reactionStatus;
  }

  /**
   * Оценка товара.
   */
  public GetGoodsFeedbackRequest ratingValues(Set<Integer> ratingValues) {
    this.ratingValues = ratingValues;
    return this;
  }

  
  @ApiModelProperty(value = "Оценка товара.")
  @JsonProperty("ratingValues")
  public Set<Integer> getRatingValues() {
    return ratingValues;
  }
  public void setRatingValues(Set<Integer> ratingValues) {
    this.ratingValues = ratingValues;
  }

  /**
   * Фильтр по идентификатору модели товара.  Получить идентификатор модели можно с помощью одного из запросов:  * [POST businesses/{businessId}/offer-mappings](../../reference/business-assortment/getOfferMappings.md);  * [POST businesses/{businessId}/offer-cards](../../reference/content/getOfferCardsContentStatus.md);  * [POST models](../../reference/models/getModels.md). 
   */
  public GetGoodsFeedbackRequest modelIds(Set<Long> modelIds) {
    this.modelIds = modelIds;
    return this;
  }

  
  @ApiModelProperty(value = "Фильтр по идентификатору модели товара.  Получить идентификатор модели можно с помощью одного из запросов:  * [POST businesses/{businessId}/offer-mappings](../../reference/business-assortment/getOfferMappings.md);  * [POST businesses/{businessId}/offer-cards](../../reference/content/getOfferCardsContentStatus.md);  * [POST models](../../reference/models/getModels.md). ")
  @JsonProperty("modelIds")
  public Set<Long> getModelIds() {
    return modelIds;
  }
  public void setModelIds(Set<Long> modelIds) {
    this.modelIds = modelIds;
  }

  /**
   * Фильтр отзывов за баллы Плюса.
   */
  public GetGoodsFeedbackRequest paid(Boolean paid) {
    this.paid = paid;
    return this;
  }

  
  @ApiModelProperty(value = "Фильтр отзывов за баллы Плюса.")
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

