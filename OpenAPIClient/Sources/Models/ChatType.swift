//
// ChatType.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation

/// Тип чата:  * &#x60;CHAT&#x60; — чат с покупателем. * &#x60;ARBITRAGE&#x60; — спор.  
public enum ChatType: String, Codable, CaseIterable {
    case chat = "CHAT"
    case arbitrage = "ARBITRAGE"
}
