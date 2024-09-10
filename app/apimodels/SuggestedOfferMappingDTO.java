package apimodels;

import apimodels.GetMappingDTO;
import apimodels.SuggestedOfferDTO;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Товар с соответствующей карточкой на Маркете.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class SuggestedOfferMappingDTO   {
  @JsonProperty("offer")
  @Valid

  private SuggestedOfferDTO offer;

  @JsonProperty("mapping")
  @Valid

  private GetMappingDTO mapping;

  public SuggestedOfferMappingDTO offer(SuggestedOfferDTO offer) {
    this.offer = offer;
    return this;
  }

   /**
   * Get offer
   * @return offer
  **/
  public SuggestedOfferDTO getOffer() {
    return offer;
  }

  public void setOffer(SuggestedOfferDTO offer) {
    this.offer = offer;
  }

  public SuggestedOfferMappingDTO mapping(GetMappingDTO mapping) {
    this.mapping = mapping;
    return this;
  }

   /**
   * Get mapping
   * @return mapping
  **/
  public GetMappingDTO getMapping() {
    return mapping;
  }

  public void setMapping(GetMappingDTO mapping) {
    this.mapping = mapping;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SuggestedOfferMappingDTO suggestedOfferMappingDTO = (SuggestedOfferMappingDTO) o;
    return Objects.equals(offer, suggestedOfferMappingDTO.offer) &&
        Objects.equals(mapping, suggestedOfferMappingDTO.mapping);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offer, mapping);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SuggestedOfferMappingDTO {\n");
    
    sb.append("    offer: ").append(toIndentedString(offer)).append("\n");
    sb.append("    mapping: ").append(toIndentedString(mapping)).append("\n");
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

