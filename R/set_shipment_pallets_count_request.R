#' Create a new SetShipmentPalletsCountRequest
#'
#' @description
#' Запрос на передачу количества упаковок в отгрузке.
#'
#' @docType class
#' @title SetShipmentPalletsCountRequest
#' @description SetShipmentPalletsCountRequest Class
#' @format An \code{R6Class} generator object
#' @field placesCount Количество упаковок в отгрузке. integer
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
SetShipmentPalletsCountRequest <- R6::R6Class(
  "SetShipmentPalletsCountRequest",
  public = list(
    `placesCount` = NULL,
    #' Initialize a new SetShipmentPalletsCountRequest class.
    #'
    #' @description
    #' Initialize a new SetShipmentPalletsCountRequest class.
    #'
    #' @param placesCount Количество упаковок в отгрузке.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`placesCount`, ...) {
      if (!missing(`placesCount`)) {
        if (!(is.numeric(`placesCount`) && length(`placesCount`) == 1)) {
          stop(paste("Error! Invalid data for `placesCount`. Must be an integer:", `placesCount`))
        }
        self$`placesCount` <- `placesCount`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return SetShipmentPalletsCountRequest in JSON format
    #' @export
    toJSON = function() {
      SetShipmentPalletsCountRequestObject <- list()
      if (!is.null(self$`placesCount`)) {
        SetShipmentPalletsCountRequestObject[["placesCount"]] <-
          self$`placesCount`
      }
      SetShipmentPalletsCountRequestObject
    },
    #' Deserialize JSON string into an instance of SetShipmentPalletsCountRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of SetShipmentPalletsCountRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of SetShipmentPalletsCountRequest
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`placesCount`)) {
        self$`placesCount` <- this_object$`placesCount`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return SetShipmentPalletsCountRequest in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`placesCount`)) {
          sprintf(
          '"placesCount":
            %d
                    ',
          self$`placesCount`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of SetShipmentPalletsCountRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of SetShipmentPalletsCountRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of SetShipmentPalletsCountRequest
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`placesCount` <- this_object$`placesCount`
      self
    },
    #' Validate JSON input with respect to SetShipmentPalletsCountRequest
    #'
    #' @description
    #' Validate JSON input with respect to SetShipmentPalletsCountRequest and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `placesCount`
      if (!is.null(input_json$`placesCount`)) {
        if (!(is.numeric(input_json$`placesCount`) && length(input_json$`placesCount`) == 1)) {
          stop(paste("Error! Invalid data for `placesCount`. Must be an integer:", input_json$`placesCount`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for SetShipmentPalletsCountRequest: the required field `placesCount` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of SetShipmentPalletsCountRequest
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
      # check if the required `placesCount` is null
      if (is.null(self$`placesCount`)) {
        return(FALSE)
      }

      if (self$`placesCount` < 0) {
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
      # check if the required `placesCount` is null
      if (is.null(self$`placesCount`)) {
        invalid_fields["placesCount"] <- "Non-nullable required field `placesCount` cannot be null."
      }

      if (self$`placesCount` < 0) {
        invalid_fields["placesCount"] <- "Invalid value for `placesCount`, must be bigger than or equal to 0."
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
# SetShipmentPalletsCountRequest$unlock()
#
## Below is an example to define the print function
# SetShipmentPalletsCountRequest$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# SetShipmentPalletsCountRequest$lock()

