//
// SuggestedOfferDTO.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

/** Информация о товаре. */
public struct SuggestedOfferDTO: Codable, JSONEncodable, Hashable {

    static let offerIdRule = StringRule(minLength: 1, maxLength: 255, pattern: "/^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$/")
    static let nameRule = StringRule(minLength: nil, maxLength: 256, pattern: nil)
    static let descriptionRule = StringRule(minLength: nil, maxLength: 6000, pattern: nil)
    /** Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  */
    public var offerId: String?
    /** Составляйте название по схеме: тип + бренд или производитель + модель + особенности, если есть (например, цвет, размер или вес) и количество в упаковке.  Не включайте в название условия продажи (например, «скидка», «бесплатная доставка» и т. д.), эмоциональные характеристики («хит», «супер» и т. д.). Не пишите слова большими буквами — кроме устоявшихся названий брендов и моделей.  Оптимальная длина — 50–60 символов, максимальная — 256.  [Рекомендации и правила](https://yandex.ru/support/marketplace/assortment/fields/title.html)  */
    public var name: String?
    /** Категория товара в вашем магазине. Значение будет использовано для определения категории товара на Маркете в случае, если вы не передали категорию в параметре `marketCategoryId`.  Указывайте конкретные категории — например, набор ножей лучше отнести к категории **Столовые приборы**, а не просто **Посуда**.  Выбирайте категории, которые описывают товар, а не абстрактный признак — например, **Духи**, а не **Подарки**.  Значение будет использовано для определения категории товара на Маркете в случае, если вы не передали категорию в параметре `marketCategoryId`.  */
    public var category: String?
    /** Название бренда или производителя. Должно быть записано так, как его пишет сам бренд. */
    public var vendor: String?
    /** Указывайте в виде последовательности цифр. Подойдут коды EAN-13, EAN-8, UPC-A, UPC-E или Code 128.  Для книг указывайте ISBN.  Для товаров [определенных категорий и торговых марок](https://yastatic.net/s3/doc-binary/src/support/market/ru/yandex-market-list-for-gtin.xlsx) штрихкод должен быть действительным кодом GTIN. Обратите внимание: внутренние штрихкоды, начинающиеся на 2 или 02, и коды формата Code 128 не являются GTIN.  [Что такое GTIN](*gtin)   */
    public var barcodes: [String]?
    /** Подробное описание товара: например, его преимущества и особенности.  Не давайте в описании инструкций по установке и сборке. Не используйте слова «скидка», «распродажа», «дешевый», «подарок» (кроме подарочных категорий), «бесплатно», «акция», «специальная цена», «новинка», «new», «аналог», «заказ», «хит». Не указывайте никакой контактной информации и не давайте ссылок.  Можно использовать теги:  * \\<h>, \\<h1>, \\<h2> и так далее — для заголовков; * \\<br> и \\<p> — для переноса строки; * \\<ol> — для нумерованного списка; * \\<ul> — для маркированного списка; * \\<li> — для создания элементов списка (должен находиться внутри \\<ol> или \\<ul>); * \\<div> — поддерживается, но не влияет на отображение текста.  Оптимальная длина — 400–600 символов, максимальная — 6000.  [Рекомендации и правила](https://yandex.ru/support/marketplace/assortment/fields/description.html)  */
    public var description: String?
    /** Артикул товара от производителя. */
    public var vendorCode: String?
    public var basicPrice: BasePriceDTO?

    public init(offerId: String? = nil, name: String? = nil, category: String? = nil, vendor: String? = nil, barcodes: [String]? = nil, description: String? = nil, vendorCode: String? = nil, basicPrice: BasePriceDTO? = nil) {
        self.offerId = offerId
        self.name = name
        self.category = category
        self.vendor = vendor
        self.barcodes = barcodes
        self.description = description
        self.vendorCode = vendorCode
        self.basicPrice = basicPrice
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case offerId
        case name
        case category
        case vendor
        case barcodes
        case description
        case vendorCode
        case basicPrice
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encodeIfPresent(offerId, forKey: .offerId)
        try container.encodeIfPresent(name, forKey: .name)
        try container.encodeIfPresent(category, forKey: .category)
        try container.encodeIfPresent(vendor, forKey: .vendor)
        try container.encodeIfPresent(barcodes, forKey: .barcodes)
        try container.encodeIfPresent(description, forKey: .description)
        try container.encodeIfPresent(vendorCode, forKey: .vendorCode)
        try container.encodeIfPresent(basicPrice, forKey: .basicPrice)
    }
}

