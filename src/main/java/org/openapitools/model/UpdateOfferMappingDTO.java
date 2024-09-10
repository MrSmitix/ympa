package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.UpdateMappingDTO;
import org.openapitools.model.UpdateOfferDTO;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Информация о товаре.
 */

@Schema(name = "UpdateOfferMappingDTO", description = "Информация о товаре.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-09T22:33:46.054383208Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class UpdateOfferMappingDTO {

  private UpdateOfferDTO offer;

  private UpdateMappingDTO mapping;

  public UpdateOfferMappingDTO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public UpdateOfferMappingDTO(UpdateOfferDTO offer) {
    this.offer = offer;
  }

  public UpdateOfferMappingDTO offer(UpdateOfferDTO offer) {
    this.offer = offer;
    return this;
  }

  /**
   * Get offer
   * @return offer
   */
  @NotNull @Valid 
  @Schema(name = "offer", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("offer")
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
   */
  @Valid 
  @Schema(name = "mapping", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("mapping")
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
    return Objects.equals(this.offer, updateOfferMappingDTO.offer) &&
        Objects.equals(this.mapping, updateOfferMappingDTO.mapping);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offer, mapping);
  }

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

