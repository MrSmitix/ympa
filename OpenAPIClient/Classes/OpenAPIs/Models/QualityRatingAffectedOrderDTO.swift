//
// QualityRatingAffectedOrderDTO.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

/** Информация о заказе, который повлиял на индекс качества. */
public struct QualityRatingAffectedOrderDTO: Codable, JSONEncodable, Hashable {

    static let orderIdRule = NumericRule<Int64>(minimum: 0, exclusiveMinimum: false, maximum: nil, exclusiveMaximum: false, multipleOf: nil)
    /** Идентификатор заказа. */
    public var orderId: Int64
    /** Описание проблемы. */
    public var description: String
    public var componentType: AffectedOrderQualityRatingComponentType

    public init(orderId: Int64, description: String, componentType: AffectedOrderQualityRatingComponentType) {
        self.orderId = orderId
        self.description = description
        self.componentType = componentType
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case orderId
        case description
        case componentType
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encode(orderId, forKey: .orderId)
        try container.encode(description, forKey: .description)
        try container.encode(componentType, forKey: .componentType)
    }
}

