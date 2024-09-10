package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.api.model.UpdateOfferMappingDTO;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateOfferMappingsRequest   {
  
  private List<UpdateOfferMappingDTO> offerMappings = new ArrayList<>();
  private Boolean onlyPartnerMediaContent;

  public UpdateOfferMappingsRequest () {

  }

  public UpdateOfferMappingsRequest (List<UpdateOfferMappingDTO> offerMappings, Boolean onlyPartnerMediaContent) {
    this.offerMappings = offerMappings;
    this.onlyPartnerMediaContent = onlyPartnerMediaContent;
  }

    
  @JsonProperty("offerMappings")
  public List<UpdateOfferMappingDTO> getOfferMappings() {
    return offerMappings;
  }
  public void setOfferMappings(List<UpdateOfferMappingDTO> offerMappings) {
    this.offerMappings = offerMappings;
  }

    
  @JsonProperty("onlyPartnerMediaContent")
  public Boolean getOnlyPartnerMediaContent() {
    return onlyPartnerMediaContent;
  }
  public void setOnlyPartnerMediaContent(Boolean onlyPartnerMediaContent) {
    this.onlyPartnerMediaContent = onlyPartnerMediaContent;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateOfferMappingsRequest updateOfferMappingsRequest = (UpdateOfferMappingsRequest) o;
    return Objects.equals(offerMappings, updateOfferMappingsRequest.offerMappings) &&
        Objects.equals(onlyPartnerMediaContent, updateOfferMappingsRequest.onlyPartnerMediaContent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offerMappings, onlyPartnerMediaContent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateOfferMappingsRequest {\n");
    
    sb.append("    offerMappings: ").append(toIndentedString(offerMappings)).append("\n");
    sb.append("    onlyPartnerMediaContent: ").append(toIndentedString(onlyPartnerMediaContent)).append("\n");
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
