#' Create a new FeedIndexLogsOffersDTO
#'
#' @description
#' Информация о предложениях прайс-листа.
#'
#' @docType class
#' @title FeedIndexLogsOffersDTO
#' @description FeedIndexLogsOffersDTO Class
#' @format An \code{R6Class} generator object
#' @field rejectedCount Количество предложений, который не опубликованы на Маркете из-за найденных ошибок. integer [optional]
#' @field totalCount Количество предложений в прайс-листе. integer [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
FeedIndexLogsOffersDTO <- R6::R6Class(
  "FeedIndexLogsOffersDTO",
  public = list(
    `rejectedCount` = NULL,
    `totalCount` = NULL,
    #' Initialize a new FeedIndexLogsOffersDTO class.
    #'
    #' @description
    #' Initialize a new FeedIndexLogsOffersDTO class.
    #'
    #' @param rejectedCount Количество предложений, который не опубликованы на Маркете из-за найденных ошибок.
    #' @param totalCount Количество предложений в прайс-листе.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`rejectedCount` = NULL, `totalCount` = NULL, ...) {
      if (!is.null(`rejectedCount`)) {
        if (!(is.numeric(`rejectedCount`) && length(`rejectedCount`) == 1)) {
          stop(paste("Error! Invalid data for `rejectedCount`. Must be an integer:", `rejectedCount`))
        }
        self$`rejectedCount` <- `rejectedCount`
      }
      if (!is.null(`totalCount`)) {
        if (!(is.numeric(`totalCount`) && length(`totalCount`) == 1)) {
          stop(paste("Error! Invalid data for `totalCount`. Must be an integer:", `totalCount`))
        }
        self$`totalCount` <- `totalCount`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return FeedIndexLogsOffersDTO in JSON format
    #' @export
    toJSON = function() {
      FeedIndexLogsOffersDTOObject <- list()
      if (!is.null(self$`rejectedCount`)) {
        FeedIndexLogsOffersDTOObject[["rejectedCount"]] <-
          self$`rejectedCount`
      }
      if (!is.null(self$`totalCount`)) {
        FeedIndexLogsOffersDTOObject[["totalCount"]] <-
          self$`totalCount`
      }
      FeedIndexLogsOffersDTOObject
    },
    #' Deserialize JSON string into an instance of FeedIndexLogsOffersDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of FeedIndexLogsOffersDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of FeedIndexLogsOffersDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`rejectedCount`)) {
        self$`rejectedCount` <- this_object$`rejectedCount`
      }
      if (!is.null(this_object$`totalCount`)) {
        self$`totalCount` <- this_object$`totalCount`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return FeedIndexLogsOffersDTO in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`rejectedCount`)) {
          sprintf(
          '"rejectedCount":
            %d
                    ',
          self$`rejectedCount`
          )
        },
        if (!is.null(self$`totalCount`)) {
          sprintf(
          '"totalCount":
            %d
                    ',
          self$`totalCount`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of FeedIndexLogsOffersDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of FeedIndexLogsOffersDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of FeedIndexLogsOffersDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`rejectedCount` <- this_object$`rejectedCount`
      self$`totalCount` <- this_object$`totalCount`
      self
    },
    #' Validate JSON input with respect to FeedIndexLogsOffersDTO
    #'
    #' @description
    #' Validate JSON input with respect to FeedIndexLogsOffersDTO and throw an exception if invalid
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
    #' @return String representation of FeedIndexLogsOffersDTO
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
# FeedIndexLogsOffersDTO$unlock()
#
## Below is an example to define the print function
# FeedIndexLogsOffersDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# FeedIndexLogsOffersDTO$lock()

