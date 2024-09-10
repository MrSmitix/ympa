//
// FeedbackCommentAuthorDTO.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

/** Информация об авторе комментария. */
public struct FeedbackCommentAuthorDTO: Codable, JSONEncodable, Hashable {

    public var type: FeedbackCommentAuthorType?
    /** Имя автора отзыва или название магазина. */
    public var name: String?

    public init(type: FeedbackCommentAuthorType? = nil, name: String? = nil) {
        self.type = type
        self.name = name
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case type
        case name
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encodeIfPresent(type, forKey: .type)
        try container.encodeIfPresent(name, forKey: .name)
    }
}

