package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.GoodsStatsWarehouseDTO;
import org.openapitools.model.GoodsStatsWeightDimensionsDTO;
import org.openapitools.model.TariffDTO;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Информация о товаре.
 */

@Schema(name = "GoodsStatsGoodsDTO", description = "Информация о товаре.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-09T22:33:46.054383208Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GoodsStatsGoodsDTO {

  private String shopSku;

  private Long marketSku;

  private String name;

  private BigDecimal price;

  private Long categoryId;

  private String categoryName;

  private GoodsStatsWeightDimensionsDTO weightDimensions;

  @Valid
  private JsonNullable<List<@Valid GoodsStatsWarehouseDTO>> warehouses = JsonNullable.<List<@Valid GoodsStatsWarehouseDTO>>undefined();

  @Valid
  private JsonNullable<List<@Valid TariffDTO>> tariffs = JsonNullable.<List<@Valid TariffDTO>>undefined();

  @Valid
  private JsonNullable<List<String>> pictures = JsonNullable.<List<String>>undefined();

  public GoodsStatsGoodsDTO shopSku(String shopSku) {
    this.shopSku = shopSku;
    return this;
  }

  /**
   * Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
   * @return shopSku
   */
  @Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$") @Size(min = 1, max = 255) 
  @Schema(name = "shopSku", description = "Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("shopSku")
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
  
  @Schema(name = "marketSku", description = "SKU на Маркете.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("marketSku")
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
  
  @Schema(name = "name", description = "Название товара.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
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
  @Valid 
  @Schema(name = "price", description = "Цена на товар в валюте, которая установлена [в кабинете продавца на Маркете](https://partner.market.yandex.ru/).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("price")
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
  
  @Schema(name = "categoryId", description = "Идентификатор категории товара на Маркете.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("categoryId")
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
  
  @Schema(name = "categoryName", description = "Название категории товара на Маркете.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("categoryName")
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
  @Valid 
  @Schema(name = "weightDimensions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("weightDimensions")
  public GoodsStatsWeightDimensionsDTO getWeightDimensions() {
    return weightDimensions;
  }

  public void setWeightDimensions(GoodsStatsWeightDimensionsDTO weightDimensions) {
    this.weightDimensions = weightDimensions;
  }

  public GoodsStatsGoodsDTO warehouses(List<@Valid GoodsStatsWarehouseDTO> warehouses) {
    this.warehouses = JsonNullable.of(warehouses);
    return this;
  }

  public GoodsStatsGoodsDTO addWarehousesItem(GoodsStatsWarehouseDTO warehousesItem) {
    if (this.warehouses == null || !this.warehouses.isPresent()) {
      this.warehouses = JsonNullable.of(new ArrayList<>());
    }
    this.warehouses.get().add(warehousesItem);
    return this;
  }

  /**
   * Информация о складах, на которых хранится товар.  Параметр не приходит, если товара нет ни на одном складе. 
   * @return warehouses
   */
  @Valid 
  @Schema(name = "warehouses", description = "Информация о складах, на которых хранится товар.  Параметр не приходит, если товара нет ни на одном складе. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("warehouses")
  public JsonNullable<List<@Valid GoodsStatsWarehouseDTO>> getWarehouses() {
    return warehouses;
  }

  public void setWarehouses(JsonNullable<List<@Valid GoodsStatsWarehouseDTO>> warehouses) {
    this.warehouses = warehouses;
  }

  public GoodsStatsGoodsDTO tariffs(List<@Valid TariffDTO> tariffs) {
    this.tariffs = JsonNullable.of(tariffs);
    return this;
  }

  public GoodsStatsGoodsDTO addTariffsItem(TariffDTO tariffsItem) {
    if (this.tariffs == null || !this.tariffs.isPresent()) {
      this.tariffs = JsonNullable.of(new ArrayList<>());
    }
    this.tariffs.get().add(tariffsItem);
    return this;
  }

  /**
   * Информация о тарифах, по которым нужно заплатить за услуги Маркета.  По некоторым услугам могут возвращаться несколько разных стоимостей. Например, в модели FBS стоимость услуги `SORTING` (обработка заказа) зависит от способа отгрузки и количества заказов в отгрузке. Подробнее о тарифах на услуги читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/introduction/rates/models/). 
   * @return tariffs
   */
  @Valid 
  @Schema(name = "tariffs", description = "Информация о тарифах, по которым нужно заплатить за услуги Маркета.  По некоторым услугам могут возвращаться несколько разных стоимостей. Например, в модели FBS стоимость услуги `SORTING` (обработка заказа) зависит от способа отгрузки и количества заказов в отгрузке. Подробнее о тарифах на услуги читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/introduction/rates/models/). ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tariffs")
  public JsonNullable<List<@Valid TariffDTO>> getTariffs() {
    return tariffs;
  }

  public void setTariffs(JsonNullable<List<@Valid TariffDTO>> tariffs) {
    this.tariffs = tariffs;
  }

  public GoodsStatsGoodsDTO pictures(List<String> pictures) {
    this.pictures = JsonNullable.of(pictures);
    return this;
  }

  public GoodsStatsGoodsDTO addPicturesItem(String picturesItem) {
    if (this.pictures == null || !this.pictures.isPresent()) {
      this.pictures = JsonNullable.of(new ArrayList<>());
    }
    this.pictures.get().add(picturesItem);
    return this;
  }

  /**
   * Ссылки (URL) изображений товара в хорошем качестве.
   * @return pictures
   */
  
  @Schema(name = "pictures", description = "Ссылки (URL) изображений товара в хорошем качестве.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pictures")
  public JsonNullable<List<String>> getPictures() {
    return pictures;
  }

  public void setPictures(JsonNullable<List<String>> pictures) {
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
        equalsNullable(this.warehouses, goodsStatsGoodsDTO.warehouses) &&
        equalsNullable(this.tariffs, goodsStatsGoodsDTO.tariffs) &&
        equalsNullable(this.pictures, goodsStatsGoodsDTO.pictures);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(shopSku, marketSku, name, price, categoryId, categoryName, weightDimensions, hashCodeNullable(warehouses), hashCodeNullable(tariffs), hashCodeNullable(pictures));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
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

