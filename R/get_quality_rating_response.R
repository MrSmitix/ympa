#' Create a new GetQualityRatingResponse
#'
#' @description
#' Информация об индексе качества магазинов.
#'
#' @docType class
#' @title GetQualityRatingResponse
#' @description GetQualityRatingResponse Class
#' @format An \code{R6Class} generator object
#' @field status  \link{ApiResponseStatusType} [optional]
#' @field result  \link{CampaignsQualityRatingDTO} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
GetQualityRatingResponse <- R6::R6Class(
  "GetQualityRatingResponse",
  public = list(
    `status` = NULL,
    `result` = NULL,
    #' Initialize a new GetQualityRatingResponse class.
    #'
    #' @description
    #' Initialize a new GetQualityRatingResponse class.
    #'
    #' @param status status
    #' @param result result
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`status` = NULL, `result` = NULL, ...) {
      if (!is.null(`status`)) {
        if (!(`status` %in% c())) {
          stop(paste("Error! \"", `status`, "\" cannot be assigned to `status`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`status`))
        self$`status` <- `status`
      }
      if (!is.null(`result`)) {
        stopifnot(R6::is.R6(`result`))
        self$`result` <- `result`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return GetQualityRatingResponse in JSON format
    #' @export
    toJSON = function() {
      GetQualityRatingResponseObject <- list()
      if (!is.null(self$`status`)) {
        GetQualityRatingResponseObject[["status"]] <-
          self$`status`$toJSON()
      }
      if (!is.null(self$`result`)) {
        GetQualityRatingResponseObject[["result"]] <-
          self$`result`$toJSON()
      }
      GetQualityRatingResponseObject
    },
    #' Deserialize JSON string into an instance of GetQualityRatingResponse
    #'
    #' @description
    #' Deserialize JSON string into an instance of GetQualityRatingResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of GetQualityRatingResponse
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`status`)) {
        `status_object` <- ApiResponseStatusType$new()
        `status_object`$fromJSON(jsonlite::toJSON(this_object$`status`, auto_unbox = TRUE, digits = NA))
        self$`status` <- `status_object`
      }
      if (!is.null(this_object$`result`)) {
        `result_object` <- CampaignsQualityRatingDTO$new()
        `result_object`$fromJSON(jsonlite::toJSON(this_object$`result`, auto_unbox = TRUE, digits = NA))
        self$`result` <- `result_object`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return GetQualityRatingResponse in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`status`)) {
          sprintf(
          '"status":
          %s
          ',
          jsonlite::toJSON(self$`status`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`result`)) {
          sprintf(
          '"result":
          %s
          ',
          jsonlite::toJSON(self$`result`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of GetQualityRatingResponse
    #'
    #' @description
    #' Deserialize JSON string into an instance of GetQualityRatingResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of GetQualityRatingResponse
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`status` <- ApiResponseStatusType$new()$fromJSON(jsonlite::toJSON(this_object$`status`, auto_unbox = TRUE, digits = NA))
      self$`result` <- CampaignsQualityRatingDTO$new()$fromJSON(jsonlite::toJSON(this_object$`result`, auto_unbox = TRUE, digits = NA))
      self
    },
    #' Validate JSON input with respect to GetQualityRatingResponse
    #'
    #' @description
    #' Validate JSON input with respect to GetQualityRatingResponse and throw an exception if invalid
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
    #' @return String representation of GetQualityRatingResponse
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
# GetQualityRatingResponse$unlock()
#
## Below is an example to define the print function
# GetQualityRatingResponse$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# GetQualityRatingResponse$lock()

