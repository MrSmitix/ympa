#' Create a new WarehouseOfferDTO
#'
#' @description
#' Информация об остатках товара.
#'
#' @docType class
#' @title WarehouseOfferDTO
#' @description WarehouseOfferDTO Class
#' @format An \code{R6Class} generator object
#' @field offerId Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) character
#' @field turnoverSummary  \link{TurnoverDTO} [optional]
#' @field stocks Информация об остатках. list(\link{WarehouseStockDTO})
#' @field updatedAt Дата и время последнего обновления информации об остатках.  Формат даты и времени: ISO 8601 со смещением относительно UTC. Например, `2023-11-21T00:42:42+03:00`. character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
WarehouseOfferDTO <- R6::R6Class(
  "WarehouseOfferDTO",
  public = list(
    `offerId` = NULL,
    `turnoverSummary` = NULL,
    `stocks` = NULL,
    `updatedAt` = NULL,
    #' Initialize a new WarehouseOfferDTO class.
    #'
    #' @description
    #' Initialize a new WarehouseOfferDTO class.
    #'
    #' @param offerId Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)
    #' @param stocks Информация об остатках.
    #' @param turnoverSummary turnoverSummary
    #' @param updatedAt Дата и время последнего обновления информации об остатках.  Формат даты и времени: ISO 8601 со смещением относительно UTC. Например, `2023-11-21T00:42:42+03:00`.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`offerId`, `stocks`, `turnoverSummary` = NULL, `updatedAt` = NULL, ...) {
      if (!missing(`offerId`)) {
        if (!(is.character(`offerId`) && length(`offerId`) == 1)) {
          stop(paste("Error! Invalid data for `offerId`. Must be a string:", `offerId`))
        }
        self$`offerId` <- `offerId`
      }
      if (!missing(`stocks`)) {
        stopifnot(is.vector(`stocks`), length(`stocks`) != 0)
        sapply(`stocks`, function(x) stopifnot(R6::is.R6(x)))
        self$`stocks` <- `stocks`
      }
      if (!is.null(`turnoverSummary`)) {
        stopifnot(R6::is.R6(`turnoverSummary`))
        self$`turnoverSummary` <- `turnoverSummary`
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
    #' @return WarehouseOfferDTO in JSON format
    #' @export
    toJSON = function() {
      WarehouseOfferDTOObject <- list()
      if (!is.null(self$`offerId`)) {
        WarehouseOfferDTOObject[["offerId"]] <-
          self$`offerId`
      }
      if (!is.null(self$`turnoverSummary`)) {
        WarehouseOfferDTOObject[["turnoverSummary"]] <-
          self$`turnoverSummary`$toJSON()
      }
      if (!is.null(self$`stocks`)) {
        WarehouseOfferDTOObject[["stocks"]] <-
          lapply(self$`stocks`, function(x) x$toJSON())
      }
      if (!is.null(self$`updatedAt`)) {
        WarehouseOfferDTOObject[["updatedAt"]] <-
          self$`updatedAt`
      }
      WarehouseOfferDTOObject
    },
    #' Deserialize JSON string into an instance of WarehouseOfferDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of WarehouseOfferDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of WarehouseOfferDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`offerId`)) {
        self$`offerId` <- this_object$`offerId`
      }
      if (!is.null(this_object$`turnoverSummary`)) {
        `turnoversummary_object` <- TurnoverDTO$new()
        `turnoversummary_object`$fromJSON(jsonlite::toJSON(this_object$`turnoverSummary`, auto_unbox = TRUE, digits = NA))
        self$`turnoverSummary` <- `turnoversummary_object`
      }
      if (!is.null(this_object$`stocks`)) {
        self$`stocks` <- ApiClient$new()$deserializeObj(this_object$`stocks`, "array[WarehouseStockDTO]", loadNamespace("ympa_r_client"))
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
    #' @return WarehouseOfferDTO in JSON format
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
        if (!is.null(self$`turnoverSummary`)) {
          sprintf(
          '"turnoverSummary":
          %s
          ',
          jsonlite::toJSON(self$`turnoverSummary`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`stocks`)) {
          sprintf(
          '"stocks":
          [%s]
',
          paste(sapply(self$`stocks`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
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
    #' Deserialize JSON string into an instance of WarehouseOfferDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of WarehouseOfferDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of WarehouseOfferDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`offerId` <- this_object$`offerId`
      self$`turnoverSummary` <- TurnoverDTO$new()$fromJSON(jsonlite::toJSON(this_object$`turnoverSummary`, auto_unbox = TRUE, digits = NA))
      self$`stocks` <- ApiClient$new()$deserializeObj(this_object$`stocks`, "array[WarehouseStockDTO]", loadNamespace("ympa_r_client"))
      self$`updatedAt` <- this_object$`updatedAt`
      self
    },
    #' Validate JSON input with respect to WarehouseOfferDTO
    #'
    #' @description
    #' Validate JSON input with respect to WarehouseOfferDTO and throw an exception if invalid
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
        stop(paste("The JSON input `", input, "` is invalid for WarehouseOfferDTO: the required field `offerId` is missing."))
      }
      # check the required field `stocks`
      if (!is.null(input_json$`stocks`)) {
        stopifnot(is.vector(input_json$`stocks`), length(input_json$`stocks`) != 0)
        tmp <- sapply(input_json$`stocks`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for WarehouseOfferDTO: the required field `stocks` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of WarehouseOfferDTO
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

      # check if the required `stocks` is null
      if (is.null(self$`stocks`)) {
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

      # check if the required `stocks` is null
      if (is.null(self$`stocks`)) {
        invalid_fields["stocks"] <- "Non-nullable required field `stocks` cannot be null."
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
# WarehouseOfferDTO$unlock()
#
## Below is an example to define the print function
# WarehouseOfferDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# WarehouseOfferDTO$lock()

