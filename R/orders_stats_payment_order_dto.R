#' Create a new OrdersStatsPaymentOrderDTO
#'
#' @description
#' Информация о платежном получении.
#'
#' @docType class
#' @title OrdersStatsPaymentOrderDTO
#' @description OrdersStatsPaymentOrderDTO Class
#' @format An \code{R6Class} generator object
#' @field id Номер платежного поручения. character [optional]
#' @field date Дата платежного поручения.  Формат даты: `ГГГГ‑ММ‑ДД`. character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
OrdersStatsPaymentOrderDTO <- R6::R6Class(
  "OrdersStatsPaymentOrderDTO",
  public = list(
    `id` = NULL,
    `date` = NULL,
    #' Initialize a new OrdersStatsPaymentOrderDTO class.
    #'
    #' @description
    #' Initialize a new OrdersStatsPaymentOrderDTO class.
    #'
    #' @param id Номер платежного поручения.
    #' @param date Дата платежного поручения.  Формат даты: `ГГГГ‑ММ‑ДД`.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`id` = NULL, `date` = NULL, ...) {
      if (!is.null(`id`)) {
        if (!(is.character(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", `id`))
        }
        self$`id` <- `id`
      }
      if (!is.null(`date`)) {
        if (!is.character(`date`)) {
          stop(paste("Error! Invalid data for `date`. Must be a string:", `date`))
        }
        self$`date` <- `date`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return OrdersStatsPaymentOrderDTO in JSON format
    #' @export
    toJSON = function() {
      OrdersStatsPaymentOrderDTOObject <- list()
      if (!is.null(self$`id`)) {
        OrdersStatsPaymentOrderDTOObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`date`)) {
        OrdersStatsPaymentOrderDTOObject[["date"]] <-
          self$`date`
      }
      OrdersStatsPaymentOrderDTOObject
    },
    #' Deserialize JSON string into an instance of OrdersStatsPaymentOrderDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of OrdersStatsPaymentOrderDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of OrdersStatsPaymentOrderDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`date`)) {
        self$`date` <- this_object$`date`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return OrdersStatsPaymentOrderDTO in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`id`)) {
          sprintf(
          '"id":
            "%s"
                    ',
          self$`id`
          )
        },
        if (!is.null(self$`date`)) {
          sprintf(
          '"date":
            "%s"
                    ',
          self$`date`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of OrdersStatsPaymentOrderDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of OrdersStatsPaymentOrderDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of OrdersStatsPaymentOrderDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`id` <- this_object$`id`
      self$`date` <- this_object$`date`
      self
    },
    #' Validate JSON input with respect to OrdersStatsPaymentOrderDTO
    #'
    #' @description
    #' Validate JSON input with respect to OrdersStatsPaymentOrderDTO and throw an exception if invalid
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
    #' @return String representation of OrdersStatsPaymentOrderDTO
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
# OrdersStatsPaymentOrderDTO$unlock()
#
## Below is an example to define the print function
# OrdersStatsPaymentOrderDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# OrdersStatsPaymentOrderDTO$lock()

