package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.vertxweb.server.model.RejectedPromoOfferUpdateDTO;
import org.openapitools.vertxweb.server.model.WarningPromoOfferUpdateDTO;

/**
 * Ошибки и предупреждения, которые появились при добавлении товаров в акцию.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdatePromoOffersResultDTO   {
  
  private List<RejectedPromoOfferUpdateDTO> rejectedOffers;
  private List<WarningPromoOfferUpdateDTO> warningOffers;

  public UpdatePromoOffersResultDTO () {

  }

  public UpdatePromoOffersResultDTO (List<RejectedPromoOfferUpdateDTO> rejectedOffers, List<WarningPromoOfferUpdateDTO> warningOffers) {
    this.rejectedOffers = rejectedOffers;
    this.warningOffers = warningOffers;
  }

    
  @JsonProperty("rejectedOffers")
  public List<RejectedPromoOfferUpdateDTO> getRejectedOffers() {
    return rejectedOffers;
  }
  public void setRejectedOffers(List<RejectedPromoOfferUpdateDTO> rejectedOffers) {
    this.rejectedOffers = rejectedOffers;
  }

    
  @JsonProperty("warningOffers")
  public List<WarningPromoOfferUpdateDTO> getWarningOffers() {
    return warningOffers;
  }
  public void setWarningOffers(List<WarningPromoOfferUpdateDTO> warningOffers) {
    this.warningOffers = warningOffers;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdatePromoOffersResultDTO updatePromoOffersResultDTO = (UpdatePromoOffersResultDTO) o;
    return Objects.equals(rejectedOffers, updatePromoOffersResultDTO.rejectedOffers) &&
        Objects.equals(warningOffers, updatePromoOffersResultDTO.warningOffers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rejectedOffers, warningOffers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdatePromoOffersResultDTO {\n");
    
    sb.append("    rejectedOffers: ").append(toIndentedString(rejectedOffers)).append("\n");
    sb.append("    warningOffers: ").append(toIndentedString(warningOffers)).append("\n");
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
