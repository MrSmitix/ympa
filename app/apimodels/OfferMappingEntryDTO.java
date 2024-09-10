package apimodels;

import apimodels.MappingsOfferDTO;
import apimodels.OfferMappingDTO;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Список товаров. 
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class OfferMappingEntryDTO   {
  @JsonProperty("mapping")
  @Valid

  private OfferMappingDTO mapping;

  @JsonProperty("awaitingModerationMapping")
  @Valid

  private OfferMappingDTO awaitingModerationMapping;

  @JsonProperty("rejectedMapping")
  @Valid

  private OfferMappingDTO rejectedMapping;

  @JsonProperty("offer")
  @Valid

  private MappingsOfferDTO offer;

  public OfferMappingEntryDTO mapping(OfferMappingDTO mapping) {
    this.mapping = mapping;
    return this;
  }

   /**
   * Get mapping
   * @return mapping
  **/
  public OfferMappingDTO getMapping() {
    return mapping;
  }

  public void setMapping(OfferMappingDTO mapping) {
    this.mapping = mapping;
  }

  public OfferMappingEntryDTO awaitingModerationMapping(OfferMappingDTO awaitingModerationMapping) {
    this.awaitingModerationMapping = awaitingModerationMapping;
    return this;
  }

   /**
   * Get awaitingModerationMapping
   * @return awaitingModerationMapping
  **/
  public OfferMappingDTO getAwaitingModerationMapping() {
    return awaitingModerationMapping;
  }

  public void setAwaitingModerationMapping(OfferMappingDTO awaitingModerationMapping) {
    this.awaitingModerationMapping = awaitingModerationMapping;
  }

  public OfferMappingEntryDTO rejectedMapping(OfferMappingDTO rejectedMapping) {
    this.rejectedMapping = rejectedMapping;
    return this;
  }

   /**
   * Get rejectedMapping
   * @return rejectedMapping
  **/
  public OfferMappingDTO getRejectedMapping() {
    return rejectedMapping;
  }

  public void setRejectedMapping(OfferMappingDTO rejectedMapping) {
    this.rejectedMapping = rejectedMapping;
  }

  public OfferMappingEntryDTO offer(MappingsOfferDTO offer) {
    this.offer = offer;
    return this;
  }

   /**
   * Get offer
   * @return offer
  **/
  public MappingsOfferDTO getOffer() {
    return offer;
  }

  public void setOffer(MappingsOfferDTO offer) {
    this.offer = offer;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OfferMappingEntryDTO offerMappingEntryDTO = (OfferMappingEntryDTO) o;
    return Objects.equals(mapping, offerMappingEntryDTO.mapping) &&
        Objects.equals(awaitingModerationMapping, offerMappingEntryDTO.awaitingModerationMapping) &&
        Objects.equals(rejectedMapping, offerMappingEntryDTO.rejectedMapping) &&
        Objects.equals(offer, offerMappingEntryDTO.offer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mapping, awaitingModerationMapping, rejectedMapping, offer);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfferMappingEntryDTO {\n");
    
    sb.append("    mapping: ").append(toIndentedString(mapping)).append("\n");
    sb.append("    awaitingModerationMapping: ").append(toIndentedString(awaitingModerationMapping)).append("\n");
    sb.append("    rejectedMapping: ").append(toIndentedString(rejectedMapping)).append("\n");
    sb.append("    offer: ").append(toIndentedString(offer)).append("\n");
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

