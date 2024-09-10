package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.ForwardScrollingPagerDTO;
import com.prokarma.pkmst.model.ShipmentInfoDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Информация об отгрузках.
 */
@ApiModel(description = "Информация об отгрузках.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-09-09T22:21:39.140910578Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class SearchShipmentsResponseDTO   {
  @JsonProperty("shipments")
  
  private List<ShipmentInfoDTO> shipments = new ArrayList<>();

  @JsonProperty("paging")
  private ForwardScrollingPagerDTO paging;

  public SearchShipmentsResponseDTO shipments(List<ShipmentInfoDTO> shipments) {
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
  @ApiModelProperty(required = true, value = "Список с информацией об отгрузках.")
  public List<ShipmentInfoDTO> getShipments() {
    return shipments;
  }

  public void setShipments(List<ShipmentInfoDTO> shipments) {
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
  @ApiModelProperty(value = "")
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

