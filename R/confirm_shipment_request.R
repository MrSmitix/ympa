#' Create a new ConfirmShipmentRequest
#'
#' @description
#' Запрос для подтверждения отгрузки.
#'
#' @docType class
#' @title ConfirmShipmentRequest
#' @description ConfirmShipmentRequest Class
#' @format An \code{R6Class} generator object
#' @field externalShipmentId Идентификатор отгрузки в системе поставщика. character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ConfirmShipmentRequest <- R6::R6Class(
  "ConfirmShipmentRequest",
  public = list(
    `externalShipmentId` = NULL,
    #' Initialize a new ConfirmShipmentRequest class.
    #'
    #' @description
    #' Initialize a new ConfirmShipmentRequest class.
    #'
    #' @param externalShipmentId Идентификатор отгрузки в системе поставщика.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`externalShipmentId` = NULL, ...) {
      if (!is.null(`externalShipmentId`)) {
        if (!(is.character(`externalShipmentId`) && length(`externalShipmentId`) == 1)) {
          stop(paste("Error! Invalid data for `externalShipmentId`. Must be a string:", `externalShipmentId`))
        }
        self$`externalShipmentId` <- `externalShipmentId`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return ConfirmShipmentRequest in JSON format
    #' @export
    toJSON = function() {
      ConfirmShipmentRequestObject <- list()
      if (!is.null(self$`externalShipmentId`)) {
        ConfirmShipmentRequestObject[["externalShipmentId"]] <-
          self$`externalShipmentId`
      }
      ConfirmShipmentRequestObject
    },
    #' Deserialize JSON string into an instance of ConfirmShipmentRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of ConfirmShipmentRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of ConfirmShipmentRequest
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`externalShipmentId`)) {
        self$`externalShipmentId` <- this_object$`externalShipmentId`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return ConfirmShipmentRequest in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`externalShipmentId`)) {
          sprintf(
          '"externalShipmentId":
            "%s"
                    ',
          self$`externalShipmentId`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of ConfirmShipmentRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of ConfirmShipmentRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of ConfirmShipmentRequest
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`externalShipmentId` <- this_object$`externalShipmentId`
      self
    },
    #' Validate JSON input with respect to ConfirmShipmentRequest
    #'
    #' @description
    #' Validate JSON input with respect to ConfirmShipmentRequest and throw an exception if invalid
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
    #' @return String representation of ConfirmShipmentRequest
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
# ConfirmShipmentRequest$unlock()
#
## Below is an example to define the print function
# ConfirmShipmentRequest$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# ConfirmShipmentRequest$lock()

