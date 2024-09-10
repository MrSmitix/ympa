#' Create a new QualityRatingComponentDTO
#'
#' @description
#' Составляющая индекса качества.
#'
#' @docType class
#' @title QualityRatingComponentDTO
#' @description QualityRatingComponentDTO Class
#' @format An \code{R6Class} generator object
#' @field value Значение составляющей в процентах. numeric
#' @field componentType  \link{QualityRatingComponentType}
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
QualityRatingComponentDTO <- R6::R6Class(
  "QualityRatingComponentDTO",
  public = list(
    `value` = NULL,
    `componentType` = NULL,
    #' Initialize a new QualityRatingComponentDTO class.
    #'
    #' @description
    #' Initialize a new QualityRatingComponentDTO class.
    #'
    #' @param value Значение составляющей в процентах.
    #' @param componentType componentType
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`value`, `componentType`, ...) {
      if (!missing(`value`)) {
        if (!(is.numeric(`value`) && length(`value`) == 1)) {
          stop(paste("Error! Invalid data for `value`. Must be a number:", `value`))
        }
        self$`value` <- `value`
      }
      if (!missing(`componentType`)) {
        if (!(`componentType` %in% c())) {
          stop(paste("Error! \"", `componentType`, "\" cannot be assigned to `componentType`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`componentType`))
        self$`componentType` <- `componentType`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return QualityRatingComponentDTO in JSON format
    #' @export
    toJSON = function() {
      QualityRatingComponentDTOObject <- list()
      if (!is.null(self$`value`)) {
        QualityRatingComponentDTOObject[["value"]] <-
          self$`value`
      }
      if (!is.null(self$`componentType`)) {
        QualityRatingComponentDTOObject[["componentType"]] <-
          self$`componentType`$toJSON()
      }
      QualityRatingComponentDTOObject
    },
    #' Deserialize JSON string into an instance of QualityRatingComponentDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of QualityRatingComponentDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of QualityRatingComponentDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`value`)) {
        self$`value` <- this_object$`value`
      }
      if (!is.null(this_object$`componentType`)) {
        `componenttype_object` <- QualityRatingComponentType$new()
        `componenttype_object`$fromJSON(jsonlite::toJSON(this_object$`componentType`, auto_unbox = TRUE, digits = NA))
        self$`componentType` <- `componenttype_object`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return QualityRatingComponentDTO in JSON format
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
        if (!is.null(self$`componentType`)) {
          sprintf(
          '"componentType":
          %s
          ',
          jsonlite::toJSON(self$`componentType`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of QualityRatingComponentDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of QualityRatingComponentDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of QualityRatingComponentDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`value` <- this_object$`value`
      self$`componentType` <- QualityRatingComponentType$new()$fromJSON(jsonlite::toJSON(this_object$`componentType`, auto_unbox = TRUE, digits = NA))
      self
    },
    #' Validate JSON input with respect to QualityRatingComponentDTO
    #'
    #' @description
    #' Validate JSON input with respect to QualityRatingComponentDTO and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `value`
      if (!is.null(input_json$`value`)) {
        if (!(is.numeric(input_json$`value`) && length(input_json$`value`) == 1)) {
          stop(paste("Error! Invalid data for `value`. Must be a number:", input_json$`value`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for QualityRatingComponentDTO: the required field `value` is missing."))
      }
      # check the required field `componentType`
      if (!is.null(input_json$`componentType`)) {
        stopifnot(R6::is.R6(input_json$`componentType`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for QualityRatingComponentDTO: the required field `componentType` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of QualityRatingComponentDTO
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

      if (self$`value` > 100) {
        return(FALSE)
      }
      if (self$`value` < 0) {
        return(FALSE)
      }

      # check if the required `componentType` is null
      if (is.null(self$`componentType`)) {
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

      if (self$`value` > 100) {
        invalid_fields["value"] <- "Invalid value for `value`, must be smaller than or equal to 100."
      }
      if (self$`value` < 0) {
        invalid_fields["value"] <- "Invalid value for `value`, must be bigger than or equal to 0."
      }

      # check if the required `componentType` is null
      if (is.null(self$`componentType`)) {
        invalid_fields["componentType"] <- "Non-nullable required field `componentType` cannot be null."
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
# QualityRatingComponentDTO$unlock()
#
## Below is an example to define the print function
# QualityRatingComponentDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# QualityRatingComponentDTO$lock()

