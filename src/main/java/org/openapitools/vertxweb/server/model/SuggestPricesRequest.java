package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.SuggestOfferPriceDTO;

/**
 * Запрос на получение списка цен для продвижения.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SuggestPricesRequest   {
  
  private List<SuggestOfferPriceDTO> offers = new ArrayList<>();

  public SuggestPricesRequest () {

  }

  public SuggestPricesRequest (List<SuggestOfferPriceDTO> offers) {
    this.offers = offers;
  }

    
  @JsonProperty("offers")
  public List<SuggestOfferPriceDTO> getOffers() {
    return offers;
  }
  public void setOffers(List<SuggestOfferPriceDTO> offers) {
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
    SuggestPricesRequest suggestPricesRequest = (SuggestPricesRequest) o;
    return Objects.equals(offers, suggestPricesRequest.offers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SuggestPricesRequest {\n");
    
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
