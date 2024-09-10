package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.UpdateOfferMappingEntryDTO;



/**
 * Запрос на обновление товаров.
 **/

@ApiModel(description = "Запрос на обновление товаров.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-09-09T22:20:23.877037640Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class UpdateOfferMappingEntryRequest   {
  @JsonProperty("offerMappingEntries")
  private List<UpdateOfferMappingEntryDTO> offerMappingEntries = new ArrayList<>();

  /**
   * Информация о товарах в каталоге.
   **/
  public UpdateOfferMappingEntryRequest offerMappingEntries(List<UpdateOfferMappingEntryDTO> offerMappingEntries) {
    this.offerMappingEntries = offerMappingEntries;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Информация о товарах в каталоге.")
  @JsonProperty("offerMappingEntries")
  public List<UpdateOfferMappingEntryDTO> getOfferMappingEntries() {
    return offerMappingEntries;
  }
  public void setOfferMappingEntries(List<UpdateOfferMappingEntryDTO> offerMappingEntries) {
    this.offerMappingEntries = offerMappingEntries;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateOfferMappingEntryRequest updateOfferMappingEntryRequest = (UpdateOfferMappingEntryRequest) o;
    return Objects.equals(offerMappingEntries, updateOfferMappingEntryRequest.offerMappingEntries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offerMappingEntries);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateOfferMappingEntryRequest {\n");
    
    sb.append("    offerMappingEntries: ").append(toIndentedString(offerMappingEntries)).append("\n");
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

