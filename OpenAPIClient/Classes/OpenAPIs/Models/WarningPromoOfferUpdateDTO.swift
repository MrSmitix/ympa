//
// WarningPromoOfferUpdateDTO.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

/** Описание предупреждения, которое появилось при добавлении товара. */
public struct WarningPromoOfferUpdateDTO: Codable, JSONEncodable, Hashable {

    static let offerIdRule = StringRule(minLength: 1, maxLength: 255, pattern: "/^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$/")
    /** Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  */
    public var offerId: String
    /** Предупреждения, которые появились при добавлении товара в акцию или изменении его цен. */
    public var warnings: [PromoOfferUpdateWarningDTO]

    public init(offerId: String, warnings: [PromoOfferUpdateWarningDTO]) {
        self.offerId = offerId
        self.warnings = warnings
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case offerId
        case warnings
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encode(offerId, forKey: .offerId)
        try container.encode(warnings, forKey: .warnings)
    }
}

