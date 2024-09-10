//
// SetOrderBoxLayoutRequest.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

public struct SetOrderBoxLayoutRequest: Codable, JSONEncodable, Hashable {

    static let boxesRule = ArrayRule(minItems: 1, maxItems: nil, uniqueItems: false)
    /** Список коробок. */
    public var boxes: [OrderBoxLayoutDTO]
    /** Передайте `true`, если вы собираетесь удалить часть товаров из заказа. */
    public var allowRemove: Bool? = false

    public init(boxes: [OrderBoxLayoutDTO], allowRemove: Bool? = false) {
        self.boxes = boxes
        self.allowRemove = allowRemove
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case boxes
        case allowRemove
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encode(boxes, forKey: .boxes)
        try container.encodeIfPresent(allowRemove, forKey: .allowRemove)
    }
}

