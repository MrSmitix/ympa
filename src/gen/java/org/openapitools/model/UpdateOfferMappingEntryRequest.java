package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.UpdateOfferMappingEntryDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Запрос на обновление товаров.
 **/
@ApiModel(description = "Запрос на обновление товаров.")
@JsonTypeName("UpdateOfferMappingEntryRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-09-09T22:25:08.792192529Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class UpdateOfferMappingEntryRequest   {
  private @Valid List<@Valid UpdateOfferMappingEntryDTO> offerMappingEntries = new ArrayList<>();

  /**
   * Информация о товарах в каталоге.
   **/
  public UpdateOfferMappingEntryRequest offerMappingEntries(List<@Valid UpdateOfferMappingEntryDTO> offerMappingEntries) {
    this.offerMappingEntries = offerMappingEntries;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Информация о товарах в каталоге.")
  @JsonProperty("offerMappingEntries")
  @NotNull @Valid  @Size(min=1,max=500)public List<@Valid UpdateOfferMappingEntryDTO> getOfferMappingEntries() {
    return offerMappingEntries;
  }

  @JsonProperty("offerMappingEntries")
  public void setOfferMappingEntries(List<@Valid UpdateOfferMappingEntryDTO> offerMappingEntries) {
    this.offerMappingEntries = offerMappingEntries;
  }

  public UpdateOfferMappingEntryRequest addOfferMappingEntriesItem(UpdateOfferMappingEntryDTO offerMappingEntriesItem) {
    if (this.offerMappingEntries == null) {
      this.offerMappingEntries = new ArrayList<>();
    }

    this.offerMappingEntries.add(offerMappingEntriesItem);
    return this;
  }

  public UpdateOfferMappingEntryRequest removeOfferMappingEntriesItem(UpdateOfferMappingEntryDTO offerMappingEntriesItem) {
    if (offerMappingEntriesItem != null && this.offerMappingEntries != null) {
      this.offerMappingEntries.remove(offerMappingEntriesItem);
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

