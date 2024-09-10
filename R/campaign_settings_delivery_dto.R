#' Create a new CampaignSettingsDeliveryDTO
#'
#' @description
#' Информация о доставке в своем регионе магазина.
#'
#' @docType class
#' @title CampaignSettingsDeliveryDTO
#' @description CampaignSettingsDeliveryDTO Class
#' @format An \code{R6Class} generator object
#' @field schedule  \link{CampaignSettingsScheduleDTO} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CampaignSettingsDeliveryDTO <- R6::R6Class(
  "CampaignSettingsDeliveryDTO",
  public = list(
    `schedule` = NULL,
    #' Initialize a new CampaignSettingsDeliveryDTO class.
    #'
    #' @description
    #' Initialize a new CampaignSettingsDeliveryDTO class.
    #'
    #' @param schedule schedule
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`schedule` = NULL, ...) {
      if (!is.null(`schedule`)) {
        stopifnot(R6::is.R6(`schedule`))
        self$`schedule` <- `schedule`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return CampaignSettingsDeliveryDTO in JSON format
    #' @export
    toJSON = function() {
      CampaignSettingsDeliveryDTOObject <- list()
      if (!is.null(self$`schedule`)) {
        CampaignSettingsDeliveryDTOObject[["schedule"]] <-
          self$`schedule`$toJSON()
      }
      CampaignSettingsDeliveryDTOObject
    },
    #' Deserialize JSON string into an instance of CampaignSettingsDeliveryDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of CampaignSettingsDeliveryDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of CampaignSettingsDeliveryDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`schedule`)) {
        `schedule_object` <- CampaignSettingsScheduleDTO$new()
        `schedule_object`$fromJSON(jsonlite::toJSON(this_object$`schedule`, auto_unbox = TRUE, digits = NA))
        self$`schedule` <- `schedule_object`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return CampaignSettingsDeliveryDTO in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`schedule`)) {
          sprintf(
          '"schedule":
          %s
          ',
          jsonlite::toJSON(self$`schedule`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of CampaignSettingsDeliveryDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of CampaignSettingsDeliveryDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of CampaignSettingsDeliveryDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`schedule` <- CampaignSettingsScheduleDTO$new()$fromJSON(jsonlite::toJSON(this_object$`schedule`, auto_unbox = TRUE, digits = NA))
      self
    },
    #' Validate JSON input with respect to CampaignSettingsDeliveryDTO
    #'
    #' @description
    #' Validate JSON input with respect to CampaignSettingsDeliveryDTO and throw an exception if invalid
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
    #' @return String representation of CampaignSettingsDeliveryDTO
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
# CampaignSettingsDeliveryDTO$unlock()
#
## Below is an example to define the print function
# CampaignSettingsDeliveryDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CampaignSettingsDeliveryDTO$lock()

