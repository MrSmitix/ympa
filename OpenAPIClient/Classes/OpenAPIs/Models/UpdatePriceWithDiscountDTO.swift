//
// UpdatePriceWithDiscountDTO.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

/** Цена с указанием скидки. */
public struct UpdatePriceWithDiscountDTO: Codable, JSONEncodable, Hashable {

    static let valueRule = NumericRule<Double>(minimum: 0, exclusiveMinimum: true, maximum: nil, exclusiveMaximum: false, multipleOf: nil)
    static let discountBaseRule = NumericRule<Double>(minimum: 0, exclusiveMinimum: true, maximum: nil, exclusiveMaximum: false, multipleOf: nil)
    /** Значение. */
    public var value: Double
    public var currencyId: CurrencyType
    /** Цена до скидки.  Число должно быть целым. Вы можете указать цену со скидкой от 5 до 99%.  Передавайте этот параметр при каждом обновлении цены, если предоставляете скидку на товар.  */
    public var discountBase: Double?

    public init(value: Double, currencyId: CurrencyType, discountBase: Double? = nil) {
        self.value = value
        self.currencyId = currencyId
        self.discountBase = discountBase
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case value
        case currencyId
        case discountBase
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encode(value, forKey: .value)
        try container.encode(currencyId, forKey: .currencyId)
        try container.encodeIfPresent(discountBase, forKey: .discountBase)
    }
}

