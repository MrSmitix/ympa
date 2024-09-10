package apimodels;

import apimodels.UpdateMappingDTO;
import apimodels.UpdateOfferDTO;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Информация о товаре.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class UpdateOfferMappingDTO   {
  @JsonProperty("offer")
  @NotNull
@Valid

  private UpdateOfferDTO offer;

  @JsonProperty("mapping")
  @Valid

  private UpdateMappingDTO mapping;

  public UpdateOfferMappingDTO offer(UpdateOfferDTO offer) {
    this.offer = offer;
    return this;
  }

   /**
   * Get offer
   * @return offer
  **/
  public UpdateOfferDTO getOffer() {
    return offer;
  }

  public void setOffer(UpdateOfferDTO offer) {
    this.offer = offer;
  }

  public UpdateOfferMappingDTO mapping(UpdateMappingDTO mapping) {
    this.mapping = mapping;
    return this;
  }

   /**
   * Get mapping
   * @return mapping
  **/
  public UpdateMappingDTO getMapping() {
    return mapping;
  }

  public void setMapping(UpdateMappingDTO mapping) {
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
    UpdateOfferMappingDTO updateOfferMappingDTO = (UpdateOfferMappingDTO) o;
    return Objects.equals(offer, updateOfferMappingDTO.offer) &&
        Objects.equals(mapping, updateOfferMappingDTO.mapping);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offer, mapping);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateOfferMappingDTO {\n");
    
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

