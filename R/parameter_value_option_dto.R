#' Create a new ParameterValueOptionDTO
#'
#' @description
#' Значение характеристики.
#'
#' @docType class
#' @title ParameterValueOptionDTO
#' @description ParameterValueOptionDTO Class
#' @format An \code{R6Class} generator object
#' @field id Идентификатор значения. integer
#' @field value Значение. character
#' @field description Описание значения. character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ParameterValueOptionDTO <- R6::R6Class(
  "ParameterValueOptionDTO",
  public = list(
    `id` = NULL,
    `value` = NULL,
    `description` = NULL,
    #' Initialize a new ParameterValueOptionDTO class.
    #'
    #' @description
    #' Initialize a new ParameterValueOptionDTO class.
    #'
    #' @param id Идентификатор значения.
    #' @param value Значение.
    #' @param description Описание значения.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`id`, `value`, `description` = NULL, ...) {
      if (!missing(`id`)) {
        if (!(is.numeric(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be an integer:", `id`))
        }
        self$`id` <- `id`
      }
      if (!missing(`value`)) {
        if (!(is.character(`value`) && length(`value`) == 1)) {
          stop(paste("Error! Invalid data for `value`. Must be a string:", `value`))
        }
        self$`value` <- `value`
      }
      if (!is.null(`description`)) {
        if (!(is.character(`description`) && length(`description`) == 1)) {
          stop(paste("Error! Invalid data for `description`. Must be a string:", `description`))
        }
        self$`description` <- `description`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return ParameterValueOptionDTO in JSON format
    #' @export
    toJSON = function() {
      ParameterValueOptionDTOObject <- list()
      if (!is.null(self$`id`)) {
        ParameterValueOptionDTOObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`value`)) {
        ParameterValueOptionDTOObject[["value"]] <-
          self$`value`
      }
      if (!is.null(self$`description`)) {
        ParameterValueOptionDTOObject[["description"]] <-
          self$`description`
      }
      ParameterValueOptionDTOObject
    },
    #' Deserialize JSON string into an instance of ParameterValueOptionDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of ParameterValueOptionDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of ParameterValueOptionDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`value`)) {
        self$`value` <- this_object$`value`
      }
      if (!is.null(this_object$`description`)) {
        self$`description` <- this_object$`description`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return ParameterValueOptionDTO in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`id`)) {
          sprintf(
          '"id":
            %d
                    ',
          self$`id`
          )
        },
        if (!is.null(self$`value`)) {
          sprintf(
          '"value":
            "%s"
                    ',
          self$`value`
          )
        },
        if (!is.null(self$`description`)) {
          sprintf(
          '"description":
            "%s"
                    ',
          self$`description`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of ParameterValueOptionDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of ParameterValueOptionDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of ParameterValueOptionDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`id` <- this_object$`id`
      self$`value` <- this_object$`value`
      self$`description` <- this_object$`description`
      self
    },
    #' Validate JSON input with respect to ParameterValueOptionDTO
    #'
    #' @description
    #' Validate JSON input with respect to ParameterValueOptionDTO and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `id`
      if (!is.null(input_json$`id`)) {
        if (!(is.numeric(input_json$`id`) && length(input_json$`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be an integer:", input_json$`id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ParameterValueOptionDTO: the required field `id` is missing."))
      }
      # check the required field `value`
      if (!is.null(input_json$`value`)) {
        if (!(is.character(input_json$`value`) && length(input_json$`value`) == 1)) {
          stop(paste("Error! Invalid data for `value`. Must be a string:", input_json$`value`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ParameterValueOptionDTO: the required field `value` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of ParameterValueOptionDTO
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
      # check if the required `id` is null
      if (is.null(self$`id`)) {
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
      # check if the required `id` is null
      if (is.null(self$`id`)) {
        invalid_fields["id"] <- "Non-nullable required field `id` cannot be null."
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
# ParameterValueOptionDTO$unlock()
#
## Below is an example to define the print function
# ParameterValueOptionDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# ParameterValueOptionDTO$lock()

