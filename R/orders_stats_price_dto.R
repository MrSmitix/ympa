#' Create a new OrdersStatsPriceDTO
#'
#' @description
#' Цена или скидки на товар.
#'
#' @docType class
#' @title OrdersStatsPriceDTO
#' @description OrdersStatsPriceDTO Class
#' @format An \code{R6Class} generator object
#' @field type  \link{OrdersStatsPriceType} [optional]
#' @field costPerItem Цена или скидка на единицу товара в заказе. Указана в рублях. Точность — два знака после запятой. numeric [optional]
#' @field total Суммарная цена или скидка на все единицы товара в заказе. Указана в рублях. Точность — два знака после запятой. numeric [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
OrdersStatsPriceDTO <- R6::R6Class(
  "OrdersStatsPriceDTO",
  public = list(
    `type` = NULL,
    `costPerItem` = NULL,
    `total` = NULL,
    #' Initialize a new OrdersStatsPriceDTO class.
    #'
    #' @description
    #' Initialize a new OrdersStatsPriceDTO class.
    #'
    #' @param type type
    #' @param costPerItem Цена или скидка на единицу товара в заказе. Указана в рублях. Точность — два знака после запятой.
    #' @param total Суммарная цена или скидка на все единицы товара в заказе. Указана в рублях. Точность — два знака после запятой.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`type` = NULL, `costPerItem` = NULL, `total` = NULL, ...) {
      if (!is.null(`type`)) {
        if (!(`type` %in% c())) {
          stop(paste("Error! \"", `type`, "\" cannot be assigned to `type`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`type`))
        self$`type` <- `type`
      }
      if (!is.null(`costPerItem`)) {
        self$`costPerItem` <- `costPerItem`
      }
      if (!is.null(`total`)) {
        self$`total` <- `total`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return OrdersStatsPriceDTO in JSON format
    #' @export
    toJSON = function() {
      OrdersStatsPriceDTOObject <- list()
      if (!is.null(self$`type`)) {
        OrdersStatsPriceDTOObject[["type"]] <-
          self$`type`$toJSON()
      }
      if (!is.null(self$`costPerItem`)) {
        OrdersStatsPriceDTOObject[["costPerItem"]] <-
          self$`costPerItem`
      }
      if (!is.null(self$`total`)) {
        OrdersStatsPriceDTOObject[["total"]] <-
          self$`total`
      }
      OrdersStatsPriceDTOObject
    },
    #' Deserialize JSON string into an instance of OrdersStatsPriceDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of OrdersStatsPriceDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of OrdersStatsPriceDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`type`)) {
        `type_object` <- OrdersStatsPriceType$new()
        `type_object`$fromJSON(jsonlite::toJSON(this_object$`type`, auto_unbox = TRUE, digits = NA))
        self$`type` <- `type_object`
      }
      if (!is.null(this_object$`costPerItem`)) {
        self$`costPerItem` <- this_object$`costPerItem`
      }
      if (!is.null(this_object$`total`)) {
        self$`total` <- this_object$`total`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return OrdersStatsPriceDTO in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`type`)) {
          sprintf(
          '"type":
          %s
          ',
          jsonlite::toJSON(self$`type`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`costPerItem`)) {
          sprintf(
          '"costPerItem":
            %d
                    ',
          self$`costPerItem`
          )
        },
        if (!is.null(self$`total`)) {
          sprintf(
          '"total":
            %d
                    ',
          self$`total`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of OrdersStatsPriceDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of OrdersStatsPriceDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of OrdersStatsPriceDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`type` <- OrdersStatsPriceType$new()$fromJSON(jsonlite::toJSON(this_object$`type`, auto_unbox = TRUE, digits = NA))
      self$`costPerItem` <- this_object$`costPerItem`
      self$`total` <- this_object$`total`
      self
    },
    #' Validate JSON input with respect to OrdersStatsPriceDTO
    #'
    #' @description
    #' Validate JSON input with respect to OrdersStatsPriceDTO and throw an exception if invalid
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
    #' @return String representation of OrdersStatsPriceDTO
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
# OrdersStatsPriceDTO$unlock()
#
## Below is an example to define the print function
# OrdersStatsPriceDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# OrdersStatsPriceDTO$lock()

