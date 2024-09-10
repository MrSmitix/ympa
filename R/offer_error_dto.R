#' Create a new OfferErrorDTO
#'
#' @description
#' Сообщение об ошибке, связанной с размещением товара.
#'
#' @docType class
#' @title OfferErrorDTO
#' @description OfferErrorDTO Class
#' @format An \code{R6Class} generator object
#' @field message Тип ошибки. character [optional]
#' @field comment Пояснение. character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
OfferErrorDTO <- R6::R6Class(
  "OfferErrorDTO",
  public = list(
    `message` = NULL,
    `comment` = NULL,
    #' Initialize a new OfferErrorDTO class.
    #'
    #' @description
    #' Initialize a new OfferErrorDTO class.
    #'
    #' @param message Тип ошибки.
    #' @param comment Пояснение.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`message` = NULL, `comment` = NULL, ...) {
      if (!is.null(`message`)) {
        if (!(is.character(`message`) && length(`message`) == 1)) {
          stop(paste("Error! Invalid data for `message`. Must be a string:", `message`))
        }
        self$`message` <- `message`
      }
      if (!is.null(`comment`)) {
        if (!(is.character(`comment`) && length(`comment`) == 1)) {
          stop(paste("Error! Invalid data for `comment`. Must be a string:", `comment`))
        }
        self$`comment` <- `comment`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return OfferErrorDTO in JSON format
    #' @export
    toJSON = function() {
      OfferErrorDTOObject <- list()
      if (!is.null(self$`message`)) {
        OfferErrorDTOObject[["message"]] <-
          self$`message`
      }
      if (!is.null(self$`comment`)) {
        OfferErrorDTOObject[["comment"]] <-
          self$`comment`
      }
      OfferErrorDTOObject
    },
    #' Deserialize JSON string into an instance of OfferErrorDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of OfferErrorDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of OfferErrorDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`message`)) {
        self$`message` <- this_object$`message`
      }
      if (!is.null(this_object$`comment`)) {
        self$`comment` <- this_object$`comment`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return OfferErrorDTO in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`message`)) {
          sprintf(
          '"message":
            "%s"
                    ',
          self$`message`
          )
        },
        if (!is.null(self$`comment`)) {
          sprintf(
          '"comment":
            "%s"
                    ',
          self$`comment`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of OfferErrorDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of OfferErrorDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of OfferErrorDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`message` <- this_object$`message`
      self$`comment` <- this_object$`comment`
      self
    },
    #' Validate JSON input with respect to OfferErrorDTO
    #'
    #' @description
    #' Validate JSON input with respect to OfferErrorDTO and throw an exception if invalid
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
    #' @return String representation of OfferErrorDTO
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
# OfferErrorDTO$unlock()
#
## Below is an example to define the print function
# OfferErrorDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# OfferErrorDTO$lock()

