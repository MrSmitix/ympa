package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.OfferDTO;

/**
 * Список предложений.
 */
@ApiModel(description = "Список предложений.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2024-09-09T22:21:22.142726883Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GetAllOffersResponse   {
  @JsonProperty("offers")
  private List<@Valid OfferDTO> offers = new ArrayList<>();

  public GetAllOffersResponse offers(List<@Valid OfferDTO> offers) {
    this.offers = offers;
    return this;
  }

  public GetAllOffersResponse addOffersItem(OfferDTO offersItem) {
    this.offers.add(offersItem);
    return this;
  }

   /**
   * Список предложений магазина.
   * @return offers
  **/
  @ApiModelProperty(required = true, value = "Список предложений магазина.")
  public List<@Valid OfferDTO> getOffers() {
    return offers;
  }

  public void setOffers(List<@Valid OfferDTO> offers) {
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
    GetAllOffersResponse getAllOffersResponse = (GetAllOffersResponse) o;
    return Objects.equals(this.offers, getAllOffersResponse.offers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetAllOffersResponse {\n");
    
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

