//
// MappingsOfferDTO.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

/** Информация о товарах в каталоге. */
public struct MappingsOfferDTO: Codable, JSONEncodable, Hashable {

    static let nameRule = StringRule(minLength: nil, maxLength: 256, pattern: nil)
    static let shopSkuRule = StringRule(minLength: 1, maxLength: 255, pattern: "/^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$/")
    static let descriptionRule = StringRule(minLength: nil, maxLength: 6000, pattern: nil)
    static let idRule = StringRule(minLength: 1, maxLength: 255, pattern: "/^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$/")
    /** Составляйте название по схеме: тип + бренд или производитель + модель + особенности, если есть (например, цвет, размер или вес) и количество в упаковке.  Не включайте в название условия продажи (например, «скидка», «бесплатная доставка» и т. д.), эмоциональные характеристики («хит», «супер» и т. д.). Не пишите слова большими буквами — кроме устоявшихся названий брендов и моделей.  Оптимальная длина — 50–60 символов, максимальная — 256.  [Рекомендации и правила](https://yandex.ru/support/marketplace/assortment/fields/title.html)  */
    public var name: String?
    /** Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  */
    public var shopSku: String?
    /** Категория товара в вашем магазине. Значение будет использовано для определения категории товара на Маркете в случае, если вы не передали категорию в параметре `marketCategoryId`.  Указывайте конкретные категории — например, набор ножей лучше отнести к категории **Столовые приборы**, а не просто **Посуда**.  Выбирайте категории, которые описывают товар, а не абстрактный признак — например, **Духи**, а не **Подарки**.  Значение будет использовано для определения категории товара на Маркете в случае, если вы не передали категорию в параметре `marketCategoryId`.  */
    public var category: String?
    /** Название бренда или производителя. Должно быть записано так, как его пишет сам бренд. */
    public var vendor: String?
    /** Артикул товара от производителя. */
    public var vendorCode: String?
    /** Подробное описание товара: например, его преимущества и особенности.  Не давайте в описании инструкций по установке и сборке. Не используйте слова «скидка», «распродажа», «дешевый», «подарок» (кроме подарочных категорий), «бесплатно», «акция», «специальная цена», «новинка», «new», «аналог», «заказ», «хит». Не указывайте никакой контактной информации и не давайте ссылок.  Можно использовать теги:  * \\<h>, \\<h1>, \\<h2> и так далее — для заголовков; * \\<br> и \\<p> — для переноса строки; * \\<ol> — для нумерованного списка; * \\<ul> — для маркированного списка; * \\<li> — для создания элементов списка (должен находиться внутри \\<ol> или \\<ul>); * \\<div> — поддерживается, но не влияет на отображение текста.  Оптимальная длина — 400–600 символов, максимальная — 6000.  [Рекомендации и правила](https://yandex.ru/support/marketplace/assortment/fields/description.html)  */
    public var description: String?
    /** Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  */
    public var id: String?
    /** Идентификатор фида. */
    public var feedId: Int64?
    /** Указывайте в виде последовательности цифр. Подойдут коды EAN-13, EAN-8, UPC-A, UPC-E или Code 128.  Для книг указывайте ISBN.  Для товаров [определенных категорий и торговых марок](https://yastatic.net/s3/doc-binary/src/support/market/ru/yandex-market-list-for-gtin.xlsx) штрихкод должен быть действительным кодом GTIN. Обратите внимание: внутренние штрихкоды, начинающиеся на 2 или 02, и коды формата Code 128 не являются GTIN.  [Что такое GTIN](*gtin)   */
    public var barcodes: [String]?
    /** URL фотографии товара или страницы с описанием на вашем сайте.  Переданные данные не будут отображаться на витрине, но они помогут специалистам Маркета найти карточку для вашего товара.  Должен содержать один вложенный параметр url.  */
    public var urls: [String]?
    /** Ссылки (URL) изображений товара в хорошем качестве.  Можно указать до 30 ссылок. При этом изображение по первой ссылке будет основным. Оно используется в качестве изображения товара в поиске Маркета и на карточке товара. Другие изображения товара доступны в режиме просмотра увеличенных изображений.  Обязательный параметр.  Должен содержать хотя бы один вложенный параметр `picture`.  */
    public var pictures: [String]?
    /** Изготовитель товара: компания, которая произвела товар, ее адрес и регистрационный номер (если есть).  Необязательный параметр.  */
    public var manufacturer: String?
    /** Список стран, в которых произведен товар.  Обязательный параметр.  Должен содержать хотя бы одну, но не больше 5 стран.  */
    public var manufacturerCountries: [String]?
    /** Минимальное количество единиц товара, которое вы поставляете на склад.  Например, если вы поставляете детское питание партиями минимум по 10 коробок, а в каждой коробке по 6 баночек, укажите значение 60.  */
    public var minShipment: Int?
    /** Количество единиц товара в одной упаковке, которую вы поставляете на склад.  Например, если вы поставляете детское питание коробками по 6 баночек, укажите значение 6.  */
    public var transportUnitSize: Int?
    /** Добавочная партия: по сколько единиц товара можно добавлять к минимальному количеству minShipment.  Например, если вы поставляете детское питание партиями минимум по 10 коробок и хотите добавлять к минимальной партии по 2 коробки, а в каждой коробке по 6 баночек, укажите значение 12.  */
    public var quantumOfSupply: Int?
    /** Срок, за который продавец поставляет товары на склад, в днях. */
    public var deliveryDurationDays: Int?
    /** Сколько мест (если больше одного) занимает товар.  Параметр указывается, только если товар занимает больше одного места (например, кондиционер занимает два места: внешний и внутренний блоки в двух коробках). Если товар занимает одно место, не указывайте этот параметр.  */
    public var boxCount: Int?
    /** Список кодов товара в единой Товарной номенклатуре внешнеэкономической деятельности (ТН ВЭД).  Обязательный параметр, если товар подлежит особому учету (например, в системе «Меркурий» как продукция животного происхождения или в системе «Честный ЗНАК»).  Может содержать только один вложенный код ТН ВЭД.  */
    public var customsCommodityCodes: [String]?
    public var weightDimensions: OfferWeightDimensionsDTO?
    /** Дни недели, в которые продавец поставляет товары на склад. */
    public var supplyScheduleDays: [DayOfWeekType]?
    /** {% note warning \"\" %}  Этот параметр устарел. Вместо него используйте `shelfLife`. Совместное использование обоих параметров приведет к ошибке.  {% endnote %}  Срок годности: через сколько дней товар станет непригоден для использования.  */
    public var shelfLifeDays: Int?
    /** {% note warning \"\" %}  Этот параметр устарел. Вместо него используйте `lifeTime`. Совместное использование обоих параметров приведет к ошибке.  {% endnote %}  Срок службы: сколько дней товар будет исправно выполнять свою функцию, а изготовитель — нести ответственность за его существенные недостатки.  */
    public var lifeTimeDays: Int?
    /** Гарантийный срок товара: сколько дней возможно обслуживание и ремонт товара или возврат денег, а изготовитель или продавец будет нести ответственность за недостатки товара.  */
    public var guaranteePeriodDays: Int?
    public var processingState: OfferProcessingStateDTO?
    public var availability: OfferAvailabilityStatusType?
    public var shelfLife: TimePeriodDTO?
    public var lifeTime: TimePeriodDTO?
    public var guaranteePeriod: TimePeriodDTO?
    /** Номер документа на товар.  Перед указанием номера документ нужно загрузить в кабинете продавца на Маркете. [Инструкция](https://yandex.ru/support/marketplace/assortment/restrictions/certificates.html)  */
    public var certificate: String?
    /** Цена на товар в рублях. */
    public var price: Double?

    public init(name: String? = nil, shopSku: String? = nil, category: String? = nil, vendor: String? = nil, vendorCode: String? = nil, description: String? = nil, id: String? = nil, feedId: Int64? = nil, barcodes: [String]? = nil, urls: [String]? = nil, pictures: [String]? = nil, manufacturer: String? = nil, manufacturerCountries: [String]? = nil, minShipment: Int? = nil, transportUnitSize: Int? = nil, quantumOfSupply: Int? = nil, deliveryDurationDays: Int? = nil, boxCount: Int? = nil, customsCommodityCodes: [String]? = nil, weightDimensions: OfferWeightDimensionsDTO? = nil, supplyScheduleDays: [DayOfWeekType]? = nil, shelfLifeDays: Int? = nil, lifeTimeDays: Int? = nil, guaranteePeriodDays: Int? = nil, processingState: OfferProcessingStateDTO? = nil, availability: OfferAvailabilityStatusType? = nil, shelfLife: TimePeriodDTO? = nil, lifeTime: TimePeriodDTO? = nil, guaranteePeriod: TimePeriodDTO? = nil, certificate: String? = nil, price: Double? = nil) {
        self.name = name
        self.shopSku = shopSku
        self.category = category
        self.vendor = vendor
        self.vendorCode = vendorCode
        self.description = description
        self.id = id
        self.feedId = feedId
        self.barcodes = barcodes
        self.urls = urls
        self.pictures = pictures
        self.manufacturer = manufacturer
        self.manufacturerCountries = manufacturerCountries
        self.minShipment = minShipment
        self.transportUnitSize = transportUnitSize
        self.quantumOfSupply = quantumOfSupply
        self.deliveryDurationDays = deliveryDurationDays
        self.boxCount = boxCount
        self.customsCommodityCodes = customsCommodityCodes
        self.weightDimensions = weightDimensions
        self.supplyScheduleDays = supplyScheduleDays
        self.shelfLifeDays = shelfLifeDays
        self.lifeTimeDays = lifeTimeDays
        self.guaranteePeriodDays = guaranteePeriodDays
        self.processingState = processingState
        self.availability = availability
        self.shelfLife = shelfLife
        self.lifeTime = lifeTime
        self.guaranteePeriod = guaranteePeriod
        self.certificate = certificate
        self.price = price
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case name
        case shopSku
        case category
        case vendor
        case vendorCode
        case description
        case id
        case feedId
        case barcodes
        case urls
        case pictures
        case manufacturer
        case manufacturerCountries
        case minShipment
        case transportUnitSize
        case quantumOfSupply
        case deliveryDurationDays
        case boxCount
        case customsCommodityCodes
        case weightDimensions
        case supplyScheduleDays
        case shelfLifeDays
        case lifeTimeDays
        case guaranteePeriodDays
        case processingState
        case availability
        case shelfLife
        case lifeTime
        case guaranteePeriod
        case certificate
        case price
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encodeIfPresent(name, forKey: .name)
        try container.encodeIfPresent(shopSku, forKey: .shopSku)
        try container.encodeIfPresent(category, forKey: .category)
        try container.encodeIfPresent(vendor, forKey: .vendor)
        try container.encodeIfPresent(vendorCode, forKey: .vendorCode)
        try container.encodeIfPresent(description, forKey: .description)
        try container.encodeIfPresent(id, forKey: .id)
        try container.encodeIfPresent(feedId, forKey: .feedId)
        try container.encodeIfPresent(barcodes, forKey: .barcodes)
        try container.encodeIfPresent(urls, forKey: .urls)
        try container.encodeIfPresent(pictures, forKey: .pictures)
        try container.encodeIfPresent(manufacturer, forKey: .manufacturer)
        try container.encodeIfPresent(manufacturerCountries, forKey: .manufacturerCountries)
        try container.encodeIfPresent(minShipment, forKey: .minShipment)
        try container.encodeIfPresent(transportUnitSize, forKey: .transportUnitSize)
        try container.encodeIfPresent(quantumOfSupply, forKey: .quantumOfSupply)
        try container.encodeIfPresent(deliveryDurationDays, forKey: .deliveryDurationDays)
        try container.encodeIfPresent(boxCount, forKey: .boxCount)
        try container.encodeIfPresent(customsCommodityCodes, forKey: .customsCommodityCodes)
        try container.encodeIfPresent(weightDimensions, forKey: .weightDimensions)
        try container.encodeIfPresent(supplyScheduleDays, forKey: .supplyScheduleDays)
        try container.encodeIfPresent(shelfLifeDays, forKey: .shelfLifeDays)
        try container.encodeIfPresent(lifeTimeDays, forKey: .lifeTimeDays)
        try container.encodeIfPresent(guaranteePeriodDays, forKey: .guaranteePeriodDays)
        try container.encodeIfPresent(processingState, forKey: .processingState)
        try container.encodeIfPresent(availability, forKey: .availability)
        try container.encodeIfPresent(shelfLife, forKey: .shelfLife)
        try container.encodeIfPresent(lifeTime, forKey: .lifeTime)
        try container.encodeIfPresent(guaranteePeriod, forKey: .guaranteePeriod)
        try container.encodeIfPresent(certificate, forKey: .certificate)
        try container.encodeIfPresent(price, forKey: .price)
    }
}

