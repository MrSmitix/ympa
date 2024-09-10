#' Create a new GetPromosRequest
#'
#' @description
#' Фильтры для получения списка акций.
#'
#' @docType class
#' @title GetPromosRequest
#' @description GetPromosRequest Class
#' @format An \code{R6Class} generator object
#' @field participation  \link{PromoParticipationType} [optional]
#' @field mechanics  \link{MechanicsType} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
GetPromosRequest <- R6::R6Class(
  "GetPromosRequest",
  public = list(
    `participation` = NULL,
    `mechanics` = NULL,
    #' Initialize a new GetPromosRequest class.
    #'
    #' @description
    #' Initialize a new GetPromosRequest class.
    #'
    #' @param participation participation
    #' @param mechanics mechanics
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`participation` = NULL, `mechanics` = NULL, ...) {
      if (!is.null(`participation`)) {
        if (!(`participation` %in% c())) {
          stop(paste("Error! \"", `participation`, "\" cannot be assigned to `participation`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`participation`))
        self$`participation` <- `participation`
      }
      if (!is.null(`mechanics`)) {
        if (!(`mechanics` %in% c())) {
          stop(paste("Error! \"", `mechanics`, "\" cannot be assigned to `mechanics`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`mechanics`))
        self$`mechanics` <- `mechanics`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return GetPromosRequest in JSON format
    #' @export
    toJSON = function() {
      GetPromosRequestObject <- list()
      if (!is.null(self$`participation`)) {
        GetPromosRequestObject[["participation"]] <-
          self$`participation`$toJSON()
      }
      if (!is.null(self$`mechanics`)) {
        GetPromosRequestObject[["mechanics"]] <-
          self$`mechanics`$toJSON()
      }
      GetPromosRequestObject
    },
    #' Deserialize JSON string into an instance of GetPromosRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of GetPromosRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of GetPromosRequest
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`participation`)) {
        `participation_object` <- PromoParticipationType$new()
        `participation_object`$fromJSON(jsonlite::toJSON(this_object$`participation`, auto_unbox = TRUE, digits = NA))
        self$`participation` <- `participation_object`
      }
      if (!is.null(this_object$`mechanics`)) {
        `mechanics_object` <- MechanicsType$new()
        `mechanics_object`$fromJSON(jsonlite::toJSON(this_object$`mechanics`, auto_unbox = TRUE, digits = NA))
        self$`mechanics` <- `mechanics_object`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return GetPromosRequest in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`participation`)) {
          sprintf(
          '"participation":
          %s
          ',
          jsonlite::toJSON(self$`participation`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`mechanics`)) {
          sprintf(
          '"mechanics":
          %s
          ',
          jsonlite::toJSON(self$`mechanics`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of GetPromosRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of GetPromosRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of GetPromosRequest
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`participation` <- PromoParticipationType$new()$fromJSON(jsonlite::toJSON(this_object$`participation`, auto_unbox = TRUE, digits = NA))
      self$`mechanics` <- MechanicsType$new()$fromJSON(jsonlite::toJSON(this_object$`mechanics`, auto_unbox = TRUE, digits = NA))
      self
    },
    #' Validate JSON input with respect to GetPromosRequest
    #'
    #' @description
    #' Validate JSON input with respect to GetPromosRequest and throw an exception if invalid
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
    #' @return String representation of GetPromosRequest
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
# GetPromosRequest$unlock()
#
## Below is an example to define the print function
# GetPromosRequest$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# GetPromosRequest$lock()

