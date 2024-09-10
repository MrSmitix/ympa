#' Create a new FeedbackOrderDTO
#'
#' @description
#' Информация о заказе, указанная в отзыве.
#'
#' @docType class
#' @title FeedbackOrderDTO
#' @description FeedbackOrderDTO Class
#' @format An \code{R6Class} generator object
#' @field shopOrderId Номер заказа, указанный в отзыве. character [optional]
#' @field delivery  \link{FeedbackDeliveryType} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
FeedbackOrderDTO <- R6::R6Class(
  "FeedbackOrderDTO",
  public = list(
    `shopOrderId` = NULL,
    `delivery` = NULL,
    #' Initialize a new FeedbackOrderDTO class.
    #'
    #' @description
    #' Initialize a new FeedbackOrderDTO class.
    #'
    #' @param shopOrderId Номер заказа, указанный в отзыве.
    #' @param delivery delivery
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`shopOrderId` = NULL, `delivery` = NULL, ...) {
      if (!is.null(`shopOrderId`)) {
        if (!(is.character(`shopOrderId`) && length(`shopOrderId`) == 1)) {
          stop(paste("Error! Invalid data for `shopOrderId`. Must be a string:", `shopOrderId`))
        }
        self$`shopOrderId` <- `shopOrderId`
      }
      if (!is.null(`delivery`)) {
        if (!(`delivery` %in% c())) {
          stop(paste("Error! \"", `delivery`, "\" cannot be assigned to `delivery`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`delivery`))
        self$`delivery` <- `delivery`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return FeedbackOrderDTO in JSON format
    #' @export
    toJSON = function() {
      FeedbackOrderDTOObject <- list()
      if (!is.null(self$`shopOrderId`)) {
        FeedbackOrderDTOObject[["shopOrderId"]] <-
          self$`shopOrderId`
      }
      if (!is.null(self$`delivery`)) {
        FeedbackOrderDTOObject[["delivery"]] <-
          self$`delivery`$toJSON()
      }
      FeedbackOrderDTOObject
    },
    #' Deserialize JSON string into an instance of FeedbackOrderDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of FeedbackOrderDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of FeedbackOrderDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`shopOrderId`)) {
        self$`shopOrderId` <- this_object$`shopOrderId`
      }
      if (!is.null(this_object$`delivery`)) {
        `delivery_object` <- FeedbackDeliveryType$new()
        `delivery_object`$fromJSON(jsonlite::toJSON(this_object$`delivery`, auto_unbox = TRUE, digits = NA))
        self$`delivery` <- `delivery_object`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return FeedbackOrderDTO in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`shopOrderId`)) {
          sprintf(
          '"shopOrderId":
            "%s"
                    ',
          self$`shopOrderId`
          )
        },
        if (!is.null(self$`delivery`)) {
          sprintf(
          '"delivery":
          %s
          ',
          jsonlite::toJSON(self$`delivery`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of FeedbackOrderDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of FeedbackOrderDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of FeedbackOrderDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`shopOrderId` <- this_object$`shopOrderId`
      self$`delivery` <- FeedbackDeliveryType$new()$fromJSON(jsonlite::toJSON(this_object$`delivery`, auto_unbox = TRUE, digits = NA))
      self
    },
    #' Validate JSON input with respect to FeedbackOrderDTO
    #'
    #' @description
    #' Validate JSON input with respect to FeedbackOrderDTO and throw an exception if invalid
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
    #' @return String representation of FeedbackOrderDTO
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
# FeedbackOrderDTO$unlock()
#
## Below is an example to define the print function
# FeedbackOrderDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# FeedbackOrderDTO$lock()

