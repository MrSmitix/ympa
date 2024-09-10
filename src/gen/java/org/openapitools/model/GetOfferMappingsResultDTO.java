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
import org.openapitools.model.GetOfferMappingDTO;
import org.openapitools.model.ScrollingPagerDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@ApiModel(description="Информация о товарах.")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2024-09-09T22:24:34.340132557Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GetOfferMappingsResultDTO   {
  
  private ScrollingPagerDTO paging;
  private List<@Valid GetOfferMappingDTO> offerMappings = new ArrayList<>();

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("paging")
  @Valid
  public ScrollingPagerDTO getPaging() {
    return paging;
  }
  public void setPaging(ScrollingPagerDTO paging) {
    this.paging = paging;
  }

  /**
   * Информация о товарах.
   **/
  
  @ApiModelProperty(required = true, value = "Информация о товарах.")
  @JsonProperty("offerMappings")
  @NotNull
  @Valid
  public List<@Valid GetOfferMappingDTO> getOfferMappings() {
    return offerMappings;
  }
  public void setOfferMappings(List<@Valid GetOfferMappingDTO> offerMappings) {
    this.offerMappings = offerMappings;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetOfferMappingsResultDTO getOfferMappingsResultDTO = (GetOfferMappingsResultDTO) o;
    return Objects.equals(this.paging, getOfferMappingsResultDTO.paging) &&
        Objects.equals(this.offerMappings, getOfferMappingsResultDTO.offerMappings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paging, offerMappings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetOfferMappingsResultDTO {\n");
    
    sb.append("    paging: ").append(toIndentedString(paging)).append("\n");
    sb.append("    offerMappings: ").append(toIndentedString(offerMappings)).append("\n");
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

