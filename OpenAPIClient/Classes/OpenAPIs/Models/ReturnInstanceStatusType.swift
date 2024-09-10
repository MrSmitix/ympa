//
// ReturnInstanceStatusType.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

/** Логистический статус конкретного товара. */
public enum ReturnInstanceStatusType: String, Codable, CaseIterable {
    case created = "CREATED"
    case received = "RECEIVED"
    case inTransit = "IN_TRANSIT"
    case readyForPickup = "READY_FOR_PICKUP"
    case picked = "PICKED"
    case receivedOnFulfillment = "RECEIVED_ON_FULFILLMENT"
    case cancelled = "CANCELLED"
    case lost = "LOST"
    case utilized = "UTILIZED"
    case preparedForUtilization = "PREPARED_FOR_UTILIZATION"
    case expropriated = "EXPROPRIATED"
    case notInDemand = "NOT_IN_DEMAND"
}
