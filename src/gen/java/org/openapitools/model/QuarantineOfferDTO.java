package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.BasePriceDTO;
import org.openapitools.model.PriceQuarantineVerdictDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Товар в карантине.
 */
@ApiModel(description="Товар в карантине.")

public class QuarantineOfferDTO  {
  
 /**
  * Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
  */
  @ApiModelProperty(value = "Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) ")
  private String offerId;

  @ApiModelProperty(value = "")
  @Valid
  private BasePriceDTO currentPrice;

  @ApiModelProperty(value = "")
  @Valid
  private BasePriceDTO lastValidPrice;

 /**
  * Причины попадания товара в карантин.
  */
  @ApiModelProperty(value = "Причины попадания товара в карантин.")
  @Valid
  private List<@Valid PriceQuarantineVerdictDTO> verdicts;
 /**
  * Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
  * @return offerId
  */
  @JsonProperty("offerId")
 @Pattern(regexp="^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$") @Size(min=1,max=255)  public String getOfferId() {
    return offerId;
  }

  /**
   * Sets the <code>offerId</code> property.
   */
 public void setOfferId(String offerId) {
    this.offerId = offerId;
  }

  /**
   * Sets the <code>offerId</code> property.
   */
  public QuarantineOfferDTO offerId(String offerId) {
    this.offerId = offerId;
    return this;
  }

 /**
  * Get currentPrice
  * @return currentPrice
  */
  @JsonProperty("currentPrice")
  public BasePriceDTO getCurrentPrice() {
    return currentPrice;
  }

  /**
   * Sets the <code>currentPrice</code> property.
   */
 public void setCurrentPrice(BasePriceDTO currentPrice) {
    this.currentPrice = currentPrice;
  }

  /**
   * Sets the <code>currentPrice</code> property.
   */
  public QuarantineOfferDTO currentPrice(BasePriceDTO currentPrice) {
    this.currentPrice = currentPrice;
    return this;
  }

 /**
  * Get lastValidPrice
  * @return lastValidPrice
  */
  @JsonProperty("lastValidPrice")
  public BasePriceDTO getLastValidPrice() {
    return lastValidPrice;
  }

  /**
   * Sets the <code>lastValidPrice</code> property.
   */
 public void setLastValidPrice(BasePriceDTO lastValidPrice) {
    this.lastValidPrice = lastValidPrice;
  }

  /**
   * Sets the <code>lastValidPrice</code> property.
   */
  public QuarantineOfferDTO lastValidPrice(BasePriceDTO lastValidPrice) {
    this.lastValidPrice = lastValidPrice;
    return this;
  }

 /**
  * Причины попадания товара в карантин.
  * @return verdicts
  */
  @JsonProperty("verdicts")
  public List<@Valid PriceQuarantineVerdictDTO> getVerdicts() {
    return verdicts;
  }

  /**
   * Sets the <code>verdicts</code> property.
   */
 public void setVerdicts(List<@Valid PriceQuarantineVerdictDTO> verdicts) {
    this.verdicts = verdicts;
  }

  /**
   * Sets the <code>verdicts</code> property.
   */
  public QuarantineOfferDTO verdicts(List<@Valid PriceQuarantineVerdictDTO> verdicts) {
    this.verdicts = verdicts;
    return this;
  }

  /**
   * Adds a new item to the <code>verdicts</code> list.
   */
  public QuarantineOfferDTO addVerdictsItem(PriceQuarantineVerdictDTO verdictsItem) {
    this.verdicts.add(verdictsItem);
    return this;
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
    return Objects.equals(this.offerId, quarantineOfferDTO.offerId) &&
        Objects.equals(this.currentPrice, quarantineOfferDTO.currentPrice) &&
        Objects.equals(this.lastValidPrice, quarantineOfferDTO.lastValidPrice) &&
        Objects.equals(this.verdicts, quarantineOfferDTO.verdicts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offerId, currentPrice, lastValidPrice, verdicts);
  }

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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

