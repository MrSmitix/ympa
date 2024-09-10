//
// TurnoverDTO.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation

/// Информация об оборачиваемости товара. 
public struct TurnoverDTO: Codable {
    public var turnover: TurnoverType
    /// Значение в днях. [Что это за число?](https://yandex.ru/support/marketplace/analytics/turnover.html)
    public var turnoverDays: Double?

    public init(turnover: TurnoverType, turnoverDays: Double? = nil) {
        self.turnover = turnover
        self.turnoverDays = turnoverDays
    }
}
