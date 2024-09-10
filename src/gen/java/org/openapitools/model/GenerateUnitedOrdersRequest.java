/*
 * Партнерский API Маркета
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * The version of the OpenAPI document: LATEST
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Данные, необходимые для генерации отчета. 
 */
@ApiModel(description = "Данные, необходимые для генерации отчета. ")
@JsonPropertyOrder({
  GenerateUnitedOrdersRequest.JSON_PROPERTY_BUSINESS_ID,
  GenerateUnitedOrdersRequest.JSON_PROPERTY_DATE_FROM,
  GenerateUnitedOrdersRequest.JSON_PROPERTY_DATE_TO,
  GenerateUnitedOrdersRequest.JSON_PROPERTY_CAMPAIGN_IDS,
  GenerateUnitedOrdersRequest.JSON_PROPERTY_PROMO_ID
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2024-09-09T22:24:17.175492804Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GenerateUnitedOrdersRequest   {
  public static final String JSON_PROPERTY_BUSINESS_ID = "businessId";
  @JsonProperty(JSON_PROPERTY_BUSINESS_ID)
  private Long businessId;

  public static final String JSON_PROPERTY_DATE_FROM = "dateFrom";
  @JsonProperty(JSON_PROPERTY_DATE_FROM)
  private Date dateFrom;

  public static final String JSON_PROPERTY_DATE_TO = "dateTo";
  @JsonProperty(JSON_PROPERTY_DATE_TO)
  private Date dateTo;

  public static final String JSON_PROPERTY_CAMPAIGN_IDS = "campaignIds";
  @JsonProperty(JSON_PROPERTY_CAMPAIGN_IDS)
  private List<Long> campaignIds;

  public static final String JSON_PROPERTY_PROMO_ID = "promoId";
  @JsonProperty(JSON_PROPERTY_PROMO_ID)
  private String promoId;

  public GenerateUnitedOrdersRequest businessId(Long businessId) {
    this.businessId = businessId;
    return this;
  }

  /**
   * Идентификатор бизнеса.
   * @return businessId
   **/
  @JsonProperty(value = "businessId")
  @ApiModelProperty(required = true, value = "Идентификатор бизнеса.")
  @NotNull 
  public Long getBusinessId() {
    return businessId;
  }

  public void setBusinessId(Long businessId) {
    this.businessId = businessId;
  }

  public GenerateUnitedOrdersRequest dateFrom(Date dateFrom) {
    this.dateFrom = dateFrom;
    return this;
  }

  /**
   * Начало периода, включительно.
   * @return dateFrom
   **/
  @JsonProperty(value = "dateFrom")
  @ApiModelProperty(required = true, value = "Начало периода, включительно.")
  @NotNull 
  public Date getDateFrom() {
    return dateFrom;
  }

  public void setDateFrom(Date dateFrom) {
    this.dateFrom = dateFrom;
  }

  public GenerateUnitedOrdersRequest dateTo(Date dateTo) {
    this.dateTo = dateTo;
    return this;
  }

  /**
   * Конец периода, включительно. Максимальный период — 1 год.
   * @return dateTo
   **/
  @JsonProperty(value = "dateTo")
  @ApiModelProperty(required = true, value = "Конец периода, включительно. Максимальный период — 1 год.")
  @NotNull 
  public Date getDateTo() {
    return dateTo;
  }

  public void setDateTo(Date dateTo) {
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
   **/
  @JsonProperty(value = "campaignIds")
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
   **/
  @JsonProperty(value = "promoId")
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

