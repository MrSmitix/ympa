package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Данные, необходимые для генерации документа. 
 */

@Schema(name = "GenerateShipmentListDocumentReportRequest", description = "Данные, необходимые для генерации документа. ")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-09T22:33:46.054383208Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GenerateShipmentListDocumentReportRequest {

  private Long campaignId;

  private Long shipmentId;

  @Valid
  private JsonNullable<List<Long>> orderIds = JsonNullable.<List<Long>>undefined();

  public GenerateShipmentListDocumentReportRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public GenerateShipmentListDocumentReportRequest(Long campaignId) {
    this.campaignId = campaignId;
  }

  public GenerateShipmentListDocumentReportRequest campaignId(Long campaignId) {
    this.campaignId = campaignId;
    return this;
  }

  /**
   * Идентификатор кампании.
   * @return campaignId
   */
  @NotNull 
  @Schema(name = "campaignId", description = "Идентификатор кампании.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("campaignId")
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
   */
  
  @Schema(name = "shipmentId", description = "Идентификатор отгрузки.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("shipmentId")
  public Long getShipmentId() {
    return shipmentId;
  }

  public void setShipmentId(Long shipmentId) {
    this.shipmentId = shipmentId;
  }

  public GenerateShipmentListDocumentReportRequest orderIds(List<Long> orderIds) {
    this.orderIds = JsonNullable.of(orderIds);
    return this;
  }

  public GenerateShipmentListDocumentReportRequest addOrderIdsItem(Long orderIdsItem) {
    if (this.orderIds == null || !this.orderIds.isPresent()) {
      this.orderIds = JsonNullable.of(new ArrayList<>());
    }
    this.orderIds.get().add(orderIdsItem);
    return this;
  }

  /**
   * Фильтр по идентификаторам заказа в отгрузке.
   * @return orderIds
   */
  
  @Schema(name = "orderIds", description = "Фильтр по идентификаторам заказа в отгрузке.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("orderIds")
  public JsonNullable<List<Long>> getOrderIds() {
    return orderIds;
  }

  public void setOrderIds(JsonNullable<List<Long>> orderIds) {
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
        equalsNullable(this.orderIds, generateShipmentListDocumentReportRequest.orderIds);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaignId, shipmentId, hashCodeNullable(orderIds));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
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

