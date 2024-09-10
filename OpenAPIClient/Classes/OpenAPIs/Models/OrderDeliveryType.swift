//
// OrderDeliveryType.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

/** Способ доставки заказа:  * &#x60;DELIVERY&#x60; — курьерская доставка.  * &#x60;PICKUP&#x60; — самовывоз.  * &#x60;POST&#x60; — почта.  * &#x60;DIGITAL&#x60; — для цифровых товаров.  * &#x60;UNKNOWN&#x60; — неизвестный тип.  */
public enum OrderDeliveryType: String, Codable, CaseIterable {
    case delivery = "DELIVERY"
    case pickup = "PICKUP"
    case post = "POST"
    case digital = "DIGITAL"
    case unknown = "UNKNOWN"
}
