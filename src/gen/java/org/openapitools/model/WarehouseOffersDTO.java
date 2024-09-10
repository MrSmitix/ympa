package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.WarehouseOfferDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Информация об остатках товаров на складе.
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "Информация об остатках товаров на складе.")
public class WarehouseOffersDTO   {
  
  private Long warehouseId;

  private List<@Valid WarehouseOfferDTO> offers = new ArrayList<>();

  /**
   * Идентификатор склада.
   **/
  public WarehouseOffersDTO warehouseId(Long warehouseId) {
    this.warehouseId = warehouseId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Идентификатор склада.")
  @JsonProperty("warehouseId")
  @NotNull
  public Long getWarehouseId() {
    return warehouseId;
  }
  public void setWarehouseId(Long warehouseId) {
    this.warehouseId = warehouseId;
  }


  /**
   * Информация об остатках.
   **/
  public WarehouseOffersDTO offers(List<@Valid WarehouseOfferDTO> offers) {
    this.offers = offers;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Информация об остатках.")
  @JsonProperty("offers")
  @NotNull
  public List<@Valid WarehouseOfferDTO> getOffers() {
    return offers;
  }
  public void setOffers(List<@Valid WarehouseOfferDTO> offers) {
    this.offers = offers;
  }

  public WarehouseOffersDTO addOffersItem(WarehouseOfferDTO offersItem) {
    if (this.offers == null) {
      this.offers = new ArrayList<>();
    }
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

