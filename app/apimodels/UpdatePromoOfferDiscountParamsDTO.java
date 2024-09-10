package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Параметры товара в акции с типом &#x60;DIRECT_DISCOUNT&#x60; или &#x60;BLUE_FLASH&#x60;.  Обязательный параметр для акций с этими типами. 
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class UpdatePromoOfferDiscountParamsDTO   {
  @JsonProperty("price")
  @DecimalMin("1")

  private Long price;

  @JsonProperty("promoPrice")
  @DecimalMin("1")

  private Long promoPrice;

  public UpdatePromoOfferDiscountParamsDTO price(Long price) {
    this.price = price;
    return this;
  }

   /**
   * Зачеркнутая цена — та, по которой товар продавался до акции.  Указывается в рублях.  Число должно быть целым. 
   * minimum: 1
   * @return price
  **/
  public Long getPrice() {
    return price;
  }

  public void setPrice(Long price) {
    this.price = price;
  }

  public UpdatePromoOfferDiscountParamsDTO promoPrice(Long promoPrice) {
    this.promoPrice = promoPrice;
    return this;
  }

   /**
   * Цена по акции — та, по которой вы хотите продавать товар.  Указывается в рублях.  Число должно быть целым. 
   * minimum: 1
   * @return promoPrice
  **/
  public Long getPromoPrice() {
    return promoPrice;
  }

  public void setPromoPrice(Long promoPrice) {
    this.promoPrice = promoPrice;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdatePromoOfferDiscountParamsDTO updatePromoOfferDiscountParamsDTO = (UpdatePromoOfferDiscountParamsDTO) o;
    return Objects.equals(price, updatePromoOfferDiscountParamsDTO.price) &&
        Objects.equals(promoPrice, updatePromoOfferDiscountParamsDTO.promoPrice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(price, promoPrice);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdatePromoOfferDiscountParamsDTO {\n");
    
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    promoPrice: ").append(toIndentedString(promoPrice)).append("\n");
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

