package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.GetMappingDTO;
import org.openapitools.model.SuggestedOfferDTO;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Товар с соответствующей карточкой на Маркете.
 */

@Schema(name = "SuggestedOfferMappingDTO", description = "Товар с соответствующей карточкой на Маркете.")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-09-09T22:19:44.552145407Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class SuggestedOfferMappingDTO {

  private SuggestedOfferDTO offer;

  private GetMappingDTO mapping;

  public SuggestedOfferMappingDTO offer(SuggestedOfferDTO offer) {
    this.offer = offer;
    return this;
  }

  /**
   * Get offer
   * @return offer
   */
  @Valid 
  @Schema(name = "offer", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("offer")
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
   */
  @Valid 
  @Schema(name = "mapping", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("mapping")
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
    return Objects.equals(this.offer, suggestedOfferMappingDTO.offer) &&
        Objects.equals(this.mapping, suggestedOfferMappingDTO.mapping);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offer, mapping);
  }

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

