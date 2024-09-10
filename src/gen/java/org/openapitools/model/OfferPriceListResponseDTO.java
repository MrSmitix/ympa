package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.OfferPriceResponseDTO;
import org.openapitools.model.ScrollingPagerDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Список цен на товары.
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "Список цен на товары.")
public class OfferPriceListResponseDTO   {
  
  private List<@Valid OfferPriceResponseDTO> offers = new ArrayList<>();

  private ScrollingPagerDTO paging;

  private Integer total;

  /**
   * Страница списка.
   **/
  public OfferPriceListResponseDTO offers(List<@Valid OfferPriceResponseDTO> offers) {
    this.offers = offers;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Страница списка.")
  @JsonProperty("offers")
  @NotNull
  public List<@Valid OfferPriceResponseDTO> getOffers() {
    return offers;
  }
  public void setOffers(List<@Valid OfferPriceResponseDTO> offers) {
    this.offers = offers;
  }

  public OfferPriceListResponseDTO addOffersItem(OfferPriceResponseDTO offersItem) {
    if (this.offers == null) {
      this.offers = new ArrayList<>();
    }
    this.offers.add(offersItem);
    return this;
  }


  /**
   **/
  public OfferPriceListResponseDTO paging(ScrollingPagerDTO paging) {
    this.paging = paging;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("paging")
  public ScrollingPagerDTO getPaging() {
    return paging;
  }
  public void setPaging(ScrollingPagerDTO paging) {
    this.paging = paging;
  }


  /**
   * Количество всех цен магазина, измененных через API.
   **/
  public OfferPriceListResponseDTO total(Integer total) {
    this.total = total;
    return this;
  }

  
  @ApiModelProperty(value = "Количество всех цен магазина, измененных через API.")
  @JsonProperty("total")
  public Integer getTotal() {
    return total;
  }
  public void setTotal(Integer total) {
    this.total = total;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

