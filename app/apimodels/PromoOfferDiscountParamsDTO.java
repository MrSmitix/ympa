package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Параметры товара в акции с типом &#x60;DIRECT_DISCOUNT&#x60; или &#x60;BLUE_FLASH&#x60;.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class PromoOfferDiscountParamsDTO   {
  @JsonProperty("price")
  
  private Long price;

  @JsonProperty("promoPrice")
  
  private Long promoPrice;

  @JsonProperty("maxPromoPrice")
  @NotNull

  private Long maxPromoPrice;

  public PromoOfferDiscountParamsDTO price(Long price) {
    this.price = price;
    return this;
  }

   /**
   * Зачеркнутая цена — та, по которой товар продавался до акции.  Указывается в рублях.  Возвращается, только если товар участвует в акции. 
   * @return price
  **/
  public Long getPrice() {
    return price;
  }

  public void setPrice(Long price) {
    this.price = price;
  }

  public PromoOfferDiscountParamsDTO promoPrice(Long promoPrice) {
    this.promoPrice = promoPrice;
    return this;
  }

   /**
   * Цена по акции — та, по которой вы хотите продавать товар.  Указывается в рублях.  Возвращается, только если товар участвует в акции. 
   * @return promoPrice
  **/
  public Long getPromoPrice() {
    return promoPrice;
  }

  public void setPromoPrice(Long promoPrice) {
    this.promoPrice = promoPrice;
  }

  public PromoOfferDiscountParamsDTO maxPromoPrice(Long maxPromoPrice) {
    this.maxPromoPrice = maxPromoPrice;
    return this;
  }

   /**
   * Максимально возможная цена для участия в акции.  Указывается в рублях.  Возвращается для всех товаров. 
   * @return maxPromoPrice
  **/
  public Long getMaxPromoPrice() {
    return maxPromoPrice;
  }

  public void setMaxPromoPrice(Long maxPromoPrice) {
    this.maxPromoPrice = maxPromoPrice;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PromoOfferDiscountParamsDTO promoOfferDiscountParamsDTO = (PromoOfferDiscountParamsDTO) o;
    return Objects.equals(price, promoOfferDiscountParamsDTO.price) &&
        Objects.equals(promoPrice, promoOfferDiscountParamsDTO.promoPrice) &&
        Objects.equals(maxPromoPrice, promoOfferDiscountParamsDTO.maxPromoPrice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(price, promoPrice, maxPromoPrice);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PromoOfferDiscountParamsDTO {\n");
    
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    promoPrice: ").append(toIndentedString(promoPrice)).append("\n");
    sb.append("    maxPromoPrice: ").append(toIndentedString(maxPromoPrice)).append("\n");
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

