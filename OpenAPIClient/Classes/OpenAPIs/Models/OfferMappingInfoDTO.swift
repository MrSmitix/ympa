//
// OfferMappingInfoDTO.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

/** Информация о карточке товара. */
public struct OfferMappingInfoDTO: Codable, JSONEncodable, Hashable {

    public var mapping: OfferMappingDTO?
    public var awaitingModerationMapping: OfferMappingDTO?
    public var rejectedMapping: OfferMappingDTO?

    public init(mapping: OfferMappingDTO? = nil, awaitingModerationMapping: OfferMappingDTO? = nil, rejectedMapping: OfferMappingDTO? = nil) {
        self.mapping = mapping
        self.awaitingModerationMapping = awaitingModerationMapping
        self.rejectedMapping = rejectedMapping
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case mapping
        case awaitingModerationMapping
        case rejectedMapping
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encodeIfPresent(mapping, forKey: .mapping)
        try container.encodeIfPresent(awaitingModerationMapping, forKey: .awaitingModerationMapping)
        try container.encodeIfPresent(rejectedMapping, forKey: .rejectedMapping)
    }
}

