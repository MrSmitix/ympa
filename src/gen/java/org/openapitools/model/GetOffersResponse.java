package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.FlippingPagerDTO;
import org.openapitools.model.OfferDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Список предложений с пагинатором.
 */
@ApiModel(description="Список предложений с пагинатором.")

public class GetOffersResponse  {
  
 /**
  * Список предложений магазина.
  */
  @ApiModelProperty(required = true, value = "Список предложений магазина.")
  @Valid
  private List<@Valid OfferDTO> offers = new ArrayList<>();

  @ApiModelProperty(value = "")
  @Valid
  private FlippingPagerDTO pager;
 /**
  * Список предложений магазина.
  * @return offers
  */
  @JsonProperty("offers")
  @NotNull
  public List<@Valid OfferDTO> getOffers() {
    return offers;
  }

  /**
   * Sets the <code>offers</code> property.
   */
 public void setOffers(List<@Valid OfferDTO> offers) {
    this.offers = offers;
  }

  /**
   * Sets the <code>offers</code> property.
   */
  public GetOffersResponse offers(List<@Valid OfferDTO> offers) {
    this.offers = offers;
    return this;
  }

  /**
   * Adds a new item to the <code>offers</code> list.
   */
  public GetOffersResponse addOffersItem(OfferDTO offersItem) {
    this.offers.add(offersItem);
    return this;
  }

 /**
  * Get pager
  * @return pager
  */
  @JsonProperty("pager")
  public FlippingPagerDTO getPager() {
    return pager;
  }

  /**
   * Sets the <code>pager</code> property.
   */
 public void setPager(FlippingPagerDTO pager) {
    this.pager = pager;
  }

  /**
   * Sets the <code>pager</code> property.
   */
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

