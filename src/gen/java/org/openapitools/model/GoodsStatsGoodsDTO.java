/*
 * Партнерский API Маркета
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * The version of the OpenAPI document: LATEST
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.GoodsStatsWarehouseDTO;
import org.openapitools.model.GoodsStatsWeightDimensionsDTO;
import org.openapitools.model.TariffDTO;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Информация о товаре.
 */
@ApiModel(description = "Информация о товаре.")
@JsonPropertyOrder({
  GoodsStatsGoodsDTO.JSON_PROPERTY_SHOP_SKU,
  GoodsStatsGoodsDTO.JSON_PROPERTY_MARKET_SKU,
  GoodsStatsGoodsDTO.JSON_PROPERTY_NAME,
  GoodsStatsGoodsDTO.JSON_PROPERTY_PRICE,
  GoodsStatsGoodsDTO.JSON_PROPERTY_CATEGORY_ID,
  GoodsStatsGoodsDTO.JSON_PROPERTY_CATEGORY_NAME,
  GoodsStatsGoodsDTO.JSON_PROPERTY_WEIGHT_DIMENSIONS,
  GoodsStatsGoodsDTO.JSON_PROPERTY_WAREHOUSES,
  GoodsStatsGoodsDTO.JSON_PROPERTY_TARIFFS,
  GoodsStatsGoodsDTO.JSON_PROPERTY_PICTURES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2024-09-09T22:24:17.175492804Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GoodsStatsGoodsDTO   {
  public static final String JSON_PROPERTY_SHOP_SKU = "shopSku";
  @JsonProperty(JSON_PROPERTY_SHOP_SKU)
  private String shopSku;

  public static final String JSON_PROPERTY_MARKET_SKU = "marketSku";
  @JsonProperty(JSON_PROPERTY_MARKET_SKU)
  private Long marketSku;

  public static final String JSON_PROPERTY_NAME = "name";
  @JsonProperty(JSON_PROPERTY_NAME)
  private String name;

  public static final String JSON_PROPERTY_PRICE = "price";
  @JsonProperty(JSON_PROPERTY_PRICE)
  private BigDecimal price;

  public static final String JSON_PROPERTY_CATEGORY_ID = "categoryId";
  @JsonProperty(JSON_PROPERTY_CATEGORY_ID)
  private Long categoryId;

  public static final String JSON_PROPERTY_CATEGORY_NAME = "categoryName";
  @JsonProperty(JSON_PROPERTY_CATEGORY_NAME)
  private String categoryName;

  public static final String JSON_PROPERTY_WEIGHT_DIMENSIONS = "weightDimensions";
  @JsonProperty(JSON_PROPERTY_WEIGHT_DIMENSIONS)
  private GoodsStatsWeightDimensionsDTO weightDimensions;

  public static final String JSON_PROPERTY_WAREHOUSES = "warehouses";
  @JsonProperty(JSON_PROPERTY_WAREHOUSES)
  private List<@Valid GoodsStatsWarehouseDTO> warehouses;

  public static final String JSON_PROPERTY_TARIFFS = "tariffs";
  @JsonProperty(JSON_PROPERTY_TARIFFS)
  private List<@Valid TariffDTO> tariffs;

  public static final String JSON_PROPERTY_PICTURES = "pictures";
  @JsonProperty(JSON_PROPERTY_PICTURES)
  private List<String> pictures;

  public GoodsStatsGoodsDTO shopSku(String shopSku) {
    this.shopSku = shopSku;
    return this;
  }

  /**
   * Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
   * @return shopSku
   **/
  @JsonProperty(value = "shopSku")
  @ApiModelProperty(value = "Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) ")
   @Pattern(regexp="^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$") @Size(min=1,max=255)
  public String getShopSku() {
    return shopSku;
  }

  public void setShopSku(String shopSku) {
    this.shopSku = shopSku;
  }

  public GoodsStatsGoodsDTO marketSku(Long marketSku) {
    this.marketSku = marketSku;
    return this;
  }

  /**
   * SKU на Маркете.
   * @return marketSku
   **/
  @JsonProperty(value = "marketSku")
  @ApiModelProperty(value = "SKU на Маркете.")
  
  public Long getMarketSku() {
    return marketSku;
  }

  public void setMarketSku(Long marketSku) {
    this.marketSku = marketSku;
  }

  public GoodsStatsGoodsDTO name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Название товара.
   * @return name
   **/
  @JsonProperty(value = "name")
  @ApiModelProperty(value = "Название товара.")
  
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public GoodsStatsGoodsDTO price(BigDecimal price) {
    this.price = price;
    return this;
  }

  /**
   * Цена на товар в валюте, которая установлена [в кабинете продавца на Маркете](https://partner.market.yandex.ru/).
   * @return price
   **/
  @JsonProperty(value = "price")
  @ApiModelProperty(value = "Цена на товар в валюте, которая установлена [в кабинете продавца на Маркете](https://partner.market.yandex.ru/).")
  @Valid 
  public BigDecimal getPrice() {
    return price;
  }

  public void setPrice(BigDecimal price) {
    this.price = price;
  }

  public GoodsStatsGoodsDTO categoryId(Long categoryId) {
    this.categoryId = categoryId;
    return this;
  }

  /**
   * Идентификатор категории товара на Маркете.
   * @return categoryId
   **/
  @JsonProperty(value = "categoryId")
  @ApiModelProperty(value = "Идентификатор категории товара на Маркете.")
  
  public Long getCategoryId() {
    return categoryId;
  }

  public void setCategoryId(Long categoryId) {
    this.categoryId = categoryId;
  }

  public GoodsStatsGoodsDTO categoryName(String categoryName) {
    this.categoryName = categoryName;
    return this;
  }

  /**
   * Название категории товара на Маркете.
   * @return categoryName
   **/
  @JsonProperty(value = "categoryName")
  @ApiModelProperty(value = "Название категории товара на Маркете.")
  
  public String getCategoryName() {
    return categoryName;
  }

  public void setCategoryName(String categoryName) {
    this.categoryName = categoryName;
  }

  public GoodsStatsGoodsDTO weightDimensions(GoodsStatsWeightDimensionsDTO weightDimensions) {
    this.weightDimensions = weightDimensions;
    return this;
  }

  /**
   * Get weightDimensions
   * @return weightDimensions
   **/
  @JsonProperty(value = "weightDimensions")
  @ApiModelProperty(value = "")
  @Valid 
  public GoodsStatsWeightDimensionsDTO getWeightDimensions() {
    return weightDimensions;
  }

  public void setWeightDimensions(GoodsStatsWeightDimensionsDTO weightDimensions) {
    this.weightDimensions = weightDimensions;
  }

  public GoodsStatsGoodsDTO warehouses(List<@Valid GoodsStatsWarehouseDTO> warehouses) {
    this.warehouses = warehouses;
    return this;
  }

  public GoodsStatsGoodsDTO addWarehousesItem(GoodsStatsWarehouseDTO warehousesItem) {
    if (this.warehouses == null) {
      this.warehouses = new ArrayList<>();
    }
    this.warehouses.add(warehousesItem);
    return this;
  }

  /**
   * Информация о складах, на которых хранится товар.  Параметр не приходит, если товара нет ни на одном складе. 
   * @return warehouses
   **/
  @JsonProperty(value = "warehouses")
  @ApiModelProperty(value = "Информация о складах, на которых хранится товар.  Параметр не приходит, если товара нет ни на одном складе. ")
  @Valid 
  public List<@Valid GoodsStatsWarehouseDTO> getWarehouses() {
    return warehouses;
  }

  public void setWarehouses(List<@Valid GoodsStatsWarehouseDTO> warehouses) {
    this.warehouses = warehouses;
  }

  public GoodsStatsGoodsDTO tariffs(List<@Valid TariffDTO> tariffs) {
    this.tariffs = tariffs;
    return this;
  }

  public GoodsStatsGoodsDTO addTariffsItem(TariffDTO tariffsItem) {
    if (this.tariffs == null) {
      this.tariffs = new ArrayList<>();
    }
    this.tariffs.add(tariffsItem);
    return this;
  }

  /**
   * Информация о тарифах, по которым нужно заплатить за услуги Маркета.  По некоторым услугам могут возвращаться несколько разных стоимостей. Например, в модели FBS стоимость услуги &#x60;SORTING&#x60; (обработка заказа) зависит от способа отгрузки и количества заказов в отгрузке. Подробнее о тарифах на услуги читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/introduction/rates/models/). 
   * @return tariffs
   **/
  @JsonProperty(value = "tariffs")
  @ApiModelProperty(value = "Информация о тарифах, по которым нужно заплатить за услуги Маркета.  По некоторым услугам могут возвращаться несколько разных стоимостей. Например, в модели FBS стоимость услуги `SORTING` (обработка заказа) зависит от способа отгрузки и количества заказов в отгрузке. Подробнее о тарифах на услуги читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/introduction/rates/models/). ")
  @Valid 
  public List<@Valid TariffDTO> getTariffs() {
    return tariffs;
  }

  public void setTariffs(List<@Valid TariffDTO> tariffs) {
    this.tariffs = tariffs;
  }

  public GoodsStatsGoodsDTO pictures(List<String> pictures) {
    this.pictures = pictures;
    return this;
  }

  public GoodsStatsGoodsDTO addPicturesItem(String picturesItem) {
    if (this.pictures == null) {
      this.pictures = new ArrayList<>();
    }
    this.pictures.add(picturesItem);
    return this;
  }

  /**
   * Ссылки (URL) изображений товара в хорошем качестве.
   * @return pictures
   **/
  @JsonProperty(value = "pictures")
  @ApiModelProperty(value = "Ссылки (URL) изображений товара в хорошем качестве.")
  
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

