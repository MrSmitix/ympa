package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import org.openapitools.vertxweb.server.model.PriceDTO;

/**
 * Информация об установленной цене на товар.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OfferPriceResponseDTO   {
  
  private String id;
  private PriceDTO price;
  private Long marketSku;
  private OffsetDateTime updatedAt;

  public OfferPriceResponseDTO () {

  }

  public OfferPriceResponseDTO (String id, PriceDTO price, Long marketSku, OffsetDateTime updatedAt) {
    this.id = id;
    this.price = price;
    this.marketSku = marketSku;
    this.updatedAt = updatedAt;
  }

    
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

    
  @JsonProperty("price")
  public PriceDTO getPrice() {
    return price;
  }
  public void setPrice(PriceDTO price) {
    this.price = price;
  }

    
  @JsonProperty("marketSku")
  public Long getMarketSku() {
    return marketSku;
  }
  public void setMarketSku(Long marketSku) {
    this.marketSku = marketSku;
  }

    
  @JsonProperty("updatedAt")
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }
  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OfferPriceResponseDTO offerPriceResponseDTO = (OfferPriceResponseDTO) o;
    return Objects.equals(id, offerPriceResponseDTO.id) &&
        Objects.equals(price, offerPriceResponseDTO.price) &&
        Objects.equals(marketSku, offerPriceResponseDTO.marketSku) &&
        Objects.equals(updatedAt, offerPriceResponseDTO.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, price, marketSku, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfferPriceResponseDTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    marketSku: ").append(toIndentedString(marketSku)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
