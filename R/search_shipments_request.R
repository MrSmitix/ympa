#' Create a new SearchShipmentsRequest
#'
#' @description
#' Запрос информации об отгрузках.
#'
#' @docType class
#' @title SearchShipmentsRequest
#' @description SearchShipmentsRequest Class
#' @format An \code{R6Class} generator object
#' @field dateFrom Начальная дата для фильтрации по дате отгрузки (включительно).  Формат даты: `ДД-ММ-ГГГГ`. character
#' @field dateTo Конечная дата для фильтрации по дате отгрузки (включительно).  Формат даты: `ДД-ММ-ГГГГ`. character
#' @field statuses Список статусов отгрузок. list(\link{ShipmentStatusType}) [optional]
#' @field orderIds Список идентификаторов заказов из отгрузок. list(integer) [optional]
#' @field cancelledOrders Возвращать ли отмененные заказы.  Значение по умолчанию — `true`. Если возвращать отмененные заказы не нужно, передайте значение `false`. character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
SearchShipmentsRequest <- R6::R6Class(
  "SearchShipmentsRequest",
  public = list(
    `dateFrom` = NULL,
    `dateTo` = NULL,
    `statuses` = NULL,
    `orderIds` = NULL,
    `cancelledOrders` = NULL,
    #' Initialize a new SearchShipmentsRequest class.
    #'
    #' @description
    #' Initialize a new SearchShipmentsRequest class.
    #'
    #' @param dateFrom Начальная дата для фильтрации по дате отгрузки (включительно).  Формат даты: `ДД-ММ-ГГГГ`.
    #' @param dateTo Конечная дата для фильтрации по дате отгрузки (включительно).  Формат даты: `ДД-ММ-ГГГГ`.
    #' @param statuses Список статусов отгрузок.
    #' @param orderIds Список идентификаторов заказов из отгрузок.
    #' @param cancelledOrders Возвращать ли отмененные заказы.  Значение по умолчанию — `true`. Если возвращать отмененные заказы не нужно, передайте значение `false`.. Default to TRUE.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`dateFrom`, `dateTo`, `statuses` = NULL, `orderIds` = NULL, `cancelledOrders` = TRUE, ...) {
      if (!missing(`dateFrom`)) {
        if (!(is.character(`dateFrom`) && length(`dateFrom`) == 1)) {
          stop(paste("Error! Invalid data for `dateFrom`. Must be a string:", `dateFrom`))
        }
        self$`dateFrom` <- `dateFrom`
      }
      if (!missing(`dateTo`)) {
        if (!(is.character(`dateTo`) && length(`dateTo`) == 1)) {
          stop(paste("Error! Invalid data for `dateTo`. Must be a string:", `dateTo`))
        }
        self$`dateTo` <- `dateTo`
      }
      if (!is.null(`statuses`)) {
        stopifnot(is.vector(`statuses`), length(`statuses`) != 0)
        sapply(`statuses`, function(x) stopifnot(R6::is.R6(x)))
        if (!identical(`statuses`, unique(`statuses`))) {
          stop("Error! Items in `statuses` are not unique.")
        }
        self$`statuses` <- `statuses`
      }
      if (!is.null(`orderIds`)) {
        stopifnot(is.vector(`orderIds`), length(`orderIds`) != 0)
        sapply(`orderIds`, function(x) stopifnot(is.character(x)))
        if (!identical(`orderIds`, unique(`orderIds`))) {
          stop("Error! Items in `orderIds` are not unique.")
        }
        self$`orderIds` <- `orderIds`
      }
      if (!is.null(`cancelledOrders`)) {
        if (!(is.logical(`cancelledOrders`) && length(`cancelledOrders`) == 1)) {
          stop(paste("Error! Invalid data for `cancelledOrders`. Must be a boolean:", `cancelledOrders`))
        }
        self$`cancelledOrders` <- `cancelledOrders`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return SearchShipmentsRequest in JSON format
    #' @export
    toJSON = function() {
      SearchShipmentsRequestObject <- list()
      if (!is.null(self$`dateFrom`)) {
        SearchShipmentsRequestObject[["dateFrom"]] <-
          self$`dateFrom`
      }
      if (!is.null(self$`dateTo`)) {
        SearchShipmentsRequestObject[["dateTo"]] <-
          self$`dateTo`
      }
      if (!is.null(self$`statuses`)) {
        SearchShipmentsRequestObject[["statuses"]] <-
          lapply(self$`statuses`, function(x) x$toJSON())
      }
      if (!is.null(self$`orderIds`)) {
        SearchShipmentsRequestObject[["orderIds"]] <-
          self$`orderIds`
      }
      if (!is.null(self$`cancelledOrders`)) {
        SearchShipmentsRequestObject[["cancelledOrders"]] <-
          self$`cancelledOrders`
      }
      SearchShipmentsRequestObject
    },
    #' Deserialize JSON string into an instance of SearchShipmentsRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of SearchShipmentsRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of SearchShipmentsRequest
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`dateFrom`)) {
        self$`dateFrom` <- this_object$`dateFrom`
      }
      if (!is.null(this_object$`dateTo`)) {
        self$`dateTo` <- this_object$`dateTo`
      }
      if (!is.null(this_object$`statuses`)) {
        self$`statuses` <- ApiClient$new()$deserializeObj(this_object$`statuses`, "set[ShipmentStatusType]", loadNamespace("ympa_r_client"))
        if (!identical(self$`statuses`, unique(self$`statuses`))) {
          stop("Error! Items in `statuses` are not unique.")
        }
      }
      if (!is.null(this_object$`orderIds`)) {
        self$`orderIds` <- ApiClient$new()$deserializeObj(this_object$`orderIds`, "set[integer]", loadNamespace("ympa_r_client"))
        if (!identical(self$`orderIds`, unique(self$`orderIds`))) {
          stop("Error! Items in `orderIds` are not unique.")
        }
      }
      if (!is.null(this_object$`cancelledOrders`)) {
        self$`cancelledOrders` <- this_object$`cancelledOrders`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return SearchShipmentsRequest in JSON format
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
        if (!is.null(self$`statuses`)) {
          sprintf(
          '"statuses":
          [%s]
',
          paste(sapply(self$`statuses`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        },
        if (!is.null(self$`orderIds`)) {
          sprintf(
          '"orderIds":
             [%s]
          ',
          paste(unlist(lapply(self$`orderIds`, function(x) paste0('"', x, '"'))), collapse = ",")
          )
        },
        if (!is.null(self$`cancelledOrders`)) {
          sprintf(
          '"cancelledOrders":
            %s
                    ',
          tolower(self$`cancelledOrders`)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of SearchShipmentsRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of SearchShipmentsRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of SearchShipmentsRequest
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`dateFrom` <- this_object$`dateFrom`
      self$`dateTo` <- this_object$`dateTo`
      self$`statuses` <- ApiClient$new()$deserializeObj(this_object$`statuses`, "set[ShipmentStatusType]", loadNamespace("ympa_r_client"))
      if (!identical(self$`statuses`, unique(self$`statuses`))) {
        stop("Error! Items in `statuses` are not unique.")
      }
      self$`orderIds` <- ApiClient$new()$deserializeObj(this_object$`orderIds`, "set[integer]", loadNamespace("ympa_r_client"))
      if (!identical(self$`orderIds`, unique(self$`orderIds`))) {
        stop("Error! Items in `orderIds` are not unique.")
      }
      self$`cancelledOrders` <- this_object$`cancelledOrders`
      self
    },
    #' Validate JSON input with respect to SearchShipmentsRequest
    #'
    #' @description
    #' Validate JSON input with respect to SearchShipmentsRequest and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `dateFrom`
      if (!is.null(input_json$`dateFrom`)) {
        if (!(is.character(input_json$`dateFrom`) && length(input_json$`dateFrom`) == 1)) {
          stop(paste("Error! Invalid data for `dateFrom`. Must be a string:", input_json$`dateFrom`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for SearchShipmentsRequest: the required field `dateFrom` is missing."))
      }
      # check the required field `dateTo`
      if (!is.null(input_json$`dateTo`)) {
        if (!(is.character(input_json$`dateTo`) && length(input_json$`dateTo`) == 1)) {
          stop(paste("Error! Invalid data for `dateTo`. Must be a string:", input_json$`dateTo`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for SearchShipmentsRequest: the required field `dateTo` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of SearchShipmentsRequest
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
      # check if the required `dateFrom` is null
      if (is.null(self$`dateFrom`)) {
        return(FALSE)
      }

      # check if the required `dateTo` is null
      if (is.null(self$`dateTo`)) {
        return(FALSE)
      }

      if (length(self$`statuses`) < 1) {
        return(FALSE)
      }

      if (length(self$`orderIds`) < 1) {
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
      # check if the required `dateFrom` is null
      if (is.null(self$`dateFrom`)) {
        invalid_fields["dateFrom"] <- "Non-nullable required field `dateFrom` cannot be null."
      }

      # check if the required `dateTo` is null
      if (is.null(self$`dateTo`)) {
        invalid_fields["dateTo"] <- "Non-nullable required field `dateTo` cannot be null."
      }

      if (length(self$`statuses`) < 1) {
        invalid_fields["statuses"] <- "Invalid length for ``, number of items must be greater than or equal to 1."
      }

      if (length(self$`orderIds`) < 1) {
        invalid_fields["orderIds"] <- "Invalid length for ``, number of items must be greater than or equal to 1."
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
# SearchShipmentsRequest$unlock()
#
## Below is an example to define the print function
# SearchShipmentsRequest$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# SearchShipmentsRequest$lock()

