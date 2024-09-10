package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.OfferMappingEntryDTO;
import org.openapitools.vertxweb.server.model.ScrollingPagerDTO;

/**
 * Информация о товарах в каталоге.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OfferMappingEntriesDTO   {
  
  private ScrollingPagerDTO paging;
  private List<OfferMappingEntryDTO> offerMappingEntries = new ArrayList<>();

  public OfferMappingEntriesDTO () {

  }

  public OfferMappingEntriesDTO (ScrollingPagerDTO paging, List<OfferMappingEntryDTO> offerMappingEntries) {
    this.paging = paging;
    this.offerMappingEntries = offerMappingEntries;
  }

    
  @JsonProperty("paging")
  public ScrollingPagerDTO getPaging() {
    return paging;
  }
  public void setPaging(ScrollingPagerDTO paging) {
    this.paging = paging;
  }

    
  @JsonProperty("offerMappingEntries")
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
    return Objects.equals(paging, offerMappingEntriesDTO.paging) &&
        Objects.equals(offerMappingEntries, offerMappingEntriesDTO.offerMappingEntries);
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
