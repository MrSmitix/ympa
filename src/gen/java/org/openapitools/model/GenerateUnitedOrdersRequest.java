package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.joda.time.LocalDate;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Данные, необходимые для генерации отчета. 
 */
@ApiModel(description="Данные, необходимые для генерации отчета. ")

public class GenerateUnitedOrdersRequest  {
  
 /**
  * Идентификатор бизнеса.
  */
  @ApiModelProperty(required = true, value = "Идентификатор бизнеса.")
  private Long businessId;

 /**
  * Начало периода, включительно.
  */
  @ApiModelProperty(required = true, value = "Начало периода, включительно.")
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
  private LocalDate dateFrom;

 /**
  * Конец периода, включительно. Максимальный период — 1 год.
  */
  @ApiModelProperty(required = true, value = "Конец периода, включительно. Максимальный период — 1 год.")
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
  private LocalDate dateTo;

 /**
  * Список магазинов, которые нужны в отчете.
  */
  @ApiModelProperty(value = "Список магазинов, которые нужны в отчете.")
  private List<Long> campaignIds;

 /**
  * Идентификатор акции, товары из которой нужны в отчете.
  */
  @ApiModelProperty(value = "Идентификатор акции, товары из которой нужны в отчете.")
  private String promoId;
 /**
  * Идентификатор бизнеса.
  * @return businessId
  */
  @JsonProperty("businessId")
  @NotNull
  public Long getBusinessId() {
    return businessId;
  }

  /**
   * Sets the <code>businessId</code> property.
   */
 public void setBusinessId(Long businessId) {
    this.businessId = businessId;
  }

  /**
   * Sets the <code>businessId</code> property.
   */
  public GenerateUnitedOrdersRequest businessId(Long businessId) {
    this.businessId = businessId;
    return this;
  }

 /**
  * Начало периода, включительно.
  * @return dateFrom
  */
  @JsonProperty("dateFrom")
  @NotNull
  public LocalDate getDateFrom() {
    return dateFrom;
  }

  /**
   * Sets the <code>dateFrom</code> property.
   */
 public void setDateFrom(LocalDate dateFrom) {
    this.dateFrom = dateFrom;
  }

  /**
   * Sets the <code>dateFrom</code> property.
   */
  public GenerateUnitedOrdersRequest dateFrom(LocalDate dateFrom) {
    this.dateFrom = dateFrom;
    return this;
  }

 /**
  * Конец периода, включительно. Максимальный период — 1 год.
  * @return dateTo
  */
  @JsonProperty("dateTo")
  @NotNull
  public LocalDate getDateTo() {
    return dateTo;
  }

  /**
   * Sets the <code>dateTo</code> property.
   */
 public void setDateTo(LocalDate dateTo) {
    this.dateTo = dateTo;
  }

  /**
   * Sets the <code>dateTo</code> property.
   */
  public GenerateUnitedOrdersRequest dateTo(LocalDate dateTo) {
    this.dateTo = dateTo;
    return this;
  }

 /**
  * Список магазинов, которые нужны в отчете.
  * @return campaignIds
  */
  @JsonProperty("campaignIds")
  public List<Long> getCampaignIds() {
    return campaignIds;
  }

  /**
   * Sets the <code>campaignIds</code> property.
   */
 public void setCampaignIds(List<Long> campaignIds) {
    this.campaignIds = campaignIds;
  }

  /**
   * Sets the <code>campaignIds</code> property.
   */
  public GenerateUnitedOrdersRequest campaignIds(List<Long> campaignIds) {
    this.campaignIds = campaignIds;
    return this;
  }

  /**
   * Adds a new item to the <code>campaignIds</code> list.
   */
  public GenerateUnitedOrdersRequest addCampaignIdsItem(Long campaignIdsItem) {
    this.campaignIds.add(campaignIdsItem);
    return this;
  }

 /**
  * Идентификатор акции, товары из которой нужны в отчете.
  * @return promoId
  */
  @JsonProperty("promoId")
  public String getPromoId() {
    return promoId;
  }

  /**
   * Sets the <code>promoId</code> property.
   */
 public void setPromoId(String promoId) {
    this.promoId = promoId;
  }

  /**
   * Sets the <code>promoId</code> property.
   */
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

