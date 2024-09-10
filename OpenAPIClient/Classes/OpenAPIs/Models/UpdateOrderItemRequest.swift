//
// UpdateOrderItemRequest.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

/** Запрос на обновление состава заказа. */
public struct UpdateOrderItemRequest: Codable, JSONEncodable, Hashable {

    static let itemsRule = ArrayRule(minItems: 1, maxItems: nil, uniqueItems: false)
    /** Список товаров в заказе.  Если магазин не передал информацию о товаре во входных данных, он будет удален из заказа.  Обязательный параметр.  */
    public var items: [OrderItemModificationDTO]
    public var reason: OrderItemsModificationRequestReasonType?

    public init(items: [OrderItemModificationDTO], reason: OrderItemsModificationRequestReasonType? = nil) {
        self.items = items
        self.reason = reason
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case items
        case reason
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encode(items, forKey: .items)
        try container.encodeIfPresent(reason, forKey: .reason)
    }
}

