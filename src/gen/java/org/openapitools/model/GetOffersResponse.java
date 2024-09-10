package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.FlippingPagerDTO;
import org.openapitools.model.OfferDTO;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Список предложений с пагинатором.
 **/
@ApiModel(description="Список предложений с пагинатором.")

public class GetOffersResponse  {
  
  @ApiModelProperty(required = true, value = "Список предложений магазина.")
 /**
   * Список предложений магазина.
  **/
  private List<OfferDTO> offers = new ArrayList<>();

  @ApiModelProperty(value = "")
  private FlippingPagerDTO pager;
 /**
   * Список предложений магазина.
   * @return offers
  **/
  @JsonProperty("offers")
  public List<OfferDTO> getOffers() {
    return offers;
  }

  public void setOffers(List<OfferDTO> offers) {
    this.offers = offers;
  }

  public GetOffersResponse offers(List<OfferDTO> offers) {
    this.offers = offers;
    return this;
  }

  public GetOffersResponse addOffersItem(OfferDTO offersItem) {
    this.offers.add(offersItem);
    return this;
  }

 /**
   * Get pager
   * @return pager
  **/
  @JsonProperty("pager")
  public FlippingPagerDTO getPager() {
    return pager;
  }

  public void setPager(FlippingPagerDTO pager) {
    this.pager = pager;
  }

  public GetOffersResponse pager(FlippingPagerDTO pager) {
    this.pager = pager;
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
    GetOffersResponse getOffersResponse = (GetOffersResponse) o;
    return Objects.equals(this.offers, getOffersResponse.offers) &&
        Objects.equals(this.pager, getOffersResponse.pager);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offers, pager);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetOffersResponse {\n");
    
    sb.append("    offers: ").append(toIndentedString(offers)).append("\n");
    sb.append("    pager: ").append(toIndentedString(pager)).append("\n");
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

