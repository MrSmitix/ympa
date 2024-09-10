/**
* Партнерский API Маркета
* API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
*
* The version of the OpenAPI document: LATEST
* 
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package ympa_ktorm_schema.models

import org.ktorm.dsl.*
import org.ktorm.schema.*
import org.ktorm.database.Database
import .*


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
object EnrichedMappingsOfferDTOs : BaseTable<EnrichedMappingsOfferDTO>("EnrichedMappingsOfferDTO") {
    val name = text("name") /* null */ /* Составляйте название по схеме: тип + бренд или производитель + модель + особенности, если есть (например, цвет, размер или вес) и количество в упаковке.  Не включайте в название условия продажи (например, «скидка», «бесплатная доставка» и т. д.), эмоциональные характеристики («хит», «супер» и т. д.). Не пишите слова большими буквами — кроме устоявшихся названий брендов и моделей.  Оптимальная длина — 50–60 символов, максимальная — 256.  [Рекомендации и правила](https://yandex.ru/support/marketplace/assortment/fields/title.html)  */
    val shopSku = text("shopSku") /* null */ /* Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  */
    val category = text("category") /* null */ /* Категория товара в вашем магазине. Значение будет использовано для определения категории товара на Маркете в случае, если вы не передали категорию в параметре `marketCategoryId`.  Указывайте конкретные категории — например, набор ножей лучше отнести к категории **Столовые приборы**, а не просто **Посуда**.  Выбирайте категории, которые описывают товар, а не абстрактный признак — например, **Духи**, а не **Подарки**.  Значение будет использовано для определения категории товара на Маркете в случае, если вы не передали категорию в параметре `marketCategoryId`.  */
    val vendor = text("vendor") /* null */ /* Название бренда или производителя. Должно быть записано так, как его пишет сам бренд. */
    val vendorCode = text("vendorCode") /* null */ /* Артикул товара от производителя. */
    val description = text("description") /* null */ /* Подробное описание товара: например, его преимущества и особенности.  Не давайте в описании инструкций по установке и сборке. Не используйте слова «скидка», «распродажа», «дешевый», «подарок» (кроме подарочных категорий), «бесплатно», «акция», «специальная цена», «новинка», «new», «аналог», «заказ», «хит». Не указывайте никакой контактной информации и не давайте ссылок.  Можно использовать теги:  * \\<h>, \\<h1>, \\<h2> и так далее — для заголовков; * \\<br> и \\<p> — для переноса строки; * \\<ol> — для нумерованного списка; * \\<ul> — для маркированного списка; * \\<li> — для создания элементов списка (должен находиться внутри \\<ol> или \\<ul>); * \\<div> — поддерживается, но не влияет на отображение текста.  Оптимальная длина — 400–600 символов, максимальная — 6000.  [Рекомендации и правила](https://yandex.ru/support/marketplace/assortment/fields/description.html)  */
    val id = text("id") /* null */ /* Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  */
    val feedId = long("feedId") /* null */ /* Идентификатор фида. */
    val manufacturer = text("manufacturer") /* null */ /* Изготовитель товара: компания, которая произвела товар, ее адрес и регистрационный номер (если есть).  Необязательный параметр.  */
    val minShipment = int("minShipment") /* null */ /* Минимальное количество единиц товара, которое вы поставляете на склад.  Например, если вы поставляете детское питание партиями минимум по 10 коробок, а в каждой коробке по 6 баночек, укажите значение 60.  */
    val transportUnitSize = int("transportUnitSize") /* null */ /* Количество единиц товара в одной упаковке, которую вы поставляете на склад.  Например, если вы поставляете детское питание коробками по 6 баночек, укажите значение 6.  */
    val quantumOfSupply = int("quantumOfSupply") /* null */ /* Добавочная партия: по сколько единиц товара можно добавлять к минимальному количеству minShipment.  Например, если вы поставляете детское питание партиями минимум по 10 коробок и хотите добавлять к минимальной партии по 2 коробки, а в каждой коробке по 6 баночек, укажите значение 12.  */
    val deliveryDurationDays = int("deliveryDurationDays") /* null */ /* Срок, за который продавец поставляет товары на склад, в днях. */
    val boxCount = int("boxCount") /* null */ /* Сколько мест (если больше одного) занимает товар.  Параметр указывается, только если товар занимает больше одного места (например, кондиционер занимает два места: внешний и внутренний блоки в двух коробках). Если товар занимает одно место, не указывайте этот параметр.  */
    val weightDimensions = long("weightDimensions") /* null */
    val shelfLifeDays = int("shelfLifeDays") /* null */ /* {% note warning \"\" %}  Этот параметр устарел. Вместо него используйте `shelfLife`. Совместное использование обоих параметров приведет к ошибке.  {% endnote %}  Срок годности: через сколько дней товар станет непригоден для использования.  */
    val lifeTimeDays = int("lifeTimeDays") /* null */ /* {% note warning \"\" %}  Этот параметр устарел. Вместо него используйте `lifeTime`. Совместное использование обоих параметров приведет к ошибке.  {% endnote %}  Срок службы: сколько дней товар будет исправно выполнять свою функцию, а изготовитель — нести ответственность за его существенные недостатки.  */
    val guaranteePeriodDays = int("guaranteePeriodDays") /* null */ /* Гарантийный срок товара: сколько дней возможно обслуживание и ремонт товара или возврат денег, а изготовитель или продавец будет нести ответственность за недостатки товара.  */
    val processingState = long("processingState") /* null */
    val availability = long("availability") /* null */
    val shelfLife = long("shelfLife") /* null */
    val lifeTime = long("lifeTime") /* null */
    val guaranteePeriod = long("guaranteePeriod") /* null */
    val certificate = text("certificate") /* null */ /* Номер документа на товар.  Перед указанием номера документ нужно загрузить в кабинете продавца на Маркете. [Инструкция](https://yandex.ru/support/marketplace/assortment/restrictions/certificates.html)  */
    val price = decimal("price") /* null */ /* Цена на товар в рублях. */
    val marketCategoryId = long("marketCategoryId") /* null */ /* Идентификатор категории для рекомендованной карточки товара на Маркете.  Возвращается только вместе с параметром ##marketSku##.  */
    val marketCategoryName = text("marketCategoryName") /* null */ /* Название категории для рекомендованной карточки товара на Маркете.  Может отсутствовать в ответе.  */
    val marketModelId = long("marketModelId") /* null */ /* Идентификатор модели для рекомендованной карточки товара на Маркете.  Может отсутствовать в ответе.  */
    val marketModelName = text("marketModelName") /* null */ /* Название модели для рекомендованной карточки товара на Маркете.  Возвращается только вместе с параметром ##marketSku##.  */
    val marketSku = long("marketSku") /* null */ /* SKU на Маркете. */
    val marketSkuName = text("marketSkuName") /* null */ /* Название товара с рекомендованной карточки на Маркете.  Может отсутствовать в ответе.  */

    /**
     * Create an entity of type EnrichedMappingsOfferDTO from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = EnrichedMappingsOfferDTO(
        name = row[name]  /* kotlin.String? */ /* Составляйте название по схеме: тип + бренд или производитель + модель + особенности, если есть (например, цвет, размер или вес) и количество в упаковке.  Не включайте в название условия продажи (например, «скидка», «бесплатная доставка» и т. д.), эмоциональные характеристики («хит», «супер» и т. д.). Не пишите слова большими буквами — кроме устоявшихся названий брендов и моделей.  Оптимальная длина — 50–60 символов, максимальная — 256.  [Рекомендации и правила](https://yandex.ru/support/marketplace/assortment/fields/title.html)  */,
        shopSku = row[shopSku]  /* kotlin.String? */ /* Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  */,
        category = row[category]  /* kotlin.String? */ /* Категория товара в вашем магазине. Значение будет использовано для определения категории товара на Маркете в случае, если вы не передали категорию в параметре `marketCategoryId`.  Указывайте конкретные категории — например, набор ножей лучше отнести к категории **Столовые приборы**, а не просто **Посуда**.  Выбирайте категории, которые описывают товар, а не абстрактный признак — например, **Духи**, а не **Подарки**.  Значение будет использовано для определения категории товара на Маркете в случае, если вы не передали категорию в параметре `marketCategoryId`.  */,
        vendor = row[vendor]  /* kotlin.String? */ /* Название бренда или производителя. Должно быть записано так, как его пишет сам бренд. */,
        vendorCode = row[vendorCode]  /* kotlin.String? */ /* Артикул товара от производителя. */,
        description = row[description]  /* kotlin.String? */ /* Подробное описание товара: например, его преимущества и особенности.  Не давайте в описании инструкций по установке и сборке. Не используйте слова «скидка», «распродажа», «дешевый», «подарок» (кроме подарочных категорий), «бесплатно», «акция», «специальная цена», «новинка», «new», «аналог», «заказ», «хит». Не указывайте никакой контактной информации и не давайте ссылок.  Можно использовать теги:  * \\<h>, \\<h1>, \\<h2> и так далее — для заголовков; * \\<br> и \\<p> — для переноса строки; * \\<ol> — для нумерованного списка; * \\<ul> — для маркированного списка; * \\<li> — для создания элементов списка (должен находиться внутри \\<ol> или \\<ul>); * \\<div> — поддерживается, но не влияет на отображение текста.  Оптимальная длина — 400–600 символов, максимальная — 6000.  [Рекомендации и правила](https://yandex.ru/support/marketplace/assortment/fields/description.html)  */,
        id = row[id]  /* kotlin.String? */ /* Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  */,
        feedId = row[feedId]  /* kotlin.Long? */ /* Идентификатор фида. */,
        barcodes = emptyList() /* kotlin.Array<kotlin.String>? */ /* Указывайте в виде последовательности цифр. Подойдут коды EAN-13, EAN-8, UPC-A, UPC-E или Code 128.  Для книг указывайте ISBN.  Для товаров [определенных категорий и торговых марок](https://yastatic.net/s3/doc-binary/src/support/market/ru/yandex-market-list-for-gtin.xlsx) штрихкод должен быть действительным кодом GTIN. Обратите внимание: внутренние штрихкоды, начинающиеся на 2 или 02, и коды формата Code 128 не являются GTIN.  [Что такое GTIN](*gtin)   */,
        urls = emptyList() /* kotlin.Array<kotlin.String>? */ /* URL фотографии товара или страницы с описанием на вашем сайте.  Переданные данные не будут отображаться на витрине, но они помогут специалистам Маркета найти карточку для вашего товара.  Должен содержать один вложенный параметр url.  */,
        pictures = emptyList() /* kotlin.Array<kotlin.String>? */ /* Ссылки (URL) изображений товара в хорошем качестве.  Можно указать до 30 ссылок. При этом изображение по первой ссылке будет основным. Оно используется в качестве изображения товара в поиске Маркета и на карточке товара. Другие изображения товара доступны в режиме просмотра увеличенных изображений.  Обязательный параметр.  Должен содержать хотя бы один вложенный параметр `picture`.  */,
        manufacturer = row[manufacturer]  /* kotlin.String? */ /* Изготовитель товара: компания, которая произвела товар, ее адрес и регистрационный номер (если есть).  Необязательный параметр.  */,
        manufacturerCountries = emptyList() /* kotlin.Array<kotlin.String>? */ /* Список стран, в которых произведен товар.  Обязательный параметр.  Должен содержать хотя бы одну, но не больше 5 стран.  */,
        minShipment = row[minShipment]  /* kotlin.Int? */ /* Минимальное количество единиц товара, которое вы поставляете на склад.  Например, если вы поставляете детское питание партиями минимум по 10 коробок, а в каждой коробке по 6 баночек, укажите значение 60.  */,
        transportUnitSize = row[transportUnitSize]  /* kotlin.Int? */ /* Количество единиц товара в одной упаковке, которую вы поставляете на склад.  Например, если вы поставляете детское питание коробками по 6 баночек, укажите значение 6.  */,
        quantumOfSupply = row[quantumOfSupply]  /* kotlin.Int? */ /* Добавочная партия: по сколько единиц товара можно добавлять к минимальному количеству minShipment.  Например, если вы поставляете детское питание партиями минимум по 10 коробок и хотите добавлять к минимальной партии по 2 коробки, а в каждой коробке по 6 баночек, укажите значение 12.  */,
        deliveryDurationDays = row[deliveryDurationDays]  /* kotlin.Int? */ /* Срок, за который продавец поставляет товары на склад, в днях. */,
        boxCount = row[boxCount]  /* kotlin.Int? */ /* Сколько мест (если больше одного) занимает товар.  Параметр указывается, только если товар занимает больше одного места (например, кондиционер занимает два места: внешний и внутренний блоки в двух коробках). Если товар занимает одно место, не указывайте этот параметр.  */,
        customsCommodityCodes = emptyList() /* kotlin.Array<kotlin.String>? */ /* Список кодов товара в единой Товарной номенклатуре внешнеэкономической деятельности (ТН ВЭД).  Обязательный параметр, если товар подлежит особому учету (например, в системе «Меркурий» как продукция животного происхождения или в системе «Честный ЗНАК»).  Может содержать только один вложенный код ТН ВЭД.  */,
        weightDimensions = OfferWeightDimensionsDTOs.createEntity(row, withReferences) /* OfferWeightDimensionsDTO? */,
        supplyScheduleDays = emptyList() /* kotlin.Array<DayOfWeekType>? */ /* Дни недели, в которые продавец поставляет товары на склад. */,
        shelfLifeDays = row[shelfLifeDays]  /* kotlin.Int? */ /* {% note warning \"\" %}  Этот параметр устарел. Вместо него используйте `shelfLife`. Совместное использование обоих параметров приведет к ошибке.  {% endnote %}  Срок годности: через сколько дней товар станет непригоден для использования.  */,
        lifeTimeDays = row[lifeTimeDays]  /* kotlin.Int? */ /* {% note warning \"\" %}  Этот параметр устарел. Вместо него используйте `lifeTime`. Совместное использование обоих параметров приведет к ошибке.  {% endnote %}  Срок службы: сколько дней товар будет исправно выполнять свою функцию, а изготовитель — нести ответственность за его существенные недостатки.  */,
        guaranteePeriodDays = row[guaranteePeriodDays]  /* kotlin.Int? */ /* Гарантийный срок товара: сколько дней возможно обслуживание и ремонт товара или возврат денег, а изготовитель или продавец будет нести ответственность за недостатки товара.  */,
        processingState = OfferProcessingStateDTOs.createEntity(row, withReferences) /* OfferProcessingStateDTO? */,
        availability = OfferAvailabilityStatusTypes.createEntity(row, withReferences) /* OfferAvailabilityStatusType? */,
        shelfLife = TimePeriodDTOs.createEntity(row, withReferences) /* TimePeriodDTO? */,
        lifeTime = TimePeriodDTOs.createEntity(row, withReferences) /* TimePeriodDTO? */,
        guaranteePeriod = TimePeriodDTOs.createEntity(row, withReferences) /* TimePeriodDTO? */,
        certificate = row[certificate]  /* kotlin.String? */ /* Номер документа на товар.  Перед указанием номера документ нужно загрузить в кабинете продавца на Маркете. [Инструкция](https://yandex.ru/support/marketplace/assortment/restrictions/certificates.html)  */,
        price = row[price]  /* java.math.BigDecimal? */ /* Цена на товар в рублях. */,
        marketCategoryId = row[marketCategoryId]  /* kotlin.Long? */ /* Идентификатор категории для рекомендованной карточки товара на Маркете.  Возвращается только вместе с параметром ##marketSku##.  */,
        marketCategoryName = row[marketCategoryName]  /* kotlin.String? */ /* Название категории для рекомендованной карточки товара на Маркете.  Может отсутствовать в ответе.  */,
        marketModelId = row[marketModelId]  /* kotlin.Long? */ /* Идентификатор модели для рекомендованной карточки товара на Маркете.  Может отсутствовать в ответе.  */,
        marketModelName = row[marketModelName]  /* kotlin.String? */ /* Название модели для рекомендованной карточки товара на Маркете.  Возвращается только вместе с параметром ##marketSku##.  */,
        marketSku = row[marketSku]  /* kotlin.Long? */ /* SKU на Маркете. */,
        marketSkuName = row[marketSkuName]  /* kotlin.String? */ /* Название товара с рекомендованной карточки на Маркете.  Может отсутствовать в ответе.  */
    )

    /**
    * Assign all the columns from the entity of type EnrichedMappingsOfferDTO to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = EnrichedMappingsOfferDTO()
    * database.update(EnrichedMappingsOfferDTOs, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: EnrichedMappingsOfferDTO) {
        this.apply {
            set(EnrichedMappingsOfferDTOs.name, entity.name)
            set(EnrichedMappingsOfferDTOs.shopSku, entity.shopSku)
            set(EnrichedMappingsOfferDTOs.category, entity.category)
            set(EnrichedMappingsOfferDTOs.vendor, entity.vendor)
            set(EnrichedMappingsOfferDTOs.vendorCode, entity.vendorCode)
            set(EnrichedMappingsOfferDTOs.description, entity.description)
            set(EnrichedMappingsOfferDTOs.id, entity.id)
            set(EnrichedMappingsOfferDTOs.feedId, entity.feedId)
            set(EnrichedMappingsOfferDTOs.manufacturer, entity.manufacturer)
            set(EnrichedMappingsOfferDTOs.minShipment, entity.minShipment)
            set(EnrichedMappingsOfferDTOs.transportUnitSize, entity.transportUnitSize)
            set(EnrichedMappingsOfferDTOs.quantumOfSupply, entity.quantumOfSupply)
            set(EnrichedMappingsOfferDTOs.deliveryDurationDays, entity.deliveryDurationDays)
            set(EnrichedMappingsOfferDTOs.boxCount, entity.boxCount)
            set(EnrichedMappingsOfferDTOs.weightDimensions, entity.weightDimensions)
            set(EnrichedMappingsOfferDTOs.shelfLifeDays, entity.shelfLifeDays)
            set(EnrichedMappingsOfferDTOs.lifeTimeDays, entity.lifeTimeDays)
            set(EnrichedMappingsOfferDTOs.guaranteePeriodDays, entity.guaranteePeriodDays)
            set(EnrichedMappingsOfferDTOs.processingState, entity.processingState)
            set(EnrichedMappingsOfferDTOs.availability, entity.availability)
            set(EnrichedMappingsOfferDTOs.shelfLife, entity.shelfLife)
            set(EnrichedMappingsOfferDTOs.lifeTime, entity.lifeTime)
            set(EnrichedMappingsOfferDTOs.guaranteePeriod, entity.guaranteePeriod)
            set(EnrichedMappingsOfferDTOs.certificate, entity.certificate)
            set(EnrichedMappingsOfferDTOs.price, entity.price)
            set(EnrichedMappingsOfferDTOs.marketCategoryId, entity.marketCategoryId)
            set(EnrichedMappingsOfferDTOs.marketCategoryName, entity.marketCategoryName)
            set(EnrichedMappingsOfferDTOs.marketModelId, entity.marketModelId)
            set(EnrichedMappingsOfferDTOs.marketModelName, entity.marketModelName)
            set(EnrichedMappingsOfferDTOs.marketSku, entity.marketSku)
            set(EnrichedMappingsOfferDTOs.marketSkuName, entity.marketSkuName)
        }
    }

}


object EnrichedMappingsOfferDTOBarcodes : BaseTable<Pair<kotlin.Long, kotlin.String>>("EnrichedMappingsOfferDTOBarcodes") {
    val enrichedMappingsOfferDTO = long("enrichedMappingsOfferDTO")
    val barcodes = text("barcodes")

    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean): Pair<kotlin.Long, kotlin.String> =
        Pair(row[enrichedMappingsOfferDTO] ?: 0, row[barcodes] ?: "")

    fun AssignmentsBuilder.assignFrom(entity: Pair<kotlin.Long, kotlin.String>) {
        this.apply {
            set(EnrichedMappingsOfferDTOBarcodes.enrichedMappingsOfferDTO, entity.first)
            set(EnrichedMappingsOfferDTOBarcodes.barcodes, entity.second)
        }
    }

}

object EnrichedMappingsOfferDTOUrls : BaseTable<Pair<kotlin.Long, kotlin.String>>("EnrichedMappingsOfferDTOUrls") {
    val enrichedMappingsOfferDTO = long("enrichedMappingsOfferDTO")
    val urls = text("urls")

    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean): Pair<kotlin.Long, kotlin.String> =
        Pair(row[enrichedMappingsOfferDTO] ?: 0, row[urls] ?: "")

    fun AssignmentsBuilder.assignFrom(entity: Pair<kotlin.Long, kotlin.String>) {
        this.apply {
            set(EnrichedMappingsOfferDTOUrls.enrichedMappingsOfferDTO, entity.first)
            set(EnrichedMappingsOfferDTOUrls.urls, entity.second)
        }
    }

}

object EnrichedMappingsOfferDTOPictures : BaseTable<Pair<kotlin.Long, kotlin.String>>("EnrichedMappingsOfferDTOPictures") {
    val enrichedMappingsOfferDTO = long("enrichedMappingsOfferDTO")
    val pictures = text("pictures")

    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean): Pair<kotlin.Long, kotlin.String> =
        Pair(row[enrichedMappingsOfferDTO] ?: 0, row[pictures] ?: "")

    fun AssignmentsBuilder.assignFrom(entity: Pair<kotlin.Long, kotlin.String>) {
        this.apply {
            set(EnrichedMappingsOfferDTOPictures.enrichedMappingsOfferDTO, entity.first)
            set(EnrichedMappingsOfferDTOPictures.pictures, entity.second)
        }
    }

}

object EnrichedMappingsOfferDTOManufacturerCountries : BaseTable<Pair<kotlin.Long, kotlin.String>>("EnrichedMappingsOfferDTOManufacturerCountries") {
    val enrichedMappingsOfferDTO = long("enrichedMappingsOfferDTO")
    val manufacturerCountries = text("manufacturerCountries")

    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean): Pair<kotlin.Long, kotlin.String> =
        Pair(row[enrichedMappingsOfferDTO] ?: 0, row[manufacturerCountries] ?: "")

    fun AssignmentsBuilder.assignFrom(entity: Pair<kotlin.Long, kotlin.String>) {
        this.apply {
            set(EnrichedMappingsOfferDTOManufacturerCountries.enrichedMappingsOfferDTO, entity.first)
            set(EnrichedMappingsOfferDTOManufacturerCountries.manufacturerCountries, entity.second)
        }
    }

}

object EnrichedMappingsOfferDTOCustomsCommodityCodes : BaseTable<Pair<kotlin.Long, kotlin.String>>("EnrichedMappingsOfferDTOCustomsCommodityCodes") {
    val enrichedMappingsOfferDTO = long("enrichedMappingsOfferDTO")
    val customsCommodityCodes = text("customsCommodityCodes")

    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean): Pair<kotlin.Long, kotlin.String> =
        Pair(row[enrichedMappingsOfferDTO] ?: 0, row[customsCommodityCodes] ?: "")

    fun AssignmentsBuilder.assignFrom(entity: Pair<kotlin.Long, kotlin.String>) {
        this.apply {
            set(EnrichedMappingsOfferDTOCustomsCommodityCodes.enrichedMappingsOfferDTO, entity.first)
            set(EnrichedMappingsOfferDTOCustomsCommodityCodes.customsCommodityCodes, entity.second)
        }
    }

}

object EnrichedMappingsOfferDTODayOfWeekType : BaseTable<Pair<kotlin.Long, kotlin.Long>>("EnrichedMappingsOfferDTODayOfWeekType") {
    val enrichedMappingsOfferDTO = long("enrichedMappingsOfferDTO")
    val dayOfWeekType = long("dayOfWeekType")

    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean): Pair<kotlin.Long, kotlin.Long> =
        Pair(row[enrichedMappingsOfferDTO] ?: 0, row[dayOfWeekType] ?: 0)

    fun AssignmentsBuilder.assignFrom(entity: Pair<kotlin.Long, kotlin.Long>) {
        this.apply {
            set(EnrichedMappingsOfferDTODayOfWeekType.enrichedMappingsOfferDTO, entity.first)
            set(EnrichedMappingsOfferDTODayOfWeekType.dayOfWeekType, entity.second)
        }
    }

}

