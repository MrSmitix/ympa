package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
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
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@ApiModel(description="Модель товара.")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2024-09-09T22:24:34.340132557Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class EnrichedModelDTO   {
  
  private Long id;
  private String name;
  private ModelPriceDTO prices;
  private List<@Valid ModelOfferDTO> offers;
  private Integer offlineOffers;
  private Integer onlineOffers;

  /**
   * Идентификатор модели товара.
   **/
  
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
  
  @ApiModelProperty(value = "")
  @JsonProperty("prices")
  @Valid
  public ModelPriceDTO getPrices() {
    return prices;
  }
  public void setPrices(ModelPriceDTO prices) {
    this.prices = prices;
  }

  /**
   * Список первых десяти предложений, расположенных на карточке модели.  В ответе на запрос возвращаются предложения различных магазинов. Если есть несколько предложений от одного магазина, в ответе отображается только одно, наиболее релевантное из них. 
   **/
  
  @ApiModelProperty(value = "Список первых десяти предложений, расположенных на карточке модели.  В ответе на запрос возвращаются предложения различных магазинов. Если есть несколько предложений от одного магазина, в ответе отображается только одно, наиболее релевантное из них. ")
  @JsonProperty("offers")
  @Valid
  public List<@Valid ModelOfferDTO> getOffers() {
    return offers;
  }
  public void setOffers(List<@Valid ModelOfferDTO> offers) {
    this.offers = offers;
  }

  /**
   * Суммарное количество предложений в розничных магазинах в регионе. Учитываются все предложения от каждого магазина.
   **/
  
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

