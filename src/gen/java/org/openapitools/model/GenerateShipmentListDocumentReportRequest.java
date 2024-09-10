package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@ApiModel(description="Данные, необходимые для генерации документа. ")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2024-09-09T22:24:34.340132557Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GenerateShipmentListDocumentReportRequest   {
  
  private Long campaignId;
  private Long shipmentId;
  private List<Long> orderIds;

  /**
   * Идентификатор кампании.
   **/
  
  @ApiModelProperty(required = true, value = "Идентификатор кампании.")
  @JsonProperty("campaignId")
  @NotNull
  public Long getCampaignId() {
    return campaignId;
  }
  public void setCampaignId(Long campaignId) {
    this.campaignId = campaignId;
  }

  /**
   * Идентификатор отгрузки.
   **/
  
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
   **/
  
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

