package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Данные, необходимые для генерации документа. 
 */
@ApiModel(description="Данные, необходимые для генерации документа. ")

public class GenerateShipmentListDocumentReportRequest  {
  
 /**
  * Идентификатор кампании.
  */
  @ApiModelProperty(required = true, value = "Идентификатор кампании.")
  private Long campaignId;

 /**
  * Идентификатор отгрузки.
  */
  @ApiModelProperty(value = "Идентификатор отгрузки.")
  private Long shipmentId;

 /**
  * Фильтр по идентификаторам заказа в отгрузке.
  */
  @ApiModelProperty(value = "Фильтр по идентификаторам заказа в отгрузке.")
  private List<Long> orderIds;
 /**
  * Идентификатор кампании.
  * @return campaignId
  */
  @JsonProperty("campaignId")
  @NotNull
  public Long getCampaignId() {
    return campaignId;
  }

  /**
   * Sets the <code>campaignId</code> property.
   */
 public void setCampaignId(Long campaignId) {
    this.campaignId = campaignId;
  }

  /**
   * Sets the <code>campaignId</code> property.
   */
  public GenerateShipmentListDocumentReportRequest campaignId(Long campaignId) {
    this.campaignId = campaignId;
    return this;
  }

 /**
  * Идентификатор отгрузки.
  * @return shipmentId
  */
  @JsonProperty("shipmentId")
  public Long getShipmentId() {
    return shipmentId;
  }

  /**
   * Sets the <code>shipmentId</code> property.
   */
 public void setShipmentId(Long shipmentId) {
    this.shipmentId = shipmentId;
  }

  /**
   * Sets the <code>shipmentId</code> property.
   */
  public GenerateShipmentListDocumentReportRequest shipmentId(Long shipmentId) {
    this.shipmentId = shipmentId;
    return this;
  }

 /**
  * Фильтр по идентификаторам заказа в отгрузке.
  * @return orderIds
  */
  @JsonProperty("orderIds")
  public List<Long> getOrderIds() {
    return orderIds;
  }

  /**
   * Sets the <code>orderIds</code> property.
   */
 public void setOrderIds(List<Long> orderIds) {
    this.orderIds = orderIds;
  }

  /**
   * Sets the <code>orderIds</code> property.
   */
  public GenerateShipmentListDocumentReportRequest orderIds(List<Long> orderIds) {
    this.orderIds = orderIds;
    return this;
  }

  /**
   * Adds a new item to the <code>orderIds</code> list.
   */
  public GenerateShipmentListDocumentReportRequest addOrderIdsItem(Long orderIdsItem) {
    this.orderIds.add(orderIdsItem);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

