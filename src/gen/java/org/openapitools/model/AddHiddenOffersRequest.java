package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.HiddenOfferDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Запрос на скрытие оферов.
 **/
@ApiModel(description = "Запрос на скрытие оферов.")
@JsonTypeName("AddHiddenOffersRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-09-09T22:25:08.792192529Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class AddHiddenOffersRequest   {
  private @Valid List<@Valid HiddenOfferDTO> hiddenOffers = new ArrayList<>();

  /**
   * Список скрытых товаров. 
   **/
  public AddHiddenOffersRequest hiddenOffers(List<@Valid HiddenOfferDTO> hiddenOffers) {
    this.hiddenOffers = hiddenOffers;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Список скрытых товаров. ")
  @JsonProperty("hiddenOffers")
  @NotNull @Valid  @Size(min=1,max=500)public List<@Valid HiddenOfferDTO> getHiddenOffers() {
    return hiddenOffers;
  }

  @JsonProperty("hiddenOffers")
  public void setHiddenOffers(List<@Valid HiddenOfferDTO> hiddenOffers) {
    this.hiddenOffers = hiddenOffers;
  }

  public AddHiddenOffersRequest addHiddenOffersItem(HiddenOfferDTO hiddenOffersItem) {
    if (this.hiddenOffers == null) {
      this.hiddenOffers = new ArrayList<>();
    }

    this.hiddenOffers.add(hiddenOffersItem);
    return this;
  }

  public AddHiddenOffersRequest removeHiddenOffersItem(HiddenOfferDTO hiddenOffersItem) {
    if (hiddenOffersItem != null && this.hiddenOffers != null) {
      this.hiddenOffers.remove(hiddenOffersItem);
    }

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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

