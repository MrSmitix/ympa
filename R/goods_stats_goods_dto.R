#' Create a new GoodsStatsGoodsDTO
#'
#' @description
#' Информация о товаре.
#'
#' @docType class
#' @title GoodsStatsGoodsDTO
#' @description GoodsStatsGoodsDTO Class
#' @format An \code{R6Class} generator object
#' @field shopSku Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) character [optional]
#' @field marketSku SKU на Маркете. integer [optional]
#' @field name Название товара. character [optional]
#' @field price Цена на товар в валюте, которая установлена [в кабинете продавца на Маркете](https://partner.market.yandex.ru/). numeric [optional]
#' @field categoryId Идентификатор категории товара на Маркете. integer [optional]
#' @field categoryName Название категории товара на Маркете. character [optional]
#' @field weightDimensions  \link{GoodsStatsWeightDimensionsDTO} [optional]
#' @field warehouses Информация о складах, на которых хранится товар.  Параметр не приходит, если товара нет ни на одном складе. list(\link{GoodsStatsWarehouseDTO}) [optional]
#' @field tariffs Информация о тарифах, по которым нужно заплатить за услуги Маркета.  По некоторым услугам могут возвращаться несколько разных стоимостей. Например, в модели FBS стоимость услуги `SORTING` (обработка заказа) зависит от способа отгрузки и количества заказов в отгрузке. Подробнее о тарифах на услуги читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/introduction/rates/models/). list(\link{TariffDTO}) [optional]
#' @field pictures Ссылки (URL) изображений товара в хорошем качестве. list(character) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
GoodsStatsGoodsDTO <- R6::R6Class(
  "GoodsStatsGoodsDTO",
  public = list(
    `shopSku` = NULL,
    `marketSku` = NULL,
    `name` = NULL,
    `price` = NULL,
    `categoryId` = NULL,
    `categoryName` = NULL,
    `weightDimensions` = NULL,
    `warehouses` = NULL,
    `tariffs` = NULL,
    `pictures` = NULL,
    #' Initialize a new GoodsStatsGoodsDTO class.
    #'
    #' @description
    #' Initialize a new GoodsStatsGoodsDTO class.
    #'
    #' @param shopSku Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)
    #' @param marketSku SKU на Маркете.
    #' @param name Название товара.
    #' @param price Цена на товар в валюте, которая установлена [в кабинете продавца на Маркете](https://partner.market.yandex.ru/).
    #' @param categoryId Идентификатор категории товара на Маркете.
    #' @param categoryName Название категории товара на Маркете.
    #' @param weightDimensions weightDimensions
    #' @param warehouses Информация о складах, на которых хранится товар.  Параметр не приходит, если товара нет ни на одном складе.
    #' @param tariffs Информация о тарифах, по которым нужно заплатить за услуги Маркета.  По некоторым услугам могут возвращаться несколько разных стоимостей. Например, в модели FBS стоимость услуги `SORTING` (обработка заказа) зависит от способа отгрузки и количества заказов в отгрузке. Подробнее о тарифах на услуги читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/introduction/rates/models/).
    #' @param pictures Ссылки (URL) изображений товара в хорошем качестве.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`shopSku` = NULL, `marketSku` = NULL, `name` = NULL, `price` = NULL, `categoryId` = NULL, `categoryName` = NULL, `weightDimensions` = NULL, `warehouses` = NULL, `tariffs` = NULL, `pictures` = NULL, ...) {
      if (!is.null(`shopSku`)) {
        if (!(is.character(`shopSku`) && length(`shopSku`) == 1)) {
          stop(paste("Error! Invalid data for `shopSku`. Must be a string:", `shopSku`))
        }
        self$`shopSku` <- `shopSku`
      }
      if (!is.null(`marketSku`)) {
        if (!(is.numeric(`marketSku`) && length(`marketSku`) == 1)) {
          stop(paste("Error! Invalid data for `marketSku`. Must be an integer:", `marketSku`))
        }
        self$`marketSku` <- `marketSku`
      }
      if (!is.null(`name`)) {
        if (!(is.character(`name`) && length(`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", `name`))
        }
        self$`name` <- `name`
      }
      if (!is.null(`price`)) {
        self$`price` <- `price`
      }
      if (!is.null(`categoryId`)) {
        if (!(is.numeric(`categoryId`) && length(`categoryId`) == 1)) {
          stop(paste("Error! Invalid data for `categoryId`. Must be an integer:", `categoryId`))
        }
        self$`categoryId` <- `categoryId`
      }
      if (!is.null(`categoryName`)) {
        if (!(is.character(`categoryName`) && length(`categoryName`) == 1)) {
          stop(paste("Error! Invalid data for `categoryName`. Must be a string:", `categoryName`))
        }
        self$`categoryName` <- `categoryName`
      }
      if (!is.null(`weightDimensions`)) {
        stopifnot(R6::is.R6(`weightDimensions`))
        self$`weightDimensions` <- `weightDimensions`
      }
      if (!is.null(`warehouses`)) {
        stopifnot(is.vector(`warehouses`), length(`warehouses`) != 0)
        sapply(`warehouses`, function(x) stopifnot(R6::is.R6(x)))
        self$`warehouses` <- `warehouses`
      }
      if (!is.null(`tariffs`)) {
        stopifnot(is.vector(`tariffs`), length(`tariffs`) != 0)
        sapply(`tariffs`, function(x) stopifnot(R6::is.R6(x)))
        self$`tariffs` <- `tariffs`
      }
      if (!is.null(`pictures`)) {
        stopifnot(is.vector(`pictures`), length(`pictures`) != 0)
        sapply(`pictures`, function(x) stopifnot(is.character(x)))
        self$`pictures` <- `pictures`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return GoodsStatsGoodsDTO in JSON format
    #' @export
    toJSON = function() {
      GoodsStatsGoodsDTOObject <- list()
      if (!is.null(self$`shopSku`)) {
        GoodsStatsGoodsDTOObject[["shopSku"]] <-
          self$`shopSku`
      }
      if (!is.null(self$`marketSku`)) {
        GoodsStatsGoodsDTOObject[["marketSku"]] <-
          self$`marketSku`
      }
      if (!is.null(self$`name`)) {
        GoodsStatsGoodsDTOObject[["name"]] <-
          self$`name`
      }
      if (!is.null(self$`price`)) {
        GoodsStatsGoodsDTOObject[["price"]] <-
          self$`price`
      }
      if (!is.null(self$`categoryId`)) {
        GoodsStatsGoodsDTOObject[["categoryId"]] <-
          self$`categoryId`
      }
      if (!is.null(self$`categoryName`)) {
        GoodsStatsGoodsDTOObject[["categoryName"]] <-
          self$`categoryName`
      }
      if (!is.null(self$`weightDimensions`)) {
        GoodsStatsGoodsDTOObject[["weightDimensions"]] <-
          self$`weightDimensions`$toJSON()
      }
      if (!is.null(self$`warehouses`)) {
        GoodsStatsGoodsDTOObject[["warehouses"]] <-
          lapply(self$`warehouses`, function(x) x$toJSON())
      }
      if (!is.null(self$`tariffs`)) {
        GoodsStatsGoodsDTOObject[["tariffs"]] <-
          lapply(self$`tariffs`, function(x) x$toJSON())
      }
      if (!is.null(self$`pictures`)) {
        GoodsStatsGoodsDTOObject[["pictures"]] <-
          self$`pictures`
      }
      GoodsStatsGoodsDTOObject
    },
    #' Deserialize JSON string into an instance of GoodsStatsGoodsDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of GoodsStatsGoodsDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of GoodsStatsGoodsDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`shopSku`)) {
        self$`shopSku` <- this_object$`shopSku`
      }
      if (!is.null(this_object$`marketSku`)) {
        self$`marketSku` <- this_object$`marketSku`
      }
      if (!is.null(this_object$`name`)) {
        self$`name` <- this_object$`name`
      }
      if (!is.null(this_object$`price`)) {
        self$`price` <- this_object$`price`
      }
      if (!is.null(this_object$`categoryId`)) {
        self$`categoryId` <- this_object$`categoryId`
      }
      if (!is.null(this_object$`categoryName`)) {
        self$`categoryName` <- this_object$`categoryName`
      }
      if (!is.null(this_object$`weightDimensions`)) {
        `weightdimensions_object` <- GoodsStatsWeightDimensionsDTO$new()
        `weightdimensions_object`$fromJSON(jsonlite::toJSON(this_object$`weightDimensions`, auto_unbox = TRUE, digits = NA))
        self$`weightDimensions` <- `weightdimensions_object`
      }
      if (!is.null(this_object$`warehouses`)) {
        self$`warehouses` <- ApiClient$new()$deserializeObj(this_object$`warehouses`, "array[GoodsStatsWarehouseDTO]", loadNamespace("ympa_r_client"))
      }
      if (!is.null(this_object$`tariffs`)) {
        self$`tariffs` <- ApiClient$new()$deserializeObj(this_object$`tariffs`, "array[TariffDTO]", loadNamespace("ympa_r_client"))
      }
      if (!is.null(this_object$`pictures`)) {
        self$`pictures` <- ApiClient$new()$deserializeObj(this_object$`pictures`, "array[character]", loadNamespace("ympa_r_client"))
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return GoodsStatsGoodsDTO in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`shopSku`)) {
          sprintf(
          '"shopSku":
            "%s"
                    ',
          self$`shopSku`
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
        if (!is.null(self$`name`)) {
          sprintf(
          '"name":
            "%s"
                    ',
          self$`name`
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
        if (!is.null(self$`categoryId`)) {
          sprintf(
          '"categoryId":
            %d
                    ',
          self$`categoryId`
          )
        },
        if (!is.null(self$`categoryName`)) {
          sprintf(
          '"categoryName":
            "%s"
                    ',
          self$`categoryName`
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
        if (!is.null(self$`warehouses`)) {
          sprintf(
          '"warehouses":
          [%s]
',
          paste(sapply(self$`warehouses`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        },
        if (!is.null(self$`tariffs`)) {
          sprintf(
          '"tariffs":
          [%s]
',
          paste(sapply(self$`tariffs`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        },
        if (!is.null(self$`pictures`)) {
          sprintf(
          '"pictures":
             [%s]
          ',
          paste(unlist(lapply(self$`pictures`, function(x) paste0('"', x, '"'))), collapse = ",")
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of GoodsStatsGoodsDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of GoodsStatsGoodsDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of GoodsStatsGoodsDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`shopSku` <- this_object$`shopSku`
      self$`marketSku` <- this_object$`marketSku`
      self$`name` <- this_object$`name`
      self$`price` <- this_object$`price`
      self$`categoryId` <- this_object$`categoryId`
      self$`categoryName` <- this_object$`categoryName`
      self$`weightDimensions` <- GoodsStatsWeightDimensionsDTO$new()$fromJSON(jsonlite::toJSON(this_object$`weightDimensions`, auto_unbox = TRUE, digits = NA))
      self$`warehouses` <- ApiClient$new()$deserializeObj(this_object$`warehouses`, "array[GoodsStatsWarehouseDTO]", loadNamespace("ympa_r_client"))
      self$`tariffs` <- ApiClient$new()$deserializeObj(this_object$`tariffs`, "array[TariffDTO]", loadNamespace("ympa_r_client"))
      self$`pictures` <- ApiClient$new()$deserializeObj(this_object$`pictures`, "array[character]", loadNamespace("ympa_r_client"))
      self
    },
    #' Validate JSON input with respect to GoodsStatsGoodsDTO
    #'
    #' @description
    #' Validate JSON input with respect to GoodsStatsGoodsDTO and throw an exception if invalid
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
    #' @return String representation of GoodsStatsGoodsDTO
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
      if (nchar(self$`shopSku`) > 255) {
        return(FALSE)
      }
      if (nchar(self$`shopSku`) < 1) {
        return(FALSE)
      }
      if (!str_detect(self$`shopSku`, "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")) {
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
      if (nchar(self$`shopSku`) > 255) {
        invalid_fields["shopSku"] <- "Invalid length for `shopSku`, must be smaller than or equal to 255."
      }
      if (nchar(self$`shopSku`) < 1) {
        invalid_fields["shopSku"] <- "Invalid length for `shopSku`, must be bigger than or equal to 1."
      }
      if (!str_detect(self$`shopSku`, "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")) {
        invalid_fields["shopSku"] <- "Invalid value for `shopSku`, must conform to the pattern ^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$."
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
# GoodsStatsGoodsDTO$unlock()
#
## Below is an example to define the print function
# GoodsStatsGoodsDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# GoodsStatsGoodsDTO$lock()

