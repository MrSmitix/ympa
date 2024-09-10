#' Create a new FeedbackShopDTO
#'
#' @description
#' Информация о магазине.
#'
#' @docType class
#' @title FeedbackShopDTO
#' @description FeedbackShopDTO Class
#' @format An \code{R6Class} generator object
#' @field name Название магазина. character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
FeedbackShopDTO <- R6::R6Class(
  "FeedbackShopDTO",
  public = list(
    `name` = NULL,
    #' Initialize a new FeedbackShopDTO class.
    #'
    #' @description
    #' Initialize a new FeedbackShopDTO class.
    #'
    #' @param name Название магазина.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`name` = NULL, ...) {
      if (!is.null(`name`)) {
        if (!(is.character(`name`) && length(`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", `name`))
        }
        self$`name` <- `name`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return FeedbackShopDTO in JSON format
    #' @export
    toJSON = function() {
      FeedbackShopDTOObject <- list()
      if (!is.null(self$`name`)) {
        FeedbackShopDTOObject[["name"]] <-
          self$`name`
      }
      FeedbackShopDTOObject
    },
    #' Deserialize JSON string into an instance of FeedbackShopDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of FeedbackShopDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of FeedbackShopDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`name`)) {
        self$`name` <- this_object$`name`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return FeedbackShopDTO in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`name`)) {
          sprintf(
          '"name":
            "%s"
                    ',
          self$`name`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of FeedbackShopDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of FeedbackShopDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of FeedbackShopDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`name` <- this_object$`name`
      self
    },
    #' Validate JSON input with respect to FeedbackShopDTO
    #'
    #' @description
    #' Validate JSON input with respect to FeedbackShopDTO and throw an exception if invalid
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
    #' @return String representation of FeedbackShopDTO
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
# FeedbackShopDTO$unlock()
#
## Below is an example to define the print function
# FeedbackShopDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# FeedbackShopDTO$lock()

