//
// SetShipmentPalletsCountRequest.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation

/// Запрос на передачу количества упаковок в отгрузке. 
public struct SetShipmentPalletsCountRequest: Codable {
    /// Количество упаковок в отгрузке.
    public var placesCount: Int

    public init(placesCount: Int) {
        self.placesCount = placesCount
    }
}
