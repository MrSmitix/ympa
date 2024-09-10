#' Create a new OrderBoxLayoutPartialCountDTO
#'
#' @description
#' Информация о части товара в коробке.
#'
#' @docType class
#' @title OrderBoxLayoutPartialCountDTO
#' @description OrderBoxLayoutPartialCountDTO Class
#' @format An \code{R6Class} generator object
#' @field current Номер части, начиная с 1. integer
#' @field total На сколько всего частей разделен товар. integer
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
OrderBoxLayoutPartialCountDTO <- R6::R6Class(
  "OrderBoxLayoutPartialCountDTO",
  public = list(
    `current` = NULL,
    `total` = NULL,
    #' Initialize a new OrderBoxLayoutPartialCountDTO class.
    #'
    #' @description
    #' Initialize a new OrderBoxLayoutPartialCountDTO class.
    #'
    #' @param current Номер части, начиная с 1.
    #' @param total На сколько всего частей разделен товар.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`current`, `total`, ...) {
      if (!missing(`current`)) {
        if (!(is.numeric(`current`) && length(`current`) == 1)) {
          stop(paste("Error! Invalid data for `current`. Must be an integer:", `current`))
        }
        self$`current` <- `current`
      }
      if (!missing(`total`)) {
        if (!(is.numeric(`total`) && length(`total`) == 1)) {
          stop(paste("Error! Invalid data for `total`. Must be an integer:", `total`))
        }
        self$`total` <- `total`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return OrderBoxLayoutPartialCountDTO in JSON format
    #' @export
    toJSON = function() {
      OrderBoxLayoutPartialCountDTOObject <- list()
      if (!is.null(self$`current`)) {
        OrderBoxLayoutPartialCountDTOObject[["current"]] <-
          self$`current`
      }
      if (!is.null(self$`total`)) {
        OrderBoxLayoutPartialCountDTOObject[["total"]] <-
          self$`total`
      }
      OrderBoxLayoutPartialCountDTOObject
    },
    #' Deserialize JSON string into an instance of OrderBoxLayoutPartialCountDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of OrderBoxLayoutPartialCountDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of OrderBoxLayoutPartialCountDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`current`)) {
        self$`current` <- this_object$`current`
      }
      if (!is.null(this_object$`total`)) {
        self$`total` <- this_object$`total`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return OrderBoxLayoutPartialCountDTO in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`current`)) {
          sprintf(
          '"current":
            %d
                    ',
          self$`current`
          )
        },
        if (!is.null(self$`total`)) {
          sprintf(
          '"total":
            %d
                    ',
          self$`total`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of OrderBoxLayoutPartialCountDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of OrderBoxLayoutPartialCountDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of OrderBoxLayoutPartialCountDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`current` <- this_object$`current`
      self$`total` <- this_object$`total`
      self
    },
    #' Validate JSON input with respect to OrderBoxLayoutPartialCountDTO
    #'
    #' @description
    #' Validate JSON input with respect to OrderBoxLayoutPartialCountDTO and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `current`
      if (!is.null(input_json$`current`)) {
        if (!(is.numeric(input_json$`current`) && length(input_json$`current`) == 1)) {
          stop(paste("Error! Invalid data for `current`. Must be an integer:", input_json$`current`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for OrderBoxLayoutPartialCountDTO: the required field `current` is missing."))
      }
      # check the required field `total`
      if (!is.null(input_json$`total`)) {
        if (!(is.numeric(input_json$`total`) && length(input_json$`total`) == 1)) {
          stop(paste("Error! Invalid data for `total`. Must be an integer:", input_json$`total`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for OrderBoxLayoutPartialCountDTO: the required field `total` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of OrderBoxLayoutPartialCountDTO
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
      # check if the required `current` is null
      if (is.null(self$`current`)) {
        return(FALSE)
      }

      if (self$`current` < 1) {
        return(FALSE)
      }

      # check if the required `total` is null
      if (is.null(self$`total`)) {
        return(FALSE)
      }

      if (self$`total` < 2) {
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
      # check if the required `current` is null
      if (is.null(self$`current`)) {
        invalid_fields["current"] <- "Non-nullable required field `current` cannot be null."
      }

      if (self$`current` < 1) {
        invalid_fields["current"] <- "Invalid value for `current`, must be bigger than or equal to 1."
      }

      # check if the required `total` is null
      if (is.null(self$`total`)) {
        invalid_fields["total"] <- "Non-nullable required field `total` cannot be null."
      }

      if (self$`total` < 2) {
        invalid_fields["total"] <- "Invalid value for `total`, must be bigger than or equal to 2."
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
# OrderBoxLayoutPartialCountDTO$unlock()
#
## Below is an example to define the print function
# OrderBoxLayoutPartialCountDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# OrderBoxLayoutPartialCountDTO$lock()

