#' Create a new OrdersStatsItemDTO
#'
#' @description
#' Список товаров в заказе после возможных изменений.  В ходе обработки заказа Маркет может удалить из него единицы товаров — при проблемах на складе или по инициативе пользователя.  * Если из заказа удалены все единицы товара, его не будет в списке `items` — только в списке `initialItems`.  * Если в заказе осталась хотя бы одна единица товара, он будет и в списке `items` (с уменьшенным количеством единиц `count`), и в списке `initialItems` (с первоначальным количеством единиц `initialCount`). 
#'
#' @docType class
#' @title OrdersStatsItemDTO
#' @description OrdersStatsItemDTO Class
#' @format An \code{R6Class} generator object
#' @field offerName Название товара. character [optional]
#' @field marketSku SKU на Маркете. integer [optional]
#' @field shopSku Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) character [optional]
#' @field count Количество единиц товара с учетом удаленных единиц.  Если из заказа удалены все единицы товара, он попадет только в список `initialItems`. integer [optional]
#' @field prices Цена или скидки на товар. list(\link{OrdersStatsPriceDTO}) [optional]
#' @field warehouse  \link{OrdersStatsWarehouseDTO} [optional]
#' @field details Информация об удалении товара из заказа. list(\link{OrdersStatsDetailsDTO}) [optional]
#' @field cisList Список кодов идентификации товара [в системе «Честный ЗНАК»](https://честныйзнак.рф/). list(character) [optional]
#' @field initialCount Первоначальное количество единиц товара. integer [optional]
#' @field bidFee Списанная ставка ближайшего конкурента.  Указывается в процентах от стоимости товара и умножается на 100. Например, ставка 5\% обозначается как 500. integer [optional]
#' @field cofinanceThreshold Порог для скидок с Маркетом на момент оформления заказа. [Что это такое?](https://yandex.ru/support/marketplace/marketing/smart-pricing.html#sponsored-discounts)  Указан в рублях. Точность — два знака после запятой. numeric [optional]
#' @field cofinanceValue Скидка с Маркетом. [Что это такое?](https://yandex.ru/support/marketplace/marketing/smart-pricing.html#sponsored-discounts)  Указана в рублях. Точность — два знака после запятой. numeric [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
OrdersStatsItemDTO <- R6::R6Class(
  "OrdersStatsItemDTO",
  public = list(
    `offerName` = NULL,
    `marketSku` = NULL,
    `shopSku` = NULL,
    `count` = NULL,
    `prices` = NULL,
    `warehouse` = NULL,
    `details` = NULL,
    `cisList` = NULL,
    `initialCount` = NULL,
    `bidFee` = NULL,
    `cofinanceThreshold` = NULL,
    `cofinanceValue` = NULL,
    #' Initialize a new OrdersStatsItemDTO class.
    #'
    #' @description
    #' Initialize a new OrdersStatsItemDTO class.
    #'
    #' @param offerName Название товара.
    #' @param marketSku SKU на Маркете.
    #' @param shopSku Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)
    #' @param count Количество единиц товара с учетом удаленных единиц.  Если из заказа удалены все единицы товара, он попадет только в список `initialItems`.
    #' @param prices Цена или скидки на товар.
    #' @param warehouse warehouse
    #' @param details Информация об удалении товара из заказа.
    #' @param cisList Список кодов идентификации товара [в системе «Честный ЗНАК»](https://честныйзнак.рф/).
    #' @param initialCount Первоначальное количество единиц товара.
    #' @param bidFee Списанная ставка ближайшего конкурента.  Указывается в процентах от стоимости товара и умножается на 100. Например, ставка 5\% обозначается как 500.
    #' @param cofinanceThreshold Порог для скидок с Маркетом на момент оформления заказа. [Что это такое?](https://yandex.ru/support/marketplace/marketing/smart-pricing.html#sponsored-discounts)  Указан в рублях. Точность — два знака после запятой.
    #' @param cofinanceValue Скидка с Маркетом. [Что это такое?](https://yandex.ru/support/marketplace/marketing/smart-pricing.html#sponsored-discounts)  Указана в рублях. Точность — два знака после запятой.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`offerName` = NULL, `marketSku` = NULL, `shopSku` = NULL, `count` = NULL, `prices` = NULL, `warehouse` = NULL, `details` = NULL, `cisList` = NULL, `initialCount` = NULL, `bidFee` = NULL, `cofinanceThreshold` = NULL, `cofinanceValue` = NULL, ...) {
      if (!is.null(`offerName`)) {
        if (!(is.character(`offerName`) && length(`offerName`) == 1)) {
          stop(paste("Error! Invalid data for `offerName`. Must be a string:", `offerName`))
        }
        self$`offerName` <- `offerName`
      }
      if (!is.null(`marketSku`)) {
        if (!(is.numeric(`marketSku`) && length(`marketSku`) == 1)) {
          stop(paste("Error! Invalid data for `marketSku`. Must be an integer:", `marketSku`))
        }
        self$`marketSku` <- `marketSku`
      }
      if (!is.null(`shopSku`)) {
        if (!(is.character(`shopSku`) && length(`shopSku`) == 1)) {
          stop(paste("Error! Invalid data for `shopSku`. Must be a string:", `shopSku`))
        }
        self$`shopSku` <- `shopSku`
      }
      if (!is.null(`count`)) {
        if (!(is.numeric(`count`) && length(`count`) == 1)) {
          stop(paste("Error! Invalid data for `count`. Must be an integer:", `count`))
        }
        self$`count` <- `count`
      }
      if (!is.null(`prices`)) {
        stopifnot(is.vector(`prices`), length(`prices`) != 0)
        sapply(`prices`, function(x) stopifnot(R6::is.R6(x)))
        self$`prices` <- `prices`
      }
      if (!is.null(`warehouse`)) {
        stopifnot(R6::is.R6(`warehouse`))
        self$`warehouse` <- `warehouse`
      }
      if (!is.null(`details`)) {
        stopifnot(is.vector(`details`), length(`details`) != 0)
        sapply(`details`, function(x) stopifnot(R6::is.R6(x)))
        self$`details` <- `details`
      }
      if (!is.null(`cisList`)) {
        stopifnot(is.vector(`cisList`), length(`cisList`) != 0)
        sapply(`cisList`, function(x) stopifnot(is.character(x)))
        self$`cisList` <- `cisList`
      }
      if (!is.null(`initialCount`)) {
        if (!(is.numeric(`initialCount`) && length(`initialCount`) == 1)) {
          stop(paste("Error! Invalid data for `initialCount`. Must be an integer:", `initialCount`))
        }
        self$`initialCount` <- `initialCount`
      }
      if (!is.null(`bidFee`)) {
        if (!(is.numeric(`bidFee`) && length(`bidFee`) == 1)) {
          stop(paste("Error! Invalid data for `bidFee`. Must be an integer:", `bidFee`))
        }
        self$`bidFee` <- `bidFee`
      }
      if (!is.null(`cofinanceThreshold`)) {
        self$`cofinanceThreshold` <- `cofinanceThreshold`
      }
      if (!is.null(`cofinanceValue`)) {
        self$`cofinanceValue` <- `cofinanceValue`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return OrdersStatsItemDTO in JSON format
    #' @export
    toJSON = function() {
      OrdersStatsItemDTOObject <- list()
      if (!is.null(self$`offerName`)) {
        OrdersStatsItemDTOObject[["offerName"]] <-
          self$`offerName`
      }
      if (!is.null(self$`marketSku`)) {
        OrdersStatsItemDTOObject[["marketSku"]] <-
          self$`marketSku`
      }
      if (!is.null(self$`shopSku`)) {
        OrdersStatsItemDTOObject[["shopSku"]] <-
          self$`shopSku`
      }
      if (!is.null(self$`count`)) {
        OrdersStatsItemDTOObject[["count"]] <-
          self$`count`
      }
      if (!is.null(self$`prices`)) {
        OrdersStatsItemDTOObject[["prices"]] <-
          lapply(self$`prices`, function(x) x$toJSON())
      }
      if (!is.null(self$`warehouse`)) {
        OrdersStatsItemDTOObject[["warehouse"]] <-
          self$`warehouse`$toJSON()
      }
      if (!is.null(self$`details`)) {
        OrdersStatsItemDTOObject[["details"]] <-
          lapply(self$`details`, function(x) x$toJSON())
      }
      if (!is.null(self$`cisList`)) {
        OrdersStatsItemDTOObject[["cisList"]] <-
          self$`cisList`
      }
      if (!is.null(self$`initialCount`)) {
        OrdersStatsItemDTOObject[["initialCount"]] <-
          self$`initialCount`
      }
      if (!is.null(self$`bidFee`)) {
        OrdersStatsItemDTOObject[["bidFee"]] <-
          self$`bidFee`
      }
      if (!is.null(self$`cofinanceThreshold`)) {
        OrdersStatsItemDTOObject[["cofinanceThreshold"]] <-
          self$`cofinanceThreshold`
      }
      if (!is.null(self$`cofinanceValue`)) {
        OrdersStatsItemDTOObject[["cofinanceValue"]] <-
          self$`cofinanceValue`
      }
      OrdersStatsItemDTOObject
    },
    #' Deserialize JSON string into an instance of OrdersStatsItemDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of OrdersStatsItemDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of OrdersStatsItemDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`offerName`)) {
        self$`offerName` <- this_object$`offerName`
      }
      if (!is.null(this_object$`marketSku`)) {
        self$`marketSku` <- this_object$`marketSku`
      }
      if (!is.null(this_object$`shopSku`)) {
        self$`shopSku` <- this_object$`shopSku`
      }
      if (!is.null(this_object$`count`)) {
        self$`count` <- this_object$`count`
      }
      if (!is.null(this_object$`prices`)) {
        self$`prices` <- ApiClient$new()$deserializeObj(this_object$`prices`, "array[OrdersStatsPriceDTO]", loadNamespace("ympa_r_client"))
      }
      if (!is.null(this_object$`warehouse`)) {
        `warehouse_object` <- OrdersStatsWarehouseDTO$new()
        `warehouse_object`$fromJSON(jsonlite::toJSON(this_object$`warehouse`, auto_unbox = TRUE, digits = NA))
        self$`warehouse` <- `warehouse_object`
      }
      if (!is.null(this_object$`details`)) {
        self$`details` <- ApiClient$new()$deserializeObj(this_object$`details`, "array[OrdersStatsDetailsDTO]", loadNamespace("ympa_r_client"))
      }
      if (!is.null(this_object$`cisList`)) {
        self$`cisList` <- ApiClient$new()$deserializeObj(this_object$`cisList`, "array[character]", loadNamespace("ympa_r_client"))
      }
      if (!is.null(this_object$`initialCount`)) {
        self$`initialCount` <- this_object$`initialCount`
      }
      if (!is.null(this_object$`bidFee`)) {
        self$`bidFee` <- this_object$`bidFee`
      }
      if (!is.null(this_object$`cofinanceThreshold`)) {
        self$`cofinanceThreshold` <- this_object$`cofinanceThreshold`
      }
      if (!is.null(this_object$`cofinanceValue`)) {
        self$`cofinanceValue` <- this_object$`cofinanceValue`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return OrdersStatsItemDTO in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`offerName`)) {
          sprintf(
          '"offerName":
            "%s"
                    ',
          self$`offerName`
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
        if (!is.null(self$`shopSku`)) {
          sprintf(
          '"shopSku":
            "%s"
                    ',
          self$`shopSku`
          )
        },
        if (!is.null(self$`count`)) {
          sprintf(
          '"count":
            %d
                    ',
          self$`count`
          )
        },
        if (!is.null(self$`prices`)) {
          sprintf(
          '"prices":
          [%s]
',
          paste(sapply(self$`prices`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        },
        if (!is.null(self$`warehouse`)) {
          sprintf(
          '"warehouse":
          %s
          ',
          jsonlite::toJSON(self$`warehouse`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`details`)) {
          sprintf(
          '"details":
          [%s]
',
          paste(sapply(self$`details`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        },
        if (!is.null(self$`cisList`)) {
          sprintf(
          '"cisList":
             [%s]
          ',
          paste(unlist(lapply(self$`cisList`, function(x) paste0('"', x, '"'))), collapse = ",")
          )
        },
        if (!is.null(self$`initialCount`)) {
          sprintf(
          '"initialCount":
            %d
                    ',
          self$`initialCount`
          )
        },
        if (!is.null(self$`bidFee`)) {
          sprintf(
          '"bidFee":
            %d
                    ',
          self$`bidFee`
          )
        },
        if (!is.null(self$`cofinanceThreshold`)) {
          sprintf(
          '"cofinanceThreshold":
            %d
                    ',
          self$`cofinanceThreshold`
          )
        },
        if (!is.null(self$`cofinanceValue`)) {
          sprintf(
          '"cofinanceValue":
            %d
                    ',
          self$`cofinanceValue`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of OrdersStatsItemDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of OrdersStatsItemDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of OrdersStatsItemDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`offerName` <- this_object$`offerName`
      self$`marketSku` <- this_object$`marketSku`
      self$`shopSku` <- this_object$`shopSku`
      self$`count` <- this_object$`count`
      self$`prices` <- ApiClient$new()$deserializeObj(this_object$`prices`, "array[OrdersStatsPriceDTO]", loadNamespace("ympa_r_client"))
      self$`warehouse` <- OrdersStatsWarehouseDTO$new()$fromJSON(jsonlite::toJSON(this_object$`warehouse`, auto_unbox = TRUE, digits = NA))
      self$`details` <- ApiClient$new()$deserializeObj(this_object$`details`, "array[OrdersStatsDetailsDTO]", loadNamespace("ympa_r_client"))
      self$`cisList` <- ApiClient$new()$deserializeObj(this_object$`cisList`, "array[character]", loadNamespace("ympa_r_client"))
      self$`initialCount` <- this_object$`initialCount`
      self$`bidFee` <- this_object$`bidFee`
      self$`cofinanceThreshold` <- this_object$`cofinanceThreshold`
      self$`cofinanceValue` <- this_object$`cofinanceValue`
      self
    },
    #' Validate JSON input with respect to OrdersStatsItemDTO
    #'
    #' @description
    #' Validate JSON input with respect to OrdersStatsItemDTO and throw an exception if invalid
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
    #' @return String representation of OrdersStatsItemDTO
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

      if (self$`bidFee` > 10000) {
        return(FALSE)
      }
      if (self$`bidFee` < 0) {
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

      if (self$`bidFee` > 10000) {
        invalid_fields["bidFee"] <- "Invalid value for `bidFee`, must be smaller than or equal to 10000."
      }
      if (self$`bidFee` < 0) {
        invalid_fields["bidFee"] <- "Invalid value for `bidFee`, must be bigger than or equal to 0."
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
# OrdersStatsItemDTO$unlock()
#
## Below is an example to define the print function
# OrdersStatsItemDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# OrdersStatsItemDTO$lock()

