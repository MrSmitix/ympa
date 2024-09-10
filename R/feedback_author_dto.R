#' Create a new FeedbackAuthorDTO
#'
#' @description
#' Информация об авторе отзыва.  Если отзыв оставлен анонимно, параметр не возвращается. 
#'
#' @docType class
#' @title FeedbackAuthorDTO
#' @description FeedbackAuthorDTO Class
#' @format An \code{R6Class} generator object
#' @field name Имя автора отзыва. character [optional]
#' @field region  \link{RegionDTO} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
FeedbackAuthorDTO <- R6::R6Class(
  "FeedbackAuthorDTO",
  public = list(
    `name` = NULL,
    `region` = NULL,
    #' Initialize a new FeedbackAuthorDTO class.
    #'
    #' @description
    #' Initialize a new FeedbackAuthorDTO class.
    #'
    #' @param name Имя автора отзыва.
    #' @param region region
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`name` = NULL, `region` = NULL, ...) {
      if (!is.null(`name`)) {
        if (!(is.character(`name`) && length(`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", `name`))
        }
        self$`name` <- `name`
      }
      if (!is.null(`region`)) {
        stopifnot(R6::is.R6(`region`))
        self$`region` <- `region`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return FeedbackAuthorDTO in JSON format
    #' @export
    toJSON = function() {
      FeedbackAuthorDTOObject <- list()
      if (!is.null(self$`name`)) {
        FeedbackAuthorDTOObject[["name"]] <-
          self$`name`
      }
      if (!is.null(self$`region`)) {
        FeedbackAuthorDTOObject[["region"]] <-
          self$`region`$toJSON()
      }
      FeedbackAuthorDTOObject
    },
    #' Deserialize JSON string into an instance of FeedbackAuthorDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of FeedbackAuthorDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of FeedbackAuthorDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`name`)) {
        self$`name` <- this_object$`name`
      }
      if (!is.null(this_object$`region`)) {
        `region_object` <- RegionDTO$new()
        `region_object`$fromJSON(jsonlite::toJSON(this_object$`region`, auto_unbox = TRUE, digits = NA))
        self$`region` <- `region_object`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return FeedbackAuthorDTO in JSON format
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
        },
        if (!is.null(self$`region`)) {
          sprintf(
          '"region":
          %s
          ',
          jsonlite::toJSON(self$`region`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of FeedbackAuthorDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of FeedbackAuthorDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of FeedbackAuthorDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`name` <- this_object$`name`
      self$`region` <- RegionDTO$new()$fromJSON(jsonlite::toJSON(this_object$`region`, auto_unbox = TRUE, digits = NA))
      self
    },
    #' Validate JSON input with respect to FeedbackAuthorDTO
    #'
    #' @description
    #' Validate JSON input with respect to FeedbackAuthorDTO and throw an exception if invalid
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
    #' @return String representation of FeedbackAuthorDTO
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
# FeedbackAuthorDTO$unlock()
#
## Below is an example to define the print function
# FeedbackAuthorDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# FeedbackAuthorDTO$lock()

