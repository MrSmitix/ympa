#' Create a new ApiUnauthorizedErrorResponse
#'
#' @description
#' В запросе не указаны авторизационные данные.
#'
#' @docType class
#' @title ApiUnauthorizedErrorResponse
#' @description ApiUnauthorizedErrorResponse Class
#' @format An \code{R6Class} generator object
#' @field status  \link{ApiResponseStatusType} [optional]
#' @field errors Список ошибок. list(\link{ApiErrorDTO}) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ApiUnauthorizedErrorResponse <- R6::R6Class(
  "ApiUnauthorizedErrorResponse",
  public = list(
    `status` = NULL,
    `errors` = NULL,
    #' Initialize a new ApiUnauthorizedErrorResponse class.
    #'
    #' @description
    #' Initialize a new ApiUnauthorizedErrorResponse class.
    #'
    #' @param status status
    #' @param errors Список ошибок.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`status` = NULL, `errors` = NULL, ...) {
      if (!is.null(`status`)) {
        if (!(`status` %in% c())) {
          stop(paste("Error! \"", `status`, "\" cannot be assigned to `status`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`status`))
        self$`status` <- `status`
      }
      if (!is.null(`errors`)) {
        stopifnot(is.vector(`errors`), length(`errors`) != 0)
        sapply(`errors`, function(x) stopifnot(R6::is.R6(x)))
        self$`errors` <- `errors`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return ApiUnauthorizedErrorResponse in JSON format
    #' @export
    toJSON = function() {
      ApiUnauthorizedErrorResponseObject <- list()
      if (!is.null(self$`status`)) {
        ApiUnauthorizedErrorResponseObject[["status"]] <-
          self$`status`$toJSON()
      }
      if (!is.null(self$`errors`)) {
        ApiUnauthorizedErrorResponseObject[["errors"]] <-
          lapply(self$`errors`, function(x) x$toJSON())
      }
      ApiUnauthorizedErrorResponseObject
    },
    #' Deserialize JSON string into an instance of ApiUnauthorizedErrorResponse
    #'
    #' @description
    #' Deserialize JSON string into an instance of ApiUnauthorizedErrorResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of ApiUnauthorizedErrorResponse
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`status`)) {
        `status_object` <- ApiResponseStatusType$new()
        `status_object`$fromJSON(jsonlite::toJSON(this_object$`status`, auto_unbox = TRUE, digits = NA))
        self$`status` <- `status_object`
      }
      if (!is.null(this_object$`errors`)) {
        self$`errors` <- ApiClient$new()$deserializeObj(this_object$`errors`, "array[ApiErrorDTO]", loadNamespace("ympa_r_client"))
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return ApiUnauthorizedErrorResponse in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`status`)) {
          sprintf(
          '"status":
          %s
          ',
          jsonlite::toJSON(self$`status`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`errors`)) {
          sprintf(
          '"errors":
          [%s]
',
          paste(sapply(self$`errors`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of ApiUnauthorizedErrorResponse
    #'
    #' @description
    #' Deserialize JSON string into an instance of ApiUnauthorizedErrorResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of ApiUnauthorizedErrorResponse
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`status` <- ApiResponseStatusType$new()$fromJSON(jsonlite::toJSON(this_object$`status`, auto_unbox = TRUE, digits = NA))
      self$`errors` <- ApiClient$new()$deserializeObj(this_object$`errors`, "array[ApiErrorDTO]", loadNamespace("ympa_r_client"))
      self
    },
    #' Validate JSON input with respect to ApiUnauthorizedErrorResponse
    #'
    #' @description
    #' Validate JSON input with respect to ApiUnauthorizedErrorResponse and throw an exception if invalid
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
    #' @return String representation of ApiUnauthorizedErrorResponse
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
# ApiUnauthorizedErrorResponse$unlock()
#
## Below is an example to define the print function
# ApiUnauthorizedErrorResponse$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# ApiUnauthorizedErrorResponse$lock()

