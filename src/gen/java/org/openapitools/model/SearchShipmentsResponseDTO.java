package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ForwardScrollingPagerDTO;
import org.openapitools.model.ShipmentInfoDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Информация об отгрузках.
 **/
@ApiModel(description="Информация об отгрузках.")

public class SearchShipmentsResponseDTO  {
  
  @ApiModelProperty(required = true, value = "Список с информацией об отгрузках.")
  @Valid
 /**
   * Список с информацией об отгрузках.
  **/
  private List<@Valid ShipmentInfoDTO> shipments = new ArrayList<>();

  @ApiModelProperty(value = "")
  @Valid
  private ForwardScrollingPagerDTO paging;
 /**
   * Список с информацией об отгрузках.
   * @return shipments
  **/
  @JsonProperty("shipments")
  @NotNull
  public List<@Valid ShipmentInfoDTO> getShipments() {
    return shipments;
  }

  public void setShipments(List<@Valid ShipmentInfoDTO> shipments) {
    this.shipments = shipments;
  }

  public SearchShipmentsResponseDTO shipments(List<@Valid ShipmentInfoDTO> shipments) {
    this.shipments = shipments;
    return this;
  }

  public SearchShipmentsResponseDTO addShipmentsItem(ShipmentInfoDTO shipmentsItem) {
    this.shipments.add(shipmentsItem);
    return this;
  }

 /**
   * Get paging
   * @return paging
  **/
  @JsonProperty("paging")
  public ForwardScrollingPagerDTO getPaging() {
    return paging;
  }

  public void setPaging(ForwardScrollingPagerDTO paging) {
    this.paging = paging;
  }

  public SearchShipmentsResponseDTO paging(ForwardScrollingPagerDTO paging) {
    this.paging = paging;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

