//
// OrderDeliveryEacType.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

/** Тип кода подтверждения ЭАПП:  * &#x60;MERCHANT_TO_COURIER&#x60; — продавец передает код курьеру.  * &#x60;COURIER_TO_MERCHANT&#x60; — курьер передает код продавцу.  * &#x60;CHECKING_BY_MERCHANT&#x60; — продавец проверяет код на своей стороне.  */
public enum OrderDeliveryEacType: String, Codable, CaseIterable {
    case merchantToCourier = "MERCHANT_TO_COURIER"
    case courierToMerchant = "COURIER_TO_MERCHANT"
    case checkingByMerchant = "CHECKING_BY_MERCHANT"
}
