package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.GoodsStatsWarehouseDTO;
import org.openapitools.model.GoodsStatsWeightDimensionsDTO;
import org.openapitools.model.TariffDTO;

@Canonical
class GoodsStatsGoodsDTO {
    /* Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  */
    String shopSku
    /* SKU на Маркете. */
    Long marketSku
    /* Название товара. */
    String name
    /* Цена на товар в валюте, которая установлена [в кабинете продавца на Маркете](https://partner.market.yandex.ru/). */
    BigDecimal price
    /* Идентификатор категории товара на Маркете. */
    Long categoryId
    /* Название категории товара на Маркете. */
    String categoryName
    
    GoodsStatsWeightDimensionsDTO weightDimensions
    /* Информация о складах, на которых хранится товар.  Параметр не приходит, если товара нет ни на одном складе.  */
    List<GoodsStatsWarehouseDTO> warehouses
    /* Информация о тарифах, по которым нужно заплатить за услуги Маркета.  По некоторым услугам могут возвращаться несколько разных стоимостей. Например, в модели FBS стоимость услуги `SORTING` (обработка заказа) зависит от способа отгрузки и количества заказов в отгрузке. Подробнее о тарифах на услуги читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/introduction/rates/models/).  */
    List<TariffDTO> tariffs
    /* Ссылки (URL) изображений товара в хорошем качестве. */
    List<String> pictures
}
