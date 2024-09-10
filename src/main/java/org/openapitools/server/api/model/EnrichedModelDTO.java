package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.api.model.ModelOfferDTO;
import org.openapitools.server.api.model.ModelPriceDTO;

/**
 * Модель товара.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EnrichedModelDTO   {
  
  private Long id;
  private String name;
  private ModelPriceDTO prices;
  private List<ModelOfferDTO> offers;
  private Integer offlineOffers;
  private Integer onlineOffers;

  public EnrichedModelDTO () {

  }

  public EnrichedModelDTO (Long id, String name, ModelPriceDTO prices, List<ModelOfferDTO> offers, Integer offlineOffers, Integer onlineOffers) {
    this.id = id;
    this.name = name;
    this.prices = prices;
    this.offers = offers;
    this.offlineOffers = offlineOffers;
    this.onlineOffers = onlineOffers;
  }

    
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

    
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

    
  @JsonProperty("prices")
  public ModelPriceDTO getPrices() {
    return prices;
  }
  public void setPrices(ModelPriceDTO prices) {
    this.prices = prices;
  }

    
  @JsonProperty("offers")
  public List<ModelOfferDTO> getOffers() {
    return offers;
  }
  public void setOffers(List<ModelOfferDTO> offers) {
    this.offers = offers;
  }

    
  @JsonProperty("offlineOffers")
  public Integer getOfflineOffers() {
    return offlineOffers;
  }
  public void setOfflineOffers(Integer offlineOffers) {
    this.offlineOffers = offlineOffers;
  }

    
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
