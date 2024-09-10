#' Create a new OrderDeliveryDatesDTO
#'
#' @description
#' Диапазон дат доставки.
#'
#' @docType class
#' @title OrderDeliveryDatesDTO
#' @description OrderDeliveryDatesDTO Class
#' @format An \code{R6Class} generator object
#' @field fromDate Формат даты: `ДД-ММ-ГГГГ`. character [optional]
#' @field toDate Формат даты: `ДД-ММ-ГГГГ`. character [optional]
#' @field fromTime Начало интервала времени доставки.  Передается только совместно с параметром `type=DELIVERY`.  Формат времени: 24-часовой, `ЧЧ:ММ`. В качестве минут всегда должно быть указано `00` (исключение — `23:59`).  Минимальное значение: `00:00`. character [optional]
#' @field toTime Конец интервала времени доставки.  Передается только совместно с параметром `type=DELIVERY`.  Формат времени: 24-часовой, `ЧЧ:ММ`. В качестве минут всегда должно быть указано `00` (исключение — `23:59`).  Максимальное значение: `23:59`. character [optional]
#' @field realDeliveryDate Формат даты: `ДД-ММ-ГГГГ`. character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
OrderDeliveryDatesDTO <- R6::R6Class(
  "OrderDeliveryDatesDTO",
  public = list(
    `fromDate` = NULL,
    `toDate` = NULL,
    `fromTime` = NULL,
    `toTime` = NULL,
    `realDeliveryDate` = NULL,
    #' Initialize a new OrderDeliveryDatesDTO class.
    #'
    #' @description
    #' Initialize a new OrderDeliveryDatesDTO class.
    #'
    #' @param fromDate Формат даты: `ДД-ММ-ГГГГ`.
    #' @param toDate Формат даты: `ДД-ММ-ГГГГ`.
    #' @param fromTime Начало интервала времени доставки.  Передается только совместно с параметром `type=DELIVERY`.  Формат времени: 24-часовой, `ЧЧ:ММ`. В качестве минут всегда должно быть указано `00` (исключение — `23:59`).  Минимальное значение: `00:00`.
    #' @param toTime Конец интервала времени доставки.  Передается только совместно с параметром `type=DELIVERY`.  Формат времени: 24-часовой, `ЧЧ:ММ`. В качестве минут всегда должно быть указано `00` (исключение — `23:59`).  Максимальное значение: `23:59`.
    #' @param realDeliveryDate Формат даты: `ДД-ММ-ГГГГ`.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`fromDate` = NULL, `toDate` = NULL, `fromTime` = NULL, `toTime` = NULL, `realDeliveryDate` = NULL, ...) {
      if (!is.null(`fromDate`)) {
        if (!(is.character(`fromDate`) && length(`fromDate`) == 1)) {
          stop(paste("Error! Invalid data for `fromDate`. Must be a string:", `fromDate`))
        }
        self$`fromDate` <- `fromDate`
      }
      if (!is.null(`toDate`)) {
        if (!(is.character(`toDate`) && length(`toDate`) == 1)) {
          stop(paste("Error! Invalid data for `toDate`. Must be a string:", `toDate`))
        }
        self$`toDate` <- `toDate`
      }
      if (!is.null(`fromTime`)) {
        if (!(is.character(`fromTime`) && length(`fromTime`) == 1)) {
          stop(paste("Error! Invalid data for `fromTime`. Must be a string:", `fromTime`))
        }
        self$`fromTime` <- `fromTime`
      }
      if (!is.null(`toTime`)) {
        if (!(is.character(`toTime`) && length(`toTime`) == 1)) {
          stop(paste("Error! Invalid data for `toTime`. Must be a string:", `toTime`))
        }
        self$`toTime` <- `toTime`
      }
      if (!is.null(`realDeliveryDate`)) {
        if (!(is.character(`realDeliveryDate`) && length(`realDeliveryDate`) == 1)) {
          stop(paste("Error! Invalid data for `realDeliveryDate`. Must be a string:", `realDeliveryDate`))
        }
        self$`realDeliveryDate` <- `realDeliveryDate`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return OrderDeliveryDatesDTO in JSON format
    #' @export
    toJSON = function() {
      OrderDeliveryDatesDTOObject <- list()
      if (!is.null(self$`fromDate`)) {
        OrderDeliveryDatesDTOObject[["fromDate"]] <-
          self$`fromDate`
      }
      if (!is.null(self$`toDate`)) {
        OrderDeliveryDatesDTOObject[["toDate"]] <-
          self$`toDate`
      }
      if (!is.null(self$`fromTime`)) {
        OrderDeliveryDatesDTOObject[["fromTime"]] <-
          self$`fromTime`
      }
      if (!is.null(self$`toTime`)) {
        OrderDeliveryDatesDTOObject[["toTime"]] <-
          self$`toTime`
      }
      if (!is.null(self$`realDeliveryDate`)) {
        OrderDeliveryDatesDTOObject[["realDeliveryDate"]] <-
          self$`realDeliveryDate`
      }
      OrderDeliveryDatesDTOObject
    },
    #' Deserialize JSON string into an instance of OrderDeliveryDatesDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of OrderDeliveryDatesDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of OrderDeliveryDatesDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`fromDate`)) {
        self$`fromDate` <- this_object$`fromDate`
      }
      if (!is.null(this_object$`toDate`)) {
        self$`toDate` <- this_object$`toDate`
      }
      if (!is.null(this_object$`fromTime`)) {
        self$`fromTime` <- this_object$`fromTime`
      }
      if (!is.null(this_object$`toTime`)) {
        self$`toTime` <- this_object$`toTime`
      }
      if (!is.null(this_object$`realDeliveryDate`)) {
        self$`realDeliveryDate` <- this_object$`realDeliveryDate`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return OrderDeliveryDatesDTO in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`fromDate`)) {
          sprintf(
          '"fromDate":
            "%s"
                    ',
          self$`fromDate`
          )
        },
        if (!is.null(self$`toDate`)) {
          sprintf(
          '"toDate":
            "%s"
                    ',
          self$`toDate`
          )
        },
        if (!is.null(self$`fromTime`)) {
          sprintf(
          '"fromTime":
            "%s"
                    ',
          self$`fromTime`
          )
        },
        if (!is.null(self$`toTime`)) {
          sprintf(
          '"toTime":
            "%s"
                    ',
          self$`toTime`
          )
        },
        if (!is.null(self$`realDeliveryDate`)) {
          sprintf(
          '"realDeliveryDate":
            "%s"
                    ',
          self$`realDeliveryDate`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of OrderDeliveryDatesDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of OrderDeliveryDatesDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of OrderDeliveryDatesDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`fromDate` <- this_object$`fromDate`
      self$`toDate` <- this_object$`toDate`
      self$`fromTime` <- this_object$`fromTime`
      self$`toTime` <- this_object$`toTime`
      self$`realDeliveryDate` <- this_object$`realDeliveryDate`
      self
    },
    #' Validate JSON input with respect to OrderDeliveryDatesDTO
    #'
    #' @description
    #' Validate JSON input with respect to OrderDeliveryDatesDTO and throw an exception if invalid
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
    #' @return String representation of OrderDeliveryDatesDTO
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
# OrderDeliveryDatesDTO$unlock()
#
## Below is an example to define the print function
# OrderDeliveryDatesDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# OrderDeliveryDatesDTO$lock()

