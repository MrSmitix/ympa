#' Create a new TurnoverDTO
#'
#' @description
#' Информация об оборачиваемости товара.
#'
#' @docType class
#' @title TurnoverDTO
#' @description TurnoverDTO Class
#' @format An \code{R6Class} generator object
#' @field turnover  \link{TurnoverType}
#' @field turnoverDays Значение в днях. [Что это за число?](https://yandex.ru/support/marketplace/analytics/turnover.html) numeric [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
TurnoverDTO <- R6::R6Class(
  "TurnoverDTO",
  public = list(
    `turnover` = NULL,
    `turnoverDays` = NULL,
    #' Initialize a new TurnoverDTO class.
    #'
    #' @description
    #' Initialize a new TurnoverDTO class.
    #'
    #' @param turnover turnover
    #' @param turnoverDays Значение в днях. [Что это за число?](https://yandex.ru/support/marketplace/analytics/turnover.html)
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`turnover`, `turnoverDays` = NULL, ...) {
      if (!missing(`turnover`)) {
        if (!(`turnover` %in% c())) {
          stop(paste("Error! \"", `turnover`, "\" cannot be assigned to `turnover`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`turnover`))
        self$`turnover` <- `turnover`
      }
      if (!is.null(`turnoverDays`)) {
        if (!(is.numeric(`turnoverDays`) && length(`turnoverDays`) == 1)) {
          stop(paste("Error! Invalid data for `turnoverDays`. Must be a number:", `turnoverDays`))
        }
        self$`turnoverDays` <- `turnoverDays`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return TurnoverDTO in JSON format
    #' @export
    toJSON = function() {
      TurnoverDTOObject <- list()
      if (!is.null(self$`turnover`)) {
        TurnoverDTOObject[["turnover"]] <-
          self$`turnover`$toJSON()
      }
      if (!is.null(self$`turnoverDays`)) {
        TurnoverDTOObject[["turnoverDays"]] <-
          self$`turnoverDays`
      }
      TurnoverDTOObject
    },
    #' Deserialize JSON string into an instance of TurnoverDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of TurnoverDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of TurnoverDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`turnover`)) {
        `turnover_object` <- TurnoverType$new()
        `turnover_object`$fromJSON(jsonlite::toJSON(this_object$`turnover`, auto_unbox = TRUE, digits = NA))
        self$`turnover` <- `turnover_object`
      }
      if (!is.null(this_object$`turnoverDays`)) {
        self$`turnoverDays` <- this_object$`turnoverDays`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return TurnoverDTO in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`turnover`)) {
          sprintf(
          '"turnover":
          %s
          ',
          jsonlite::toJSON(self$`turnover`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`turnoverDays`)) {
          sprintf(
          '"turnoverDays":
            %d
                    ',
          self$`turnoverDays`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of TurnoverDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of TurnoverDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of TurnoverDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`turnover` <- TurnoverType$new()$fromJSON(jsonlite::toJSON(this_object$`turnover`, auto_unbox = TRUE, digits = NA))
      self$`turnoverDays` <- this_object$`turnoverDays`
      self
    },
    #' Validate JSON input with respect to TurnoverDTO
    #'
    #' @description
    #' Validate JSON input with respect to TurnoverDTO and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `turnover`
      if (!is.null(input_json$`turnover`)) {
        stopifnot(R6::is.R6(input_json$`turnover`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for TurnoverDTO: the required field `turnover` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of TurnoverDTO
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
      # check if the required `turnover` is null
      if (is.null(self$`turnover`)) {
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
      # check if the required `turnover` is null
      if (is.null(self$`turnover`)) {
        invalid_fields["turnover"] <- "Non-nullable required field `turnover` cannot be null."
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
# TurnoverDTO$unlock()
#
## Below is an example to define the print function
# TurnoverDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# TurnoverDTO$lock()

