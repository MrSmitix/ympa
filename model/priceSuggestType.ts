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


/**
 * Тип цены:  * `BUYBOX` — самая низкая цена на товар, по которой он продается сейчас. Эта цена обновляется в режиме реального времени. Если вы установите цену ниже, начнет показываться ваше предложение. Если для этого значения в параметре `price` указана цена, которая совпадает с вашей, значит, ваш товар уже показывается на витрине. Если кроме вас этот товар продают другие продавцы по такой же цене, их предложения также будут отображаться вместе с вашими по очереди. * `DEFAULT_OFFER` — рекомендованная Маркетом цена, которая привлекает покупателей. Рассчитывается только для популярных на сервисе товаров и обновляется раз в четыре часа. * `MIN_PRICE_MARKET` — минимальная цена на Маркете. Самая низкая цена среди всех предложений товара на Маркете во всех регионах, включая те, которые не видны на витрине. Эта цена обновляется в режиме реального времени и обеспечивает большее количество показов на Маркете, чем самая низкая или рекомендованная цена. 
 */
export type PriceSuggestType = 'BUYBOX' | 'DEFAULT_OFFER' | 'MIN_PRICE_MARKET';

export const PriceSuggestType = {
    Buybox: 'BUYBOX' as PriceSuggestType,
    DefaultOffer: 'DEFAULT_OFFER' as PriceSuggestType,
    MinPriceMarket: 'MIN_PRICE_MARKET' as PriceSuggestType
}
