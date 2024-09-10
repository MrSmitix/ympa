//
// OrderStatusChangeDTO.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

/** Заказ. */
public struct OrderStatusChangeDTO: Codable, JSONEncodable, Hashable {

    public var status: OrderStatusType
    public var substatus: OrderSubstatusType?
    public var delivery: OrderStatusChangeDeliveryDTO?

    public init(status: OrderStatusType, substatus: OrderSubstatusType? = nil, delivery: OrderStatusChangeDeliveryDTO? = nil) {
        self.status = status
        self.substatus = substatus
        self.delivery = delivery
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case status
        case substatus
        case delivery
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encode(status, forKey: .status)
        try container.encodeIfPresent(substatus, forKey: .substatus)
        try container.encodeIfPresent(delivery, forKey: .delivery)
    }
}

