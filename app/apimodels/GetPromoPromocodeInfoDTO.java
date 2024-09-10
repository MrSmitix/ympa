package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Информация для типа &#x60;MARKET_PROMOCODE&#x60;.  Параметр заполняется только для этого типа акции. 
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class GetPromoPromocodeInfoDTO   {
  @JsonProperty("promocode")
  @NotNull

  private String promocode;

  @JsonProperty("discount")
  @NotNull

  private Integer discount;

  public GetPromoPromocodeInfoDTO promocode(String promocode) {
    this.promocode = promocode;
    return this;
  }

   /**
   * Промокод.
   * @return promocode
  **/
  public String getPromocode() {
    return promocode;
  }

  public void setPromocode(String promocode) {
    this.promocode = promocode;
  }

  public GetPromoPromocodeInfoDTO discount(Integer discount) {
    this.discount = discount;
    return this;
  }

   /**
   * Процент скидки по промокоду.
   * @return discount
  **/
  public Integer getDiscount() {
    return discount;
  }

  public void setDiscount(Integer discount) {
    this.discount = discount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetPromoPromocodeInfoDTO getPromoPromocodeInfoDTO = (GetPromoPromocodeInfoDTO) o;
    return Objects.equals(promocode, getPromoPromocodeInfoDTO.promocode) &&
        Objects.equals(discount, getPromoPromocodeInfoDTO.discount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(promocode, discount);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetPromoPromocodeInfoDTO {\n");
    
    sb.append("    promocode: ").append(toIndentedString(promocode)).append("\n");
    sb.append("    discount: ").append(toIndentedString(discount)).append("\n");
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

