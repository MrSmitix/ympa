//
// OrdersStatsPriceType.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation

/// Тип скидки или цена на товар: - &#x60;BUYER&#x60; — цена на товар с учетом скидок, в том числе купонов. - &#x60;CASHBACK&#x60; — баллы Плюса. - &#x60;MARKETPLACE&#x60; — купоны.  
public enum OrdersStatsPriceType: String, Codable, CaseIterable {
    case buyer = "BUYER"
    case cashback = "CASHBACK"
    case marketplace = "MARKETPLACE"
}
