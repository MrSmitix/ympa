//
// PaymentFrequencyType.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation

/// Частота выплат:  * &#x60;DAILY&#x60; — ежедневно. * &#x60;WEEKLY&#x60; — раз в неделю. * &#x60;BIWEEKLY&#x60; — раз в две недели. * &#x60;MONTHLY&#x60; — раз в месяц.  Подробнее о графике выплат читайте [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/introduction/rates/acquiring.html).  
public enum PaymentFrequencyType: String, Codable, CaseIterable {
    case daily = "DAILY"
    case weekly = "WEEKLY"
    case biweekly = "BIWEEKLY"
    case monthly = "MONTHLY"
}
