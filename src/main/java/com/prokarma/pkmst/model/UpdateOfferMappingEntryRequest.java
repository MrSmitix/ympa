package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.UpdateOfferMappingEntryDTO;
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
 * Запрос на обновление товаров.
 */
@ApiModel(description = "Запрос на обновление товаров.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-09-09T22:21:39.140910578Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class UpdateOfferMappingEntryRequest   {
  @JsonProperty("offerMappingEntries")
  
  private List<UpdateOfferMappingEntryDTO> offerMappingEntries = new ArrayList<>();

  public UpdateOfferMappingEntryRequest offerMappingEntries(List<UpdateOfferMappingEntryDTO> offerMappingEntries) {
    this.offerMappingEntries = offerMappingEntries;
    return this;
  }

  public UpdateOfferMappingEntryRequest addOfferMappingEntriesItem(UpdateOfferMappingEntryDTO offerMappingEntriesItem) {
    if (this.offerMappingEntries == null) {
      this.offerMappingEntries = new ArrayList<>();
    }
    this.offerMappingEntries.add(offerMappingEntriesItem);
    return this;
  }

  /**
   * Информация о товарах в каталоге.
   * @return offerMappingEntries
   */
  @ApiModelProperty(required = true, value = "Информация о товарах в каталоге.")
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
    return Objects.equals(this.offerMappingEntries, updateOfferMappingEntryRequest.offerMappingEntries);
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

