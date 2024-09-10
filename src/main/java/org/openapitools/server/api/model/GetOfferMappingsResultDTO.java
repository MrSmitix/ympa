package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.api.model.GetOfferMappingDTO;
import org.openapitools.server.api.model.ScrollingPagerDTO;

/**
 * Информация о товарах.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetOfferMappingsResultDTO   {
  
  private ScrollingPagerDTO paging;
  private List<GetOfferMappingDTO> offerMappings = new ArrayList<>();

  public GetOfferMappingsResultDTO () {

  }

  public GetOfferMappingsResultDTO (ScrollingPagerDTO paging, List<GetOfferMappingDTO> offerMappings) {
    this.paging = paging;
    this.offerMappings = offerMappings;
  }

    
  @JsonProperty("paging")
  public ScrollingPagerDTO getPaging() {
    return paging;
  }
  public void setPaging(ScrollingPagerDTO paging) {
    this.paging = paging;
  }

    
  @JsonProperty("offerMappings")
  public List<GetOfferMappingDTO> getOfferMappings() {
    return offerMappings;
  }
  public void setOfferMappings(List<GetOfferMappingDTO> offerMappings) {
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
    return Objects.equals(paging, getOfferMappingsResultDTO.paging) &&
        Objects.equals(offerMappings, getOfferMappingsResultDTO.offerMappings);
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
