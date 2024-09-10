#' Create a new FeedContentErrorDTO
#'
#' @description
#' Информация об ошибке в содержимом прайс-листа. Выводится, если параметр `content status=ERROR`. 
#'
#' @docType class
#' @title FeedContentErrorDTO
#' @description FeedContentErrorDTO Class
#' @format An \code{R6Class} generator object
#' @field type  \link{FeedContentErrorType} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
FeedContentErrorDTO <- R6::R6Class(
  "FeedContentErrorDTO",
  public = list(
    `type` = NULL,
    #' Initialize a new FeedContentErrorDTO class.
    #'
    #' @description
    #' Initialize a new FeedContentErrorDTO class.
    #'
    #' @param type type
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`type` = NULL, ...) {
      if (!is.null(`type`)) {
        if (!(`type` %in% c())) {
          stop(paste("Error! \"", `type`, "\" cannot be assigned to `type`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`type`))
        self$`type` <- `type`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return FeedContentErrorDTO in JSON format
    #' @export
    toJSON = function() {
      FeedContentErrorDTOObject <- list()
      if (!is.null(self$`type`)) {
        FeedContentErrorDTOObject[["type"]] <-
          self$`type`$toJSON()
      }
      FeedContentErrorDTOObject
    },
    #' Deserialize JSON string into an instance of FeedContentErrorDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of FeedContentErrorDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of FeedContentErrorDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`type`)) {
        `type_object` <- FeedContentErrorType$new()
        `type_object`$fromJSON(jsonlite::toJSON(this_object$`type`, auto_unbox = TRUE, digits = NA))
        self$`type` <- `type_object`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return FeedContentErrorDTO in JSON format
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
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of FeedContentErrorDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of FeedContentErrorDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of FeedContentErrorDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`type` <- FeedContentErrorType$new()$fromJSON(jsonlite::toJSON(this_object$`type`, auto_unbox = TRUE, digits = NA))
      self
    },
    #' Validate JSON input with respect to FeedContentErrorDTO
    #'
    #' @description
    #' Validate JSON input with respect to FeedContentErrorDTO and throw an exception if invalid
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
    #' @return String representation of FeedContentErrorDTO
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
# FeedContentErrorDTO$unlock()
#
## Below is an example to define the print function
# FeedContentErrorDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# FeedContentErrorDTO$lock()

