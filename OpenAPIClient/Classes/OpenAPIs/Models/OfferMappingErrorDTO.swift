//
// OfferMappingErrorDTO.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

/** Текст ошибки. */
public struct OfferMappingErrorDTO: Codable, JSONEncodable, Hashable {

    public var type: OfferMappingErrorType
    /** Идентификатор характеристики, с которой связана ошибка. */
    public var parameterId: Int64?
    /** Текст ошибки. */
    public var message: String

    public init(type: OfferMappingErrorType, parameterId: Int64? = nil, message: String) {
        self.type = type
        self.parameterId = parameterId
        self.message = message
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case type
        case parameterId
        case message
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encode(type, forKey: .type)
        try container.encodeIfPresent(parameterId, forKey: .parameterId)
        try container.encode(message, forKey: .message)
    }
}

