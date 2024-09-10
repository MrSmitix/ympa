//
// ParcelBoxDTO.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

/** Элемент отображает одно грузовое место. Вложенные поля больше не используются, передавайте элемент пустым в запросах и не обращайте внимание на содержимое в ответах. */
public struct ParcelBoxDTO: Codable, JSONEncodable, Hashable {

    static let fulfilmentIdRule = StringRule(minLength: nil, maxLength: nil, pattern: "/^[\\p{Alnum}- ]*$/")
    /** {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  */
    public var id: Int64?
    /** {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  */
    public var fulfilmentId: String?

    public init(id: Int64? = nil, fulfilmentId: String? = nil) {
        self.id = id
        self.fulfilmentId = fulfilmentId
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case id
        case fulfilmentId
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encodeIfPresent(id, forKey: .id)
        try container.encodeIfPresent(fulfilmentId, forKey: .fulfilmentId)
    }
}

