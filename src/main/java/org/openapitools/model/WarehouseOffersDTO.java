package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.WarehouseOfferDTO;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Информация об остатках товаров на складе.
 */

@Schema(name = "WarehouseOffersDTO", description = "Информация об остатках товаров на складе.")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-09-09T22:19:44.552145407Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class WarehouseOffersDTO {

  private Long warehouseId;

  @Valid
  private List<@Valid WarehouseOfferDTO> offers = new ArrayList<>();

  public WarehouseOffersDTO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public WarehouseOffersDTO(Long warehouseId, List<@Valid WarehouseOfferDTO> offers) {
    this.warehouseId = warehouseId;
    this.offers = offers;
  }

  public WarehouseOffersDTO warehouseId(Long warehouseId) {
    this.warehouseId = warehouseId;
    return this;
  }

  /**
   * Идентификатор склада.
   * @return warehouseId
   */
  @NotNull 
  @Schema(name = "warehouseId", description = "Идентификатор склада.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("warehouseId")
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
   */
  @NotNull @Valid 
  @Schema(name = "offers", description = "Информация об остатках.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("offers")
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

