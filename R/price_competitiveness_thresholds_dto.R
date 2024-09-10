#' Create a new PriceCompetitivenessThresholdsDTO
#'
#' @description
#' Максимальные значения цены, при которых она является привлекательной или умеренной.
#'
#' @docType class
#' @title PriceCompetitivenessThresholdsDTO
#' @description PriceCompetitivenessThresholdsDTO Class
#' @format An \code{R6Class} generator object
#' @field optimalPrice  \link{BasePriceDTO} [optional]
#' @field averagePrice  \link{BasePriceDTO} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
PriceCompetitivenessThresholdsDTO <- R6::R6Class(
  "PriceCompetitivenessThresholdsDTO",
  public = list(
    `optimalPrice` = NULL,
    `averagePrice` = NULL,
    #' Initialize a new PriceCompetitivenessThresholdsDTO class.
    #'
    #' @description
    #' Initialize a new PriceCompetitivenessThresholdsDTO class.
    #'
    #' @param optimalPrice optimalPrice
    #' @param averagePrice averagePrice
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`optimalPrice` = NULL, `averagePrice` = NULL, ...) {
      if (!is.null(`optimalPrice`)) {
        stopifnot(R6::is.R6(`optimalPrice`))
        self$`optimalPrice` <- `optimalPrice`
      }
      if (!is.null(`averagePrice`)) {
        stopifnot(R6::is.R6(`averagePrice`))
        self$`averagePrice` <- `averagePrice`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return PriceCompetitivenessThresholdsDTO in JSON format
    #' @export
    toJSON = function() {
      PriceCompetitivenessThresholdsDTOObject <- list()
      if (!is.null(self$`optimalPrice`)) {
        PriceCompetitivenessThresholdsDTOObject[["optimalPrice"]] <-
          self$`optimalPrice`$toJSON()
      }
      if (!is.null(self$`averagePrice`)) {
        PriceCompetitivenessThresholdsDTOObject[["averagePrice"]] <-
          self$`averagePrice`$toJSON()
      }
      PriceCompetitivenessThresholdsDTOObject
    },
    #' Deserialize JSON string into an instance of PriceCompetitivenessThresholdsDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of PriceCompetitivenessThresholdsDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of PriceCompetitivenessThresholdsDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`optimalPrice`)) {
        `optimalprice_object` <- BasePriceDTO$new()
        `optimalprice_object`$fromJSON(jsonlite::toJSON(this_object$`optimalPrice`, auto_unbox = TRUE, digits = NA))
        self$`optimalPrice` <- `optimalprice_object`
      }
      if (!is.null(this_object$`averagePrice`)) {
        `averageprice_object` <- BasePriceDTO$new()
        `averageprice_object`$fromJSON(jsonlite::toJSON(this_object$`averagePrice`, auto_unbox = TRUE, digits = NA))
        self$`averagePrice` <- `averageprice_object`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return PriceCompetitivenessThresholdsDTO in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`optimalPrice`)) {
          sprintf(
          '"optimalPrice":
          %s
          ',
          jsonlite::toJSON(self$`optimalPrice`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`averagePrice`)) {
          sprintf(
          '"averagePrice":
          %s
          ',
          jsonlite::toJSON(self$`averagePrice`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of PriceCompetitivenessThresholdsDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of PriceCompetitivenessThresholdsDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of PriceCompetitivenessThresholdsDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`optimalPrice` <- BasePriceDTO$new()$fromJSON(jsonlite::toJSON(this_object$`optimalPrice`, auto_unbox = TRUE, digits = NA))
      self$`averagePrice` <- BasePriceDTO$new()$fromJSON(jsonlite::toJSON(this_object$`averagePrice`, auto_unbox = TRUE, digits = NA))
      self
    },
    #' Validate JSON input with respect to PriceCompetitivenessThresholdsDTO
    #'
    #' @description
    #' Validate JSON input with respect to PriceCompetitivenessThresholdsDTO and throw an exception if invalid
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
    #' @return String representation of PriceCompetitivenessThresholdsDTO
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
# PriceCompetitivenessThresholdsDTO$unlock()
#
## Below is an example to define the print function
# PriceCompetitivenessThresholdsDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# PriceCompetitivenessThresholdsDTO$lock()

