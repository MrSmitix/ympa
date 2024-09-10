package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ForwardScrollingPagerDTO;
import org.openapitools.model.ShipmentInfoDTO;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Информация об отгрузках.
 */

@Schema(name = "SearchShipmentsResponseDTO", description = "Информация об отгрузках.")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-09-09T22:19:44.552145407Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class SearchShipmentsResponseDTO {

  @Valid
  private List<@Valid ShipmentInfoDTO> shipments = new ArrayList<>();

  private ForwardScrollingPagerDTO paging;

  public SearchShipmentsResponseDTO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public SearchShipmentsResponseDTO(List<@Valid ShipmentInfoDTO> shipments) {
    this.shipments = shipments;
  }

  public SearchShipmentsResponseDTO shipments(List<@Valid ShipmentInfoDTO> shipments) {
    this.shipments = shipments;
    return this;
  }

  public SearchShipmentsResponseDTO addShipmentsItem(ShipmentInfoDTO shipmentsItem) {
    if (this.shipments == null) {
      this.shipments = new ArrayList<>();
    }
    this.shipments.add(shipmentsItem);
    return this;
  }

  /**
   * Список с информацией об отгрузках.
   * @return shipments
   */
  @NotNull @Valid 
  @Schema(name = "shipments", description = "Список с информацией об отгрузках.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("shipments")
  public List<@Valid ShipmentInfoDTO> getShipments() {
    return shipments;
  }

  public void setShipments(List<@Valid ShipmentInfoDTO> shipments) {
    this.shipments = shipments;
  }

  public SearchShipmentsResponseDTO paging(ForwardScrollingPagerDTO paging) {
    this.paging = paging;
    return this;
  }

  /**
   * Get paging
   * @return paging
   */
  @Valid 
  @Schema(name = "paging", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("paging")
  public ForwardScrollingPagerDTO getPaging() {
    return paging;
  }

  public void setPaging(ForwardScrollingPagerDTO paging) {
    this.paging = paging;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchShipmentsResponseDTO searchShipmentsResponseDTO = (SearchShipmentsResponseDTO) o;
    return Objects.equals(this.shipments, searchShipmentsResponseDTO.shipments) &&
        Objects.equals(this.paging, searchShipmentsResponseDTO.paging);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shipments, paging);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchShipmentsResponseDTO {\n");
    sb.append("    shipments: ").append(toIndentedString(shipments)).append("\n");
    sb.append("    paging: ").append(toIndentedString(paging)).append("\n");
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

