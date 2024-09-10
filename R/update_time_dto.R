#' Create a new UpdateTimeDTO
#'
#' @description
#' Время последнего обновления.
#'
#' @docType class
#' @title UpdateTimeDTO
#' @description UpdateTimeDTO Class
#' @format An \code{R6Class} generator object
#' @field updatedAt Время последнего обновления. character
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
UpdateTimeDTO <- R6::R6Class(
  "UpdateTimeDTO",
  public = list(
    `updatedAt` = NULL,
    #' Initialize a new UpdateTimeDTO class.
    #'
    #' @description
    #' Initialize a new UpdateTimeDTO class.
    #'
    #' @param updatedAt Время последнего обновления.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`updatedAt`, ...) {
      if (!missing(`updatedAt`)) {
        if (!(is.character(`updatedAt`) && length(`updatedAt`) == 1)) {
          stop(paste("Error! Invalid data for `updatedAt`. Must be a string:", `updatedAt`))
        }
        self$`updatedAt` <- `updatedAt`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return UpdateTimeDTO in JSON format
    #' @export
    toJSON = function() {
      UpdateTimeDTOObject <- list()
      if (!is.null(self$`updatedAt`)) {
        UpdateTimeDTOObject[["updatedAt"]] <-
          self$`updatedAt`
      }
      UpdateTimeDTOObject
    },
    #' Deserialize JSON string into an instance of UpdateTimeDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of UpdateTimeDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of UpdateTimeDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`updatedAt`)) {
        self$`updatedAt` <- this_object$`updatedAt`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return UpdateTimeDTO in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`updatedAt`)) {
          sprintf(
          '"updatedAt":
            "%s"
                    ',
          self$`updatedAt`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of UpdateTimeDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of UpdateTimeDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of UpdateTimeDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`updatedAt` <- this_object$`updatedAt`
      self
    },
    #' Validate JSON input with respect to UpdateTimeDTO
    #'
    #' @description
    #' Validate JSON input with respect to UpdateTimeDTO and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `updatedAt`
      if (!is.null(input_json$`updatedAt`)) {
        if (!(is.character(input_json$`updatedAt`) && length(input_json$`updatedAt`) == 1)) {
          stop(paste("Error! Invalid data for `updatedAt`. Must be a string:", input_json$`updatedAt`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for UpdateTimeDTO: the required field `updatedAt` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of UpdateTimeDTO
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
      # check if the required `updatedAt` is null
      if (is.null(self$`updatedAt`)) {
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
      # check if the required `updatedAt` is null
      if (is.null(self$`updatedAt`)) {
        invalid_fields["updatedAt"] <- "Non-nullable required field `updatedAt` cannot be null."
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
# UpdateTimeDTO$unlock()
#
## Below is an example to define the print function
# UpdateTimeDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# UpdateTimeDTO$lock()

