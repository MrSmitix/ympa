#' Create a new OrdersStatsCommissionDTO
#'
#' @description
#' Информация о стоимости услуг.
#'
#' @docType class
#' @title OrdersStatsCommissionDTO
#' @description OrdersStatsCommissionDTO Class
#' @format An \code{R6Class} generator object
#' @field type  \link{OrdersStatsCommissionType} [optional]
#' @field actual Сумма в рублях, которая была выставлена в момент создания заказа и которую нужно оплатить. Точность — два знака после запятой. numeric [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
OrdersStatsCommissionDTO <- R6::R6Class(
  "OrdersStatsCommissionDTO",
  public = list(
    `type` = NULL,
    `actual` = NULL,
    #' Initialize a new OrdersStatsCommissionDTO class.
    #'
    #' @description
    #' Initialize a new OrdersStatsCommissionDTO class.
    #'
    #' @param type type
    #' @param actual Сумма в рублях, которая была выставлена в момент создания заказа и которую нужно оплатить. Точность — два знака после запятой.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`type` = NULL, `actual` = NULL, ...) {
      if (!is.null(`type`)) {
        if (!(`type` %in% c())) {
          stop(paste("Error! \"", `type`, "\" cannot be assigned to `type`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`type`))
        self$`type` <- `type`
      }
      if (!is.null(`actual`)) {
        self$`actual` <- `actual`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return OrdersStatsCommissionDTO in JSON format
    #' @export
    toJSON = function() {
      OrdersStatsCommissionDTOObject <- list()
      if (!is.null(self$`type`)) {
        OrdersStatsCommissionDTOObject[["type"]] <-
          self$`type`$toJSON()
      }
      if (!is.null(self$`actual`)) {
        OrdersStatsCommissionDTOObject[["actual"]] <-
          self$`actual`
      }
      OrdersStatsCommissionDTOObject
    },
    #' Deserialize JSON string into an instance of OrdersStatsCommissionDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of OrdersStatsCommissionDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of OrdersStatsCommissionDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`type`)) {
        `type_object` <- OrdersStatsCommissionType$new()
        `type_object`$fromJSON(jsonlite::toJSON(this_object$`type`, auto_unbox = TRUE, digits = NA))
        self$`type` <- `type_object`
      }
      if (!is.null(this_object$`actual`)) {
        self$`actual` <- this_object$`actual`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return OrdersStatsCommissionDTO in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`type`)) {
          sprintf(
          '"type":
          %s
          ',
          jsonlite::toJSON(self$`type`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`actual`)) {
          sprintf(
          '"actual":
            %d
                    ',
          self$`actual`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of OrdersStatsCommissionDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of OrdersStatsCommissionDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of OrdersStatsCommissionDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`type` <- OrdersStatsCommissionType$new()$fromJSON(jsonlite::toJSON(this_object$`type`, auto_unbox = TRUE, digits = NA))
      self$`actual` <- this_object$`actual`
      self
    },
    #' Validate JSON input with respect to OrdersStatsCommissionDTO
    #'
    #' @description
    #' Validate JSON input with respect to OrdersStatsCommissionDTO and throw an exception if invalid
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
    #' @return String representation of OrdersStatsCommissionDTO
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
# OrdersStatsCommissionDTO$unlock()
#
## Below is an example to define the print function
# OrdersStatsCommissionDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# OrdersStatsCommissionDTO$lock()

