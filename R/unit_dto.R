#' Create a new UnitDTO
#'
#' @description
#' Единица измерения.
#'
#' @docType class
#' @title UnitDTO
#' @description UnitDTO Class
#' @format An \code{R6Class} generator object
#' @field id Идентификатор единицы измерения. integer
#' @field name Сокращенное название единицы измерения. character
#' @field fullName Полное название единицы измерения. character
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
UnitDTO <- R6::R6Class(
  "UnitDTO",
  public = list(
    `id` = NULL,
    `name` = NULL,
    `fullName` = NULL,
    #' Initialize a new UnitDTO class.
    #'
    #' @description
    #' Initialize a new UnitDTO class.
    #'
    #' @param id Идентификатор единицы измерения.
    #' @param name Сокращенное название единицы измерения.
    #' @param fullName Полное название единицы измерения.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`id`, `name`, `fullName`, ...) {
      if (!missing(`id`)) {
        if (!(is.numeric(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be an integer:", `id`))
        }
        self$`id` <- `id`
      }
      if (!missing(`name`)) {
        if (!(is.character(`name`) && length(`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", `name`))
        }
        self$`name` <- `name`
      }
      if (!missing(`fullName`)) {
        if (!(is.character(`fullName`) && length(`fullName`) == 1)) {
          stop(paste("Error! Invalid data for `fullName`. Must be a string:", `fullName`))
        }
        self$`fullName` <- `fullName`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return UnitDTO in JSON format
    #' @export
    toJSON = function() {
      UnitDTOObject <- list()
      if (!is.null(self$`id`)) {
        UnitDTOObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`name`)) {
        UnitDTOObject[["name"]] <-
          self$`name`
      }
      if (!is.null(self$`fullName`)) {
        UnitDTOObject[["fullName"]] <-
          self$`fullName`
      }
      UnitDTOObject
    },
    #' Deserialize JSON string into an instance of UnitDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of UnitDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of UnitDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`name`)) {
        self$`name` <- this_object$`name`
      }
      if (!is.null(this_object$`fullName`)) {
        self$`fullName` <- this_object$`fullName`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return UnitDTO in JSON format
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
        if (!is.null(self$`name`)) {
          sprintf(
          '"name":
            "%s"
                    ',
          self$`name`
          )
        },
        if (!is.null(self$`fullName`)) {
          sprintf(
          '"fullName":
            "%s"
                    ',
          self$`fullName`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of UnitDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of UnitDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of UnitDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`id` <- this_object$`id`
      self$`name` <- this_object$`name`
      self$`fullName` <- this_object$`fullName`
      self
    },
    #' Validate JSON input with respect to UnitDTO
    #'
    #' @description
    #' Validate JSON input with respect to UnitDTO and throw an exception if invalid
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
        stop(paste("The JSON input `", input, "` is invalid for UnitDTO: the required field `id` is missing."))
      }
      # check the required field `name`
      if (!is.null(input_json$`name`)) {
        if (!(is.character(input_json$`name`) && length(input_json$`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", input_json$`name`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for UnitDTO: the required field `name` is missing."))
      }
      # check the required field `fullName`
      if (!is.null(input_json$`fullName`)) {
        if (!(is.character(input_json$`fullName`) && length(input_json$`fullName`) == 1)) {
          stop(paste("Error! Invalid data for `fullName`. Must be a string:", input_json$`fullName`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for UnitDTO: the required field `fullName` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of UnitDTO
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

      # check if the required `name` is null
      if (is.null(self$`name`)) {
        return(FALSE)
      }

      # check if the required `fullName` is null
      if (is.null(self$`fullName`)) {
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

      # check if the required `name` is null
      if (is.null(self$`name`)) {
        invalid_fields["name"] <- "Non-nullable required field `name` cannot be null."
      }

      # check if the required `fullName` is null
      if (is.null(self$`fullName`)) {
        invalid_fields["fullName"] <- "Non-nullable required field `fullName` cannot be null."
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
# UnitDTO$unlock()
#
## Below is an example to define the print function
# UnitDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# UnitDTO$lock()

