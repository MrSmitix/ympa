#' Create a new OrderStatusChangeDeliveryDatesDTO
#'
#' @description
#' Диапазон дат доставки.
#'
#' @docType class
#' @title OrderStatusChangeDeliveryDatesDTO
#' @description OrderStatusChangeDeliveryDatesDTO Class
#' @format An \code{R6Class} generator object
#' @field realDeliveryDate **Только для модели DBS**  Фактическая дата доставки. <br><br> Когда передавать параметр `realDeliveryDate`:  * Не передавайте параметр, если:   * переводите заказ в любой статус, кроме `PICKUP` или `DELIVERED`;   * меняете статус заказа на `PICKUP` или `DELIVERED` в день доставки — будет указана дата выполнения запроса. * Передавайте дату доставки, если переводите заказ в статус `PICKUP` или `DELIVERED` не в день доставки. Нельзя указывать дату доставки в будущем.    {\% note warning \"Индекс качества\" \%}    Передача статуса после установленного срока снижает индекс качества. О сроках читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/quality/tech#dbs).    {\% endnote \%}      character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
OrderStatusChangeDeliveryDatesDTO <- R6::R6Class(
  "OrderStatusChangeDeliveryDatesDTO",
  public = list(
    `realDeliveryDate` = NULL,
    #' Initialize a new OrderStatusChangeDeliveryDatesDTO class.
    #'
    #' @description
    #' Initialize a new OrderStatusChangeDeliveryDatesDTO class.
    #'
    #' @param realDeliveryDate **Только для модели DBS**  Фактическая дата доставки. <br><br> Когда передавать параметр `realDeliveryDate`:  * Не передавайте параметр, если:   * переводите заказ в любой статус, кроме `PICKUP` или `DELIVERED`;   * меняете статус заказа на `PICKUP` или `DELIVERED` в день доставки — будет указана дата выполнения запроса. * Передавайте дату доставки, если переводите заказ в статус `PICKUP` или `DELIVERED` не в день доставки. Нельзя указывать дату доставки в будущем.    {\% note warning \"Индекс качества\" \%}    Передача статуса после установленного срока снижает индекс качества. О сроках читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/quality/tech#dbs).    {\% endnote \%}     
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`realDeliveryDate` = NULL, ...) {
      if (!is.null(`realDeliveryDate`)) {
        if (!is.character(`realDeliveryDate`)) {
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
    #' @return OrderStatusChangeDeliveryDatesDTO in JSON format
    #' @export
    toJSON = function() {
      OrderStatusChangeDeliveryDatesDTOObject <- list()
      if (!is.null(self$`realDeliveryDate`)) {
        OrderStatusChangeDeliveryDatesDTOObject[["realDeliveryDate"]] <-
          self$`realDeliveryDate`
      }
      OrderStatusChangeDeliveryDatesDTOObject
    },
    #' Deserialize JSON string into an instance of OrderStatusChangeDeliveryDatesDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of OrderStatusChangeDeliveryDatesDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of OrderStatusChangeDeliveryDatesDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
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
    #' @return OrderStatusChangeDeliveryDatesDTO in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
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
    #' Deserialize JSON string into an instance of OrderStatusChangeDeliveryDatesDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of OrderStatusChangeDeliveryDatesDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of OrderStatusChangeDeliveryDatesDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`realDeliveryDate` <- this_object$`realDeliveryDate`
      self
    },
    #' Validate JSON input with respect to OrderStatusChangeDeliveryDatesDTO
    #'
    #' @description
    #' Validate JSON input with respect to OrderStatusChangeDeliveryDatesDTO and throw an exception if invalid
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
    #' @return String representation of OrderStatusChangeDeliveryDatesDTO
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
# OrderStatusChangeDeliveryDatesDTO$unlock()
#
## Below is an example to define the print function
# OrderStatusChangeDeliveryDatesDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# OrderStatusChangeDeliveryDatesDTO$lock()

