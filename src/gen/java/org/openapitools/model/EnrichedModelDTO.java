package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.ModelOfferDTO;
import org.openapitools.model.ModelPriceDTO;



/**
 * Модель товара.
 **/

@ApiModel(description = "Модель товара.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-09-09T22:20:23.877037640Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class EnrichedModelDTO   {
  @JsonProperty("id")
  private Long id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("prices")
  private ModelPriceDTO prices;

  @JsonProperty("offers")
  private List<ModelOfferDTO> offers = null;

  @JsonProperty("offlineOffers")
  private Integer offlineOffers;

  @JsonProperty("onlineOffers")
  private Integer onlineOffers;

  /**
   * Идентификатор модели товара.
   **/
  public EnrichedModelDTO id(Long id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(value = "Идентификатор модели товара.")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  /**
   * Название модели товара.
   **/
  public EnrichedModelDTO name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(value = "Название модели товара.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  public EnrichedModelDTO prices(ModelPriceDTO prices) {
    this.prices = prices;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("prices")
  public ModelPriceDTO getPrices() {
    return prices;
  }
  public void setPrices(ModelPriceDTO prices) {
    this.prices = prices;
  }

  /**
   * Список первых десяти предложений, расположенных на карточке модели.  В ответе на запрос возвращаются предложения различных магазинов. Если есть несколько предложений от одного магазина, в ответе отображается только одно, наиболее релевантное из них. 
   **/
  public EnrichedModelDTO offers(List<ModelOfferDTO> offers) {
    this.offers = offers;
    return this;
  }

  
  @ApiModelProperty(value = "Список первых десяти предложений, расположенных на карточке модели.  В ответе на запрос возвращаются предложения различных магазинов. Если есть несколько предложений от одного магазина, в ответе отображается только одно, наиболее релевантное из них. ")
  @JsonProperty("offers")
  public List<ModelOfferDTO> getOffers() {
    return offers;
  }
  public void setOffers(List<ModelOfferDTO> offers) {
    this.offers = offers;
  }

  /**
   * Суммарное количество предложений в розничных магазинах в регионе. Учитываются все предложения от каждого магазина.
   **/
  public EnrichedModelDTO offlineOffers(Integer offlineOffers) {
    this.offlineOffers = offlineOffers;
    return this;
  }

  
  @ApiModelProperty(value = "Суммарное количество предложений в розничных магазинах в регионе. Учитываются все предложения от каждого магазина.")
  @JsonProperty("offlineOffers")
  public Integer getOfflineOffers() {
    return offlineOffers;
  }
  public void setOfflineOffers(Integer offlineOffers) {
    this.offlineOffers = offlineOffers;
  }

  /**
   * Суммарное количество предложений в интернет-магазинах в регионе. Учитываются все предложения от каждого магазина.
   **/
  public EnrichedModelDTO onlineOffers(Integer onlineOffers) {
    this.onlineOffers = onlineOffers;
    return this;
  }

  
  @ApiModelProperty(value = "Суммарное количество предложений в интернет-магазинах в регионе. Учитываются все предложения от каждого магазина.")
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
    return Objects.equals(id, enrichedModelDTO.id) &&
        Objects.equals(name, enrichedModelDTO.name) &&
        Objects.equals(prices, enrichedModelDTO.prices) &&
        Objects.equals(offers, enrichedModelDTO.offers) &&
        Objects.equals(offlineOffers, enrichedModelDTO.offlineOffers) &&
        Objects.equals(onlineOffers, enrichedModelDTO.onlineOffers);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

