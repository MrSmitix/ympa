package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.WarehouseOfferDTO;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Информация об остатках товаров на складе.
 **/
@ApiModel(description="Информация об остатках товаров на складе.")

public class WarehouseOffersDTO  {
  
  @ApiModelProperty(required = true, value = "Идентификатор склада.")
 /**
   * Идентификатор склада.
  **/
  private Long warehouseId;

  @ApiModelProperty(required = true, value = "Информация об остатках.")
 /**
   * Информация об остатках.
  **/
  private List<WarehouseOfferDTO> offers = new ArrayList<>();
 /**
   * Идентификатор склада.
   * @return warehouseId
  **/
  @JsonProperty("warehouseId")
  public Long getWarehouseId() {
    return warehouseId;
  }

  public void setWarehouseId(Long warehouseId) {
    this.warehouseId = warehouseId;
  }

  public WarehouseOffersDTO warehouseId(Long warehouseId) {
    this.warehouseId = warehouseId;
    return this;
  }

 /**
   * Информация об остатках.
   * @return offers
  **/
  @JsonProperty("offers")
  public List<WarehouseOfferDTO> getOffers() {
    return offers;
  }

  public void setOffers(List<WarehouseOfferDTO> offers) {
    this.offers = offers;
  }

  public WarehouseOffersDTO offers(List<WarehouseOfferDTO> offers) {
    this.offers = offers;
    return this;
  }

  public WarehouseOffersDTO addOffersItem(WarehouseOfferDTO offersItem) {
    this.offers.add(offersItem);
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
    WarehouseOffersDTO warehouseOffersDTO = (WarehouseOffersDTO) o;
    return Objects.equals(this.warehouseId, warehouseOffersDTO.warehouseId) &&
        Objects.equals(this.offers, warehouseOffersDTO.offers);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

