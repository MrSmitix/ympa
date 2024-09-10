package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.OfferMappingEntryDTO;
import org.openapitools.model.ScrollingPagerDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Информация о товарах в каталоге.
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "Информация о товарах в каталоге.")
public class OfferMappingEntriesDTO   {
  
  private ScrollingPagerDTO paging;

  private List<@Valid OfferMappingEntryDTO> offerMappingEntries = new ArrayList<>();

  /**
   **/
  public OfferMappingEntriesDTO paging(ScrollingPagerDTO paging) {
    this.paging = paging;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("paging")
  public ScrollingPagerDTO getPaging() {
    return paging;
  }
  public void setPaging(ScrollingPagerDTO paging) {
    this.paging = paging;
  }


  /**
   * Информация о товарах в каталоге.
   **/
  public OfferMappingEntriesDTO offerMappingEntries(List<@Valid OfferMappingEntryDTO> offerMappingEntries) {
    this.offerMappingEntries = offerMappingEntries;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Информация о товарах в каталоге.")
  @JsonProperty("offerMappingEntries")
  @NotNull
  public List<@Valid OfferMappingEntryDTO> getOfferMappingEntries() {
    return offerMappingEntries;
  }
  public void setOfferMappingEntries(List<@Valid OfferMappingEntryDTO> offerMappingEntries) {
    this.offerMappingEntries = offerMappingEntries;
  }

  public OfferMappingEntriesDTO addOfferMappingEntriesItem(OfferMappingEntryDTO offerMappingEntriesItem) {
    if (this.offerMappingEntries == null) {
      this.offerMappingEntries = new ArrayList<>();
    }
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
    OfferMappingEntriesDTO offerMappingEntriesDTO = (OfferMappingEntriesDTO) o;
    return Objects.equals(this.paging, offerMappingEntriesDTO.paging) &&
        Objects.equals(this.offerMappingEntries, offerMappingEntriesDTO.offerMappingEntries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paging, offerMappingEntries);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfferMappingEntriesDTO {\n");
    
    sb.append("    paging: ").append(toIndentedString(paging)).append("\n");
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

