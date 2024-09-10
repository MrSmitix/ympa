#' Create a new SetFeedParamsRequest
#'
#' @description
#' Запрос на обновление изменение параметров прайс-листа.
#'
#' @docType class
#' @title SetFeedParamsRequest
#' @description SetFeedParamsRequest Class
#' @format An \code{R6Class} generator object
#' @field parameters Параметры прайс-листа.  Обязательный параметр. list(\link{FeedParameterDTO})
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
SetFeedParamsRequest <- R6::R6Class(
  "SetFeedParamsRequest",
  public = list(
    `parameters` = NULL,
    #' Initialize a new SetFeedParamsRequest class.
    #'
    #' @description
    #' Initialize a new SetFeedParamsRequest class.
    #'
    #' @param parameters Параметры прайс-листа.  Обязательный параметр.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`parameters`, ...) {
      if (!missing(`parameters`)) {
        stopifnot(is.vector(`parameters`), length(`parameters`) != 0)
        sapply(`parameters`, function(x) stopifnot(R6::is.R6(x)))
        self$`parameters` <- `parameters`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return SetFeedParamsRequest in JSON format
    #' @export
    toJSON = function() {
      SetFeedParamsRequestObject <- list()
      if (!is.null(self$`parameters`)) {
        SetFeedParamsRequestObject[["parameters"]] <-
          lapply(self$`parameters`, function(x) x$toJSON())
      }
      SetFeedParamsRequestObject
    },
    #' Deserialize JSON string into an instance of SetFeedParamsRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of SetFeedParamsRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of SetFeedParamsRequest
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`parameters`)) {
        self$`parameters` <- ApiClient$new()$deserializeObj(this_object$`parameters`, "array[FeedParameterDTO]", loadNamespace("ympa_r_client"))
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return SetFeedParamsRequest in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`parameters`)) {
          sprintf(
          '"parameters":
          [%s]
',
          paste(sapply(self$`parameters`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of SetFeedParamsRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of SetFeedParamsRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of SetFeedParamsRequest
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`parameters` <- ApiClient$new()$deserializeObj(this_object$`parameters`, "array[FeedParameterDTO]", loadNamespace("ympa_r_client"))
      self
    },
    #' Validate JSON input with respect to SetFeedParamsRequest
    #'
    #' @description
    #' Validate JSON input with respect to SetFeedParamsRequest and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `parameters`
      if (!is.null(input_json$`parameters`)) {
        stopifnot(is.vector(input_json$`parameters`), length(input_json$`parameters`) != 0)
        tmp <- sapply(input_json$`parameters`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for SetFeedParamsRequest: the required field `parameters` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of SetFeedParamsRequest
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
      # check if the required `parameters` is null
      if (is.null(self$`parameters`)) {
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
      # check if the required `parameters` is null
      if (is.null(self$`parameters`)) {
        invalid_fields["parameters"] <- "Non-nullable required field `parameters` cannot be null."
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
# SetFeedParamsRequest$unlock()
#
## Below is an example to define the print function
# SetFeedParamsRequest$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# SetFeedParamsRequest$lock()

