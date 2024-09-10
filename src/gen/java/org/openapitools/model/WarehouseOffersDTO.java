package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.WarehouseOfferDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Информация об остатках товаров на складе.
 */
@ApiModel(description="Информация об остатках товаров на складе.")

public class WarehouseOffersDTO  {
  
 /**
  * Идентификатор склада.
  */
  @ApiModelProperty(required = true, value = "Идентификатор склада.")
  private Long warehouseId;

 /**
  * Информация об остатках.
  */
  @ApiModelProperty(required = true, value = "Информация об остатках.")
  @Valid
  private List<@Valid WarehouseOfferDTO> offers = new ArrayList<>();
 /**
  * Идентификатор склада.
  * @return warehouseId
  */
  @JsonProperty("warehouseId")
  @NotNull
  public Long getWarehouseId() {
    return warehouseId;
  }

  /**
   * Sets the <code>warehouseId</code> property.
   */
 public void setWarehouseId(Long warehouseId) {
    this.warehouseId = warehouseId;
  }

  /**
   * Sets the <code>warehouseId</code> property.
   */
  public WarehouseOffersDTO warehouseId(Long warehouseId) {
    this.warehouseId = warehouseId;
    return this;
  }

 /**
  * Информация об остатках.
  * @return offers
  */
  @JsonProperty("offers")
  @NotNull
  public List<@Valid WarehouseOfferDTO> getOffers() {
    return offers;
  }

  /**
   * Sets the <code>offers</code> property.
   */
 public void setOffers(List<@Valid WarehouseOfferDTO> offers) {
    this.offers = offers;
  }

  /**
   * Sets the <code>offers</code> property.
   */
  public WarehouseOffersDTO offers(List<@Valid WarehouseOfferDTO> offers) {
    this.offers = offers;
    return this;
  }

  /**
   * Adds a new item to the <code>offers</code> list.
   */
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

