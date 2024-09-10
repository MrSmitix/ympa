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
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Данные, необходимые для генерации документа. 
 */
@ApiModel(description = "Данные, необходимые для генерации документа. ")
@JsonPropertyOrder({
  GenerateShipmentListDocumentReportRequest.JSON_PROPERTY_CAMPAIGN_ID,
  GenerateShipmentListDocumentReportRequest.JSON_PROPERTY_SHIPMENT_ID,
  GenerateShipmentListDocumentReportRequest.JSON_PROPERTY_ORDER_IDS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2024-09-09T22:24:17.175492804Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GenerateShipmentListDocumentReportRequest   {
  public static final String JSON_PROPERTY_CAMPAIGN_ID = "campaignId";
  @JsonProperty(JSON_PROPERTY_CAMPAIGN_ID)
  private Long campaignId;

  public static final String JSON_PROPERTY_SHIPMENT_ID = "shipmentId";
  @JsonProperty(JSON_PROPERTY_SHIPMENT_ID)
  private Long shipmentId;

  public static final String JSON_PROPERTY_ORDER_IDS = "orderIds";
  @JsonProperty(JSON_PROPERTY_ORDER_IDS)
  private List<Long> orderIds;

  public GenerateShipmentListDocumentReportRequest campaignId(Long campaignId) {
    this.campaignId = campaignId;
    return this;
  }

  /**
   * Идентификатор кампании.
   * @return campaignId
   **/
  @JsonProperty(value = "campaignId")
  @ApiModelProperty(required = true, value = "Идентификатор кампании.")
  @NotNull 
  public Long getCampaignId() {
    return campaignId;
  }

  public void setCampaignId(Long campaignId) {
    this.campaignId = campaignId;
  }

  public GenerateShipmentListDocumentReportRequest shipmentId(Long shipmentId) {
    this.shipmentId = shipmentId;
    return this;
  }

  /**
   * Идентификатор отгрузки.
   * @return shipmentId
   **/
  @JsonProperty(value = "shipmentId")
  @ApiModelProperty(value = "Идентификатор отгрузки.")
  
  public Long getShipmentId() {
    return shipmentId;
  }

  public void setShipmentId(Long shipmentId) {
    this.shipmentId = shipmentId;
  }

  public GenerateShipmentListDocumentReportRequest orderIds(List<Long> orderIds) {
    this.orderIds = orderIds;
    return this;
  }

  public GenerateShipmentListDocumentReportRequest addOrderIdsItem(Long orderIdsItem) {
    if (this.orderIds == null) {
      this.orderIds = new ArrayList<>();
    }
    this.orderIds.add(orderIdsItem);
    return this;
  }

  /**
   * Фильтр по идентификаторам заказа в отгрузке.
   * @return orderIds
   **/
  @JsonProperty(value = "orderIds")
  @ApiModelProperty(value = "Фильтр по идентификаторам заказа в отгрузке.")
  
  public List<Long> getOrderIds() {
    return orderIds;
  }

  public void setOrderIds(List<Long> orderIds) {
    this.orderIds = orderIds;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GenerateShipmentListDocumentReportRequest generateShipmentListDocumentReportRequest = (GenerateShipmentListDocumentReportRequest) o;
    return Objects.equals(this.campaignId, generateShipmentListDocumentReportRequest.campaignId) &&
        Objects.equals(this.shipmentId, generateShipmentListDocumentReportRequest.shipmentId) &&
        Objects.equals(this.orderIds, generateShipmentListDocumentReportRequest.orderIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaignId, shipmentId, orderIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GenerateShipmentListDocumentReportRequest {\n");
    
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    shipmentId: ").append(toIndentedString(shipmentId)).append("\n");
    sb.append("    orderIds: ").append(toIndentedString(orderIds)).append("\n");
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

