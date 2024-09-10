#' Create a new OrdersStatsPaymentDTO
#'
#' @description
#' Информация о денежных переводах по заказу.
#'
#' @docType class
#' @title OrdersStatsPaymentDTO
#' @description OrdersStatsPaymentDTO Class
#' @format An \code{R6Class} generator object
#' @field id Идентификатор денежного перевода. character [optional]
#' @field date Дата денежного перевода.  Формат даты: `ГГГГ-ММ-ДД`. character [optional]
#' @field type  \link{OrdersStatsPaymentType} [optional]
#' @field source  \link{OrdersStatsPaymentSourceType} [optional]
#' @field total Сумма денежного перевода. Значение указывается в рублях независимо от способа денежного перевода. Точность — два знака после запятой. numeric [optional]
#' @field paymentOrder  \link{OrdersStatsPaymentOrderDTO} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
OrdersStatsPaymentDTO <- R6::R6Class(
  "OrdersStatsPaymentDTO",
  public = list(
    `id` = NULL,
    `date` = NULL,
    `type` = NULL,
    `source` = NULL,
    `total` = NULL,
    `paymentOrder` = NULL,
    #' Initialize a new OrdersStatsPaymentDTO class.
    #'
    #' @description
    #' Initialize a new OrdersStatsPaymentDTO class.
    #'
    #' @param id Идентификатор денежного перевода.
    #' @param date Дата денежного перевода.  Формат даты: `ГГГГ-ММ-ДД`.
    #' @param type type
    #' @param source source
    #' @param total Сумма денежного перевода. Значение указывается в рублях независимо от способа денежного перевода. Точность — два знака после запятой.
    #' @param paymentOrder paymentOrder
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`id` = NULL, `date` = NULL, `type` = NULL, `source` = NULL, `total` = NULL, `paymentOrder` = NULL, ...) {
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
      if (!is.null(`type`)) {
        if (!(`type` %in% c())) {
          stop(paste("Error! \"", `type`, "\" cannot be assigned to `type`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`type`))
        self$`type` <- `type`
      }
      if (!is.null(`source`)) {
        if (!(`source` %in% c())) {
          stop(paste("Error! \"", `source`, "\" cannot be assigned to `source`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`source`))
        self$`source` <- `source`
      }
      if (!is.null(`total`)) {
        self$`total` <- `total`
      }
      if (!is.null(`paymentOrder`)) {
        stopifnot(R6::is.R6(`paymentOrder`))
        self$`paymentOrder` <- `paymentOrder`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return OrdersStatsPaymentDTO in JSON format
    #' @export
    toJSON = function() {
      OrdersStatsPaymentDTOObject <- list()
      if (!is.null(self$`id`)) {
        OrdersStatsPaymentDTOObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`date`)) {
        OrdersStatsPaymentDTOObject[["date"]] <-
          self$`date`
      }
      if (!is.null(self$`type`)) {
        OrdersStatsPaymentDTOObject[["type"]] <-
          self$`type`$toJSON()
      }
      if (!is.null(self$`source`)) {
        OrdersStatsPaymentDTOObject[["source"]] <-
          self$`source`$toJSON()
      }
      if (!is.null(self$`total`)) {
        OrdersStatsPaymentDTOObject[["total"]] <-
          self$`total`
      }
      if (!is.null(self$`paymentOrder`)) {
        OrdersStatsPaymentDTOObject[["paymentOrder"]] <-
          self$`paymentOrder`$toJSON()
      }
      OrdersStatsPaymentDTOObject
    },
    #' Deserialize JSON string into an instance of OrdersStatsPaymentDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of OrdersStatsPaymentDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of OrdersStatsPaymentDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`date`)) {
        self$`date` <- this_object$`date`
      }
      if (!is.null(this_object$`type`)) {
        `type_object` <- OrdersStatsPaymentType$new()
        `type_object`$fromJSON(jsonlite::toJSON(this_object$`type`, auto_unbox = TRUE, digits = NA))
        self$`type` <- `type_object`
      }
      if (!is.null(this_object$`source`)) {
        `source_object` <- OrdersStatsPaymentSourceType$new()
        `source_object`$fromJSON(jsonlite::toJSON(this_object$`source`, auto_unbox = TRUE, digits = NA))
        self$`source` <- `source_object`
      }
      if (!is.null(this_object$`total`)) {
        self$`total` <- this_object$`total`
      }
      if (!is.null(this_object$`paymentOrder`)) {
        `paymentorder_object` <- OrdersStatsPaymentOrderDTO$new()
        `paymentorder_object`$fromJSON(jsonlite::toJSON(this_object$`paymentOrder`, auto_unbox = TRUE, digits = NA))
        self$`paymentOrder` <- `paymentorder_object`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return OrdersStatsPaymentDTO in JSON format
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
        },
        if (!is.null(self$`type`)) {
          sprintf(
          '"type":
          %s
          ',
          jsonlite::toJSON(self$`type`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`source`)) {
          sprintf(
          '"source":
          %s
          ',
          jsonlite::toJSON(self$`source`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`total`)) {
          sprintf(
          '"total":
            %d
                    ',
          self$`total`
          )
        },
        if (!is.null(self$`paymentOrder`)) {
          sprintf(
          '"paymentOrder":
          %s
          ',
          jsonlite::toJSON(self$`paymentOrder`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of OrdersStatsPaymentDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of OrdersStatsPaymentDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of OrdersStatsPaymentDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`id` <- this_object$`id`
      self$`date` <- this_object$`date`
      self$`type` <- OrdersStatsPaymentType$new()$fromJSON(jsonlite::toJSON(this_object$`type`, auto_unbox = TRUE, digits = NA))
      self$`source` <- OrdersStatsPaymentSourceType$new()$fromJSON(jsonlite::toJSON(this_object$`source`, auto_unbox = TRUE, digits = NA))
      self$`total` <- this_object$`total`
      self$`paymentOrder` <- OrdersStatsPaymentOrderDTO$new()$fromJSON(jsonlite::toJSON(this_object$`paymentOrder`, auto_unbox = TRUE, digits = NA))
      self
    },
    #' Validate JSON input with respect to OrdersStatsPaymentDTO
    #'
    #' @description
    #' Validate JSON input with respect to OrdersStatsPaymentDTO and throw an exception if invalid
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
    #' @return String representation of OrdersStatsPaymentDTO
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
# OrdersStatsPaymentDTO$unlock()
#
## Below is an example to define the print function
# OrdersStatsPaymentDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# OrdersStatsPaymentDTO$lock()

