#' Create a new QuarantineOfferDTO
#'
#' @description
#' Товар в карантине.
#'
#' @docType class
#' @title QuarantineOfferDTO
#' @description QuarantineOfferDTO Class
#' @format An \code{R6Class} generator object
#' @field offerId Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) character [optional]
#' @field currentPrice  \link{BasePriceDTO} [optional]
#' @field lastValidPrice  \link{BasePriceDTO} [optional]
#' @field verdicts Причины попадания товара в карантин. list(\link{PriceQuarantineVerdictDTO}) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
QuarantineOfferDTO <- R6::R6Class(
  "QuarantineOfferDTO",
  public = list(
    `offerId` = NULL,
    `currentPrice` = NULL,
    `lastValidPrice` = NULL,
    `verdicts` = NULL,
    #' Initialize a new QuarantineOfferDTO class.
    #'
    #' @description
    #' Initialize a new QuarantineOfferDTO class.
    #'
    #' @param offerId Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)
    #' @param currentPrice currentPrice
    #' @param lastValidPrice lastValidPrice
    #' @param verdicts Причины попадания товара в карантин.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`offerId` = NULL, `currentPrice` = NULL, `lastValidPrice` = NULL, `verdicts` = NULL, ...) {
      if (!is.null(`offerId`)) {
        if (!(is.character(`offerId`) && length(`offerId`) == 1)) {
          stop(paste("Error! Invalid data for `offerId`. Must be a string:", `offerId`))
        }
        self$`offerId` <- `offerId`
      }
      if (!is.null(`currentPrice`)) {
        stopifnot(R6::is.R6(`currentPrice`))
        self$`currentPrice` <- `currentPrice`
      }
      if (!is.null(`lastValidPrice`)) {
        stopifnot(R6::is.R6(`lastValidPrice`))
        self$`lastValidPrice` <- `lastValidPrice`
      }
      if (!is.null(`verdicts`)) {
        stopifnot(is.vector(`verdicts`), length(`verdicts`) != 0)
        sapply(`verdicts`, function(x) stopifnot(R6::is.R6(x)))
        self$`verdicts` <- `verdicts`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return QuarantineOfferDTO in JSON format
    #' @export
    toJSON = function() {
      QuarantineOfferDTOObject <- list()
      if (!is.null(self$`offerId`)) {
        QuarantineOfferDTOObject[["offerId"]] <-
          self$`offerId`
      }
      if (!is.null(self$`currentPrice`)) {
        QuarantineOfferDTOObject[["currentPrice"]] <-
          self$`currentPrice`$toJSON()
      }
      if (!is.null(self$`lastValidPrice`)) {
        QuarantineOfferDTOObject[["lastValidPrice"]] <-
          self$`lastValidPrice`$toJSON()
      }
      if (!is.null(self$`verdicts`)) {
        QuarantineOfferDTOObject[["verdicts"]] <-
          lapply(self$`verdicts`, function(x) x$toJSON())
      }
      QuarantineOfferDTOObject
    },
    #' Deserialize JSON string into an instance of QuarantineOfferDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of QuarantineOfferDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of QuarantineOfferDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`offerId`)) {
        self$`offerId` <- this_object$`offerId`
      }
      if (!is.null(this_object$`currentPrice`)) {
        `currentprice_object` <- BasePriceDTO$new()
        `currentprice_object`$fromJSON(jsonlite::toJSON(this_object$`currentPrice`, auto_unbox = TRUE, digits = NA))
        self$`currentPrice` <- `currentprice_object`
      }
      if (!is.null(this_object$`lastValidPrice`)) {
        `lastvalidprice_object` <- BasePriceDTO$new()
        `lastvalidprice_object`$fromJSON(jsonlite::toJSON(this_object$`lastValidPrice`, auto_unbox = TRUE, digits = NA))
        self$`lastValidPrice` <- `lastvalidprice_object`
      }
      if (!is.null(this_object$`verdicts`)) {
        self$`verdicts` <- ApiClient$new()$deserializeObj(this_object$`verdicts`, "array[PriceQuarantineVerdictDTO]", loadNamespace("ympa_r_client"))
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return QuarantineOfferDTO in JSON format
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
        if (!is.null(self$`currentPrice`)) {
          sprintf(
          '"currentPrice":
          %s
          ',
          jsonlite::toJSON(self$`currentPrice`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`lastValidPrice`)) {
          sprintf(
          '"lastValidPrice":
          %s
          ',
          jsonlite::toJSON(self$`lastValidPrice`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`verdicts`)) {
          sprintf(
          '"verdicts":
          [%s]
',
          paste(sapply(self$`verdicts`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of QuarantineOfferDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of QuarantineOfferDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of QuarantineOfferDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`offerId` <- this_object$`offerId`
      self$`currentPrice` <- BasePriceDTO$new()$fromJSON(jsonlite::toJSON(this_object$`currentPrice`, auto_unbox = TRUE, digits = NA))
      self$`lastValidPrice` <- BasePriceDTO$new()$fromJSON(jsonlite::toJSON(this_object$`lastValidPrice`, auto_unbox = TRUE, digits = NA))
      self$`verdicts` <- ApiClient$new()$deserializeObj(this_object$`verdicts`, "array[PriceQuarantineVerdictDTO]", loadNamespace("ympa_r_client"))
      self
    },
    #' Validate JSON input with respect to QuarantineOfferDTO
    #'
    #' @description
    #' Validate JSON input with respect to QuarantineOfferDTO and throw an exception if invalid
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
    #' @return String representation of QuarantineOfferDTO
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
# QuarantineOfferDTO$unlock()
#
## Below is an example to define the print function
# QuarantineOfferDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# QuarantineOfferDTO$lock()

