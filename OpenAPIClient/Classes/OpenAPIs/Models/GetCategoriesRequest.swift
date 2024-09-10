//
// GetCategoriesRequest.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

/** Параметры запроса категорий.  */
public struct GetCategoriesRequest: Codable, JSONEncodable, Hashable {

    public var language: LanguageType?

    public init(language: LanguageType? = nil) {
        self.language = language
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case language
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encodeIfPresent(language, forKey: .language)
    }
}

