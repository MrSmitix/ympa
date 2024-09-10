package apimodels;

import apimodels.BasePriceDTO;
import apimodels.GetPriceDTO;
import apimodels.PriceCompetitivenessType;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Информация о состоянии цены на товар.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class OfferForRecommendationDTO   {
  @JsonProperty("offerId")
  @Pattern(regexp="^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")
@Size(min=1,max=255)

  private String offerId;

  @JsonProperty("price")
  @Valid

  private BasePriceDTO price;

  @JsonProperty("cofinancePrice")
  @Valid

  private GetPriceDTO cofinancePrice;

  @JsonProperty("competitiveness")
  @Valid

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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

