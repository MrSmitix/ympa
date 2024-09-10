#' Create a new OrderStatusChangeDeliveryDTO
#'
#' @description
#' Информация о доставке.
#'
#' @docType class
#' @title OrderStatusChangeDeliveryDTO
#' @description OrderStatusChangeDeliveryDTO Class
#' @format An \code{R6Class} generator object
#' @field dates  \link{OrderStatusChangeDeliveryDatesDTO} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
OrderStatusChangeDeliveryDTO <- R6::R6Class(
  "OrderStatusChangeDeliveryDTO",
  public = list(
    `dates` = NULL,
    #' Initialize a new OrderStatusChangeDeliveryDTO class.
    #'
    #' @description
    #' Initialize a new OrderStatusChangeDeliveryDTO class.
    #'
    #' @param dates dates
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`dates` = NULL, ...) {
      if (!is.null(`dates`)) {
        stopifnot(R6::is.R6(`dates`))
        self$`dates` <- `dates`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return OrderStatusChangeDeliveryDTO in JSON format
    #' @export
    toJSON = function() {
      OrderStatusChangeDeliveryDTOObject <- list()
      if (!is.null(self$`dates`)) {
        OrderStatusChangeDeliveryDTOObject[["dates"]] <-
          self$`dates`$toJSON()
      }
      OrderStatusChangeDeliveryDTOObject
    },
    #' Deserialize JSON string into an instance of OrderStatusChangeDeliveryDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of OrderStatusChangeDeliveryDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of OrderStatusChangeDeliveryDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`dates`)) {
        `dates_object` <- OrderStatusChangeDeliveryDatesDTO$new()
        `dates_object`$fromJSON(jsonlite::toJSON(this_object$`dates`, auto_unbox = TRUE, digits = NA))
        self$`dates` <- `dates_object`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return OrderStatusChangeDeliveryDTO in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`dates`)) {
          sprintf(
          '"dates":
          %s
          ',
          jsonlite::toJSON(self$`dates`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of OrderStatusChangeDeliveryDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of OrderStatusChangeDeliveryDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of OrderStatusChangeDeliveryDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`dates` <- OrderStatusChangeDeliveryDatesDTO$new()$fromJSON(jsonlite::toJSON(this_object$`dates`, auto_unbox = TRUE, digits = NA))
      self
    },
    #' Validate JSON input with respect to OrderStatusChangeDeliveryDTO
    #'
    #' @description
    #' Validate JSON input with respect to OrderStatusChangeDeliveryDTO and throw an exception if invalid
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
    #' @return String representation of OrderStatusChangeDeliveryDTO
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
# OrderStatusChangeDeliveryDTO$unlock()
#
## Below is an example to define the print function
# OrderStatusChangeDeliveryDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# OrderStatusChangeDeliveryDTO$lock()

