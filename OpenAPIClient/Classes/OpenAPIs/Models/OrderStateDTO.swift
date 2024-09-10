//
// OrderStateDTO.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

/** Информация по заказу. */
public struct OrderStateDTO: Codable, JSONEncodable, Hashable {

    /** Идентификатор заказа. */
    public var id: Int64
    public var status: OrderStatusType
    public var substatus: OrderSubstatusType?

    public init(id: Int64, status: OrderStatusType, substatus: OrderSubstatusType? = nil) {
        self.id = id
        self.status = status
        self.substatus = substatus
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case id
        case status
        case substatus
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encode(id, forKey: .id)
        try container.encode(status, forKey: .status)
        try container.encodeIfPresent(substatus, forKey: .substatus)
    }
}

