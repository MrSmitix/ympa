package apimodels;

import apimodels.ForwardScrollingPagerDTO;
import apimodels.ShipmentInfoDTO;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Информация об отгрузках.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class SearchShipmentsResponseDTO   {
  @JsonProperty("shipments")
  @NotNull
@Valid

  private List<@Valid ShipmentInfoDTO> shipments = new ArrayList<>();

  @JsonProperty("paging")
  @Valid

  private ForwardScrollingPagerDTO paging;

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
  **/
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
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

