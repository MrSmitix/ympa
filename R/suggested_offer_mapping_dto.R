#' Create a new SuggestedOfferMappingDTO
#'
#' @description
#' Товар с соответствующей карточкой на Маркете.
#'
#' @docType class
#' @title SuggestedOfferMappingDTO
#' @description SuggestedOfferMappingDTO Class
#' @format An \code{R6Class} generator object
#' @field offer  \link{SuggestedOfferDTO} [optional]
#' @field mapping  \link{GetMappingDTO} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
SuggestedOfferMappingDTO <- R6::R6Class(
  "SuggestedOfferMappingDTO",
  public = list(
    `offer` = NULL,
    `mapping` = NULL,
    #' Initialize a new SuggestedOfferMappingDTO class.
    #'
    #' @description
    #' Initialize a new SuggestedOfferMappingDTO class.
    #'
    #' @param offer offer
    #' @param mapping mapping
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`offer` = NULL, `mapping` = NULL, ...) {
      if (!is.null(`offer`)) {
        stopifnot(R6::is.R6(`offer`))
        self$`offer` <- `offer`
      }
      if (!is.null(`mapping`)) {
        stopifnot(R6::is.R6(`mapping`))
        self$`mapping` <- `mapping`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return SuggestedOfferMappingDTO in JSON format
    #' @export
    toJSON = function() {
      SuggestedOfferMappingDTOObject <- list()
      if (!is.null(self$`offer`)) {
        SuggestedOfferMappingDTOObject[["offer"]] <-
          self$`offer`$toJSON()
      }
      if (!is.null(self$`mapping`)) {
        SuggestedOfferMappingDTOObject[["mapping"]] <-
          self$`mapping`$toJSON()
      }
      SuggestedOfferMappingDTOObject
    },
    #' Deserialize JSON string into an instance of SuggestedOfferMappingDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of SuggestedOfferMappingDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of SuggestedOfferMappingDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`offer`)) {
        `offer_object` <- SuggestedOfferDTO$new()
        `offer_object`$fromJSON(jsonlite::toJSON(this_object$`offer`, auto_unbox = TRUE, digits = NA))
        self$`offer` <- `offer_object`
      }
      if (!is.null(this_object$`mapping`)) {
        `mapping_object` <- GetMappingDTO$new()
        `mapping_object`$fromJSON(jsonlite::toJSON(this_object$`mapping`, auto_unbox = TRUE, digits = NA))
        self$`mapping` <- `mapping_object`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return SuggestedOfferMappingDTO in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`offer`)) {
          sprintf(
          '"offer":
          %s
          ',
          jsonlite::toJSON(self$`offer`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`mapping`)) {
          sprintf(
          '"mapping":
          %s
          ',
          jsonlite::toJSON(self$`mapping`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of SuggestedOfferMappingDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of SuggestedOfferMappingDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of SuggestedOfferMappingDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`offer` <- SuggestedOfferDTO$new()$fromJSON(jsonlite::toJSON(this_object$`offer`, auto_unbox = TRUE, digits = NA))
      self$`mapping` <- GetMappingDTO$new()$fromJSON(jsonlite::toJSON(this_object$`mapping`, auto_unbox = TRUE, digits = NA))
      self
    },
    #' Validate JSON input with respect to SuggestedOfferMappingDTO
    #'
    #' @description
    #' Validate JSON input with respect to SuggestedOfferMappingDTO and throw an exception if invalid
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
    #' @return String representation of SuggestedOfferMappingDTO
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
# SuggestedOfferMappingDTO$unlock()
#
## Below is an example to define the print function
# SuggestedOfferMappingDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# SuggestedOfferMappingDTO$lock()

