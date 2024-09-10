package apimodels;

import apimodels.RejectedPromoOfferUpdateDTO;
import apimodels.WarningPromoOfferUpdateDTO;
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
 * Ошибки и предупреждения, которые появились при добавлении товаров в акцию.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class UpdatePromoOffersResultDTO   {
  @JsonProperty("rejectedOffers")
  @Valid

  private List<@Valid RejectedPromoOfferUpdateDTO> rejectedOffers = null;

  @JsonProperty("warningOffers")
  @Valid

  private List<@Valid WarningPromoOfferUpdateDTO> warningOffers = null;

  public UpdatePromoOffersResultDTO rejectedOffers(List<@Valid RejectedPromoOfferUpdateDTO> rejectedOffers) {
    this.rejectedOffers = rejectedOffers;
    return this;
  }

  public UpdatePromoOffersResultDTO addRejectedOffersItem(RejectedPromoOfferUpdateDTO rejectedOffersItem) {
    if (this.rejectedOffers == null) {
      this.rejectedOffers = new ArrayList<>();
    }
    this.rejectedOffers.add(rejectedOffersItem);
    return this;
  }

   /**
   * Изменения, которые были отклонены.  Возвращается, только если есть отклоненные изменения. 
   * @return rejectedOffers
  **/
  public List<@Valid RejectedPromoOfferUpdateDTO> getRejectedOffers() {
    return rejectedOffers;
  }

  public void setRejectedOffers(List<@Valid RejectedPromoOfferUpdateDTO> rejectedOffers) {
    this.rejectedOffers = rejectedOffers;
  }

  public UpdatePromoOffersResultDTO warningOffers(List<@Valid WarningPromoOfferUpdateDTO> warningOffers) {
    this.warningOffers = warningOffers;
    return this;
  }

  public UpdatePromoOffersResultDTO addWarningOffersItem(WarningPromoOfferUpdateDTO warningOffersItem) {
    if (this.warningOffers == null) {
      this.warningOffers = new ArrayList<>();
    }
    this.warningOffers.add(warningOffersItem);
    return this;
  }

   /**
   * Изменения, по которым есть предупреждения. Они информируют о возможных проблемах. Информация о товарах обновится.  Возвращается, только если есть предупреждения. 
   * @return warningOffers
  **/
  public List<@Valid WarningPromoOfferUpdateDTO> getWarningOffers() {
    return warningOffers;
  }

  public void setWarningOffers(List<@Valid WarningPromoOfferUpdateDTO> warningOffers) {
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

