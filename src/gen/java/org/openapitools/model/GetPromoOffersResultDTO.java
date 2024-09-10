package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ForwardScrollingPagerDTO;
import org.openapitools.model.GetPromoOfferDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Список товаров, которые участвуют или могут участвовать в акции.
 */
@ApiModel(description="Список товаров, которые участвуют или могут участвовать в акции.")

public class GetPromoOffersResultDTO  {
  
 /**
  * Товары, которые участвуют или могут участвовать в акции.
  */
  @ApiModelProperty(required = true, value = "Товары, которые участвуют или могут участвовать в акции.")
  @Valid
  private List<@Valid GetPromoOfferDTO> offers = new ArrayList<>();

  @ApiModelProperty(value = "")
  @Valid
  private ForwardScrollingPagerDTO paging;
 /**
  * Товары, которые участвуют или могут участвовать в акции.
  * @return offers
  */
  @JsonProperty("offers")
  @NotNull
  public List<@Valid GetPromoOfferDTO> getOffers() {
    return offers;
  }

  /**
   * Sets the <code>offers</code> property.
   */
 public void setOffers(List<@Valid GetPromoOfferDTO> offers) {
    this.offers = offers;
  }

  /**
   * Sets the <code>offers</code> property.
   */
  public GetPromoOffersResultDTO offers(List<@Valid GetPromoOfferDTO> offers) {
    this.offers = offers;
    return this;
  }

  /**
   * Adds a new item to the <code>offers</code> list.
   */
  public GetPromoOffersResultDTO addOffersItem(GetPromoOfferDTO offersItem) {
    this.offers.add(offersItem);
    return this;
  }

 /**
  * Get paging
  * @return paging
  */
  @JsonProperty("paging")
  public ForwardScrollingPagerDTO getPaging() {
    return paging;
  }

  /**
   * Sets the <code>paging</code> property.
   */
 public void setPaging(ForwardScrollingPagerDTO paging) {
    this.paging = paging;
  }

  /**
   * Sets the <code>paging</code> property.
   */
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

