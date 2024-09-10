package org.openapitools.model;

import io.swagger.annotations.ApiModel;
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

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Информация о товаре.
 */
@ApiModel(description="Информация о товаре.")

public class GoodsStatsGoodsDTO  {
  
 /**
  * Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
  */
  @ApiModelProperty(value = "Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) ")
  private String shopSku;

 /**
  * SKU на Маркете.
  */
  @ApiModelProperty(value = "SKU на Маркете.")
  private Long marketSku;

 /**
  * Название товара.
  */
  @ApiModelProperty(value = "Название товара.")
  private String name;

 /**
  * Цена на товар в валюте, которая установлена [в кабинете продавца на Маркете](https://partner.market.yandex.ru/).
  */
  @ApiModelProperty(value = "Цена на товар в валюте, которая установлена [в кабинете продавца на Маркете](https://partner.market.yandex.ru/).")
  @Valid
  private BigDecimal price;

 /**
  * Идентификатор категории товара на Маркете.
  */
  @ApiModelProperty(value = "Идентификатор категории товара на Маркете.")
  private Long categoryId;

 /**
  * Название категории товара на Маркете.
  */
  @ApiModelProperty(value = "Название категории товара на Маркете.")
  private String categoryName;

  @ApiModelProperty(value = "")
  @Valid
  private GoodsStatsWeightDimensionsDTO weightDimensions;

 /**
  * Информация о складах, на которых хранится товар.  Параметр не приходит, если товара нет ни на одном складе. 
  */
  @ApiModelProperty(value = "Информация о складах, на которых хранится товар.  Параметр не приходит, если товара нет ни на одном складе. ")
  @Valid
  private List<@Valid GoodsStatsWarehouseDTO> warehouses;

 /**
  * Информация о тарифах, по которым нужно заплатить за услуги Маркета.  По некоторым услугам могут возвращаться несколько разных стоимостей. Например, в модели FBS стоимость услуги `SORTING` (обработка заказа) зависит от способа отгрузки и количества заказов в отгрузке. Подробнее о тарифах на услуги читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/introduction/rates/models/). 
  */
  @ApiModelProperty(value = "Информация о тарифах, по которым нужно заплатить за услуги Маркета.  По некоторым услугам могут возвращаться несколько разных стоимостей. Например, в модели FBS стоимость услуги `SORTING` (обработка заказа) зависит от способа отгрузки и количества заказов в отгрузке. Подробнее о тарифах на услуги читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/introduction/rates/models/). ")
  @Valid
  private List<@Valid TariffDTO> tariffs;

 /**
  * Ссылки (URL) изображений товара в хорошем качестве.
  */
  @ApiModelProperty(value = "Ссылки (URL) изображений товара в хорошем качестве.")
  private List<String> pictures;
 /**
  * Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
  * @return shopSku
  */
  @JsonProperty("shopSku")
 @Pattern(regexp="^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$") @Size(min=1,max=255)  public String getShopSku() {
    return shopSku;
  }

  /**
   * Sets the <code>shopSku</code> property.
   */
 public void setShopSku(String shopSku) {
    this.shopSku = shopSku;
  }

  /**
   * Sets the <code>shopSku</code> property.
   */
  public GoodsStatsGoodsDTO shopSku(String shopSku) {
    this.shopSku = shopSku;
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
  public GoodsStatsGoodsDTO marketSku(Long marketSku) {
    this.marketSku = marketSku;
    return this;
  }

 /**
  * Название товара.
  * @return name
  */
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  /**
   * Sets the <code>name</code> property.
   */
 public void setName(String name) {
    this.name = name;
  }

  /**
   * Sets the <code>name</code> property.
   */
  public GoodsStatsGoodsDTO name(String name) {
    this.name = name;
    return this;
  }

 /**
  * Цена на товар в валюте, которая установлена [в кабинете продавца на Маркете](https://partner.market.yandex.ru/).
  * @return price
  */
  @JsonProperty("price")
  public BigDecimal getPrice() {
    return price;
  }

  /**
   * Sets the <code>price</code> property.
   */
 public void setPrice(BigDecimal price) {
    this.price = price;
  }

  /**
   * Sets the <code>price</code> property.
   */
  public GoodsStatsGoodsDTO price(BigDecimal price) {
    this.price = price;
    return this;
  }

 /**
  * Идентификатор категории товара на Маркете.
  * @return categoryId
  */
  @JsonProperty("categoryId")
  public Long getCategoryId() {
    return categoryId;
  }

  /**
   * Sets the <code>categoryId</code> property.
   */
 public void setCategoryId(Long categoryId) {
    this.categoryId = categoryId;
  }

  /**
   * Sets the <code>categoryId</code> property.
   */
  public GoodsStatsGoodsDTO categoryId(Long categoryId) {
    this.categoryId = categoryId;
    return this;
  }

 /**
  * Название категории товара на Маркете.
  * @return categoryName
  */
  @JsonProperty("categoryName")
  public String getCategoryName() {
    return categoryName;
  }

  /**
   * Sets the <code>categoryName</code> property.
   */
 public void setCategoryName(String categoryName) {
    this.categoryName = categoryName;
  }

  /**
   * Sets the <code>categoryName</code> property.
   */
  public GoodsStatsGoodsDTO categoryName(String categoryName) {
    this.categoryName = categoryName;
    return this;
  }

 /**
  * Get weightDimensions
  * @return weightDimensions
  */
  @JsonProperty("weightDimensions")
  public GoodsStatsWeightDimensionsDTO getWeightDimensions() {
    return weightDimensions;
  }

  /**
   * Sets the <code>weightDimensions</code> property.
   */
 public void setWeightDimensions(GoodsStatsWeightDimensionsDTO weightDimensions) {
    this.weightDimensions = weightDimensions;
  }

  /**
   * Sets the <code>weightDimensions</code> property.
   */
  public GoodsStatsGoodsDTO weightDimensions(GoodsStatsWeightDimensionsDTO weightDimensions) {
    this.weightDimensions = weightDimensions;
    return this;
  }

 /**
  * Информация о складах, на которых хранится товар.  Параметр не приходит, если товара нет ни на одном складе. 
  * @return warehouses
  */
  @JsonProperty("warehouses")
  public List<@Valid GoodsStatsWarehouseDTO> getWarehouses() {
    return warehouses;
  }

  /**
   * Sets the <code>warehouses</code> property.
   */
 public void setWarehouses(List<@Valid GoodsStatsWarehouseDTO> warehouses) {
    this.warehouses = warehouses;
  }

  /**
   * Sets the <code>warehouses</code> property.
   */
  public GoodsStatsGoodsDTO warehouses(List<@Valid GoodsStatsWarehouseDTO> warehouses) {
    this.warehouses = warehouses;
    return this;
  }

  /**
   * Adds a new item to the <code>warehouses</code> list.
   */
  public GoodsStatsGoodsDTO addWarehousesItem(GoodsStatsWarehouseDTO warehousesItem) {
    this.warehouses.add(warehousesItem);
    return this;
  }

 /**
  * Информация о тарифах, по которым нужно заплатить за услуги Маркета.  По некоторым услугам могут возвращаться несколько разных стоимостей. Например, в модели FBS стоимость услуги &#x60;SORTING&#x60; (обработка заказа) зависит от способа отгрузки и количества заказов в отгрузке. Подробнее о тарифах на услуги читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/introduction/rates/models/). 
  * @return tariffs
  */
  @JsonProperty("tariffs")
  public List<@Valid TariffDTO> getTariffs() {
    return tariffs;
  }

  /**
   * Sets the <code>tariffs</code> property.
   */
 public void setTariffs(List<@Valid TariffDTO> tariffs) {
    this.tariffs = tariffs;
  }

  /**
   * Sets the <code>tariffs</code> property.
   */
  public GoodsStatsGoodsDTO tariffs(List<@Valid TariffDTO> tariffs) {
    this.tariffs = tariffs;
    return this;
  }

  /**
   * Adds a new item to the <code>tariffs</code> list.
   */
  public GoodsStatsGoodsDTO addTariffsItem(TariffDTO tariffsItem) {
    this.tariffs.add(tariffsItem);
    return this;
  }

 /**
  * Ссылки (URL) изображений товара в хорошем качестве.
  * @return pictures
  */
  @JsonProperty("pictures")
  public List<String> getPictures() {
    return pictures;
  }

  /**
   * Sets the <code>pictures</code> property.
   */
 public void setPictures(List<String> pictures) {
    this.pictures = pictures;
  }

  /**
   * Sets the <code>pictures</code> property.
   */
  public GoodsStatsGoodsDTO pictures(List<String> pictures) {
    this.pictures = pictures;
    return this;
  }

  /**
   * Adds a new item to the <code>pictures</code> list.
   */
  public GoodsStatsGoodsDTO addPicturesItem(String picturesItem) {
    this.pictures.add(picturesItem);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

