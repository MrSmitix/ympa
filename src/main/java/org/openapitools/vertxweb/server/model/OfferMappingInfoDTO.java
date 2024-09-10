package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.vertxweb.server.model.OfferMappingDTO;

/**
 * Информация о карточке товара.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OfferMappingInfoDTO   {
  
  private OfferMappingDTO mapping;
  private OfferMappingDTO awaitingModerationMapping;
  private OfferMappingDTO rejectedMapping;

  public OfferMappingInfoDTO () {

  }

  public OfferMappingInfoDTO (OfferMappingDTO mapping, OfferMappingDTO awaitingModerationMapping, OfferMappingDTO rejectedMapping) {
    this.mapping = mapping;
    this.awaitingModerationMapping = awaitingModerationMapping;
    this.rejectedMapping = rejectedMapping;
  }

    
  @JsonProperty("mapping")
  public OfferMappingDTO getMapping() {
    return mapping;
  }
  public void setMapping(OfferMappingDTO mapping) {
    this.mapping = mapping;
  }

    
  @JsonProperty("awaitingModerationMapping")
  public OfferMappingDTO getAwaitingModerationMapping() {
    return awaitingModerationMapping;
  }
  public void setAwaitingModerationMapping(OfferMappingDTO awaitingModerationMapping) {
    this.awaitingModerationMapping = awaitingModerationMapping;
  }

    
  @JsonProperty("rejectedMapping")
  public OfferMappingDTO getRejectedMapping() {
    return rejectedMapping;
  }
  public void setRejectedMapping(OfferMappingDTO rejectedMapping) {
    this.rejectedMapping = rejectedMapping;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OfferMappingInfoDTO offerMappingInfoDTO = (OfferMappingInfoDTO) o;
    return Objects.equals(mapping, offerMappingInfoDTO.mapping) &&
        Objects.equals(awaitingModerationMapping, offerMappingInfoDTO.awaitingModerationMapping) &&
        Objects.equals(rejectedMapping, offerMappingInfoDTO.rejectedMapping);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mapping, awaitingModerationMapping, rejectedMapping);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfferMappingInfoDTO {\n");
    
    sb.append("    mapping: ").append(toIndentedString(mapping)).append("\n");
    sb.append("    awaitingModerationMapping: ").append(toIndentedString(awaitingModerationMapping)).append("\n");
    sb.append("    rejectedMapping: ").append(toIndentedString(rejectedMapping)).append("\n");
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
