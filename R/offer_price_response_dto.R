#' Create a new OfferPriceResponseDTO
#'
#' @description
#' Информация об установленной цене на товар.
#'
#' @docType class
#' @title OfferPriceResponseDTO
#' @description OfferPriceResponseDTO Class
#' @format An \code{R6Class} generator object
#' @field id Идентификатор предложения из прайс-листа. character [optional]
#' @field price  \link{PriceDTO} [optional]
#' @field marketSku SKU на Маркете. integer [optional]
#' @field updatedAt Дата и время последнего обновления цены на товар. character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
OfferPriceResponseDTO <- R6::R6Class(
  "OfferPriceResponseDTO",
  public = list(
    `id` = NULL,
    `price` = NULL,
    `marketSku` = NULL,
    `updatedAt` = NULL,
    #' Initialize a new OfferPriceResponseDTO class.
    #'
    #' @description
    #' Initialize a new OfferPriceResponseDTO class.
    #'
    #' @param id Идентификатор предложения из прайс-листа.
    #' @param price price
    #' @param marketSku SKU на Маркете.
    #' @param updatedAt Дата и время последнего обновления цены на товар.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`id` = NULL, `price` = NULL, `marketSku` = NULL, `updatedAt` = NULL, ...) {
      if (!is.null(`id`)) {
        if (!(is.character(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", `id`))
        }
        self$`id` <- `id`
      }
      if (!is.null(`price`)) {
        stopifnot(R6::is.R6(`price`))
        self$`price` <- `price`
      }
      if (!is.null(`marketSku`)) {
        if (!(is.numeric(`marketSku`) && length(`marketSku`) == 1)) {
          stop(paste("Error! Invalid data for `marketSku`. Must be an integer:", `marketSku`))
        }
        self$`marketSku` <- `marketSku`
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
    #' @return OfferPriceResponseDTO in JSON format
    #' @export
    toJSON = function() {
      OfferPriceResponseDTOObject <- list()
      if (!is.null(self$`id`)) {
        OfferPriceResponseDTOObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`price`)) {
        OfferPriceResponseDTOObject[["price"]] <-
          self$`price`$toJSON()
      }
      if (!is.null(self$`marketSku`)) {
        OfferPriceResponseDTOObject[["marketSku"]] <-
          self$`marketSku`
      }
      if (!is.null(self$`updatedAt`)) {
        OfferPriceResponseDTOObject[["updatedAt"]] <-
          self$`updatedAt`
      }
      OfferPriceResponseDTOObject
    },
    #' Deserialize JSON string into an instance of OfferPriceResponseDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of OfferPriceResponseDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of OfferPriceResponseDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`price`)) {
        `price_object` <- PriceDTO$new()
        `price_object`$fromJSON(jsonlite::toJSON(this_object$`price`, auto_unbox = TRUE, digits = NA))
        self$`price` <- `price_object`
      }
      if (!is.null(this_object$`marketSku`)) {
        self$`marketSku` <- this_object$`marketSku`
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
    #' @return OfferPriceResponseDTO in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`id`)) {
          sprintf(
          '"id":
            "%s"
                    ',
          self$`id`
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
        if (!is.null(self$`marketSku`)) {
          sprintf(
          '"marketSku":
            %d
                    ',
          self$`marketSku`
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
    #' Deserialize JSON string into an instance of OfferPriceResponseDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of OfferPriceResponseDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of OfferPriceResponseDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`id` <- this_object$`id`
      self$`price` <- PriceDTO$new()$fromJSON(jsonlite::toJSON(this_object$`price`, auto_unbox = TRUE, digits = NA))
      self$`marketSku` <- this_object$`marketSku`
      self$`updatedAt` <- this_object$`updatedAt`
      self
    },
    #' Validate JSON input with respect to OfferPriceResponseDTO
    #'
    #' @description
    #' Validate JSON input with respect to OfferPriceResponseDTO and throw an exception if invalid
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
    #' @return String representation of OfferPriceResponseDTO
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
# OfferPriceResponseDTO$unlock()
#
## Below is an example to define the print function
# OfferPriceResponseDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# OfferPriceResponseDTO$lock()

