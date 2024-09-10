#' Create a new GetCampaignRegionResponse
#'
#' @description
#' Ответ на запрос региона магазина.
#'
#' @docType class
#' @title GetCampaignRegionResponse
#' @description GetCampaignRegionResponse Class
#' @format An \code{R6Class} generator object
#' @field region  \link{RegionDTO} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
GetCampaignRegionResponse <- R6::R6Class(
  "GetCampaignRegionResponse",
  public = list(
    `region` = NULL,
    #' Initialize a new GetCampaignRegionResponse class.
    #'
    #' @description
    #' Initialize a new GetCampaignRegionResponse class.
    #'
    #' @param region region
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`region` = NULL, ...) {
      if (!is.null(`region`)) {
        stopifnot(R6::is.R6(`region`))
        self$`region` <- `region`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return GetCampaignRegionResponse in JSON format
    #' @export
    toJSON = function() {
      GetCampaignRegionResponseObject <- list()
      if (!is.null(self$`region`)) {
        GetCampaignRegionResponseObject[["region"]] <-
          self$`region`$toJSON()
      }
      GetCampaignRegionResponseObject
    },
    #' Deserialize JSON string into an instance of GetCampaignRegionResponse
    #'
    #' @description
    #' Deserialize JSON string into an instance of GetCampaignRegionResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of GetCampaignRegionResponse
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`region`)) {
        `region_object` <- RegionDTO$new()
        `region_object`$fromJSON(jsonlite::toJSON(this_object$`region`, auto_unbox = TRUE, digits = NA))
        self$`region` <- `region_object`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return GetCampaignRegionResponse in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`region`)) {
          sprintf(
          '"region":
          %s
          ',
          jsonlite::toJSON(self$`region`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of GetCampaignRegionResponse
    #'
    #' @description
    #' Deserialize JSON string into an instance of GetCampaignRegionResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of GetCampaignRegionResponse
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`region` <- RegionDTO$new()$fromJSON(jsonlite::toJSON(this_object$`region`, auto_unbox = TRUE, digits = NA))
      self
    },
    #' Validate JSON input with respect to GetCampaignRegionResponse
    #'
    #' @description
    #' Validate JSON input with respect to GetCampaignRegionResponse and throw an exception if invalid
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
    #' @return String representation of GetCampaignRegionResponse
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
# GetCampaignRegionResponse$unlock()
#
## Below is an example to define the print function
# GetCampaignRegionResponse$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# GetCampaignRegionResponse$lock()

