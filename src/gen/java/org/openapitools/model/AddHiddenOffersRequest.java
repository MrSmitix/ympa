package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.HiddenOfferDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Запрос на скрытие оферов.
 **/
@ApiModel(description="Запрос на скрытие оферов.")

public class AddHiddenOffersRequest  {
  
  @ApiModelProperty(required = true, value = "Список скрытых товаров. ")
  @Valid
 /**
   * Список скрытых товаров. 
  **/
  private List<@Valid HiddenOfferDTO> hiddenOffers = new ArrayList<>();
 /**
   * Список скрытых товаров. 
   * @return hiddenOffers
  **/
  @JsonProperty("hiddenOffers")
  @NotNull
 @Size(min=1,max=500)  public List<@Valid HiddenOfferDTO> getHiddenOffers() {
    return hiddenOffers;
  }

  public void setHiddenOffers(List<@Valid HiddenOfferDTO> hiddenOffers) {
    this.hiddenOffers = hiddenOffers;
  }

  public AddHiddenOffersRequest hiddenOffers(List<@Valid HiddenOfferDTO> hiddenOffers) {
    this.hiddenOffers = hiddenOffers;
    return this;
  }

  public AddHiddenOffersRequest addHiddenOffersItem(HiddenOfferDTO hiddenOffersItem) {
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
    AddHiddenOffersRequest addHiddenOffersRequest = (AddHiddenOffersRequest) o;
    return Objects.equals(this.hiddenOffers, addHiddenOffersRequest.hiddenOffers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hiddenOffers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddHiddenOffersRequest {\n");
    
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

