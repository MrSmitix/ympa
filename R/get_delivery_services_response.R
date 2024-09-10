#' Create a new GetDeliveryServicesResponse
#'
#' @description
#' Ответ на запрос списка служб доставки.
#'
#' @docType class
#' @title GetDeliveryServicesResponse
#' @description GetDeliveryServicesResponse Class
#' @format An \code{R6Class} generator object
#' @field result  \link{DeliveryServicesDTO} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
GetDeliveryServicesResponse <- R6::R6Class(
  "GetDeliveryServicesResponse",
  public = list(
    `result` = NULL,
    #' Initialize a new GetDeliveryServicesResponse class.
    #'
    #' @description
    #' Initialize a new GetDeliveryServicesResponse class.
    #'
    #' @param result result
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`result` = NULL, ...) {
      if (!is.null(`result`)) {
        stopifnot(R6::is.R6(`result`))
        self$`result` <- `result`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return GetDeliveryServicesResponse in JSON format
    #' @export
    toJSON = function() {
      GetDeliveryServicesResponseObject <- list()
      if (!is.null(self$`result`)) {
        GetDeliveryServicesResponseObject[["result"]] <-
          self$`result`$toJSON()
      }
      GetDeliveryServicesResponseObject
    },
    #' Deserialize JSON string into an instance of GetDeliveryServicesResponse
    #'
    #' @description
    #' Deserialize JSON string into an instance of GetDeliveryServicesResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of GetDeliveryServicesResponse
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`result`)) {
        `result_object` <- DeliveryServicesDTO$new()
        `result_object`$fromJSON(jsonlite::toJSON(this_object$`result`, auto_unbox = TRUE, digits = NA))
        self$`result` <- `result_object`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return GetDeliveryServicesResponse in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`result`)) {
          sprintf(
          '"result":
          %s
          ',
          jsonlite::toJSON(self$`result`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of GetDeliveryServicesResponse
    #'
    #' @description
    #' Deserialize JSON string into an instance of GetDeliveryServicesResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of GetDeliveryServicesResponse
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`result` <- DeliveryServicesDTO$new()$fromJSON(jsonlite::toJSON(this_object$`result`, auto_unbox = TRUE, digits = NA))
      self
    },
    #' Validate JSON input with respect to GetDeliveryServicesResponse
    #'
    #' @description
    #' Validate JSON input with respect to GetDeliveryServicesResponse and throw an exception if invalid
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
    #' @return String representation of GetDeliveryServicesResponse
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
# GetDeliveryServicesResponse$unlock()
#
## Below is an example to define the print function
# GetDeliveryServicesResponse$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# GetDeliveryServicesResponse$lock()

