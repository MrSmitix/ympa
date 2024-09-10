#' Create a new OutletLicensesResponseDTO
#'
#' @description
#' Ответ на запрос информации о лицензиях для точек продаж.
#'
#' @docType class
#' @title OutletLicensesResponseDTO
#' @description OutletLicensesResponseDTO Class
#' @format An \code{R6Class} generator object
#' @field licenses Список лицензий. list(\link{FullOutletLicenseDTO})
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
OutletLicensesResponseDTO <- R6::R6Class(
  "OutletLicensesResponseDTO",
  public = list(
    `licenses` = NULL,
    #' Initialize a new OutletLicensesResponseDTO class.
    #'
    #' @description
    #' Initialize a new OutletLicensesResponseDTO class.
    #'
    #' @param licenses Список лицензий.
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
    #' @return OutletLicensesResponseDTO in JSON format
    #' @export
    toJSON = function() {
      OutletLicensesResponseDTOObject <- list()
      if (!is.null(self$`licenses`)) {
        OutletLicensesResponseDTOObject[["licenses"]] <-
          lapply(self$`licenses`, function(x) x$toJSON())
      }
      OutletLicensesResponseDTOObject
    },
    #' Deserialize JSON string into an instance of OutletLicensesResponseDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of OutletLicensesResponseDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of OutletLicensesResponseDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`licenses`)) {
        self$`licenses` <- ApiClient$new()$deserializeObj(this_object$`licenses`, "array[FullOutletLicenseDTO]", loadNamespace("ympa_r_client"))
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return OutletLicensesResponseDTO in JSON format
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
    #' Deserialize JSON string into an instance of OutletLicensesResponseDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of OutletLicensesResponseDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of OutletLicensesResponseDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`licenses` <- ApiClient$new()$deserializeObj(this_object$`licenses`, "array[FullOutletLicenseDTO]", loadNamespace("ympa_r_client"))
      self
    },
    #' Validate JSON input with respect to OutletLicensesResponseDTO
    #'
    #' @description
    #' Validate JSON input with respect to OutletLicensesResponseDTO and throw an exception if invalid
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
        stop(paste("The JSON input `", input, "` is invalid for OutletLicensesResponseDTO: the required field `licenses` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of OutletLicensesResponseDTO
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
# OutletLicensesResponseDTO$unlock()
#
## Below is an example to define the print function
# OutletLicensesResponseDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# OutletLicensesResponseDTO$lock()

