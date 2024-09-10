package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.FlippingPagerDTO;
import com.prokarma.pkmst.model.OfferDTO;
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
 * Список предложений с пагинатором.
 */
@ApiModel(description = "Список предложений с пагинатором.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-09-09T22:21:39.140910578Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GetOffersResponse   {
  @JsonProperty("offers")
  
  private List<OfferDTO> offers = new ArrayList<>();

  @JsonProperty("pager")
  private FlippingPagerDTO pager;

  public GetOffersResponse offers(List<OfferDTO> offers) {
    this.offers = offers;
    return this;
  }

  public GetOffersResponse addOffersItem(OfferDTO offersItem) {
    if (this.offers == null) {
      this.offers = new ArrayList<>();
    }
    this.offers.add(offersItem);
    return this;
  }

  /**
   * Список предложений магазина.
   * @return offers
   */
  @ApiModelProperty(required = true, value = "Список предложений магазина.")
  public List<OfferDTO> getOffers() {
    return offers;
  }

  public void setOffers(List<OfferDTO> offers) {
    this.offers = offers;
  }

  public GetOffersResponse pager(FlippingPagerDTO pager) {
    this.pager = pager;
    return this;
  }

  /**
   * Get pager
   * @return pager
   */
  @ApiModelProperty(value = "")
  public FlippingPagerDTO getPager() {
    return pager;
  }

  public void setPager(FlippingPagerDTO pager) {
    this.pager = pager;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
