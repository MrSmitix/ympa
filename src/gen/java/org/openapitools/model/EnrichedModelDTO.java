package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.ModelOfferDTO;
import org.openapitools.model.ModelPriceDTO;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Модель товара.
 **/
@ApiModel(description="Модель товара.")

public class EnrichedModelDTO  {
  
  @ApiModelProperty(value = "Идентификатор модели товара.")
 /**
   * Идентификатор модели товара.
  **/
  private Long id;

  @ApiModelProperty(value = "Название модели товара.")
 /**
   * Название модели товара.
  **/
  private String name;

  @ApiModelProperty(value = "")
  private ModelPriceDTO prices;

  @ApiModelProperty(value = "Список первых десяти предложений, расположенных на карточке модели.  В ответе на запрос возвращаются предложения различных магазинов. Если есть несколько предложений от одного магазина, в ответе отображается только одно, наиболее релевантное из них. ")
 /**
   * Список первых десяти предложений, расположенных на карточке модели.  В ответе на запрос возвращаются предложения различных магазинов. Если есть несколько предложений от одного магазина, в ответе отображается только одно, наиболее релевантное из них. 
  **/
  private List<ModelOfferDTO> offers;

  @ApiModelProperty(value = "Суммарное количество предложений в розничных магазинах в регионе. Учитываются все предложения от каждого магазина.")
 /**
   * Суммарное количество предложений в розничных магазинах в регионе. Учитываются все предложения от каждого магазина.
  **/
  private Integer offlineOffers;

  @ApiModelProperty(value = "Суммарное количество предложений в интернет-магазинах в регионе. Учитываются все предложения от каждого магазина.")
 /**
   * Суммарное количество предложений в интернет-магазинах в регионе. Учитываются все предложения от каждого магазина.
  **/
  private Integer onlineOffers;
 /**
   * Идентификатор модели товара.
   * @return id
  **/
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public EnrichedModelDTO id(Long id) {
    this.id = id;
    return this;
  }

 /**
   * Название модели товара.
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public EnrichedModelDTO name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Get prices
   * @return prices
  **/
  @JsonProperty("prices")
  public ModelPriceDTO getPrices() {
    return prices;
  }

  public void setPrices(ModelPriceDTO prices) {
    this.prices = prices;
  }

  public EnrichedModelDTO prices(ModelPriceDTO prices) {
    this.prices = prices;
    return this;
  }

 /**
   * Список первых десяти предложений, расположенных на карточке модели.  В ответе на запрос возвращаются предложения различных магазинов. Если есть несколько предложений от одного магазина, в ответе отображается только одно, наиболее релевантное из них. 
   * @return offers
  **/
  @JsonProperty("offers")
  public List<ModelOfferDTO> getOffers() {
    return offers;
  }

  public void setOffers(List<ModelOfferDTO> offers) {
    this.offers = offers;
  }

  public EnrichedModelDTO offers(List<ModelOfferDTO> offers) {
    this.offers = offers;
    return this;
  }

  public EnrichedModelDTO addOffersItem(ModelOfferDTO offersItem) {
    this.offers.add(offersItem);
    return this;
  }

 /**
   * Суммарное количество предложений в розничных магазинах в регионе. Учитываются все предложения от каждого магазина.
   * @return offlineOffers
  **/
  @JsonProperty("offlineOffers")
  public Integer getOfflineOffers() {
    return offlineOffers;
  }

  public void setOfflineOffers(Integer offlineOffers) {
    this.offlineOffers = offlineOffers;
  }

  public EnrichedModelDTO offlineOffers(Integer offlineOffers) {
    this.offlineOffers = offlineOffers;
    return this;
  }

 /**
   * Суммарное количество предложений в интернет-магазинах в регионе. Учитываются все предложения от каждого магазина.
   * @return onlineOffers
  **/
  @JsonProperty("onlineOffers")
  public Integer getOnlineOffers() {
    return onlineOffers;
  }

  public void setOnlineOffers(Integer onlineOffers) {
    this.onlineOffers = onlineOffers;
  }

  public EnrichedModelDTO onlineOffers(Integer onlineOffers) {
    this.onlineOffers = onlineOffers;
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
    EnrichedModelDTO enrichedModelDTO = (EnrichedModelDTO) o;
    return Objects.equals(this.id, enrichedModelDTO.id) &&
        Objects.equals(this.name, enrichedModelDTO.name) &&
        Objects.equals(this.prices, enrichedModelDTO.prices) &&
        Objects.equals(this.offers, enrichedModelDTO.offers) &&
        Objects.equals(this.offlineOffers, enrichedModelDTO.offlineOffers) &&
        Objects.equals(this.onlineOffers, enrichedModelDTO.onlineOffers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, prices, offers, offlineOffers, onlineOffers);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

