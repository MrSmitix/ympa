#' Create a new GetBusinessSettingsInfoDTO
#'
#' @description
#' Информация о кабинете и его настройках.
#'
#' @docType class
#' @title GetBusinessSettingsInfoDTO
#' @description GetBusinessSettingsInfoDTO Class
#' @format An \code{R6Class} generator object
#' @field info  \link{BusinessDTO} [optional]
#' @field settings  \link{BusinessSettingsDTO} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
GetBusinessSettingsInfoDTO <- R6::R6Class(
  "GetBusinessSettingsInfoDTO",
  public = list(
    `info` = NULL,
    `settings` = NULL,
    #' Initialize a new GetBusinessSettingsInfoDTO class.
    #'
    #' @description
    #' Initialize a new GetBusinessSettingsInfoDTO class.
    #'
    #' @param info info
    #' @param settings settings
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`info` = NULL, `settings` = NULL, ...) {
      if (!is.null(`info`)) {
        stopifnot(R6::is.R6(`info`))
        self$`info` <- `info`
      }
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
    #' @return GetBusinessSettingsInfoDTO in JSON format
    #' @export
    toJSON = function() {
      GetBusinessSettingsInfoDTOObject <- list()
      if (!is.null(self$`info`)) {
        GetBusinessSettingsInfoDTOObject[["info"]] <-
          self$`info`$toJSON()
      }
      if (!is.null(self$`settings`)) {
        GetBusinessSettingsInfoDTOObject[["settings"]] <-
          self$`settings`$toJSON()
      }
      GetBusinessSettingsInfoDTOObject
    },
    #' Deserialize JSON string into an instance of GetBusinessSettingsInfoDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of GetBusinessSettingsInfoDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of GetBusinessSettingsInfoDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`info`)) {
        `info_object` <- BusinessDTO$new()
        `info_object`$fromJSON(jsonlite::toJSON(this_object$`info`, auto_unbox = TRUE, digits = NA))
        self$`info` <- `info_object`
      }
      if (!is.null(this_object$`settings`)) {
        `settings_object` <- BusinessSettingsDTO$new()
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
    #' @return GetBusinessSettingsInfoDTO in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`info`)) {
          sprintf(
          '"info":
          %s
          ',
          jsonlite::toJSON(self$`info`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
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
    #' Deserialize JSON string into an instance of GetBusinessSettingsInfoDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of GetBusinessSettingsInfoDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of GetBusinessSettingsInfoDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`info` <- BusinessDTO$new()$fromJSON(jsonlite::toJSON(this_object$`info`, auto_unbox = TRUE, digits = NA))
      self$`settings` <- BusinessSettingsDTO$new()$fromJSON(jsonlite::toJSON(this_object$`settings`, auto_unbox = TRUE, digits = NA))
      self
    },
    #' Validate JSON input with respect to GetBusinessSettingsInfoDTO
    #'
    #' @description
    #' Validate JSON input with respect to GetBusinessSettingsInfoDTO and throw an exception if invalid
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
    #' @return String representation of GetBusinessSettingsInfoDTO
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
# GetBusinessSettingsInfoDTO$unlock()
#
## Below is an example to define the print function
# GetBusinessSettingsInfoDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# GetBusinessSettingsInfoDTO$lock()

