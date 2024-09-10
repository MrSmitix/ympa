//
// OrderItemSubsidyType.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

/** Тип субсидии:  * &#x60;YANDEX_CASHBACK&#x60; — скидка по подписке Яндекс Плюс.  * &#x60;SUBSIDY&#x60; — скидка Маркета (по акциям, промокодам, купонам и т. д.).  */
public enum OrderItemSubsidyType: String, Codable, CaseIterable {
    case yandexCashback = "YANDEX_CASHBACK"
    case subsidy = "SUBSIDY"
}
