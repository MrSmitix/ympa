package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.api.model.OfferContentErrorDTO;

/**
 * Ошибки и предупреждения, которые появились из-за переданных характеристик.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateOfferContentResultDTO   {
  
  private String offerId;
  private List<OfferContentErrorDTO> errors;
  private List<OfferContentErrorDTO> warnings;

  public UpdateOfferContentResultDTO () {

  }

  public UpdateOfferContentResultDTO (String offerId, List<OfferContentErrorDTO> errors, List<OfferContentErrorDTO> warnings) {
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
  public List<OfferContentErrorDTO> getErrors() {
    return errors;
  }
  public void setErrors(List<OfferContentErrorDTO> errors) {
    this.errors = errors;
  }

    
  @JsonProperty("warnings")
  public List<OfferContentErrorDTO> getWarnings() {
    return warnings;
  }
  public void setWarnings(List<OfferContentErrorDTO> warnings) {
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
    UpdateOfferContentResultDTO updateOfferContentResultDTO = (UpdateOfferContentResultDTO) o;
    return Objects.equals(offerId, updateOfferContentResultDTO.offerId) &&
        Objects.equals(errors, updateOfferContentResultDTO.errors) &&
        Objects.equals(warnings, updateOfferContentResultDTO.warnings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offerId, errors, warnings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateOfferContentResultDTO {\n");
    
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
