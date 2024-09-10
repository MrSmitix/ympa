package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.vertxweb.server.model.RejectedPromoOfferDeleteDTO;

/**
 * Результат удаления товаров из акции.  Возвращается, только если в запросе был передан параметр &#x60;offerIds&#x60;. 
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeletePromoOffersResultDTO   {
  
  private List<RejectedPromoOfferDeleteDTO> rejectedOffers;

  public DeletePromoOffersResultDTO () {

  }

  public DeletePromoOffersResultDTO (List<RejectedPromoOfferDeleteDTO> rejectedOffers) {
    this.rejectedOffers = rejectedOffers;
  }

    
  @JsonProperty("rejectedOffers")
  public List<RejectedPromoOfferDeleteDTO> getRejectedOffers() {
    return rejectedOffers;
  }
  public void setRejectedOffers(List<RejectedPromoOfferDeleteDTO> rejectedOffers) {
    this.rejectedOffers = rejectedOffers;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeletePromoOffersResultDTO deletePromoOffersResultDTO = (DeletePromoOffersResultDTO) o;
    return Objects.equals(rejectedOffers, deletePromoOffersResultDTO.rejectedOffers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rejectedOffers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeletePromoOffersResultDTO {\n");
    
    sb.append("    rejectedOffers: ").append(toIndentedString(rejectedOffers)).append("\n");
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
