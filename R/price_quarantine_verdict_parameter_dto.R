#' Create a new PriceQuarantineVerdictParameterDTO
#'
#' @description
#' Параметр карантина.
#'
#' @docType class
#' @title PriceQuarantineVerdictParameterDTO
#' @description PriceQuarantineVerdictParameterDTO Class
#' @format An \code{R6Class} generator object
#' @field name  \link{PriceQuarantineVerdictParamNameType}
#' @field value Значение параметра. character
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
PriceQuarantineVerdictParameterDTO <- R6::R6Class(
  "PriceQuarantineVerdictParameterDTO",
  public = list(
    `name` = NULL,
    `value` = NULL,
    #' Initialize a new PriceQuarantineVerdictParameterDTO class.
    #'
    #' @description
    #' Initialize a new PriceQuarantineVerdictParameterDTO class.
    #'
    #' @param name name
    #' @param value Значение параметра.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`name`, `value`, ...) {
      if (!missing(`name`)) {
        if (!(`name` %in% c())) {
          stop(paste("Error! \"", `name`, "\" cannot be assigned to `name`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`name`))
        self$`name` <- `name`
      }
      if (!missing(`value`)) {
        if (!(is.character(`value`) && length(`value`) == 1)) {
          stop(paste("Error! Invalid data for `value`. Must be a string:", `value`))
        }
        self$`value` <- `value`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return PriceQuarantineVerdictParameterDTO in JSON format
    #' @export
    toJSON = function() {
      PriceQuarantineVerdictParameterDTOObject <- list()
      if (!is.null(self$`name`)) {
        PriceQuarantineVerdictParameterDTOObject[["name"]] <-
          self$`name`$toJSON()
      }
      if (!is.null(self$`value`)) {
        PriceQuarantineVerdictParameterDTOObject[["value"]] <-
          self$`value`
      }
      PriceQuarantineVerdictParameterDTOObject
    },
    #' Deserialize JSON string into an instance of PriceQuarantineVerdictParameterDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of PriceQuarantineVerdictParameterDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of PriceQuarantineVerdictParameterDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`name`)) {
        `name_object` <- PriceQuarantineVerdictParamNameType$new()
        `name_object`$fromJSON(jsonlite::toJSON(this_object$`name`, auto_unbox = TRUE, digits = NA))
        self$`name` <- `name_object`
      }
      if (!is.null(this_object$`value`)) {
        self$`value` <- this_object$`value`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return PriceQuarantineVerdictParameterDTO in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`name`)) {
          sprintf(
          '"name":
          %s
          ',
          jsonlite::toJSON(self$`name`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`value`)) {
          sprintf(
          '"value":
            "%s"
                    ',
          self$`value`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of PriceQuarantineVerdictParameterDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of PriceQuarantineVerdictParameterDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of PriceQuarantineVerdictParameterDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`name` <- PriceQuarantineVerdictParamNameType$new()$fromJSON(jsonlite::toJSON(this_object$`name`, auto_unbox = TRUE, digits = NA))
      self$`value` <- this_object$`value`
      self
    },
    #' Validate JSON input with respect to PriceQuarantineVerdictParameterDTO
    #'
    #' @description
    #' Validate JSON input with respect to PriceQuarantineVerdictParameterDTO and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `name`
      if (!is.null(input_json$`name`)) {
        stopifnot(R6::is.R6(input_json$`name`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PriceQuarantineVerdictParameterDTO: the required field `name` is missing."))
      }
      # check the required field `value`
      if (!is.null(input_json$`value`)) {
        if (!(is.character(input_json$`value`) && length(input_json$`value`) == 1)) {
          stop(paste("Error! Invalid data for `value`. Must be a string:", input_json$`value`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PriceQuarantineVerdictParameterDTO: the required field `value` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of PriceQuarantineVerdictParameterDTO
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
      # check if the required `name` is null
      if (is.null(self$`name`)) {
        return(FALSE)
      }

      # check if the required `value` is null
      if (is.null(self$`value`)) {
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
      # check if the required `name` is null
      if (is.null(self$`name`)) {
        invalid_fields["name"] <- "Non-nullable required field `name` cannot be null."
      }

      # check if the required `value` is null
      if (is.null(self$`value`)) {
        invalid_fields["value"] <- "Non-nullable required field `value` cannot be null."
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
# PriceQuarantineVerdictParameterDTO$unlock()
#
## Below is an example to define the print function
# PriceQuarantineVerdictParameterDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# PriceQuarantineVerdictParameterDTO$lock()

