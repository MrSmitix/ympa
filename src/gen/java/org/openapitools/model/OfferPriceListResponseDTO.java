package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.OfferPriceResponseDTO;
import org.openapitools.model.ScrollingPagerDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Список цен на товары.
 */
@ApiModel(description="Список цен на товары.")

public class OfferPriceListResponseDTO  {
  
 /**
  * Страница списка.
  */
  @ApiModelProperty(required = true, value = "Страница списка.")
  @Valid
  private List<@Valid OfferPriceResponseDTO> offers = new ArrayList<>();

  @ApiModelProperty(value = "")
  @Valid
  private ScrollingPagerDTO paging;

 /**
  * Количество всех цен магазина, измененных через API.
  */
  @ApiModelProperty(value = "Количество всех цен магазина, измененных через API.")
  private Integer total;
 /**
  * Страница списка.
  * @return offers
  */
  @JsonProperty("offers")
  @NotNull
  public List<@Valid OfferPriceResponseDTO> getOffers() {
    return offers;
  }

  /**
   * Sets the <code>offers</code> property.
   */
 public void setOffers(List<@Valid OfferPriceResponseDTO> offers) {
    this.offers = offers;
  }

  /**
   * Sets the <code>offers</code> property.
   */
  public OfferPriceListResponseDTO offers(List<@Valid OfferPriceResponseDTO> offers) {
    this.offers = offers;
    return this;
  }

  /**
   * Adds a new item to the <code>offers</code> list.
   */
  public OfferPriceListResponseDTO addOffersItem(OfferPriceResponseDTO offersItem) {
    this.offers.add(offersItem);
    return this;
  }

 /**
  * Get paging
  * @return paging
  */
  @JsonProperty("paging")
  public ScrollingPagerDTO getPaging() {
    return paging;
  }

  /**
   * Sets the <code>paging</code> property.
   */
 public void setPaging(ScrollingPagerDTO paging) {
    this.paging = paging;
  }

  /**
   * Sets the <code>paging</code> property.
   */
  public OfferPriceListResponseDTO paging(ScrollingPagerDTO paging) {
    this.paging = paging;
    return this;
  }

 /**
  * Количество всех цен магазина, измененных через API.
  * @return total
  */
  @JsonProperty("total")
  public Integer getTotal() {
    return total;
  }

  /**
   * Sets the <code>total</code> property.
   */
 public void setTotal(Integer total) {
    this.total = total;
  }

  /**
   * Sets the <code>total</code> property.
   */
  public OfferPriceListResponseDTO total(Integer total) {
    this.total = total;
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
    OfferPriceListResponseDTO offerPriceListResponseDTO = (OfferPriceListResponseDTO) o;
    return Objects.equals(this.offers, offerPriceListResponseDTO.offers) &&
        Objects.equals(this.paging, offerPriceListResponseDTO.paging) &&
        Objects.equals(this.total, offerPriceListResponseDTO.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offers, paging, total);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfferPriceListResponseDTO {\n");
    
    sb.append("    offers: ").append(toIndentedString(offers)).append("\n");
    sb.append("    paging: ").append(toIndentedString(paging)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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

