#' Create a new OrdersStatsDeliveryRegionDTO
#'
#' @description
#' Информация о регионе доставки.
#'
#' @docType class
#' @title OrdersStatsDeliveryRegionDTO
#' @description OrdersStatsDeliveryRegionDTO Class
#' @format An \code{R6Class} generator object
#' @field id Идентификатор региона доставки. integer [optional]
#' @field name Название региона доставки. character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
OrdersStatsDeliveryRegionDTO <- R6::R6Class(
  "OrdersStatsDeliveryRegionDTO",
  public = list(
    `id` = NULL,
    `name` = NULL,
    #' Initialize a new OrdersStatsDeliveryRegionDTO class.
    #'
    #' @description
    #' Initialize a new OrdersStatsDeliveryRegionDTO class.
    #'
    #' @param id Идентификатор региона доставки.
    #' @param name Название региона доставки.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`id` = NULL, `name` = NULL, ...) {
      if (!is.null(`id`)) {
        if (!(is.numeric(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be an integer:", `id`))
        }
        self$`id` <- `id`
      }
      if (!is.null(`name`)) {
        if (!(is.character(`name`) && length(`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", `name`))
        }
        self$`name` <- `name`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return OrdersStatsDeliveryRegionDTO in JSON format
    #' @export
    toJSON = function() {
      OrdersStatsDeliveryRegionDTOObject <- list()
      if (!is.null(self$`id`)) {
        OrdersStatsDeliveryRegionDTOObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`name`)) {
        OrdersStatsDeliveryRegionDTOObject[["name"]] <-
          self$`name`
      }
      OrdersStatsDeliveryRegionDTOObject
    },
    #' Deserialize JSON string into an instance of OrdersStatsDeliveryRegionDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of OrdersStatsDeliveryRegionDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of OrdersStatsDeliveryRegionDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`name`)) {
        self$`name` <- this_object$`name`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return OrdersStatsDeliveryRegionDTO in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`id`)) {
          sprintf(
          '"id":
            %d
                    ',
          self$`id`
          )
        },
        if (!is.null(self$`name`)) {
          sprintf(
          '"name":
            "%s"
                    ',
          self$`name`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of OrdersStatsDeliveryRegionDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of OrdersStatsDeliveryRegionDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of OrdersStatsDeliveryRegionDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`id` <- this_object$`id`
      self$`name` <- this_object$`name`
      self
    },
    #' Validate JSON input with respect to OrdersStatsDeliveryRegionDTO
    #'
    #' @description
    #' Validate JSON input with respect to OrdersStatsDeliveryRegionDTO and throw an exception if invalid
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
    #' @return String representation of OrdersStatsDeliveryRegionDTO
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
# OrdersStatsDeliveryRegionDTO$unlock()
#
## Below is an example to define the print function
# OrdersStatsDeliveryRegionDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# OrdersStatsDeliveryRegionDTO$lock()

