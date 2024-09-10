package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.OfferPriceByOfferIdsResponseDTO;
import org.openapitools.model.ScrollingPagerDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Список цен.
 */
@ApiModel(description="Список цен.")

public class OfferPriceByOfferIdsListResponseDTO  {
  
 /**
  * Страница списка цен.
  */
  @ApiModelProperty(required = true, value = "Страница списка цен.")
  @Valid
  private List<@Valid OfferPriceByOfferIdsResponseDTO> offers = new ArrayList<>();

  @ApiModelProperty(value = "")
  @Valid
  private ScrollingPagerDTO paging;
 /**
  * Страница списка цен.
  * @return offers
  */
  @JsonProperty("offers")
  @NotNull
  public List<@Valid OfferPriceByOfferIdsResponseDTO> getOffers() {
    return offers;
  }

  /**
   * Sets the <code>offers</code> property.
   */
 public void setOffers(List<@Valid OfferPriceByOfferIdsResponseDTO> offers) {
    this.offers = offers;
  }

  /**
   * Sets the <code>offers</code> property.
   */
  public OfferPriceByOfferIdsListResponseDTO offers(List<@Valid OfferPriceByOfferIdsResponseDTO> offers) {
    this.offers = offers;
    return this;
  }

  /**
   * Adds a new item to the <code>offers</code> list.
   */
  public OfferPriceByOfferIdsListResponseDTO addOffersItem(OfferPriceByOfferIdsResponseDTO offersItem) {
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
  public OfferPriceByOfferIdsListResponseDTO paging(ScrollingPagerDTO paging) {
    this.paging = paging;
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
    OfferPriceByOfferIdsListResponseDTO offerPriceByOfferIdsListResponseDTO = (OfferPriceByOfferIdsListResponseDTO) o;
    return Objects.equals(this.offers, offerPriceByOfferIdsListResponseDTO.offers) &&
        Objects.equals(this.paging, offerPriceByOfferIdsListResponseDTO.paging);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offers, paging);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfferPriceByOfferIdsListResponseDTO {\n");
    
    sb.append("    offers: ").append(toIndentedString(offers)).append("\n");
    sb.append("    paging: ").append(toIndentedString(paging)).append("\n");
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

