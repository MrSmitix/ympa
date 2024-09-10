package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;

/**
 * Информация о предложении.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ModelOfferDTO   {
  
  private Integer discount;
  private String name;
  private Integer pos;
  private BigDecimal preDiscountPrice;
  private BigDecimal price;
  private Long regionId;
  private BigDecimal shippingCost;
  private String shopName;
  private Integer shopRating;
  private Integer inStock;

  public ModelOfferDTO () {

  }

  public ModelOfferDTO (Integer discount, String name, Integer pos, BigDecimal preDiscountPrice, BigDecimal price, Long regionId, BigDecimal shippingCost, String shopName, Integer shopRating, Integer inStock) {
    this.discount = discount;
    this.name = name;
    this.pos = pos;
    this.preDiscountPrice = preDiscountPrice;
    this.price = price;
    this.regionId = regionId;
    this.shippingCost = shippingCost;
    this.shopName = shopName;
    this.shopRating = shopRating;
    this.inStock = inStock;
  }

    
  @JsonProperty("discount")
  public Integer getDiscount() {
    return discount;
  }
  public void setDiscount(Integer discount) {
    this.discount = discount;
  }

    
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

    
  @JsonProperty("pos")
  public Integer getPos() {
    return pos;
  }
  public void setPos(Integer pos) {
    this.pos = pos;
  }

    
  @JsonProperty("preDiscountPrice")
  public BigDecimal getPreDiscountPrice() {
    return preDiscountPrice;
  }
  public void setPreDiscountPrice(BigDecimal preDiscountPrice) {
    this.preDiscountPrice = preDiscountPrice;
  }

    
  @JsonProperty("price")
  public BigDecimal getPrice() {
    return price;
  }
  public void setPrice(BigDecimal price) {
    this.price = price;
  }

    
  @JsonProperty("regionId")
  public Long getRegionId() {
    return regionId;
  }
  public void setRegionId(Long regionId) {
    this.regionId = regionId;
  }

    
  @JsonProperty("shippingCost")
  public BigDecimal getShippingCost() {
    return shippingCost;
  }
  public void setShippingCost(BigDecimal shippingCost) {
    this.shippingCost = shippingCost;
  }

    
  @JsonProperty("shopName")
  public String getShopName() {
    return shopName;
  }
  public void setShopName(String shopName) {
    this.shopName = shopName;
  }

    
  @JsonProperty("shopRating")
  public Integer getShopRating() {
    return shopRating;
  }
  public void setShopRating(Integer shopRating) {
    this.shopRating = shopRating;
  }

    
  @JsonProperty("inStock")
  public Integer getInStock() {
    return inStock;
  }
  public void setInStock(Integer inStock) {
    this.inStock = inStock;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelOfferDTO modelOfferDTO = (ModelOfferDTO) o;
    return Objects.equals(discount, modelOfferDTO.discount) &&
        Objects.equals(name, modelOfferDTO.name) &&
        Objects.equals(pos, modelOfferDTO.pos) &&
        Objects.equals(preDiscountPrice, modelOfferDTO.preDiscountPrice) &&
        Objects.equals(price, modelOfferDTO.price) &&
        Objects.equals(regionId, modelOfferDTO.regionId) &&
        Objects.equals(shippingCost, modelOfferDTO.shippingCost) &&
        Objects.equals(shopName, modelOfferDTO.shopName) &&
        Objects.equals(shopRating, modelOfferDTO.shopRating) &&
        Objects.equals(inStock, modelOfferDTO.inStock);
  }

  @Override
  public int hashCode() {
    return Objects.hash(discount, name, pos, preDiscountPrice, price, regionId, shippingCost, shopName, shopRating, inStock);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelOfferDTO {\n");
    
    sb.append("    discount: ").append(toIndentedString(discount)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    pos: ").append(toIndentedString(pos)).append("\n");
    sb.append("    preDiscountPrice: ").append(toIndentedString(preDiscountPrice)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
    sb.append("    shippingCost: ").append(toIndentedString(shippingCost)).append("\n");
    sb.append("    shopName: ").append(toIndentedString(shopName)).append("\n");
    sb.append("    shopRating: ").append(toIndentedString(shopRating)).append("\n");
    sb.append("    inStock: ").append(toIndentedString(inStock)).append("\n");
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
