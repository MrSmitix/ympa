package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.OfferPriceByOfferIdsResponseDTO;
import org.openapitools.model.ScrollingPagerDTO;



/**
 * Список цен.
 **/

@ApiModel(description = "Список цен.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-09-09T22:20:23.877037640Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class OfferPriceByOfferIdsListResponseDTO   {
  @JsonProperty("offers")
  private List<OfferPriceByOfferIdsResponseDTO> offers = new ArrayList<>();

  @JsonProperty("paging")
  private ScrollingPagerDTO paging;

  /**
   * Страница списка цен.
   **/
  public OfferPriceByOfferIdsListResponseDTO offers(List<OfferPriceByOfferIdsResponseDTO> offers) {
    this.offers = offers;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Страница списка цен.")
  @JsonProperty("offers")
  public List<OfferPriceByOfferIdsResponseDTO> getOffers() {
    return offers;
  }
  public void setOffers(List<OfferPriceByOfferIdsResponseDTO> offers) {
    this.offers = offers;
  }

  /**
   **/
  public OfferPriceByOfferIdsListResponseDTO paging(ScrollingPagerDTO paging) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OfferPriceByOfferIdsListResponseDTO offerPriceByOfferIdsListResponseDTO = (OfferPriceByOfferIdsListResponseDTO) o;
    return Objects.equals(offers, offerPriceByOfferIdsListResponseDTO.offers) &&
        Objects.equals(paging, offerPriceByOfferIdsListResponseDTO.paging);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

