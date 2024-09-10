#' Create a new DeleteCampaignOffersResponse
#'
#' @description
#' Результат удаления товаров.
#'
#' @docType class
#' @title DeleteCampaignOffersResponse
#' @description DeleteCampaignOffersResponse Class
#' @format An \code{R6Class} generator object
#' @field status  \link{ApiResponseStatusType} [optional]
#' @field result  \link{DeleteCampaignOffersDTO} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
DeleteCampaignOffersResponse <- R6::R6Class(
  "DeleteCampaignOffersResponse",
  public = list(
    `status` = NULL,
    `result` = NULL,
    #' Initialize a new DeleteCampaignOffersResponse class.
    #'
    #' @description
    #' Initialize a new DeleteCampaignOffersResponse class.
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
    #' @return DeleteCampaignOffersResponse in JSON format
    #' @export
    toJSON = function() {
      DeleteCampaignOffersResponseObject <- list()
      if (!is.null(self$`status`)) {
        DeleteCampaignOffersResponseObject[["status"]] <-
          self$`status`$toJSON()
      }
      if (!is.null(self$`result`)) {
        DeleteCampaignOffersResponseObject[["result"]] <-
          self$`result`$toJSON()
      }
      DeleteCampaignOffersResponseObject
    },
    #' Deserialize JSON string into an instance of DeleteCampaignOffersResponse
    #'
    #' @description
    #' Deserialize JSON string into an instance of DeleteCampaignOffersResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of DeleteCampaignOffersResponse
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`status`)) {
        `status_object` <- ApiResponseStatusType$new()
        `status_object`$fromJSON(jsonlite::toJSON(this_object$`status`, auto_unbox = TRUE, digits = NA))
        self$`status` <- `status_object`
      }
      if (!is.null(this_object$`result`)) {
        `result_object` <- DeleteCampaignOffersDTO$new()
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
    #' @return DeleteCampaignOffersResponse in JSON format
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
    #' Deserialize JSON string into an instance of DeleteCampaignOffersResponse
    #'
    #' @description
    #' Deserialize JSON string into an instance of DeleteCampaignOffersResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of DeleteCampaignOffersResponse
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`status` <- ApiResponseStatusType$new()$fromJSON(jsonlite::toJSON(this_object$`status`, auto_unbox = TRUE, digits = NA))
      self$`result` <- DeleteCampaignOffersDTO$new()$fromJSON(jsonlite::toJSON(this_object$`result`, auto_unbox = TRUE, digits = NA))
      self
    },
    #' Validate JSON input with respect to DeleteCampaignOffersResponse
    #'
    #' @description
    #' Validate JSON input with respect to DeleteCampaignOffersResponse and throw an exception if invalid
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
    #' @return String representation of DeleteCampaignOffersResponse
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
# DeleteCampaignOffersResponse$unlock()
#
## Below is an example to define the print function
# DeleteCampaignOffersResponse$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# DeleteCampaignOffersResponse$lock()

