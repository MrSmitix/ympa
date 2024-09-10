//
// OrderStatusChangeDTO.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation

/// Заказ. 
public struct OrderStatusChangeDTO: Codable {
    public var status: OrderStatusType
    public var substatus: OrderSubstatusType?
    public var delivery: OrderStatusChangeDeliveryDTO?

    public init(status: OrderStatusType, substatus: OrderSubstatusType? = nil, delivery: OrderStatusChangeDeliveryDTO? = nil) {
        self.status = status
        self.substatus = substatus
        self.delivery = delivery
    }
}
