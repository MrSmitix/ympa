#' Create a new OrderItemDetailDTO
#'
#' @description
#' Детали по товару в заказе.
#'
#' @docType class
#' @title OrderItemDetailDTO
#' @description OrderItemDetailDTO Class
#' @format An \code{R6Class} generator object
#' @field itemCount Количество единиц товара. integer [optional]
#' @field itemStatus  \link{OrderItemStatusType} [optional]
#' @field updateDate Формат даты: `ДД-ММ-ГГГГ`. character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
OrderItemDetailDTO <- R6::R6Class(
  "OrderItemDetailDTO",
  public = list(
    `itemCount` = NULL,
    `itemStatus` = NULL,
    `updateDate` = NULL,
    #' Initialize a new OrderItemDetailDTO class.
    #'
    #' @description
    #' Initialize a new OrderItemDetailDTO class.
    #'
    #' @param itemCount Количество единиц товара.
    #' @param itemStatus itemStatus
    #' @param updateDate Формат даты: `ДД-ММ-ГГГГ`.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`itemCount` = NULL, `itemStatus` = NULL, `updateDate` = NULL, ...) {
      if (!is.null(`itemCount`)) {
        if (!(is.numeric(`itemCount`) && length(`itemCount`) == 1)) {
          stop(paste("Error! Invalid data for `itemCount`. Must be an integer:", `itemCount`))
        }
        self$`itemCount` <- `itemCount`
      }
      if (!is.null(`itemStatus`)) {
        if (!(`itemStatus` %in% c())) {
          stop(paste("Error! \"", `itemStatus`, "\" cannot be assigned to `itemStatus`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`itemStatus`))
        self$`itemStatus` <- `itemStatus`
      }
      if (!is.null(`updateDate`)) {
        if (!(is.character(`updateDate`) && length(`updateDate`) == 1)) {
          stop(paste("Error! Invalid data for `updateDate`. Must be a string:", `updateDate`))
        }
        self$`updateDate` <- `updateDate`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return OrderItemDetailDTO in JSON format
    #' @export
    toJSON = function() {
      OrderItemDetailDTOObject <- list()
      if (!is.null(self$`itemCount`)) {
        OrderItemDetailDTOObject[["itemCount"]] <-
          self$`itemCount`
      }
      if (!is.null(self$`itemStatus`)) {
        OrderItemDetailDTOObject[["itemStatus"]] <-
          self$`itemStatus`$toJSON()
      }
      if (!is.null(self$`updateDate`)) {
        OrderItemDetailDTOObject[["updateDate"]] <-
          self$`updateDate`
      }
      OrderItemDetailDTOObject
    },
    #' Deserialize JSON string into an instance of OrderItemDetailDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of OrderItemDetailDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of OrderItemDetailDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`itemCount`)) {
        self$`itemCount` <- this_object$`itemCount`
      }
      if (!is.null(this_object$`itemStatus`)) {
        `itemstatus_object` <- OrderItemStatusType$new()
        `itemstatus_object`$fromJSON(jsonlite::toJSON(this_object$`itemStatus`, auto_unbox = TRUE, digits = NA))
        self$`itemStatus` <- `itemstatus_object`
      }
      if (!is.null(this_object$`updateDate`)) {
        self$`updateDate` <- this_object$`updateDate`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return OrderItemDetailDTO in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`itemCount`)) {
          sprintf(
          '"itemCount":
            %d
                    ',
          self$`itemCount`
          )
        },
        if (!is.null(self$`itemStatus`)) {
          sprintf(
          '"itemStatus":
          %s
          ',
          jsonlite::toJSON(self$`itemStatus`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`updateDate`)) {
          sprintf(
          '"updateDate":
            "%s"
                    ',
          self$`updateDate`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of OrderItemDetailDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of OrderItemDetailDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of OrderItemDetailDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`itemCount` <- this_object$`itemCount`
      self$`itemStatus` <- OrderItemStatusType$new()$fromJSON(jsonlite::toJSON(this_object$`itemStatus`, auto_unbox = TRUE, digits = NA))
      self$`updateDate` <- this_object$`updateDate`
      self
    },
    #' Validate JSON input with respect to OrderItemDetailDTO
    #'
    #' @description
    #' Validate JSON input with respect to OrderItemDetailDTO and throw an exception if invalid
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
    #' @return String representation of OrderItemDetailDTO
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
# OrderItemDetailDTO$unlock()
#
## Below is an example to define the print function
# OrderItemDetailDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# OrderItemDetailDTO$lock()

