#' Create a new SuggestedOfferDTO
#'
#' @description
#' Информация о товаре.
#'
#' @docType class
#' @title SuggestedOfferDTO
#' @description SuggestedOfferDTO Class
#' @format An \code{R6Class} generator object
#' @field offerId Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) character [optional]
#' @field name Составляйте название по схеме: тип + бренд или производитель + модель + особенности, если есть (например, цвет, размер или вес) и количество в упаковке.  Не включайте в название условия продажи (например, «скидка», «бесплатная доставка» и т. д.), эмоциональные характеристики («хит», «супер» и т. д.). Не пишите слова большими буквами — кроме устоявшихся названий брендов и моделей.  Оптимальная длина — 50–60 символов, максимальная — 256.  [Рекомендации и правила](https://yandex.ru/support/marketplace/assortment/fields/title.html) character [optional]
#' @field category Категория товара в вашем магазине. Значение будет использовано для определения категории товара на Маркете в случае, если вы не передали категорию в параметре `marketCategoryId`.  Указывайте конкретные категории — например, набор ножей лучше отнести к категории **Столовые приборы**, а не просто **Посуда**.  Выбирайте категории, которые описывают товар, а не абстрактный признак — например, **Духи**, а не **Подарки**.  Значение будет использовано для определения категории товара на Маркете в случае, если вы не передали категорию в параметре `marketCategoryId`. character [optional]
#' @field vendor Название бренда или производителя. Должно быть записано так, как его пишет сам бренд. character [optional]
#' @field barcodes Указывайте в виде последовательности цифр. Подойдут коды EAN-13, EAN-8, UPC-A, UPC-E или Code 128.  Для книг указывайте ISBN.  Для товаров [определенных категорий и торговых марок](https://yastatic.net/s3/doc-binary/src/support/market/ru/yandex-market-list-for-gtin.xlsx) штрихкод должен быть действительным кодом GTIN. Обратите внимание: внутренние штрихкоды, начинающиеся на 2 или 02, и коды формата Code 128 не являются GTIN.  [Что такое GTIN](*gtin) list(character) [optional]
#' @field description Подробное описание товара: например, его преимущества и особенности.  Не давайте в описании инструкций по установке и сборке. Не используйте слова «скидка», «распродажа», «дешевый», «подарок» (кроме подарочных категорий), «бесплатно», «акция», «специальная цена», «новинка», «new», «аналог», «заказ», «хит». Не указывайте никакой контактной информации и не давайте ссылок.  Можно использовать теги:  * \\<h>, \\<h1>, \\<h2> и так далее — для заголовков; * \\<br> и \\<p> — для переноса строки; * \\<ol> — для нумерованного списка; * \\<ul> — для маркированного списка; * \\<li> — для создания элементов списка (должен находиться внутри \\<ol> или \\<ul>); * \\<div> — поддерживается, но не влияет на отображение текста.  Оптимальная длина — 400–600 символов, максимальная — 6000.  [Рекомендации и правила](https://yandex.ru/support/marketplace/assortment/fields/description.html) character [optional]
#' @field vendorCode Артикул товара от производителя. character [optional]
#' @field basicPrice  \link{BasePriceDTO} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
SuggestedOfferDTO <- R6::R6Class(
  "SuggestedOfferDTO",
  public = list(
    `offerId` = NULL,
    `name` = NULL,
    `category` = NULL,
    `vendor` = NULL,
    `barcodes` = NULL,
    `description` = NULL,
    `vendorCode` = NULL,
    `basicPrice` = NULL,
    #' Initialize a new SuggestedOfferDTO class.
    #'
    #' @description
    #' Initialize a new SuggestedOfferDTO class.
    #'
    #' @param offerId Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)
    #' @param name Составляйте название по схеме: тип + бренд или производитель + модель + особенности, если есть (например, цвет, размер или вес) и количество в упаковке.  Не включайте в название условия продажи (например, «скидка», «бесплатная доставка» и т. д.), эмоциональные характеристики («хит», «супер» и т. д.). Не пишите слова большими буквами — кроме устоявшихся названий брендов и моделей.  Оптимальная длина — 50–60 символов, максимальная — 256.  [Рекомендации и правила](https://yandex.ru/support/marketplace/assortment/fields/title.html)
    #' @param category Категория товара в вашем магазине. Значение будет использовано для определения категории товара на Маркете в случае, если вы не передали категорию в параметре `marketCategoryId`.  Указывайте конкретные категории — например, набор ножей лучше отнести к категории **Столовые приборы**, а не просто **Посуда**.  Выбирайте категории, которые описывают товар, а не абстрактный признак — например, **Духи**, а не **Подарки**.  Значение будет использовано для определения категории товара на Маркете в случае, если вы не передали категорию в параметре `marketCategoryId`.
    #' @param vendor Название бренда или производителя. Должно быть записано так, как его пишет сам бренд.
    #' @param barcodes Указывайте в виде последовательности цифр. Подойдут коды EAN-13, EAN-8, UPC-A, UPC-E или Code 128.  Для книг указывайте ISBN.  Для товаров [определенных категорий и торговых марок](https://yastatic.net/s3/doc-binary/src/support/market/ru/yandex-market-list-for-gtin.xlsx) штрихкод должен быть действительным кодом GTIN. Обратите внимание: внутренние штрихкоды, начинающиеся на 2 или 02, и коды формата Code 128 не являются GTIN.  [Что такое GTIN](*gtin)
    #' @param description Подробное описание товара: например, его преимущества и особенности.  Не давайте в описании инструкций по установке и сборке. Не используйте слова «скидка», «распродажа», «дешевый», «подарок» (кроме подарочных категорий), «бесплатно», «акция», «специальная цена», «новинка», «new», «аналог», «заказ», «хит». Не указывайте никакой контактной информации и не давайте ссылок.  Можно использовать теги:  * \\<h>, \\<h1>, \\<h2> и так далее — для заголовков; * \\<br> и \\<p> — для переноса строки; * \\<ol> — для нумерованного списка; * \\<ul> — для маркированного списка; * \\<li> — для создания элементов списка (должен находиться внутри \\<ol> или \\<ul>); * \\<div> — поддерживается, но не влияет на отображение текста.  Оптимальная длина — 400–600 символов, максимальная — 6000.  [Рекомендации и правила](https://yandex.ru/support/marketplace/assortment/fields/description.html)
    #' @param vendorCode Артикул товара от производителя.
    #' @param basicPrice basicPrice
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`offerId` = NULL, `name` = NULL, `category` = NULL, `vendor` = NULL, `barcodes` = NULL, `description` = NULL, `vendorCode` = NULL, `basicPrice` = NULL, ...) {
      if (!is.null(`offerId`)) {
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
      if (!is.null(`vendorCode`)) {
        if (!(is.character(`vendorCode`) && length(`vendorCode`) == 1)) {
          stop(paste("Error! Invalid data for `vendorCode`. Must be a string:", `vendorCode`))
        }
        self$`vendorCode` <- `vendorCode`
      }
      if (!is.null(`basicPrice`)) {
        stopifnot(R6::is.R6(`basicPrice`))
        self$`basicPrice` <- `basicPrice`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return SuggestedOfferDTO in JSON format
    #' @export
    toJSON = function() {
      SuggestedOfferDTOObject <- list()
      if (!is.null(self$`offerId`)) {
        SuggestedOfferDTOObject[["offerId"]] <-
          self$`offerId`
      }
      if (!is.null(self$`name`)) {
        SuggestedOfferDTOObject[["name"]] <-
          self$`name`
      }
      if (!is.null(self$`category`)) {
        SuggestedOfferDTOObject[["category"]] <-
          self$`category`
      }
      if (!is.null(self$`vendor`)) {
        SuggestedOfferDTOObject[["vendor"]] <-
          self$`vendor`
      }
      if (!is.null(self$`barcodes`)) {
        SuggestedOfferDTOObject[["barcodes"]] <-
          self$`barcodes`
      }
      if (!is.null(self$`description`)) {
        SuggestedOfferDTOObject[["description"]] <-
          self$`description`
      }
      if (!is.null(self$`vendorCode`)) {
        SuggestedOfferDTOObject[["vendorCode"]] <-
          self$`vendorCode`
      }
      if (!is.null(self$`basicPrice`)) {
        SuggestedOfferDTOObject[["basicPrice"]] <-
          self$`basicPrice`$toJSON()
      }
      SuggestedOfferDTOObject
    },
    #' Deserialize JSON string into an instance of SuggestedOfferDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of SuggestedOfferDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of SuggestedOfferDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`offerId`)) {
        self$`offerId` <- this_object$`offerId`
      }
      if (!is.null(this_object$`name`)) {
        self$`name` <- this_object$`name`
      }
      if (!is.null(this_object$`category`)) {
        self$`category` <- this_object$`category`
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
      if (!is.null(this_object$`vendorCode`)) {
        self$`vendorCode` <- this_object$`vendorCode`
      }
      if (!is.null(this_object$`basicPrice`)) {
        `basicprice_object` <- BasePriceDTO$new()
        `basicprice_object`$fromJSON(jsonlite::toJSON(this_object$`basicPrice`, auto_unbox = TRUE, digits = NA))
        self$`basicPrice` <- `basicprice_object`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return SuggestedOfferDTO in JSON format
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
        if (!is.null(self$`vendorCode`)) {
          sprintf(
          '"vendorCode":
            "%s"
                    ',
          self$`vendorCode`
          )
        },
        if (!is.null(self$`basicPrice`)) {
          sprintf(
          '"basicPrice":
          %s
          ',
          jsonlite::toJSON(self$`basicPrice`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of SuggestedOfferDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of SuggestedOfferDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of SuggestedOfferDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`offerId` <- this_object$`offerId`
      self$`name` <- this_object$`name`
      self$`category` <- this_object$`category`
      self$`vendor` <- this_object$`vendor`
      self$`barcodes` <- ApiClient$new()$deserializeObj(this_object$`barcodes`, "array[character]", loadNamespace("ympa_r_client"))
      self$`description` <- this_object$`description`
      self$`vendorCode` <- this_object$`vendorCode`
      self$`basicPrice` <- BasePriceDTO$new()$fromJSON(jsonlite::toJSON(this_object$`basicPrice`, auto_unbox = TRUE, digits = NA))
      self
    },
    #' Validate JSON input with respect to SuggestedOfferDTO
    #'
    #' @description
    #' Validate JSON input with respect to SuggestedOfferDTO and throw an exception if invalid
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
    #' @return String representation of SuggestedOfferDTO
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
# SuggestedOfferDTO$unlock()
#
## Below is an example to define the print function
# SuggestedOfferDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# SuggestedOfferDTO$lock()

