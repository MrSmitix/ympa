#' Create a new OrdersStatsDetailsDTO
#'
#' @description
#' Информация об удалении товара из заказа.
#'
#' @docType class
#' @title OrdersStatsDetailsDTO
#' @description OrdersStatsDetailsDTO Class
#' @format An \code{R6Class} generator object
#' @field itemStatus  \link{OrdersStatsItemStatusType} [optional]
#' @field itemCount Количество товара со статусом, указанном в параметре `itemStatus`. integer [optional]
#' @field updateDate Дата, когда товар получил статус, указанный в параметре `itemStatus`.  Формат даты: `ГГГГ-ММ-ДД`. character [optional]
#' @field stockType  \link{OrdersStatsStockType} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
OrdersStatsDetailsDTO <- R6::R6Class(
  "OrdersStatsDetailsDTO",
  public = list(
    `itemStatus` = NULL,
    `itemCount` = NULL,
    `updateDate` = NULL,
    `stockType` = NULL,
    #' Initialize a new OrdersStatsDetailsDTO class.
    #'
    #' @description
    #' Initialize a new OrdersStatsDetailsDTO class.
    #'
    #' @param itemStatus itemStatus
    #' @param itemCount Количество товара со статусом, указанном в параметре `itemStatus`.
    #' @param updateDate Дата, когда товар получил статус, указанный в параметре `itemStatus`.  Формат даты: `ГГГГ-ММ-ДД`.
    #' @param stockType stockType
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`itemStatus` = NULL, `itemCount` = NULL, `updateDate` = NULL, `stockType` = NULL, ...) {
      if (!is.null(`itemStatus`)) {
        if (!(`itemStatus` %in% c())) {
          stop(paste("Error! \"", `itemStatus`, "\" cannot be assigned to `itemStatus`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`itemStatus`))
        self$`itemStatus` <- `itemStatus`
      }
      if (!is.null(`itemCount`)) {
        if (!(is.numeric(`itemCount`) && length(`itemCount`) == 1)) {
          stop(paste("Error! Invalid data for `itemCount`. Must be an integer:", `itemCount`))
        }
        self$`itemCount` <- `itemCount`
      }
      if (!is.null(`updateDate`)) {
        if (!is.character(`updateDate`)) {
          stop(paste("Error! Invalid data for `updateDate`. Must be a string:", `updateDate`))
        }
        self$`updateDate` <- `updateDate`
      }
      if (!is.null(`stockType`)) {
        if (!(`stockType` %in% c())) {
          stop(paste("Error! \"", `stockType`, "\" cannot be assigned to `stockType`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`stockType`))
        self$`stockType` <- `stockType`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return OrdersStatsDetailsDTO in JSON format
    #' @export
    toJSON = function() {
      OrdersStatsDetailsDTOObject <- list()
      if (!is.null(self$`itemStatus`)) {
        OrdersStatsDetailsDTOObject[["itemStatus"]] <-
          self$`itemStatus`$toJSON()
      }
      if (!is.null(self$`itemCount`)) {
        OrdersStatsDetailsDTOObject[["itemCount"]] <-
          self$`itemCount`
      }
      if (!is.null(self$`updateDate`)) {
        OrdersStatsDetailsDTOObject[["updateDate"]] <-
          self$`updateDate`
      }
      if (!is.null(self$`stockType`)) {
        OrdersStatsDetailsDTOObject[["stockType"]] <-
          self$`stockType`$toJSON()
      }
      OrdersStatsDetailsDTOObject
    },
    #' Deserialize JSON string into an instance of OrdersStatsDetailsDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of OrdersStatsDetailsDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of OrdersStatsDetailsDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`itemStatus`)) {
        `itemstatus_object` <- OrdersStatsItemStatusType$new()
        `itemstatus_object`$fromJSON(jsonlite::toJSON(this_object$`itemStatus`, auto_unbox = TRUE, digits = NA))
        self$`itemStatus` <- `itemstatus_object`
      }
      if (!is.null(this_object$`itemCount`)) {
        self$`itemCount` <- this_object$`itemCount`
      }
      if (!is.null(this_object$`updateDate`)) {
        self$`updateDate` <- this_object$`updateDate`
      }
      if (!is.null(this_object$`stockType`)) {
        `stocktype_object` <- OrdersStatsStockType$new()
        `stocktype_object`$fromJSON(jsonlite::toJSON(this_object$`stockType`, auto_unbox = TRUE, digits = NA))
        self$`stockType` <- `stocktype_object`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return OrdersStatsDetailsDTO in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`itemStatus`)) {
          sprintf(
          '"itemStatus":
          %s
          ',
          jsonlite::toJSON(self$`itemStatus`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`itemCount`)) {
          sprintf(
          '"itemCount":
            %d
                    ',
          self$`itemCount`
          )
        },
        if (!is.null(self$`updateDate`)) {
          sprintf(
          '"updateDate":
            "%s"
                    ',
          self$`updateDate`
          )
        },
        if (!is.null(self$`stockType`)) {
          sprintf(
          '"stockType":
          %s
          ',
          jsonlite::toJSON(self$`stockType`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of OrdersStatsDetailsDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of OrdersStatsDetailsDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of OrdersStatsDetailsDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`itemStatus` <- OrdersStatsItemStatusType$new()$fromJSON(jsonlite::toJSON(this_object$`itemStatus`, auto_unbox = TRUE, digits = NA))
      self$`itemCount` <- this_object$`itemCount`
      self$`updateDate` <- this_object$`updateDate`
      self$`stockType` <- OrdersStatsStockType$new()$fromJSON(jsonlite::toJSON(this_object$`stockType`, auto_unbox = TRUE, digits = NA))
      self
    },
    #' Validate JSON input with respect to OrdersStatsDetailsDTO
    #'
    #' @description
    #' Validate JSON input with respect to OrdersStatsDetailsDTO and throw an exception if invalid
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
    #' @return String representation of OrdersStatsDetailsDTO
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
# OrdersStatsDetailsDTO$unlock()
#
## Below is an example to define the print function
# OrdersStatsDetailsDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# OrdersStatsDetailsDTO$lock()

