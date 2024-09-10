package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.OfferPriceResponseDTO;
import com.prokarma.pkmst.model.ScrollingPagerDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Список цен на товары.
 */
@ApiModel(description = "Список цен на товары.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-09-09T22:21:39.140910578Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class OfferPriceListResponseDTO   {
  @JsonProperty("offers")
  
  private List<OfferPriceResponseDTO> offers = new ArrayList<>();

  @JsonProperty("paging")
  private ScrollingPagerDTO paging;

  @JsonProperty("total")
  private Integer total;

  public OfferPriceListResponseDTO offers(List<OfferPriceResponseDTO> offers) {
    this.offers = offers;
    return this;
  }

  public OfferPriceListResponseDTO addOffersItem(OfferPriceResponseDTO offersItem) {
    if (this.offers == null) {
      this.offers = new ArrayList<>();
    }
    this.offers.add(offersItem);
    return this;
  }

  /**
   * Страница списка.
   * @return offers
   */
  @ApiModelProperty(required = true, value = "Страница списка.")
  public List<OfferPriceResponseDTO> getOffers() {
    return offers;
  }

  public void setOffers(List<OfferPriceResponseDTO> offers) {
    this.offers = offers;
  }

  public OfferPriceListResponseDTO paging(ScrollingPagerDTO paging) {
    this.paging = paging;
    return this;
  }

  /**
   * Get paging
   * @return paging
   */
  @ApiModelProperty(value = "")
  public ScrollingPagerDTO getPaging() {
    return paging;
  }

  public void setPaging(ScrollingPagerDTO paging) {
    this.paging = paging;
  }

  public OfferPriceListResponseDTO total(Integer total) {
    this.total = total;
    return this;
  }

  /**
   * Количество всех цен магазина, измененных через API.
   * @return total
   */
  @ApiModelProperty(value = "Количество всех цен магазина, измененных через API.")
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

