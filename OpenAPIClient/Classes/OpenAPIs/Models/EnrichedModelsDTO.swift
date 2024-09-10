//
// EnrichedModelsDTO.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

/** Список моделей товаров. */
public struct EnrichedModelsDTO: Codable, JSONEncodable, Hashable {

    /** Список моделей товаров. */
    public var models: [EnrichedModelDTO]

    public init(models: [EnrichedModelDTO]) {
        self.models = models
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case models
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encode(models, forKey: .models)
    }
}

