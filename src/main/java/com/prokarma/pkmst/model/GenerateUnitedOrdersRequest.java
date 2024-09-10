package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Данные, необходимые для генерации отчета. 
 */
@ApiModel(description = "Данные, необходимые для генерации отчета. ")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-09-09T22:21:39.140910578Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GenerateUnitedOrdersRequest   {
  @JsonProperty("businessId")
  private Long businessId;

  @JsonProperty("dateFrom")
  private LocalDate dateFrom;

  @JsonProperty("dateTo")
  private LocalDate dateTo;

  @JsonProperty("campaignIds")
  
  private List<Long> campaignIds = null;

  @JsonProperty("promoId")
  private String promoId;

  public GenerateUnitedOrdersRequest businessId(Long businessId) {
    this.businessId = businessId;
    return this;
  }

  /**
   * Идентификатор бизнеса.
   * @return businessId
   */
  @ApiModelProperty(required = true, value = "Идентификатор бизнеса.")
  public Long getBusinessId() {
    return businessId;
  }

  public void setBusinessId(Long businessId) {
    this.businessId = businessId;
  }

  public GenerateUnitedOrdersRequest dateFrom(LocalDate dateFrom) {
    this.dateFrom = dateFrom;
    return this;
  }

  /**
   * Начало периода, включительно.
   * @return dateFrom
   */
  @ApiModelProperty(required = true, value = "Начало периода, включительно.")
  public LocalDate getDateFrom() {
    return dateFrom;
  }

  public void setDateFrom(LocalDate dateFrom) {
    this.dateFrom = dateFrom;
  }

  public GenerateUnitedOrdersRequest dateTo(LocalDate dateTo) {
    this.dateTo = dateTo;
    return this;
  }

  /**
   * Конец периода, включительно. Максимальный период — 1 год.
   * @return dateTo
   */
  @ApiModelProperty(required = true, value = "Конец периода, включительно. Максимальный период — 1 год.")
  public LocalDate getDateTo() {
    return dateTo;
  }

  public void setDateTo(LocalDate dateTo) {
    this.dateTo = dateTo;
  }

  public GenerateUnitedOrdersRequest campaignIds(List<Long> campaignIds) {
    this.campaignIds = campaignIds;
    return this;
  }

  public GenerateUnitedOrdersRequest addCampaignIdsItem(Long campaignIdsItem) {
    if (this.campaignIds == null) {
      this.campaignIds = new ArrayList<>();
    }
    this.campaignIds.add(campaignIdsItem);
    return this;
  }

  /**
   * Список магазинов, которые нужны в отчете.
   * @return campaignIds
   */
  @ApiModelProperty(value = "Список магазинов, которые нужны в отчете.")
  public List<Long> getCampaignIds() {
    return campaignIds;
  }

  public void setCampaignIds(List<Long> campaignIds) {
    this.campaignIds = campaignIds;
  }

  public GenerateUnitedOrdersRequest promoId(String promoId) {
    this.promoId = promoId;
    return this;
  }

  /**
   * Идентификатор акции, товары из которой нужны в отчете.
   * @return promoId
   */
  @ApiModelProperty(value = "Идентификатор акции, товары из которой нужны в отчете.")
  public String getPromoId() {
    return promoId;
  }

  public void setPromoId(String promoId) {
    this.promoId = promoId;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

