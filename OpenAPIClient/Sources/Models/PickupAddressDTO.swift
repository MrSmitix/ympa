//
// PickupAddressDTO.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation

/// Адрес доставки. 
public struct PickupAddressDTO: Codable {
    /// Страна.
    public var country: String?
    /// Город.
    public var city: String?
    /// Улица.
    public var street: String?
    /// Номер дома.
    public var house: String?
    /// Почтовый индекс.
    public var postcode: String?

    public init(country: String? = nil, city: String? = nil, street: String? = nil, house: String? = nil, postcode: String? = nil) {
        self.country = country
        self.city = city
        self.street = street
        self.house = house
        self.postcode = postcode
    }
}
