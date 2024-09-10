goog.provide('API.Client.BaseOfferDTO');

/**
 * Основные параметры товара.
 * @record
 */
API.Client.BaseOfferDTO = function() {}

/**
 * Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
 * @type {!string}
 * @export
 */
API.Client.BaseOfferDTO.prototype.offerId;

/**
 * Составляйте название по схеме: тип + бренд или производитель + модель + особенности, если есть (например, цвет, размер или вес) и количество в упаковке.  Не включайте в название условия продажи (например, «скидка», «бесплатная доставка» и т. д.), эмоциональные характеристики («хит», «супер» и т. д.). Не пишите слова большими буквами — кроме устоявшихся названий брендов и моделей.  Оптимальная длина — 50–60 символов, максимальная — 256.  [Рекомендации и правила](https://yandex.ru/support/marketplace/assortment/fields/title.html) 
 * @type {!string}
 * @export
 */
API.Client.BaseOfferDTO.prototype.name;

/**
 * Идентификатор категории на Маркете, к которой вы относите свой товар.  Если не указать `marketCategoryId`, то маркетная категория будет определена автоматически.  При изменении информации о товаре передавайте тот же идентификатор категории. Если вы укажете другой, категория товара не поменяется. Изменить ее можно только в кабинете продавца на Маркете.  Список категорий Маркета можно получить с помощью запроса  [POST categories/tree](../../reference/categories/getCategoriesTree.md). 
 * @type {!number}
 * @export
 */
API.Client.BaseOfferDTO.prototype.marketCategoryId;

/**
 * Категория товара в вашем магазине. Значение будет использовано для определения категории товара на Маркете в случае, если вы не передали категорию в параметре `marketCategoryId`.  Указывайте конкретные категории — например, набор ножей лучше отнести к категории **Столовые приборы**, а не просто **Посуда**.  Выбирайте категории, которые описывают товар, а не абстрактный признак — например, **Духи**, а не **Подарки**.  Значение будет использовано для определения категории товара на Маркете в случае, если вы не передали категорию в параметре `marketCategoryId`. 
 * @type {!string}
 * @export
 */
API.Client.BaseOfferDTO.prototype.category;

/**
 * Ссылки на изображения товара. Изображение по первой ссылке считается основным, остальные дополнительными.  **Требования к ссылкам**  * Ссылок может быть до 30. * Указывайте ссылку целиком, включая протокол http или https. * Максимальная длина — 512 символов. * Русские буквы в URL можно. * Можно использовать прямые ссылки на изображения и на Яндекс Диск. Ссылки на Яндекс Диске нужно копировать с помощью функции **Поделиться**. Относительные ссылки и ссылки на другие облачные хранилища — не работают.  ✅ `https://example-shop.ru/images/sku12345.jpg`  ✅ `https://yadi.sk/i/NaBoRsimVOLov`  ❌ `/images/sku12345.jpg`  ❌ `https://www.dropbox.com/s/818f/tovar.jpg`  Ссылки на изображение должны быть постоянными. Нельзя использовать динамические ссылки, меняющиеся от выгрузки к выгрузке.  Если нужно заменить изображение, выложите новое изображение по новой ссылке, а ссылку на старое удалите. Если просто заменить изображение по старой ссылке, оно не обновится.  [Требования к изображениям](https://yandex.ru/support/marketplace/assortment/fields/images.html) 
 * @type {!Array<!string>}
 * @export
 */
API.Client.BaseOfferDTO.prototype.pictures;

/**
 * Ссылка (URL) на видео товара.  Максимальное количество ссылок — 6.  **Требования к ссылке**  * Указывайте ссылку целиком, включая протокол http или https. * Максимальная длина — 512 символов. * Русские буквы в URL можно. * Можно использовать прямые ссылки на видео и на Яндекс Диск. Ссылки на Яндекс Диске нужно копировать с помощью функции **Поделиться**. Относительные ссылки и ссылки на другие облачные хранилища — не работают.  ✅ `https://example-shop.ru/video/sku12345.avi`  ✅ `https://yadi.sk/i/NaBoRsimVOLov`  ❌ `/video/sku12345.avi`  ❌ `https://www.dropbox.com/s/818f/super-tovar.avi`  Ссылки на видео должны быть постоянными. Нельзя использовать динамические ссылки, меняющиеся от выгрузки к выгрузке.  Если нужно заменить видео, выложите новое видео по новой ссылке, а ссылку на старое удалите. Если просто заменить видео по старой ссылке, оно не обновится.  [Требования к видео](https://yandex.ru/support/marketplace/assortment/fields/video.html) 
 * @type {!Array<!string>}
 * @export
 */
API.Client.BaseOfferDTO.prototype.videos;

/**
 * Список инструкций по использованию товара.  Максимальное количество инструкций — 6.  Если вы передадите пустое поле `manuals`, загруженные ранее инструкции удалятся. 
 * @type {!Array<!API.Client.OfferManualDTO>}
 * @export
 */
API.Client.BaseOfferDTO.prototype.manuals;

/**
 * Название бренда или производителя. Должно быть записано так, как его пишет сам бренд.
 * @type {!string}
 * @export
 */
API.Client.BaseOfferDTO.prototype.vendor;

/**
 * Указывайте в виде последовательности цифр. Подойдут коды EAN-13, EAN-8, UPC-A, UPC-E или Code 128.  Для книг указывайте ISBN.  Для товаров [определенных категорий и торговых марок](https://yastatic.net/s3/doc-binary/src/support/market/ru/yandex-market-list-for-gtin.xlsx) штрихкод должен быть действительным кодом GTIN. Обратите внимание: внутренние штрихкоды, начинающиеся на 2 или 02, и коды формата Code 128 не являются GTIN.  [Что такое GTIN](*gtin)  
 * @type {!Array<!string>}
 * @export
 */
API.Client.BaseOfferDTO.prototype.barcodes;

/**
 * Подробное описание товара: например, его преимущества и особенности.  Не давайте в описании инструкций по установке и сборке. Не используйте слова «скидка», «распродажа», «дешевый», «подарок» (кроме подарочных категорий), «бесплатно», «акция», «специальная цена», «новинка», «new», «аналог», «заказ», «хит». Не указывайте никакой контактной информации и не давайте ссылок.  Можно использовать теги:  * \\<h>, \\<h1>, \\<h2> и так далее — для заголовков; * \\<br> и \\<p> — для переноса строки; * \\<ol> — для нумерованного списка; * \\<ul> — для маркированного списка; * \\<li> — для создания элементов списка (должен находиться внутри \\<ol> или \\<ul>); * \\<div> — поддерживается, но не влияет на отображение текста.  Оптимальная длина — 400–600 символов, максимальная — 6000.  [Рекомендации и правила](https://yandex.ru/support/marketplace/assortment/fields/description.html) 
 * @type {!string}
 * @export
 */
API.Client.BaseOfferDTO.prototype.description;

/**
 * Страна, где был произведен товар.  Записывайте названия стран так, как они записаны в [списке](https://yastatic.net/s3/doc-binary/src/support/market/ru/countries.xlsx). 
 * @type {!Array<!string>}
 * @export
 */
API.Client.BaseOfferDTO.prototype.manufacturerCountries;

/**
 * @type {!API.Client.OfferWeightDimensionsDTO}
 * @export
 */
API.Client.BaseOfferDTO.prototype.weightDimensions;

/**
 * Артикул товара от производителя.
 * @type {!string}
 * @export
 */
API.Client.BaseOfferDTO.prototype.vendorCode;

/**
 * Метки товара, используемые магазином. Покупателям теги не видны. По тегам можно группировать и фильтровать разные товары в каталоге — например, товары одной серии, коллекции или линейки.  Максимальная длина тега 20 символов. У одного товара может быть максимум 10 тегов. Всего можно создать не больше 50 разных тегов. 
 * @type {!Array<!string>}
 * @export
 */
API.Client.BaseOfferDTO.prototype.tags;

/**
 * @type {!API.Client.TimePeriodDTO}
 * @export
 */
API.Client.BaseOfferDTO.prototype.shelfLife;

/**
 * @type {!API.Client.TimePeriodDTO}
 * @export
 */
API.Client.BaseOfferDTO.prototype.lifeTime;

/**
 * @type {!API.Client.TimePeriodDTO}
 * @export
 */
API.Client.BaseOfferDTO.prototype.guaranteePeriod;

/**
 * Код товара в единой Товарной номенклатуре внешнеэкономической деятельности (ТН ВЭД) — 10 или 14 цифр без пробелов.  Обязательно укажите, если он есть. 
 * @type {!string}
 * @export
 */
API.Client.BaseOfferDTO.prototype.customsCommodityCode;

/**
 * Номера документов на товар: сертификата, декларации соответствия и т. п.  Передавать можно только номера документов, сканы которого загружены в кабинете продавца по [инструкции](https://yandex.ru/support/marketplace/assortment/restrictions/certificates.html). 
 * @type {!Array<!string>}
 * @export
 */
API.Client.BaseOfferDTO.prototype.certificates;

/**
 * Количество грузовых мест.  Параметр используется, если товар представляет собой несколько коробок, упаковок и так далее. Например, кондиционер занимает два места — внешний и внутренний блоки в двух коробках.  Для товаров, занимающих одно место, не передавайте этот параметр. 
 * @type {!number}
 * @export
 */
API.Client.BaseOfferDTO.prototype.boxCount;

/**
 * @type {!API.Client.OfferConditionDTO}
 * @export
 */
API.Client.BaseOfferDTO.prototype.condition;

/**
 * @type {!API.Client.OfferType}
 * @export
 */
API.Client.BaseOfferDTO.prototype.type;

/**
 * Признак цифрового товара. Укажите `true`, если товар доставляется по электронной почте.  [Как работать с цифровыми товарами](../../step-by-step/digital.md) 
 * @type {!boolean}
 * @export
 */
API.Client.BaseOfferDTO.prototype.downloadable;

/**
 * Параметр включает для товара пометку 18+. Устанавливайте ее только для товаров, которые относятся к удовлетворению сексуальных потребностей. 
 * @type {!boolean}
 * @export
 */
API.Client.BaseOfferDTO.prototype.adult;

/**
 * @type {!API.Client.AgeDTO}
 * @export
 */
API.Client.BaseOfferDTO.prototype.age;

/**
 * {% note warning \"\" %}  Этот параметр устарел. При передаче характеристик используйте `parameterValues`.  {% endnote %}  Характеристики, которые есть только у товаров конкретной категории — например, диаметр колес велосипеда или материал подошвы обуви. 
 * @type {!Array<!API.Client.OfferParamDTO>}
 * @export
 */
API.Client.BaseOfferDTO.prototype.params;

