//
// DeliveryServiceDTO.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation

/// Служба доставки. 
public struct DeliveryServiceDTO: Codable {
    /// Идентификатор службы доставки.
    public var id: Int64?
    /// Наименование службы доставки.
    public var name: String?

    public init(id: Int64? = nil, name: String? = nil) {
        self.id = id
        self.name = name
    }
}
