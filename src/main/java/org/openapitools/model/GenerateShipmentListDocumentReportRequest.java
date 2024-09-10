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
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;



/**
 * Данные, необходимые для генерации документа. 
 */

@ApiModel(description = "Данные, необходимые для генерации документа. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2024-09-09T22:22:14.220683748Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GenerateShipmentListDocumentReportRequest   {
  
  private Long campaignId;
  private Long shipmentId;
  private List<Long> orderIds;

  /**
   * Идентификатор кампании.
   */
  public GenerateShipmentListDocumentReportRequest campaignId(Long campaignId) {
    this.campaignId = campaignId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Идентификатор кампании.")
  @JsonProperty("campaignId")
  public Long getCampaignId() {
    return campaignId;
  }
  public void setCampaignId(Long campaignId) {
    this.campaignId = campaignId;
  }

  /**
   * Идентификатор отгрузки.
   */
  public GenerateShipmentListDocumentReportRequest shipmentId(Long shipmentId) {
    this.shipmentId = shipmentId;
    return this;
  }

  
  @ApiModelProperty(value = "Идентификатор отгрузки.")
  @JsonProperty("shipmentId")
  public Long getShipmentId() {
    return shipmentId;
  }
  public void setShipmentId(Long shipmentId) {
    this.shipmentId = shipmentId;
  }

  /**
   * Фильтр по идентификаторам заказа в отгрузке.
   */
  public GenerateShipmentListDocumentReportRequest orderIds(List<Long> orderIds) {
    this.orderIds = orderIds;
    return this;
  }

  
  @ApiModelProperty(value = "Фильтр по идентификаторам заказа в отгрузке.")
  @JsonProperty("orderIds")
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
    return Objects.equals(campaignId, generateShipmentListDocumentReportRequest.campaignId) &&
        Objects.equals(shipmentId, generateShipmentListDocumentReportRequest.shipmentId) &&
        Objects.equals(orderIds, generateShipmentListDocumentReportRequest.orderIds);
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

