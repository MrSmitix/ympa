#' Create a new PriceDTO
#'
#' @description
#' Цена с указанием скидки, валюты и времени последнего обновления.
#'
#' @docType class
#' @title PriceDTO
#' @description PriceDTO Class
#' @format An \code{R6Class} generator object
#' @field value Цена на товар. numeric [optional]
#' @field discountBase Цена на товар без скидки.  Число должно быть целым. Вы можете указать цену со скидкой от 5 до 99\%.  Передавайте этот параметр при каждом обновлении цены, если предоставляете скидку на товар. numeric [optional]
#' @field currencyId  \link{CurrencyType} [optional]
#' @field vat Идентификатор ставки НДС, применяемой для товара:  * `2` — 10\%. * `5` — 0\%. * `6` — не облагается НДС. * `7` — 20\%.  Если параметр не указан, используется ставка НДС, установленная в кабинете. integer [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
PriceDTO <- R6::R6Class(
  "PriceDTO",
  public = list(
    `value` = NULL,
    `discountBase` = NULL,
    `currencyId` = NULL,
    `vat` = NULL,
    #' Initialize a new PriceDTO class.
    #'
    #' @description
    #' Initialize a new PriceDTO class.
    #'
    #' @param value Цена на товар.
    #' @param discountBase Цена на товар без скидки.  Число должно быть целым. Вы можете указать цену со скидкой от 5 до 99\%.  Передавайте этот параметр при каждом обновлении цены, если предоставляете скидку на товар.
    #' @param currencyId currencyId
    #' @param vat Идентификатор ставки НДС, применяемой для товара:  * `2` — 10\%. * `5` — 0\%. * `6` — не облагается НДС. * `7` — 20\%.  Если параметр не указан, используется ставка НДС, установленная в кабинете.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`value` = NULL, `discountBase` = NULL, `currencyId` = NULL, `vat` = NULL, ...) {
      if (!is.null(`value`)) {
        self$`value` <- `value`
      }
      if (!is.null(`discountBase`)) {
        self$`discountBase` <- `discountBase`
      }
      if (!is.null(`currencyId`)) {
        if (!(`currencyId` %in% c())) {
          stop(paste("Error! \"", `currencyId`, "\" cannot be assigned to `currencyId`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`currencyId`))
        self$`currencyId` <- `currencyId`
      }
      if (!is.null(`vat`)) {
        if (!(is.numeric(`vat`) && length(`vat`) == 1)) {
          stop(paste("Error! Invalid data for `vat`. Must be an integer:", `vat`))
        }
        self$`vat` <- `vat`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return PriceDTO in JSON format
    #' @export
    toJSON = function() {
      PriceDTOObject <- list()
      if (!is.null(self$`value`)) {
        PriceDTOObject[["value"]] <-
          self$`value`
      }
      if (!is.null(self$`discountBase`)) {
        PriceDTOObject[["discountBase"]] <-
          self$`discountBase`
      }
      if (!is.null(self$`currencyId`)) {
        PriceDTOObject[["currencyId"]] <-
          self$`currencyId`$toJSON()
      }
      if (!is.null(self$`vat`)) {
        PriceDTOObject[["vat"]] <-
          self$`vat`
      }
      PriceDTOObject
    },
    #' Deserialize JSON string into an instance of PriceDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of PriceDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of PriceDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`value`)) {
        self$`value` <- this_object$`value`
      }
      if (!is.null(this_object$`discountBase`)) {
        self$`discountBase` <- this_object$`discountBase`
      }
      if (!is.null(this_object$`currencyId`)) {
        `currencyid_object` <- CurrencyType$new()
        `currencyid_object`$fromJSON(jsonlite::toJSON(this_object$`currencyId`, auto_unbox = TRUE, digits = NA))
        self$`currencyId` <- `currencyid_object`
      }
      if (!is.null(this_object$`vat`)) {
        self$`vat` <- this_object$`vat`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return PriceDTO in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`value`)) {
          sprintf(
          '"value":
            %d
                    ',
          self$`value`
          )
        },
        if (!is.null(self$`discountBase`)) {
          sprintf(
          '"discountBase":
            %d
                    ',
          self$`discountBase`
          )
        },
        if (!is.null(self$`currencyId`)) {
          sprintf(
          '"currencyId":
          %s
          ',
          jsonlite::toJSON(self$`currencyId`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`vat`)) {
          sprintf(
          '"vat":
            %d
                    ',
          self$`vat`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of PriceDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of PriceDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of PriceDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`value` <- this_object$`value`
      self$`discountBase` <- this_object$`discountBase`
      self$`currencyId` <- CurrencyType$new()$fromJSON(jsonlite::toJSON(this_object$`currencyId`, auto_unbox = TRUE, digits = NA))
      self$`vat` <- this_object$`vat`
      self
    },
    #' Validate JSON input with respect to PriceDTO
    #'
    #' @description
    #' Validate JSON input with respect to PriceDTO and throw an exception if invalid
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
    #' @return String representation of PriceDTO
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
# PriceDTO$unlock()
#
## Below is an example to define the print function
# PriceDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# PriceDTO$lock()

