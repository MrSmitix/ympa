package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ForwardScrollingPagerDTO;
import org.openapitools.model.GetPromoOfferDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@ApiModel(description="Список товаров, которые участвуют или могут участвовать в акции.")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2024-09-09T22:24:34.340132557Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GetPromoOffersResultDTO   {
  
  private List<@Valid GetPromoOfferDTO> offers = new ArrayList<>();
  private ForwardScrollingPagerDTO paging;

  /**
   * Товары, которые участвуют или могут участвовать в акции.
   **/
  
  @ApiModelProperty(required = true, value = "Товары, которые участвуют или могут участвовать в акции.")
  @JsonProperty("offers")
  @NotNull
  @Valid
  public List<@Valid GetPromoOfferDTO> getOffers() {
    return offers;
  }
  public void setOffers(List<@Valid GetPromoOfferDTO> offers) {
    this.offers = offers;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("paging")
  @Valid
  public ForwardScrollingPagerDTO getPaging() {
    return paging;
  }
  public void setPaging(ForwardScrollingPagerDTO paging) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

