package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.joda.time.LocalDate;
import org.openapitools.jackson.nullable.JsonNullable;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Данные, необходимые для генерации отчета. 
 **/
@ApiModel(description="Данные, необходимые для генерации отчета. ")

public class GenerateUnitedOrdersRequest  {
  
  @ApiModelProperty(required = true, value = "Идентификатор бизнеса.")
 /**
   * Идентификатор бизнеса.
  **/
  private Long businessId;

  @ApiModelProperty(required = true, value = "Начало периода, включительно.")
 /**
   * Начало периода, включительно.
  **/
  private LocalDate dateFrom;

  @ApiModelProperty(required = true, value = "Конец периода, включительно. Максимальный период — 1 год.")
 /**
   * Конец периода, включительно. Максимальный период — 1 год.
  **/
  private LocalDate dateTo;

  @ApiModelProperty(value = "Список магазинов, которые нужны в отчете.")
 /**
   * Список магазинов, которые нужны в отчете.
  **/
  private List<Long> campaignIds;

  @ApiModelProperty(value = "Идентификатор акции, товары из которой нужны в отчете.")
 /**
   * Идентификатор акции, товары из которой нужны в отчете.
  **/
  private String promoId;
 /**
   * Идентификатор бизнеса.
   * @return businessId
  **/
  @JsonProperty("businessId")
  public Long getBusinessId() {
    return businessId;
  }

  public void setBusinessId(Long businessId) {
    this.businessId = businessId;
  }

  public GenerateUnitedOrdersRequest businessId(Long businessId) {
    this.businessId = businessId;
    return this;
  }

 /**
   * Начало периода, включительно.
   * @return dateFrom
  **/
  @JsonProperty("dateFrom")
  public LocalDate getDateFrom() {
    return dateFrom;
  }

  public void setDateFrom(LocalDate dateFrom) {
    this.dateFrom = dateFrom;
  }

  public GenerateUnitedOrdersRequest dateFrom(LocalDate dateFrom) {
    this.dateFrom = dateFrom;
    return this;
  }

 /**
   * Конец периода, включительно. Максимальный период — 1 год.
   * @return dateTo
  **/
  @JsonProperty("dateTo")
  public LocalDate getDateTo() {
    return dateTo;
  }

  public void setDateTo(LocalDate dateTo) {
    this.dateTo = dateTo;
  }

  public GenerateUnitedOrdersRequest dateTo(LocalDate dateTo) {
    this.dateTo = dateTo;
    return this;
  }

 /**
   * Список магазинов, которые нужны в отчете.
   * @return campaignIds
  **/
  @JsonProperty("campaignIds")
  public List<Long> getCampaignIds() {
    return campaignIds;
  }

  public void setCampaignIds(List<Long> campaignIds) {
    this.campaignIds = campaignIds;
  }

  public GenerateUnitedOrdersRequest campaignIds(List<Long> campaignIds) {
    this.campaignIds = campaignIds;
    return this;
  }

  public GenerateUnitedOrdersRequest addCampaignIdsItem(Long campaignIdsItem) {
    this.campaignIds.add(campaignIdsItem);
    return this;
  }

 /**
   * Идентификатор акции, товары из которой нужны в отчете.
   * @return promoId
  **/
  @JsonProperty("promoId")
  public String getPromoId() {
    return promoId;
  }

  public void setPromoId(String promoId) {
    this.promoId = promoId;
  }

  public GenerateUnitedOrdersRequest promoId(String promoId) {
    this.promoId = promoId;
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
    GenerateUnitedOrdersRequest generateUnitedOrdersRequest = (GenerateUnitedOrdersRequest) o;
    return Objects.equals(this.businessId, generateUnitedOrdersRequest.businessId) &&
        Objects.equals(this.dateFrom, generateUnitedOrdersRequest.dateFrom) &&
        Objects.equals(this.dateTo, generateUnitedOrdersRequest.dateTo) &&
        Objects.equals(this.campaignIds, generateUnitedOrdersRequest.campaignIds) &&
        Objects.equals(this.promoId, generateUnitedOrdersRequest.promoId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(businessId, dateFrom, dateTo, campaignIds, promoId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GenerateUnitedOrdersRequest {\n");
    
    sb.append("    businessId: ").append(toIndentedString(businessId)).append("\n");
    sb.append("    dateFrom: ").append(toIndentedString(dateFrom)).append("\n");
    sb.append("    dateTo: ").append(toIndentedString(dateTo)).append("\n");
    sb.append("    campaignIds: ").append(toIndentedString(campaignIds)).append("\n");
    sb.append("    promoId: ").append(toIndentedString(promoId)).append("\n");
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

