#' Create a new UpdateOrderStatusRequest
#'
#' @description
#' UpdateOrderStatusRequest Class
#'
#' @docType class
#' @title UpdateOrderStatusRequest
#' @description UpdateOrderStatusRequest Class
#' @format An \code{R6Class} generator object
#' @field order  \link{OrderStatusChangeDTO}
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
UpdateOrderStatusRequest <- R6::R6Class(
  "UpdateOrderStatusRequest",
  public = list(
    `order` = NULL,
    #' Initialize a new UpdateOrderStatusRequest class.
    #'
    #' @description
    #' Initialize a new UpdateOrderStatusRequest class.
    #'
    #' @param order order
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`order`, ...) {
      if (!missing(`order`)) {
        stopifnot(R6::is.R6(`order`))
        self$`order` <- `order`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return UpdateOrderStatusRequest in JSON format
    #' @export
    toJSON = function() {
      UpdateOrderStatusRequestObject <- list()
      if (!is.null(self$`order`)) {
        UpdateOrderStatusRequestObject[["order"]] <-
          self$`order`$toJSON()
      }
      UpdateOrderStatusRequestObject
    },
    #' Deserialize JSON string into an instance of UpdateOrderStatusRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of UpdateOrderStatusRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of UpdateOrderStatusRequest
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`order`)) {
        `order_object` <- OrderStatusChangeDTO$new()
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
    #' @return UpdateOrderStatusRequest in JSON format
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
    #' Deserialize JSON string into an instance of UpdateOrderStatusRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of UpdateOrderStatusRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of UpdateOrderStatusRequest
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`order` <- OrderStatusChangeDTO$new()$fromJSON(jsonlite::toJSON(this_object$`order`, auto_unbox = TRUE, digits = NA))
      self
    },
    #' Validate JSON input with respect to UpdateOrderStatusRequest
    #'
    #' @description
    #' Validate JSON input with respect to UpdateOrderStatusRequest and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `order`
      if (!is.null(input_json$`order`)) {
        stopifnot(R6::is.R6(input_json$`order`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for UpdateOrderStatusRequest: the required field `order` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of UpdateOrderStatusRequest
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
      # check if the required `order` is null
      if (is.null(self$`order`)) {
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
      # check if the required `order` is null
      if (is.null(self$`order`)) {
        invalid_fields["order"] <- "Non-nullable required field `order` cannot be null."
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
# UpdateOrderStatusRequest$unlock()
#
## Below is an example to define the print function
# UpdateOrderStatusRequest$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# UpdateOrderStatusRequest$lock()

