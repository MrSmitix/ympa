package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.HiddenOfferDTO;
import org.openapitools.model.ScrollingPagerDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Список скрытых вами товаров. 
 */
@ApiModel(description="Список скрытых вами товаров. ")

public class GetHiddenOffersResultDTO  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ScrollingPagerDTO paging;

 /**
  * Список скрытых товаров.
  */
  @ApiModelProperty(required = true, value = "Список скрытых товаров.")
  @Valid
  private List<@Valid HiddenOfferDTO> hiddenOffers = new ArrayList<>();
 /**
  * Get paging
  * @return paging
  */
  @JsonProperty("paging")
  public ScrollingPagerDTO getPaging() {
    return paging;
  }

  /**
   * Sets the <code>paging</code> property.
   */
 public void setPaging(ScrollingPagerDTO paging) {
    this.paging = paging;
  }

  /**
   * Sets the <code>paging</code> property.
   */
  public GetHiddenOffersResultDTO paging(ScrollingPagerDTO paging) {
    this.paging = paging;
    return this;
  }

 /**
  * Список скрытых товаров.
  * @return hiddenOffers
  */
  @JsonProperty("hiddenOffers")
  @NotNull
  public List<@Valid HiddenOfferDTO> getHiddenOffers() {
    return hiddenOffers;
  }

  /**
   * Sets the <code>hiddenOffers</code> property.
   */
 public void setHiddenOffers(List<@Valid HiddenOfferDTO> hiddenOffers) {
    this.hiddenOffers = hiddenOffers;
  }

  /**
   * Sets the <code>hiddenOffers</code> property.
   */
  public GetHiddenOffersResultDTO hiddenOffers(List<@Valid HiddenOfferDTO> hiddenOffers) {
    this.hiddenOffers = hiddenOffers;
    return this;
  }

  /**
   * Adds a new item to the <code>hiddenOffers</code> list.
   */
  public GetHiddenOffersResultDTO addHiddenOffersItem(HiddenOfferDTO hiddenOffersItem) {
    this.hiddenOffers.add(hiddenOffersItem);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

