#' Create a new FeedDownloadDTO
#'
#' @description
#' Информация о последней загрузке прайс-листа.
#'
#' @docType class
#' @title FeedDownloadDTO
#' @description FeedDownloadDTO Class
#' @format An \code{R6Class} generator object
#' @field status  \link{FeedStatusType} [optional]
#' @field error  \link{FeedDownloadErrorDTO} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
FeedDownloadDTO <- R6::R6Class(
  "FeedDownloadDTO",
  public = list(
    `status` = NULL,
    `error` = NULL,
    #' Initialize a new FeedDownloadDTO class.
    #'
    #' @description
    #' Initialize a new FeedDownloadDTO class.
    #'
    #' @param status status
    #' @param error error
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`status` = NULL, `error` = NULL, ...) {
      if (!is.null(`status`)) {
        if (!(`status` %in% c())) {
          stop(paste("Error! \"", `status`, "\" cannot be assigned to `status`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`status`))
        self$`status` <- `status`
      }
      if (!is.null(`error`)) {
        stopifnot(R6::is.R6(`error`))
        self$`error` <- `error`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return FeedDownloadDTO in JSON format
    #' @export
    toJSON = function() {
      FeedDownloadDTOObject <- list()
      if (!is.null(self$`status`)) {
        FeedDownloadDTOObject[["status"]] <-
          self$`status`$toJSON()
      }
      if (!is.null(self$`error`)) {
        FeedDownloadDTOObject[["error"]] <-
          self$`error`$toJSON()
      }
      FeedDownloadDTOObject
    },
    #' Deserialize JSON string into an instance of FeedDownloadDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of FeedDownloadDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of FeedDownloadDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`status`)) {
        `status_object` <- FeedStatusType$new()
        `status_object`$fromJSON(jsonlite::toJSON(this_object$`status`, auto_unbox = TRUE, digits = NA))
        self$`status` <- `status_object`
      }
      if (!is.null(this_object$`error`)) {
        `error_object` <- FeedDownloadErrorDTO$new()
        `error_object`$fromJSON(jsonlite::toJSON(this_object$`error`, auto_unbox = TRUE, digits = NA))
        self$`error` <- `error_object`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return FeedDownloadDTO in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`status`)) {
          sprintf(
          '"status":
          %s
          ',
          jsonlite::toJSON(self$`status`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`error`)) {
          sprintf(
          '"error":
          %s
          ',
          jsonlite::toJSON(self$`error`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of FeedDownloadDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of FeedDownloadDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of FeedDownloadDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`status` <- FeedStatusType$new()$fromJSON(jsonlite::toJSON(this_object$`status`, auto_unbox = TRUE, digits = NA))
      self$`error` <- FeedDownloadErrorDTO$new()$fromJSON(jsonlite::toJSON(this_object$`error`, auto_unbox = TRUE, digits = NA))
      self
    },
    #' Validate JSON input with respect to FeedDownloadDTO
    #'
    #' @description
    #' Validate JSON input with respect to FeedDownloadDTO and throw an exception if invalid
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
    #' @return String representation of FeedDownloadDTO
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
# FeedDownloadDTO$unlock()
#
## Below is an example to define the print function
# FeedDownloadDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# FeedDownloadDTO$lock()

