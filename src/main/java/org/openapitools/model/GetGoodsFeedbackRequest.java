package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.FeedbackReactionStatusType;
import org.springframework.format.annotation.DateTimeFormat;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Фильтр запроса отзывов в кабинете. 
 */

@Schema(name = "GetGoodsFeedbackRequest", description = "Фильтр запроса отзывов в кабинете. ")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-09T22:33:46.054383208Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GetGoodsFeedbackRequest {

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime dateTimeFrom;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime dateTimeTo;

  private FeedbackReactionStatusType reactionStatus;

  @Valid
  private JsonNullable<Set<Integer>> ratingValues = JsonNullable.<Set<Integer>>undefined();

  @Valid
  private JsonNullable<Set<Long>> modelIds = JsonNullable.<Set<Long>>undefined();

  private Boolean paid;

  public GetGoodsFeedbackRequest dateTimeFrom(OffsetDateTime dateTimeFrom) {
    this.dateTimeFrom = dateTimeFrom;
    return this;
  }

  /**
   * Начало периода. Не включительно.  Если параметр не указан, возвращается информация за 6 месяцев до указанной в `dateTimeTo` даты. 
   * @return dateTimeFrom
   */
  @Valid 
  @Schema(name = "dateTimeFrom", description = "Начало периода. Не включительно.  Если параметр не указан, возвращается информация за 6 месяцев до указанной в `dateTimeTo` даты. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dateTimeFrom")
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
   */
  @Valid 
  @Schema(name = "dateTimeTo", description = "Конец периода. Не включительно.  Если параметр не указан, используется текущая дата. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dateTimeTo")
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
   */
  @Valid 
  @Schema(name = "reactionStatus", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("reactionStatus")
  public FeedbackReactionStatusType getReactionStatus() {
    return reactionStatus;
  }

  public void setReactionStatus(FeedbackReactionStatusType reactionStatus) {
    this.reactionStatus = reactionStatus;
  }

  public GetGoodsFeedbackRequest ratingValues(Set<Integer> ratingValues) {
    this.ratingValues = JsonNullable.of(ratingValues);
    return this;
  }

  public GetGoodsFeedbackRequest addRatingValuesItem(Integer ratingValuesItem) {
    if (this.ratingValues == null || !this.ratingValues.isPresent()) {
      this.ratingValues = JsonNullable.of(new LinkedHashSet<>());
    }
    this.ratingValues.get().add(ratingValuesItem);
    return this;
  }

  /**
   * Оценка товара.
   * @return ratingValues
   */
  @Size(max = 5) 
  @Schema(name = "ratingValues", description = "Оценка товара.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ratingValues")
  public JsonNullable<Set<Integer>> getRatingValues() {
    return ratingValues;
  }

  public void setRatingValues(JsonNullable<Set<Integer>> ratingValues) {
    this.ratingValues = ratingValues;
  }

  public GetGoodsFeedbackRequest modelIds(Set<Long> modelIds) {
    this.modelIds = JsonNullable.of(modelIds);
    return this;
  }

  public GetGoodsFeedbackRequest addModelIdsItem(Long modelIdsItem) {
    if (this.modelIds == null || !this.modelIds.isPresent()) {
      this.modelIds = JsonNullable.of(new LinkedHashSet<>());
    }
    this.modelIds.get().add(modelIdsItem);
    return this;
  }

  /**
   * Фильтр по идентификатору модели товара.  Получить идентификатор модели можно с помощью одного из запросов:  * [POST businesses/{businessId}/offer-mappings](../../reference/business-assortment/getOfferMappings.md);  * [POST businesses/{businessId}/offer-cards](../../reference/content/getOfferCardsContentStatus.md);  * [POST models](../../reference/models/getModels.md). 
   * @return modelIds
   */
  @Size(max = 20) 
  @Schema(name = "modelIds", description = "Фильтр по идентификатору модели товара.  Получить идентификатор модели можно с помощью одного из запросов:  * [POST businesses/{businessId}/offer-mappings](../../reference/business-assortment/getOfferMappings.md);  * [POST businesses/{businessId}/offer-cards](../../reference/content/getOfferCardsContentStatus.md);  * [POST models](../../reference/models/getModels.md). ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("modelIds")
  public JsonNullable<Set<Long>> getModelIds() {
    return modelIds;
  }

  public void setModelIds(JsonNullable<Set<Long>> modelIds) {
    this.modelIds = modelIds;
  }

  public GetGoodsFeedbackRequest paid(Boolean paid) {
    this.paid = paid;
    return this;
  }

  /**
   * Фильтр отзывов за баллы Плюса.
   * @return paid
   */
  
  @Schema(name = "paid", description = "Фильтр отзывов за баллы Плюса.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
        equalsNullable(this.ratingValues, getGoodsFeedbackRequest.ratingValues) &&
        equalsNullable(this.modelIds, getGoodsFeedbackRequest.modelIds) &&
        Objects.equals(this.paid, getGoodsFeedbackRequest.paid);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateTimeFrom, dateTimeTo, reactionStatus, hashCodeNullable(ratingValues), hashCodeNullable(modelIds), paid);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
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

