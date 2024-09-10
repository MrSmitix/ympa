#' Create a new SetOrderDeliveryDateRequest
#'
#' @description
#' SetOrderDeliveryDateRequest Class
#'
#' @docType class
#' @title SetOrderDeliveryDateRequest
#' @description SetOrderDeliveryDateRequest Class
#' @format An \code{R6Class} generator object
#' @field dates  \link{OrderDeliveryDateDTO}
#' @field reason  \link{OrderDeliveryDateReasonType}
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
SetOrderDeliveryDateRequest <- R6::R6Class(
  "SetOrderDeliveryDateRequest",
  public = list(
    `dates` = NULL,
    `reason` = NULL,
    #' Initialize a new SetOrderDeliveryDateRequest class.
    #'
    #' @description
    #' Initialize a new SetOrderDeliveryDateRequest class.
    #'
    #' @param dates dates
    #' @param reason reason
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`dates`, `reason`, ...) {
      if (!missing(`dates`)) {
        stopifnot(R6::is.R6(`dates`))
        self$`dates` <- `dates`
      }
      if (!missing(`reason`)) {
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
    #' @return SetOrderDeliveryDateRequest in JSON format
    #' @export
    toJSON = function() {
      SetOrderDeliveryDateRequestObject <- list()
      if (!is.null(self$`dates`)) {
        SetOrderDeliveryDateRequestObject[["dates"]] <-
          self$`dates`$toJSON()
      }
      if (!is.null(self$`reason`)) {
        SetOrderDeliveryDateRequestObject[["reason"]] <-
          self$`reason`$toJSON()
      }
      SetOrderDeliveryDateRequestObject
    },
    #' Deserialize JSON string into an instance of SetOrderDeliveryDateRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of SetOrderDeliveryDateRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of SetOrderDeliveryDateRequest
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`dates`)) {
        `dates_object` <- OrderDeliveryDateDTO$new()
        `dates_object`$fromJSON(jsonlite::toJSON(this_object$`dates`, auto_unbox = TRUE, digits = NA))
        self$`dates` <- `dates_object`
      }
      if (!is.null(this_object$`reason`)) {
        `reason_object` <- OrderDeliveryDateReasonType$new()
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
    #' @return SetOrderDeliveryDateRequest in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`dates`)) {
          sprintf(
          '"dates":
          %s
          ',
          jsonlite::toJSON(self$`dates`$toJSON(), auto_unbox = TRUE, digits = NA)
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
    #' Deserialize JSON string into an instance of SetOrderDeliveryDateRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of SetOrderDeliveryDateRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of SetOrderDeliveryDateRequest
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`dates` <- OrderDeliveryDateDTO$new()$fromJSON(jsonlite::toJSON(this_object$`dates`, auto_unbox = TRUE, digits = NA))
      self$`reason` <- OrderDeliveryDateReasonType$new()$fromJSON(jsonlite::toJSON(this_object$`reason`, auto_unbox = TRUE, digits = NA))
      self
    },
    #' Validate JSON input with respect to SetOrderDeliveryDateRequest
    #'
    #' @description
    #' Validate JSON input with respect to SetOrderDeliveryDateRequest and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `dates`
      if (!is.null(input_json$`dates`)) {
        stopifnot(R6::is.R6(input_json$`dates`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for SetOrderDeliveryDateRequest: the required field `dates` is missing."))
      }
      # check the required field `reason`
      if (!is.null(input_json$`reason`)) {
        stopifnot(R6::is.R6(input_json$`reason`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for SetOrderDeliveryDateRequest: the required field `reason` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of SetOrderDeliveryDateRequest
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
      # check if the required `dates` is null
      if (is.null(self$`dates`)) {
        return(FALSE)
      }

      # check if the required `reason` is null
      if (is.null(self$`reason`)) {
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
      # check if the required `dates` is null
      if (is.null(self$`dates`)) {
        invalid_fields["dates"] <- "Non-nullable required field `dates` cannot be null."
      }

      # check if the required `reason` is null
      if (is.null(self$`reason`)) {
        invalid_fields["reason"] <- "Non-nullable required field `reason` cannot be null."
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
# SetOrderDeliveryDateRequest$unlock()
#
## Below is an example to define the print function
# SetOrderDeliveryDateRequest$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# SetOrderDeliveryDateRequest$lock()

