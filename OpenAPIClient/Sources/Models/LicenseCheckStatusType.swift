//
// LicenseCheckStatusType.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation

/// Статус проверки лицензии:  * &#x60;NEW&#x60; — лицензия проверяется. * &#x60;SUCCESS&#x60; — лицензия прошла проверку. * &#x60;FAIL&#x60; — лицензия не прошла проверку.  
public enum LicenseCheckStatusType: String, Codable, CaseIterable {
    case new = "NEW"
    case success = "SUCCESS"
    case fail = "FAIL"
    case revoke = "REVOKE"
    case dontWant = "DONT_WANT"
    case failManual = "FAIL_MANUAL"
}
