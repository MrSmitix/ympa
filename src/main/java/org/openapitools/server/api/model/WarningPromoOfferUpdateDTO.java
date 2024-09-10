package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.api.model.PromoOfferUpdateWarningDTO;

/**
 * Описание предупреждения, которое появилось при добавлении товара.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class WarningPromoOfferUpdateDTO   {
  
  private String offerId;
  private List<PromoOfferUpdateWarningDTO> warnings = new ArrayList<>();

  public WarningPromoOfferUpdateDTO () {

  }

  public WarningPromoOfferUpdateDTO (String offerId, List<PromoOfferUpdateWarningDTO> warnings) {
    this.offerId = offerId;
    this.warnings = warnings;
  }

    
  @JsonProperty("offerId")
  public String getOfferId() {
    return offerId;
  }
  public void setOfferId(String offerId) {
    this.offerId = offerId;
  }

    
  @JsonProperty("warnings")
  public List<PromoOfferUpdateWarningDTO> getWarnings() {
    return warnings;
  }
  public void setWarnings(List<PromoOfferUpdateWarningDTO> warnings) {
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
    WarningPromoOfferUpdateDTO warningPromoOfferUpdateDTO = (WarningPromoOfferUpdateDTO) o;
    return Objects.equals(offerId, warningPromoOfferUpdateDTO.offerId) &&
        Objects.equals(warnings, warningPromoOfferUpdateDTO.warnings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offerId, warnings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WarningPromoOfferUpdateDTO {\n");
    
    sb.append("    offerId: ").append(toIndentedString(offerId)).append("\n");
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
