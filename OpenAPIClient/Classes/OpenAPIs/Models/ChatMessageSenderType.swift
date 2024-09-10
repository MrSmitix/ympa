//
// ChatMessageSenderType.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

/** Кто отправил сообщение:  * &#x60;PARTNER&#x60; — магазин. * &#x60;CUSTOMER&#x60; — покупатель. * &#x60;MARKET&#x60; — Маркет. * &#x60;SUPPORT&#x60; — сотрудник службы поддержки Маркета.  */
public enum ChatMessageSenderType: String, Codable, CaseIterable {
    case partner = "PARTNER"
    case customer = "CUSTOMER"
    case market = "MARKET"
    case support = "SUPPORT"
}
