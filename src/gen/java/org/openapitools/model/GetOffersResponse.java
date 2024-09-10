package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.FlippingPagerDTO;
import org.openapitools.model.OfferDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Список предложений с пагинатором.
 **/
@ApiModel(description = "Список предложений с пагинатором.")
@JsonTypeName("GetOffersResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-09-09T22:25:08.792192529Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GetOffersResponse   {
  private @Valid List<@Valid OfferDTO> offers = new ArrayList<>();
  private FlippingPagerDTO pager;

  /**
   * Список предложений магазина.
   **/
  public GetOffersResponse offers(List<@Valid OfferDTO> offers) {
    this.offers = offers;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Список предложений магазина.")
  @JsonProperty("offers")
  @NotNull @Valid public List<@Valid OfferDTO> getOffers() {
    return offers;
  }

  @JsonProperty("offers")
  public void setOffers(List<@Valid OfferDTO> offers) {
    this.offers = offers;
  }

  public GetOffersResponse addOffersItem(OfferDTO offersItem) {
    if (this.offers == null) {
      this.offers = new ArrayList<>();
    }

    this.offers.add(offersItem);
    return this;
  }

  public GetOffersResponse removeOffersItem(OfferDTO offersItem) {
    if (offersItem != null && this.offers != null) {
      this.offers.remove(offersItem);
    }

    return this;
  }
  /**
   **/
  public GetOffersResponse pager(FlippingPagerDTO pager) {
    this.pager = pager;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("pager")
  @Valid public FlippingPagerDTO getPager() {
    return pager;
  }

  @JsonProperty("pager")
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

