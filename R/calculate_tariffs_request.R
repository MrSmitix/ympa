#' Create a new CalculateTariffsRequest
#'
#' @description
#' CalculateTariffsRequest Class
#'
#' @docType class
#' @title CalculateTariffsRequest
#' @description CalculateTariffsRequest Class
#' @format An \code{R6Class} generator object
#' @field parameters  \link{CalculateTariffsParametersDTO}
#' @field offers Товары, для которых нужно рассчитать стоимость услуг. list(\link{CalculateTariffsOfferDTO})
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CalculateTariffsRequest <- R6::R6Class(
  "CalculateTariffsRequest",
  public = list(
    `parameters` = NULL,
    `offers` = NULL,
    #' Initialize a new CalculateTariffsRequest class.
    #'
    #' @description
    #' Initialize a new CalculateTariffsRequest class.
    #'
    #' @param parameters parameters
    #' @param offers Товары, для которых нужно рассчитать стоимость услуг.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`parameters`, `offers`, ...) {
      if (!missing(`parameters`)) {
        stopifnot(R6::is.R6(`parameters`))
        self$`parameters` <- `parameters`
      }
      if (!missing(`offers`)) {
        stopifnot(is.vector(`offers`), length(`offers`) != 0)
        sapply(`offers`, function(x) stopifnot(R6::is.R6(x)))
        self$`offers` <- `offers`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return CalculateTariffsRequest in JSON format
    #' @export
    toJSON = function() {
      CalculateTariffsRequestObject <- list()
      if (!is.null(self$`parameters`)) {
        CalculateTariffsRequestObject[["parameters"]] <-
          self$`parameters`$toJSON()
      }
      if (!is.null(self$`offers`)) {
        CalculateTariffsRequestObject[["offers"]] <-
          lapply(self$`offers`, function(x) x$toJSON())
      }
      CalculateTariffsRequestObject
    },
    #' Deserialize JSON string into an instance of CalculateTariffsRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of CalculateTariffsRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of CalculateTariffsRequest
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`parameters`)) {
        `parameters_object` <- CalculateTariffsParametersDTO$new()
        `parameters_object`$fromJSON(jsonlite::toJSON(this_object$`parameters`, auto_unbox = TRUE, digits = NA))
        self$`parameters` <- `parameters_object`
      }
      if (!is.null(this_object$`offers`)) {
        self$`offers` <- ApiClient$new()$deserializeObj(this_object$`offers`, "array[CalculateTariffsOfferDTO]", loadNamespace("ympa_r_client"))
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return CalculateTariffsRequest in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`parameters`)) {
          sprintf(
          '"parameters":
          %s
          ',
          jsonlite::toJSON(self$`parameters`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`offers`)) {
          sprintf(
          '"offers":
          [%s]
',
          paste(sapply(self$`offers`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of CalculateTariffsRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of CalculateTariffsRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of CalculateTariffsRequest
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`parameters` <- CalculateTariffsParametersDTO$new()$fromJSON(jsonlite::toJSON(this_object$`parameters`, auto_unbox = TRUE, digits = NA))
      self$`offers` <- ApiClient$new()$deserializeObj(this_object$`offers`, "array[CalculateTariffsOfferDTO]", loadNamespace("ympa_r_client"))
      self
    },
    #' Validate JSON input with respect to CalculateTariffsRequest
    #'
    #' @description
    #' Validate JSON input with respect to CalculateTariffsRequest and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `parameters`
      if (!is.null(input_json$`parameters`)) {
        stopifnot(R6::is.R6(input_json$`parameters`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CalculateTariffsRequest: the required field `parameters` is missing."))
      }
      # check the required field `offers`
      if (!is.null(input_json$`offers`)) {
        stopifnot(is.vector(input_json$`offers`), length(input_json$`offers`) != 0)
        tmp <- sapply(input_json$`offers`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CalculateTariffsRequest: the required field `offers` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CalculateTariffsRequest
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

      # check if the required `offers` is null
      if (is.null(self$`offers`)) {
        return(FALSE)
      }

      if (length(self$`offers`) > 200) {
        return(FALSE)
      }
      if (length(self$`offers`) < 1) {
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

      # check if the required `offers` is null
      if (is.null(self$`offers`)) {
        invalid_fields["offers"] <- "Non-nullable required field `offers` cannot be null."
      }

      if (length(self$`offers`) > 200) {
        invalid_fields["offers"] <- "Invalid length for `offers`, number of items must be less than or equal to 200."
      }
      if (length(self$`offers`) < 1) {
        invalid_fields["offers"] <- "Invalid length for ``, number of items must be greater than or equal to 1."
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
# CalculateTariffsRequest$unlock()
#
## Below is an example to define the print function
# CalculateTariffsRequest$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CalculateTariffsRequest$lock()

