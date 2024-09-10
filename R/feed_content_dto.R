#' Create a new FeedContentDTO
#'
#' @description
#' Информация о проверке содержимого прайс-листа, загруженного на Маркет.
#'
#' @docType class
#' @title FeedContentDTO
#' @description FeedContentDTO Class
#' @format An \code{R6Class} generator object
#' @field rejectedOffersCount Количество предложений, в которых найдены ошибки на этапе загрузки прайс-листа. Выводится, если параметр `content status=OK`. integer [optional]
#' @field status  \link{FeedStatusType} [optional]
#' @field totalOffersCount Количество предложений в прайс-листе. Выводится, если параметр `content status=OK`. integer [optional]
#' @field error  \link{FeedContentErrorDTO} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
FeedContentDTO <- R6::R6Class(
  "FeedContentDTO",
  public = list(
    `rejectedOffersCount` = NULL,
    `status` = NULL,
    `totalOffersCount` = NULL,
    `error` = NULL,
    #' Initialize a new FeedContentDTO class.
    #'
    #' @description
    #' Initialize a new FeedContentDTO class.
    #'
    #' @param rejectedOffersCount Количество предложений, в которых найдены ошибки на этапе загрузки прайс-листа. Выводится, если параметр `content status=OK`.
    #' @param status status
    #' @param totalOffersCount Количество предложений в прайс-листе. Выводится, если параметр `content status=OK`.
    #' @param error error
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`rejectedOffersCount` = NULL, `status` = NULL, `totalOffersCount` = NULL, `error` = NULL, ...) {
      if (!is.null(`rejectedOffersCount`)) {
        if (!(is.numeric(`rejectedOffersCount`) && length(`rejectedOffersCount`) == 1)) {
          stop(paste("Error! Invalid data for `rejectedOffersCount`. Must be an integer:", `rejectedOffersCount`))
        }
        self$`rejectedOffersCount` <- `rejectedOffersCount`
      }
      if (!is.null(`status`)) {
        if (!(`status` %in% c())) {
          stop(paste("Error! \"", `status`, "\" cannot be assigned to `status`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`status`))
        self$`status` <- `status`
      }
      if (!is.null(`totalOffersCount`)) {
        if (!(is.numeric(`totalOffersCount`) && length(`totalOffersCount`) == 1)) {
          stop(paste("Error! Invalid data for `totalOffersCount`. Must be an integer:", `totalOffersCount`))
        }
        self$`totalOffersCount` <- `totalOffersCount`
      }
      if (!is.null(`error`)) {
        stopifnot(R6::is.R6(`error`))
        self$`error` <- `error`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return FeedContentDTO in JSON format
    #' @export
    toJSON = function() {
      FeedContentDTOObject <- list()
      if (!is.null(self$`rejectedOffersCount`)) {
        FeedContentDTOObject[["rejectedOffersCount"]] <-
          self$`rejectedOffersCount`
      }
      if (!is.null(self$`status`)) {
        FeedContentDTOObject[["status"]] <-
          self$`status`$toJSON()
      }
      if (!is.null(self$`totalOffersCount`)) {
        FeedContentDTOObject[["totalOffersCount"]] <-
          self$`totalOffersCount`
      }
      if (!is.null(self$`error`)) {
        FeedContentDTOObject[["error"]] <-
          self$`error`$toJSON()
      }
      FeedContentDTOObject
    },
    #' Deserialize JSON string into an instance of FeedContentDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of FeedContentDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of FeedContentDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`rejectedOffersCount`)) {
        self$`rejectedOffersCount` <- this_object$`rejectedOffersCount`
      }
      if (!is.null(this_object$`status`)) {
        `status_object` <- FeedStatusType$new()
        `status_object`$fromJSON(jsonlite::toJSON(this_object$`status`, auto_unbox = TRUE, digits = NA))
        self$`status` <- `status_object`
      }
      if (!is.null(this_object$`totalOffersCount`)) {
        self$`totalOffersCount` <- this_object$`totalOffersCount`
      }
      if (!is.null(this_object$`error`)) {
        `error_object` <- FeedContentErrorDTO$new()
        `error_object`$fromJSON(jsonlite::toJSON(this_object$`error`, auto_unbox = TRUE, digits = NA))
        self$`error` <- `error_object`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return FeedContentDTO in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`rejectedOffersCount`)) {
          sprintf(
          '"rejectedOffersCount":
            %d
                    ',
          self$`rejectedOffersCount`
          )
        },
        if (!is.null(self$`status`)) {
          sprintf(
          '"status":
          %s
          ',
          jsonlite::toJSON(self$`status`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`totalOffersCount`)) {
          sprintf(
          '"totalOffersCount":
            %d
                    ',
          self$`totalOffersCount`
          )
        },
        if (!is.null(self$`error`)) {
          sprintf(
          '"error":
          %s
          ',
          jsonlite::toJSON(self$`error`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of FeedContentDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of FeedContentDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of FeedContentDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`rejectedOffersCount` <- this_object$`rejectedOffersCount`
      self$`status` <- FeedStatusType$new()$fromJSON(jsonlite::toJSON(this_object$`status`, auto_unbox = TRUE, digits = NA))
      self$`totalOffersCount` <- this_object$`totalOffersCount`
      self$`error` <- FeedContentErrorDTO$new()$fromJSON(jsonlite::toJSON(this_object$`error`, auto_unbox = TRUE, digits = NA))
      self
    },
    #' Validate JSON input with respect to FeedContentDTO
    #'
    #' @description
    #' Validate JSON input with respect to FeedContentDTO and throw an exception if invalid
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
    #' @return String representation of FeedContentDTO
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
# FeedContentDTO$unlock()
#
## Below is an example to define the print function
# FeedContentDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# FeedContentDTO$lock()

