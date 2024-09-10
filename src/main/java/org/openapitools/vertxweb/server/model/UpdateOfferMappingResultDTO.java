package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.vertxweb.server.model.OfferMappingErrorDTO;

/**
 * Ошибки и предупреждения, которые появились из-за переданных характеристик.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateOfferMappingResultDTO   {
  
  private String offerId;
  private List<OfferMappingErrorDTO> errors;
  private List<OfferMappingErrorDTO> warnings;

  public UpdateOfferMappingResultDTO () {

  }

  public UpdateOfferMappingResultDTO (String offerId, List<OfferMappingErrorDTO> errors, List<OfferMappingErrorDTO> warnings) {
    this.offerId = offerId;
    this.errors = errors;
    this.warnings = warnings;
  }

    
  @JsonProperty("offerId")
  public String getOfferId() {
    return offerId;
  }
  public void setOfferId(String offerId) {
    this.offerId = offerId;
  }

    
  @JsonProperty("errors")
  public List<OfferMappingErrorDTO> getErrors() {
    return errors;
  }
  public void setErrors(List<OfferMappingErrorDTO> errors) {
    this.errors = errors;
  }

    
  @JsonProperty("warnings")
  public List<OfferMappingErrorDTO> getWarnings() {
    return warnings;
  }
  public void setWarnings(List<OfferMappingErrorDTO> warnings) {
    this.warnings = warnings;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateOfferMappingResultDTO updateOfferMappingResultDTO = (UpdateOfferMappingResultDTO) o;
    return Objects.equals(offerId, updateOfferMappingResultDTO.offerId) &&
        Objects.equals(errors, updateOfferMappingResultDTO.errors) &&
        Objects.equals(warnings, updateOfferMappingResultDTO.warnings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offerId, errors, warnings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateOfferMappingResultDTO {\n");
    
    sb.append("    offerId: ").append(toIndentedString(offerId)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    warnings: ").append(toIndentedString(warnings)).append("\n");
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
