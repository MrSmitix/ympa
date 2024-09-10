#' Create a new OrderShipmentDTO
#'
#' @description
#' Список посылок.  В параметре может указываться несколько посылок. 
#'
#' @docType class
#' @title OrderShipmentDTO
#' @description OrderShipmentDTO Class
#' @format An \code{R6Class} generator object
#' @field id Идентификатор посылки, присвоенный Маркетом. integer [optional]
#' @field shipmentDate Формат даты: `ДД-ММ-ГГГГ`. character [optional]
#' @field shipmentTime **Только для модели Экспресс**  Время, к которому магазин должен упаковать заказ и перевести его в статус `READY_TO_SHIP`. После смены статуса за заказом приедет курьер.  Поле может появиться не сразу. Запрашивайте информацию о заказе в течении 5–10 минут, пока оно не вернется.  Формат времени: 24-часовой, `ЧЧ:ММ`.  Если заказ сделан организацией, параметр не возвращается до согласования даты доставки. character [optional]
#' @field tracks **Только для модели DBS**  Информация для отслеживания перемещений посылки. list(\link{OrderTrackDTO}) [optional]
#' @field boxes Список грузовых мест. list(\link{OrderParcelBoxDTO}) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
OrderShipmentDTO <- R6::R6Class(
  "OrderShipmentDTO",
  public = list(
    `id` = NULL,
    `shipmentDate` = NULL,
    `shipmentTime` = NULL,
    `tracks` = NULL,
    `boxes` = NULL,
    #' Initialize a new OrderShipmentDTO class.
    #'
    #' @description
    #' Initialize a new OrderShipmentDTO class.
    #'
    #' @param id Идентификатор посылки, присвоенный Маркетом.
    #' @param shipmentDate Формат даты: `ДД-ММ-ГГГГ`.
    #' @param shipmentTime **Только для модели Экспресс**  Время, к которому магазин должен упаковать заказ и перевести его в статус `READY_TO_SHIP`. После смены статуса за заказом приедет курьер.  Поле может появиться не сразу. Запрашивайте информацию о заказе в течении 5–10 минут, пока оно не вернется.  Формат времени: 24-часовой, `ЧЧ:ММ`.  Если заказ сделан организацией, параметр не возвращается до согласования даты доставки.
    #' @param tracks **Только для модели DBS**  Информация для отслеживания перемещений посылки.
    #' @param boxes Список грузовых мест.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`id` = NULL, `shipmentDate` = NULL, `shipmentTime` = NULL, `tracks` = NULL, `boxes` = NULL, ...) {
      if (!is.null(`id`)) {
        if (!(is.numeric(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be an integer:", `id`))
        }
        self$`id` <- `id`
      }
      if (!is.null(`shipmentDate`)) {
        if (!(is.character(`shipmentDate`) && length(`shipmentDate`) == 1)) {
          stop(paste("Error! Invalid data for `shipmentDate`. Must be a string:", `shipmentDate`))
        }
        self$`shipmentDate` <- `shipmentDate`
      }
      if (!is.null(`shipmentTime`)) {
        if (!(is.character(`shipmentTime`) && length(`shipmentTime`) == 1)) {
          stop(paste("Error! Invalid data for `shipmentTime`. Must be a string:", `shipmentTime`))
        }
        self$`shipmentTime` <- `shipmentTime`
      }
      if (!is.null(`tracks`)) {
        stopifnot(is.vector(`tracks`), length(`tracks`) != 0)
        sapply(`tracks`, function(x) stopifnot(R6::is.R6(x)))
        self$`tracks` <- `tracks`
      }
      if (!is.null(`boxes`)) {
        stopifnot(is.vector(`boxes`), length(`boxes`) != 0)
        sapply(`boxes`, function(x) stopifnot(R6::is.R6(x)))
        self$`boxes` <- `boxes`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return OrderShipmentDTO in JSON format
    #' @export
    toJSON = function() {
      OrderShipmentDTOObject <- list()
      if (!is.null(self$`id`)) {
        OrderShipmentDTOObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`shipmentDate`)) {
        OrderShipmentDTOObject[["shipmentDate"]] <-
          self$`shipmentDate`
      }
      if (!is.null(self$`shipmentTime`)) {
        OrderShipmentDTOObject[["shipmentTime"]] <-
          self$`shipmentTime`
      }
      if (!is.null(self$`tracks`)) {
        OrderShipmentDTOObject[["tracks"]] <-
          lapply(self$`tracks`, function(x) x$toJSON())
      }
      if (!is.null(self$`boxes`)) {
        OrderShipmentDTOObject[["boxes"]] <-
          lapply(self$`boxes`, function(x) x$toJSON())
      }
      OrderShipmentDTOObject
    },
    #' Deserialize JSON string into an instance of OrderShipmentDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of OrderShipmentDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of OrderShipmentDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`shipmentDate`)) {
        self$`shipmentDate` <- this_object$`shipmentDate`
      }
      if (!is.null(this_object$`shipmentTime`)) {
        self$`shipmentTime` <- this_object$`shipmentTime`
      }
      if (!is.null(this_object$`tracks`)) {
        self$`tracks` <- ApiClient$new()$deserializeObj(this_object$`tracks`, "array[OrderTrackDTO]", loadNamespace("ympa_r_client"))
      }
      if (!is.null(this_object$`boxes`)) {
        self$`boxes` <- ApiClient$new()$deserializeObj(this_object$`boxes`, "array[OrderParcelBoxDTO]", loadNamespace("ympa_r_client"))
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return OrderShipmentDTO in JSON format
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
        if (!is.null(self$`shipmentDate`)) {
          sprintf(
          '"shipmentDate":
            "%s"
                    ',
          self$`shipmentDate`
          )
        },
        if (!is.null(self$`shipmentTime`)) {
          sprintf(
          '"shipmentTime":
            "%s"
                    ',
          self$`shipmentTime`
          )
        },
        if (!is.null(self$`tracks`)) {
          sprintf(
          '"tracks":
          [%s]
',
          paste(sapply(self$`tracks`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        },
        if (!is.null(self$`boxes`)) {
          sprintf(
          '"boxes":
          [%s]
',
          paste(sapply(self$`boxes`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of OrderShipmentDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of OrderShipmentDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of OrderShipmentDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`id` <- this_object$`id`
      self$`shipmentDate` <- this_object$`shipmentDate`
      self$`shipmentTime` <- this_object$`shipmentTime`
      self$`tracks` <- ApiClient$new()$deserializeObj(this_object$`tracks`, "array[OrderTrackDTO]", loadNamespace("ympa_r_client"))
      self$`boxes` <- ApiClient$new()$deserializeObj(this_object$`boxes`, "array[OrderParcelBoxDTO]", loadNamespace("ympa_r_client"))
      self
    },
    #' Validate JSON input with respect to OrderShipmentDTO
    #'
    #' @description
    #' Validate JSON input with respect to OrderShipmentDTO and throw an exception if invalid
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
    #' @return String representation of OrderShipmentDTO
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
# OrderShipmentDTO$unlock()
#
## Below is an example to define the print function
# OrderShipmentDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# OrderShipmentDTO$lock()

