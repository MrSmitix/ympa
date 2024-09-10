#' Create a new TimePeriodDTO
#'
#' @description
#' Временной отрезок с комментарием. Требования к содержанию комментария зависят от контекста использования параметра и указаны в описании поля, которое его содержит.
#'
#' @docType class
#' @title TimePeriodDTO
#' @description TimePeriodDTO Class
#' @format An \code{R6Class} generator object
#' @field timePeriod Продолжительность в указанных единицах. integer
#' @field timeUnit  \link{TimeUnitType}
#' @field comment Комментарий. character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
TimePeriodDTO <- R6::R6Class(
  "TimePeriodDTO",
  public = list(
    `timePeriod` = NULL,
    `timeUnit` = NULL,
    `comment` = NULL,
    #' Initialize a new TimePeriodDTO class.
    #'
    #' @description
    #' Initialize a new TimePeriodDTO class.
    #'
    #' @param timePeriod Продолжительность в указанных единицах.
    #' @param timeUnit timeUnit
    #' @param comment Комментарий.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`timePeriod`, `timeUnit`, `comment` = NULL, ...) {
      if (!missing(`timePeriod`)) {
        if (!(is.numeric(`timePeriod`) && length(`timePeriod`) == 1)) {
          stop(paste("Error! Invalid data for `timePeriod`. Must be an integer:", `timePeriod`))
        }
        self$`timePeriod` <- `timePeriod`
      }
      if (!missing(`timeUnit`)) {
        if (!(`timeUnit` %in% c())) {
          stop(paste("Error! \"", `timeUnit`, "\" cannot be assigned to `timeUnit`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`timeUnit`))
        self$`timeUnit` <- `timeUnit`
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
    #' @return TimePeriodDTO in JSON format
    #' @export
    toJSON = function() {
      TimePeriodDTOObject <- list()
      if (!is.null(self$`timePeriod`)) {
        TimePeriodDTOObject[["timePeriod"]] <-
          self$`timePeriod`
      }
      if (!is.null(self$`timeUnit`)) {
        TimePeriodDTOObject[["timeUnit"]] <-
          self$`timeUnit`$toJSON()
      }
      if (!is.null(self$`comment`)) {
        TimePeriodDTOObject[["comment"]] <-
          self$`comment`
      }
      TimePeriodDTOObject
    },
    #' Deserialize JSON string into an instance of TimePeriodDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of TimePeriodDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of TimePeriodDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`timePeriod`)) {
        self$`timePeriod` <- this_object$`timePeriod`
      }
      if (!is.null(this_object$`timeUnit`)) {
        `timeunit_object` <- TimeUnitType$new()
        `timeunit_object`$fromJSON(jsonlite::toJSON(this_object$`timeUnit`, auto_unbox = TRUE, digits = NA))
        self$`timeUnit` <- `timeunit_object`
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
    #' @return TimePeriodDTO in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`timePeriod`)) {
          sprintf(
          '"timePeriod":
            %d
                    ',
          self$`timePeriod`
          )
        },
        if (!is.null(self$`timeUnit`)) {
          sprintf(
          '"timeUnit":
          %s
          ',
          jsonlite::toJSON(self$`timeUnit`$toJSON(), auto_unbox = TRUE, digits = NA)
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
    #' Deserialize JSON string into an instance of TimePeriodDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of TimePeriodDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of TimePeriodDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`timePeriod` <- this_object$`timePeriod`
      self$`timeUnit` <- TimeUnitType$new()$fromJSON(jsonlite::toJSON(this_object$`timeUnit`, auto_unbox = TRUE, digits = NA))
      self$`comment` <- this_object$`comment`
      self
    },
    #' Validate JSON input with respect to TimePeriodDTO
    #'
    #' @description
    #' Validate JSON input with respect to TimePeriodDTO and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `timePeriod`
      if (!is.null(input_json$`timePeriod`)) {
        if (!(is.numeric(input_json$`timePeriod`) && length(input_json$`timePeriod`) == 1)) {
          stop(paste("Error! Invalid data for `timePeriod`. Must be an integer:", input_json$`timePeriod`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for TimePeriodDTO: the required field `timePeriod` is missing."))
      }
      # check the required field `timeUnit`
      if (!is.null(input_json$`timeUnit`)) {
        stopifnot(R6::is.R6(input_json$`timeUnit`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for TimePeriodDTO: the required field `timeUnit` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of TimePeriodDTO
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
      # check if the required `timePeriod` is null
      if (is.null(self$`timePeriod`)) {
        return(FALSE)
      }

      # check if the required `timeUnit` is null
      if (is.null(self$`timeUnit`)) {
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
      # check if the required `timePeriod` is null
      if (is.null(self$`timePeriod`)) {
        invalid_fields["timePeriod"] <- "Non-nullable required field `timePeriod` cannot be null."
      }

      # check if the required `timeUnit` is null
      if (is.null(self$`timeUnit`)) {
        invalid_fields["timeUnit"] <- "Non-nullable required field `timeUnit` cannot be null."
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
# TimePeriodDTO$unlock()
#
## Below is an example to define the print function
# TimePeriodDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# TimePeriodDTO$lock()

