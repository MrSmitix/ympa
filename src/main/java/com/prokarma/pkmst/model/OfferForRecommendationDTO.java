package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.prokarma.pkmst.model.BasePriceDTO;
import com.prokarma.pkmst.model.GetPriceDTO;
import com.prokarma.pkmst.model.PriceCompetitivenessType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Информация о состоянии цены на товар.
 */
@ApiModel(description = "Информация о состоянии цены на товар.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-09-09T22:21:39.140910578Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class OfferForRecommendationDTO   {
  @JsonProperty("offerId")
  private String offerId;

  @JsonProperty("price")
  private BasePriceDTO price;

  @JsonProperty("cofinancePrice")
  private GetPriceDTO cofinancePrice;

  @JsonProperty("competitiveness")
  private PriceCompetitivenessType competitiveness;

  @JsonProperty("shows")
  private Long shows;

  public OfferForRecommendationDTO offerId(String offerId) {
    this.offerId = offerId;
    return this;
  }

  /**
   * Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
   * @return offerId
   */
  @ApiModelProperty(value = "Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) ")
  public String getOfferId() {
    return offerId;
  }

  public void setOfferId(String offerId) {
    this.offerId = offerId;
  }

  public OfferForRecommendationDTO price(BasePriceDTO price) {
    this.price = price;
    return this;
  }

  /**
   * Get price
   * @return price
   */
  @ApiModelProperty(value = "")
  public BasePriceDTO getPrice() {
    return price;
  }

  public void setPrice(BasePriceDTO price) {
    this.price = price;
  }

  public OfferForRecommendationDTO cofinancePrice(GetPriceDTO cofinancePrice) {
    this.cofinancePrice = cofinancePrice;
    return this;
  }

  /**
   * Get cofinancePrice
   * @return cofinancePrice
   */
  @ApiModelProperty(value = "")
  public GetPriceDTO getCofinancePrice() {
    return cofinancePrice;
  }

  public void setCofinancePrice(GetPriceDTO cofinancePrice) {
    this.cofinancePrice = cofinancePrice;
  }

  public OfferForRecommendationDTO competitiveness(PriceCompetitivenessType competitiveness) {
    this.competitiveness = competitiveness;
    return this;
  }

  /**
   * Get competitiveness
   * @return competitiveness
   */
  @ApiModelProperty(value = "")
  public PriceCompetitivenessType getCompetitiveness() {
    return competitiveness;
  }

  public void setCompetitiveness(PriceCompetitivenessType competitiveness) {
    this.competitiveness = competitiveness;
  }

  public OfferForRecommendationDTO shows(Long shows) {
    this.shows = shows;
    return this;
  }

  /**
   * Количество показов карточки товара за последние 7 дней.
   * @return shows
   */
  @ApiModelProperty(value = "Количество показов карточки товара за последние 7 дней.")
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
    return Objects.equals(this.offerId, offerForRecommendationDTO.offerId) &&
        Objects.equals(this.price, offerForRecommendationDTO.price) &&
        Objects.equals(this.cofinancePrice, offerForRecommendationDTO.cofinancePrice) &&
        Objects.equals(this.competitiveness, offerForRecommendationDTO.competitiveness) &&
        Objects.equals(this.shows, offerForRecommendationDTO.shows);
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

