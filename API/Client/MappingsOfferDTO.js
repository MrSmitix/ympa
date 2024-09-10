goog.provide('API.Client.MappingsOfferDTO');

/**
 * Информация о товарах в каталоге.
 * @record
 */
API.Client.MappingsOfferDTO = function() {}

/**
 * Составляйте название по схеме: тип + бренд или производитель + модель + особенности, если есть (например, цвет, размер или вес) и количество в упаковке.  Не включайте в название условия продажи (например, «скидка», «бесплатная доставка» и т. д.), эмоциональные характеристики («хит», «супер» и т. д.). Не пишите слова большими буквами — кроме устоявшихся названий брендов и моделей.  Оптимальная длина — 50–60 символов, максимальная — 256.  [Рекомендации и правила](https://yandex.ru/support/marketplace/assortment/fields/title.html) 
 * @type {!string}
 * @export
 */
API.Client.MappingsOfferDTO.prototype.name;

/**
 * Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
 * @type {!string}
 * @export
 */
API.Client.MappingsOfferDTO.prototype.shopSku;

/**
 * Категория товара в вашем магазине. Значение будет использовано для определения категории товара на Маркете в случае, если вы не передали категорию в параметре `marketCategoryId`.  Указывайте конкретные категории — например, набор ножей лучше отнести к категории **Столовые приборы**, а не просто **Посуда**.  Выбирайте категории, которые описывают товар, а не абстрактный признак — например, **Духи**, а не **Подарки**.  Значение будет использовано для определения категории товара на Маркете в случае, если вы не передали категорию в параметре `marketCategoryId`. 
 * @type {!string}
 * @export
 */
API.Client.MappingsOfferDTO.prototype.category;

/**
 * Название бренда или производителя. Должно быть записано так, как его пишет сам бренд.
 * @type {!string}
 * @export
 */
API.Client.MappingsOfferDTO.prototype.vendor;

/**
 * Артикул товара от производителя.
 * @type {!string}
 * @export
 */
API.Client.MappingsOfferDTO.prototype.vendorCode;

/**
 * Подробное описание товара: например, его преимущества и особенности.  Не давайте в описании инструкций по установке и сборке. Не используйте слова «скидка», «распродажа», «дешевый», «подарок» (кроме подарочных категорий), «бесплатно», «акция», «специальная цена», «новинка», «new», «аналог», «заказ», «хит». Не указывайте никакой контактной информации и не давайте ссылок.  Можно использовать теги:  * \\<h>, \\<h1>, \\<h2> и так далее — для заголовков; * \\<br> и \\<p> — для переноса строки; * \\<ol> — для нумерованного списка; * \\<ul> — для маркированного списка; * \\<li> — для создания элементов списка (должен находиться внутри \\<ol> или \\<ul>); * \\<div> — поддерживается, но не влияет на отображение текста.  Оптимальная длина — 400–600 символов, максимальная — 6000.  [Рекомендации и правила](https://yandex.ru/support/marketplace/assortment/fields/description.html) 
 * @type {!string}
 * @export
 */
API.Client.MappingsOfferDTO.prototype.description;

/**
 * Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
 * @type {!string}
 * @export
 */
API.Client.MappingsOfferDTO.prototype.id;

/**
 * Идентификатор фида.
 * @type {!number}
 * @export
 */
API.Client.MappingsOfferDTO.prototype.feedId;

/**
 * Указывайте в виде последовательности цифр. Подойдут коды EAN-13, EAN-8, UPC-A, UPC-E или Code 128.  Для книг указывайте ISBN.  Для товаров [определенных категорий и торговых марок](https://yastatic.net/s3/doc-binary/src/support/market/ru/yandex-market-list-for-gtin.xlsx) штрихкод должен быть действительным кодом GTIN. Обратите внимание: внутренние штрихкоды, начинающиеся на 2 или 02, и коды формата Code 128 не являются GTIN.  [Что такое GTIN](*gtin)  
 * @type {!Array<!string>}
 * @export
 */
API.Client.MappingsOfferDTO.prototype.barcodes;

/**
 * URL фотографии товара или страницы с описанием на вашем сайте.  Переданные данные не будут отображаться на витрине, но они помогут специалистам Маркета найти карточку для вашего товара.  Должен содержать один вложенный параметр url. 
 * @type {!Array<!string>}
 * @export
 */
API.Client.MappingsOfferDTO.prototype.urls;

/**
 * Ссылки (URL) изображений товара в хорошем качестве.  Можно указать до 30 ссылок. При этом изображение по первой ссылке будет основным. Оно используется в качестве изображения товара в поиске Маркета и на карточке товара. Другие изображения товара доступны в режиме просмотра увеличенных изображений.  Обязательный параметр.  Должен содержать хотя бы один вложенный параметр `picture`. 
 * @type {!Array<!string>}
 * @export
 */
API.Client.MappingsOfferDTO.prototype.pictures;

/**
 * Изготовитель товара: компания, которая произвела товар, ее адрес и регистрационный номер (если есть).  Необязательный параметр. 
 * @type {!string}
 * @export
 */
API.Client.MappingsOfferDTO.prototype.manufacturer;

/**
 * Список стран, в которых произведен товар.  Обязательный параметр.  Должен содержать хотя бы одну, но не больше 5 стран. 
 * @type {!Array<!string>}
 * @export
 */
API.Client.MappingsOfferDTO.prototype.manufacturerCountries;

/**
 * Минимальное количество единиц товара, которое вы поставляете на склад.  Например, если вы поставляете детское питание партиями минимум по 10 коробок, а в каждой коробке по 6 баночек, укажите значение 60. 
 * @type {!number}
 * @export
 */
API.Client.MappingsOfferDTO.prototype.minShipment;

/**
 * Количество единиц товара в одной упаковке, которую вы поставляете на склад.  Например, если вы поставляете детское питание коробками по 6 баночек, укажите значение 6. 
 * @type {!number}
 * @export
 */
API.Client.MappingsOfferDTO.prototype.transportUnitSize;

/**
 * Добавочная партия: по сколько единиц товара можно добавлять к минимальному количеству minShipment.  Например, если вы поставляете детское питание партиями минимум по 10 коробок и хотите добавлять к минимальной партии по 2 коробки, а в каждой коробке по 6 баночек, укажите значение 12. 
 * @type {!number}
 * @export
 */
API.Client.MappingsOfferDTO.prototype.quantumOfSupply;

/**
 * Срок, за который продавец поставляет товары на склад, в днях.
 * @type {!number}
 * @export
 */
API.Client.MappingsOfferDTO.prototype.deliveryDurationDays;

/**
 * Сколько мест (если больше одного) занимает товар.  Параметр указывается, только если товар занимает больше одного места (например, кондиционер занимает два места: внешний и внутренний блоки в двух коробках). Если товар занимает одно место, не указывайте этот параметр. 
 * @type {!number}
 * @export
 */
API.Client.MappingsOfferDTO.prototype.boxCount;

/**
 * Список кодов товара в единой Товарной номенклатуре внешнеэкономической деятельности (ТН ВЭД).  Обязательный параметр, если товар подлежит особому учету (например, в системе «Меркурий» как продукция животного происхождения или в системе «Честный ЗНАК»).  Может содержать только один вложенный код ТН ВЭД. 
 * @type {!Array<!string>}
 * @export
 */
API.Client.MappingsOfferDTO.prototype.customsCommodityCodes;

/**
 * @type {!API.Client.OfferWeightDimensionsDTO}
 * @export
 */
API.Client.MappingsOfferDTO.prototype.weightDimensions;

/**
 * Дни недели, в которые продавец поставляет товары на склад.
 * @type {!Array<!API.Client.DayOfWeekType>}
 * @export
 */
API.Client.MappingsOfferDTO.prototype.supplyScheduleDays;

/**
 * {% note warning \"\" %}  Этот параметр устарел. Вместо него используйте `shelfLife`. Совместное использование обоих параметров приведет к ошибке.  {% endnote %}  Срок годности: через сколько дней товар станет непригоден для использования. 
 * @type {!number}
 * @export
 */
API.Client.MappingsOfferDTO.prototype.shelfLifeDays;

/**
 * {% note warning \"\" %}  Этот параметр устарел. Вместо него используйте `lifeTime`. Совместное использование обоих параметров приведет к ошибке.  {% endnote %}  Срок службы: сколько дней товар будет исправно выполнять свою функцию, а изготовитель — нести ответственность за его существенные недостатки. 
 * @type {!number}
 * @export
 */
API.Client.MappingsOfferDTO.prototype.lifeTimeDays;

/**
 * Гарантийный срок товара: сколько дней возможно обслуживание и ремонт товара или возврат денег, а изготовитель или продавец будет нести ответственность за недостатки товара. 
 * @type {!number}
 * @export
 */
API.Client.MappingsOfferDTO.prototype.guaranteePeriodDays;

/**
 * @type {!API.Client.OfferProcessingStateDTO}
 * @export
 */
API.Client.MappingsOfferDTO.prototype.processingState;

/**
 * @type {!API.Client.OfferAvailabilityStatusType}
 * @export
 */
API.Client.MappingsOfferDTO.prototype.availability;

/**
 * @type {!API.Client.TimePeriodDTO}
 * @export
 */
API.Client.MappingsOfferDTO.prototype.shelfLife;

/**
 * @type {!API.Client.TimePeriodDTO}
 * @export
 */
API.Client.MappingsOfferDTO.prototype.lifeTime;

/**
 * @type {!API.Client.TimePeriodDTO}
 * @export
 */
API.Client.MappingsOfferDTO.prototype.guaranteePeriod;

/**
 * Номер документа на товар.  Перед указанием номера документ нужно загрузить в кабинете продавца на Маркете. [Инструкция](https://yandex.ru/support/marketplace/assortment/restrictions/certificates.html) 
 * @type {!string}
 * @export
 */
API.Client.MappingsOfferDTO.prototype.certificate;

/**
 * Цена на товар в рублях.
 * @type {!number}
 * @export
 */
API.Client.MappingsOfferDTO.prototype.price;

