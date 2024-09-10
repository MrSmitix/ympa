package apimodels;

import apimodels.BasePriceDTO;
import apimodels.PriceQuarantineVerdictDTO;
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
 * Товар в карантине.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class QuarantineOfferDTO   {
  @JsonProperty("offerId")
  @Pattern(regexp="^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")
@Size(min=1,max=255)

  private String offerId;

  @JsonProperty("currentPrice")
  @Valid

  private BasePriceDTO currentPrice;

  @JsonProperty("lastValidPrice")
  @Valid

  private BasePriceDTO lastValidPrice;

  @JsonProperty("verdicts")
  @Valid

  private List<@Valid PriceQuarantineVerdictDTO> verdicts = null;

  public QuarantineOfferDTO offerId(String offerId) {
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

  public QuarantineOfferDTO currentPrice(BasePriceDTO currentPrice) {
    this.currentPrice = currentPrice;
    return this;
  }

   /**
   * Get currentPrice
   * @return currentPrice
  **/
  public BasePriceDTO getCurrentPrice() {
    return currentPrice;
  }

  public void setCurrentPrice(BasePriceDTO currentPrice) {
    this.currentPrice = currentPrice;
  }

  public QuarantineOfferDTO lastValidPrice(BasePriceDTO lastValidPrice) {
    this.lastValidPrice = lastValidPrice;
    return this;
  }

   /**
   * Get lastValidPrice
   * @return lastValidPrice
  **/
  public BasePriceDTO getLastValidPrice() {
    return lastValidPrice;
  }

  public void setLastValidPrice(BasePriceDTO lastValidPrice) {
    this.lastValidPrice = lastValidPrice;
  }

  public QuarantineOfferDTO verdicts(List<@Valid PriceQuarantineVerdictDTO> verdicts) {
    this.verdicts = verdicts;
    return this;
  }

  public QuarantineOfferDTO addVerdictsItem(PriceQuarantineVerdictDTO verdictsItem) {
    if (this.verdicts == null) {
      this.verdicts = new ArrayList<>();
    }
    this.verdicts.add(verdictsItem);
    return this;
  }

   /**
   * Причины попадания товара в карантин.
   * @return verdicts
  **/
  public List<@Valid PriceQuarantineVerdictDTO> getVerdicts() {
    return verdicts;
  }

  public void setVerdicts(List<@Valid PriceQuarantineVerdictDTO> verdicts) {
    this.verdicts = verdicts;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuarantineOfferDTO quarantineOfferDTO = (QuarantineOfferDTO) o;
    return Objects.equals(offerId, quarantineOfferDTO.offerId) &&
        Objects.equals(currentPrice, quarantineOfferDTO.currentPrice) &&
        Objects.equals(lastValidPrice, quarantineOfferDTO.lastValidPrice) &&
        Objects.equals(verdicts, quarantineOfferDTO.verdicts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offerId, currentPrice, lastValidPrice, verdicts);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuarantineOfferDTO {\n");
    
    sb.append("    offerId: ").append(toIndentedString(offerId)).append("\n");
    sb.append("    currentPrice: ").append(toIndentedString(currentPrice)).append("\n");
    sb.append("    lastValidPrice: ").append(toIndentedString(lastValidPrice)).append("\n");
    sb.append("    verdicts: ").append(toIndentedString(verdicts)).append("\n");
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

