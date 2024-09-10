//
// CalculatedTariffDTO.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

/** Информация об услугах Маркета. */
public struct CalculatedTariffDTO: Codable, JSONEncodable, Hashable {

    public var type: CalculatedTariffType
    /** Стоимость услуги в рублях. */
    public var amount: Double?
    /** Параметры расчета тарифа. */
    public var parameters: [TariffParameterDTO]

    public init(type: CalculatedTariffType, amount: Double? = nil, parameters: [TariffParameterDTO]) {
        self.type = type
        self.amount = amount
        self.parameters = parameters
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case type
        case amount
        case parameters
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encode(type, forKey: .type)
        try container.encodeIfPresent(amount, forKey: .amount)
        try container.encode(parameters, forKey: .parameters)
    }
}

