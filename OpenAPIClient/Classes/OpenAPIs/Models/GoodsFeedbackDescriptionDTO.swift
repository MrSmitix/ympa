//
// GoodsFeedbackDescriptionDTO.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

/** Текстовая часть отзыва. */
public struct GoodsFeedbackDescriptionDTO: Codable, JSONEncodable, Hashable {

    /** Описание плюсов товара в отзыве. */
    public var advantages: String?
    /** Описание минусов товара в отзыве. */
    public var disadvantages: String?
    /** Комментарий в отзыве. */
    public var comment: String?

    public init(advantages: String? = nil, disadvantages: String? = nil, comment: String? = nil) {
        self.advantages = advantages
        self.disadvantages = disadvantages
        self.comment = comment
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case advantages
        case disadvantages
        case comment
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encodeIfPresent(advantages, forKey: .advantages)
        try container.encodeIfPresent(disadvantages, forKey: .disadvantages)
        try container.encodeIfPresent(comment, forKey: .comment)
    }
}

