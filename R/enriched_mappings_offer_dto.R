#' Create a new EnrichedMappingsOfferDTO
#'
#' @description
#' Информация о рекомендованных карточках товаров.
#'
#' @docType class
#' @title EnrichedMappingsOfferDTO
#' @description EnrichedMappingsOfferDTO Class
#' @format An \code{R6Class} generator object
#' @field name Составляйте название по схеме: тип + бренд или производитель + модель + особенности, если есть (например, цвет, размер или вес) и количество в упаковке.  Не включайте в название условия продажи (например, «скидка», «бесплатная доставка» и т. д.), эмоциональные характеристики («хит», «супер» и т. д.). Не пишите слова большими буквами — кроме устоявшихся названий брендов и моделей.  Оптимальная длина — 50–60 символов, максимальная — 256.  [Рекомендации и правила](https://yandex.ru/support/marketplace/assortment/fields/title.html) character [optional]
#' @field shopSku Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) character [optional]
#' @field category Категория товара в вашем магазине. Значение будет использовано для определения категории товара на Маркете в случае, если вы не передали категорию в параметре `marketCategoryId`.  Указывайте конкретные категории — например, набор ножей лучше отнести к категории **Столовые приборы**, а не просто **Посуда**.  Выбирайте категории, которые описывают товар, а не абстрактный признак — например, **Духи**, а не **Подарки**.  Значение будет использовано для определения категории товара на Маркете в случае, если вы не передали категорию в параметре `marketCategoryId`. character [optional]
#' @field vendor Название бренда или производителя. Должно быть записано так, как его пишет сам бренд. character [optional]
#' @field vendorCode Артикул товара от производителя. character [optional]
#' @field description Подробное описание товара: например, его преимущества и особенности.  Не давайте в описании инструкций по установке и сборке. Не используйте слова «скидка», «распродажа», «дешевый», «подарок» (кроме подарочных категорий), «бесплатно», «акция», «специальная цена», «новинка», «new», «аналог», «заказ», «хит». Не указывайте никакой контактной информации и не давайте ссылок.  Можно использовать теги:  * \\<h>, \\<h1>, \\<h2> и так далее — для заголовков; * \\<br> и \\<p> — для переноса строки; * \\<ol> — для нумерованного списка; * \\<ul> — для маркированного списка; * \\<li> — для создания элементов списка (должен находиться внутри \\<ol> или \\<ul>); * \\<div> — поддерживается, но не влияет на отображение текста.  Оптимальная длина — 400–600 символов, максимальная — 6000.  [Рекомендации и правила](https://yandex.ru/support/marketplace/assortment/fields/description.html) character [optional]
#' @field id Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) character [optional]
#' @field feedId Идентификатор фида. integer [optional]
#' @field barcodes Указывайте в виде последовательности цифр. Подойдут коды EAN-13, EAN-8, UPC-A, UPC-E или Code 128.  Для книг указывайте ISBN.  Для товаров [определенных категорий и торговых марок](https://yastatic.net/s3/doc-binary/src/support/market/ru/yandex-market-list-for-gtin.xlsx) штрихкод должен быть действительным кодом GTIN. Обратите внимание: внутренние штрихкоды, начинающиеся на 2 или 02, и коды формата Code 128 не являются GTIN.  [Что такое GTIN](*gtin) list(character) [optional]
#' @field urls URL фотографии товара или страницы с описанием на вашем сайте.  Переданные данные не будут отображаться на витрине, но они помогут специалистам Маркета найти карточку для вашего товара.  Должен содержать один вложенный параметр url. list(character) [optional]
#' @field pictures Ссылки (URL) изображений товара в хорошем качестве.  Можно указать до 30 ссылок. При этом изображение по первой ссылке будет основным. Оно используется в качестве изображения товара в поиске Маркета и на карточке товара. Другие изображения товара доступны в режиме просмотра увеличенных изображений.  Обязательный параметр.  Должен содержать хотя бы один вложенный параметр `picture`. list(character) [optional]
#' @field manufacturer Изготовитель товара: компания, которая произвела товар, ее адрес и регистрационный номер (если есть).  Необязательный параметр. character [optional]
#' @field manufacturerCountries Список стран, в которых произведен товар.  Обязательный параметр.  Должен содержать хотя бы одну, но не больше 5 стран. list(character) [optional]
#' @field minShipment Минимальное количество единиц товара, которое вы поставляете на склад.  Например, если вы поставляете детское питание партиями минимум по 10 коробок, а в каждой коробке по 6 баночек, укажите значение 60. integer [optional]
#' @field transportUnitSize Количество единиц товара в одной упаковке, которую вы поставляете на склад.  Например, если вы поставляете детское питание коробками по 6 баночек, укажите значение 6. integer [optional]
#' @field quantumOfSupply Добавочная партия: по сколько единиц товара можно добавлять к минимальному количеству minShipment.  Например, если вы поставляете детское питание партиями минимум по 10 коробок и хотите добавлять к минимальной партии по 2 коробки, а в каждой коробке по 6 баночек, укажите значение 12. integer [optional]
#' @field deliveryDurationDays Срок, за который продавец поставляет товары на склад, в днях. integer [optional]
#' @field boxCount Сколько мест (если больше одного) занимает товар.  Параметр указывается, только если товар занимает больше одного места (например, кондиционер занимает два места: внешний и внутренний блоки в двух коробках). Если товар занимает одно место, не указывайте этот параметр. integer [optional]
#' @field customsCommodityCodes Список кодов товара в единой Товарной номенклатуре внешнеэкономической деятельности (ТН ВЭД).  Обязательный параметр, если товар подлежит особому учету (например, в системе «Меркурий» как продукция животного происхождения или в системе «Честный ЗНАК»).  Может содержать только один вложенный код ТН ВЭД. list(character) [optional]
#' @field weightDimensions  \link{OfferWeightDimensionsDTO} [optional]
#' @field supplyScheduleDays Дни недели, в которые продавец поставляет товары на склад. list(\link{DayOfWeekType}) [optional]
#' @field shelfLifeDays {\% note warning \"\" \%}  Этот параметр устарел. Вместо него используйте `shelfLife`. Совместное использование обоих параметров приведет к ошибке.  {\% endnote \%}  Срок годности: через сколько дней товар станет непригоден для использования. integer [optional]
#' @field lifeTimeDays {\% note warning \"\" \%}  Этот параметр устарел. Вместо него используйте `lifeTime`. Совместное использование обоих параметров приведет к ошибке.  {\% endnote \%}  Срок службы: сколько дней товар будет исправно выполнять свою функцию, а изготовитель — нести ответственность за его существенные недостатки. integer [optional]
#' @field guaranteePeriodDays Гарантийный срок товара: сколько дней возможно обслуживание и ремонт товара или возврат денег, а изготовитель или продавец будет нести ответственность за недостатки товара. integer [optional]
#' @field processingState  \link{OfferProcessingStateDTO} [optional]
#' @field availability  \link{OfferAvailabilityStatusType} [optional]
#' @field shelfLife  \link{TimePeriodDTO} [optional]
#' @field lifeTime  \link{TimePeriodDTO} [optional]
#' @field guaranteePeriod  \link{TimePeriodDTO} [optional]
#' @field certificate Номер документа на товар.  Перед указанием номера документ нужно загрузить в кабинете продавца на Маркете. [Инструкция](https://yandex.ru/support/marketplace/assortment/restrictions/certificates.html) character [optional]
#' @field price Цена на товар в рублях. numeric [optional]
#' @field marketCategoryId Идентификатор категории для рекомендованной карточки товара на Маркете.  Возвращается только вместе с параметром ##marketSku##. integer [optional]
#' @field marketCategoryName Название категории для рекомендованной карточки товара на Маркете.  Может отсутствовать в ответе. character [optional]
#' @field marketModelId Идентификатор модели для рекомендованной карточки товара на Маркете.  Может отсутствовать в ответе. integer [optional]
#' @field marketModelName Название модели для рекомендованной карточки товара на Маркете.  Возвращается только вместе с параметром ##marketSku##. character [optional]
#' @field marketSku SKU на Маркете. integer [optional]
#' @field marketSkuName Название товара с рекомендованной карточки на Маркете.  Может отсутствовать в ответе. character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
EnrichedMappingsOfferDTO <- R6::R6Class(
  "EnrichedMappingsOfferDTO",
  public = list(
    `name` = NULL,
    `shopSku` = NULL,
    `category` = NULL,
    `vendor` = NULL,
    `vendorCode` = NULL,
    `description` = NULL,
    `id` = NULL,
    `feedId` = NULL,
    `barcodes` = NULL,
    `urls` = NULL,
    `pictures` = NULL,
    `manufacturer` = NULL,
    `manufacturerCountries` = NULL,
    `minShipment` = NULL,
    `transportUnitSize` = NULL,
    `quantumOfSupply` = NULL,
    `deliveryDurationDays` = NULL,
    `boxCount` = NULL,
    `customsCommodityCodes` = NULL,
    `weightDimensions` = NULL,
    `supplyScheduleDays` = NULL,
    `shelfLifeDays` = NULL,
    `lifeTimeDays` = NULL,
    `guaranteePeriodDays` = NULL,
    `processingState` = NULL,
    `availability` = NULL,
    `shelfLife` = NULL,
    `lifeTime` = NULL,
    `guaranteePeriod` = NULL,
    `certificate` = NULL,
    `price` = NULL,
    `marketCategoryId` = NULL,
    `marketCategoryName` = NULL,
    `marketModelId` = NULL,
    `marketModelName` = NULL,
    `marketSku` = NULL,
    `marketSkuName` = NULL,
    #' Initialize a new EnrichedMappingsOfferDTO class.
    #'
    #' @description
    #' Initialize a new EnrichedMappingsOfferDTO class.
    #'
    #' @param name Составляйте название по схеме: тип + бренд или производитель + модель + особенности, если есть (например, цвет, размер или вес) и количество в упаковке.  Не включайте в название условия продажи (например, «скидка», «бесплатная доставка» и т. д.), эмоциональные характеристики («хит», «супер» и т. д.). Не пишите слова большими буквами — кроме устоявшихся названий брендов и моделей.  Оптимальная длина — 50–60 символов, максимальная — 256.  [Рекомендации и правила](https://yandex.ru/support/marketplace/assortment/fields/title.html)
    #' @param shopSku Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)
    #' @param category Категория товара в вашем магазине. Значение будет использовано для определения категории товара на Маркете в случае, если вы не передали категорию в параметре `marketCategoryId`.  Указывайте конкретные категории — например, набор ножей лучше отнести к категории **Столовые приборы**, а не просто **Посуда**.  Выбирайте категории, которые описывают товар, а не абстрактный признак — например, **Духи**, а не **Подарки**.  Значение будет использовано для определения категории товара на Маркете в случае, если вы не передали категорию в параметре `marketCategoryId`.
    #' @param vendor Название бренда или производителя. Должно быть записано так, как его пишет сам бренд.
    #' @param vendorCode Артикул товара от производителя.
    #' @param description Подробное описание товара: например, его преимущества и особенности.  Не давайте в описании инструкций по установке и сборке. Не используйте слова «скидка», «распродажа», «дешевый», «подарок» (кроме подарочных категорий), «бесплатно», «акция», «специальная цена», «новинка», «new», «аналог», «заказ», «хит». Не указывайте никакой контактной информации и не давайте ссылок.  Можно использовать теги:  * \\<h>, \\<h1>, \\<h2> и так далее — для заголовков; * \\<br> и \\<p> — для переноса строки; * \\<ol> — для нумерованного списка; * \\<ul> — для маркированного списка; * \\<li> — для создания элементов списка (должен находиться внутри \\<ol> или \\<ul>); * \\<div> — поддерживается, но не влияет на отображение текста.  Оптимальная длина — 400–600 символов, максимальная — 6000.  [Рекомендации и правила](https://yandex.ru/support/marketplace/assortment/fields/description.html)
    #' @param id Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)
    #' @param feedId Идентификатор фида.
    #' @param barcodes Указывайте в виде последовательности цифр. Подойдут коды EAN-13, EAN-8, UPC-A, UPC-E или Code 128.  Для книг указывайте ISBN.  Для товаров [определенных категорий и торговых марок](https://yastatic.net/s3/doc-binary/src/support/market/ru/yandex-market-list-for-gtin.xlsx) штрихкод должен быть действительным кодом GTIN. Обратите внимание: внутренние штрихкоды, начинающиеся на 2 или 02, и коды формата Code 128 не являются GTIN.  [Что такое GTIN](*gtin)
    #' @param urls URL фотографии товара или страницы с описанием на вашем сайте.  Переданные данные не будут отображаться на витрине, но они помогут специалистам Маркета найти карточку для вашего товара.  Должен содержать один вложенный параметр url.
    #' @param pictures Ссылки (URL) изображений товара в хорошем качестве.  Можно указать до 30 ссылок. При этом изображение по первой ссылке будет основным. Оно используется в качестве изображения товара в поиске Маркета и на карточке товара. Другие изображения товара доступны в режиме просмотра увеличенных изображений.  Обязательный параметр.  Должен содержать хотя бы один вложенный параметр `picture`.
    #' @param manufacturer Изготовитель товара: компания, которая произвела товар, ее адрес и регистрационный номер (если есть).  Необязательный параметр.
    #' @param manufacturerCountries Список стран, в которых произведен товар.  Обязательный параметр.  Должен содержать хотя бы одну, но не больше 5 стран.
    #' @param minShipment Минимальное количество единиц товара, которое вы поставляете на склад.  Например, если вы поставляете детское питание партиями минимум по 10 коробок, а в каждой коробке по 6 баночек, укажите значение 60.
    #' @param transportUnitSize Количество единиц товара в одной упаковке, которую вы поставляете на склад.  Например, если вы поставляете детское питание коробками по 6 баночек, укажите значение 6.
    #' @param quantumOfSupply Добавочная партия: по сколько единиц товара можно добавлять к минимальному количеству minShipment.  Например, если вы поставляете детское питание партиями минимум по 10 коробок и хотите добавлять к минимальной партии по 2 коробки, а в каждой коробке по 6 баночек, укажите значение 12.
    #' @param deliveryDurationDays Срок, за который продавец поставляет товары на склад, в днях.
    #' @param boxCount Сколько мест (если больше одного) занимает товар.  Параметр указывается, только если товар занимает больше одного места (например, кондиционер занимает два места: внешний и внутренний блоки в двух коробках). Если товар занимает одно место, не указывайте этот параметр.
    #' @param customsCommodityCodes Список кодов товара в единой Товарной номенклатуре внешнеэкономической деятельности (ТН ВЭД).  Обязательный параметр, если товар подлежит особому учету (например, в системе «Меркурий» как продукция животного происхождения или в системе «Честный ЗНАК»).  Может содержать только один вложенный код ТН ВЭД.
    #' @param weightDimensions weightDimensions
    #' @param supplyScheduleDays Дни недели, в которые продавец поставляет товары на склад.
    #' @param shelfLifeDays {\% note warning \"\" \%}  Этот параметр устарел. Вместо него используйте `shelfLife`. Совместное использование обоих параметров приведет к ошибке.  {\% endnote \%}  Срок годности: через сколько дней товар станет непригоден для использования.
    #' @param lifeTimeDays {\% note warning \"\" \%}  Этот параметр устарел. Вместо него используйте `lifeTime`. Совместное использование обоих параметров приведет к ошибке.  {\% endnote \%}  Срок службы: сколько дней товар будет исправно выполнять свою функцию, а изготовитель — нести ответственность за его существенные недостатки.
    #' @param guaranteePeriodDays Гарантийный срок товара: сколько дней возможно обслуживание и ремонт товара или возврат денег, а изготовитель или продавец будет нести ответственность за недостатки товара.
    #' @param processingState processingState
    #' @param availability availability
    #' @param shelfLife shelfLife
    #' @param lifeTime lifeTime
    #' @param guaranteePeriod guaranteePeriod
    #' @param certificate Номер документа на товар.  Перед указанием номера документ нужно загрузить в кабинете продавца на Маркете. [Инструкция](https://yandex.ru/support/marketplace/assortment/restrictions/certificates.html)
    #' @param price Цена на товар в рублях.
    #' @param marketCategoryId Идентификатор категории для рекомендованной карточки товара на Маркете.  Возвращается только вместе с параметром ##marketSku##.
    #' @param marketCategoryName Название категории для рекомендованной карточки товара на Маркете.  Может отсутствовать в ответе.
    #' @param marketModelId Идентификатор модели для рекомендованной карточки товара на Маркете.  Может отсутствовать в ответе.
    #' @param marketModelName Название модели для рекомендованной карточки товара на Маркете.  Возвращается только вместе с параметром ##marketSku##.
    #' @param marketSku SKU на Маркете.
    #' @param marketSkuName Название товара с рекомендованной карточки на Маркете.  Может отсутствовать в ответе.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`name` = NULL, `shopSku` = NULL, `category` = NULL, `vendor` = NULL, `vendorCode` = NULL, `description` = NULL, `id` = NULL, `feedId` = NULL, `barcodes` = NULL, `urls` = NULL, `pictures` = NULL, `manufacturer` = NULL, `manufacturerCountries` = NULL, `minShipment` = NULL, `transportUnitSize` = NULL, `quantumOfSupply` = NULL, `deliveryDurationDays` = NULL, `boxCount` = NULL, `customsCommodityCodes` = NULL, `weightDimensions` = NULL, `supplyScheduleDays` = NULL, `shelfLifeDays` = NULL, `lifeTimeDays` = NULL, `guaranteePeriodDays` = NULL, `processingState` = NULL, `availability` = NULL, `shelfLife` = NULL, `lifeTime` = NULL, `guaranteePeriod` = NULL, `certificate` = NULL, `price` = NULL, `marketCategoryId` = NULL, `marketCategoryName` = NULL, `marketModelId` = NULL, `marketModelName` = NULL, `marketSku` = NULL, `marketSkuName` = NULL, ...) {
      if (!is.null(`name`)) {
        if (!(is.character(`name`) && length(`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", `name`))
        }
        self$`name` <- `name`
      }
      if (!is.null(`shopSku`)) {
        if (!(is.character(`shopSku`) && length(`shopSku`) == 1)) {
          stop(paste("Error! Invalid data for `shopSku`. Must be a string:", `shopSku`))
        }
        self$`shopSku` <- `shopSku`
      }
      if (!is.null(`category`)) {
        if (!(is.character(`category`) && length(`category`) == 1)) {
          stop(paste("Error! Invalid data for `category`. Must be a string:", `category`))
        }
        self$`category` <- `category`
      }
      if (!is.null(`vendor`)) {
        if (!(is.character(`vendor`) && length(`vendor`) == 1)) {
          stop(paste("Error! Invalid data for `vendor`. Must be a string:", `vendor`))
        }
        self$`vendor` <- `vendor`
      }
      if (!is.null(`vendorCode`)) {
        if (!(is.character(`vendorCode`) && length(`vendorCode`) == 1)) {
          stop(paste("Error! Invalid data for `vendorCode`. Must be a string:", `vendorCode`))
        }
        self$`vendorCode` <- `vendorCode`
      }
      if (!is.null(`description`)) {
        if (!(is.character(`description`) && length(`description`) == 1)) {
          stop(paste("Error! Invalid data for `description`. Must be a string:", `description`))
        }
        self$`description` <- `description`
      }
      if (!is.null(`id`)) {
        if (!(is.character(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", `id`))
        }
        self$`id` <- `id`
      }
      if (!is.null(`feedId`)) {
        if (!(is.numeric(`feedId`) && length(`feedId`) == 1)) {
          stop(paste("Error! Invalid data for `feedId`. Must be an integer:", `feedId`))
        }
        self$`feedId` <- `feedId`
      }
      if (!is.null(`barcodes`)) {
        stopifnot(is.vector(`barcodes`), length(`barcodes`) != 0)
        sapply(`barcodes`, function(x) stopifnot(is.character(x)))
        self$`barcodes` <- `barcodes`
      }
      if (!is.null(`urls`)) {
        stopifnot(is.vector(`urls`), length(`urls`) != 0)
        sapply(`urls`, function(x) stopifnot(is.character(x)))
        self$`urls` <- `urls`
      }
      if (!is.null(`pictures`)) {
        stopifnot(is.vector(`pictures`), length(`pictures`) != 0)
        sapply(`pictures`, function(x) stopifnot(is.character(x)))
        self$`pictures` <- `pictures`
      }
      if (!is.null(`manufacturer`)) {
        if (!(is.character(`manufacturer`) && length(`manufacturer`) == 1)) {
          stop(paste("Error! Invalid data for `manufacturer`. Must be a string:", `manufacturer`))
        }
        self$`manufacturer` <- `manufacturer`
      }
      if (!is.null(`manufacturerCountries`)) {
        stopifnot(is.vector(`manufacturerCountries`), length(`manufacturerCountries`) != 0)
        sapply(`manufacturerCountries`, function(x) stopifnot(is.character(x)))
        self$`manufacturerCountries` <- `manufacturerCountries`
      }
      if (!is.null(`minShipment`)) {
        if (!(is.numeric(`minShipment`) && length(`minShipment`) == 1)) {
          stop(paste("Error! Invalid data for `minShipment`. Must be an integer:", `minShipment`))
        }
        self$`minShipment` <- `minShipment`
      }
      if (!is.null(`transportUnitSize`)) {
        if (!(is.numeric(`transportUnitSize`) && length(`transportUnitSize`) == 1)) {
          stop(paste("Error! Invalid data for `transportUnitSize`. Must be an integer:", `transportUnitSize`))
        }
        self$`transportUnitSize` <- `transportUnitSize`
      }
      if (!is.null(`quantumOfSupply`)) {
        if (!(is.numeric(`quantumOfSupply`) && length(`quantumOfSupply`) == 1)) {
          stop(paste("Error! Invalid data for `quantumOfSupply`. Must be an integer:", `quantumOfSupply`))
        }
        self$`quantumOfSupply` <- `quantumOfSupply`
      }
      if (!is.null(`deliveryDurationDays`)) {
        if (!(is.numeric(`deliveryDurationDays`) && length(`deliveryDurationDays`) == 1)) {
          stop(paste("Error! Invalid data for `deliveryDurationDays`. Must be an integer:", `deliveryDurationDays`))
        }
        self$`deliveryDurationDays` <- `deliveryDurationDays`
      }
      if (!is.null(`boxCount`)) {
        if (!(is.numeric(`boxCount`) && length(`boxCount`) == 1)) {
          stop(paste("Error! Invalid data for `boxCount`. Must be an integer:", `boxCount`))
        }
        self$`boxCount` <- `boxCount`
      }
      if (!is.null(`customsCommodityCodes`)) {
        stopifnot(is.vector(`customsCommodityCodes`), length(`customsCommodityCodes`) != 0)
        sapply(`customsCommodityCodes`, function(x) stopifnot(is.character(x)))
        self$`customsCommodityCodes` <- `customsCommodityCodes`
      }
      if (!is.null(`weightDimensions`)) {
        stopifnot(R6::is.R6(`weightDimensions`))
        self$`weightDimensions` <- `weightDimensions`
      }
      if (!is.null(`supplyScheduleDays`)) {
        stopifnot(is.vector(`supplyScheduleDays`), length(`supplyScheduleDays`) != 0)
        sapply(`supplyScheduleDays`, function(x) stopifnot(R6::is.R6(x)))
        self$`supplyScheduleDays` <- `supplyScheduleDays`
      }
      if (!is.null(`shelfLifeDays`)) {
        if (!(is.numeric(`shelfLifeDays`) && length(`shelfLifeDays`) == 1)) {
          stop(paste("Error! Invalid data for `shelfLifeDays`. Must be an integer:", `shelfLifeDays`))
        }
        self$`shelfLifeDays` <- `shelfLifeDays`
      }
      if (!is.null(`lifeTimeDays`)) {
        if (!(is.numeric(`lifeTimeDays`) && length(`lifeTimeDays`) == 1)) {
          stop(paste("Error! Invalid data for `lifeTimeDays`. Must be an integer:", `lifeTimeDays`))
        }
        self$`lifeTimeDays` <- `lifeTimeDays`
      }
      if (!is.null(`guaranteePeriodDays`)) {
        if (!(is.numeric(`guaranteePeriodDays`) && length(`guaranteePeriodDays`) == 1)) {
          stop(paste("Error! Invalid data for `guaranteePeriodDays`. Must be an integer:", `guaranteePeriodDays`))
        }
        self$`guaranteePeriodDays` <- `guaranteePeriodDays`
      }
      if (!is.null(`processingState`)) {
        stopifnot(R6::is.R6(`processingState`))
        self$`processingState` <- `processingState`
      }
      if (!is.null(`availability`)) {
        if (!(`availability` %in% c())) {
          stop(paste("Error! \"", `availability`, "\" cannot be assigned to `availability`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`availability`))
        self$`availability` <- `availability`
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
      if (!is.null(`certificate`)) {
        if (!(is.character(`certificate`) && length(`certificate`) == 1)) {
          stop(paste("Error! Invalid data for `certificate`. Must be a string:", `certificate`))
        }
        self$`certificate` <- `certificate`
      }
      if (!is.null(`price`)) {
        self$`price` <- `price`
      }
      if (!is.null(`marketCategoryId`)) {
        if (!(is.numeric(`marketCategoryId`) && length(`marketCategoryId`) == 1)) {
          stop(paste("Error! Invalid data for `marketCategoryId`. Must be an integer:", `marketCategoryId`))
        }
        self$`marketCategoryId` <- `marketCategoryId`
      }
      if (!is.null(`marketCategoryName`)) {
        if (!(is.character(`marketCategoryName`) && length(`marketCategoryName`) == 1)) {
          stop(paste("Error! Invalid data for `marketCategoryName`. Must be a string:", `marketCategoryName`))
        }
        self$`marketCategoryName` <- `marketCategoryName`
      }
      if (!is.null(`marketModelId`)) {
        if (!(is.numeric(`marketModelId`) && length(`marketModelId`) == 1)) {
          stop(paste("Error! Invalid data for `marketModelId`. Must be an integer:", `marketModelId`))
        }
        self$`marketModelId` <- `marketModelId`
      }
      if (!is.null(`marketModelName`)) {
        if (!(is.character(`marketModelName`) && length(`marketModelName`) == 1)) {
          stop(paste("Error! Invalid data for `marketModelName`. Must be a string:", `marketModelName`))
        }
        self$`marketModelName` <- `marketModelName`
      }
      if (!is.null(`marketSku`)) {
        if (!(is.numeric(`marketSku`) && length(`marketSku`) == 1)) {
          stop(paste("Error! Invalid data for `marketSku`. Must be an integer:", `marketSku`))
        }
        self$`marketSku` <- `marketSku`
      }
      if (!is.null(`marketSkuName`)) {
        if (!(is.character(`marketSkuName`) && length(`marketSkuName`) == 1)) {
          stop(paste("Error! Invalid data for `marketSkuName`. Must be a string:", `marketSkuName`))
        }
        self$`marketSkuName` <- `marketSkuName`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return EnrichedMappingsOfferDTO in JSON format
    #' @export
    toJSON = function() {
      EnrichedMappingsOfferDTOObject <- list()
      if (!is.null(self$`name`)) {
        EnrichedMappingsOfferDTOObject[["name"]] <-
          self$`name`
      }
      if (!is.null(self$`shopSku`)) {
        EnrichedMappingsOfferDTOObject[["shopSku"]] <-
          self$`shopSku`
      }
      if (!is.null(self$`category`)) {
        EnrichedMappingsOfferDTOObject[["category"]] <-
          self$`category`
      }
      if (!is.null(self$`vendor`)) {
        EnrichedMappingsOfferDTOObject[["vendor"]] <-
          self$`vendor`
      }
      if (!is.null(self$`vendorCode`)) {
        EnrichedMappingsOfferDTOObject[["vendorCode"]] <-
          self$`vendorCode`
      }
      if (!is.null(self$`description`)) {
        EnrichedMappingsOfferDTOObject[["description"]] <-
          self$`description`
      }
      if (!is.null(self$`id`)) {
        EnrichedMappingsOfferDTOObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`feedId`)) {
        EnrichedMappingsOfferDTOObject[["feedId"]] <-
          self$`feedId`
      }
      if (!is.null(self$`barcodes`)) {
        EnrichedMappingsOfferDTOObject[["barcodes"]] <-
          self$`barcodes`
      }
      if (!is.null(self$`urls`)) {
        EnrichedMappingsOfferDTOObject[["urls"]] <-
          self$`urls`
      }
      if (!is.null(self$`pictures`)) {
        EnrichedMappingsOfferDTOObject[["pictures"]] <-
          self$`pictures`
      }
      if (!is.null(self$`manufacturer`)) {
        EnrichedMappingsOfferDTOObject[["manufacturer"]] <-
          self$`manufacturer`
      }
      if (!is.null(self$`manufacturerCountries`)) {
        EnrichedMappingsOfferDTOObject[["manufacturerCountries"]] <-
          self$`manufacturerCountries`
      }
      if (!is.null(self$`minShipment`)) {
        EnrichedMappingsOfferDTOObject[["minShipment"]] <-
          self$`minShipment`
      }
      if (!is.null(self$`transportUnitSize`)) {
        EnrichedMappingsOfferDTOObject[["transportUnitSize"]] <-
          self$`transportUnitSize`
      }
      if (!is.null(self$`quantumOfSupply`)) {
        EnrichedMappingsOfferDTOObject[["quantumOfSupply"]] <-
          self$`quantumOfSupply`
      }
      if (!is.null(self$`deliveryDurationDays`)) {
        EnrichedMappingsOfferDTOObject[["deliveryDurationDays"]] <-
          self$`deliveryDurationDays`
      }
      if (!is.null(self$`boxCount`)) {
        EnrichedMappingsOfferDTOObject[["boxCount"]] <-
          self$`boxCount`
      }
      if (!is.null(self$`customsCommodityCodes`)) {
        EnrichedMappingsOfferDTOObject[["customsCommodityCodes"]] <-
          self$`customsCommodityCodes`
      }
      if (!is.null(self$`weightDimensions`)) {
        EnrichedMappingsOfferDTOObject[["weightDimensions"]] <-
          self$`weightDimensions`$toJSON()
      }
      if (!is.null(self$`supplyScheduleDays`)) {
        EnrichedMappingsOfferDTOObject[["supplyScheduleDays"]] <-
          lapply(self$`supplyScheduleDays`, function(x) x$toJSON())
      }
      if (!is.null(self$`shelfLifeDays`)) {
        EnrichedMappingsOfferDTOObject[["shelfLifeDays"]] <-
          self$`shelfLifeDays`
      }
      if (!is.null(self$`lifeTimeDays`)) {
        EnrichedMappingsOfferDTOObject[["lifeTimeDays"]] <-
          self$`lifeTimeDays`
      }
      if (!is.null(self$`guaranteePeriodDays`)) {
        EnrichedMappingsOfferDTOObject[["guaranteePeriodDays"]] <-
          self$`guaranteePeriodDays`
      }
      if (!is.null(self$`processingState`)) {
        EnrichedMappingsOfferDTOObject[["processingState"]] <-
          self$`processingState`$toJSON()
      }
      if (!is.null(self$`availability`)) {
        EnrichedMappingsOfferDTOObject[["availability"]] <-
          self$`availability`$toJSON()
      }
      if (!is.null(self$`shelfLife`)) {
        EnrichedMappingsOfferDTOObject[["shelfLife"]] <-
          self$`shelfLife`$toJSON()
      }
      if (!is.null(self$`lifeTime`)) {
        EnrichedMappingsOfferDTOObject[["lifeTime"]] <-
          self$`lifeTime`$toJSON()
      }
      if (!is.null(self$`guaranteePeriod`)) {
        EnrichedMappingsOfferDTOObject[["guaranteePeriod"]] <-
          self$`guaranteePeriod`$toJSON()
      }
      if (!is.null(self$`certificate`)) {
        EnrichedMappingsOfferDTOObject[["certificate"]] <-
          self$`certificate`
      }
      if (!is.null(self$`price`)) {
        EnrichedMappingsOfferDTOObject[["price"]] <-
          self$`price`
      }
      if (!is.null(self$`marketCategoryId`)) {
        EnrichedMappingsOfferDTOObject[["marketCategoryId"]] <-
          self$`marketCategoryId`
      }
      if (!is.null(self$`marketCategoryName`)) {
        EnrichedMappingsOfferDTOObject[["marketCategoryName"]] <-
          self$`marketCategoryName`
      }
      if (!is.null(self$`marketModelId`)) {
        EnrichedMappingsOfferDTOObject[["marketModelId"]] <-
          self$`marketModelId`
      }
      if (!is.null(self$`marketModelName`)) {
        EnrichedMappingsOfferDTOObject[["marketModelName"]] <-
          self$`marketModelName`
      }
      if (!is.null(self$`marketSku`)) {
        EnrichedMappingsOfferDTOObject[["marketSku"]] <-
          self$`marketSku`
      }
      if (!is.null(self$`marketSkuName`)) {
        EnrichedMappingsOfferDTOObject[["marketSkuName"]] <-
          self$`marketSkuName`
      }
      EnrichedMappingsOfferDTOObject
    },
    #' Deserialize JSON string into an instance of EnrichedMappingsOfferDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of EnrichedMappingsOfferDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of EnrichedMappingsOfferDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`name`)) {
        self$`name` <- this_object$`name`
      }
      if (!is.null(this_object$`shopSku`)) {
        self$`shopSku` <- this_object$`shopSku`
      }
      if (!is.null(this_object$`category`)) {
        self$`category` <- this_object$`category`
      }
      if (!is.null(this_object$`vendor`)) {
        self$`vendor` <- this_object$`vendor`
      }
      if (!is.null(this_object$`vendorCode`)) {
        self$`vendorCode` <- this_object$`vendorCode`
      }
      if (!is.null(this_object$`description`)) {
        self$`description` <- this_object$`description`
      }
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`feedId`)) {
        self$`feedId` <- this_object$`feedId`
      }
      if (!is.null(this_object$`barcodes`)) {
        self$`barcodes` <- ApiClient$new()$deserializeObj(this_object$`barcodes`, "array[character]", loadNamespace("ympa_r_client"))
      }
      if (!is.null(this_object$`urls`)) {
        self$`urls` <- ApiClient$new()$deserializeObj(this_object$`urls`, "array[character]", loadNamespace("ympa_r_client"))
      }
      if (!is.null(this_object$`pictures`)) {
        self$`pictures` <- ApiClient$new()$deserializeObj(this_object$`pictures`, "array[character]", loadNamespace("ympa_r_client"))
      }
      if (!is.null(this_object$`manufacturer`)) {
        self$`manufacturer` <- this_object$`manufacturer`
      }
      if (!is.null(this_object$`manufacturerCountries`)) {
        self$`manufacturerCountries` <- ApiClient$new()$deserializeObj(this_object$`manufacturerCountries`, "array[character]", loadNamespace("ympa_r_client"))
      }
      if (!is.null(this_object$`minShipment`)) {
        self$`minShipment` <- this_object$`minShipment`
      }
      if (!is.null(this_object$`transportUnitSize`)) {
        self$`transportUnitSize` <- this_object$`transportUnitSize`
      }
      if (!is.null(this_object$`quantumOfSupply`)) {
        self$`quantumOfSupply` <- this_object$`quantumOfSupply`
      }
      if (!is.null(this_object$`deliveryDurationDays`)) {
        self$`deliveryDurationDays` <- this_object$`deliveryDurationDays`
      }
      if (!is.null(this_object$`boxCount`)) {
        self$`boxCount` <- this_object$`boxCount`
      }
      if (!is.null(this_object$`customsCommodityCodes`)) {
        self$`customsCommodityCodes` <- ApiClient$new()$deserializeObj(this_object$`customsCommodityCodes`, "array[character]", loadNamespace("ympa_r_client"))
      }
      if (!is.null(this_object$`weightDimensions`)) {
        `weightdimensions_object` <- OfferWeightDimensionsDTO$new()
        `weightdimensions_object`$fromJSON(jsonlite::toJSON(this_object$`weightDimensions`, auto_unbox = TRUE, digits = NA))
        self$`weightDimensions` <- `weightdimensions_object`
      }
      if (!is.null(this_object$`supplyScheduleDays`)) {
        self$`supplyScheduleDays` <- ApiClient$new()$deserializeObj(this_object$`supplyScheduleDays`, "array[DayOfWeekType]", loadNamespace("ympa_r_client"))
      }
      if (!is.null(this_object$`shelfLifeDays`)) {
        self$`shelfLifeDays` <- this_object$`shelfLifeDays`
      }
      if (!is.null(this_object$`lifeTimeDays`)) {
        self$`lifeTimeDays` <- this_object$`lifeTimeDays`
      }
      if (!is.null(this_object$`guaranteePeriodDays`)) {
        self$`guaranteePeriodDays` <- this_object$`guaranteePeriodDays`
      }
      if (!is.null(this_object$`processingState`)) {
        `processingstate_object` <- OfferProcessingStateDTO$new()
        `processingstate_object`$fromJSON(jsonlite::toJSON(this_object$`processingState`, auto_unbox = TRUE, digits = NA))
        self$`processingState` <- `processingstate_object`
      }
      if (!is.null(this_object$`availability`)) {
        `availability_object` <- OfferAvailabilityStatusType$new()
        `availability_object`$fromJSON(jsonlite::toJSON(this_object$`availability`, auto_unbox = TRUE, digits = NA))
        self$`availability` <- `availability_object`
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
      if (!is.null(this_object$`certificate`)) {
        self$`certificate` <- this_object$`certificate`
      }
      if (!is.null(this_object$`price`)) {
        self$`price` <- this_object$`price`
      }
      if (!is.null(this_object$`marketCategoryId`)) {
        self$`marketCategoryId` <- this_object$`marketCategoryId`
      }
      if (!is.null(this_object$`marketCategoryName`)) {
        self$`marketCategoryName` <- this_object$`marketCategoryName`
      }
      if (!is.null(this_object$`marketModelId`)) {
        self$`marketModelId` <- this_object$`marketModelId`
      }
      if (!is.null(this_object$`marketModelName`)) {
        self$`marketModelName` <- this_object$`marketModelName`
      }
      if (!is.null(this_object$`marketSku`)) {
        self$`marketSku` <- this_object$`marketSku`
      }
      if (!is.null(this_object$`marketSkuName`)) {
        self$`marketSkuName` <- this_object$`marketSkuName`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return EnrichedMappingsOfferDTO in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`name`)) {
          sprintf(
          '"name":
            "%s"
                    ',
          self$`name`
          )
        },
        if (!is.null(self$`shopSku`)) {
          sprintf(
          '"shopSku":
            "%s"
                    ',
          self$`shopSku`
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
        if (!is.null(self$`vendor`)) {
          sprintf(
          '"vendor":
            "%s"
                    ',
          self$`vendor`
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
        if (!is.null(self$`description`)) {
          sprintf(
          '"description":
            "%s"
                    ',
          self$`description`
          )
        },
        if (!is.null(self$`id`)) {
          sprintf(
          '"id":
            "%s"
                    ',
          self$`id`
          )
        },
        if (!is.null(self$`feedId`)) {
          sprintf(
          '"feedId":
            %d
                    ',
          self$`feedId`
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
        if (!is.null(self$`urls`)) {
          sprintf(
          '"urls":
             [%s]
          ',
          paste(unlist(lapply(self$`urls`, function(x) paste0('"', x, '"'))), collapse = ",")
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
        if (!is.null(self$`manufacturer`)) {
          sprintf(
          '"manufacturer":
            "%s"
                    ',
          self$`manufacturer`
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
        if (!is.null(self$`minShipment`)) {
          sprintf(
          '"minShipment":
            %d
                    ',
          self$`minShipment`
          )
        },
        if (!is.null(self$`transportUnitSize`)) {
          sprintf(
          '"transportUnitSize":
            %d
                    ',
          self$`transportUnitSize`
          )
        },
        if (!is.null(self$`quantumOfSupply`)) {
          sprintf(
          '"quantumOfSupply":
            %d
                    ',
          self$`quantumOfSupply`
          )
        },
        if (!is.null(self$`deliveryDurationDays`)) {
          sprintf(
          '"deliveryDurationDays":
            %d
                    ',
          self$`deliveryDurationDays`
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
        if (!is.null(self$`customsCommodityCodes`)) {
          sprintf(
          '"customsCommodityCodes":
             [%s]
          ',
          paste(unlist(lapply(self$`customsCommodityCodes`, function(x) paste0('"', x, '"'))), collapse = ",")
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
        if (!is.null(self$`supplyScheduleDays`)) {
          sprintf(
          '"supplyScheduleDays":
          [%s]
',
          paste(sapply(self$`supplyScheduleDays`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        },
        if (!is.null(self$`shelfLifeDays`)) {
          sprintf(
          '"shelfLifeDays":
            %d
                    ',
          self$`shelfLifeDays`
          )
        },
        if (!is.null(self$`lifeTimeDays`)) {
          sprintf(
          '"lifeTimeDays":
            %d
                    ',
          self$`lifeTimeDays`
          )
        },
        if (!is.null(self$`guaranteePeriodDays`)) {
          sprintf(
          '"guaranteePeriodDays":
            %d
                    ',
          self$`guaranteePeriodDays`
          )
        },
        if (!is.null(self$`processingState`)) {
          sprintf(
          '"processingState":
          %s
          ',
          jsonlite::toJSON(self$`processingState`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`availability`)) {
          sprintf(
          '"availability":
          %s
          ',
          jsonlite::toJSON(self$`availability`$toJSON(), auto_unbox = TRUE, digits = NA)
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
        if (!is.null(self$`certificate`)) {
          sprintf(
          '"certificate":
            "%s"
                    ',
          self$`certificate`
          )
        },
        if (!is.null(self$`price`)) {
          sprintf(
          '"price":
            %d
                    ',
          self$`price`
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
        if (!is.null(self$`marketCategoryName`)) {
          sprintf(
          '"marketCategoryName":
            "%s"
                    ',
          self$`marketCategoryName`
          )
        },
        if (!is.null(self$`marketModelId`)) {
          sprintf(
          '"marketModelId":
            %d
                    ',
          self$`marketModelId`
          )
        },
        if (!is.null(self$`marketModelName`)) {
          sprintf(
          '"marketModelName":
            "%s"
                    ',
          self$`marketModelName`
          )
        },
        if (!is.null(self$`marketSku`)) {
          sprintf(
          '"marketSku":
            %d
                    ',
          self$`marketSku`
          )
        },
        if (!is.null(self$`marketSkuName`)) {
          sprintf(
          '"marketSkuName":
            "%s"
                    ',
          self$`marketSkuName`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of EnrichedMappingsOfferDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of EnrichedMappingsOfferDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of EnrichedMappingsOfferDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`name` <- this_object$`name`
      self$`shopSku` <- this_object$`shopSku`
      self$`category` <- this_object$`category`
      self$`vendor` <- this_object$`vendor`
      self$`vendorCode` <- this_object$`vendorCode`
      self$`description` <- this_object$`description`
      self$`id` <- this_object$`id`
      self$`feedId` <- this_object$`feedId`
      self$`barcodes` <- ApiClient$new()$deserializeObj(this_object$`barcodes`, "array[character]", loadNamespace("ympa_r_client"))
      self$`urls` <- ApiClient$new()$deserializeObj(this_object$`urls`, "array[character]", loadNamespace("ympa_r_client"))
      self$`pictures` <- ApiClient$new()$deserializeObj(this_object$`pictures`, "array[character]", loadNamespace("ympa_r_client"))
      self$`manufacturer` <- this_object$`manufacturer`
      self$`manufacturerCountries` <- ApiClient$new()$deserializeObj(this_object$`manufacturerCountries`, "array[character]", loadNamespace("ympa_r_client"))
      self$`minShipment` <- this_object$`minShipment`
      self$`transportUnitSize` <- this_object$`transportUnitSize`
      self$`quantumOfSupply` <- this_object$`quantumOfSupply`
      self$`deliveryDurationDays` <- this_object$`deliveryDurationDays`
      self$`boxCount` <- this_object$`boxCount`
      self$`customsCommodityCodes` <- ApiClient$new()$deserializeObj(this_object$`customsCommodityCodes`, "array[character]", loadNamespace("ympa_r_client"))
      self$`weightDimensions` <- OfferWeightDimensionsDTO$new()$fromJSON(jsonlite::toJSON(this_object$`weightDimensions`, auto_unbox = TRUE, digits = NA))
      self$`supplyScheduleDays` <- ApiClient$new()$deserializeObj(this_object$`supplyScheduleDays`, "array[DayOfWeekType]", loadNamespace("ympa_r_client"))
      self$`shelfLifeDays` <- this_object$`shelfLifeDays`
      self$`lifeTimeDays` <- this_object$`lifeTimeDays`
      self$`guaranteePeriodDays` <- this_object$`guaranteePeriodDays`
      self$`processingState` <- OfferProcessingStateDTO$new()$fromJSON(jsonlite::toJSON(this_object$`processingState`, auto_unbox = TRUE, digits = NA))
      self$`availability` <- OfferAvailabilityStatusType$new()$fromJSON(jsonlite::toJSON(this_object$`availability`, auto_unbox = TRUE, digits = NA))
      self$`shelfLife` <- TimePeriodDTO$new()$fromJSON(jsonlite::toJSON(this_object$`shelfLife`, auto_unbox = TRUE, digits = NA))
      self$`lifeTime` <- TimePeriodDTO$new()$fromJSON(jsonlite::toJSON(this_object$`lifeTime`, auto_unbox = TRUE, digits = NA))
      self$`guaranteePeriod` <- TimePeriodDTO$new()$fromJSON(jsonlite::toJSON(this_object$`guaranteePeriod`, auto_unbox = TRUE, digits = NA))
      self$`certificate` <- this_object$`certificate`
      self$`price` <- this_object$`price`
      self$`marketCategoryId` <- this_object$`marketCategoryId`
      self$`marketCategoryName` <- this_object$`marketCategoryName`
      self$`marketModelId` <- this_object$`marketModelId`
      self$`marketModelName` <- this_object$`marketModelName`
      self$`marketSku` <- this_object$`marketSku`
      self$`marketSkuName` <- this_object$`marketSkuName`
      self
    },
    #' Validate JSON input with respect to EnrichedMappingsOfferDTO
    #'
    #' @description
    #' Validate JSON input with respect to EnrichedMappingsOfferDTO and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of EnrichedMappingsOfferDTO
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
      if (nchar(self$`name`) > 256) {
        return(FALSE)
      }

      if (nchar(self$`shopSku`) > 255) {
        return(FALSE)
      }
      if (nchar(self$`shopSku`) < 1) {
        return(FALSE)
      }
      if (!str_detect(self$`shopSku`, "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")) {
        return(FALSE)
      }

      if (nchar(self$`description`) > 6000) {
        return(FALSE)
      }

      if (nchar(self$`id`) > 255) {
        return(FALSE)
      }
      if (nchar(self$`id`) < 1) {
        return(FALSE)
      }
      if (!str_detect(self$`id`, "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")) {
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
      if (nchar(self$`name`) > 256) {
        invalid_fields["name"] <- "Invalid length for `name`, must be smaller than or equal to 256."
      }

      if (nchar(self$`shopSku`) > 255) {
        invalid_fields["shopSku"] <- "Invalid length for `shopSku`, must be smaller than or equal to 255."
      }
      if (nchar(self$`shopSku`) < 1) {
        invalid_fields["shopSku"] <- "Invalid length for `shopSku`, must be bigger than or equal to 1."
      }
      if (!str_detect(self$`shopSku`, "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")) {
        invalid_fields["shopSku"] <- "Invalid value for `shopSku`, must conform to the pattern ^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$."
      }

      if (nchar(self$`description`) > 6000) {
        invalid_fields["description"] <- "Invalid length for `description`, must be smaller than or equal to 6000."
      }

      if (nchar(self$`id`) > 255) {
        invalid_fields["id"] <- "Invalid length for `id`, must be smaller than or equal to 255."
      }
      if (nchar(self$`id`) < 1) {
        invalid_fields["id"] <- "Invalid length for `id`, must be bigger than or equal to 1."
      }
      if (!str_detect(self$`id`, "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")) {
        invalid_fields["id"] <- "Invalid value for `id`, must conform to the pattern ^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$."
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
# EnrichedMappingsOfferDTO$unlock()
#
## Below is an example to define the print function
# EnrichedMappingsOfferDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# EnrichedMappingsOfferDTO$lock()

