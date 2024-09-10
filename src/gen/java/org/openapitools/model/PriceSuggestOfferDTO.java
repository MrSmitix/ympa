package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.PriceSuggestDTO;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Товар с ценами для продвижения.
 **/
@ApiModel(description="Товар с ценами для продвижения.")

public class PriceSuggestOfferDTO  {
  
  @ApiModelProperty(value = "SKU на Маркете.")
 /**
   * SKU на Маркете.
  **/
  private Long marketSku;

  @ApiModelProperty(value = "Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) ")
 /**
   * Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
  **/
  private String offerId;

  @ApiModelProperty(value = "Цены для продвижения. ")
 /**
   * Цены для продвижения. 
  **/
  private List<PriceSuggestDTO> priceSuggestion;
 /**
   * SKU на Маркете.
   * @return marketSku
  **/
  @JsonProperty("marketSku")
  public Long getMarketSku() {
    return marketSku;
  }

  public void setMarketSku(Long marketSku) {
    this.marketSku = marketSku;
  }

  public PriceSuggestOfferDTO marketSku(Long marketSku) {
    this.marketSku = marketSku;
    return this;
  }

 /**
   * Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
   * @return offerId
  **/
  @JsonProperty("offerId")
  public String getOfferId() {
    return offerId;
  }

  public void setOfferId(String offerId) {
    this.offerId = offerId;
  }

  public PriceSuggestOfferDTO offerId(String offerId) {
    this.offerId = offerId;
    return this;
  }

 /**
   * Цены для продвижения. 
   * @return priceSuggestion
  **/
  @JsonProperty("priceSuggestion")
  public List<PriceSuggestDTO> getPriceSuggestion() {
    return priceSuggestion;
  }

  public void setPriceSuggestion(List<PriceSuggestDTO> priceSuggestion) {
    this.priceSuggestion = priceSuggestion;
  }

  public PriceSuggestOfferDTO priceSuggestion(List<PriceSuggestDTO> priceSuggestion) {
    this.priceSuggestion = priceSuggestion;
    return this;
  }

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

