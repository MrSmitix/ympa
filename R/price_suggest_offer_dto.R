#' Create a new PriceSuggestOfferDTO
#'
#' @description
#' Товар с ценами для продвижения.
#'
#' @docType class
#' @title PriceSuggestOfferDTO
#' @description PriceSuggestOfferDTO Class
#' @format An \code{R6Class} generator object
#' @field marketSku SKU на Маркете. integer [optional]
#' @field offerId Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) character [optional]
#' @field priceSuggestion Цены для продвижения. list(\link{PriceSuggestDTO}) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
PriceSuggestOfferDTO <- R6::R6Class(
  "PriceSuggestOfferDTO",
  public = list(
    `marketSku` = NULL,
    `offerId` = NULL,
    `priceSuggestion` = NULL,
    #' Initialize a new PriceSuggestOfferDTO class.
    #'
    #' @description
    #' Initialize a new PriceSuggestOfferDTO class.
    #'
    #' @param marketSku SKU на Маркете.
    #' @param offerId Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)
    #' @param priceSuggestion Цены для продвижения.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`marketSku` = NULL, `offerId` = NULL, `priceSuggestion` = NULL, ...) {
      if (!is.null(`marketSku`)) {
        if (!(is.numeric(`marketSku`) && length(`marketSku`) == 1)) {
          stop(paste("Error! Invalid data for `marketSku`. Must be an integer:", `marketSku`))
        }
        self$`marketSku` <- `marketSku`
      }
      if (!is.null(`offerId`)) {
        if (!(is.character(`offerId`) && length(`offerId`) == 1)) {
          stop(paste("Error! Invalid data for `offerId`. Must be a string:", `offerId`))
        }
        self$`offerId` <- `offerId`
      }
      if (!is.null(`priceSuggestion`)) {
        stopifnot(is.vector(`priceSuggestion`), length(`priceSuggestion`) != 0)
        sapply(`priceSuggestion`, function(x) stopifnot(R6::is.R6(x)))
        self$`priceSuggestion` <- `priceSuggestion`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return PriceSuggestOfferDTO in JSON format
    #' @export
    toJSON = function() {
      PriceSuggestOfferDTOObject <- list()
      if (!is.null(self$`marketSku`)) {
        PriceSuggestOfferDTOObject[["marketSku"]] <-
          self$`marketSku`
      }
      if (!is.null(self$`offerId`)) {
        PriceSuggestOfferDTOObject[["offerId"]] <-
          self$`offerId`
      }
      if (!is.null(self$`priceSuggestion`)) {
        PriceSuggestOfferDTOObject[["priceSuggestion"]] <-
          lapply(self$`priceSuggestion`, function(x) x$toJSON())
      }
      PriceSuggestOfferDTOObject
    },
    #' Deserialize JSON string into an instance of PriceSuggestOfferDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of PriceSuggestOfferDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of PriceSuggestOfferDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`marketSku`)) {
        self$`marketSku` <- this_object$`marketSku`
      }
      if (!is.null(this_object$`offerId`)) {
        self$`offerId` <- this_object$`offerId`
      }
      if (!is.null(this_object$`priceSuggestion`)) {
        self$`priceSuggestion` <- ApiClient$new()$deserializeObj(this_object$`priceSuggestion`, "array[PriceSuggestDTO]", loadNamespace("ympa_r_client"))
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return PriceSuggestOfferDTO in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`marketSku`)) {
          sprintf(
          '"marketSku":
            %d
                    ',
          self$`marketSku`
          )
        },
        if (!is.null(self$`offerId`)) {
          sprintf(
          '"offerId":
            "%s"
                    ',
          self$`offerId`
          )
        },
        if (!is.null(self$`priceSuggestion`)) {
          sprintf(
          '"priceSuggestion":
          [%s]
',
          paste(sapply(self$`priceSuggestion`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of PriceSuggestOfferDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of PriceSuggestOfferDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of PriceSuggestOfferDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`marketSku` <- this_object$`marketSku`
      self$`offerId` <- this_object$`offerId`
      self$`priceSuggestion` <- ApiClient$new()$deserializeObj(this_object$`priceSuggestion`, "array[PriceSuggestDTO]", loadNamespace("ympa_r_client"))
      self
    },
    #' Validate JSON input with respect to PriceSuggestOfferDTO
    #'
    #' @description
    #' Validate JSON input with respect to PriceSuggestOfferDTO and throw an exception if invalid
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
    #' @return String representation of PriceSuggestOfferDTO
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
# PriceSuggestOfferDTO$unlock()
#
## Below is an example to define the print function
# PriceSuggestOfferDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# PriceSuggestOfferDTO$lock()

