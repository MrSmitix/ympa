//
// OrderSubsidyDTO.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation

/// Общее вознаграждение партнеру за DBS-доставку и все скидки на товар:  * по промокодам, купонам и акциям; * по баллам Плюса; * по доставке (DBS).  Передается в валюте заказа.  
public struct OrderSubsidyDTO: Codable {
    public var type: OrderSubsidyType?
    /// Сумма субсидии.
    public var amount: Double?

    public init(type: OrderSubsidyType? = nil, amount: Double? = nil) {
        self.type = type
        self.amount = amount
    }
}
