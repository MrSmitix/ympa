#' Create a new TrackDTO
#'
#' @description
#' Информация о трек-номерах.
#'
#' @docType class
#' @title TrackDTO
#' @description TrackDTO Class
#' @format An \code{R6Class} generator object
#' @field trackCode Трек-код почтового отправления. character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
TrackDTO <- R6::R6Class(
  "TrackDTO",
  public = list(
    `trackCode` = NULL,
    #' Initialize a new TrackDTO class.
    #'
    #' @description
    #' Initialize a new TrackDTO class.
    #'
    #' @param trackCode Трек-код почтового отправления.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`trackCode` = NULL, ...) {
      if (!is.null(`trackCode`)) {
        if (!(is.character(`trackCode`) && length(`trackCode`) == 1)) {
          stop(paste("Error! Invalid data for `trackCode`. Must be a string:", `trackCode`))
        }
        self$`trackCode` <- `trackCode`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return TrackDTO in JSON format
    #' @export
    toJSON = function() {
      TrackDTOObject <- list()
      if (!is.null(self$`trackCode`)) {
        TrackDTOObject[["trackCode"]] <-
          self$`trackCode`
      }
      TrackDTOObject
    },
    #' Deserialize JSON string into an instance of TrackDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of TrackDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of TrackDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`trackCode`)) {
        self$`trackCode` <- this_object$`trackCode`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return TrackDTO in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`trackCode`)) {
          sprintf(
          '"trackCode":
            "%s"
                    ',
          self$`trackCode`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of TrackDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of TrackDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of TrackDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`trackCode` <- this_object$`trackCode`
      self
    },
    #' Validate JSON input with respect to TrackDTO
    #'
    #' @description
    #' Validate JSON input with respect to TrackDTO and throw an exception if invalid
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
    #' @return String representation of TrackDTO
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
# TrackDTO$unlock()
#
## Below is an example to define the print function
# TrackDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# TrackDTO$lock()

