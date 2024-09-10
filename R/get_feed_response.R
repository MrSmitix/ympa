#' Create a new GetFeedResponse
#'
#' @description
#' Ответ на запрос информации о прайс-листе.
#'
#' @docType class
#' @title GetFeedResponse
#' @description GetFeedResponse Class
#' @format An \code{R6Class} generator object
#' @field feed  \link{FeedDTO} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
GetFeedResponse <- R6::R6Class(
  "GetFeedResponse",
  public = list(
    `feed` = NULL,
    #' Initialize a new GetFeedResponse class.
    #'
    #' @description
    #' Initialize a new GetFeedResponse class.
    #'
    #' @param feed feed
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`feed` = NULL, ...) {
      if (!is.null(`feed`)) {
        stopifnot(R6::is.R6(`feed`))
        self$`feed` <- `feed`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return GetFeedResponse in JSON format
    #' @export
    toJSON = function() {
      GetFeedResponseObject <- list()
      if (!is.null(self$`feed`)) {
        GetFeedResponseObject[["feed"]] <-
          self$`feed`$toJSON()
      }
      GetFeedResponseObject
    },
    #' Deserialize JSON string into an instance of GetFeedResponse
    #'
    #' @description
    #' Deserialize JSON string into an instance of GetFeedResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of GetFeedResponse
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`feed`)) {
        `feed_object` <- FeedDTO$new()
        `feed_object`$fromJSON(jsonlite::toJSON(this_object$`feed`, auto_unbox = TRUE, digits = NA))
        self$`feed` <- `feed_object`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return GetFeedResponse in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`feed`)) {
          sprintf(
          '"feed":
          %s
          ',
          jsonlite::toJSON(self$`feed`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of GetFeedResponse
    #'
    #' @description
    #' Deserialize JSON string into an instance of GetFeedResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of GetFeedResponse
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`feed` <- FeedDTO$new()$fromJSON(jsonlite::toJSON(this_object$`feed`, auto_unbox = TRUE, digits = NA))
      self
    },
    #' Validate JSON input with respect to GetFeedResponse
    #'
    #' @description
    #' Validate JSON input with respect to GetFeedResponse and throw an exception if invalid
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
    #' @return String representation of GetFeedResponse
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
# GetFeedResponse$unlock()
#
## Below is an example to define the print function
# GetFeedResponse$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# GetFeedResponse$lock()

