package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.GetMappingDTO;
import org.openapitools.model.SuggestedOfferDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@ApiModel(description="Товар с соответствующей карточкой на Маркете.")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2024-09-09T22:24:34.340132557Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class SuggestedOfferMappingDTO   {
  
  private SuggestedOfferDTO offer;
  private GetMappingDTO mapping;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("offer")
  @Valid
  public SuggestedOfferDTO getOffer() {
    return offer;
  }
  public void setOffer(SuggestedOfferDTO offer) {
    this.offer = offer;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("mapping")
  @Valid
  public GetMappingDTO getMapping() {
    return mapping;
  }
  public void setMapping(GetMappingDTO mapping) {
    this.mapping = mapping;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SuggestedOfferMappingDTO suggestedOfferMappingDTO = (SuggestedOfferMappingDTO) o;
    return Objects.equals(this.offer, suggestedOfferMappingDTO.offer) &&
        Objects.equals(this.mapping, suggestedOfferMappingDTO.mapping);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offer, mapping);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SuggestedOfferMappingDTO {\n");
    
    sb.append("    offer: ").append(toIndentedString(offer)).append("\n");
    sb.append("    mapping: ").append(toIndentedString(mapping)).append("\n");
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
