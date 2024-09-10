#' Create a new GetOrdersStatsRequest
#'
#' @description
#' Запрос информации по заказам.
#'
#' @docType class
#' @title GetOrdersStatsRequest
#' @description GetOrdersStatsRequest Class
#' @format An \code{R6Class} generator object
#' @field dateFrom Начальная дата, когда заказ был сформирован.  Формат даты: `ГГГГ‑ММ‑ДД`.  Нельзя использовать вместе с параметрами `updateFrom` и `updateTo`. character [optional]
#' @field dateTo Конечная дата, когда заказ был сформирован.  Формат даты: `ГГГГ‑ММ‑ДД`.  Нельзя использовать вместе с параметрами `updateFrom` и `updateTo`. character [optional]
#' @field updateFrom Начальная дата периода, за который были изменения статуса заказа.  Формат даты: `ГГГГ‑ММ‑ДД`.  Нельзя использовать вместе с параметрами `dateFrom` и `dateTo`. character [optional]
#' @field updateTo Конечная дата периода, за который были изменения статуса заказа.  Формат даты: `ГГГГ‑ММ‑ДД`.  Нельзя использовать вместе с параметрами `dateFrom` и `dateTo`. character [optional]
#' @field orders Список идентификаторов заказов. list(integer) [optional]
#' @field statuses Список статусов заказов. list(\link{OrderStatsStatusType}) [optional]
#' @field hasCis Нужно ли вернуть только те заказы, в составе которых есть хотя бы один товар с кодом идентификации [в системе «Честный ЗНАК»](https://честныйзнак.рф/):  * `true` — да. * `false` — нет. Такие коды присваиваются товарам, которые подлежат маркировке и относятся к определенным категориям. character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
GetOrdersStatsRequest <- R6::R6Class(
  "GetOrdersStatsRequest",
  public = list(
    `dateFrom` = NULL,
    `dateTo` = NULL,
    `updateFrom` = NULL,
    `updateTo` = NULL,
    `orders` = NULL,
    `statuses` = NULL,
    `hasCis` = NULL,
    #' Initialize a new GetOrdersStatsRequest class.
    #'
    #' @description
    #' Initialize a new GetOrdersStatsRequest class.
    #'
    #' @param dateFrom Начальная дата, когда заказ был сформирован.  Формат даты: `ГГГГ‑ММ‑ДД`.  Нельзя использовать вместе с параметрами `updateFrom` и `updateTo`.
    #' @param dateTo Конечная дата, когда заказ был сформирован.  Формат даты: `ГГГГ‑ММ‑ДД`.  Нельзя использовать вместе с параметрами `updateFrom` и `updateTo`.
    #' @param updateFrom Начальная дата периода, за который были изменения статуса заказа.  Формат даты: `ГГГГ‑ММ‑ДД`.  Нельзя использовать вместе с параметрами `dateFrom` и `dateTo`.
    #' @param updateTo Конечная дата периода, за который были изменения статуса заказа.  Формат даты: `ГГГГ‑ММ‑ДД`.  Нельзя использовать вместе с параметрами `dateFrom` и `dateTo`.
    #' @param orders Список идентификаторов заказов.
    #' @param statuses Список статусов заказов.
    #' @param hasCis Нужно ли вернуть только те заказы, в составе которых есть хотя бы один товар с кодом идентификации [в системе «Честный ЗНАК»](https://честныйзнак.рф/):  * `true` — да. * `false` — нет. Такие коды присваиваются товарам, которые подлежат маркировке и относятся к определенным категориям.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`dateFrom` = NULL, `dateTo` = NULL, `updateFrom` = NULL, `updateTo` = NULL, `orders` = NULL, `statuses` = NULL, `hasCis` = NULL, ...) {
      if (!is.null(`dateFrom`)) {
        if (!is.character(`dateFrom`)) {
          stop(paste("Error! Invalid data for `dateFrom`. Must be a string:", `dateFrom`))
        }
        self$`dateFrom` <- `dateFrom`
      }
      if (!is.null(`dateTo`)) {
        if (!is.character(`dateTo`)) {
          stop(paste("Error! Invalid data for `dateTo`. Must be a string:", `dateTo`))
        }
        self$`dateTo` <- `dateTo`
      }
      if (!is.null(`updateFrom`)) {
        if (!is.character(`updateFrom`)) {
          stop(paste("Error! Invalid data for `updateFrom`. Must be a string:", `updateFrom`))
        }
        self$`updateFrom` <- `updateFrom`
      }
      if (!is.null(`updateTo`)) {
        if (!is.character(`updateTo`)) {
          stop(paste("Error! Invalid data for `updateTo`. Must be a string:", `updateTo`))
        }
        self$`updateTo` <- `updateTo`
      }
      if (!is.null(`orders`)) {
        stopifnot(is.vector(`orders`), length(`orders`) != 0)
        sapply(`orders`, function(x) stopifnot(is.character(x)))
        self$`orders` <- `orders`
      }
      if (!is.null(`statuses`)) {
        stopifnot(is.vector(`statuses`), length(`statuses`) != 0)
        sapply(`statuses`, function(x) stopifnot(R6::is.R6(x)))
        self$`statuses` <- `statuses`
      }
      if (!is.null(`hasCis`)) {
        if (!(is.logical(`hasCis`) && length(`hasCis`) == 1)) {
          stop(paste("Error! Invalid data for `hasCis`. Must be a boolean:", `hasCis`))
        }
        self$`hasCis` <- `hasCis`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return GetOrdersStatsRequest in JSON format
    #' @export
    toJSON = function() {
      GetOrdersStatsRequestObject <- list()
      if (!is.null(self$`dateFrom`)) {
        GetOrdersStatsRequestObject[["dateFrom"]] <-
          self$`dateFrom`
      }
      if (!is.null(self$`dateTo`)) {
        GetOrdersStatsRequestObject[["dateTo"]] <-
          self$`dateTo`
      }
      if (!is.null(self$`updateFrom`)) {
        GetOrdersStatsRequestObject[["updateFrom"]] <-
          self$`updateFrom`
      }
      if (!is.null(self$`updateTo`)) {
        GetOrdersStatsRequestObject[["updateTo"]] <-
          self$`updateTo`
      }
      if (!is.null(self$`orders`)) {
        GetOrdersStatsRequestObject[["orders"]] <-
          self$`orders`
      }
      if (!is.null(self$`statuses`)) {
        GetOrdersStatsRequestObject[["statuses"]] <-
          lapply(self$`statuses`, function(x) x$toJSON())
      }
      if (!is.null(self$`hasCis`)) {
        GetOrdersStatsRequestObject[["hasCis"]] <-
          self$`hasCis`
      }
      GetOrdersStatsRequestObject
    },
    #' Deserialize JSON string into an instance of GetOrdersStatsRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of GetOrdersStatsRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of GetOrdersStatsRequest
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`dateFrom`)) {
        self$`dateFrom` <- this_object$`dateFrom`
      }
      if (!is.null(this_object$`dateTo`)) {
        self$`dateTo` <- this_object$`dateTo`
      }
      if (!is.null(this_object$`updateFrom`)) {
        self$`updateFrom` <- this_object$`updateFrom`
      }
      if (!is.null(this_object$`updateTo`)) {
        self$`updateTo` <- this_object$`updateTo`
      }
      if (!is.null(this_object$`orders`)) {
        self$`orders` <- ApiClient$new()$deserializeObj(this_object$`orders`, "array[integer]", loadNamespace("ympa_r_client"))
      }
      if (!is.null(this_object$`statuses`)) {
        self$`statuses` <- ApiClient$new()$deserializeObj(this_object$`statuses`, "array[OrderStatsStatusType]", loadNamespace("ympa_r_client"))
      }
      if (!is.null(this_object$`hasCis`)) {
        self$`hasCis` <- this_object$`hasCis`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return GetOrdersStatsRequest in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`dateFrom`)) {
          sprintf(
          '"dateFrom":
            "%s"
                    ',
          self$`dateFrom`
          )
        },
        if (!is.null(self$`dateTo`)) {
          sprintf(
          '"dateTo":
            "%s"
                    ',
          self$`dateTo`
          )
        },
        if (!is.null(self$`updateFrom`)) {
          sprintf(
          '"updateFrom":
            "%s"
                    ',
          self$`updateFrom`
          )
        },
        if (!is.null(self$`updateTo`)) {
          sprintf(
          '"updateTo":
            "%s"
                    ',
          self$`updateTo`
          )
        },
        if (!is.null(self$`orders`)) {
          sprintf(
          '"orders":
             [%s]
          ',
          paste(unlist(lapply(self$`orders`, function(x) paste0('"', x, '"'))), collapse = ",")
          )
        },
        if (!is.null(self$`statuses`)) {
          sprintf(
          '"statuses":
          [%s]
',
          paste(sapply(self$`statuses`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        },
        if (!is.null(self$`hasCis`)) {
          sprintf(
          '"hasCis":
            %s
                    ',
          tolower(self$`hasCis`)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of GetOrdersStatsRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of GetOrdersStatsRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of GetOrdersStatsRequest
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`dateFrom` <- this_object$`dateFrom`
      self$`dateTo` <- this_object$`dateTo`
      self$`updateFrom` <- this_object$`updateFrom`
      self$`updateTo` <- this_object$`updateTo`
      self$`orders` <- ApiClient$new()$deserializeObj(this_object$`orders`, "array[integer]", loadNamespace("ympa_r_client"))
      self$`statuses` <- ApiClient$new()$deserializeObj(this_object$`statuses`, "array[OrderStatsStatusType]", loadNamespace("ympa_r_client"))
      self$`hasCis` <- this_object$`hasCis`
      self
    },
    #' Validate JSON input with respect to GetOrdersStatsRequest
    #'
    #' @description
    #' Validate JSON input with respect to GetOrdersStatsRequest and throw an exception if invalid
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
    #' @return String representation of GetOrdersStatsRequest
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
# GetOrdersStatsRequest$unlock()
#
## Below is an example to define the print function
# GetOrdersStatsRequest$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# GetOrdersStatsRequest$lock()

