//
// PriceCompetitivenessType.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation

/// Привлекательность цены:  * &#x60;OPTIMAL&#x60; — привлекательная. * &#x60;AVERAGE&#x60; — умеренная. * &#x60;LOW&#x60; — непривлекательная.  
public enum PriceCompetitivenessType: String, Codable, CaseIterable {
    case optimal = "OPTIMAL"
    case average = "AVERAGE"
    case low = "LOW"
}
