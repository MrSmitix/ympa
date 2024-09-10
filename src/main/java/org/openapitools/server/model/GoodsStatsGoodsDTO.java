package org.openapitools.server.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.model.GoodsStatsWarehouseDTO;
import org.openapitools.server.model.GoodsStatsWeightDimensionsDTO;
import org.openapitools.server.model.TariffDTO;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Информация о товаре.
 */
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
     * Default constructor.
     */
    public GoodsStatsGoodsDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create GoodsStatsGoodsDTO.
     *
     * @param shopSku Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
     * @param marketSku SKU на Маркете.
     * @param name Название товара.
     * @param price Цена на товар в валюте, которая установлена [в кабинете продавца на Маркете](https://partner.market.yandex.ru/).
     * @param categoryId Идентификатор категории товара на Маркете.
     * @param categoryName Название категории товара на Маркете.
     * @param weightDimensions weightDimensions
     * @param warehouses Информация о складах, на которых хранится товар.  Параметр не приходит, если товара нет ни на одном складе. 
     * @param tariffs Информация о тарифах, по которым нужно заплатить за услуги Маркета.  По некоторым услугам могут возвращаться несколько разных стоимостей. Например, в модели FBS стоимость услуги &#x60;SORTING&#x60; (обработка заказа) зависит от способа отгрузки и количества заказов в отгрузке. Подробнее о тарифах на услуги читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/introduction/rates/models/). 
     * @param pictures Ссылки (URL) изображений товара в хорошем качестве.
     */
    public GoodsStatsGoodsDTO(
        String shopSku, 
        Long marketSku, 
        String name, 
        BigDecimal price, 
        Long categoryId, 
        String categoryName, 
        GoodsStatsWeightDimensionsDTO weightDimensions, 
        List<@Valid GoodsStatsWarehouseDTO> warehouses, 
        List<@Valid TariffDTO> tariffs, 
        List<String> pictures
    ) {
        this.shopSku = shopSku;
        this.marketSku = marketSku;
        this.name = name;
        this.price = price;
        this.categoryId = categoryId;
        this.categoryName = categoryName;
        this.weightDimensions = weightDimensions;
        this.warehouses = warehouses;
        this.tariffs = tariffs;
        this.pictures = pictures;
    }



    /**
     * Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
     * @return shopSku
     */
    public String getShopSku() {
        return shopSku;
    }

    public void setShopSku(String shopSku) {
        this.shopSku = shopSku;
    }

    /**
     * SKU на Маркете.
     * @return marketSku
     */
    public Long getMarketSku() {
        return marketSku;
    }

    public void setMarketSku(Long marketSku) {
        this.marketSku = marketSku;
    }

    /**
     * Название товара.
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Цена на товар в валюте, которая установлена [в кабинете продавца на Маркете](https://partner.market.yandex.ru/).
     * @return price
     */
    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * Идентификатор категории товара на Маркете.
     * @return categoryId
     */
    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * Название категории товара на Маркете.
     * @return categoryName
     */
    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    /**
     * Get weightDimensions
     * @return weightDimensions
     */
    public GoodsStatsWeightDimensionsDTO getWeightDimensions() {
        return weightDimensions;
    }

    public void setWeightDimensions(GoodsStatsWeightDimensionsDTO weightDimensions) {
        this.weightDimensions = weightDimensions;
    }

    /**
     * Информация о складах, на которых хранится товар.  Параметр не приходит, если товара нет ни на одном складе. 
     * @return warehouses
     */
    public List<@Valid GoodsStatsWarehouseDTO> getWarehouses() {
        return warehouses;
    }

    public void setWarehouses(List<@Valid GoodsStatsWarehouseDTO> warehouses) {
        this.warehouses = warehouses;
    }

    /**
     * Информация о тарифах, по которым нужно заплатить за услуги Маркета.  По некоторым услугам могут возвращаться несколько разных стоимостей. Например, в модели FBS стоимость услуги `SORTING` (обработка заказа) зависит от способа отгрузки и количества заказов в отгрузке. Подробнее о тарифах на услуги читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/introduction/rates/models/). 
     * @return tariffs
     */
    public List<@Valid TariffDTO> getTariffs() {
        return tariffs;
    }

    public void setTariffs(List<@Valid TariffDTO> tariffs) {
        this.tariffs = tariffs;
    }

    /**
     * Ссылки (URL) изображений товара в хорошем качестве.
     * @return pictures
     */
    public List<String> getPictures() {
        return pictures;
    }

    public void setPictures(List<String> pictures) {
        this.pictures = pictures;
    }

    /**
      * Create a string representation of this pojo.
    **/
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

