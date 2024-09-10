//
// QuarantineOfferDTO.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation

/// Товар в карантине. 
public struct QuarantineOfferDTO: Codable {
    /// Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
    public var offerId: String?
    public var currentPrice: BasePriceDTO?
    public var lastValidPrice: BasePriceDTO?
    /// Причины попадания товара в карантин.
    public var verdicts: [PriceQuarantineVerdictDTO]?

    public init(offerId: String? = nil, currentPrice: BasePriceDTO? = nil, lastValidPrice: BasePriceDTO? = nil, verdicts: [PriceQuarantineVerdictDTO]? = nil) {
        self.offerId = offerId
        self.currentPrice = currentPrice
        self.lastValidPrice = lastValidPrice
        self.verdicts = verdicts
    }
}
