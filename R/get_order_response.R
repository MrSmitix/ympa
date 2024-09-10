#' Create a new GetOrderResponse
#'
#' @description
#' GetOrderResponse Class
#'
#' @docType class
#' @title GetOrderResponse
#' @description GetOrderResponse Class
#' @format An \code{R6Class} generator object
#' @field order  \link{OrderDTO} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
GetOrderResponse <- R6::R6Class(
  "GetOrderResponse",
  public = list(
    `order` = NULL,
    #' Initialize a new GetOrderResponse class.
    #'
    #' @description
    #' Initialize a new GetOrderResponse class.
    #'
    #' @param order order
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`order` = NULL, ...) {
      if (!is.null(`order`)) {
        stopifnot(R6::is.R6(`order`))
        self$`order` <- `order`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return GetOrderResponse in JSON format
    #' @export
    toJSON = function() {
      GetOrderResponseObject <- list()
      if (!is.null(self$`order`)) {
        GetOrderResponseObject[["order"]] <-
          self$`order`$toJSON()
      }
      GetOrderResponseObject
    },
    #' Deserialize JSON string into an instance of GetOrderResponse
    #'
    #' @description
    #' Deserialize JSON string into an instance of GetOrderResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of GetOrderResponse
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`order`)) {
        `order_object` <- OrderDTO$new()
        `order_object`$fromJSON(jsonlite::toJSON(this_object$`order`, auto_unbox = TRUE, digits = NA))
        self$`order` <- `order_object`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return GetOrderResponse in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`order`)) {
          sprintf(
          '"order":
          %s
          ',
          jsonlite::toJSON(self$`order`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of GetOrderResponse
    #'
    #' @description
    #' Deserialize JSON string into an instance of GetOrderResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of GetOrderResponse
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`order` <- OrderDTO$new()$fromJSON(jsonlite::toJSON(this_object$`order`, auto_unbox = TRUE, digits = NA))
      self
    },
    #' Validate JSON input with respect to GetOrderResponse
    #'
    #' @description
    #' Validate JSON input with respect to GetOrderResponse and throw an exception if invalid
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
    #' @return String representation of GetOrderResponse
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
# GetOrderResponse$unlock()
#
## Below is an example to define the print function
# GetOrderResponse$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# GetOrderResponse$lock()

