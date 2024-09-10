#' Create a new OrderStatusChangeDTO
#'
#' @description
#' Заказ.
#'
#' @docType class
#' @title OrderStatusChangeDTO
#' @description OrderStatusChangeDTO Class
#' @format An \code{R6Class} generator object
#' @field status  \link{OrderStatusType}
#' @field substatus  \link{OrderSubstatusType} [optional]
#' @field delivery  \link{OrderStatusChangeDeliveryDTO} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
OrderStatusChangeDTO <- R6::R6Class(
  "OrderStatusChangeDTO",
  public = list(
    `status` = NULL,
    `substatus` = NULL,
    `delivery` = NULL,
    #' Initialize a new OrderStatusChangeDTO class.
    #'
    #' @description
    #' Initialize a new OrderStatusChangeDTO class.
    #'
    #' @param status status
    #' @param substatus substatus
    #' @param delivery delivery
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`status`, `substatus` = NULL, `delivery` = NULL, ...) {
      if (!missing(`status`)) {
        if (!(`status` %in% c())) {
          stop(paste("Error! \"", `status`, "\" cannot be assigned to `status`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`status`))
        self$`status` <- `status`
      }
      if (!is.null(`substatus`)) {
        if (!(`substatus` %in% c())) {
          stop(paste("Error! \"", `substatus`, "\" cannot be assigned to `substatus`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`substatus`))
        self$`substatus` <- `substatus`
      }
      if (!is.null(`delivery`)) {
        stopifnot(R6::is.R6(`delivery`))
        self$`delivery` <- `delivery`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return OrderStatusChangeDTO in JSON format
    #' @export
    toJSON = function() {
      OrderStatusChangeDTOObject <- list()
      if (!is.null(self$`status`)) {
        OrderStatusChangeDTOObject[["status"]] <-
          self$`status`$toJSON()
      }
      if (!is.null(self$`substatus`)) {
        OrderStatusChangeDTOObject[["substatus"]] <-
          self$`substatus`$toJSON()
      }
      if (!is.null(self$`delivery`)) {
        OrderStatusChangeDTOObject[["delivery"]] <-
          self$`delivery`$toJSON()
      }
      OrderStatusChangeDTOObject
    },
    #' Deserialize JSON string into an instance of OrderStatusChangeDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of OrderStatusChangeDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of OrderStatusChangeDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`status`)) {
        `status_object` <- OrderStatusType$new()
        `status_object`$fromJSON(jsonlite::toJSON(this_object$`status`, auto_unbox = TRUE, digits = NA))
        self$`status` <- `status_object`
      }
      if (!is.null(this_object$`substatus`)) {
        `substatus_object` <- OrderSubstatusType$new()
        `substatus_object`$fromJSON(jsonlite::toJSON(this_object$`substatus`, auto_unbox = TRUE, digits = NA))
        self$`substatus` <- `substatus_object`
      }
      if (!is.null(this_object$`delivery`)) {
        `delivery_object` <- OrderStatusChangeDeliveryDTO$new()
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
    #' @return OrderStatusChangeDTO in JSON format
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
        if (!is.null(self$`substatus`)) {
          sprintf(
          '"substatus":
          %s
          ',
          jsonlite::toJSON(self$`substatus`$toJSON(), auto_unbox = TRUE, digits = NA)
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
    #' Deserialize JSON string into an instance of OrderStatusChangeDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of OrderStatusChangeDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of OrderStatusChangeDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`status` <- OrderStatusType$new()$fromJSON(jsonlite::toJSON(this_object$`status`, auto_unbox = TRUE, digits = NA))
      self$`substatus` <- OrderSubstatusType$new()$fromJSON(jsonlite::toJSON(this_object$`substatus`, auto_unbox = TRUE, digits = NA))
      self$`delivery` <- OrderStatusChangeDeliveryDTO$new()$fromJSON(jsonlite::toJSON(this_object$`delivery`, auto_unbox = TRUE, digits = NA))
      self
    },
    #' Validate JSON input with respect to OrderStatusChangeDTO
    #'
    #' @description
    #' Validate JSON input with respect to OrderStatusChangeDTO and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `status`
      if (!is.null(input_json$`status`)) {
        stopifnot(R6::is.R6(input_json$`status`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for OrderStatusChangeDTO: the required field `status` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of OrderStatusChangeDTO
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
      # check if the required `status` is null
      if (is.null(self$`status`)) {
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
      # check if the required `status` is null
      if (is.null(self$`status`)) {
        invalid_fields["status"] <- "Non-nullable required field `status` cannot be null."
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
# OrderStatusChangeDTO$unlock()
#
## Below is an example to define the print function
# OrderStatusChangeDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# OrderStatusChangeDTO$lock()

