
package org.openapitools.client.model


case class UpdateMappingsOfferDTO (
    /* Составляйте название по схеме: тип + бренд или производитель + модель + особенности, если есть (например, цвет, размер или вес) и количество в упаковке.  Не включайте в название условия продажи (например, «скидка», «бесплатная доставка» и т. д.), эмоциональные характеристики («хит», «супер» и т. д.). Не пишите слова большими буквами — кроме устоявшихся названий брендов и моделей.  Оптимальная длина — 50–60 символов, максимальная — 256.  [Рекомендации и правила](https://yandex.ru/support/marketplace/assortment/fields/title.html)  */
    _name: Option[String],
    /* Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  */
    _shopSku: Option[String],
    /* Категория товара в вашем магазине. Значение будет использовано для определения категории товара на Маркете в случае, если вы не передали категорию в параметре `marketCategoryId`.  Указывайте конкретные категории — например, набор ножей лучше отнести к категории **Столовые приборы**, а не просто **Посуда**.  Выбирайте категории, которые описывают товар, а не абстрактный признак — например, **Духи**, а не **Подарки**.  Значение будет использовано для определения категории товара на Маркете в случае, если вы не передали категорию в параметре `marketCategoryId`.  */
    _category: Option[String],
    /* Название бренда или производителя. Должно быть записано так, как его пишет сам бренд. */
    _vendor: Option[String],
    /* Артикул товара от производителя. */
    _vendorCode: Option[String],
    /* Подробное описание товара: например, его преимущества и особенности.  Не давайте в описании инструкций по установке и сборке. Не используйте слова «скидка», «распродажа», «дешевый», «подарок» (кроме подарочных категорий), «бесплатно», «акция», «специальная цена», «новинка», «new», «аналог», «заказ», «хит». Не указывайте никакой контактной информации и не давайте ссылок.  Можно использовать теги:  * \\<h>, \\<h1>, \\<h2> и так далее — для заголовков; * \\<br> и \\<p> — для переноса строки; * \\<ol> — для нумерованного списка; * \\<ul> — для маркированного списка; * \\<li> — для создания элементов списка (должен находиться внутри \\<ol> или \\<ul>); * \\<div> — поддерживается, но не влияет на отображение текста.  Оптимальная длина — 400–600 символов, максимальная — 6000.  [Рекомендации и правила](https://yandex.ru/support/marketplace/assortment/fields/description.html)  */
    _description: Option[String],
    /* Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  */
    _id: Option[String],
    /* Идентификатор фида. */
    _feedId: Option[Long],
    /* Указывайте в виде последовательности цифр. Подойдут коды EAN-13, EAN-8, UPC-A, UPC-E или Code 128.  Для книг указывайте ISBN.  Для товаров [определенных категорий и торговых марок](https://yastatic.net/s3/doc-binary/src/support/market/ru/yandex-market-list-for-gtin.xlsx) штрихкод должен быть действительным кодом GTIN. Обратите внимание: внутренние штрихкоды, начинающиеся на 2 или 02, и коды формата Code 128 не являются GTIN.  [Что такое GTIN](*gtin)   */
    _barcodes: Option[List[String]],
    /* URL фотографии товара или страницы с описанием на вашем сайте.  Переданные данные не будут отображаться на витрине, но они помогут специалистам Маркета найти карточку для вашего товара.  Должен содержать один вложенный параметр url.  */
    _urls: Option[List[String]],
    /* Ссылки (URL) изображений товара в хорошем качестве.  Можно указать до 30 ссылок. При этом изображение по первой ссылке будет основным. Оно используется в качестве изображения товара в поиске Маркета и на карточке товара. Другие изображения товара доступны в режиме просмотра увеличенных изображений.  Обязательный параметр.  Должен содержать хотя бы один вложенный параметр `picture`.  */
    _pictures: Option[List[String]],
    /* Изготовитель товара: компания, которая произвела товар, ее адрес и регистрационный номер (если есть).  Необязательный параметр.  */
    _manufacturer: Option[String],
    /* Список стран, в которых произведен товар.  Обязательный параметр.  Должен содержать хотя бы одну, но не больше 5 стран.  */
    _manufacturerCountries: Option[List[String]],
    /* Минимальное количество единиц товара, которое вы поставляете на склад.  Например, если вы поставляете детское питание партиями минимум по 10 коробок, а в каждой коробке по 6 баночек, укажите значение 60.  */
    _minShipment: Option[Integer],
    /* Количество единиц товара в одной упаковке, которую вы поставляете на склад.  Например, если вы поставляете детское питание коробками по 6 баночек, укажите значение 6.  */
    _transportUnitSize: Option[Integer],
    /* Добавочная партия: по сколько единиц товара можно добавлять к минимальному количеству minShipment.  Например, если вы поставляете детское питание партиями минимум по 10 коробок и хотите добавлять к минимальной партии по 2 коробки, а в каждой коробке по 6 баночек, укажите значение 12.  */
    _quantumOfSupply: Option[Integer],
    /* Срок, за который продавец поставляет товары на склад, в днях. */
    _deliveryDurationDays: Option[Integer],
    /* Сколько мест (если больше одного) занимает товар.  Параметр указывается, только если товар занимает больше одного места (например, кондиционер занимает два места: внешний и внутренний блоки в двух коробках). Если товар занимает одно место, не указывайте этот параметр.  */
    _boxCount: Option[Integer],
    /* Список кодов товара в единой Товарной номенклатуре внешнеэкономической деятельности (ТН ВЭД).  Обязательный параметр, если товар подлежит особому учету (например, в системе «Меркурий» как продукция животного происхождения или в системе «Честный ЗНАК»).  Может содержать только один вложенный код ТН ВЭД.  */
    _customsCommodityCodes: Option[List[String]],
    _weightDimensions: Option[OfferWeightDimensionsDTO],
    /* Дни недели, в которые продавец поставляет товары на склад. */
    _supplyScheduleDays: Option[List[DayOfWeekType]],
    /* {% note warning \"\" %}  Этот параметр устарел. Вместо него используйте `shelfLife`. Совместное использование обоих параметров приведет к ошибке.  {% endnote %}  Срок годности: через сколько дней товар станет непригоден для использования.  */
    _shelfLifeDays: Option[Integer],
    /* {% note warning \"\" %}  Этот параметр устарел. Вместо него используйте `lifeTime`. Совместное использование обоих параметров приведет к ошибке.  {% endnote %}  Срок службы: сколько дней товар будет исправно выполнять свою функцию, а изготовитель — нести ответственность за его существенные недостатки.  */
    _lifeTimeDays: Option[Integer],
    /* Гарантийный срок товара: сколько дней возможно обслуживание и ремонт товара или возврат денег, а изготовитель или продавец будет нести ответственность за недостатки товара.  */
    _guaranteePeriodDays: Option[Integer],
    _processingState: Option[OfferProcessingStateDTO],
    _availability: Option[OfferAvailabilityStatusType],
    _shelfLife: Option[TimePeriodDTO],
    _lifeTime: Option[TimePeriodDTO],
    _guaranteePeriod: Option[TimePeriodDTO],
    /* Номер документа на товар.  Перед указанием номера документ нужно загрузить в кабинете продавца на Маркете. [Инструкция](https://yandex.ru/support/marketplace/assortment/restrictions/certificates.html)  */
    _certificate: Option[String]
)
object UpdateMappingsOfferDTO {
    def toStringBody(var_name: Object, var_shopSku: Object, var_category: Object, var_vendor: Object, var_vendorCode: Object, var_description: Object, var_id: Object, var_feedId: Object, var_barcodes: Object, var_urls: Object, var_pictures: Object, var_manufacturer: Object, var_manufacturerCountries: Object, var_minShipment: Object, var_transportUnitSize: Object, var_quantumOfSupply: Object, var_deliveryDurationDays: Object, var_boxCount: Object, var_customsCommodityCodes: Object, var_weightDimensions: Object, var_supplyScheduleDays: Object, var_shelfLifeDays: Object, var_lifeTimeDays: Object, var_guaranteePeriodDays: Object, var_processingState: Object, var_availability: Object, var_shelfLife: Object, var_lifeTime: Object, var_guaranteePeriod: Object, var_certificate: Object) =
        s"""
        | {
        | "name":$var_name,"shopSku":$var_shopSku,"category":$var_category,"vendor":$var_vendor,"vendorCode":$var_vendorCode,"description":$var_description,"id":$var_id,"feedId":$var_feedId,"barcodes":$var_barcodes,"urls":$var_urls,"pictures":$var_pictures,"manufacturer":$var_manufacturer,"manufacturerCountries":$var_manufacturerCountries,"minShipment":$var_minShipment,"transportUnitSize":$var_transportUnitSize,"quantumOfSupply":$var_quantumOfSupply,"deliveryDurationDays":$var_deliveryDurationDays,"boxCount":$var_boxCount,"customsCommodityCodes":$var_customsCommodityCodes,"weightDimensions":$var_weightDimensions,"supplyScheduleDays":$var_supplyScheduleDays,"shelfLifeDays":$var_shelfLifeDays,"lifeTimeDays":$var_lifeTimeDays,"guaranteePeriodDays":$var_guaranteePeriodDays,"processingState":$var_processingState,"availability":$var_availability,"shelfLife":$var_shelfLife,"lifeTime":$var_lifeTime,"guaranteePeriod":$var_guaranteePeriod,"certificate":$var_certificate
        | }
        """.stripMargin
}
