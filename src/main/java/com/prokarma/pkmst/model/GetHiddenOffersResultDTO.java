package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.HiddenOfferDTO;
import com.prokarma.pkmst.model.ScrollingPagerDTO;
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
 * Список скрытых вами товаров. 
 */
@ApiModel(description = "Список скрытых вами товаров. ")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-09-09T22:21:39.140910578Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GetHiddenOffersResultDTO   {
  @JsonProperty("paging")
  private ScrollingPagerDTO paging;

  @JsonProperty("hiddenOffers")
  
  private List<HiddenOfferDTO> hiddenOffers = new ArrayList<>();

  public GetHiddenOffersResultDTO paging(ScrollingPagerDTO paging) {
    this.paging = paging;
    return this;
  }

  /**
   * Get paging
   * @return paging
   */
  @ApiModelProperty(value = "")
  public ScrollingPagerDTO getPaging() {
    return paging;
  }

  public void setPaging(ScrollingPagerDTO paging) {
    this.paging = paging;
  }

  public GetHiddenOffersResultDTO hiddenOffers(List<HiddenOfferDTO> hiddenOffers) {
    this.hiddenOffers = hiddenOffers;
    return this;
  }

  public GetHiddenOffersResultDTO addHiddenOffersItem(HiddenOfferDTO hiddenOffersItem) {
    if (this.hiddenOffers == null) {
      this.hiddenOffers = new ArrayList<>();
    }
    this.hiddenOffers.add(hiddenOffersItem);
    return this;
  }

  /**
   * Список скрытых товаров.
   * @return hiddenOffers
   */
  @ApiModelProperty(required = true, value = "Список скрытых товаров.")
  public List<HiddenOfferDTO> getHiddenOffers() {
    return hiddenOffers;
  }

  public void setHiddenOffers(List<HiddenOfferDTO> hiddenOffers) {
    this.hiddenOffers = hiddenOffers;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetHiddenOffersResultDTO getHiddenOffersResultDTO = (GetHiddenOffersResultDTO) o;
    return Objects.equals(this.paging, getHiddenOffersResultDTO.paging) &&
        Objects.equals(this.hiddenOffers, getHiddenOffersResultDTO.hiddenOffers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paging, hiddenOffers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetHiddenOffersResultDTO {\n");
    
    sb.append("    paging: ").append(toIndentedString(paging)).append("\n");
    sb.append("    hiddenOffers: ").append(toIndentedString(hiddenOffers)).append("\n");
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

