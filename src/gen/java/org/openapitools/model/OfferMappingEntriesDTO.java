package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.OfferMappingEntryDTO;
import org.openapitools.model.ScrollingPagerDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Информация о товарах в каталоге.
 */
@ApiModel(description="Информация о товарах в каталоге.")

public class OfferMappingEntriesDTO  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ScrollingPagerDTO paging;

 /**
  * Информация о товарах в каталоге.
  */
  @ApiModelProperty(required = true, value = "Информация о товарах в каталоге.")
  @Valid
  private List<@Valid OfferMappingEntryDTO> offerMappingEntries = new ArrayList<>();
 /**
  * Get paging
  * @return paging
  */
  @JsonProperty("paging")
  public ScrollingPagerDTO getPaging() {
    return paging;
  }

  /**
   * Sets the <code>paging</code> property.
   */
 public void setPaging(ScrollingPagerDTO paging) {
    this.paging = paging;
  }

  /**
   * Sets the <code>paging</code> property.
   */
  public OfferMappingEntriesDTO paging(ScrollingPagerDTO paging) {
    this.paging = paging;
    return this;
  }

 /**
  * Информация о товарах в каталоге.
  * @return offerMappingEntries
  */
  @JsonProperty("offerMappingEntries")
  @NotNull
  public List<@Valid OfferMappingEntryDTO> getOfferMappingEntries() {
    return offerMappingEntries;
  }

  /**
   * Sets the <code>offerMappingEntries</code> property.
   */
 public void setOfferMappingEntries(List<@Valid OfferMappingEntryDTO> offerMappingEntries) {
    this.offerMappingEntries = offerMappingEntries;
  }

  /**
   * Sets the <code>offerMappingEntries</code> property.
   */
  public OfferMappingEntriesDTO offerMappingEntries(List<@Valid OfferMappingEntryDTO> offerMappingEntries) {
    this.offerMappingEntries = offerMappingEntries;
    return this;
  }

  /**
   * Adds a new item to the <code>offerMappingEntries</code> list.
   */
  public OfferMappingEntriesDTO addOfferMappingEntriesItem(OfferMappingEntryDTO offerMappingEntriesItem) {
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

