package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
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
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@ApiModel(description="Фильтр запроса отзывов в кабинете. ")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2024-09-09T22:24:34.340132557Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GetGoodsFeedbackRequest   {
  
  private Date dateTimeFrom;
  private Date dateTimeTo;
  private FeedbackReactionStatusType reactionStatus;
  private Set<Integer> ratingValues;
  private Set<Long> modelIds;
  private Boolean paid;

  /**
   * Начало периода. Не включительно.  Если параметр не указан, возвращается информация за 6 месяцев до указанной в &#x60;dateTimeTo&#x60; даты. 
   **/
  
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
   **/
  
  @ApiModelProperty(value = "Конец периода. Не включительно.  Если параметр не указан, используется текущая дата. ")
  @JsonProperty("dateTimeTo")
  public Date getDateTimeTo() {
    return dateTimeTo;
  }
  public void setDateTimeTo(Date dateTimeTo) {
    this.dateTimeTo = dateTimeTo;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("reactionStatus")
  @Valid
  public FeedbackReactionStatusType getReactionStatus() {
    return reactionStatus;
  }
  public void setReactionStatus(FeedbackReactionStatusType reactionStatus) {
    this.reactionStatus = reactionStatus;
  }

  /**
   * Оценка товара.
   **/
  
  @ApiModelProperty(value = "Оценка товара.")
  @JsonProperty("ratingValues")
 @Size(max=5)  public Set<Integer> getRatingValues() {
    return ratingValues;
  }
  public void setRatingValues(Set<Integer> ratingValues) {
    this.ratingValues = ratingValues;
  }

  /**
   * Фильтр по идентификатору модели товара.  Получить идентификатор модели можно с помощью одного из запросов:  * [POST businesses/{businessId}/offer-mappings](../../reference/business-assortment/getOfferMappings.md);  * [POST businesses/{businessId}/offer-cards](../../reference/content/getOfferCardsContentStatus.md);  * [POST models](../../reference/models/getModels.md). 
   **/
  
  @ApiModelProperty(value = "Фильтр по идентификатору модели товара.  Получить идентификатор модели можно с помощью одного из запросов:  * [POST businesses/{businessId}/offer-mappings](../../reference/business-assortment/getOfferMappings.md);  * [POST businesses/{businessId}/offer-cards](../../reference/content/getOfferCardsContentStatus.md);  * [POST models](../../reference/models/getModels.md). ")
  @JsonProperty("modelIds")
 @Size(max=20)  public Set<Long> getModelIds() {
    return modelIds;
  }
  public void setModelIds(Set<Long> modelIds) {
    this.modelIds = modelIds;
  }

  /**
   * Фильтр отзывов за баллы Плюса.
   **/
  
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

