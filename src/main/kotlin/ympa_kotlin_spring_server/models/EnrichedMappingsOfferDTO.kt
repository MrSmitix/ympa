package ympa_kotlin_spring_server.models

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import ympa_kotlin_spring_server.models.DayOfWeekType
import ympa_kotlin_spring_server.models.OfferAvailabilityStatusType
import ympa_kotlin_spring_server.models.OfferProcessingStateDTO
import ympa_kotlin_spring_server.models.OfferWeightDimensionsDTO
import ympa_kotlin_spring_server.models.TimePeriodDTO
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Email
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid
import io.swagger.v3.oas.annotations.media.Schema

/**
 * Информация о рекомендованных карточках товаров.
 * @param name Составляйте название по схеме: тип + бренд или производитель + модель + особенности, если есть (например, цвет, размер или вес) и количество в упаковке.  Не включайте в название условия продажи (например, «скидка», «бесплатная доставка» и т. д.), эмоциональные характеристики («хит», «супер» и т. д.). Не пишите слова большими буквами — кроме устоявшихся названий брендов и моделей.  Оптимальная длина — 50–60 символов, максимальная — 256.  [Рекомендации и правила](https://yandex.ru/support/marketplace/assortment/fields/title.html) 
 * @param shopSku Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
 * @param category Категория товара в вашем магазине. Значение будет использовано для определения категории товара на Маркете в случае, если вы не передали категорию в параметре `marketCategoryId`.  Указывайте конкретные категории — например, набор ножей лучше отнести к категории **Столовые приборы**, а не просто **Посуда**.  Выбирайте категории, которые описывают товар, а не абстрактный признак — например, **Духи**, а не **Подарки**.  Значение будет использовано для определения категории товара на Маркете в случае, если вы не передали категорию в параметре `marketCategoryId`. 
 * @param vendor Название бренда или производителя. Должно быть записано так, как его пишет сам бренд.
 * @param vendorCode Артикул товара от производителя.
 * @param description Подробное описание товара: например, его преимущества и особенности.  Не давайте в описании инструкций по установке и сборке. Не используйте слова «скидка», «распродажа», «дешевый», «подарок» (кроме подарочных категорий), «бесплатно», «акция», «специальная цена», «новинка», «new», «аналог», «заказ», «хит». Не указывайте никакой контактной информации и не давайте ссылок.  Можно использовать теги:  * \\<h>, \\<h1>, \\<h2> и так далее — для заголовков; * \\<br> и \\<p> — для переноса строки; * \\<ol> — для нумерованного списка; * \\<ul> — для маркированного списка; * \\<li> — для создания элементов списка (должен находиться внутри \\<ol> или \\<ul>); * \\<div> — поддерживается, но не влияет на отображение текста.  Оптимальная длина — 400–600 символов, максимальная — 6000.  [Рекомендации и правила](https://yandex.ru/support/marketplace/assortment/fields/description.html) 
 * @param id Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
 * @param feedId Идентификатор фида.
 * @param barcodes Указывайте в виде последовательности цифр. Подойдут коды EAN-13, EAN-8, UPC-A, UPC-E или Code 128.  Для книг указывайте ISBN.  Для товаров [определенных категорий и торговых марок](https://yastatic.net/s3/doc-binary/src/support/market/ru/yandex-market-list-for-gtin.xlsx) штрихкод должен быть действительным кодом GTIN. Обратите внимание: внутренние штрихкоды, начинающиеся на 2 или 02, и коды формата Code 128 не являются GTIN.  [Что такое GTIN](*gtin)  
 * @param urls URL фотографии товара или страницы с описанием на вашем сайте.  Переданные данные не будут отображаться на витрине, но они помогут специалистам Маркета найти карточку для вашего товара.  Должен содержать один вложенный параметр url. 
 * @param pictures Ссылки (URL) изображений товара в хорошем качестве.  Можно указать до 30 ссылок. При этом изображение по первой ссылке будет основным. Оно используется в качестве изображения товара в поиске Маркета и на карточке товара. Другие изображения товара доступны в режиме просмотра увеличенных изображений.  Обязательный параметр.  Должен содержать хотя бы один вложенный параметр `picture`. 
 * @param manufacturer Изготовитель товара: компания, которая произвела товар, ее адрес и регистрационный номер (если есть).  Необязательный параметр. 
 * @param manufacturerCountries Список стран, в которых произведен товар.  Обязательный параметр.  Должен содержать хотя бы одну, но не больше 5 стран. 
 * @param minShipment Минимальное количество единиц товара, которое вы поставляете на склад.  Например, если вы поставляете детское питание партиями минимум по 10 коробок, а в каждой коробке по 6 баночек, укажите значение 60. 
 * @param transportUnitSize Количество единиц товара в одной упаковке, которую вы поставляете на склад.  Например, если вы поставляете детское питание коробками по 6 баночек, укажите значение 6. 
 * @param quantumOfSupply Добавочная партия: по сколько единиц товара можно добавлять к минимальному количеству minShipment.  Например, если вы поставляете детское питание партиями минимум по 10 коробок и хотите добавлять к минимальной партии по 2 коробки, а в каждой коробке по 6 баночек, укажите значение 12. 
 * @param deliveryDurationDays Срок, за который продавец поставляет товары на склад, в днях.
 * @param boxCount Сколько мест (если больше одного) занимает товар.  Параметр указывается, только если товар занимает больше одного места (например, кондиционер занимает два места: внешний и внутренний блоки в двух коробках). Если товар занимает одно место, не указывайте этот параметр. 
 * @param customsCommodityCodes Список кодов товара в единой Товарной номенклатуре внешнеэкономической деятельности (ТН ВЭД).  Обязательный параметр, если товар подлежит особому учету (например, в системе «Меркурий» как продукция животного происхождения или в системе «Честный ЗНАК»).  Может содержать только один вложенный код ТН ВЭД. 
 * @param weightDimensions 
 * @param supplyScheduleDays Дни недели, в которые продавец поставляет товары на склад.
 * @param shelfLifeDays {% note warning \"\" %}  Этот параметр устарел. Вместо него используйте `shelfLife`. Совместное использование обоих параметров приведет к ошибке.  {% endnote %}  Срок годности: через сколько дней товар станет непригоден для использования. 
 * @param lifeTimeDays {% note warning \"\" %}  Этот параметр устарел. Вместо него используйте `lifeTime`. Совместное использование обоих параметров приведет к ошибке.  {% endnote %}  Срок службы: сколько дней товар будет исправно выполнять свою функцию, а изготовитель — нести ответственность за его существенные недостатки. 
 * @param guaranteePeriodDays Гарантийный срок товара: сколько дней возможно обслуживание и ремонт товара или возврат денег, а изготовитель или продавец будет нести ответственность за недостатки товара. 
 * @param processingState 
 * @param availability 
 * @param shelfLife 
 * @param lifeTime 
 * @param guaranteePeriod 
 * @param certificate Номер документа на товар.  Перед указанием номера документ нужно загрузить в кабинете продавца на Маркете. [Инструкция](https://yandex.ru/support/marketplace/assortment/restrictions/certificates.html) 
 * @param price Цена на товар в рублях.
 * @param marketCategoryId Идентификатор категории для рекомендованной карточки товара на Маркете.  Возвращается только вместе с параметром ##marketSku##. 
 * @param marketCategoryName Название категории для рекомендованной карточки товара на Маркете.  Может отсутствовать в ответе. 
 * @param marketModelId Идентификатор модели для рекомендованной карточки товара на Маркете.  Может отсутствовать в ответе. 
 * @param marketModelName Название модели для рекомендованной карточки товара на Маркете.  Возвращается только вместе с параметром ##marketSku##. 
 * @param marketSku SKU на Маркете.
 * @param marketSkuName Название товара с рекомендованной карточки на Маркете.  Может отсутствовать в ответе. 
 */
data class EnrichedMappingsOfferDTO(

    @get:Size(max=256)
    @Schema(example = "Ударная дрель Makita HP1630, 710 Вт", description = "Составляйте название по схеме: тип + бренд или производитель + модель + особенности, если есть (например, цвет, размер или вес) и количество в упаковке.  Не включайте в название условия продажи (например, «скидка», «бесплатная доставка» и т. д.), эмоциональные характеристики («хит», «супер» и т. д.). Не пишите слова большими буквами — кроме устоявшихся названий брендов и моделей.  Оптимальная длина — 50–60 символов, максимальная — 256.  [Рекомендации и правила](https://yandex.ru/support/marketplace/assortment/fields/title.html) ")
    @get:JsonProperty("name") val name: kotlin.String? = null,

    @get:Pattern(regexp="^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")
    @get:Size(min=1,max=255)
    @Schema(example = "null", description = "Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) ")
    @get:JsonProperty("shopSku") val shopSku: kotlin.String? = null,

    @Schema(example = "null", description = "Категория товара в вашем магазине. Значение будет использовано для определения категории товара на Маркете в случае, если вы не передали категорию в параметре `marketCategoryId`.  Указывайте конкретные категории — например, набор ножей лучше отнести к категории **Столовые приборы**, а не просто **Посуда**.  Выбирайте категории, которые описывают товар, а не абстрактный признак — например, **Духи**, а не **Подарки**.  Значение будет использовано для определения категории товара на Маркете в случае, если вы не передали категорию в параметре `marketCategoryId`. ")
    @get:JsonProperty("category") val category: kotlin.String? = null,

    @Schema(example = "LEVENHUK", description = "Название бренда или производителя. Должно быть записано так, как его пишет сам бренд.")
    @get:JsonProperty("vendor") val vendor: kotlin.String? = null,

    @Schema(example = "VNDR-0005A", description = "Артикул товара от производителя.")
    @get:JsonProperty("vendorCode") val vendorCode: kotlin.String? = null,

    @get:Size(max=6000)
    @Schema(example = "null", description = "Подробное описание товара: например, его преимущества и особенности.  Не давайте в описании инструкций по установке и сборке. Не используйте слова «скидка», «распродажа», «дешевый», «подарок» (кроме подарочных категорий), «бесплатно», «акция», «специальная цена», «новинка», «new», «аналог», «заказ», «хит». Не указывайте никакой контактной информации и не давайте ссылок.  Можно использовать теги:  * \\<h>, \\<h1>, \\<h2> и так далее — для заголовков; * \\<br> и \\<p> — для переноса строки; * \\<ol> — для нумерованного списка; * \\<ul> — для маркированного списка; * \\<li> — для создания элементов списка (должен находиться внутри \\<ol> или \\<ul>); * \\<div> — поддерживается, но не влияет на отображение текста.  Оптимальная длина — 400–600 символов, максимальная — 6000.  [Рекомендации и правила](https://yandex.ru/support/marketplace/assortment/fields/description.html) ")
    @get:JsonProperty("description") val description: kotlin.String? = null,

    @get:Pattern(regexp="^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")
    @get:Size(min=1,max=255)
    @Schema(example = "null", description = "Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) ")
    @get:JsonProperty("id") val id: kotlin.String? = null,

    @Schema(example = "null", description = "Идентификатор фида.")
    @get:JsonProperty("feedId") val feedId: kotlin.Long? = null,

    @Schema(example = "null", description = "Указывайте в виде последовательности цифр. Подойдут коды EAN-13, EAN-8, UPC-A, UPC-E или Code 128.  Для книг указывайте ISBN.  Для товаров [определенных категорий и торговых марок](https://yastatic.net/s3/doc-binary/src/support/market/ru/yandex-market-list-for-gtin.xlsx) штрихкод должен быть действительным кодом GTIN. Обратите внимание: внутренние штрихкоды, начинающиеся на 2 или 02, и коды формата Code 128 не являются GTIN.  [Что такое GTIN](*gtin)  ")
    @get:JsonProperty("barcodes") val barcodes: kotlin.collections.List<kotlin.String>? = null,

    @Schema(example = "null", description = "URL фотографии товара или страницы с описанием на вашем сайте.  Переданные данные не будут отображаться на витрине, но они помогут специалистам Маркета найти карточку для вашего товара.  Должен содержать один вложенный параметр url. ")
    @get:JsonProperty("urls") val urls: kotlin.collections.List<kotlin.String>? = null,

    @Schema(example = "null", description = "Ссылки (URL) изображений товара в хорошем качестве.  Можно указать до 30 ссылок. При этом изображение по первой ссылке будет основным. Оно используется в качестве изображения товара в поиске Маркета и на карточке товара. Другие изображения товара доступны в режиме просмотра увеличенных изображений.  Обязательный параметр.  Должен содержать хотя бы один вложенный параметр `picture`. ")
    @get:JsonProperty("pictures") val pictures: kotlin.collections.List<kotlin.String>? = null,

    @Schema(example = "null", description = "Изготовитель товара: компания, которая произвела товар, ее адрес и регистрационный номер (если есть).  Необязательный параметр. ")
    @get:JsonProperty("manufacturer") val manufacturer: kotlin.String? = null,

    @Schema(example = "null", description = "Список стран, в которых произведен товар.  Обязательный параметр.  Должен содержать хотя бы одну, но не больше 5 стран. ")
    @get:JsonProperty("manufacturerCountries") val manufacturerCountries: kotlin.collections.List<kotlin.String>? = null,

    @Schema(example = "null", description = "Минимальное количество единиц товара, которое вы поставляете на склад.  Например, если вы поставляете детское питание партиями минимум по 10 коробок, а в каждой коробке по 6 баночек, укажите значение 60. ")
    @get:JsonProperty("minShipment") val minShipment: kotlin.Int? = null,

    @Schema(example = "null", description = "Количество единиц товара в одной упаковке, которую вы поставляете на склад.  Например, если вы поставляете детское питание коробками по 6 баночек, укажите значение 6. ")
    @get:JsonProperty("transportUnitSize") val transportUnitSize: kotlin.Int? = null,

    @Schema(example = "null", description = "Добавочная партия: по сколько единиц товара можно добавлять к минимальному количеству minShipment.  Например, если вы поставляете детское питание партиями минимум по 10 коробок и хотите добавлять к минимальной партии по 2 коробки, а в каждой коробке по 6 баночек, укажите значение 12. ")
    @get:JsonProperty("quantumOfSupply") val quantumOfSupply: kotlin.Int? = null,

    @Schema(example = "null", description = "Срок, за который продавец поставляет товары на склад, в днях.")
    @get:JsonProperty("deliveryDurationDays") val deliveryDurationDays: kotlin.Int? = null,

    @Schema(example = "null", description = "Сколько мест (если больше одного) занимает товар.  Параметр указывается, только если товар занимает больше одного места (например, кондиционер занимает два места: внешний и внутренний блоки в двух коробках). Если товар занимает одно место, не указывайте этот параметр. ")
    @get:JsonProperty("boxCount") val boxCount: kotlin.Int? = null,

    @Schema(example = "null", description = "Список кодов товара в единой Товарной номенклатуре внешнеэкономической деятельности (ТН ВЭД).  Обязательный параметр, если товар подлежит особому учету (например, в системе «Меркурий» как продукция животного происхождения или в системе «Честный ЗНАК»).  Может содержать только один вложенный код ТН ВЭД. ")
    @get:JsonProperty("customsCommodityCodes") val customsCommodityCodes: kotlin.collections.List<kotlin.String>? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("weightDimensions") val weightDimensions: OfferWeightDimensionsDTO? = null,

    @field:Valid
    @Schema(example = "null", description = "Дни недели, в которые продавец поставляет товары на склад.")
    @get:JsonProperty("supplyScheduleDays") val supplyScheduleDays: kotlin.collections.List<DayOfWeekType>? = null,

    @Schema(example = "null", description = "{% note warning \"\" %}  Этот параметр устарел. Вместо него используйте `shelfLife`. Совместное использование обоих параметров приведет к ошибке.  {% endnote %}  Срок годности: через сколько дней товар станет непригоден для использования. ")
    @get:JsonProperty("shelfLifeDays") val shelfLifeDays: kotlin.Int? = null,

    @Schema(example = "null", description = "{% note warning \"\" %}  Этот параметр устарел. Вместо него используйте `lifeTime`. Совместное использование обоих параметров приведет к ошибке.  {% endnote %}  Срок службы: сколько дней товар будет исправно выполнять свою функцию, а изготовитель — нести ответственность за его существенные недостатки. ")
    @get:JsonProperty("lifeTimeDays") val lifeTimeDays: kotlin.Int? = null,

    @Schema(example = "null", description = "Гарантийный срок товара: сколько дней возможно обслуживание и ремонт товара или возврат денег, а изготовитель или продавец будет нести ответственность за недостатки товара. ")
    @get:JsonProperty("guaranteePeriodDays") val guaranteePeriodDays: kotlin.Int? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("processingState") val processingState: OfferProcessingStateDTO? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("availability") val availability: OfferAvailabilityStatusType? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("shelfLife") val shelfLife: TimePeriodDTO? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("lifeTime") val lifeTime: TimePeriodDTO? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("guaranteePeriod") val guaranteePeriod: TimePeriodDTO? = null,

    @Schema(example = "null", description = "Номер документа на товар.  Перед указанием номера документ нужно загрузить в кабинете продавца на Маркете. [Инструкция](https://yandex.ru/support/marketplace/assortment/restrictions/certificates.html) ")
    @get:JsonProperty("certificate") val certificate: kotlin.String? = null,

    @Schema(example = "null", description = "Цена на товар в рублях.")
    @get:JsonProperty("price") val price: java.math.BigDecimal? = null,

    @Schema(example = "null", description = "Идентификатор категории для рекомендованной карточки товара на Маркете.  Возвращается только вместе с параметром ##marketSku##. ")
    @get:JsonProperty("marketCategoryId") val marketCategoryId: kotlin.Long? = null,

    @Schema(example = "null", description = "Название категории для рекомендованной карточки товара на Маркете.  Может отсутствовать в ответе. ")
    @get:JsonProperty("marketCategoryName") val marketCategoryName: kotlin.String? = null,

    @Schema(example = "null", description = "Идентификатор модели для рекомендованной карточки товара на Маркете.  Может отсутствовать в ответе. ")
    @get:JsonProperty("marketModelId") val marketModelId: kotlin.Long? = null,

    @Schema(example = "null", description = "Название модели для рекомендованной карточки товара на Маркете.  Возвращается только вместе с параметром ##marketSku##. ")
    @get:JsonProperty("marketModelName") val marketModelName: kotlin.String? = null,

    @Schema(example = "null", description = "SKU на Маркете.")
    @get:JsonProperty("marketSku") val marketSku: kotlin.Long? = null,

    @Schema(example = "null", description = "Название товара с рекомендованной карточки на Маркете.  Может отсутствовать в ответе. ")
    @get:JsonProperty("marketSkuName") val marketSkuName: kotlin.String? = null
    ) {

}

