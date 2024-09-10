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
 * Причина отклонения изменения:
 * 
 * * `OFFER_DOES_NOT_EXIST` — в кабинете нет товара с таким SKU.
 * 
 * * `OFFER_DUPLICATION` — один и тот же товар передан несколько раз.
 * 
 * * `OFFER_NOT_ELIGIBLE_FOR_PROMO` — товар не подходит под условия акции.
 * 
 * * `OFFER_PROMOS_MAX_BYTE_SIZE_EXCEEDED` — товар не добавлен в акцию по техническим причинам.
 * 
 * * `DEADLINE_FOR_FOCUS_PROMOS_EXCEEDED` — истек срок добавления товаров в акцию.
 * 
 * * `EMPTY_OLD_PRICE` — не указана зачеркнутая цена.
 * 
 * * `EMPTY_PROMO_PRICE` — не указана цена по акции.
 * 
 * * `MAX_PROMO_PRICE_EXCEEDED` — цена по акции превышает максимально возможную цену для участия в акции.
 * 
 * * `PROMO_PRICE_BIGGER_THAN_MAX` — цена по акции больше 95% от зачеркнутой цены.
 * 
 * * `PROMO_PRICE_SMALLER_THAN_MIN` — цена по акции меньше 1% от зачеркнутой цены.
 * 
 * @export
 */
export const RejectedPromoOfferUpdateReasonType = {
    OfferDoesNotExist: 'OFFER_DOES_NOT_EXIST',
    OfferDuplication: 'OFFER_DUPLICATION',
    OfferNotEligibleForPromo: 'OFFER_NOT_ELIGIBLE_FOR_PROMO',
    OfferPromosMaxByteSizeExceeded: 'OFFER_PROMOS_MAX_BYTE_SIZE_EXCEEDED',
    DeadlineForFocusPromosExceeded: 'DEADLINE_FOR_FOCUS_PROMOS_EXCEEDED',
    EmptyOldPrice: 'EMPTY_OLD_PRICE',
    EmptyPromoPrice: 'EMPTY_PROMO_PRICE',
    MaxPromoPriceExceeded: 'MAX_PROMO_PRICE_EXCEEDED',
    PromoPriceBiggerThanMax: 'PROMO_PRICE_BIGGER_THAN_MAX',
    PromoPriceSmallerThanMin: 'PROMO_PRICE_SMALLER_THAN_MIN'
} as const;
export type RejectedPromoOfferUpdateReasonType = typeof RejectedPromoOfferUpdateReasonType[keyof typeof RejectedPromoOfferUpdateReasonType];


export function instanceOfRejectedPromoOfferUpdateReasonType(value: any): boolean {
    for (const key in RejectedPromoOfferUpdateReasonType) {
        if (Object.prototype.hasOwnProperty.call(RejectedPromoOfferUpdateReasonType, key)) {
            if (RejectedPromoOfferUpdateReasonType[key as keyof typeof RejectedPromoOfferUpdateReasonType] === value) {
                return true;
            }
        }
    }
    return false;
}

export function RejectedPromoOfferUpdateReasonTypeFromJSON(json: any): RejectedPromoOfferUpdateReasonType {
    return RejectedPromoOfferUpdateReasonTypeFromJSONTyped(json, false);
}

export function RejectedPromoOfferUpdateReasonTypeFromJSONTyped(json: any, ignoreDiscriminator: boolean): RejectedPromoOfferUpdateReasonType {
    return json as RejectedPromoOfferUpdateReasonType;
}

export function RejectedPromoOfferUpdateReasonTypeToJSON(value?: RejectedPromoOfferUpdateReasonType | null): any {
    return value as any;
}
