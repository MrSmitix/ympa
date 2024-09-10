package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.ModelOfferDTO;
import org.openapitools.model.ModelPriceDTO;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Модель товара.
 */

@Schema(name = "EnrichedModelDTO", description = "Модель товара.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-09T22:33:46.054383208Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class EnrichedModelDTO {

  private Long id;

  private String name;

  private ModelPriceDTO prices;

  @Valid
  private JsonNullable<List<@Valid ModelOfferDTO>> offers = JsonNullable.<List<@Valid ModelOfferDTO>>undefined();

  private Integer offlineOffers;

  private Integer onlineOffers;

  public EnrichedModelDTO id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Идентификатор модели товара.
   * @return id
   */
  
  @Schema(name = "id", description = "Идентификатор модели товара.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public EnrichedModelDTO name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Название модели товара.
   * @return name
   */
  
  @Schema(name = "name", description = "Название модели товара.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public EnrichedModelDTO prices(ModelPriceDTO prices) {
    this.prices = prices;
    return this;
  }

  /**
   * Get prices
   * @return prices
   */
  @Valid 
  @Schema(name = "prices", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("prices")
  public ModelPriceDTO getPrices() {
    return prices;
  }

  public void setPrices(ModelPriceDTO prices) {
    this.prices = prices;
  }

  public EnrichedModelDTO offers(List<@Valid ModelOfferDTO> offers) {
    this.offers = JsonNullable.of(offers);
    return this;
  }

  public EnrichedModelDTO addOffersItem(ModelOfferDTO offersItem) {
    if (this.offers == null || !this.offers.isPresent()) {
      this.offers = JsonNullable.of(new ArrayList<>());
    }
    this.offers.get().add(offersItem);
    return this;
  }

  /**
   * Список первых десяти предложений, расположенных на карточке модели.  В ответе на запрос возвращаются предложения различных магазинов. Если есть несколько предложений от одного магазина, в ответе отображается только одно, наиболее релевантное из них. 
   * @return offers
   */
  @Valid 
  @Schema(name = "offers", description = "Список первых десяти предложений, расположенных на карточке модели.  В ответе на запрос возвращаются предложения различных магазинов. Если есть несколько предложений от одного магазина, в ответе отображается только одно, наиболее релевантное из них. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("offers")
  public JsonNullable<List<@Valid ModelOfferDTO>> getOffers() {
    return offers;
  }

  public void setOffers(JsonNullable<List<@Valid ModelOfferDTO>> offers) {
    this.offers = offers;
  }

  public EnrichedModelDTO offlineOffers(Integer offlineOffers) {
    this.offlineOffers = offlineOffers;
    return this;
  }

  /**
   * Суммарное количество предложений в розничных магазинах в регионе. Учитываются все предложения от каждого магазина.
   * @return offlineOffers
   */
  
  @Schema(name = "offlineOffers", description = "Суммарное количество предложений в розничных магазинах в регионе. Учитываются все предложения от каждого магазина.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("offlineOffers")
  public Integer getOfflineOffers() {
    return offlineOffers;
  }

  public void setOfflineOffers(Integer offlineOffers) {
    this.offlineOffers = offlineOffers;
  }

  public EnrichedModelDTO onlineOffers(Integer onlineOffers) {
    this.onlineOffers = onlineOffers;
    return this;
  }

  /**
   * Суммарное количество предложений в интернет-магазинах в регионе. Учитываются все предложения от каждого магазина.
   * @return onlineOffers
   */
  
  @Schema(name = "onlineOffers", description = "Суммарное количество предложений в интернет-магазинах в регионе. Учитываются все предложения от каждого магазина.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("onlineOffers")
  public Integer getOnlineOffers() {
    return onlineOffers;
  }

  public void setOnlineOffers(Integer onlineOffers) {
    this.onlineOffers = onlineOffers;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnrichedModelDTO enrichedModelDTO = (EnrichedModelDTO) o;
    return Objects.equals(this.id, enrichedModelDTO.id) &&
        Objects.equals(this.name, enrichedModelDTO.name) &&
        Objects.equals(this.prices, enrichedModelDTO.prices) &&
        equalsNullable(this.offers, enrichedModelDTO.offers) &&
        Objects.equals(this.offlineOffers, enrichedModelDTO.offlineOffers) &&
        Objects.equals(this.onlineOffers, enrichedModelDTO.onlineOffers);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, prices, hashCodeNullable(offers), offlineOffers, onlineOffers);
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
    sb.append("class EnrichedModelDTO {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    prices: ").append(toIndentedString(prices)).append("\n");
    sb.append("    offers: ").append(toIndentedString(offers)).append("\n");
    sb.append("    offlineOffers: ").append(toIndentedString(offlineOffers)).append("\n");
    sb.append("    onlineOffers: ").append(toIndentedString(onlineOffers)).append("\n");
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

