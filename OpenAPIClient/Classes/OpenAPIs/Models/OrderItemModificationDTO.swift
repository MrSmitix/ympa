//
// OrderItemModificationDTO.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

/** Список товаров в заказе.  Если магазин не передал информацию о товаре во входных данных, он будет удален из заказа.  Обязательный параметр.  */
public struct OrderItemModificationDTO: Codable, JSONEncodable, Hashable {

    static let countRule = NumericRule<Int>(minimum: 0, exclusiveMinimum: false, maximum: nil, exclusiveMaximum: false, multipleOf: nil)
    /** Идентификатор товара в рамках заказа.  Получить идентификатор можно с помощью ресурсов [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md) или [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md).  Обязательный параметр.  */
    public var id: Int64
    /** Новое количество товара. */
    public var count: Int
    /** Информация о маркировке единиц товара.  Передавайте в запросе все единицы товара, который подлежит маркировке.  Обязательный параметр, если в заказе есть товары, подлежащие маркировке [в системе «Честный ЗНАК»](https://честныйзнак.рф/).  */
    public var instances: [BriefOrderItemInstanceDTO]?

    public init(id: Int64, count: Int, instances: [BriefOrderItemInstanceDTO]? = nil) {
        self.id = id
        self.count = count
        self.instances = instances
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case id
        case count
        case instances
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encode(id, forKey: .id)
        try container.encode(count, forKey: .count)
        try container.encodeIfPresent(instances, forKey: .instances)
    }
}

