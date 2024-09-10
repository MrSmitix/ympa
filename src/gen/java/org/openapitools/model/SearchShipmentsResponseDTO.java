package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ForwardScrollingPagerDTO;
import org.openapitools.model.ShipmentInfoDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Информация об отгрузках.
 **/
@ApiModel(description = "Информация об отгрузках.")
@JsonTypeName("SearchShipmentsResponseDTO")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-09-09T22:25:08.792192529Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class SearchShipmentsResponseDTO   {
  private @Valid List<@Valid ShipmentInfoDTO> shipments = new ArrayList<>();
  private ForwardScrollingPagerDTO paging;

  /**
   * Список с информацией об отгрузках.
   **/
  public SearchShipmentsResponseDTO shipments(List<@Valid ShipmentInfoDTO> shipments) {
    this.shipments = shipments;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Список с информацией об отгрузках.")
  @JsonProperty("shipments")
  @NotNull @Valid public List<@Valid ShipmentInfoDTO> getShipments() {
    return shipments;
  }

  @JsonProperty("shipments")
  public void setShipments(List<@Valid ShipmentInfoDTO> shipments) {
    this.shipments = shipments;
  }

  public SearchShipmentsResponseDTO addShipmentsItem(ShipmentInfoDTO shipmentsItem) {
    if (this.shipments == null) {
      this.shipments = new ArrayList<>();
    }

    this.shipments.add(shipmentsItem);
    return this;
  }

  public SearchShipmentsResponseDTO removeShipmentsItem(ShipmentInfoDTO shipmentsItem) {
    if (shipmentsItem != null && this.shipments != null) {
      this.shipments.remove(shipmentsItem);
    }

    return this;
  }
  /**
   **/
  public SearchShipmentsResponseDTO paging(ForwardScrollingPagerDTO paging) {
    this.paging = paging;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("paging")
  @Valid public ForwardScrollingPagerDTO getPaging() {
    return paging;
  }

  @JsonProperty("paging")
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

