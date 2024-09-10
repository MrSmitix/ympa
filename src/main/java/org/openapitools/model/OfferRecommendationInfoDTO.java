package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.BasePriceDTO;
import org.openapitools.model.PriceCompetitivenessThresholdsDTO;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Рекомендации, касающиеся цены на товар.
 */

@Schema(name = "OfferRecommendationInfoDTO", description = "Рекомендации, касающиеся цены на товар.")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-09-09T22:19:44.552145407Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class OfferRecommendationInfoDTO {

  private String offerId;

  private BasePriceDTO recommendedCofinancePrice;

  private PriceCompetitivenessThresholdsDTO competitivenessThresholds;

  public OfferRecommendationInfoDTO offerId(String offerId) {
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

  public OfferRecommendationInfoDTO recommendedCofinancePrice(BasePriceDTO recommendedCofinancePrice) {
    this.recommendedCofinancePrice = recommendedCofinancePrice;
    return this;
  }

  /**
   * Get recommendedCofinancePrice
   * @return recommendedCofinancePrice
   */
  @Valid 
  @Schema(name = "recommendedCofinancePrice", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("recommendedCofinancePrice")
  public BasePriceDTO getRecommendedCofinancePrice() {
    return recommendedCofinancePrice;
  }

  public void setRecommendedCofinancePrice(BasePriceDTO recommendedCofinancePrice) {
    this.recommendedCofinancePrice = recommendedCofinancePrice;
  }

  public OfferRecommendationInfoDTO competitivenessThresholds(PriceCompetitivenessThresholdsDTO competitivenessThresholds) {
    this.competitivenessThresholds = competitivenessThresholds;
    return this;
  }

  /**
   * Get competitivenessThresholds
   * @return competitivenessThresholds
   */
  @Valid 
  @Schema(name = "competitivenessThresholds", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("competitivenessThresholds")
  public PriceCompetitivenessThresholdsDTO getCompetitivenessThresholds() {
    return competitivenessThresholds;
  }

  public void setCompetitivenessThresholds(PriceCompetitivenessThresholdsDTO competitivenessThresholds) {
    this.competitivenessThresholds = competitivenessThresholds;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

