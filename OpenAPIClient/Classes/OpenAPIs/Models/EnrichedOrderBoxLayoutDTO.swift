//
// EnrichedOrderBoxLayoutDTO.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

/** Информация о коробке. */
public struct EnrichedOrderBoxLayoutDTO: Codable, JSONEncodable, Hashable {

    static let itemsRule = ArrayRule(minItems: 1, maxItems: nil, uniqueItems: false)
    /** Список товаров в коробке.  Если в коробке едет часть большого товара, в списке может быть только один пункт.  */
    public var items: [OrderBoxLayoutItemDTO]
    /** Идентификатор коробки. */
    public var boxId: Int64?

    public init(items: [OrderBoxLayoutItemDTO], boxId: Int64? = nil) {
        self.items = items
        self.boxId = boxId
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case items
        case boxId
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encode(items, forKey: .items)
        try container.encodeIfPresent(boxId, forKey: .boxId)
    }
}

