#' Create a new CampaignSettingsTimePeriodDTO
#'
#' @description
#' Период, за который рассчитывается итоговый список нерабочих дней службы доставки.
#'
#' @docType class
#' @title CampaignSettingsTimePeriodDTO
#' @description CampaignSettingsTimePeriodDTO Class
#' @format An \code{R6Class} generator object
#' @field fromDate Формат даты: `ДД-ММ-ГГГГ`. character [optional]
#' @field toDate Формат даты: `ДД-ММ-ГГГГ`. character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CampaignSettingsTimePeriodDTO <- R6::R6Class(
  "CampaignSettingsTimePeriodDTO",
  public = list(
    `fromDate` = NULL,
    `toDate` = NULL,
    #' Initialize a new CampaignSettingsTimePeriodDTO class.
    #'
    #' @description
    #' Initialize a new CampaignSettingsTimePeriodDTO class.
    #'
    #' @param fromDate Формат даты: `ДД-ММ-ГГГГ`.
    #' @param toDate Формат даты: `ДД-ММ-ГГГГ`.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`fromDate` = NULL, `toDate` = NULL, ...) {
      if (!is.null(`fromDate`)) {
        if (!(is.character(`fromDate`) && length(`fromDate`) == 1)) {
          stop(paste("Error! Invalid data for `fromDate`. Must be a string:", `fromDate`))
        }
        self$`fromDate` <- `fromDate`
      }
      if (!is.null(`toDate`)) {
        if (!(is.character(`toDate`) && length(`toDate`) == 1)) {
          stop(paste("Error! Invalid data for `toDate`. Must be a string:", `toDate`))
        }
        self$`toDate` <- `toDate`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return CampaignSettingsTimePeriodDTO in JSON format
    #' @export
    toJSON = function() {
      CampaignSettingsTimePeriodDTOObject <- list()
      if (!is.null(self$`fromDate`)) {
        CampaignSettingsTimePeriodDTOObject[["fromDate"]] <-
          self$`fromDate`
      }
      if (!is.null(self$`toDate`)) {
        CampaignSettingsTimePeriodDTOObject[["toDate"]] <-
          self$`toDate`
      }
      CampaignSettingsTimePeriodDTOObject
    },
    #' Deserialize JSON string into an instance of CampaignSettingsTimePeriodDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of CampaignSettingsTimePeriodDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of CampaignSettingsTimePeriodDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`fromDate`)) {
        self$`fromDate` <- this_object$`fromDate`
      }
      if (!is.null(this_object$`toDate`)) {
        self$`toDate` <- this_object$`toDate`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return CampaignSettingsTimePeriodDTO in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`fromDate`)) {
          sprintf(
          '"fromDate":
            "%s"
                    ',
          self$`fromDate`
          )
        },
        if (!is.null(self$`toDate`)) {
          sprintf(
          '"toDate":
            "%s"
                    ',
          self$`toDate`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of CampaignSettingsTimePeriodDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of CampaignSettingsTimePeriodDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of CampaignSettingsTimePeriodDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`fromDate` <- this_object$`fromDate`
      self$`toDate` <- this_object$`toDate`
      self
    },
    #' Validate JSON input with respect to CampaignSettingsTimePeriodDTO
    #'
    #' @description
    #' Validate JSON input with respect to CampaignSettingsTimePeriodDTO and throw an exception if invalid
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
    #' @return String representation of CampaignSettingsTimePeriodDTO
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
# CampaignSettingsTimePeriodDTO$unlock()
#
## Below is an example to define the print function
# CampaignSettingsTimePeriodDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CampaignSettingsTimePeriodDTO$lock()

