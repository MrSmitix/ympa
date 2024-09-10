#' Create a new GetOfferDTO
#'
#' @description
#' Параметры товара.
#'
#' @docType class
#' @title GetOfferDTO
#' @description GetOfferDTO Class
#' @format An \code{R6Class} generator object
#' @field offerId Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) character
#' @field name Составляйте название по схеме: тип + бренд или производитель + модель + особенности, если есть (например, цвет, размер или вес) и количество в упаковке.  Не включайте в название условия продажи (например, «скидка», «бесплатная доставка» и т. д.), эмоциональные характеристики («хит», «супер» и т. д.). Не пишите слова большими буквами — кроме устоявшихся названий брендов и моделей.  Оптимальная длина — 50–60 символов, максимальная — 256.  [Рекомендации и правила](https://yandex.ru/support/marketplace/assortment/fields/title.html) character [optional]
#' @field marketCategoryId Идентификатор категории на Маркете, к которой вы относите свой товар.  Если не указать `marketCategoryId`, то маркетная категория будет определена автоматически.  При изменении информации о товаре передавайте тот же идентификатор категории. Если вы укажете другой, категория товара не поменяется. Изменить ее можно только в кабинете продавца на Маркете.  Список категорий Маркета можно получить с помощью запроса  [POST categories/tree](../../reference/categories/getCategoriesTree.md). integer [optional]
#' @field category Категория товара в вашем магазине. Значение будет использовано для определения категории товара на Маркете в случае, если вы не передали категорию в параметре `marketCategoryId`.  Указывайте конкретные категории — например, набор ножей лучше отнести к категории **Столовые приборы**, а не просто **Посуда**.  Выбирайте категории, которые описывают товар, а не абстрактный признак — например, **Духи**, а не **Подарки**.  Значение будет использовано для определения категории товара на Маркете в случае, если вы не передали категорию в параметре `marketCategoryId`. character [optional]
#' @field pictures Ссылки на изображения товара. Изображение по первой ссылке считается основным, остальные дополнительными.  **Требования к ссылкам**  * Ссылок может быть до 30. * Указывайте ссылку целиком, включая протокол http или https. * Максимальная длина — 512 символов. * Русские буквы в URL можно. * Можно использовать прямые ссылки на изображения и на Яндекс Диск. Ссылки на Яндекс Диске нужно копировать с помощью функции **Поделиться**. Относительные ссылки и ссылки на другие облачные хранилища — не работают.  ✅ `https://example-shop.ru/images/sku12345.jpg`  ✅ `https://yadi.sk/i/NaBoRsimVOLov`  ❌ `/images/sku12345.jpg`  ❌ `https://www.dropbox.com/s/818f/tovar.jpg`  Ссылки на изображение должны быть постоянными. Нельзя использовать динамические ссылки, меняющиеся от выгрузки к выгрузке.  Если нужно заменить изображение, выложите новое изображение по новой ссылке, а ссылку на старое удалите. Если просто заменить изображение по старой ссылке, оно не обновится.  [Требования к изображениям](https://yandex.ru/support/marketplace/assortment/fields/images.html) list(character) [optional]
#' @field videos Ссылка (URL) на видео товара.  Максимальное количество ссылок — 6.  **Требования к ссылке**  * Указывайте ссылку целиком, включая протокол http или https. * Максимальная длина — 512 символов. * Русские буквы в URL можно. * Можно использовать прямые ссылки на видео и на Яндекс Диск. Ссылки на Яндекс Диске нужно копировать с помощью функции **Поделиться**. Относительные ссылки и ссылки на другие облачные хранилища — не работают.  ✅ `https://example-shop.ru/video/sku12345.avi`  ✅ `https://yadi.sk/i/NaBoRsimVOLov`  ❌ `/video/sku12345.avi`  ❌ `https://www.dropbox.com/s/818f/super-tovar.avi`  Ссылки на видео должны быть постоянными. Нельзя использовать динамические ссылки, меняющиеся от выгрузки к выгрузке.  Если нужно заменить видео, выложите новое видео по новой ссылке, а ссылку на старое удалите. Если просто заменить видео по старой ссылке, оно не обновится.  [Требования к видео](https://yandex.ru/support/marketplace/assortment/fields/video.html) list(character) [optional]
#' @field manuals Список инструкций по использованию товара.  Максимальное количество инструкций — 6.  Если вы передадите пустое поле `manuals`, загруженные ранее инструкции удалятся. list(\link{OfferManualDTO}) [optional]
#' @field vendor Название бренда или производителя. Должно быть записано так, как его пишет сам бренд. character [optional]
#' @field barcodes Указывайте в виде последовательности цифр. Подойдут коды EAN-13, EAN-8, UPC-A, UPC-E или Code 128.  Для книг указывайте ISBN.  Для товаров [определенных категорий и торговых марок](https://yastatic.net/s3/doc-binary/src/support/market/ru/yandex-market-list-for-gtin.xlsx) штрихкод должен быть действительным кодом GTIN. Обратите внимание: внутренние штрихкоды, начинающиеся на 2 или 02, и коды формата Code 128 не являются GTIN.  [Что такое GTIN](*gtin) list(character) [optional]
#' @field description Подробное описание товара: например, его преимущества и особенности.  Не давайте в описании инструкций по установке и сборке. Не используйте слова «скидка», «распродажа», «дешевый», «подарок» (кроме подарочных категорий), «бесплатно», «акция», «специальная цена», «новинка», «new», «аналог», «заказ», «хит». Не указывайте никакой контактной информации и не давайте ссылок.  Можно использовать теги:  * \\<h>, \\<h1>, \\<h2> и так далее — для заголовков; * \\<br> и \\<p> — для переноса строки; * \\<ol> — для нумерованного списка; * \\<ul> — для маркированного списка; * \\<li> — для создания элементов списка (должен находиться внутри \\<ol> или \\<ul>); * \\<div> — поддерживается, но не влияет на отображение текста.  Оптимальная длина — 400–600 символов, максимальная — 6000.  [Рекомендации и правила](https://yandex.ru/support/marketplace/assortment/fields/description.html) character [optional]
#' @field manufacturerCountries Страна, где был произведен товар.  Записывайте названия стран так, как они записаны в [списке](https://yastatic.net/s3/doc-binary/src/support/market/ru/countries.xlsx). list(character) [optional]
#' @field weightDimensions  \link{OfferWeightDimensionsDTO} [optional]
#' @field vendorCode Артикул товара от производителя. character [optional]
#' @field tags Метки товара, используемые магазином. Покупателям теги не видны. По тегам можно группировать и фильтровать разные товары в каталоге — например, товары одной серии, коллекции или линейки.  Максимальная длина тега 20 символов. У одного товара может быть максимум 10 тегов. Всего можно создать не больше 50 разных тегов. list(character) [optional]
#' @field shelfLife  \link{TimePeriodDTO} [optional]
#' @field lifeTime  \link{TimePeriodDTO} [optional]
#' @field guaranteePeriod  \link{TimePeriodDTO} [optional]
#' @field customsCommodityCode Код товара в единой Товарной номенклатуре внешнеэкономической деятельности (ТН ВЭД) — 10 или 14 цифр без пробелов.  Обязательно укажите, если он есть. character [optional]
#' @field certificates Номера документов на товар: сертификата, декларации соответствия и т. п.  Передавать можно только номера документов, сканы которого загружены в кабинете продавца по [инструкции](https://yandex.ru/support/marketplace/assortment/restrictions/certificates.html). list(character) [optional]
#' @field boxCount Количество грузовых мест.  Параметр используется, если товар представляет собой несколько коробок, упаковок и так далее. Например, кондиционер занимает два места — внешний и внутренний блоки в двух коробках.  Для товаров, занимающих одно место, не передавайте этот параметр. integer [optional]
#' @field condition  \link{OfferConditionDTO} [optional]
#' @field type  \link{OfferType} [optional]
#' @field downloadable Признак цифрового товара. Укажите `true`, если товар доставляется по электронной почте.  [Как работать с цифровыми товарами](../../step-by-step/digital.md) character [optional]
#' @field adult Параметр включает для товара пометку 18+. Устанавливайте ее только для товаров, которые относятся к удовлетворению сексуальных потребностей. character [optional]
#' @field age  \link{AgeDTO} [optional]
#' @field params {\% note warning \"\" \%}  Этот параметр устарел. При передаче характеристик используйте `parameterValues`.  {\% endnote \%}  Характеристики, которые есть только у товаров конкретной категории — например, диаметр колес велосипеда или материал подошвы обуви. list(\link{OfferParamDTO}) [optional]
#' @field basicPrice  \link{GetPriceWithDiscountDTO} [optional]
#' @field purchasePrice  \link{GetPriceDTO} [optional]
#' @field additionalExpenses  \link{GetPriceDTO} [optional]
#' @field cofinancePrice  \link{GetPriceDTO} [optional]
#' @field cardStatus  \link{OfferCardStatusType} [optional]
#' @field campaigns Список магазинов, в которых размещен товар. list(\link{OfferCampaignStatusDTO}) [optional]
#' @field sellingPrograms Информация о том, какие для товара доступны модели размещения. list(\link{OfferSellingProgramDTO}) [optional]
#' @field archived Товар помещен в архив. character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
GetOfferDTO <- R6::R6Class(
  "GetOfferDTO",
  public = list(
    `offerId` = NULL,
    `name` = NULL,
    `marketCategoryId` = NULL,
    `category` = NULL,
    `pictures` = NULL,
    `videos` = NULL,
    `manuals` = NULL,
    `vendor` = NULL,
    `barcodes` = NULL,
    `description` = NULL,
    `manufacturerCountries` = NULL,
    `weightDimensions` = NULL,
    `vendorCode` = NULL,
    `tags` = NULL,
    `shelfLife` = NULL,
    `lifeTime` = NULL,
    `guaranteePeriod` = NULL,
    `customsCommodityCode` = NULL,
    `certificates` = NULL,
    `boxCount` = NULL,
    `condition` = NULL,
    `type` = NULL,
    `downloadable` = NULL,
    `adult` = NULL,
    `age` = NULL,
    `params` = NULL,
    `basicPrice` = NULL,
    `purchasePrice` = NULL,
    `additionalExpenses` = NULL,
    `cofinancePrice` = NULL,
    `cardStatus` = NULL,
    `campaigns` = NULL,
    `sellingPrograms` = NULL,
    `archived` = NULL,
    #' Initialize a new GetOfferDTO class.
    #'
    #' @description
    #' Initialize a new GetOfferDTO class.
    #'
    #' @param offerId Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)
    #' @param name Составляйте название по схеме: тип + бренд или производитель + модель + особенности, если есть (например, цвет, размер или вес) и количество в упаковке.  Не включайте в название условия продажи (например, «скидка», «бесплатная доставка» и т. д.), эмоциональные характеристики («хит», «супер» и т. д.). Не пишите слова большими буквами — кроме устоявшихся названий брендов и моделей.  Оптимальная длина — 50–60 символов, максимальная — 256.  [Рекомендации и правила](https://yandex.ru/support/marketplace/assortment/fields/title.html)
    #' @param marketCategoryId Идентификатор категории на Маркете, к которой вы относите свой товар.  Если не указать `marketCategoryId`, то маркетная категория будет определена автоматически.  При изменении информации о товаре передавайте тот же идентификатор категории. Если вы укажете другой, категория товара не поменяется. Изменить ее можно только в кабинете продавца на Маркете.  Список категорий Маркета можно получить с помощью запроса  [POST categories/tree](../../reference/categories/getCategoriesTree.md).
    #' @param category Категория товара в вашем магазине. Значение будет использовано для определения категории товара на Маркете в случае, если вы не передали категорию в параметре `marketCategoryId`.  Указывайте конкретные категории — например, набор ножей лучше отнести к категории **Столовые приборы**, а не просто **Посуда**.  Выбирайте категории, которые описывают товар, а не абстрактный признак — например, **Духи**, а не **Подарки**.  Значение будет использовано для определения категории товара на Маркете в случае, если вы не передали категорию в параметре `marketCategoryId`.
    #' @param pictures Ссылки на изображения товара. Изображение по первой ссылке считается основным, остальные дополнительными.  **Требования к ссылкам**  * Ссылок может быть до 30. * Указывайте ссылку целиком, включая протокол http или https. * Максимальная длина — 512 символов. * Русские буквы в URL можно. * Можно использовать прямые ссылки на изображения и на Яндекс Диск. Ссылки на Яндекс Диске нужно копировать с помощью функции **Поделиться**. Относительные ссылки и ссылки на другие облачные хранилища — не работают.  ✅ `https://example-shop.ru/images/sku12345.jpg`  ✅ `https://yadi.sk/i/NaBoRsimVOLov`  ❌ `/images/sku12345.jpg`  ❌ `https://www.dropbox.com/s/818f/tovar.jpg`  Ссылки на изображение должны быть постоянными. Нельзя использовать динамические ссылки, меняющиеся от выгрузки к выгрузке.  Если нужно заменить изображение, выложите новое изображение по новой ссылке, а ссылку на старое удалите. Если просто заменить изображение по старой ссылке, оно не обновится.  [Требования к изображениям](https://yandex.ru/support/marketplace/assortment/fields/images.html)
    #' @param videos Ссылка (URL) на видео товара.  Максимальное количество ссылок — 6.  **Требования к ссылке**  * Указывайте ссылку целиком, включая протокол http или https. * Максимальная длина — 512 символов. * Русские буквы в URL можно. * Можно использовать прямые ссылки на видео и на Яндекс Диск. Ссылки на Яндекс Диске нужно копировать с помощью функции **Поделиться**. Относительные ссылки и ссылки на другие облачные хранилища — не работают.  ✅ `https://example-shop.ru/video/sku12345.avi`  ✅ `https://yadi.sk/i/NaBoRsimVOLov`  ❌ `/video/sku12345.avi`  ❌ `https://www.dropbox.com/s/818f/super-tovar.avi`  Ссылки на видео должны быть постоянными. Нельзя использовать динамические ссылки, меняющиеся от выгрузки к выгрузке.  Если нужно заменить видео, выложите новое видео по новой ссылке, а ссылку на старое удалите. Если просто заменить видео по старой ссылке, оно не обновится.  [Требования к видео](https://yandex.ru/support/marketplace/assortment/fields/video.html)
    #' @param manuals Список инструкций по использованию товара.  Максимальное количество инструкций — 6.  Если вы передадите пустое поле `manuals`, загруженные ранее инструкции удалятся.
    #' @param vendor Название бренда или производителя. Должно быть записано так, как его пишет сам бренд.
    #' @param barcodes Указывайте в виде последовательности цифр. Подойдут коды EAN-13, EAN-8, UPC-A, UPC-E или Code 128.  Для книг указывайте ISBN.  Для товаров [определенных категорий и торговых марок](https://yastatic.net/s3/doc-binary/src/support/market/ru/yandex-market-list-for-gtin.xlsx) штрихкод должен быть действительным кодом GTIN. Обратите внимание: внутренние штрихкоды, начинающиеся на 2 или 02, и коды формата Code 128 не являются GTIN.  [Что такое GTIN](*gtin)
    #' @param description Подробное описание товара: например, его преимущества и особенности.  Не давайте в описании инструкций по установке и сборке. Не используйте слова «скидка», «распродажа», «дешевый», «подарок» (кроме подарочных категорий), «бесплатно», «акция», «специальная цена», «новинка», «new», «аналог», «заказ», «хит». Не указывайте никакой контактной информации и не давайте ссылок.  Можно использовать теги:  * \\<h>, \\<h1>, \\<h2> и так далее — для заголовков; * \\<br> и \\<p> — для переноса строки; * \\<ol> — для нумерованного списка; * \\<ul> — для маркированного списка; * \\<li> — для создания элементов списка (должен находиться внутри \\<ol> или \\<ul>); * \\<div> — поддерживается, но не влияет на отображение текста.  Оптимальная длина — 400–600 символов, максимальная — 6000.  [Рекомендации и правила](https://yandex.ru/support/marketplace/assortment/fields/description.html)
    #' @param manufacturerCountries Страна, где был произведен товар.  Записывайте названия стран так, как они записаны в [списке](https://yastatic.net/s3/doc-binary/src/support/market/ru/countries.xlsx).
    #' @param weightDimensions weightDimensions
    #' @param vendorCode Артикул товара от производителя.
    #' @param tags Метки товара, используемые магазином. Покупателям теги не видны. По тегам можно группировать и фильтровать разные товары в каталоге — например, товары одной серии, коллекции или линейки.  Максимальная длина тега 20 символов. У одного товара может быть максимум 10 тегов. Всего можно создать не больше 50 разных тегов.
    #' @param shelfLife shelfLife
    #' @param lifeTime lifeTime
    #' @param guaranteePeriod guaranteePeriod
    #' @param customsCommodityCode Код товара в единой Товарной номенклатуре внешнеэкономической деятельности (ТН ВЭД) — 10 или 14 цифр без пробелов.  Обязательно укажите, если он есть.
    #' @param certificates Номера документов на товар: сертификата, декларации соответствия и т. п.  Передавать можно только номера документов, сканы которого загружены в кабинете продавца по [инструкции](https://yandex.ru/support/marketplace/assortment/restrictions/certificates.html).
    #' @param boxCount Количество грузовых мест.  Параметр используется, если товар представляет собой несколько коробок, упаковок и так далее. Например, кондиционер занимает два места — внешний и внутренний блоки в двух коробках.  Для товаров, занимающих одно место, не передавайте этот параметр.
    #' @param condition condition
    #' @param type type
    #' @param downloadable Признак цифрового товара. Укажите `true`, если товар доставляется по электронной почте.  [Как работать с цифровыми товарами](../../step-by-step/digital.md)
    #' @param adult Параметр включает для товара пометку 18+. Устанавливайте ее только для товаров, которые относятся к удовлетворению сексуальных потребностей.
    #' @param age age
    #' @param params {\% note warning \"\" \%}  Этот параметр устарел. При передаче характеристик используйте `parameterValues`.  {\% endnote \%}  Характеристики, которые есть только у товаров конкретной категории — например, диаметр колес велосипеда или материал подошвы обуви.
    #' @param basicPrice basicPrice
    #' @param purchasePrice purchasePrice
    #' @param additionalExpenses additionalExpenses
    #' @param cofinancePrice cofinancePrice
    #' @param cardStatus cardStatus
    #' @param campaigns Список магазинов, в которых размещен товар.
    #' @param sellingPrograms Информация о том, какие для товара доступны модели размещения.
    #' @param archived Товар помещен в архив.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`offerId`, `name` = NULL, `marketCategoryId` = NULL, `category` = NULL, `pictures` = NULL, `videos` = NULL, `manuals` = NULL, `vendor` = NULL, `barcodes` = NULL, `description` = NULL, `manufacturerCountries` = NULL, `weightDimensions` = NULL, `vendorCode` = NULL, `tags` = NULL, `shelfLife` = NULL, `lifeTime` = NULL, `guaranteePeriod` = NULL, `customsCommodityCode` = NULL, `certificates` = NULL, `boxCount` = NULL, `condition` = NULL, `type` = NULL, `downloadable` = NULL, `adult` = NULL, `age` = NULL, `params` = NULL, `basicPrice` = NULL, `purchasePrice` = NULL, `additionalExpenses` = NULL, `cofinancePrice` = NULL, `cardStatus` = NULL, `campaigns` = NULL, `sellingPrograms` = NULL, `archived` = NULL, ...) {
      if (!missing(`offerId`)) {
        if (!(is.character(`offerId`) && length(`offerId`) == 1)) {
          stop(paste("Error! Invalid data for `offerId`. Must be a string:", `offerId`))
        }
        self$`offerId` <- `offerId`
      }
      if (!is.null(`name`)) {
        if (!(is.character(`name`) && length(`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", `name`))
        }
        self$`name` <- `name`
      }
      if (!is.null(`marketCategoryId`)) {
        if (!(is.numeric(`marketCategoryId`) && length(`marketCategoryId`) == 1)) {
          stop(paste("Error! Invalid data for `marketCategoryId`. Must be an integer:", `marketCategoryId`))
        }
        self$`marketCategoryId` <- `marketCategoryId`
      }
      if (!is.null(`category`)) {
        if (!(is.character(`category`) && length(`category`) == 1)) {
          stop(paste("Error! Invalid data for `category`. Must be a string:", `category`))
        }
        self$`category` <- `category`
      }
      if (!is.null(`pictures`)) {
        stopifnot(is.vector(`pictures`), length(`pictures`) != 0)
        sapply(`pictures`, function(x) stopifnot(is.character(x)))
        self$`pictures` <- `pictures`
      }
      if (!is.null(`videos`)) {
        stopifnot(is.vector(`videos`), length(`videos`) != 0)
        sapply(`videos`, function(x) stopifnot(is.character(x)))
        self$`videos` <- `videos`
      }
      if (!is.null(`manuals`)) {
        stopifnot(is.vector(`manuals`), length(`manuals`) != 0)
        sapply(`manuals`, function(x) stopifnot(R6::is.R6(x)))
        self$`manuals` <- `manuals`
      }
      if (!is.null(`vendor`)) {
        if (!(is.character(`vendor`) && length(`vendor`) == 1)) {
          stop(paste("Error! Invalid data for `vendor`. Must be a string:", `vendor`))
        }
        self$`vendor` <- `vendor`
      }
      if (!is.null(`barcodes`)) {
        stopifnot(is.vector(`barcodes`), length(`barcodes`) != 0)
        sapply(`barcodes`, function(x) stopifnot(is.character(x)))
        self$`barcodes` <- `barcodes`
      }
      if (!is.null(`description`)) {
        if (!(is.character(`description`) && length(`description`) == 1)) {
          stop(paste("Error! Invalid data for `description`. Must be a string:", `description`))
        }
        self$`description` <- `description`
      }
      if (!is.null(`manufacturerCountries`)) {
        stopifnot(is.vector(`manufacturerCountries`), length(`manufacturerCountries`) != 0)
        sapply(`manufacturerCountries`, function(x) stopifnot(is.character(x)))
        self$`manufacturerCountries` <- `manufacturerCountries`
      }
      if (!is.null(`weightDimensions`)) {
        stopifnot(R6::is.R6(`weightDimensions`))
        self$`weightDimensions` <- `weightDimensions`
      }
      if (!is.null(`vendorCode`)) {
        if (!(is.character(`vendorCode`) && length(`vendorCode`) == 1)) {
          stop(paste("Error! Invalid data for `vendorCode`. Must be a string:", `vendorCode`))
        }
        self$`vendorCode` <- `vendorCode`
      }
      if (!is.null(`tags`)) {
        stopifnot(is.vector(`tags`), length(`tags`) != 0)
        sapply(`tags`, function(x) stopifnot(is.character(x)))
        self$`tags` <- `tags`
      }
      if (!is.null(`shelfLife`)) {
        stopifnot(R6::is.R6(`shelfLife`))
        self$`shelfLife` <- `shelfLife`
      }
      if (!is.null(`lifeTime`)) {
        stopifnot(R6::is.R6(`lifeTime`))
        self$`lifeTime` <- `lifeTime`
      }
      if (!is.null(`guaranteePeriod`)) {
        stopifnot(R6::is.R6(`guaranteePeriod`))
        self$`guaranteePeriod` <- `guaranteePeriod`
      }
      if (!is.null(`customsCommodityCode`)) {
        if (!(is.character(`customsCommodityCode`) && length(`customsCommodityCode`) == 1)) {
          stop(paste("Error! Invalid data for `customsCommodityCode`. Must be a string:", `customsCommodityCode`))
        }
        self$`customsCommodityCode` <- `customsCommodityCode`
      }
      if (!is.null(`certificates`)) {
        stopifnot(is.vector(`certificates`), length(`certificates`) != 0)
        sapply(`certificates`, function(x) stopifnot(is.character(x)))
        self$`certificates` <- `certificates`
      }
      if (!is.null(`boxCount`)) {
        if (!(is.numeric(`boxCount`) && length(`boxCount`) == 1)) {
          stop(paste("Error! Invalid data for `boxCount`. Must be an integer:", `boxCount`))
        }
        self$`boxCount` <- `boxCount`
      }
      if (!is.null(`condition`)) {
        stopifnot(R6::is.R6(`condition`))
        self$`condition` <- `condition`
      }
      if (!is.null(`type`)) {
        if (!(`type` %in% c())) {
          stop(paste("Error! \"", `type`, "\" cannot be assigned to `type`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`type`))
        self$`type` <- `type`
      }
      if (!is.null(`downloadable`)) {
        if (!(is.logical(`downloadable`) && length(`downloadable`) == 1)) {
          stop(paste("Error! Invalid data for `downloadable`. Must be a boolean:", `downloadable`))
        }
        self$`downloadable` <- `downloadable`
      }
      if (!is.null(`adult`)) {
        if (!(is.logical(`adult`) && length(`adult`) == 1)) {
          stop(paste("Error! Invalid data for `adult`. Must be a boolean:", `adult`))
        }
        self$`adult` <- `adult`
      }
      if (!is.null(`age`)) {
        stopifnot(R6::is.R6(`age`))
        self$`age` <- `age`
      }
      if (!is.null(`params`)) {
        stopifnot(is.vector(`params`), length(`params`) != 0)
        sapply(`params`, function(x) stopifnot(R6::is.R6(x)))
        self$`params` <- `params`
      }
      if (!is.null(`basicPrice`)) {
        stopifnot(R6::is.R6(`basicPrice`))
        self$`basicPrice` <- `basicPrice`
      }
      if (!is.null(`purchasePrice`)) {
        stopifnot(R6::is.R6(`purchasePrice`))
        self$`purchasePrice` <- `purchasePrice`
      }
      if (!is.null(`additionalExpenses`)) {
        stopifnot(R6::is.R6(`additionalExpenses`))
        self$`additionalExpenses` <- `additionalExpenses`
      }
      if (!is.null(`cofinancePrice`)) {
        stopifnot(R6::is.R6(`cofinancePrice`))
        self$`cofinancePrice` <- `cofinancePrice`
      }
      if (!is.null(`cardStatus`)) {
        if (!(`cardStatus` %in% c())) {
          stop(paste("Error! \"", `cardStatus`, "\" cannot be assigned to `cardStatus`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`cardStatus`))
        self$`cardStatus` <- `cardStatus`
      }
      if (!is.null(`campaigns`)) {
        stopifnot(is.vector(`campaigns`), length(`campaigns`) != 0)
        sapply(`campaigns`, function(x) stopifnot(R6::is.R6(x)))
        self$`campaigns` <- `campaigns`
      }
      if (!is.null(`sellingPrograms`)) {
        stopifnot(is.vector(`sellingPrograms`), length(`sellingPrograms`) != 0)
        sapply(`sellingPrograms`, function(x) stopifnot(R6::is.R6(x)))
        self$`sellingPrograms` <- `sellingPrograms`
      }
      if (!is.null(`archived`)) {
        if (!(is.logical(`archived`) && length(`archived`) == 1)) {
          stop(paste("Error! Invalid data for `archived`. Must be a boolean:", `archived`))
        }
        self$`archived` <- `archived`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return GetOfferDTO in JSON format
    #' @export
    toJSON = function() {
      GetOfferDTOObject <- list()
      if (!is.null(self$`offerId`)) {
        GetOfferDTOObject[["offerId"]] <-
          self$`offerId`
      }
      if (!is.null(self$`name`)) {
        GetOfferDTOObject[["name"]] <-
          self$`name`
      }
      if (!is.null(self$`marketCategoryId`)) {
        GetOfferDTOObject[["marketCategoryId"]] <-
          self$`marketCategoryId`
      }
      if (!is.null(self$`category`)) {
        GetOfferDTOObject[["category"]] <-
          self$`category`
      }
      if (!is.null(self$`pictures`)) {
        GetOfferDTOObject[["pictures"]] <-
          self$`pictures`
      }
      if (!is.null(self$`videos`)) {
        GetOfferDTOObject[["videos"]] <-
          self$`videos`
      }
      if (!is.null(self$`manuals`)) {
        GetOfferDTOObject[["manuals"]] <-
          lapply(self$`manuals`, function(x) x$toJSON())
      }
      if (!is.null(self$`vendor`)) {
        GetOfferDTOObject[["vendor"]] <-
          self$`vendor`
      }
      if (!is.null(self$`barcodes`)) {
        GetOfferDTOObject[["barcodes"]] <-
          self$`barcodes`
      }
      if (!is.null(self$`description`)) {
        GetOfferDTOObject[["description"]] <-
          self$`description`
      }
      if (!is.null(self$`manufacturerCountries`)) {
        GetOfferDTOObject[["manufacturerCountries"]] <-
          self$`manufacturerCountries`
      }
      if (!is.null(self$`weightDimensions`)) {
        GetOfferDTOObject[["weightDimensions"]] <-
          self$`weightDimensions`$toJSON()
      }
      if (!is.null(self$`vendorCode`)) {
        GetOfferDTOObject[["vendorCode"]] <-
          self$`vendorCode`
      }
      if (!is.null(self$`tags`)) {
        GetOfferDTOObject[["tags"]] <-
          self$`tags`
      }
      if (!is.null(self$`shelfLife`)) {
        GetOfferDTOObject[["shelfLife"]] <-
          self$`shelfLife`$toJSON()
      }
      if (!is.null(self$`lifeTime`)) {
        GetOfferDTOObject[["lifeTime"]] <-
          self$`lifeTime`$toJSON()
      }
      if (!is.null(self$`guaranteePeriod`)) {
        GetOfferDTOObject[["guaranteePeriod"]] <-
          self$`guaranteePeriod`$toJSON()
      }
      if (!is.null(self$`customsCommodityCode`)) {
        GetOfferDTOObject[["customsCommodityCode"]] <-
          self$`customsCommodityCode`
      }
      if (!is.null(self$`certificates`)) {
        GetOfferDTOObject[["certificates"]] <-
          self$`certificates`
      }
      if (!is.null(self$`boxCount`)) {
        GetOfferDTOObject[["boxCount"]] <-
          self$`boxCount`
      }
      if (!is.null(self$`condition`)) {
        GetOfferDTOObject[["condition"]] <-
          self$`condition`$toJSON()
      }
      if (!is.null(self$`type`)) {
        GetOfferDTOObject[["type"]] <-
          self$`type`$toJSON()
      }
      if (!is.null(self$`downloadable`)) {
        GetOfferDTOObject[["downloadable"]] <-
          self$`downloadable`
      }
      if (!is.null(self$`adult`)) {
        GetOfferDTOObject[["adult"]] <-
          self$`adult`
      }
      if (!is.null(self$`age`)) {
        GetOfferDTOObject[["age"]] <-
          self$`age`$toJSON()
      }
      if (!is.null(self$`params`)) {
        GetOfferDTOObject[["params"]] <-
          lapply(self$`params`, function(x) x$toJSON())
      }
      if (!is.null(self$`basicPrice`)) {
        GetOfferDTOObject[["basicPrice"]] <-
          self$`basicPrice`$toJSON()
      }
      if (!is.null(self$`purchasePrice`)) {
        GetOfferDTOObject[["purchasePrice"]] <-
          self$`purchasePrice`$toJSON()
      }
      if (!is.null(self$`additionalExpenses`)) {
        GetOfferDTOObject[["additionalExpenses"]] <-
          self$`additionalExpenses`$toJSON()
      }
      if (!is.null(self$`cofinancePrice`)) {
        GetOfferDTOObject[["cofinancePrice"]] <-
          self$`cofinancePrice`$toJSON()
      }
      if (!is.null(self$`cardStatus`)) {
        GetOfferDTOObject[["cardStatus"]] <-
          self$`cardStatus`$toJSON()
      }
      if (!is.null(self$`campaigns`)) {
        GetOfferDTOObject[["campaigns"]] <-
          lapply(self$`campaigns`, function(x) x$toJSON())
      }
      if (!is.null(self$`sellingPrograms`)) {
        GetOfferDTOObject[["sellingPrograms"]] <-
          lapply(self$`sellingPrograms`, function(x) x$toJSON())
      }
      if (!is.null(self$`archived`)) {
        GetOfferDTOObject[["archived"]] <-
          self$`archived`
      }
      GetOfferDTOObject
    },
    #' Deserialize JSON string into an instance of GetOfferDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of GetOfferDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of GetOfferDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`offerId`)) {
        self$`offerId` <- this_object$`offerId`
      }
      if (!is.null(this_object$`name`)) {
        self$`name` <- this_object$`name`
      }
      if (!is.null(this_object$`marketCategoryId`)) {
        self$`marketCategoryId` <- this_object$`marketCategoryId`
      }
      if (!is.null(this_object$`category`)) {
        self$`category` <- this_object$`category`
      }
      if (!is.null(this_object$`pictures`)) {
        self$`pictures` <- ApiClient$new()$deserializeObj(this_object$`pictures`, "array[character]", loadNamespace("ympa_r_client"))
      }
      if (!is.null(this_object$`videos`)) {
        self$`videos` <- ApiClient$new()$deserializeObj(this_object$`videos`, "array[character]", loadNamespace("ympa_r_client"))
      }
      if (!is.null(this_object$`manuals`)) {
        self$`manuals` <- ApiClient$new()$deserializeObj(this_object$`manuals`, "array[OfferManualDTO]", loadNamespace("ympa_r_client"))
      }
      if (!is.null(this_object$`vendor`)) {
        self$`vendor` <- this_object$`vendor`
      }
      if (!is.null(this_object$`barcodes`)) {
        self$`barcodes` <- ApiClient$new()$deserializeObj(this_object$`barcodes`, "array[character]", loadNamespace("ympa_r_client"))
      }
      if (!is.null(this_object$`description`)) {
        self$`description` <- this_object$`description`
      }
      if (!is.null(this_object$`manufacturerCountries`)) {
        self$`manufacturerCountries` <- ApiClient$new()$deserializeObj(this_object$`manufacturerCountries`, "array[character]", loadNamespace("ympa_r_client"))
      }
      if (!is.null(this_object$`weightDimensions`)) {
        `weightdimensions_object` <- OfferWeightDimensionsDTO$new()
        `weightdimensions_object`$fromJSON(jsonlite::toJSON(this_object$`weightDimensions`, auto_unbox = TRUE, digits = NA))
        self$`weightDimensions` <- `weightdimensions_object`
      }
      if (!is.null(this_object$`vendorCode`)) {
        self$`vendorCode` <- this_object$`vendorCode`
      }
      if (!is.null(this_object$`tags`)) {
        self$`tags` <- ApiClient$new()$deserializeObj(this_object$`tags`, "array[character]", loadNamespace("ympa_r_client"))
      }
      if (!is.null(this_object$`shelfLife`)) {
        `shelflife_object` <- TimePeriodDTO$new()
        `shelflife_object`$fromJSON(jsonlite::toJSON(this_object$`shelfLife`, auto_unbox = TRUE, digits = NA))
        self$`shelfLife` <- `shelflife_object`
      }
      if (!is.null(this_object$`lifeTime`)) {
        `lifetime_object` <- TimePeriodDTO$new()
        `lifetime_object`$fromJSON(jsonlite::toJSON(this_object$`lifeTime`, auto_unbox = TRUE, digits = NA))
        self$`lifeTime` <- `lifetime_object`
      }
      if (!is.null(this_object$`guaranteePeriod`)) {
        `guaranteeperiod_object` <- TimePeriodDTO$new()
        `guaranteeperiod_object`$fromJSON(jsonlite::toJSON(this_object$`guaranteePeriod`, auto_unbox = TRUE, digits = NA))
        self$`guaranteePeriod` <- `guaranteeperiod_object`
      }
      if (!is.null(this_object$`customsCommodityCode`)) {
        self$`customsCommodityCode` <- this_object$`customsCommodityCode`
      }
      if (!is.null(this_object$`certificates`)) {
        self$`certificates` <- ApiClient$new()$deserializeObj(this_object$`certificates`, "array[character]", loadNamespace("ympa_r_client"))
      }
      if (!is.null(this_object$`boxCount`)) {
        self$`boxCount` <- this_object$`boxCount`
      }
      if (!is.null(this_object$`condition`)) {
        `condition_object` <- OfferConditionDTO$new()
        `condition_object`$fromJSON(jsonlite::toJSON(this_object$`condition`, auto_unbox = TRUE, digits = NA))
        self$`condition` <- `condition_object`
      }
      if (!is.null(this_object$`type`)) {
        `type_object` <- OfferType$new()
        `type_object`$fromJSON(jsonlite::toJSON(this_object$`type`, auto_unbox = TRUE, digits = NA))
        self$`type` <- `type_object`
      }
      if (!is.null(this_object$`downloadable`)) {
        self$`downloadable` <- this_object$`downloadable`
      }
      if (!is.null(this_object$`adult`)) {
        self$`adult` <- this_object$`adult`
      }
      if (!is.null(this_object$`age`)) {
        `age_object` <- AgeDTO$new()
        `age_object`$fromJSON(jsonlite::toJSON(this_object$`age`, auto_unbox = TRUE, digits = NA))
        self$`age` <- `age_object`
      }
      if (!is.null(this_object$`params`)) {
        self$`params` <- ApiClient$new()$deserializeObj(this_object$`params`, "array[OfferParamDTO]", loadNamespace("ympa_r_client"))
      }
      if (!is.null(this_object$`basicPrice`)) {
        `basicprice_object` <- GetPriceWithDiscountDTO$new()
        `basicprice_object`$fromJSON(jsonlite::toJSON(this_object$`basicPrice`, auto_unbox = TRUE, digits = NA))
        self$`basicPrice` <- `basicprice_object`
      }
      if (!is.null(this_object$`purchasePrice`)) {
        `purchaseprice_object` <- GetPriceDTO$new()
        `purchaseprice_object`$fromJSON(jsonlite::toJSON(this_object$`purchasePrice`, auto_unbox = TRUE, digits = NA))
        self$`purchasePrice` <- `purchaseprice_object`
      }
      if (!is.null(this_object$`additionalExpenses`)) {
        `additionalexpenses_object` <- GetPriceDTO$new()
        `additionalexpenses_object`$fromJSON(jsonlite::toJSON(this_object$`additionalExpenses`, auto_unbox = TRUE, digits = NA))
        self$`additionalExpenses` <- `additionalexpenses_object`
      }
      if (!is.null(this_object$`cofinancePrice`)) {
        `cofinanceprice_object` <- GetPriceDTO$new()
        `cofinanceprice_object`$fromJSON(jsonlite::toJSON(this_object$`cofinancePrice`, auto_unbox = TRUE, digits = NA))
        self$`cofinancePrice` <- `cofinanceprice_object`
      }
      if (!is.null(this_object$`cardStatus`)) {
        `cardstatus_object` <- OfferCardStatusType$new()
        `cardstatus_object`$fromJSON(jsonlite::toJSON(this_object$`cardStatus`, auto_unbox = TRUE, digits = NA))
        self$`cardStatus` <- `cardstatus_object`
      }
      if (!is.null(this_object$`campaigns`)) {
        self$`campaigns` <- ApiClient$new()$deserializeObj(this_object$`campaigns`, "array[OfferCampaignStatusDTO]", loadNamespace("ympa_r_client"))
      }
      if (!is.null(this_object$`sellingPrograms`)) {
        self$`sellingPrograms` <- ApiClient$new()$deserializeObj(this_object$`sellingPrograms`, "array[OfferSellingProgramDTO]", loadNamespace("ympa_r_client"))
      }
      if (!is.null(this_object$`archived`)) {
        self$`archived` <- this_object$`archived`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return GetOfferDTO in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`offerId`)) {
          sprintf(
          '"offerId":
            "%s"
                    ',
          self$`offerId`
          )
        },
        if (!is.null(self$`name`)) {
          sprintf(
          '"name":
            "%s"
                    ',
          self$`name`
          )
        },
        if (!is.null(self$`marketCategoryId`)) {
          sprintf(
          '"marketCategoryId":
            %d
                    ',
          self$`marketCategoryId`
          )
        },
        if (!is.null(self$`category`)) {
          sprintf(
          '"category":
            "%s"
                    ',
          self$`category`
          )
        },
        if (!is.null(self$`pictures`)) {
          sprintf(
          '"pictures":
             [%s]
          ',
          paste(unlist(lapply(self$`pictures`, function(x) paste0('"', x, '"'))), collapse = ",")
          )
        },
        if (!is.null(self$`videos`)) {
          sprintf(
          '"videos":
             [%s]
          ',
          paste(unlist(lapply(self$`videos`, function(x) paste0('"', x, '"'))), collapse = ",")
          )
        },
        if (!is.null(self$`manuals`)) {
          sprintf(
          '"manuals":
          [%s]
',
          paste(sapply(self$`manuals`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        },
        if (!is.null(self$`vendor`)) {
          sprintf(
          '"vendor":
            "%s"
                    ',
          self$`vendor`
          )
        },
        if (!is.null(self$`barcodes`)) {
          sprintf(
          '"barcodes":
             [%s]
          ',
          paste(unlist(lapply(self$`barcodes`, function(x) paste0('"', x, '"'))), collapse = ",")
          )
        },
        if (!is.null(self$`description`)) {
          sprintf(
          '"description":
            "%s"
                    ',
          self$`description`
          )
        },
        if (!is.null(self$`manufacturerCountries`)) {
          sprintf(
          '"manufacturerCountries":
             [%s]
          ',
          paste(unlist(lapply(self$`manufacturerCountries`, function(x) paste0('"', x, '"'))), collapse = ",")
          )
        },
        if (!is.null(self$`weightDimensions`)) {
          sprintf(
          '"weightDimensions":
          %s
          ',
          jsonlite::toJSON(self$`weightDimensions`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`vendorCode`)) {
          sprintf(
          '"vendorCode":
            "%s"
                    ',
          self$`vendorCode`
          )
        },
        if (!is.null(self$`tags`)) {
          sprintf(
          '"tags":
             [%s]
          ',
          paste(unlist(lapply(self$`tags`, function(x) paste0('"', x, '"'))), collapse = ",")
          )
        },
        if (!is.null(self$`shelfLife`)) {
          sprintf(
          '"shelfLife":
          %s
          ',
          jsonlite::toJSON(self$`shelfLife`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`lifeTime`)) {
          sprintf(
          '"lifeTime":
          %s
          ',
          jsonlite::toJSON(self$`lifeTime`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`guaranteePeriod`)) {
          sprintf(
          '"guaranteePeriod":
          %s
          ',
          jsonlite::toJSON(self$`guaranteePeriod`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`customsCommodityCode`)) {
          sprintf(
          '"customsCommodityCode":
            "%s"
                    ',
          self$`customsCommodityCode`
          )
        },
        if (!is.null(self$`certificates`)) {
          sprintf(
          '"certificates":
             [%s]
          ',
          paste(unlist(lapply(self$`certificates`, function(x) paste0('"', x, '"'))), collapse = ",")
          )
        },
        if (!is.null(self$`boxCount`)) {
          sprintf(
          '"boxCount":
            %d
                    ',
          self$`boxCount`
          )
        },
        if (!is.null(self$`condition`)) {
          sprintf(
          '"condition":
          %s
          ',
          jsonlite::toJSON(self$`condition`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`type`)) {
          sprintf(
          '"type":
          %s
          ',
          jsonlite::toJSON(self$`type`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`downloadable`)) {
          sprintf(
          '"downloadable":
            %s
                    ',
          tolower(self$`downloadable`)
          )
        },
        if (!is.null(self$`adult`)) {
          sprintf(
          '"adult":
            %s
                    ',
          tolower(self$`adult`)
          )
        },
        if (!is.null(self$`age`)) {
          sprintf(
          '"age":
          %s
          ',
          jsonlite::toJSON(self$`age`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`params`)) {
          sprintf(
          '"params":
          [%s]
',
          paste(sapply(self$`params`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        },
        if (!is.null(self$`basicPrice`)) {
          sprintf(
          '"basicPrice":
          %s
          ',
          jsonlite::toJSON(self$`basicPrice`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`purchasePrice`)) {
          sprintf(
          '"purchasePrice":
          %s
          ',
          jsonlite::toJSON(self$`purchasePrice`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`additionalExpenses`)) {
          sprintf(
          '"additionalExpenses":
          %s
          ',
          jsonlite::toJSON(self$`additionalExpenses`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`cofinancePrice`)) {
          sprintf(
          '"cofinancePrice":
          %s
          ',
          jsonlite::toJSON(self$`cofinancePrice`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`cardStatus`)) {
          sprintf(
          '"cardStatus":
          %s
          ',
          jsonlite::toJSON(self$`cardStatus`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`campaigns`)) {
          sprintf(
          '"campaigns":
          [%s]
',
          paste(sapply(self$`campaigns`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        },
        if (!is.null(self$`sellingPrograms`)) {
          sprintf(
          '"sellingPrograms":
          [%s]
',
          paste(sapply(self$`sellingPrograms`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        },
        if (!is.null(self$`archived`)) {
          sprintf(
          '"archived":
            %s
                    ',
          tolower(self$`archived`)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of GetOfferDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of GetOfferDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of GetOfferDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`offerId` <- this_object$`offerId`
      self$`name` <- this_object$`name`
      self$`marketCategoryId` <- this_object$`marketCategoryId`
      self$`category` <- this_object$`category`
      self$`pictures` <- ApiClient$new()$deserializeObj(this_object$`pictures`, "array[character]", loadNamespace("ympa_r_client"))
      self$`videos` <- ApiClient$new()$deserializeObj(this_object$`videos`, "array[character]", loadNamespace("ympa_r_client"))
      self$`manuals` <- ApiClient$new()$deserializeObj(this_object$`manuals`, "array[OfferManualDTO]", loadNamespace("ympa_r_client"))
      self$`vendor` <- this_object$`vendor`
      self$`barcodes` <- ApiClient$new()$deserializeObj(this_object$`barcodes`, "array[character]", loadNamespace("ympa_r_client"))
      self$`description` <- this_object$`description`
      self$`manufacturerCountries` <- ApiClient$new()$deserializeObj(this_object$`manufacturerCountries`, "array[character]", loadNamespace("ympa_r_client"))
      self$`weightDimensions` <- OfferWeightDimensionsDTO$new()$fromJSON(jsonlite::toJSON(this_object$`weightDimensions`, auto_unbox = TRUE, digits = NA))
      self$`vendorCode` <- this_object$`vendorCode`
      self$`tags` <- ApiClient$new()$deserializeObj(this_object$`tags`, "array[character]", loadNamespace("ympa_r_client"))
      self$`shelfLife` <- TimePeriodDTO$new()$fromJSON(jsonlite::toJSON(this_object$`shelfLife`, auto_unbox = TRUE, digits = NA))
      self$`lifeTime` <- TimePeriodDTO$new()$fromJSON(jsonlite::toJSON(this_object$`lifeTime`, auto_unbox = TRUE, digits = NA))
      self$`guaranteePeriod` <- TimePeriodDTO$new()$fromJSON(jsonlite::toJSON(this_object$`guaranteePeriod`, auto_unbox = TRUE, digits = NA))
      self$`customsCommodityCode` <- this_object$`customsCommodityCode`
      self$`certificates` <- ApiClient$new()$deserializeObj(this_object$`certificates`, "array[character]", loadNamespace("ympa_r_client"))
      self$`boxCount` <- this_object$`boxCount`
      self$`condition` <- OfferConditionDTO$new()$fromJSON(jsonlite::toJSON(this_object$`condition`, auto_unbox = TRUE, digits = NA))
      self$`type` <- OfferType$new()$fromJSON(jsonlite::toJSON(this_object$`type`, auto_unbox = TRUE, digits = NA))
      self$`downloadable` <- this_object$`downloadable`
      self$`adult` <- this_object$`adult`
      self$`age` <- AgeDTO$new()$fromJSON(jsonlite::toJSON(this_object$`age`, auto_unbox = TRUE, digits = NA))
      self$`params` <- ApiClient$new()$deserializeObj(this_object$`params`, "array[OfferParamDTO]", loadNamespace("ympa_r_client"))
      self$`basicPrice` <- GetPriceWithDiscountDTO$new()$fromJSON(jsonlite::toJSON(this_object$`basicPrice`, auto_unbox = TRUE, digits = NA))
      self$`purchasePrice` <- GetPriceDTO$new()$fromJSON(jsonlite::toJSON(this_object$`purchasePrice`, auto_unbox = TRUE, digits = NA))
      self$`additionalExpenses` <- GetPriceDTO$new()$fromJSON(jsonlite::toJSON(this_object$`additionalExpenses`, auto_unbox = TRUE, digits = NA))
      self$`cofinancePrice` <- GetPriceDTO$new()$fromJSON(jsonlite::toJSON(this_object$`cofinancePrice`, auto_unbox = TRUE, digits = NA))
      self$`cardStatus` <- OfferCardStatusType$new()$fromJSON(jsonlite::toJSON(this_object$`cardStatus`, auto_unbox = TRUE, digits = NA))
      self$`campaigns` <- ApiClient$new()$deserializeObj(this_object$`campaigns`, "array[OfferCampaignStatusDTO]", loadNamespace("ympa_r_client"))
      self$`sellingPrograms` <- ApiClient$new()$deserializeObj(this_object$`sellingPrograms`, "array[OfferSellingProgramDTO]", loadNamespace("ympa_r_client"))
      self$`archived` <- this_object$`archived`
      self
    },
    #' Validate JSON input with respect to GetOfferDTO
    #'
    #' @description
    #' Validate JSON input with respect to GetOfferDTO and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `offerId`
      if (!is.null(input_json$`offerId`)) {
        if (!(is.character(input_json$`offerId`) && length(input_json$`offerId`) == 1)) {
          stop(paste("Error! Invalid data for `offerId`. Must be a string:", input_json$`offerId`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for GetOfferDTO: the required field `offerId` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of GetOfferDTO
    #' @export
    toString = function() {
      self$toJSONString()
    },
    #' Return true if the values in all fields are valid.
    #'
    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    #' @export
    isValid = function() {
      # check if the required `offerId` is null
      if (is.null(self$`offerId`)) {
        return(FALSE)
      }

      if (nchar(self$`offerId`) > 255) {
        return(FALSE)
      }
      if (nchar(self$`offerId`) < 1) {
        return(FALSE)
      }
      if (!str_detect(self$`offerId`, "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")) {
        return(FALSE)
      }

      if (nchar(self$`name`) > 256) {
        return(FALSE)
      }

      if (length(self$`videos`) > 6) {
        return(FALSE)
      }

      if (length(self$`manuals`) > 6) {
        return(FALSE)
      }

      if (nchar(self$`description`) > 6000) {
        return(FALSE)
      }

      TRUE
    },
    #' Return a list of invalid fields (if any).
    #'
    #' @description
    #' Return a list of invalid fields (if any).
    #'
    #' @return A list of invalid fields (if any).
    #' @export
    getInvalidFields = function() {
      invalid_fields <- list()
      # check if the required `offerId` is null
      if (is.null(self$`offerId`)) {
        invalid_fields["offerId"] <- "Non-nullable required field `offerId` cannot be null."
      }

      if (nchar(self$`offerId`) > 255) {
        invalid_fields["offerId"] <- "Invalid length for `offerId`, must be smaller than or equal to 255."
      }
      if (nchar(self$`offerId`) < 1) {
        invalid_fields["offerId"] <- "Invalid length for `offerId`, must be bigger than or equal to 1."
      }
      if (!str_detect(self$`offerId`, "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")) {
        invalid_fields["offerId"] <- "Invalid value for `offerId`, must conform to the pattern ^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$."
      }

      if (nchar(self$`name`) > 256) {
        invalid_fields["name"] <- "Invalid length for `name`, must be smaller than or equal to 256."
      }

      if (length(self$`videos`) > 6) {
        invalid_fields["videos"] <- "Invalid length for `videos`, number of items must be less than or equal to 6."
      }

      if (length(self$`manuals`) > 6) {
        invalid_fields["manuals"] <- "Invalid length for `manuals`, number of items must be less than or equal to 6."
      }

      if (nchar(self$`description`) > 6000) {
        invalid_fields["description"] <- "Invalid length for `description`, must be smaller than or equal to 6000."
      }

      invalid_fields
    },
    #' Print the object
    #'
    #' @description
    #' Print the object
    #'
    #' @export
    print = function() {
      print(jsonlite::prettify(self$toJSONString()))
      invisible(self)
    }
  ),
  # Lock the class to prevent modifications to the method or field
  lock_class = TRUE
)
## Uncomment below to unlock the class to allow modifications of the method or field
# GetOfferDTO$unlock()
#
## Below is an example to define the print function
# GetOfferDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# GetOfferDTO$lock()

