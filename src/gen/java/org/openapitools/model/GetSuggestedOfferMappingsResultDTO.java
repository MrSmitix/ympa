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
import org.openapitools.model.SuggestedOfferMappingDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@ApiModel(description="Подобранные карточки на Маркете.")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2024-09-09T22:24:34.340132557Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GetSuggestedOfferMappingsResultDTO   {
  
  private List<@Valid SuggestedOfferMappingDTO> offers = new ArrayList<>();

  /**
   * Список товаров.
   **/
  
  @ApiModelProperty(required = true, value = "Список товаров.")
  @JsonProperty("offers")
  @NotNull
  @Valid
  public List<@Valid SuggestedOfferMappingDTO> getOffers() {
    return offers;
  }
  public void setOffers(List<@Valid SuggestedOfferMappingDTO> offers) {
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
    GetSuggestedOfferMappingsResultDTO getSuggestedOfferMappingsResultDTO = (GetSuggestedOfferMappingsResultDTO) o;
    return Objects.equals(this.offers, getSuggestedOfferMappingsResultDTO.offers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetSuggestedOfferMappingsResultDTO {\n");
    
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

