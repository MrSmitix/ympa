//
// RejectedPromoOfferUpdateReasonType.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

/** Причина отклонения изменения:  * &#x60;OFFER_DOES_NOT_EXIST&#x60; — в кабинете нет товара с таким SKU.  * &#x60;OFFER_DUPLICATION&#x60; — один и тот же товар передан несколько раз.  * &#x60;OFFER_NOT_ELIGIBLE_FOR_PROMO&#x60; — товар не подходит под условия акции.  * &#x60;OFFER_PROMOS_MAX_BYTE_SIZE_EXCEEDED&#x60; — товар не добавлен в акцию по техническим причинам.  * &#x60;DEADLINE_FOR_FOCUS_PROMOS_EXCEEDED&#x60; — истек срок добавления товаров в акцию.  * &#x60;EMPTY_OLD_PRICE&#x60; — не указана зачеркнутая цена.  * &#x60;EMPTY_PROMO_PRICE&#x60; — не указана цена по акции.  * &#x60;MAX_PROMO_PRICE_EXCEEDED&#x60; — цена по акции превышает максимально возможную цену для участия в акции.  * &#x60;PROMO_PRICE_BIGGER_THAN_MAX&#x60; — цена по акции больше 95% от зачеркнутой цены.  * &#x60;PROMO_PRICE_SMALLER_THAN_MIN&#x60; — цена по акции меньше 1% от зачеркнутой цены.  */
public enum RejectedPromoOfferUpdateReasonType: String, Codable, CaseIterable {
    case offerDoesNotExist = "OFFER_DOES_NOT_EXIST"
    case offerDuplication = "OFFER_DUPLICATION"
    case offerNotEligibleForPromo = "OFFER_NOT_ELIGIBLE_FOR_PROMO"
    case offerPromosMaxByteSizeExceeded = "OFFER_PROMOS_MAX_BYTE_SIZE_EXCEEDED"
    case deadlineForFocusPromosExceeded = "DEADLINE_FOR_FOCUS_PROMOS_EXCEEDED"
    case emptyOldPrice = "EMPTY_OLD_PRICE"
    case emptyPromoPrice = "EMPTY_PROMO_PRICE"
    case maxPromoPriceExceeded = "MAX_PROMO_PRICE_EXCEEDED"
    case promoPriceBiggerThanMax = "PROMO_PRICE_BIGGER_THAN_MAX"
    case promoPriceSmallerThanMin = "PROMO_PRICE_SMALLER_THAN_MIN"
}
