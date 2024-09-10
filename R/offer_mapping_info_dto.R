#' Create a new OfferMappingInfoDTO
#'
#' @description
#' Информация о карточке товара.
#'
#' @docType class
#' @title OfferMappingInfoDTO
#' @description OfferMappingInfoDTO Class
#' @format An \code{R6Class} generator object
#' @field mapping  \link{OfferMappingDTO} [optional]
#' @field awaitingModerationMapping  \link{OfferMappingDTO} [optional]
#' @field rejectedMapping  \link{OfferMappingDTO} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
OfferMappingInfoDTO <- R6::R6Class(
  "OfferMappingInfoDTO",
  public = list(
    `mapping` = NULL,
    `awaitingModerationMapping` = NULL,
    `rejectedMapping` = NULL,
    #' Initialize a new OfferMappingInfoDTO class.
    #'
    #' @description
    #' Initialize a new OfferMappingInfoDTO class.
    #'
    #' @param mapping mapping
    #' @param awaitingModerationMapping awaitingModerationMapping
    #' @param rejectedMapping rejectedMapping
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`mapping` = NULL, `awaitingModerationMapping` = NULL, `rejectedMapping` = NULL, ...) {
      if (!is.null(`mapping`)) {
        stopifnot(R6::is.R6(`mapping`))
        self$`mapping` <- `mapping`
      }
      if (!is.null(`awaitingModerationMapping`)) {
        stopifnot(R6::is.R6(`awaitingModerationMapping`))
        self$`awaitingModerationMapping` <- `awaitingModerationMapping`
      }
      if (!is.null(`rejectedMapping`)) {
        stopifnot(R6::is.R6(`rejectedMapping`))
        self$`rejectedMapping` <- `rejectedMapping`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return OfferMappingInfoDTO in JSON format
    #' @export
    toJSON = function() {
      OfferMappingInfoDTOObject <- list()
      if (!is.null(self$`mapping`)) {
        OfferMappingInfoDTOObject[["mapping"]] <-
          self$`mapping`$toJSON()
      }
      if (!is.null(self$`awaitingModerationMapping`)) {
        OfferMappingInfoDTOObject[["awaitingModerationMapping"]] <-
          self$`awaitingModerationMapping`$toJSON()
      }
      if (!is.null(self$`rejectedMapping`)) {
        OfferMappingInfoDTOObject[["rejectedMapping"]] <-
          self$`rejectedMapping`$toJSON()
      }
      OfferMappingInfoDTOObject
    },
    #' Deserialize JSON string into an instance of OfferMappingInfoDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of OfferMappingInfoDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of OfferMappingInfoDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`mapping`)) {
        `mapping_object` <- OfferMappingDTO$new()
        `mapping_object`$fromJSON(jsonlite::toJSON(this_object$`mapping`, auto_unbox = TRUE, digits = NA))
        self$`mapping` <- `mapping_object`
      }
      if (!is.null(this_object$`awaitingModerationMapping`)) {
        `awaitingmoderationmapping_object` <- OfferMappingDTO$new()
        `awaitingmoderationmapping_object`$fromJSON(jsonlite::toJSON(this_object$`awaitingModerationMapping`, auto_unbox = TRUE, digits = NA))
        self$`awaitingModerationMapping` <- `awaitingmoderationmapping_object`
      }
      if (!is.null(this_object$`rejectedMapping`)) {
        `rejectedmapping_object` <- OfferMappingDTO$new()
        `rejectedmapping_object`$fromJSON(jsonlite::toJSON(this_object$`rejectedMapping`, auto_unbox = TRUE, digits = NA))
        self$`rejectedMapping` <- `rejectedmapping_object`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return OfferMappingInfoDTO in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`mapping`)) {
          sprintf(
          '"mapping":
          %s
          ',
          jsonlite::toJSON(self$`mapping`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`awaitingModerationMapping`)) {
          sprintf(
          '"awaitingModerationMapping":
          %s
          ',
          jsonlite::toJSON(self$`awaitingModerationMapping`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`rejectedMapping`)) {
          sprintf(
          '"rejectedMapping":
          %s
          ',
          jsonlite::toJSON(self$`rejectedMapping`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of OfferMappingInfoDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of OfferMappingInfoDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of OfferMappingInfoDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`mapping` <- OfferMappingDTO$new()$fromJSON(jsonlite::toJSON(this_object$`mapping`, auto_unbox = TRUE, digits = NA))
      self$`awaitingModerationMapping` <- OfferMappingDTO$new()$fromJSON(jsonlite::toJSON(this_object$`awaitingModerationMapping`, auto_unbox = TRUE, digits = NA))
      self$`rejectedMapping` <- OfferMappingDTO$new()$fromJSON(jsonlite::toJSON(this_object$`rejectedMapping`, auto_unbox = TRUE, digits = NA))
      self
    },
    #' Validate JSON input with respect to OfferMappingInfoDTO
    #'
    #' @description
    #' Validate JSON input with respect to OfferMappingInfoDTO and throw an exception if invalid
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
    #' @return String representation of OfferMappingInfoDTO
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
# OfferMappingInfoDTO$unlock()
#
## Below is an example to define the print function
# OfferMappingInfoDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# OfferMappingInfoDTO$lock()

