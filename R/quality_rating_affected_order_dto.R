#' Create a new QualityRatingAffectedOrderDTO
#'
#' @description
#' Информация о заказе, который повлиял на индекс качества.
#'
#' @docType class
#' @title QualityRatingAffectedOrderDTO
#' @description QualityRatingAffectedOrderDTO Class
#' @format An \code{R6Class} generator object
#' @field orderId Идентификатор заказа. integer
#' @field description Описание проблемы. character
#' @field componentType  \link{AffectedOrderQualityRatingComponentType}
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
QualityRatingAffectedOrderDTO <- R6::R6Class(
  "QualityRatingAffectedOrderDTO",
  public = list(
    `orderId` = NULL,
    `description` = NULL,
    `componentType` = NULL,
    #' Initialize a new QualityRatingAffectedOrderDTO class.
    #'
    #' @description
    #' Initialize a new QualityRatingAffectedOrderDTO class.
    #'
    #' @param orderId Идентификатор заказа.
    #' @param description Описание проблемы.
    #' @param componentType componentType
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`orderId`, `description`, `componentType`, ...) {
      if (!missing(`orderId`)) {
        if (!(is.numeric(`orderId`) && length(`orderId`) == 1)) {
          stop(paste("Error! Invalid data for `orderId`. Must be an integer:", `orderId`))
        }
        self$`orderId` <- `orderId`
      }
      if (!missing(`description`)) {
        if (!(is.character(`description`) && length(`description`) == 1)) {
          stop(paste("Error! Invalid data for `description`. Must be a string:", `description`))
        }
        self$`description` <- `description`
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
    #' @return QualityRatingAffectedOrderDTO in JSON format
    #' @export
    toJSON = function() {
      QualityRatingAffectedOrderDTOObject <- list()
      if (!is.null(self$`orderId`)) {
        QualityRatingAffectedOrderDTOObject[["orderId"]] <-
          self$`orderId`
      }
      if (!is.null(self$`description`)) {
        QualityRatingAffectedOrderDTOObject[["description"]] <-
          self$`description`
      }
      if (!is.null(self$`componentType`)) {
        QualityRatingAffectedOrderDTOObject[["componentType"]] <-
          self$`componentType`$toJSON()
      }
      QualityRatingAffectedOrderDTOObject
    },
    #' Deserialize JSON string into an instance of QualityRatingAffectedOrderDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of QualityRatingAffectedOrderDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of QualityRatingAffectedOrderDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`orderId`)) {
        self$`orderId` <- this_object$`orderId`
      }
      if (!is.null(this_object$`description`)) {
        self$`description` <- this_object$`description`
      }
      if (!is.null(this_object$`componentType`)) {
        `componenttype_object` <- AffectedOrderQualityRatingComponentType$new()
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
    #' @return QualityRatingAffectedOrderDTO in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`orderId`)) {
          sprintf(
          '"orderId":
            %d
                    ',
          self$`orderId`
          )
        },
        if (!is.null(self$`description`)) {
          sprintf(
          '"description":
            "%s"
                    ',
          self$`description`
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
    #' Deserialize JSON string into an instance of QualityRatingAffectedOrderDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of QualityRatingAffectedOrderDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of QualityRatingAffectedOrderDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`orderId` <- this_object$`orderId`
      self$`description` <- this_object$`description`
      self$`componentType` <- AffectedOrderQualityRatingComponentType$new()$fromJSON(jsonlite::toJSON(this_object$`componentType`, auto_unbox = TRUE, digits = NA))
      self
    },
    #' Validate JSON input with respect to QualityRatingAffectedOrderDTO
    #'
    #' @description
    #' Validate JSON input with respect to QualityRatingAffectedOrderDTO and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `orderId`
      if (!is.null(input_json$`orderId`)) {
        if (!(is.numeric(input_json$`orderId`) && length(input_json$`orderId`) == 1)) {
          stop(paste("Error! Invalid data for `orderId`. Must be an integer:", input_json$`orderId`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for QualityRatingAffectedOrderDTO: the required field `orderId` is missing."))
      }
      # check the required field `description`
      if (!is.null(input_json$`description`)) {
        if (!(is.character(input_json$`description`) && length(input_json$`description`) == 1)) {
          stop(paste("Error! Invalid data for `description`. Must be a string:", input_json$`description`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for QualityRatingAffectedOrderDTO: the required field `description` is missing."))
      }
      # check the required field `componentType`
      if (!is.null(input_json$`componentType`)) {
        stopifnot(R6::is.R6(input_json$`componentType`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for QualityRatingAffectedOrderDTO: the required field `componentType` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of QualityRatingAffectedOrderDTO
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
      # check if the required `orderId` is null
      if (is.null(self$`orderId`)) {
        return(FALSE)
      }

      if (self$`orderId` < 0) {
        return(FALSE)
      }

      # check if the required `description` is null
      if (is.null(self$`description`)) {
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
      # check if the required `orderId` is null
      if (is.null(self$`orderId`)) {
        invalid_fields["orderId"] <- "Non-nullable required field `orderId` cannot be null."
      }

      if (self$`orderId` < 0) {
        invalid_fields["orderId"] <- "Invalid value for `orderId`, must be bigger than or equal to 0."
      }

      # check if the required `description` is null
      if (is.null(self$`description`)) {
        invalid_fields["description"] <- "Non-nullable required field `description` cannot be null."
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
# QualityRatingAffectedOrderDTO$unlock()
#
## Below is an example to define the print function
# QualityRatingAffectedOrderDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# QualityRatingAffectedOrderDTO$lock()

