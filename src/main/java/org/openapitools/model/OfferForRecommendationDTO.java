/*
 * Партнерский API Маркета
 *
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * OpenAPI document version: LATEST
 * 
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.BasePriceDTO;
import org.openapitools.model.GetPriceDTO;
import org.openapitools.model.PriceCompetitivenessType;



/**
 * Информация о состоянии цены на товар.
 */

@ApiModel(description = "Информация о состоянии цены на товар.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2024-09-09T22:22:14.220683748Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class OfferForRecommendationDTO   {
  
  private String offerId;
  private BasePriceDTO price;
  private GetPriceDTO cofinancePrice;
  private PriceCompetitivenessType competitiveness;
  private Long shows;

  /**
   * Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
   */
  public OfferForRecommendationDTO offerId(String offerId) {
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
   */
  public OfferForRecommendationDTO price(BasePriceDTO price) {
    this.price = price;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("price")
  public BasePriceDTO getPrice() {
    return price;
  }
  public void setPrice(BasePriceDTO price) {
    this.price = price;
  }

  /**
   */
  public OfferForRecommendationDTO cofinancePrice(GetPriceDTO cofinancePrice) {
    this.cofinancePrice = cofinancePrice;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("cofinancePrice")
  public GetPriceDTO getCofinancePrice() {
    return cofinancePrice;
  }
  public void setCofinancePrice(GetPriceDTO cofinancePrice) {
    this.cofinancePrice = cofinancePrice;
  }

  /**
   */
  public OfferForRecommendationDTO competitiveness(PriceCompetitivenessType competitiveness) {
    this.competitiveness = competitiveness;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("competitiveness")
  public PriceCompetitivenessType getCompetitiveness() {
    return competitiveness;
  }
  public void setCompetitiveness(PriceCompetitivenessType competitiveness) {
    this.competitiveness = competitiveness;
  }

  /**
   * Количество показов карточки товара за последние 7 дней.
   */
  public OfferForRecommendationDTO shows(Long shows) {
    this.shows = shows;
    return this;
  }

  
  @ApiModelProperty(value = "Количество показов карточки товара за последние 7 дней.")
  @JsonProperty("shows")
  public Long getShows() {
    return shows;
  }
  public void setShows(Long shows) {
    this.shows = shows;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OfferForRecommendationDTO offerForRecommendationDTO = (OfferForRecommendationDTO) o;
    return Objects.equals(offerId, offerForRecommendationDTO.offerId) &&
        Objects.equals(price, offerForRecommendationDTO.price) &&
        Objects.equals(cofinancePrice, offerForRecommendationDTO.cofinancePrice) &&
        Objects.equals(competitiveness, offerForRecommendationDTO.competitiveness) &&
        Objects.equals(shows, offerForRecommendationDTO.shows);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offerId, price, cofinancePrice, competitiveness, shows);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfferForRecommendationDTO {\n");
    
    sb.append("    offerId: ").append(toIndentedString(offerId)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    cofinancePrice: ").append(toIndentedString(cofinancePrice)).append("\n");
    sb.append("    competitiveness: ").append(toIndentedString(competitiveness)).append("\n");
    sb.append("    shows: ").append(toIndentedString(shows)).append("\n");
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

