package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.api.model.ForwardScrollingPagerDTO;
import org.openapitools.server.api.model.ShipmentInfoDTO;

/**
 * Информация об отгрузках.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SearchShipmentsResponseDTO   {
  
  private List<ShipmentInfoDTO> shipments = new ArrayList<>();
  private ForwardScrollingPagerDTO paging;

  public SearchShipmentsResponseDTO () {

  }

  public SearchShipmentsResponseDTO (List<ShipmentInfoDTO> shipments, ForwardScrollingPagerDTO paging) {
    this.shipments = shipments;
    this.paging = paging;
  }

    
  @JsonProperty("shipments")
  public List<ShipmentInfoDTO> getShipments() {
    return shipments;
  }
  public void setShipments(List<ShipmentInfoDTO> shipments) {
    this.shipments = shipments;
  }

    
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
    return Objects.equals(shipments, searchShipmentsResponseDTO.shipments) &&
        Objects.equals(paging, searchShipmentsResponseDTO.paging);
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
