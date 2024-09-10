#' Create a new GoodsFeedbackDescriptionDTO
#'
#' @description
#' Текстовая часть отзыва.
#'
#' @docType class
#' @title GoodsFeedbackDescriptionDTO
#' @description GoodsFeedbackDescriptionDTO Class
#' @format An \code{R6Class} generator object
#' @field advantages Описание плюсов товара в отзыве. character [optional]
#' @field disadvantages Описание минусов товара в отзыве. character [optional]
#' @field comment Комментарий в отзыве. character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
GoodsFeedbackDescriptionDTO <- R6::R6Class(
  "GoodsFeedbackDescriptionDTO",
  public = list(
    `advantages` = NULL,
    `disadvantages` = NULL,
    `comment` = NULL,
    #' Initialize a new GoodsFeedbackDescriptionDTO class.
    #'
    #' @description
    #' Initialize a new GoodsFeedbackDescriptionDTO class.
    #'
    #' @param advantages Описание плюсов товара в отзыве.
    #' @param disadvantages Описание минусов товара в отзыве.
    #' @param comment Комментарий в отзыве.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`advantages` = NULL, `disadvantages` = NULL, `comment` = NULL, ...) {
      if (!is.null(`advantages`)) {
        if (!(is.character(`advantages`) && length(`advantages`) == 1)) {
          stop(paste("Error! Invalid data for `advantages`. Must be a string:", `advantages`))
        }
        self$`advantages` <- `advantages`
      }
      if (!is.null(`disadvantages`)) {
        if (!(is.character(`disadvantages`) && length(`disadvantages`) == 1)) {
          stop(paste("Error! Invalid data for `disadvantages`. Must be a string:", `disadvantages`))
        }
        self$`disadvantages` <- `disadvantages`
      }
      if (!is.null(`comment`)) {
        if (!(is.character(`comment`) && length(`comment`) == 1)) {
          stop(paste("Error! Invalid data for `comment`. Must be a string:", `comment`))
        }
        self$`comment` <- `comment`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return GoodsFeedbackDescriptionDTO in JSON format
    #' @export
    toJSON = function() {
      GoodsFeedbackDescriptionDTOObject <- list()
      if (!is.null(self$`advantages`)) {
        GoodsFeedbackDescriptionDTOObject[["advantages"]] <-
          self$`advantages`
      }
      if (!is.null(self$`disadvantages`)) {
        GoodsFeedbackDescriptionDTOObject[["disadvantages"]] <-
          self$`disadvantages`
      }
      if (!is.null(self$`comment`)) {
        GoodsFeedbackDescriptionDTOObject[["comment"]] <-
          self$`comment`
      }
      GoodsFeedbackDescriptionDTOObject
    },
    #' Deserialize JSON string into an instance of GoodsFeedbackDescriptionDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of GoodsFeedbackDescriptionDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of GoodsFeedbackDescriptionDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`advantages`)) {
        self$`advantages` <- this_object$`advantages`
      }
      if (!is.null(this_object$`disadvantages`)) {
        self$`disadvantages` <- this_object$`disadvantages`
      }
      if (!is.null(this_object$`comment`)) {
        self$`comment` <- this_object$`comment`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return GoodsFeedbackDescriptionDTO in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`advantages`)) {
          sprintf(
          '"advantages":
            "%s"
                    ',
          self$`advantages`
          )
        },
        if (!is.null(self$`disadvantages`)) {
          sprintf(
          '"disadvantages":
            "%s"
                    ',
          self$`disadvantages`
          )
        },
        if (!is.null(self$`comment`)) {
          sprintf(
          '"comment":
            "%s"
                    ',
          self$`comment`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of GoodsFeedbackDescriptionDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of GoodsFeedbackDescriptionDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of GoodsFeedbackDescriptionDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`advantages` <- this_object$`advantages`
      self$`disadvantages` <- this_object$`disadvantages`
      self$`comment` <- this_object$`comment`
      self
    },
    #' Validate JSON input with respect to GoodsFeedbackDescriptionDTO
    #'
    #' @description
    #' Validate JSON input with respect to GoodsFeedbackDescriptionDTO and throw an exception if invalid
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
    #' @return String representation of GoodsFeedbackDescriptionDTO
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
# GoodsFeedbackDescriptionDTO$unlock()
#
## Below is an example to define the print function
# GoodsFeedbackDescriptionDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# GoodsFeedbackDescriptionDTO$lock()

