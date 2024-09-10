package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.UpdateOfferMappingEntryDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Запрос на обновление товаров.
 **/
@ApiModel(description="Запрос на обновление товаров.")

public class UpdateOfferMappingEntryRequest  {
  
  @ApiModelProperty(required = true, value = "Информация о товарах в каталоге.")
  @Valid
 /**
   * Информация о товарах в каталоге.
  **/
  private List<@Valid UpdateOfferMappingEntryDTO> offerMappingEntries = new ArrayList<>();
 /**
   * Информация о товарах в каталоге.
   * @return offerMappingEntries
  **/
  @JsonProperty("offerMappingEntries")
  @NotNull
 @Size(min=1,max=500)  public List<@Valid UpdateOfferMappingEntryDTO> getOfferMappingEntries() {
    return offerMappingEntries;
  }

  public void setOfferMappingEntries(List<@Valid UpdateOfferMappingEntryDTO> offerMappingEntries) {
    this.offerMappingEntries = offerMappingEntries;
  }

  public UpdateOfferMappingEntryRequest offerMappingEntries(List<@Valid UpdateOfferMappingEntryDTO> offerMappingEntries) {
    this.offerMappingEntries = offerMappingEntries;
    return this;
  }

  public UpdateOfferMappingEntryRequest addOfferMappingEntriesItem(UpdateOfferMappingEntryDTO offerMappingEntriesItem) {
    this.offerMappingEntries.add(offerMappingEntriesItem);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

