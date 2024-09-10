package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ForwardScrollingPagerDTO;
import org.openapitools.model.GetPromoOfferDTO;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Список товаров, которые участвуют или могут участвовать в акции.
 **/
@ApiModel(description="Список товаров, которые участвуют или могут участвовать в акции.")

public class GetPromoOffersResultDTO  {
  
  @ApiModelProperty(required = true, value = "Товары, которые участвуют или могут участвовать в акции.")
 /**
   * Товары, которые участвуют или могут участвовать в акции.
  **/
  private List<GetPromoOfferDTO> offers = new ArrayList<>();

  @ApiModelProperty(value = "")
  private ForwardScrollingPagerDTO paging;
 /**
   * Товары, которые участвуют или могут участвовать в акции.
   * @return offers
  **/
  @JsonProperty("offers")
  public List<GetPromoOfferDTO> getOffers() {
    return offers;
  }

  public void setOffers(List<GetPromoOfferDTO> offers) {
    this.offers = offers;
  }

  public GetPromoOffersResultDTO offers(List<GetPromoOfferDTO> offers) {
    this.offers = offers;
    return this;
  }

  public GetPromoOffersResultDTO addOffersItem(GetPromoOfferDTO offersItem) {
    this.offers.add(offersItem);
    return this;
  }

 /**
   * Get paging
   * @return paging
  **/
  @JsonProperty("paging")
  public ForwardScrollingPagerDTO getPaging() {
    return paging;
  }

  public void setPaging(ForwardScrollingPagerDTO paging) {
    this.paging = paging;
  }

  public GetPromoOffersResultDTO paging(ForwardScrollingPagerDTO paging) {
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
    GetPromoOffersResultDTO getPromoOffersResultDTO = (GetPromoOffersResultDTO) o;
    return Objects.equals(this.offers, getPromoOffersResultDTO.offers) &&
        Objects.equals(this.paging, getPromoOffersResultDTO.paging);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offers, paging);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetPromoOffersResultDTO {\n");
    
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

