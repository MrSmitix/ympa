#' Create a new AcceptOrderCancellationRequest
#'
#' @description
#' AcceptOrderCancellationRequest Class
#'
#' @docType class
#' @title AcceptOrderCancellationRequest
#' @description AcceptOrderCancellationRequest Class
#' @format An \code{R6Class} generator object
#' @field accepted Решение об отмене заказа:  * `true` — заказ отменяется, служба доставки узнала об отмене до передачи заказа покупателю. * `false` — заказ не отменяется, так как он уже доставлен покупателю курьером или передан в пункт выдачи заказов. character
#' @field reason  \link{OrderCancellationReasonType} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
AcceptOrderCancellationRequest <- R6::R6Class(
  "AcceptOrderCancellationRequest",
  public = list(
    `accepted` = NULL,
    `reason` = NULL,
    #' Initialize a new AcceptOrderCancellationRequest class.
    #'
    #' @description
    #' Initialize a new AcceptOrderCancellationRequest class.
    #'
    #' @param accepted Решение об отмене заказа:  * `true` — заказ отменяется, служба доставки узнала об отмене до передачи заказа покупателю. * `false` — заказ не отменяется, так как он уже доставлен покупателю курьером или передан в пункт выдачи заказов.
    #' @param reason reason
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`accepted`, `reason` = NULL, ...) {
      if (!missing(`accepted`)) {
        if (!(is.logical(`accepted`) && length(`accepted`) == 1)) {
          stop(paste("Error! Invalid data for `accepted`. Must be a boolean:", `accepted`))
        }
        self$`accepted` <- `accepted`
      }
      if (!is.null(`reason`)) {
        if (!(`reason` %in% c())) {
          stop(paste("Error! \"", `reason`, "\" cannot be assigned to `reason`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`reason`))
        self$`reason` <- `reason`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return AcceptOrderCancellationRequest in JSON format
    #' @export
    toJSON = function() {
      AcceptOrderCancellationRequestObject <- list()
      if (!is.null(self$`accepted`)) {
        AcceptOrderCancellationRequestObject[["accepted"]] <-
          self$`accepted`
      }
      if (!is.null(self$`reason`)) {
        AcceptOrderCancellationRequestObject[["reason"]] <-
          self$`reason`$toJSON()
      }
      AcceptOrderCancellationRequestObject
    },
    #' Deserialize JSON string into an instance of AcceptOrderCancellationRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of AcceptOrderCancellationRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of AcceptOrderCancellationRequest
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`accepted`)) {
        self$`accepted` <- this_object$`accepted`
      }
      if (!is.null(this_object$`reason`)) {
        `reason_object` <- OrderCancellationReasonType$new()
        `reason_object`$fromJSON(jsonlite::toJSON(this_object$`reason`, auto_unbox = TRUE, digits = NA))
        self$`reason` <- `reason_object`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return AcceptOrderCancellationRequest in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`accepted`)) {
          sprintf(
          '"accepted":
            %s
                    ',
          tolower(self$`accepted`)
          )
        },
        if (!is.null(self$`reason`)) {
          sprintf(
          '"reason":
          %s
          ',
          jsonlite::toJSON(self$`reason`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of AcceptOrderCancellationRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of AcceptOrderCancellationRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of AcceptOrderCancellationRequest
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`accepted` <- this_object$`accepted`
      self$`reason` <- OrderCancellationReasonType$new()$fromJSON(jsonlite::toJSON(this_object$`reason`, auto_unbox = TRUE, digits = NA))
      self
    },
    #' Validate JSON input with respect to AcceptOrderCancellationRequest
    #'
    #' @description
    #' Validate JSON input with respect to AcceptOrderCancellationRequest and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `accepted`
      if (!is.null(input_json$`accepted`)) {
        if (!(is.logical(input_json$`accepted`) && length(input_json$`accepted`) == 1)) {
          stop(paste("Error! Invalid data for `accepted`. Must be a boolean:", input_json$`accepted`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for AcceptOrderCancellationRequest: the required field `accepted` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of AcceptOrderCancellationRequest
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
      # check if the required `accepted` is null
      if (is.null(self$`accepted`)) {
        return(FALSE)
      }

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
      # check if the required `accepted` is null
      if (is.null(self$`accepted`)) {
        invalid_fields["accepted"] <- "Non-nullable required field `accepted` cannot be null."
      }

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
# AcceptOrderCancellationRequest$unlock()
#
## Below is an example to define the print function
# AcceptOrderCancellationRequest$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# AcceptOrderCancellationRequest$lock()

