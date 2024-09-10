#' Create a new GetCampaignSettingsResponse
#'
#' @description
#' Ответ на запрос настроек магазина.
#'
#' @docType class
#' @title GetCampaignSettingsResponse
#' @description GetCampaignSettingsResponse Class
#' @format An \code{R6Class} generator object
#' @field settings  \link{CampaignSettingsDTO} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
GetCampaignSettingsResponse <- R6::R6Class(
  "GetCampaignSettingsResponse",
  public = list(
    `settings` = NULL,
    #' Initialize a new GetCampaignSettingsResponse class.
    #'
    #' @description
    #' Initialize a new GetCampaignSettingsResponse class.
    #'
    #' @param settings settings
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`settings` = NULL, ...) {
      if (!is.null(`settings`)) {
        stopifnot(R6::is.R6(`settings`))
        self$`settings` <- `settings`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return GetCampaignSettingsResponse in JSON format
    #' @export
    toJSON = function() {
      GetCampaignSettingsResponseObject <- list()
      if (!is.null(self$`settings`)) {
        GetCampaignSettingsResponseObject[["settings"]] <-
          self$`settings`$toJSON()
      }
      GetCampaignSettingsResponseObject
    },
    #' Deserialize JSON string into an instance of GetCampaignSettingsResponse
    #'
    #' @description
    #' Deserialize JSON string into an instance of GetCampaignSettingsResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of GetCampaignSettingsResponse
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`settings`)) {
        `settings_object` <- CampaignSettingsDTO$new()
        `settings_object`$fromJSON(jsonlite::toJSON(this_object$`settings`, auto_unbox = TRUE, digits = NA))
        self$`settings` <- `settings_object`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return GetCampaignSettingsResponse in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`settings`)) {
          sprintf(
          '"settings":
          %s
          ',
          jsonlite::toJSON(self$`settings`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of GetCampaignSettingsResponse
    #'
    #' @description
    #' Deserialize JSON string into an instance of GetCampaignSettingsResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of GetCampaignSettingsResponse
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`settings` <- CampaignSettingsDTO$new()$fromJSON(jsonlite::toJSON(this_object$`settings`, auto_unbox = TRUE, digits = NA))
      self
    },
    #' Validate JSON input with respect to GetCampaignSettingsResponse
    #'
    #' @description
    #' Validate JSON input with respect to GetCampaignSettingsResponse and throw an exception if invalid
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
    #' @return String representation of GetCampaignSettingsResponse
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
# GetCampaignSettingsResponse$unlock()
#
## Below is an example to define the print function
# GetCampaignSettingsResponse$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# GetCampaignSettingsResponse$lock()

