package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.Date;
import org.openapitools.model.PriceDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Информация об установленной цене на товар.
 */
@ApiModel(description="Информация об установленной цене на товар.")

public class OfferPriceResponseDTO  {
  
 /**
  * Идентификатор предложения из прайс-листа.
  */
  @ApiModelProperty(value = "Идентификатор предложения из прайс-листа.")
  private String id;

  @ApiModelProperty(value = "")
  @Valid
  private PriceDTO price;

 /**
  * SKU на Маркете.
  */
  @ApiModelProperty(value = "SKU на Маркете.")
  private Long marketSku;

 /**
  * Дата и время последнего обновления цены на товар.
  */
  @ApiModelProperty(value = "Дата и время последнего обновления цены на товар.")
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'hh:mm:ss.SSSX")
  private Date updatedAt;
 /**
  * Идентификатор предложения из прайс-листа.
  * @return id
  */
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  /**
   * Sets the <code>id</code> property.
   */
 public void setId(String id) {
    this.id = id;
  }

  /**
   * Sets the <code>id</code> property.
   */
  public OfferPriceResponseDTO id(String id) {
    this.id = id;
    return this;
  }

 /**
  * Get price
  * @return price
  */
  @JsonProperty("price")
  public PriceDTO getPrice() {
    return price;
  }

  /**
   * Sets the <code>price</code> property.
   */
 public void setPrice(PriceDTO price) {
    this.price = price;
  }

  /**
   * Sets the <code>price</code> property.
   */
  public OfferPriceResponseDTO price(PriceDTO price) {
    this.price = price;
    return this;
  }

 /**
  * SKU на Маркете.
  * @return marketSku
  */
  @JsonProperty("marketSku")
  public Long getMarketSku() {
    return marketSku;
  }

  /**
   * Sets the <code>marketSku</code> property.
   */
 public void setMarketSku(Long marketSku) {
    this.marketSku = marketSku;
  }

  /**
   * Sets the <code>marketSku</code> property.
   */
  public OfferPriceResponseDTO marketSku(Long marketSku) {
    this.marketSku = marketSku;
    return this;
  }

 /**
  * Дата и время последнего обновления цены на товар.
  * @return updatedAt
  */
  @JsonProperty("updatedAt")
  public Date getUpdatedAt() {
    return updatedAt;
  }

  /**
   * Sets the <code>updatedAt</code> property.
   */
 public void setUpdatedAt(Date updatedAt) {
    this.updatedAt = updatedAt;
  }

  /**
   * Sets the <code>updatedAt</code> property.
   */
  public OfferPriceResponseDTO updatedAt(Date updatedAt) {
    this.updatedAt = updatedAt;
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
    OfferPriceResponseDTO offerPriceResponseDTO = (OfferPriceResponseDTO) o;
    return Objects.equals(this.id, offerPriceResponseDTO.id) &&
        Objects.equals(this.price, offerPriceResponseDTO.price) &&
        Objects.equals(this.marketSku, offerPriceResponseDTO.marketSku) &&
        Objects.equals(this.updatedAt, offerPriceResponseDTO.updatedAt);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

