package apimodels;

import apimodels.PriceDTO;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Информация об установленной цене на товар.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class OfferPriceResponseDTO   {
  @JsonProperty("id")
  
  private String id;

  @JsonProperty("price")
  @Valid

  private PriceDTO price;

  @JsonProperty("marketSku")
  
  private Long marketSku;

  @JsonProperty("updatedAt")
  @Valid

  private OffsetDateTime updatedAt;

  public OfferPriceResponseDTO id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Идентификатор предложения из прайс-листа.
   * @return id
  **/
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public OfferPriceResponseDTO price(PriceDTO price) {
    this.price = price;
    return this;
  }

   /**
   * Get price
   * @return price
  **/
  public PriceDTO getPrice() {
    return price;
  }

  public void setPrice(PriceDTO price) {
    this.price = price;
  }

  public OfferPriceResponseDTO marketSku(Long marketSku) {
    this.marketSku = marketSku;
    return this;
  }

   /**
   * SKU на Маркете.
   * @return marketSku
  **/
  public Long getMarketSku() {
    return marketSku;
  }

  public void setMarketSku(Long marketSku) {
    this.marketSku = marketSku;
  }

  public OfferPriceResponseDTO updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Дата и время последнего обновления цены на товар.
   * @return updatedAt
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

