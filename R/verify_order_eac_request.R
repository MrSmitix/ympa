#' Create a new VerifyOrderEacRequest
#'
#' @description
#' VerifyOrderEacRequest Class
#'
#' @docType class
#' @title VerifyOrderEacRequest
#' @description VerifyOrderEacRequest Class
#' @format An \code{R6Class} generator object
#' @field code Код для подтверждения ЭАПП. character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
VerifyOrderEacRequest <- R6::R6Class(
  "VerifyOrderEacRequest",
  public = list(
    `code` = NULL,
    #' Initialize a new VerifyOrderEacRequest class.
    #'
    #' @description
    #' Initialize a new VerifyOrderEacRequest class.
    #'
    #' @param code Код для подтверждения ЭАПП.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`code` = NULL, ...) {
      if (!is.null(`code`)) {
        if (!(is.character(`code`) && length(`code`) == 1)) {
          stop(paste("Error! Invalid data for `code`. Must be a string:", `code`))
        }
        self$`code` <- `code`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return VerifyOrderEacRequest in JSON format
    #' @export
    toJSON = function() {
      VerifyOrderEacRequestObject <- list()
      if (!is.null(self$`code`)) {
        VerifyOrderEacRequestObject[["code"]] <-
          self$`code`
      }
      VerifyOrderEacRequestObject
    },
    #' Deserialize JSON string into an instance of VerifyOrderEacRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of VerifyOrderEacRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of VerifyOrderEacRequest
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`code`)) {
        self$`code` <- this_object$`code`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return VerifyOrderEacRequest in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`code`)) {
          sprintf(
          '"code":
            "%s"
                    ',
          self$`code`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of VerifyOrderEacRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of VerifyOrderEacRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of VerifyOrderEacRequest
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`code` <- this_object$`code`
      self
    },
    #' Validate JSON input with respect to VerifyOrderEacRequest
    #'
    #' @description
    #' Validate JSON input with respect to VerifyOrderEacRequest and throw an exception if invalid
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
    #' @return String representation of VerifyOrderEacRequest
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
# VerifyOrderEacRequest$unlock()
#
## Below is an example to define the print function
# VerifyOrderEacRequest$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# VerifyOrderEacRequest$lock()

