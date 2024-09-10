#' Create a new UpdateOutletLicenseRequest
#'
#' @description
#' Запрос на создание или изменение лицензий для точек продаж.
#'
#' @docType class
#' @title UpdateOutletLicenseRequest
#' @description UpdateOutletLicenseRequest Class
#' @format An \code{R6Class} generator object
#' @field licenses Список лицензий. Обязательный параметр, должен содержать информацию хотя бы об одной лицензии. list(\link{OutletLicenseDTO})
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
UpdateOutletLicenseRequest <- R6::R6Class(
  "UpdateOutletLicenseRequest",
  public = list(
    `licenses` = NULL,
    #' Initialize a new UpdateOutletLicenseRequest class.
    #'
    #' @description
    #' Initialize a new UpdateOutletLicenseRequest class.
    #'
    #' @param licenses Список лицензий. Обязательный параметр, должен содержать информацию хотя бы об одной лицензии.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`licenses`, ...) {
      if (!missing(`licenses`)) {
        stopifnot(is.vector(`licenses`), length(`licenses`) != 0)
        sapply(`licenses`, function(x) stopifnot(R6::is.R6(x)))
        self$`licenses` <- `licenses`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return UpdateOutletLicenseRequest in JSON format
    #' @export
    toJSON = function() {
      UpdateOutletLicenseRequestObject <- list()
      if (!is.null(self$`licenses`)) {
        UpdateOutletLicenseRequestObject[["licenses"]] <-
          lapply(self$`licenses`, function(x) x$toJSON())
      }
      UpdateOutletLicenseRequestObject
    },
    #' Deserialize JSON string into an instance of UpdateOutletLicenseRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of UpdateOutletLicenseRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of UpdateOutletLicenseRequest
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`licenses`)) {
        self$`licenses` <- ApiClient$new()$deserializeObj(this_object$`licenses`, "array[OutletLicenseDTO]", loadNamespace("ympa_r_client"))
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return UpdateOutletLicenseRequest in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`licenses`)) {
          sprintf(
          '"licenses":
          [%s]
',
          paste(sapply(self$`licenses`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of UpdateOutletLicenseRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of UpdateOutletLicenseRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of UpdateOutletLicenseRequest
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`licenses` <- ApiClient$new()$deserializeObj(this_object$`licenses`, "array[OutletLicenseDTO]", loadNamespace("ympa_r_client"))
      self
    },
    #' Validate JSON input with respect to UpdateOutletLicenseRequest
    #'
    #' @description
    #' Validate JSON input with respect to UpdateOutletLicenseRequest and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `licenses`
      if (!is.null(input_json$`licenses`)) {
        stopifnot(is.vector(input_json$`licenses`), length(input_json$`licenses`) != 0)
        tmp <- sapply(input_json$`licenses`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for UpdateOutletLicenseRequest: the required field `licenses` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of UpdateOutletLicenseRequest
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
      # check if the required `licenses` is null
      if (is.null(self$`licenses`)) {
        return(FALSE)
      }

      if (length(self$`licenses`) < 1) {
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
      # check if the required `licenses` is null
      if (is.null(self$`licenses`)) {
        invalid_fields["licenses"] <- "Non-nullable required field `licenses` cannot be null."
      }

      if (length(self$`licenses`) < 1) {
        invalid_fields["licenses"] <- "Invalid length for ``, number of items must be greater than or equal to 1."
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
# UpdateOutletLicenseRequest$unlock()
#
## Below is an example to define the print function
# UpdateOutletLicenseRequest$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# UpdateOutletLicenseRequest$lock()

