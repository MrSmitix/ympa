//
// LicenseType.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

/** Тип лицензии:  * &#x60;ALCOHOL&#x60; — лицензия на розничную продажу алкогольной продукции.  */
public enum LicenseType: String, Codable, CaseIterable {
    case alcohol = "ALCOHOL"
    case unknown = "UNKNOWN"
}
