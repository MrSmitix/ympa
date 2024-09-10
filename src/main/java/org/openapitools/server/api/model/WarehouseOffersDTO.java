package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.api.model.WarehouseOfferDTO;

/**
 * Информация об остатках товаров на складе.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class WarehouseOffersDTO   {
  
  private Long warehouseId;
  private List<WarehouseOfferDTO> offers = new ArrayList<>();

  public WarehouseOffersDTO () {

  }

  public WarehouseOffersDTO (Long warehouseId, List<WarehouseOfferDTO> offers) {
    this.warehouseId = warehouseId;
    this.offers = offers;
  }

    
  @JsonProperty("warehouseId")
  public Long getWarehouseId() {
    return warehouseId;
  }
  public void setWarehouseId(Long warehouseId) {
    this.warehouseId = warehouseId;
  }

    
  @JsonProperty("offers")
  public List<WarehouseOfferDTO> getOffers() {
    return offers;
  }
  public void setOffers(List<WarehouseOfferDTO> offers) {
    this.offers = offers;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WarehouseOffersDTO warehouseOffersDTO = (WarehouseOffersDTO) o;
    return Objects.equals(warehouseId, warehouseOffersDTO.warehouseId) &&
        Objects.equals(offers, warehouseOffersDTO.offers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(warehouseId, offers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WarehouseOffersDTO {\n");
    
    sb.append("    warehouseId: ").append(toIndentedString(warehouseId)).append("\n");
    sb.append("    offers: ").append(toIndentedString(offers)).append("\n");
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
