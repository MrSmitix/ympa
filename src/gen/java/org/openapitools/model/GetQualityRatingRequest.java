package org.openapitools.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.swagger.annotations.ApiModel;
import java.util.LinkedHashSet;
import java.util.Set;
import org.joda.time.LocalDate;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Запрос информации по индексу качества.
 **/
@ApiModel(description="Запрос информации по индексу качества.")

public class GetQualityRatingRequest  {
  
  @ApiModelProperty(value = "Начало периода.  Формат даты: `ГГГГ‑ММ‑ДД`.  Не может быть раньше 30 дней от текущей даты. ")
 /**
   * Начало периода.  Формат даты: `ГГГГ‑ММ‑ДД`.  Не может быть раньше 30 дней от текущей даты. 
  **/
  private LocalDate dateFrom;

  @ApiModelProperty(value = "Конец периода.  Формат даты: `ГГГГ‑ММ‑ДД`.  Не может быть позже текущей даты. ")
 /**
   * Конец периода.  Формат даты: `ГГГГ‑ММ‑ДД`.  Не может быть позже текущей даты. 
  **/
  private LocalDate dateTo;

  @ApiModelProperty(required = true, value = "Список идентификаторов магазинов.")
 /**
   * Список идентификаторов магазинов.
  **/
  private Set<Long> campaignIds = new LinkedHashSet<>();
 /**
   * Начало периода.  Формат даты: &#x60;ГГГГ‑ММ‑ДД&#x60;.  Не может быть раньше 30 дней от текущей даты. 
   * @return dateFrom
  **/
  @JsonProperty("dateFrom")
  public LocalDate getDateFrom() {
    return dateFrom;
  }

  public void setDateFrom(LocalDate dateFrom) {
    this.dateFrom = dateFrom;
  }

  public GetQualityRatingRequest dateFrom(LocalDate dateFrom) {
    this.dateFrom = dateFrom;
    return this;
  }

 /**
   * Конец периода.  Формат даты: &#x60;ГГГГ‑ММ‑ДД&#x60;.  Не может быть позже текущей даты. 
   * @return dateTo
  **/
  @JsonProperty("dateTo")
  public LocalDate getDateTo() {
    return dateTo;
  }

  public void setDateTo(LocalDate dateTo) {
    this.dateTo = dateTo;
  }

  public GetQualityRatingRequest dateTo(LocalDate dateTo) {
    this.dateTo = dateTo;
    return this;
  }

 /**
   * Список идентификаторов магазинов.
   * @return campaignIds
  **/
  @JsonProperty("campaignIds")
  @NotNull
 @Size(min=1,max=50)  public Set<Long> getCampaignIds() {
    return campaignIds;
  }

  @JsonDeserialize(as = LinkedHashSet.class)
  public void setCampaignIds(Set<Long> campaignIds) {
    this.campaignIds = campaignIds;
  }

  public GetQualityRatingRequest campaignIds(Set<Long> campaignIds) {
    this.campaignIds = campaignIds;
    return this;
  }

  public GetQualityRatingRequest addCampaignIdsItem(Long campaignIdsItem) {
    this.campaignIds.add(campaignIdsItem);
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
    GetQualityRatingRequest getQualityRatingRequest = (GetQualityRatingRequest) o;
    return Objects.equals(this.dateFrom, getQualityRatingRequest.dateFrom) &&
        Objects.equals(this.dateTo, getQualityRatingRequest.dateTo) &&
        Objects.equals(this.campaignIds, getQualityRatingRequest.campaignIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateFrom, dateTo, campaignIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetQualityRatingRequest {\n");
    
    sb.append("    dateFrom: ").append(toIndentedString(dateFrom)).append("\n");
    sb.append("    dateTo: ").append(toIndentedString(dateTo)).append("\n");
    sb.append("    campaignIds: ").append(toIndentedString(campaignIds)).append("\n");
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

