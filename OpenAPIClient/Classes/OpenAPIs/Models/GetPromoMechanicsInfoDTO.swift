//
// GetPromoMechanicsInfoDTO.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

/** Информация о типе акции. */
public struct GetPromoMechanicsInfoDTO: Codable, JSONEncodable, Hashable {

    public var type: MechanicsType
    public var promocodeInfo: GetPromoPromocodeInfoDTO?

    public init(type: MechanicsType, promocodeInfo: GetPromoPromocodeInfoDTO? = nil) {
        self.type = type
        self.promocodeInfo = promocodeInfo
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case type
        case promocodeInfo
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encode(type, forKey: .type)
        try container.encodeIfPresent(promocodeInfo, forKey: .promocodeInfo)
    }
}

