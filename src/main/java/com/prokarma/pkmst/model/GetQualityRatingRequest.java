package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Set;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Запрос информации по индексу качества.
 */
@ApiModel(description = "Запрос информации по индексу качества.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-09-09T22:21:39.140910578Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GetQualityRatingRequest   {
  @JsonProperty("dateFrom")
  private LocalDate dateFrom;

  @JsonProperty("dateTo")
  private LocalDate dateTo;

  @JsonProperty("campaignIds")
  
  private Set<Long> campaignIds = new LinkedHashSet<>();

  public GetQualityRatingRequest dateFrom(LocalDate dateFrom) {
    this.dateFrom = dateFrom;
    return this;
  }

  /**
   * Начало периода.  Формат даты: `ГГГГ‑ММ‑ДД`.  Не может быть раньше 30 дней от текущей даты. 
   * @return dateFrom
   */
  @ApiModelProperty(value = "Начало периода.  Формат даты: `ГГГГ‑ММ‑ДД`.  Не может быть раньше 30 дней от текущей даты. ")
  public LocalDate getDateFrom() {
    return dateFrom;
  }

  public void setDateFrom(LocalDate dateFrom) {
    this.dateFrom = dateFrom;
  }

  public GetQualityRatingRequest dateTo(LocalDate dateTo) {
    this.dateTo = dateTo;
    return this;
  }

  /**
   * Конец периода.  Формат даты: `ГГГГ‑ММ‑ДД`.  Не может быть позже текущей даты. 
   * @return dateTo
   */
  @ApiModelProperty(value = "Конец периода.  Формат даты: `ГГГГ‑ММ‑ДД`.  Не может быть позже текущей даты. ")
  public LocalDate getDateTo() {
    return dateTo;
  }

  public void setDateTo(LocalDate dateTo) {
    this.dateTo = dateTo;
  }

  public GetQualityRatingRequest campaignIds(Set<Long> campaignIds) {
    this.campaignIds = campaignIds;
    return this;
  }

  public GetQualityRatingRequest addCampaignIdsItem(Long campaignIdsItem) {
    if (this.campaignIds == null) {
      this.campaignIds = new LinkedHashSet<>();
    }
    this.campaignIds.add(campaignIdsItem);
    return this;
  }

  /**
   * Список идентификаторов магазинов.
   * @return campaignIds
   */
  @ApiModelProperty(required = true, value = "Список идентификаторов магазинов.")
  public Set<Long> getCampaignIds() {
    return campaignIds;
  }

  @JsonDeserialize(as = LinkedHashSet.class)
  public void setCampaignIds(Set<Long> campaignIds) {
    this.campaignIds = campaignIds;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
