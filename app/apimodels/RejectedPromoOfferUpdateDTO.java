package apimodels;

import apimodels.RejectedPromoOfferUpdateReasonType;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Описание отклоненного изменения.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class RejectedPromoOfferUpdateDTO   {
  @JsonProperty("offerId")
  @NotNull
@Pattern(regexp="^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")
@Size(min=1,max=255)

  private String offerId;

  @JsonProperty("reason")
  @NotNull
@Valid

  private RejectedPromoOfferUpdateReasonType reason;

  public RejectedPromoOfferUpdateDTO offerId(String offerId) {
    this.offerId = offerId;
    return this;
  }

   /**
   * Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
   * @return offerId
  **/
  public String getOfferId() {
    return offerId;
  }

  public void setOfferId(String offerId) {
    this.offerId = offerId;
  }

  public RejectedPromoOfferUpdateDTO reason(RejectedPromoOfferUpdateReasonType reason) {
    this.reason = reason;
    return this;
  }

   /**
   * Get reason
   * @return reason
  **/
  public RejectedPromoOfferUpdateReasonType getReason() {
    return reason;
  }

  public void setReason(RejectedPromoOfferUpdateReasonType reason) {
    this.reason = reason;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RejectedPromoOfferUpdateDTO rejectedPromoOfferUpdateDTO = (RejectedPromoOfferUpdateDTO) o;
    return Objects.equals(offerId, rejectedPromoOfferUpdateDTO.offerId) &&
        Objects.equals(reason, rejectedPromoOfferUpdateDTO.reason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offerId, reason);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RejectedPromoOfferUpdateDTO {\n");
    
    sb.append("    offerId: ").append(toIndentedString(offerId)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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

