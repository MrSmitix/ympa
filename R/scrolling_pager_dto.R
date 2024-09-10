#' Create a new ScrollingPagerDTO
#'
#' @description
#' Информация о страницах результатов.
#'
#' @docType class
#' @title ScrollingPagerDTO
#' @description ScrollingPagerDTO Class
#' @format An \code{R6Class} generator object
#' @field nextPageToken Идентификатор следующей страницы результатов. character [optional]
#' @field prevPageToken Идентификатор предыдущей страницы результатов. character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ScrollingPagerDTO <- R6::R6Class(
  "ScrollingPagerDTO",
  public = list(
    `nextPageToken` = NULL,
    `prevPageToken` = NULL,
    #' Initialize a new ScrollingPagerDTO class.
    #'
    #' @description
    #' Initialize a new ScrollingPagerDTO class.
    #'
    #' @param nextPageToken Идентификатор следующей страницы результатов.
    #' @param prevPageToken Идентификатор предыдущей страницы результатов.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`nextPageToken` = NULL, `prevPageToken` = NULL, ...) {
      if (!is.null(`nextPageToken`)) {
        if (!(is.character(`nextPageToken`) && length(`nextPageToken`) == 1)) {
          stop(paste("Error! Invalid data for `nextPageToken`. Must be a string:", `nextPageToken`))
        }
        self$`nextPageToken` <- `nextPageToken`
      }
      if (!is.null(`prevPageToken`)) {
        if (!(is.character(`prevPageToken`) && length(`prevPageToken`) == 1)) {
          stop(paste("Error! Invalid data for `prevPageToken`. Must be a string:", `prevPageToken`))
        }
        self$`prevPageToken` <- `prevPageToken`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return ScrollingPagerDTO in JSON format
    #' @export
    toJSON = function() {
      ScrollingPagerDTOObject <- list()
      if (!is.null(self$`nextPageToken`)) {
        ScrollingPagerDTOObject[["nextPageToken"]] <-
          self$`nextPageToken`
      }
      if (!is.null(self$`prevPageToken`)) {
        ScrollingPagerDTOObject[["prevPageToken"]] <-
          self$`prevPageToken`
      }
      ScrollingPagerDTOObject
    },
    #' Deserialize JSON string into an instance of ScrollingPagerDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of ScrollingPagerDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of ScrollingPagerDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`nextPageToken`)) {
        self$`nextPageToken` <- this_object$`nextPageToken`
      }
      if (!is.null(this_object$`prevPageToken`)) {
        self$`prevPageToken` <- this_object$`prevPageToken`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return ScrollingPagerDTO in JSON format
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
        },
        if (!is.null(self$`prevPageToken`)) {
          sprintf(
          '"prevPageToken":
            "%s"
                    ',
          self$`prevPageToken`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of ScrollingPagerDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of ScrollingPagerDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of ScrollingPagerDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`nextPageToken` <- this_object$`nextPageToken`
      self$`prevPageToken` <- this_object$`prevPageToken`
      self
    },
    #' Validate JSON input with respect to ScrollingPagerDTO
    #'
    #' @description
    #' Validate JSON input with respect to ScrollingPagerDTO and throw an exception if invalid
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
    #' @return String representation of ScrollingPagerDTO
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
# ScrollingPagerDTO$unlock()
#
## Below is an example to define the print function
# ScrollingPagerDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# ScrollingPagerDTO$lock()

