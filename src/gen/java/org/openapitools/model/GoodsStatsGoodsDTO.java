package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.GoodsStatsWarehouseDTO;
import org.openapitools.model.GoodsStatsWeightDimensionsDTO;
import org.openapitools.model.TariffDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@ApiModel(description="Информация о товаре.")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2024-09-09T22:24:51.464705463Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GoodsStatsGoodsDTO   {
  
  private String shopSku;
  private Long marketSku;
  private String name;
  private BigDecimal price;
  private Long categoryId;
  private String categoryName;
  private GoodsStatsWeightDimensionsDTO weightDimensions;
  private List<@Valid GoodsStatsWarehouseDTO> warehouses;
  private List<@Valid TariffDTO> tariffs;
  private List<String> pictures;

  /**
   * Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
   **/
  
  @ApiModelProperty(value = "Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) ")
  @JsonProperty("shopSku")
 @Pattern(regexp="^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$") @Size(min=1,max=255)  public String getShopSku() {
    return shopSku;
  }
  public void setShopSku(String shopSku) {
    this.shopSku = shopSku;
  }

  /**
   * SKU на Маркете.
   **/
  
  @ApiModelProperty(value = "SKU на Маркете.")
  @JsonProperty("marketSku")
  public Long getMarketSku() {
    return marketSku;
  }
  public void setMarketSku(Long marketSku) {
    this.marketSku = marketSku;
  }

  /**
   * Название товара.
   **/
  
  @ApiModelProperty(value = "Название товара.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Цена на товар в валюте, которая установлена [в кабинете продавца на Маркете](https://partner.market.yandex.ru/).
   **/
  
  @ApiModelProperty(value = "Цена на товар в валюте, которая установлена [в кабинете продавца на Маркете](https://partner.market.yandex.ru/).")
  @JsonProperty("price")
  public BigDecimal getPrice() {
    return price;
  }
  public void setPrice(BigDecimal price) {
    this.price = price;
  }

  /**
   * Идентификатор категории товара на Маркете.
   **/
  
  @ApiModelProperty(value = "Идентификатор категории товара на Маркете.")
  @JsonProperty("categoryId")
  public Long getCategoryId() {
    return categoryId;
  }
  public void setCategoryId(Long categoryId) {
    this.categoryId = categoryId;
  }

  /**
   * Название категории товара на Маркете.
   **/
  
  @ApiModelProperty(value = "Название категории товара на Маркете.")
  @JsonProperty("categoryName")
  public String getCategoryName() {
    return categoryName;
  }
  public void setCategoryName(String categoryName) {
    this.categoryName = categoryName;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("weightDimensions")
  public GoodsStatsWeightDimensionsDTO getWeightDimensions() {
    return weightDimensions;
  }
  public void setWeightDimensions(GoodsStatsWeightDimensionsDTO weightDimensions) {
    this.weightDimensions = weightDimensions;
  }

  /**
   * Информация о складах, на которых хранится товар.  Параметр не приходит, если товара нет ни на одном складе. 
   **/
  
  @ApiModelProperty(value = "Информация о складах, на которых хранится товар.  Параметр не приходит, если товара нет ни на одном складе. ")
  @JsonProperty("warehouses")
  public List<@Valid GoodsStatsWarehouseDTO> getWarehouses() {
    return warehouses;
  }
  public void setWarehouses(List<@Valid GoodsStatsWarehouseDTO> warehouses) {
    this.warehouses = warehouses;
  }

  /**
   * Информация о тарифах, по которым нужно заплатить за услуги Маркета.  По некоторым услугам могут возвращаться несколько разных стоимостей. Например, в модели FBS стоимость услуги &#x60;SORTING&#x60; (обработка заказа) зависит от способа отгрузки и количества заказов в отгрузке. Подробнее о тарифах на услуги читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/introduction/rates/models/). 
   **/
  
  @ApiModelProperty(value = "Информация о тарифах, по которым нужно заплатить за услуги Маркета.  По некоторым услугам могут возвращаться несколько разных стоимостей. Например, в модели FBS стоимость услуги `SORTING` (обработка заказа) зависит от способа отгрузки и количества заказов в отгрузке. Подробнее о тарифах на услуги читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/introduction/rates/models/). ")
  @JsonProperty("tariffs")
  public List<@Valid TariffDTO> getTariffs() {
    return tariffs;
  }
  public void setTariffs(List<@Valid TariffDTO> tariffs) {
    this.tariffs = tariffs;
  }

  /**
   * Ссылки (URL) изображений товара в хорошем качестве.
   **/
  
  @ApiModelProperty(value = "Ссылки (URL) изображений товара в хорошем качестве.")
  @JsonProperty("pictures")
  public List<String> getPictures() {
    return pictures;
  }
  public void setPictures(List<String> pictures) {
    this.pictures = pictures;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoodsStatsGoodsDTO goodsStatsGoodsDTO = (GoodsStatsGoodsDTO) o;
    return Objects.equals(this.shopSku, goodsStatsGoodsDTO.shopSku) &&
        Objects.equals(this.marketSku, goodsStatsGoodsDTO.marketSku) &&
        Objects.equals(this.name, goodsStatsGoodsDTO.name) &&
        Objects.equals(this.price, goodsStatsGoodsDTO.price) &&
        Objects.equals(this.categoryId, goodsStatsGoodsDTO.categoryId) &&
        Objects.equals(this.categoryName, goodsStatsGoodsDTO.categoryName) &&
        Objects.equals(this.weightDimensions, goodsStatsGoodsDTO.weightDimensions) &&
        Objects.equals(this.warehouses, goodsStatsGoodsDTO.warehouses) &&
        Objects.equals(this.tariffs, goodsStatsGoodsDTO.tariffs) &&
        Objects.equals(this.pictures, goodsStatsGoodsDTO.pictures);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shopSku, marketSku, name, price, categoryId, categoryName, weightDimensions, warehouses, tariffs, pictures);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoodsStatsGoodsDTO {\n");
    
    sb.append("    shopSku: ").append(toIndentedString(shopSku)).append("\n");
    sb.append("    marketSku: ").append(toIndentedString(marketSku)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
    sb.append("    categoryName: ").append(toIndentedString(categoryName)).append("\n");
    sb.append("    weightDimensions: ").append(toIndentedString(weightDimensions)).append("\n");
    sb.append("    warehouses: ").append(toIndentedString(warehouses)).append("\n");
    sb.append("    tariffs: ").append(toIndentedString(tariffs)).append("\n");
    sb.append("    pictures: ").append(toIndentedString(pictures)).append("\n");
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

