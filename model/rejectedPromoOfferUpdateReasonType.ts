/**
 * Партнерский API Маркета
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


/**
 * Причина отклонения изменения:  * `OFFER_DOES_NOT_EXIST` — в кабинете нет товара с таким SKU.  * `OFFER_DUPLICATION` — один и тот же товар передан несколько раз.  * `OFFER_NOT_ELIGIBLE_FOR_PROMO` — товар не подходит под условия акции.  * `OFFER_PROMOS_MAX_BYTE_SIZE_EXCEEDED` — товар не добавлен в акцию по техническим причинам.  * `DEADLINE_FOR_FOCUS_PROMOS_EXCEEDED` — истек срок добавления товаров в акцию.  * `EMPTY_OLD_PRICE` — не указана зачеркнутая цена.  * `EMPTY_PROMO_PRICE` — не указана цена по акции.  * `MAX_PROMO_PRICE_EXCEEDED` — цена по акции превышает максимально возможную цену для участия в акции.  * `PROMO_PRICE_BIGGER_THAN_MAX` — цена по акции больше 95% от зачеркнутой цены.  * `PROMO_PRICE_SMALLER_THAN_MIN` — цена по акции меньше 1% от зачеркнутой цены. 
 */
export type RejectedPromoOfferUpdateReasonType = 'OFFER_DOES_NOT_EXIST' | 'OFFER_DUPLICATION' | 'OFFER_NOT_ELIGIBLE_FOR_PROMO' | 'OFFER_PROMOS_MAX_BYTE_SIZE_EXCEEDED' | 'DEADLINE_FOR_FOCUS_PROMOS_EXCEEDED' | 'EMPTY_OLD_PRICE' | 'EMPTY_PROMO_PRICE' | 'MAX_PROMO_PRICE_EXCEEDED' | 'PROMO_PRICE_BIGGER_THAN_MAX' | 'PROMO_PRICE_SMALLER_THAN_MIN';

export const RejectedPromoOfferUpdateReasonType = {
    OfferDoesNotExist: 'OFFER_DOES_NOT_EXIST' as RejectedPromoOfferUpdateReasonType,
    OfferDuplication: 'OFFER_DUPLICATION' as RejectedPromoOfferUpdateReasonType,
    OfferNotEligibleForPromo: 'OFFER_NOT_ELIGIBLE_FOR_PROMO' as RejectedPromoOfferUpdateReasonType,
    OfferPromosMaxByteSizeExceeded: 'OFFER_PROMOS_MAX_BYTE_SIZE_EXCEEDED' as RejectedPromoOfferUpdateReasonType,
    DeadlineForFocusPromosExceeded: 'DEADLINE_FOR_FOCUS_PROMOS_EXCEEDED' as RejectedPromoOfferUpdateReasonType,
    EmptyOldPrice: 'EMPTY_OLD_PRICE' as RejectedPromoOfferUpdateReasonType,
    EmptyPromoPrice: 'EMPTY_PROMO_PRICE' as RejectedPromoOfferUpdateReasonType,
    MaxPromoPriceExceeded: 'MAX_PROMO_PRICE_EXCEEDED' as RejectedPromoOfferUpdateReasonType,
    PromoPriceBiggerThanMax: 'PROMO_PRICE_BIGGER_THAN_MAX' as RejectedPromoOfferUpdateReasonType,
    PromoPriceSmallerThanMin: 'PROMO_PRICE_SMALLER_THAN_MIN' as RejectedPromoOfferUpdateReasonType
};

