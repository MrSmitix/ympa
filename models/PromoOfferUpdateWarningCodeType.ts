/* tslint:disable */
/* eslint-disable */
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
 * Предупреждение, которое появилось при добавлении товара:
 * 
 * * `DEEP_DISCOUNT_OFFER` — большая разница с ценой в каталоге. Проверьте, нет ли ошибки.
 * 
 * * `CATALOG_PRICE_IS_LOWER_THAN_PROMO` — [базовая цена](*basic-price) в кабинете ниже цены по акции. У товара в акции будет отображаться базовая цена.
 * 
 * * `SHOP_PRICES_ARE_LOWER_THAN_PROMO` — цена в отдельном магазине ниже цены по акции. У товара в акции будет отображаться цена в магазине. Для остальных магазинов будет действовать цена по акции.
 * 
 * * `PROMOCODE_PRICE_MORE_THAN_MAX_FAIR_PRICE` — в отдельном магазине цена с учетом промокода выше максимально возможной цены. Товар не будет участвовать в акции.
 * 
 * * `SHOP_OFFER_NOT_ELIGIBLE_FOR_PROMO` — товар в отдельном магазине не подходит под условия акции.
 * 
 * @export
 */
export const PromoOfferUpdateWarningCodeType = {
    DeepDiscountOffer: 'DEEP_DISCOUNT_OFFER',
    CatalogPriceIsLowerThanPromo: 'CATALOG_PRICE_IS_LOWER_THAN_PROMO',
    ShopPricesAreLowerThanPromo: 'SHOP_PRICES_ARE_LOWER_THAN_PROMO',
    PromocodePriceMoreThanMaxFairPrice: 'PROMOCODE_PRICE_MORE_THAN_MAX_FAIR_PRICE',
    ShopOfferNotEligibleForPromo: 'SHOP_OFFER_NOT_ELIGIBLE_FOR_PROMO'
} as const;
export type PromoOfferUpdateWarningCodeType = typeof PromoOfferUpdateWarningCodeType[keyof typeof PromoOfferUpdateWarningCodeType];


export function instanceOfPromoOfferUpdateWarningCodeType(value: any): boolean {
    for (const key in PromoOfferUpdateWarningCodeType) {
        if (Object.prototype.hasOwnProperty.call(PromoOfferUpdateWarningCodeType, key)) {
            if (PromoOfferUpdateWarningCodeType[key as keyof typeof PromoOfferUpdateWarningCodeType] === value) {
                return true;
            }
        }
    }
    return false;
}

export function PromoOfferUpdateWarningCodeTypeFromJSON(json: any): PromoOfferUpdateWarningCodeType {
    return PromoOfferUpdateWarningCodeTypeFromJSONTyped(json, false);
}

export function PromoOfferUpdateWarningCodeTypeFromJSONTyped(json: any, ignoreDiscriminator: boolean): PromoOfferUpdateWarningCodeType {
    return json as PromoOfferUpdateWarningCodeType;
}

export function PromoOfferUpdateWarningCodeTypeToJSON(value?: PromoOfferUpdateWarningCodeType | null): any {
    return value as any;
}
