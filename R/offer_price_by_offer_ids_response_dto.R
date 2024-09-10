#' Create a new OfferPriceByOfferIdsResponseDTO
#'
#' @description
#' Информация об установленной цене.
#'
#' @docType class
#' @title OfferPriceByOfferIdsResponseDTO
#' @description OfferPriceByOfferIdsResponseDTO Class
#' @format An \code{R6Class} generator object
#' @field offerId Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) character [optional]
#' @field price  \link{PriceDTO} [optional]
#' @field updatedAt Дата и время последнего обновления цены. character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
OfferPriceByOfferIdsResponseDTO <- R6::R6Class(
  "OfferPriceByOfferIdsResponseDTO",
  public = list(
    `offerId` = NULL,
    `price` = NULL,
    `updatedAt` = NULL,
    #' Initialize a new OfferPriceByOfferIdsResponseDTO class.
    #'
    #' @description
    #' Initialize a new OfferPriceByOfferIdsResponseDTO class.
    #'
    #' @param offerId Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)
    #' @param price price
    #' @param updatedAt Дата и время последнего обновления цены.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`offerId` = NULL, `price` = NULL, `updatedAt` = NULL, ...) {
      if (!is.null(`offerId`)) {
        if (!(is.character(`offerId`) && length(`offerId`) == 1)) {
          stop(paste("Error! Invalid data for `offerId`. Must be a string:", `offerId`))
        }
        self$`offerId` <- `offerId`
      }
      if (!is.null(`price`)) {
        stopifnot(R6::is.R6(`price`))
        self$`price` <- `price`
      }
      if (!is.null(`updatedAt`)) {
        if (!is.character(`updatedAt`)) {
          stop(paste("Error! Invalid data for `updatedAt`. Must be a string:", `updatedAt`))
        }
        self$`updatedAt` <- `updatedAt`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return OfferPriceByOfferIdsResponseDTO in JSON format
    #' @export
    toJSON = function() {
      OfferPriceByOfferIdsResponseDTOObject <- list()
      if (!is.null(self$`offerId`)) {
        OfferPriceByOfferIdsResponseDTOObject[["offerId"]] <-
          self$`offerId`
      }
      if (!is.null(self$`price`)) {
        OfferPriceByOfferIdsResponseDTOObject[["price"]] <-
          self$`price`$toJSON()
      }
      if (!is.null(self$`updatedAt`)) {
        OfferPriceByOfferIdsResponseDTOObject[["updatedAt"]] <-
          self$`updatedAt`
      }
      OfferPriceByOfferIdsResponseDTOObject
    },
    #' Deserialize JSON string into an instance of OfferPriceByOfferIdsResponseDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of OfferPriceByOfferIdsResponseDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of OfferPriceByOfferIdsResponseDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`offerId`)) {
        self$`offerId` <- this_object$`offerId`
      }
      if (!is.null(this_object$`price`)) {
        `price_object` <- PriceDTO$new()
        `price_object`$fromJSON(jsonlite::toJSON(this_object$`price`, auto_unbox = TRUE, digits = NA))
        self$`price` <- `price_object`
      }
      if (!is.null(this_object$`updatedAt`)) {
        self$`updatedAt` <- this_object$`updatedAt`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return OfferPriceByOfferIdsResponseDTO in JSON format
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
        if (!is.null(self$`price`)) {
          sprintf(
          '"price":
          %s
          ',
          jsonlite::toJSON(self$`price`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`updatedAt`)) {
          sprintf(
          '"updatedAt":
            "%s"
                    ',
          self$`updatedAt`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of OfferPriceByOfferIdsResponseDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of OfferPriceByOfferIdsResponseDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of OfferPriceByOfferIdsResponseDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`offerId` <- this_object$`offerId`
      self$`price` <- PriceDTO$new()$fromJSON(jsonlite::toJSON(this_object$`price`, auto_unbox = TRUE, digits = NA))
      self$`updatedAt` <- this_object$`updatedAt`
      self
    },
    #' Validate JSON input with respect to OfferPriceByOfferIdsResponseDTO
    #'
    #' @description
    #' Validate JSON input with respect to OfferPriceByOfferIdsResponseDTO and throw an exception if invalid
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
    #' @return String representation of OfferPriceByOfferIdsResponseDTO
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
# OfferPriceByOfferIdsResponseDTO$unlock()
#
## Below is an example to define the print function
# OfferPriceByOfferIdsResponseDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# OfferPriceByOfferIdsResponseDTO$lock()

