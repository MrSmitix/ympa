//
// RejectedPromoOfferDeleteDTO.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation

/// Информация о товаре и ошибки, которые появились при его удалении. 
public struct RejectedPromoOfferDeleteDTO: Codable {
    /// Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
    public var offerId: String
    public var reason: RejectedPromoOfferDeleteReasonType

    public init(offerId: String, reason: RejectedPromoOfferDeleteReasonType) {
        self.offerId = offerId
        self.reason = reason
    }
}
