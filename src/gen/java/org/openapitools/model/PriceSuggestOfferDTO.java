package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.PriceSuggestDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Товар с ценами для продвижения.
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "Товар с ценами для продвижения.")
public class PriceSuggestOfferDTO   {
  
  private Long marketSku;

  private String offerId;

  private List<@Valid PriceSuggestDTO> priceSuggestion;

  /**
   * SKU на Маркете.
   **/
  public PriceSuggestOfferDTO marketSku(Long marketSku) {
    this.marketSku = marketSku;
    return this;
  }

  
  @ApiModelProperty(value = "SKU на Маркете.")
  @JsonProperty("marketSku")
  public Long getMarketSku() {
    return marketSku;
  }
  public void setMarketSku(Long marketSku) {
    this.marketSku = marketSku;
  }


  /**
   * Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
   **/
  public PriceSuggestOfferDTO offerId(String offerId) {
    this.offerId = offerId;
    return this;
  }

  
  @ApiModelProperty(value = "Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) ")
  @JsonProperty("offerId")
 @Pattern(regexp="^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$") @Size(min=1,max=255)  public String getOfferId() {
    return offerId;
  }
  public void setOfferId(String offerId) {
    this.offerId = offerId;
  }


  /**
   * Цены для продвижения. 
   **/
  public PriceSuggestOfferDTO priceSuggestion(List<@Valid PriceSuggestDTO> priceSuggestion) {
    this.priceSuggestion = priceSuggestion;
    return this;
  }

  
  @ApiModelProperty(value = "Цены для продвижения. ")
  @JsonProperty("priceSuggestion")
  public List<@Valid PriceSuggestDTO> getPriceSuggestion() {
    return priceSuggestion;
  }
  public void setPriceSuggestion(List<@Valid PriceSuggestDTO> priceSuggestion) {
    this.priceSuggestion = priceSuggestion;
  }

  public PriceSuggestOfferDTO addPriceSuggestionItem(PriceSuggestDTO priceSuggestionItem) {
    if (this.priceSuggestion == null) {
      this.priceSuggestion = new ArrayList<>();
    }
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

