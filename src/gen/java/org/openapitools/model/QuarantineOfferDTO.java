package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.BasePriceDTO;
import org.openapitools.model.PriceQuarantineVerdictDTO;



/**
 * Товар в карантине.
 **/

@ApiModel(description = "Товар в карантине.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-09-09T22:20:23.877037640Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class QuarantineOfferDTO   {
  @JsonProperty("offerId")
  private String offerId;

  @JsonProperty("currentPrice")
  private BasePriceDTO currentPrice;

  @JsonProperty("lastValidPrice")
  private BasePriceDTO lastValidPrice;

  @JsonProperty("verdicts")
  private List<PriceQuarantineVerdictDTO> verdicts = null;

  /**
   * Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
   **/
  public QuarantineOfferDTO offerId(String offerId) {
    this.offerId = offerId;
    return this;
  }

  
  @ApiModelProperty(value = "Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) ")
  @JsonProperty("offerId")
  public String getOfferId() {
    return offerId;
  }
  public void setOfferId(String offerId) {
    this.offerId = offerId;
  }

  /**
   **/
  public QuarantineOfferDTO currentPrice(BasePriceDTO currentPrice) {
    this.currentPrice = currentPrice;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("currentPrice")
  public BasePriceDTO getCurrentPrice() {
    return currentPrice;
  }
  public void setCurrentPrice(BasePriceDTO currentPrice) {
    this.currentPrice = currentPrice;
  }

  /**
   **/
  public QuarantineOfferDTO lastValidPrice(BasePriceDTO lastValidPrice) {
    this.lastValidPrice = lastValidPrice;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("lastValidPrice")
  public BasePriceDTO getLastValidPrice() {
    return lastValidPrice;
  }
  public void setLastValidPrice(BasePriceDTO lastValidPrice) {
    this.lastValidPrice = lastValidPrice;
  }

  /**
   * Причины попадания товара в карантин.
   **/
  public QuarantineOfferDTO verdicts(List<PriceQuarantineVerdictDTO> verdicts) {
    this.verdicts = verdicts;
    return this;
  }

  
  @ApiModelProperty(value = "Причины попадания товара в карантин.")
  @JsonProperty("verdicts")
  public List<PriceQuarantineVerdictDTO> getVerdicts() {
    return verdicts;
  }
  public void setVerdicts(List<PriceQuarantineVerdictDTO> verdicts) {
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

