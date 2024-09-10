#' Create a new PromoPeriodDTO
#'
#' @description
#' Время проведения акции.
#'
#' @docType class
#' @title PromoPeriodDTO
#' @description PromoPeriodDTO Class
#' @format An \code{R6Class} generator object
#' @field dateTimeFrom Дата и время начала акции. character
#' @field dateTimeTo Дата и время окончания акции. character
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
PromoPeriodDTO <- R6::R6Class(
  "PromoPeriodDTO",
  public = list(
    `dateTimeFrom` = NULL,
    `dateTimeTo` = NULL,
    #' Initialize a new PromoPeriodDTO class.
    #'
    #' @description
    #' Initialize a new PromoPeriodDTO class.
    #'
    #' @param dateTimeFrom Дата и время начала акции.
    #' @param dateTimeTo Дата и время окончания акции.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`dateTimeFrom`, `dateTimeTo`, ...) {
      if (!missing(`dateTimeFrom`)) {
        if (!(is.character(`dateTimeFrom`) && length(`dateTimeFrom`) == 1)) {
          stop(paste("Error! Invalid data for `dateTimeFrom`. Must be a string:", `dateTimeFrom`))
        }
        self$`dateTimeFrom` <- `dateTimeFrom`
      }
      if (!missing(`dateTimeTo`)) {
        if (!(is.character(`dateTimeTo`) && length(`dateTimeTo`) == 1)) {
          stop(paste("Error! Invalid data for `dateTimeTo`. Must be a string:", `dateTimeTo`))
        }
        self$`dateTimeTo` <- `dateTimeTo`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return PromoPeriodDTO in JSON format
    #' @export
    toJSON = function() {
      PromoPeriodDTOObject <- list()
      if (!is.null(self$`dateTimeFrom`)) {
        PromoPeriodDTOObject[["dateTimeFrom"]] <-
          self$`dateTimeFrom`
      }
      if (!is.null(self$`dateTimeTo`)) {
        PromoPeriodDTOObject[["dateTimeTo"]] <-
          self$`dateTimeTo`
      }
      PromoPeriodDTOObject
    },
    #' Deserialize JSON string into an instance of PromoPeriodDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of PromoPeriodDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of PromoPeriodDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`dateTimeFrom`)) {
        self$`dateTimeFrom` <- this_object$`dateTimeFrom`
      }
      if (!is.null(this_object$`dateTimeTo`)) {
        self$`dateTimeTo` <- this_object$`dateTimeTo`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return PromoPeriodDTO in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`dateTimeFrom`)) {
          sprintf(
          '"dateTimeFrom":
            "%s"
                    ',
          self$`dateTimeFrom`
          )
        },
        if (!is.null(self$`dateTimeTo`)) {
          sprintf(
          '"dateTimeTo":
            "%s"
                    ',
          self$`dateTimeTo`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of PromoPeriodDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of PromoPeriodDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of PromoPeriodDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`dateTimeFrom` <- this_object$`dateTimeFrom`
      self$`dateTimeTo` <- this_object$`dateTimeTo`
      self
    },
    #' Validate JSON input with respect to PromoPeriodDTO
    #'
    #' @description
    #' Validate JSON input with respect to PromoPeriodDTO and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `dateTimeFrom`
      if (!is.null(input_json$`dateTimeFrom`)) {
        if (!(is.character(input_json$`dateTimeFrom`) && length(input_json$`dateTimeFrom`) == 1)) {
          stop(paste("Error! Invalid data for `dateTimeFrom`. Must be a string:", input_json$`dateTimeFrom`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PromoPeriodDTO: the required field `dateTimeFrom` is missing."))
      }
      # check the required field `dateTimeTo`
      if (!is.null(input_json$`dateTimeTo`)) {
        if (!(is.character(input_json$`dateTimeTo`) && length(input_json$`dateTimeTo`) == 1)) {
          stop(paste("Error! Invalid data for `dateTimeTo`. Must be a string:", input_json$`dateTimeTo`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PromoPeriodDTO: the required field `dateTimeTo` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of PromoPeriodDTO
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
      # check if the required `dateTimeFrom` is null
      if (is.null(self$`dateTimeFrom`)) {
        return(FALSE)
      }

      # check if the required `dateTimeTo` is null
      if (is.null(self$`dateTimeTo`)) {
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
      # check if the required `dateTimeFrom` is null
      if (is.null(self$`dateTimeFrom`)) {
        invalid_fields["dateTimeFrom"] <- "Non-nullable required field `dateTimeFrom` cannot be null."
      }

      # check if the required `dateTimeTo` is null
      if (is.null(self$`dateTimeTo`)) {
        invalid_fields["dateTimeTo"] <- "Non-nullable required field `dateTimeTo` cannot be null."
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
# PromoPeriodDTO$unlock()
#
## Below is an example to define the print function
# PromoPeriodDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# PromoPeriodDTO$lock()

