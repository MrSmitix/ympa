package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.BasePriceDTO;
import org.openapitools.model.PriceQuarantineVerdictDTO;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Товар в карантине.
 */

@Schema(name = "QuarantineOfferDTO", description = "Товар в карантине.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-09T22:33:46.054383208Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class QuarantineOfferDTO {

  private String offerId;

  private BasePriceDTO currentPrice;

  private BasePriceDTO lastValidPrice;

  @Valid
  private JsonNullable<List<@Valid PriceQuarantineVerdictDTO>> verdicts = JsonNullable.<List<@Valid PriceQuarantineVerdictDTO>>undefined();

  public QuarantineOfferDTO offerId(String offerId) {
    this.offerId = offerId;
    return this;
  }

  /**
   * Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
   * @return offerId
   */
  @Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$") @Size(min = 1, max = 255) 
  @Schema(name = "offerId", description = "Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("offerId")
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
   */
  @Valid 
  @Schema(name = "currentPrice", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("currentPrice")
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
   */
  @Valid 
  @Schema(name = "lastValidPrice", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lastValidPrice")
  public BasePriceDTO getLastValidPrice() {
    return lastValidPrice;
  }

  public void setLastValidPrice(BasePriceDTO lastValidPrice) {
    this.lastValidPrice = lastValidPrice;
  }

  public QuarantineOfferDTO verdicts(List<@Valid PriceQuarantineVerdictDTO> verdicts) {
    this.verdicts = JsonNullable.of(verdicts);
    return this;
  }

  public QuarantineOfferDTO addVerdictsItem(PriceQuarantineVerdictDTO verdictsItem) {
    if (this.verdicts == null || !this.verdicts.isPresent()) {
      this.verdicts = JsonNullable.of(new ArrayList<>());
    }
    this.verdicts.get().add(verdictsItem);
    return this;
  }

  /**
   * Причины попадания товара в карантин.
   * @return verdicts
   */
  @Valid 
  @Schema(name = "verdicts", description = "Причины попадания товара в карантин.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("verdicts")
  public JsonNullable<List<@Valid PriceQuarantineVerdictDTO>> getVerdicts() {
    return verdicts;
  }

  public void setVerdicts(JsonNullable<List<@Valid PriceQuarantineVerdictDTO>> verdicts) {
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
    return Objects.equals(this.offerId, quarantineOfferDTO.offerId) &&
        Objects.equals(this.currentPrice, quarantineOfferDTO.currentPrice) &&
        Objects.equals(this.lastValidPrice, quarantineOfferDTO.lastValidPrice) &&
        equalsNullable(this.verdicts, quarantineOfferDTO.verdicts);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(offerId, currentPrice, lastValidPrice, hashCodeNullable(verdicts));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
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

