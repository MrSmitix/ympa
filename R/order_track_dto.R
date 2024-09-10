#' Create a new OrderTrackDTO
#'
#' @description
#' Информация о трек-номере посылки (DBS).
#'
#' @docType class
#' @title OrderTrackDTO
#' @description OrderTrackDTO Class
#' @format An \code{R6Class} generator object
#' @field trackCode Трек‑номер посылки. character [optional]
#' @field deliveryServiceId Идентификатор службы доставки. Информацию о службе доставки можно получить с помощью запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md). integer [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
OrderTrackDTO <- R6::R6Class(
  "OrderTrackDTO",
  public = list(
    `trackCode` = NULL,
    `deliveryServiceId` = NULL,
    #' Initialize a new OrderTrackDTO class.
    #'
    #' @description
    #' Initialize a new OrderTrackDTO class.
    #'
    #' @param trackCode Трек‑номер посылки.
    #' @param deliveryServiceId Идентификатор службы доставки. Информацию о службе доставки можно получить с помощью запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md).
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`trackCode` = NULL, `deliveryServiceId` = NULL, ...) {
      if (!is.null(`trackCode`)) {
        if (!(is.character(`trackCode`) && length(`trackCode`) == 1)) {
          stop(paste("Error! Invalid data for `trackCode`. Must be a string:", `trackCode`))
        }
        self$`trackCode` <- `trackCode`
      }
      if (!is.null(`deliveryServiceId`)) {
        if (!(is.numeric(`deliveryServiceId`) && length(`deliveryServiceId`) == 1)) {
          stop(paste("Error! Invalid data for `deliveryServiceId`. Must be an integer:", `deliveryServiceId`))
        }
        self$`deliveryServiceId` <- `deliveryServiceId`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return OrderTrackDTO in JSON format
    #' @export
    toJSON = function() {
      OrderTrackDTOObject <- list()
      if (!is.null(self$`trackCode`)) {
        OrderTrackDTOObject[["trackCode"]] <-
          self$`trackCode`
      }
      if (!is.null(self$`deliveryServiceId`)) {
        OrderTrackDTOObject[["deliveryServiceId"]] <-
          self$`deliveryServiceId`
      }
      OrderTrackDTOObject
    },
    #' Deserialize JSON string into an instance of OrderTrackDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of OrderTrackDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of OrderTrackDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`trackCode`)) {
        self$`trackCode` <- this_object$`trackCode`
      }
      if (!is.null(this_object$`deliveryServiceId`)) {
        self$`deliveryServiceId` <- this_object$`deliveryServiceId`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return OrderTrackDTO in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`trackCode`)) {
          sprintf(
          '"trackCode":
            "%s"
                    ',
          self$`trackCode`
          )
        },
        if (!is.null(self$`deliveryServiceId`)) {
          sprintf(
          '"deliveryServiceId":
            %d
                    ',
          self$`deliveryServiceId`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of OrderTrackDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of OrderTrackDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of OrderTrackDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`trackCode` <- this_object$`trackCode`
      self$`deliveryServiceId` <- this_object$`deliveryServiceId`
      self
    },
    #' Validate JSON input with respect to OrderTrackDTO
    #'
    #' @description
    #' Validate JSON input with respect to OrderTrackDTO and throw an exception if invalid
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
    #' @return String representation of OrderTrackDTO
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
# OrderTrackDTO$unlock()
#
## Below is an example to define the print function
# OrderTrackDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# OrderTrackDTO$lock()

