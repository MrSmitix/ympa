package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Данные, необходимые для генерации документа. 
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GenerateShipmentListDocumentReportRequest   {
  
  private Long campaignId;
  private Long shipmentId;
  private List<Long> orderIds;

  public GenerateShipmentListDocumentReportRequest () {

  }

  public GenerateShipmentListDocumentReportRequest (Long campaignId, Long shipmentId, List<Long> orderIds) {
    this.campaignId = campaignId;
    this.shipmentId = shipmentId;
    this.orderIds = orderIds;
  }

    
  @JsonProperty("campaignId")
  public Long getCampaignId() {
    return campaignId;
  }
  public void setCampaignId(Long campaignId) {
    this.campaignId = campaignId;
  }

    
  @JsonProperty("shipmentId")
  public Long getShipmentId() {
    return shipmentId;
  }
  public void setShipmentId(Long shipmentId) {
    this.shipmentId = shipmentId;
  }

    
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
