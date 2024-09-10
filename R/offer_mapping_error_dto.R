#' Create a new OfferMappingErrorDTO
#'
#' @description
#' Текст ошибки.
#'
#' @docType class
#' @title OfferMappingErrorDTO
#' @description OfferMappingErrorDTO Class
#' @format An \code{R6Class} generator object
#' @field type  \link{OfferMappingErrorType}
#' @field parameterId Идентификатор характеристики, с которой связана ошибка. integer [optional]
#' @field message Текст ошибки. character
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
OfferMappingErrorDTO <- R6::R6Class(
  "OfferMappingErrorDTO",
  public = list(
    `type` = NULL,
    `parameterId` = NULL,
    `message` = NULL,
    #' Initialize a new OfferMappingErrorDTO class.
    #'
    #' @description
    #' Initialize a new OfferMappingErrorDTO class.
    #'
    #' @param type type
    #' @param message Текст ошибки.
    #' @param parameterId Идентификатор характеристики, с которой связана ошибка.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`type`, `message`, `parameterId` = NULL, ...) {
      if (!missing(`type`)) {
        if (!(`type` %in% c())) {
          stop(paste("Error! \"", `type`, "\" cannot be assigned to `type`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`type`))
        self$`type` <- `type`
      }
      if (!missing(`message`)) {
        if (!(is.character(`message`) && length(`message`) == 1)) {
          stop(paste("Error! Invalid data for `message`. Must be a string:", `message`))
        }
        self$`message` <- `message`
      }
      if (!is.null(`parameterId`)) {
        if (!(is.numeric(`parameterId`) && length(`parameterId`) == 1)) {
          stop(paste("Error! Invalid data for `parameterId`. Must be an integer:", `parameterId`))
        }
        self$`parameterId` <- `parameterId`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return OfferMappingErrorDTO in JSON format
    #' @export
    toJSON = function() {
      OfferMappingErrorDTOObject <- list()
      if (!is.null(self$`type`)) {
        OfferMappingErrorDTOObject[["type"]] <-
          self$`type`$toJSON()
      }
      if (!is.null(self$`parameterId`)) {
        OfferMappingErrorDTOObject[["parameterId"]] <-
          self$`parameterId`
      }
      if (!is.null(self$`message`)) {
        OfferMappingErrorDTOObject[["message"]] <-
          self$`message`
      }
      OfferMappingErrorDTOObject
    },
    #' Deserialize JSON string into an instance of OfferMappingErrorDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of OfferMappingErrorDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of OfferMappingErrorDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`type`)) {
        `type_object` <- OfferMappingErrorType$new()
        `type_object`$fromJSON(jsonlite::toJSON(this_object$`type`, auto_unbox = TRUE, digits = NA))
        self$`type` <- `type_object`
      }
      if (!is.null(this_object$`parameterId`)) {
        self$`parameterId` <- this_object$`parameterId`
      }
      if (!is.null(this_object$`message`)) {
        self$`message` <- this_object$`message`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return OfferMappingErrorDTO in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`type`)) {
          sprintf(
          '"type":
          %s
          ',
          jsonlite::toJSON(self$`type`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`parameterId`)) {
          sprintf(
          '"parameterId":
            %d
                    ',
          self$`parameterId`
          )
        },
        if (!is.null(self$`message`)) {
          sprintf(
          '"message":
            "%s"
                    ',
          self$`message`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of OfferMappingErrorDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of OfferMappingErrorDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of OfferMappingErrorDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`type` <- OfferMappingErrorType$new()$fromJSON(jsonlite::toJSON(this_object$`type`, auto_unbox = TRUE, digits = NA))
      self$`parameterId` <- this_object$`parameterId`
      self$`message` <- this_object$`message`
      self
    },
    #' Validate JSON input with respect to OfferMappingErrorDTO
    #'
    #' @description
    #' Validate JSON input with respect to OfferMappingErrorDTO and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `type`
      if (!is.null(input_json$`type`)) {
        stopifnot(R6::is.R6(input_json$`type`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for OfferMappingErrorDTO: the required field `type` is missing."))
      }
      # check the required field `message`
      if (!is.null(input_json$`message`)) {
        if (!(is.character(input_json$`message`) && length(input_json$`message`) == 1)) {
          stop(paste("Error! Invalid data for `message`. Must be a string:", input_json$`message`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for OfferMappingErrorDTO: the required field `message` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of OfferMappingErrorDTO
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
      # check if the required `type` is null
      if (is.null(self$`type`)) {
        return(FALSE)
      }

      # check if the required `message` is null
      if (is.null(self$`message`)) {
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
      # check if the required `type` is null
      if (is.null(self$`type`)) {
        invalid_fields["type"] <- "Non-nullable required field `type` cannot be null."
      }

      # check if the required `message` is null
      if (is.null(self$`message`)) {
        invalid_fields["message"] <- "Non-nullable required field `message` cannot be null."
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
# OfferMappingErrorDTO$unlock()
#
## Below is an example to define the print function
# OfferMappingErrorDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# OfferMappingErrorDTO$lock()

