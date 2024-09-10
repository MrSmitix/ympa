#' Create a new ParameterValueConstraintsDTO
#'
#' @description
#' Ограничения на значения характеристик.
#'
#' @docType class
#' @title ParameterValueConstraintsDTO
#' @description ParameterValueConstraintsDTO Class
#' @format An \code{R6Class} generator object
#' @field minValue Минимальное число. numeric [optional]
#' @field maxValue Максимальное число. numeric [optional]
#' @field maxLength Максимальная длина текста. integer [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ParameterValueConstraintsDTO <- R6::R6Class(
  "ParameterValueConstraintsDTO",
  public = list(
    `minValue` = NULL,
    `maxValue` = NULL,
    `maxLength` = NULL,
    #' Initialize a new ParameterValueConstraintsDTO class.
    #'
    #' @description
    #' Initialize a new ParameterValueConstraintsDTO class.
    #'
    #' @param minValue Минимальное число.
    #' @param maxValue Максимальное число.
    #' @param maxLength Максимальная длина текста.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`minValue` = NULL, `maxValue` = NULL, `maxLength` = NULL, ...) {
      if (!is.null(`minValue`)) {
        if (!(is.numeric(`minValue`) && length(`minValue`) == 1)) {
          stop(paste("Error! Invalid data for `minValue`. Must be a number:", `minValue`))
        }
        self$`minValue` <- `minValue`
      }
      if (!is.null(`maxValue`)) {
        if (!(is.numeric(`maxValue`) && length(`maxValue`) == 1)) {
          stop(paste("Error! Invalid data for `maxValue`. Must be a number:", `maxValue`))
        }
        self$`maxValue` <- `maxValue`
      }
      if (!is.null(`maxLength`)) {
        if (!(is.numeric(`maxLength`) && length(`maxLength`) == 1)) {
          stop(paste("Error! Invalid data for `maxLength`. Must be an integer:", `maxLength`))
        }
        self$`maxLength` <- `maxLength`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return ParameterValueConstraintsDTO in JSON format
    #' @export
    toJSON = function() {
      ParameterValueConstraintsDTOObject <- list()
      if (!is.null(self$`minValue`)) {
        ParameterValueConstraintsDTOObject[["minValue"]] <-
          self$`minValue`
      }
      if (!is.null(self$`maxValue`)) {
        ParameterValueConstraintsDTOObject[["maxValue"]] <-
          self$`maxValue`
      }
      if (!is.null(self$`maxLength`)) {
        ParameterValueConstraintsDTOObject[["maxLength"]] <-
          self$`maxLength`
      }
      ParameterValueConstraintsDTOObject
    },
    #' Deserialize JSON string into an instance of ParameterValueConstraintsDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of ParameterValueConstraintsDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of ParameterValueConstraintsDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`minValue`)) {
        self$`minValue` <- this_object$`minValue`
      }
      if (!is.null(this_object$`maxValue`)) {
        self$`maxValue` <- this_object$`maxValue`
      }
      if (!is.null(this_object$`maxLength`)) {
        self$`maxLength` <- this_object$`maxLength`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return ParameterValueConstraintsDTO in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`minValue`)) {
          sprintf(
          '"minValue":
            %d
                    ',
          self$`minValue`
          )
        },
        if (!is.null(self$`maxValue`)) {
          sprintf(
          '"maxValue":
            %d
                    ',
          self$`maxValue`
          )
        },
        if (!is.null(self$`maxLength`)) {
          sprintf(
          '"maxLength":
            %d
                    ',
          self$`maxLength`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of ParameterValueConstraintsDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of ParameterValueConstraintsDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of ParameterValueConstraintsDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`minValue` <- this_object$`minValue`
      self$`maxValue` <- this_object$`maxValue`
      self$`maxLength` <- this_object$`maxLength`
      self
    },
    #' Validate JSON input with respect to ParameterValueConstraintsDTO
    #'
    #' @description
    #' Validate JSON input with respect to ParameterValueConstraintsDTO and throw an exception if invalid
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
    #' @return String representation of ParameterValueConstraintsDTO
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
# ParameterValueConstraintsDTO$unlock()
#
## Below is an example to define the print function
# ParameterValueConstraintsDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# ParameterValueConstraintsDTO$lock()

