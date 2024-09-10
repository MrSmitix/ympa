#' Create a new AgeDTO
#'
#' @description
#' Возраст в заданных единицах измерения.
#'
#' @docType class
#' @title AgeDTO
#' @description AgeDTO Class
#' @format An \code{R6Class} generator object
#' @field value Значение. numeric
#' @field ageUnit  \link{AgeUnitType}
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
AgeDTO <- R6::R6Class(
  "AgeDTO",
  public = list(
    `value` = NULL,
    `ageUnit` = NULL,
    #' Initialize a new AgeDTO class.
    #'
    #' @description
    #' Initialize a new AgeDTO class.
    #'
    #' @param value Значение.
    #' @param ageUnit ageUnit
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`value`, `ageUnit`, ...) {
      if (!missing(`value`)) {
        self$`value` <- `value`
      }
      if (!missing(`ageUnit`)) {
        if (!(`ageUnit` %in% c())) {
          stop(paste("Error! \"", `ageUnit`, "\" cannot be assigned to `ageUnit`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`ageUnit`))
        self$`ageUnit` <- `ageUnit`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return AgeDTO in JSON format
    #' @export
    toJSON = function() {
      AgeDTOObject <- list()
      if (!is.null(self$`value`)) {
        AgeDTOObject[["value"]] <-
          self$`value`
      }
      if (!is.null(self$`ageUnit`)) {
        AgeDTOObject[["ageUnit"]] <-
          self$`ageUnit`$toJSON()
      }
      AgeDTOObject
    },
    #' Deserialize JSON string into an instance of AgeDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of AgeDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of AgeDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`value`)) {
        self$`value` <- this_object$`value`
      }
      if (!is.null(this_object$`ageUnit`)) {
        `ageunit_object` <- AgeUnitType$new()
        `ageunit_object`$fromJSON(jsonlite::toJSON(this_object$`ageUnit`, auto_unbox = TRUE, digits = NA))
        self$`ageUnit` <- `ageunit_object`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return AgeDTO in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`value`)) {
          sprintf(
          '"value":
            %d
                    ',
          self$`value`
          )
        },
        if (!is.null(self$`ageUnit`)) {
          sprintf(
          '"ageUnit":
          %s
          ',
          jsonlite::toJSON(self$`ageUnit`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of AgeDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of AgeDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of AgeDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`value` <- this_object$`value`
      self$`ageUnit` <- AgeUnitType$new()$fromJSON(jsonlite::toJSON(this_object$`ageUnit`, auto_unbox = TRUE, digits = NA))
      self
    },
    #' Validate JSON input with respect to AgeDTO
    #'
    #' @description
    #' Validate JSON input with respect to AgeDTO and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `value`
      if (!is.null(input_json$`value`)) {
      } else {
        stop(paste("The JSON input `", input, "` is invalid for AgeDTO: the required field `value` is missing."))
      }
      # check the required field `ageUnit`
      if (!is.null(input_json$`ageUnit`)) {
        stopifnot(R6::is.R6(input_json$`ageUnit`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for AgeDTO: the required field `ageUnit` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of AgeDTO
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
      # check if the required `value` is null
      if (is.null(self$`value`)) {
        return(FALSE)
      }

      if (self$`value` < 0) {
        return(FALSE)
      }

      # check if the required `ageUnit` is null
      if (is.null(self$`ageUnit`)) {
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
      # check if the required `value` is null
      if (is.null(self$`value`)) {
        invalid_fields["value"] <- "Non-nullable required field `value` cannot be null."
      }

      if (self$`value` < 0) {
        invalid_fields["value"] <- "Invalid value for `value`, must be bigger than or equal to 0."
      }

      # check if the required `ageUnit` is null
      if (is.null(self$`ageUnit`)) {
        invalid_fields["ageUnit"] <- "Non-nullable required field `ageUnit` cannot be null."
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
# AgeDTO$unlock()
#
## Below is an example to define the print function
# AgeDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# AgeDTO$lock()

