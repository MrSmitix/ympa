#' Create a new FeedbackCommentAuthorDTO
#'
#' @description
#' Информация об авторе комментария.
#'
#' @docType class
#' @title FeedbackCommentAuthorDTO
#' @description FeedbackCommentAuthorDTO Class
#' @format An \code{R6Class} generator object
#' @field type  \link{FeedbackCommentAuthorType} [optional]
#' @field name Имя автора отзыва или название магазина. character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
FeedbackCommentAuthorDTO <- R6::R6Class(
  "FeedbackCommentAuthorDTO",
  public = list(
    `type` = NULL,
    `name` = NULL,
    #' Initialize a new FeedbackCommentAuthorDTO class.
    #'
    #' @description
    #' Initialize a new FeedbackCommentAuthorDTO class.
    #'
    #' @param type type
    #' @param name Имя автора отзыва или название магазина.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`type` = NULL, `name` = NULL, ...) {
      if (!is.null(`type`)) {
        if (!(`type` %in% c())) {
          stop(paste("Error! \"", `type`, "\" cannot be assigned to `type`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`type`))
        self$`type` <- `type`
      }
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
    #' @return FeedbackCommentAuthorDTO in JSON format
    #' @export
    toJSON = function() {
      FeedbackCommentAuthorDTOObject <- list()
      if (!is.null(self$`type`)) {
        FeedbackCommentAuthorDTOObject[["type"]] <-
          self$`type`$toJSON()
      }
      if (!is.null(self$`name`)) {
        FeedbackCommentAuthorDTOObject[["name"]] <-
          self$`name`
      }
      FeedbackCommentAuthorDTOObject
    },
    #' Deserialize JSON string into an instance of FeedbackCommentAuthorDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of FeedbackCommentAuthorDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of FeedbackCommentAuthorDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`type`)) {
        `type_object` <- FeedbackCommentAuthorType$new()
        `type_object`$fromJSON(jsonlite::toJSON(this_object$`type`, auto_unbox = TRUE, digits = NA))
        self$`type` <- `type_object`
      }
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
    #' @return FeedbackCommentAuthorDTO in JSON format
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
        },
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
    #' Deserialize JSON string into an instance of FeedbackCommentAuthorDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of FeedbackCommentAuthorDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of FeedbackCommentAuthorDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`type` <- FeedbackCommentAuthorType$new()$fromJSON(jsonlite::toJSON(this_object$`type`, auto_unbox = TRUE, digits = NA))
      self$`name` <- this_object$`name`
      self
    },
    #' Validate JSON input with respect to FeedbackCommentAuthorDTO
    #'
    #' @description
    #' Validate JSON input with respect to FeedbackCommentAuthorDTO and throw an exception if invalid
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
    #' @return String representation of FeedbackCommentAuthorDTO
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
# FeedbackCommentAuthorDTO$unlock()
#
## Below is an example to define the print function
# FeedbackCommentAuthorDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# FeedbackCommentAuthorDTO$lock()

