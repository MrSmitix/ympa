/**
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
package ympa_kotlin_vertx_server.models


        /**
* Предупреждение, которое появилось при добавлении товара:  * `DEEP_DISCOUNT_OFFER` — большая разница с ценой в каталоге. Проверьте, нет ли ошибки.  * `CATALOG_PRICE_IS_LOWER_THAN_PROMO` — [базовая цена](*basic-price) в кабинете ниже цены по акции. У товара в акции будет отображаться базовая цена.  * `SHOP_PRICES_ARE_LOWER_THAN_PROMO` — цена в отдельном магазине ниже цены по акции. У товара в акции будет отображаться цена в магазине. Для остальных магазинов будет действовать цена по акции.  * `PROMOCODE_PRICE_MORE_THAN_MAX_FAIR_PRICE` — в отдельном магазине цена с учетом промокода выше максимально возможной цены. Товар не будет участвовать в акции.  * `SHOP_OFFER_NOT_ELIGIBLE_FOR_PROMO` — товар в отдельном магазине не подходит под условия акции. 
* Values: DEEP_DISCOUNT_OFFER,CATALOG_PRICE_IS_LOWER_THAN_PROMO,SHOP_PRICES_ARE_LOWER_THAN_PROMO,PROMOCODE_PRICE_MORE_THAN_MAX_FAIR_PRICE,SHOP_OFFER_NOT_ELIGIBLE_FOR_PROMO
*/
enum class PromoOfferUpdateWarningCodeType(val value: kotlin.String){

    DEEP_DISCOUNT_OFFER("DEEP_DISCOUNT_OFFER"),

    CATALOG_PRICE_IS_LOWER_THAN_PROMO("CATALOG_PRICE_IS_LOWER_THAN_PROMO"),

    SHOP_PRICES_ARE_LOWER_THAN_PROMO("SHOP_PRICES_ARE_LOWER_THAN_PROMO"),

    PROMOCODE_PRICE_MORE_THAN_MAX_FAIR_PRICE("PROMOCODE_PRICE_MORE_THAN_MAX_FAIR_PRICE"),

    SHOP_OFFER_NOT_ELIGIBLE_FOR_PROMO("SHOP_OFFER_NOT_ELIGIBLE_FOR_PROMO");

}

