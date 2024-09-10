//
// GetPriceWithVatDTO.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation

/// Цена с указанием ставки НДС и времени последнего обновления. 
public struct GetPriceWithVatDTO: Codable {
    /// Цена на товар.
    public var value: Double?
    /// Цена на товар без скидки.  Число должно быть целым. Вы можете указать цену со скидкой от 5 до 99%.  Передавайте этот параметр при каждом обновлении цены, если предоставляете скидку на товар. 
    public var discountBase: Double?
    public var currencyId: CurrencyType?
    /// Идентификатор ставки НДС, применяемой для товара:  * `2` — 10%. * `5` — 0%. * `6` — не облагается НДС. * `7` — 20%.  Если параметр не указан, используется ставка НДС, установленная в кабинете. 
    public var vat: Int?
    /// Время последнего обновления.
    public var updatedAt: Date

    public init(value: Double? = nil, discountBase: Double? = nil, currencyId: CurrencyType? = nil, vat: Int? = nil, updatedAt: Date) {
        self.value = value
        self.discountBase = discountBase
        self.currencyId = currencyId
        self.vat = vat
        self.updatedAt = updatedAt
    }
}
