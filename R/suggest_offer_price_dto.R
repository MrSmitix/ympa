#' Create a new SuggestOfferPriceDTO
#'
#' @description
#' Товар, для которого требуется получить цены для продвижения.
#'
#' @docType class
#' @title SuggestOfferPriceDTO
#' @description SuggestOfferPriceDTO Class
#' @format An \code{R6Class} generator object
#' @field offerId Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) character [optional]
#' @field marketSku SKU на Маркете. integer [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
SuggestOfferPriceDTO <- R6::R6Class(
  "SuggestOfferPriceDTO",
  public = list(
    `offerId` = NULL,
    `marketSku` = NULL,
    #' Initialize a new SuggestOfferPriceDTO class.
    #'
    #' @description
    #' Initialize a new SuggestOfferPriceDTO class.
    #'
    #' @param offerId Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)
    #' @param marketSku SKU на Маркете.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`offerId` = NULL, `marketSku` = NULL, ...) {
      if (!is.null(`offerId`)) {
        if (!(is.character(`offerId`) && length(`offerId`) == 1)) {
          stop(paste("Error! Invalid data for `offerId`. Must be a string:", `offerId`))
        }
        self$`offerId` <- `offerId`
      }
      if (!is.null(`marketSku`)) {
        if (!(is.numeric(`marketSku`) && length(`marketSku`) == 1)) {
          stop(paste("Error! Invalid data for `marketSku`. Must be an integer:", `marketSku`))
        }
        self$`marketSku` <- `marketSku`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return SuggestOfferPriceDTO in JSON format
    #' @export
    toJSON = function() {
      SuggestOfferPriceDTOObject <- list()
      if (!is.null(self$`offerId`)) {
        SuggestOfferPriceDTOObject[["offerId"]] <-
          self$`offerId`
      }
      if (!is.null(self$`marketSku`)) {
        SuggestOfferPriceDTOObject[["marketSku"]] <-
          self$`marketSku`
      }
      SuggestOfferPriceDTOObject
    },
    #' Deserialize JSON string into an instance of SuggestOfferPriceDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of SuggestOfferPriceDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of SuggestOfferPriceDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`offerId`)) {
        self$`offerId` <- this_object$`offerId`
      }
      if (!is.null(this_object$`marketSku`)) {
        self$`marketSku` <- this_object$`marketSku`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return SuggestOfferPriceDTO in JSON format
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
        if (!is.null(self$`marketSku`)) {
          sprintf(
          '"marketSku":
            %d
                    ',
          self$`marketSku`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of SuggestOfferPriceDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of SuggestOfferPriceDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of SuggestOfferPriceDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`offerId` <- this_object$`offerId`
      self$`marketSku` <- this_object$`marketSku`
      self
    },
    #' Validate JSON input with respect to SuggestOfferPriceDTO
    #'
    #' @description
    #' Validate JSON input with respect to SuggestOfferPriceDTO and throw an exception if invalid
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
    #' @return String representation of SuggestOfferPriceDTO
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
# SuggestOfferPriceDTO$unlock()
#
## Below is an example to define the print function
# SuggestOfferPriceDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# SuggestOfferPriceDTO$lock()

