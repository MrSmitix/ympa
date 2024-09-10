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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;



/**
 * Данные, необходимые для генерации отчета. 
 */

@ApiModel(description = "Данные, необходимые для генерации отчета. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2024-09-09T22:22:14.220683748Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GenerateUnitedOrdersRequest   {
  
  private Long businessId;
  private Date dateFrom;
  private Date dateTo;
  private List<Long> campaignIds;
  private String promoId;

  /**
   * Идентификатор бизнеса.
   */
  public GenerateUnitedOrdersRequest businessId(Long businessId) {
    this.businessId = businessId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Идентификатор бизнеса.")
  @JsonProperty("businessId")
  public Long getBusinessId() {
    return businessId;
  }
  public void setBusinessId(Long businessId) {
    this.businessId = businessId;
  }

  /**
   * Начало периода, включительно.
   */
  public GenerateUnitedOrdersRequest dateFrom(Date dateFrom) {
    this.dateFrom = dateFrom;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Начало периода, включительно.")
  @JsonProperty("dateFrom")
  public Date getDateFrom() {
    return dateFrom;
  }
  public void setDateFrom(Date dateFrom) {
    this.dateFrom = dateFrom;
  }

  /**
   * Конец периода, включительно. Максимальный период — 1 год.
   */
  public GenerateUnitedOrdersRequest dateTo(Date dateTo) {
    this.dateTo = dateTo;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Конец периода, включительно. Максимальный период — 1 год.")
  @JsonProperty("dateTo")
  public Date getDateTo() {
    return dateTo;
  }
  public void setDateTo(Date dateTo) {
    this.dateTo = dateTo;
  }

  /**
   * Список магазинов, которые нужны в отчете.
   */
  public GenerateUnitedOrdersRequest campaignIds(List<Long> campaignIds) {
    this.campaignIds = campaignIds;
    return this;
  }

  
  @ApiModelProperty(value = "Список магазинов, которые нужны в отчете.")
  @JsonProperty("campaignIds")
  public List<Long> getCampaignIds() {
    return campaignIds;
  }
  public void setCampaignIds(List<Long> campaignIds) {
    this.campaignIds = campaignIds;
  }

  /**
   * Идентификатор акции, товары из которой нужны в отчете.
   */
  public GenerateUnitedOrdersRequest promoId(String promoId) {
    this.promoId = promoId;
    return this;
  }

  
  @ApiModelProperty(value = "Идентификатор акции, товары из которой нужны в отчете.")
  @JsonProperty("promoId")
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
    return Objects.equals(businessId, generateUnitedOrdersRequest.businessId) &&
        Objects.equals(dateFrom, generateUnitedOrdersRequest.dateFrom) &&
        Objects.equals(dateTo, generateUnitedOrdersRequest.dateTo) &&
        Objects.equals(campaignIds, generateUnitedOrdersRequest.campaignIds) &&
        Objects.equals(promoId, generateUnitedOrdersRequest.promoId);
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

