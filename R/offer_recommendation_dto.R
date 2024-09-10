#' Create a new OfferRecommendationDTO
#'
#' @description
#' Информация о состоянии цен и рекомендации. 
#'
#' @docType class
#' @title OfferRecommendationDTO
#' @description OfferRecommendationDTO Class
#' @format An \code{R6Class} generator object
#' @field offer  \link{OfferForRecommendationDTO} [optional]
#' @field recommendation  \link{OfferRecommendationInfoDTO} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
OfferRecommendationDTO <- R6::R6Class(
  "OfferRecommendationDTO",
  public = list(
    `offer` = NULL,
    `recommendation` = NULL,
    #' Initialize a new OfferRecommendationDTO class.
    #'
    #' @description
    #' Initialize a new OfferRecommendationDTO class.
    #'
    #' @param offer offer
    #' @param recommendation recommendation
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`offer` = NULL, `recommendation` = NULL, ...) {
      if (!is.null(`offer`)) {
        stopifnot(R6::is.R6(`offer`))
        self$`offer` <- `offer`
      }
      if (!is.null(`recommendation`)) {
        stopifnot(R6::is.R6(`recommendation`))
        self$`recommendation` <- `recommendation`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return OfferRecommendationDTO in JSON format
    #' @export
    toJSON = function() {
      OfferRecommendationDTOObject <- list()
      if (!is.null(self$`offer`)) {
        OfferRecommendationDTOObject[["offer"]] <-
          self$`offer`$toJSON()
      }
      if (!is.null(self$`recommendation`)) {
        OfferRecommendationDTOObject[["recommendation"]] <-
          self$`recommendation`$toJSON()
      }
      OfferRecommendationDTOObject
    },
    #' Deserialize JSON string into an instance of OfferRecommendationDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of OfferRecommendationDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of OfferRecommendationDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`offer`)) {
        `offer_object` <- OfferForRecommendationDTO$new()
        `offer_object`$fromJSON(jsonlite::toJSON(this_object$`offer`, auto_unbox = TRUE, digits = NA))
        self$`offer` <- `offer_object`
      }
      if (!is.null(this_object$`recommendation`)) {
        `recommendation_object` <- OfferRecommendationInfoDTO$new()
        `recommendation_object`$fromJSON(jsonlite::toJSON(this_object$`recommendation`, auto_unbox = TRUE, digits = NA))
        self$`recommendation` <- `recommendation_object`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return OfferRecommendationDTO in JSON format
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
        if (!is.null(self$`recommendation`)) {
          sprintf(
          '"recommendation":
          %s
          ',
          jsonlite::toJSON(self$`recommendation`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of OfferRecommendationDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of OfferRecommendationDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of OfferRecommendationDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`offer` <- OfferForRecommendationDTO$new()$fromJSON(jsonlite::toJSON(this_object$`offer`, auto_unbox = TRUE, digits = NA))
      self$`recommendation` <- OfferRecommendationInfoDTO$new()$fromJSON(jsonlite::toJSON(this_object$`recommendation`, auto_unbox = TRUE, digits = NA))
      self
    },
    #' Validate JSON input with respect to OfferRecommendationDTO
    #'
    #' @description
    #' Validate JSON input with respect to OfferRecommendationDTO and throw an exception if invalid
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
    #' @return String representation of OfferRecommendationDTO
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
# OfferRecommendationDTO$unlock()
#
## Below is an example to define the print function
# OfferRecommendationDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# OfferRecommendationDTO$lock()

