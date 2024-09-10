package apimodels;

import apimodels.RejectedPromoOfferDeleteDTO;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Результат удаления товаров из акции.  Возвращается, только если в запросе был передан параметр &#x60;offerIds&#x60;. 
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class DeletePromoOffersResultDTO   {
  @JsonProperty("rejectedOffers")
  @Valid

  private List<@Valid RejectedPromoOfferDeleteDTO> rejectedOffers = null;

  public DeletePromoOffersResultDTO rejectedOffers(List<@Valid RejectedPromoOfferDeleteDTO> rejectedOffers) {
    this.rejectedOffers = rejectedOffers;
    return this;
  }

  public DeletePromoOffersResultDTO addRejectedOffersItem(RejectedPromoOfferDeleteDTO rejectedOffersItem) {
    if (this.rejectedOffers == null) {
      this.rejectedOffers = new ArrayList<>();
    }
    this.rejectedOffers.add(rejectedOffersItem);
    return this;
  }

   /**
   * Товары, при удалении которых появились ошибки.  Возвращается, только если есть такие товары. 
   * @return rejectedOffers
  **/
  public List<@Valid RejectedPromoOfferDeleteDTO> getRejectedOffers() {
    return rejectedOffers;
  }

  public void setRejectedOffers(List<@Valid RejectedPromoOfferDeleteDTO> rejectedOffers) {
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

