package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.GoodsStatsWarehouseDTO;
import com.prokarma.pkmst.model.GoodsStatsWeightDimensionsDTO;
import com.prokarma.pkmst.model.TariffDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Информация о товаре.
 */
@ApiModel(description = "Информация о товаре.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-09-09T22:21:39.140910578Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GoodsStatsGoodsDTO   {
  @JsonProperty("shopSku")
  private String shopSku;

  @JsonProperty("marketSku")
  private Long marketSku;

  @JsonProperty("name")
  private String name;

  @JsonProperty("price")
  private BigDecimal price;

  @JsonProperty("categoryId")
  private Long categoryId;

  @JsonProperty("categoryName")
  private String categoryName;

  @JsonProperty("weightDimensions")
  private GoodsStatsWeightDimensionsDTO weightDimensions;

  @JsonProperty("warehouses")
  
  private List<GoodsStatsWarehouseDTO> warehouses = null;

  @JsonProperty("tariffs")
  
  private List<TariffDTO> tariffs = null;

  @JsonProperty("pictures")
  
  private List<String> pictures = null;

  public GoodsStatsGoodsDTO shopSku(String shopSku) {
    this.shopSku = shopSku;
    return this;
  }

  /**
   * Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
   * @return shopSku
   */
  @ApiModelProperty(value = "Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) ")
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
   */
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
   */
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
   */
  @ApiModelProperty(value = "Цена на товар в валюте, которая установлена [в кабинете продавца на Маркете](https://partner.market.yandex.ru/).")
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
   */
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
   */
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
   */
  @ApiModelProperty(value = "")
  public GoodsStatsWeightDimensionsDTO getWeightDimensions() {
    return weightDimensions;
  }

  public void setWeightDimensions(GoodsStatsWeightDimensionsDTO weightDimensions) {
    this.weightDimensions = weightDimensions;
  }

  public GoodsStatsGoodsDTO warehouses(List<GoodsStatsWarehouseDTO> warehouses) {
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
   */
  @ApiModelProperty(value = "Информация о складах, на которых хранится товар.  Параметр не приходит, если товара нет ни на одном складе. ")
  public List<GoodsStatsWarehouseDTO> getWarehouses() {
    return warehouses;
  }

  public void setWarehouses(List<GoodsStatsWarehouseDTO> warehouses) {
    this.warehouses = warehouses;
  }

  public GoodsStatsGoodsDTO tariffs(List<TariffDTO> tariffs) {
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
   * Информация о тарифах, по которым нужно заплатить за услуги Маркета.  По некоторым услугам могут возвращаться несколько разных стоимостей. Например, в модели FBS стоимость услуги `SORTING` (обработка заказа) зависит от способа отгрузки и количества заказов в отгрузке. Подробнее о тарифах на услуги читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/introduction/rates/models/). 
   * @return tariffs
   */
  @ApiModelProperty(value = "Информация о тарифах, по которым нужно заплатить за услуги Маркета.  По некоторым услугам могут возвращаться несколько разных стоимостей. Например, в модели FBS стоимость услуги `SORTING` (обработка заказа) зависит от способа отгрузки и количества заказов в отгрузке. Подробнее о тарифах на услуги читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/introduction/rates/models/). ")
  public List<TariffDTO> getTariffs() {
    return tariffs;
  }

  public void setTariffs(List<TariffDTO> tariffs) {
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
   */
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

