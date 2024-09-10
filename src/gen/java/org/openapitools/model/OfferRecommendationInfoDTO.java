package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import org.openapitools.model.BasePriceDTO;
import org.openapitools.model.PriceCompetitivenessThresholdsDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Рекомендации, касающиеся цены на товар.
 */
@ApiModel(description="Рекомендации, касающиеся цены на товар.")

public class OfferRecommendationInfoDTO  {
  
 /**
  * Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
  */
  @ApiModelProperty(value = "Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) ")
  private String offerId;

  @ApiModelProperty(value = "")
  @Valid
  private BasePriceDTO recommendedCofinancePrice;

  @ApiModelProperty(value = "")
  @Valid
  private PriceCompetitivenessThresholdsDTO competitivenessThresholds;
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
  public OfferRecommendationInfoDTO offerId(String offerId) {
    this.offerId = offerId;
    return this;
  }

 /**
  * Get recommendedCofinancePrice
  * @return recommendedCofinancePrice
  */
  @JsonProperty("recommendedCofinancePrice")
  public BasePriceDTO getRecommendedCofinancePrice() {
    return recommendedCofinancePrice;
  }

  /**
   * Sets the <code>recommendedCofinancePrice</code> property.
   */
 public void setRecommendedCofinancePrice(BasePriceDTO recommendedCofinancePrice) {
    this.recommendedCofinancePrice = recommendedCofinancePrice;
  }

  /**
   * Sets the <code>recommendedCofinancePrice</code> property.
   */
  public OfferRecommendationInfoDTO recommendedCofinancePrice(BasePriceDTO recommendedCofinancePrice) {
    this.recommendedCofinancePrice = recommendedCofinancePrice;
    return this;
  }

 /**
  * Get competitivenessThresholds
  * @return competitivenessThresholds
  */
  @JsonProperty("competitivenessThresholds")
  public PriceCompetitivenessThresholdsDTO getCompetitivenessThresholds() {
    return competitivenessThresholds;
  }

  /**
   * Sets the <code>competitivenessThresholds</code> property.
   */
 public void setCompetitivenessThresholds(PriceCompetitivenessThresholdsDTO competitivenessThresholds) {
    this.competitivenessThresholds = competitivenessThresholds;
  }

  /**
   * Sets the <code>competitivenessThresholds</code> property.
   */
  public OfferRecommendationInfoDTO competitivenessThresholds(PriceCompetitivenessThresholdsDTO competitivenessThresholds) {
    this.competitivenessThresholds = competitivenessThresholds;
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
    OfferRecommendationInfoDTO offerRecommendationInfoDTO = (OfferRecommendationInfoDTO) o;
    return Objects.equals(this.offerId, offerRecommendationInfoDTO.offerId) &&
        Objects.equals(this.recommendedCofinancePrice, offerRecommendationInfoDTO.recommendedCofinancePrice) &&
        Objects.equals(this.competitivenessThresholds, offerRecommendationInfoDTO.competitivenessThresholds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offerId, recommendedCofinancePrice, competitivenessThresholds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfferRecommendationInfoDTO {\n");
    
    sb.append("    offerId: ").append(toIndentedString(offerId)).append("\n");
    sb.append("    recommendedCofinancePrice: ").append(toIndentedString(recommendedCofinancePrice)).append("\n");
    sb.append("    competitivenessThresholds: ").append(toIndentedString(competitivenessThresholds)).append("\n");
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

