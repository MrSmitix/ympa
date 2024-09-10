#' Create a new PalletsCountDTO
#'
#' @description
#' Количество палет в отгрузке.
#'
#' @docType class
#' @title PalletsCountDTO
#' @description PalletsCountDTO Class
#' @format An \code{R6Class} generator object
#' @field planned Количество палет, которое заявил продавец. integer [optional]
#' @field fact Количество палет, которое приняли в сортировочном центре. integer [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
PalletsCountDTO <- R6::R6Class(
  "PalletsCountDTO",
  public = list(
    `planned` = NULL,
    `fact` = NULL,
    #' Initialize a new PalletsCountDTO class.
    #'
    #' @description
    #' Initialize a new PalletsCountDTO class.
    #'
    #' @param planned Количество палет, которое заявил продавец.
    #' @param fact Количество палет, которое приняли в сортировочном центре.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`planned` = NULL, `fact` = NULL, ...) {
      if (!is.null(`planned`)) {
        if (!(is.numeric(`planned`) && length(`planned`) == 1)) {
          stop(paste("Error! Invalid data for `planned`. Must be an integer:", `planned`))
        }
        self$`planned` <- `planned`
      }
      if (!is.null(`fact`)) {
        if (!(is.numeric(`fact`) && length(`fact`) == 1)) {
          stop(paste("Error! Invalid data for `fact`. Must be an integer:", `fact`))
        }
        self$`fact` <- `fact`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return PalletsCountDTO in JSON format
    #' @export
    toJSON = function() {
      PalletsCountDTOObject <- list()
      if (!is.null(self$`planned`)) {
        PalletsCountDTOObject[["planned"]] <-
          self$`planned`
      }
      if (!is.null(self$`fact`)) {
        PalletsCountDTOObject[["fact"]] <-
          self$`fact`
      }
      PalletsCountDTOObject
    },
    #' Deserialize JSON string into an instance of PalletsCountDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of PalletsCountDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of PalletsCountDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`planned`)) {
        self$`planned` <- this_object$`planned`
      }
      if (!is.null(this_object$`fact`)) {
        self$`fact` <- this_object$`fact`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return PalletsCountDTO in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`planned`)) {
          sprintf(
          '"planned":
            %d
                    ',
          self$`planned`
          )
        },
        if (!is.null(self$`fact`)) {
          sprintf(
          '"fact":
            %d
                    ',
          self$`fact`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of PalletsCountDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of PalletsCountDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of PalletsCountDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`planned` <- this_object$`planned`
      self$`fact` <- this_object$`fact`
      self
    },
    #' Validate JSON input with respect to PalletsCountDTO
    #'
    #' @description
    #' Validate JSON input with respect to PalletsCountDTO and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of PalletsCountDTO
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
# PalletsCountDTO$unlock()
#
## Below is an example to define the print function
# PalletsCountDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# PalletsCountDTO$lock()

