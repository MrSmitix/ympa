//
// PriceSuggestOfferDTO.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation

/// Товар с ценами для продвижения. 
public struct PriceSuggestOfferDTO: Codable {
    /// SKU на Маркете.
    public var marketSku: Int64?
    /// Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
    public var offerId: String?
    /// Цены для продвижения. 
    public var priceSuggestion: [PriceSuggestDTO]?

    public init(marketSku: Int64? = nil, offerId: String? = nil, priceSuggestion: [PriceSuggestDTO]? = nil) {
        self.marketSku = marketSku
        self.offerId = offerId
        self.priceSuggestion = priceSuggestion
    }
}
