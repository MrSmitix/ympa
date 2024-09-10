package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import org.openapitools.model.PriceDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Информация об установленной цене на товар.
 **/
@ApiModel(description = "Информация об установленной цене на товар.")
@JsonTypeName("OfferPriceResponseDTO")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-09-09T22:25:08.792192529Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class OfferPriceResponseDTO   {
  private String id;
  private PriceDTO price;
  private Long marketSku;
  private Date updatedAt;

  /**
   * Идентификатор предложения из прайс-листа.
   **/
  public OfferPriceResponseDTO id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(value = "Идентификатор предложения из прайс-листа.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  @JsonProperty("id")
  public void setId(String id) {
    this.id = id;
  }

  /**
   **/
  public OfferPriceResponseDTO price(PriceDTO price) {
    this.price = price;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("price")
  @Valid public PriceDTO getPrice() {
    return price;
  }

  @JsonProperty("price")
  public void setPrice(PriceDTO price) {
    this.price = price;
  }

  /**
   * SKU на Маркете.
   **/
  public OfferPriceResponseDTO marketSku(Long marketSku) {
    this.marketSku = marketSku;
    return this;
  }

  
  @ApiModelProperty(value = "SKU на Маркете.")
  @JsonProperty("marketSku")
  public Long getMarketSku() {
    return marketSku;
  }

  @JsonProperty("marketSku")
  public void setMarketSku(Long marketSku) {
    this.marketSku = marketSku;
  }

  /**
   * Дата и время последнего обновления цены на товар.
   **/
  public OfferPriceResponseDTO updatedAt(Date updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  
  @ApiModelProperty(value = "Дата и время последнего обновления цены на товар.")
  @JsonProperty("updatedAt")
  public Date getUpdatedAt() {
    return updatedAt;
  }

  @JsonProperty("updatedAt")
  public void setUpdatedAt(Date updatedAt) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

