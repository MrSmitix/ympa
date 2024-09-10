package apimodels;

import apimodels.WarehouseOfferDTO;
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
 * Информация об остатках товаров на складе.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class WarehouseOffersDTO   {
  @JsonProperty("warehouseId")
  @NotNull

  private Long warehouseId;

  @JsonProperty("offers")
  @NotNull
@Valid

  private List<@Valid WarehouseOfferDTO> offers = new ArrayList<>();

  public WarehouseOffersDTO warehouseId(Long warehouseId) {
    this.warehouseId = warehouseId;
    return this;
  }

   /**
   * Идентификатор склада.
   * @return warehouseId
  **/
  public Long getWarehouseId() {
    return warehouseId;
  }

  public void setWarehouseId(Long warehouseId) {
    this.warehouseId = warehouseId;
  }

  public WarehouseOffersDTO offers(List<@Valid WarehouseOfferDTO> offers) {
    this.offers = offers;
    return this;
  }

  public WarehouseOffersDTO addOffersItem(WarehouseOfferDTO offersItem) {
    if (this.offers == null) {
      this.offers = new ArrayList<>();
    }
    this.offers.add(offersItem);
    return this;
  }

   /**
   * Информация об остатках.
   * @return offers
  **/
  public List<@Valid WarehouseOfferDTO> getOffers() {
    return offers;
  }

  public void setOffers(List<@Valid WarehouseOfferDTO> offers) {
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

