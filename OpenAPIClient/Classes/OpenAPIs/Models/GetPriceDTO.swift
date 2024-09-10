//
// GetPriceDTO.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

/** Цена с указанием времени последнего обновления. */
public struct GetPriceDTO: Codable, JSONEncodable, Hashable {

    static let valueRule = NumericRule<Double>(minimum: 0, exclusiveMinimum: true, maximum: nil, exclusiveMaximum: false, multipleOf: nil)
    /** Значение. */
    public var value: Double
    public var currencyId: CurrencyType
    /** Время последнего обновления. */
    public var updatedAt: Date

    public init(value: Double, currencyId: CurrencyType, updatedAt: Date) {
        self.value = value
        self.currencyId = currencyId
        self.updatedAt = updatedAt
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case value
        case currencyId
        case updatedAt
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encode(value, forKey: .value)
        try container.encode(currencyId, forKey: .currencyId)
        try container.encode(updatedAt, forKey: .updatedAt)
    }
}

