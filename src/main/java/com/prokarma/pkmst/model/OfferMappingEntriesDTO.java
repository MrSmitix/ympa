package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.OfferMappingEntryDTO;
import com.prokarma.pkmst.model.ScrollingPagerDTO;
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
 * Информация о товарах в каталоге.
 */
@ApiModel(description = "Информация о товарах в каталоге.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-09-09T22:21:39.140910578Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class OfferMappingEntriesDTO   {
  @JsonProperty("paging")
  private ScrollingPagerDTO paging;

  @JsonProperty("offerMappingEntries")
  
  private List<OfferMappingEntryDTO> offerMappingEntries = new ArrayList<>();

  public OfferMappingEntriesDTO paging(ScrollingPagerDTO paging) {
    this.paging = paging;
    return this;
  }

  /**
   * Get paging
   * @return paging
   */
  @ApiModelProperty(value = "")
  public ScrollingPagerDTO getPaging() {
    return paging;
  }

  public void setPaging(ScrollingPagerDTO paging) {
    this.paging = paging;
  }

  public OfferMappingEntriesDTO offerMappingEntries(List<OfferMappingEntryDTO> offerMappingEntries) {
    this.offerMappingEntries = offerMappingEntries;
    return this;
  }

  public OfferMappingEntriesDTO addOfferMappingEntriesItem(OfferMappingEntryDTO offerMappingEntriesItem) {
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
  public List<OfferMappingEntryDTO> getOfferMappingEntries() {
    return offerMappingEntries;
  }

  public void setOfferMappingEntries(List<OfferMappingEntryDTO> offerMappingEntries) {
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
