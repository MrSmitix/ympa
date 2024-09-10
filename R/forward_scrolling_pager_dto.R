#' Create a new ForwardScrollingPagerDTO
#'
#' @description
#' Ссылка на следующую страницу. 
#'
#' @docType class
#' @title ForwardScrollingPagerDTO
#' @description ForwardScrollingPagerDTO Class
#' @format An \code{R6Class} generator object
#' @field nextPageToken Идентификатор следующей страницы результатов. character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ForwardScrollingPagerDTO <- R6::R6Class(
  "ForwardScrollingPagerDTO",
  public = list(
    `nextPageToken` = NULL,
    #' Initialize a new ForwardScrollingPagerDTO class.
    #'
    #' @description
    #' Initialize a new ForwardScrollingPagerDTO class.
    #'
    #' @param nextPageToken Идентификатор следующей страницы результатов.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`nextPageToken` = NULL, ...) {
      if (!is.null(`nextPageToken`)) {
        if (!(is.character(`nextPageToken`) && length(`nextPageToken`) == 1)) {
          stop(paste("Error! Invalid data for `nextPageToken`. Must be a string:", `nextPageToken`))
        }
        self$`nextPageToken` <- `nextPageToken`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return ForwardScrollingPagerDTO in JSON format
    #' @export
    toJSON = function() {
      ForwardScrollingPagerDTOObject <- list()
      if (!is.null(self$`nextPageToken`)) {
        ForwardScrollingPagerDTOObject[["nextPageToken"]] <-
          self$`nextPageToken`
      }
      ForwardScrollingPagerDTOObject
    },
    #' Deserialize JSON string into an instance of ForwardScrollingPagerDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of ForwardScrollingPagerDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of ForwardScrollingPagerDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`nextPageToken`)) {
        self$`nextPageToken` <- this_object$`nextPageToken`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return ForwardScrollingPagerDTO in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`nextPageToken`)) {
          sprintf(
          '"nextPageToken":
            "%s"
                    ',
          self$`nextPageToken`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of ForwardScrollingPagerDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of ForwardScrollingPagerDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of ForwardScrollingPagerDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`nextPageToken` <- this_object$`nextPageToken`
      self
    },
    #' Validate JSON input with respect to ForwardScrollingPagerDTO
    #'
    #' @description
    #' Validate JSON input with respect to ForwardScrollingPagerDTO and throw an exception if invalid
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
    #' @return String representation of ForwardScrollingPagerDTO
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
# ForwardScrollingPagerDTO$unlock()
#
## Below is an example to define the print function
# ForwardScrollingPagerDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# ForwardScrollingPagerDTO$lock()

