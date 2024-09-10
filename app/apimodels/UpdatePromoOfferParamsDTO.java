package apimodels;

import apimodels.UpdatePromoOfferDiscountParamsDTO;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Параметры товара, который участвует в акции.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class UpdatePromoOfferParamsDTO   {
  @JsonProperty("discountParams")
  @Valid

  private UpdatePromoOfferDiscountParamsDTO discountParams;

  public UpdatePromoOfferParamsDTO discountParams(UpdatePromoOfferDiscountParamsDTO discountParams) {
    this.discountParams = discountParams;
    return this;
  }

   /**
   * Get discountParams
   * @return discountParams
  **/
  public UpdatePromoOfferDiscountParamsDTO getDiscountParams() {
    return discountParams;
  }

  public void setDiscountParams(UpdatePromoOfferDiscountParamsDTO discountParams) {
    this.discountParams = discountParams;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdatePromoOfferParamsDTO updatePromoOfferParamsDTO = (UpdatePromoOfferParamsDTO) o;
    return Objects.equals(discountParams, updatePromoOfferParamsDTO.discountParams);
  }

  @Override
  public int hashCode() {
    return Objects.hash(discountParams);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdatePromoOfferParamsDTO {\n");
    
    sb.append("    discountParams: ").append(toIndentedString(discountParams)).append("\n");
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

