//
// OfferParamDTO.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

/** Параметры товара.  Если у товара несколько значений одного параметра, передайте их с одним и тем же &#x60;name&#x60;, но разными &#x60;value&#x60;.  {% cut \&quot;Пример\&quot; %}  &#x60;&#x60;&#x60;json \&quot;params\&quot;: [   {     \&quot;name\&quot;: \&quot;Цвет\&quot;,     \&quot;value\&quot;: \&quot;Зеленый\&quot;   },   {     \&quot;name\&quot;: \&quot;Цвет\&quot;,     \&quot;value\&quot;: \&quot;Желтый\&quot;   } ] &#x60;&#x60;&#x60;  {% endcut %}  */
public struct OfferParamDTO: Codable, JSONEncodable, Hashable {

    /** Название.  Должно совпадать с названием характеристики на Маркете. Узнать его можно из Excel-шаблона категории или через запрос [POST category/{categoryId}/parameters](../../reference/content/getCategoryContentParameters.md).  */
    public var name: String
    /** Значение.  */
    public var value: String

    public init(name: String, value: String) {
        self.name = name
        self.value = value
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case name
        case value
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encode(name, forKey: .name)
        try container.encode(value, forKey: .value)
    }
}

