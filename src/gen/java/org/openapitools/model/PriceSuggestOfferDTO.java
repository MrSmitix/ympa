package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.PriceSuggestDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Товар с ценами для продвижения.
 */
@ApiModel(description="Товар с ценами для продвижения.")

public class PriceSuggestOfferDTO  {
  
 /**
  * SKU на Маркете.
  */
  @ApiModelProperty(value = "SKU на Маркете.")
  private Long marketSku;

 /**
  * Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
  */
  @ApiModelProperty(value = "Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) ")
  private String offerId;

 /**
  * Цены для продвижения. 
  */
  @ApiModelProperty(value = "Цены для продвижения. ")
  @Valid
  private List<@Valid PriceSuggestDTO> priceSuggestion;
 /**
  * SKU на Маркете.
  * @return marketSku
  */
  @JsonProperty("marketSku")
  public Long getMarketSku() {
    return marketSku;
  }

  /**
   * Sets the <code>marketSku</code> property.
   */
 public void setMarketSku(Long marketSku) {
    this.marketSku = marketSku;
  }

  /**
   * Sets the <code>marketSku</code> property.
   */
  public PriceSuggestOfferDTO marketSku(Long marketSku) {
    this.marketSku = marketSku;
    return this;
  }

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
  public PriceSuggestOfferDTO offerId(String offerId) {
    this.offerId = offerId;
    return this;
  }

 /**
  * Цены для продвижения. 
  * @return priceSuggestion
  */
  @JsonProperty("priceSuggestion")
  public List<@Valid PriceSuggestDTO> getPriceSuggestion() {
    return priceSuggestion;
  }

  /**
   * Sets the <code>priceSuggestion</code> property.
   */
 public void setPriceSuggestion(List<@Valid PriceSuggestDTO> priceSuggestion) {
    this.priceSuggestion = priceSuggestion;
  }

  /**
   * Sets the <code>priceSuggestion</code> property.
   */
  public PriceSuggestOfferDTO priceSuggestion(List<@Valid PriceSuggestDTO> priceSuggestion) {
    this.priceSuggestion = priceSuggestion;
    return this;
  }

  /**
   * Adds a new item to the <code>priceSuggestion</code> list.
   */
  public PriceSuggestOfferDTO addPriceSuggestionItem(PriceSuggestDTO priceSuggestionItem) {
    this.priceSuggestion.add(priceSuggestionItem);
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
    PriceSuggestOfferDTO priceSuggestOfferDTO = (PriceSuggestOfferDTO) o;
    return Objects.equals(this.marketSku, priceSuggestOfferDTO.marketSku) &&
        Objects.equals(this.offerId, priceSuggestOfferDTO.offerId) &&
        Objects.equals(this.priceSuggestion, priceSuggestOfferDTO.priceSuggestion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(marketSku, offerId, priceSuggestion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PriceSuggestOfferDTO {\n");
    
    sb.append("    marketSku: ").append(toIndentedString(marketSku)).append("\n");
    sb.append("    offerId: ").append(toIndentedString(offerId)).append("\n");
    sb.append("    priceSuggestion: ").append(toIndentedString(priceSuggestion)).append("\n");
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

