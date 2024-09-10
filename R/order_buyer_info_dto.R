#' Create a new OrderBuyerInfoDTO
#'
#' @description
#' Информация о покупателе и его номере телефона.
#'
#' @docType class
#' @title OrderBuyerInfoDTO
#' @description OrderBuyerInfoDTO Class
#' @format An \code{R6Class} generator object
#' @field id Идентификатор покупателя. character [optional]
#' @field lastName Фамилия покупателя. character [optional]
#' @field firstName Имя покупателя. character [optional]
#' @field middleName Отчество покупателя. character [optional]
#' @field type  \link{OrderBuyerType} [optional]
#' @field phone Подменный номер телефона покупателя. Подробнее о таких номерах читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/orders/dbs/call#fake-number).  Формат номера: `+<код_страны><код_региона><номер_телефона>`. character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
OrderBuyerInfoDTO <- R6::R6Class(
  "OrderBuyerInfoDTO",
  public = list(
    `id` = NULL,
    `lastName` = NULL,
    `firstName` = NULL,
    `middleName` = NULL,
    `type` = NULL,
    `phone` = NULL,
    #' Initialize a new OrderBuyerInfoDTO class.
    #'
    #' @description
    #' Initialize a new OrderBuyerInfoDTO class.
    #'
    #' @param id Идентификатор покупателя.
    #' @param lastName Фамилия покупателя.
    #' @param firstName Имя покупателя.
    #' @param middleName Отчество покупателя.
    #' @param type type
    #' @param phone Подменный номер телефона покупателя. Подробнее о таких номерах читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/orders/dbs/call#fake-number).  Формат номера: `+<код_страны><код_региона><номер_телефона>`.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`id` = NULL, `lastName` = NULL, `firstName` = NULL, `middleName` = NULL, `type` = NULL, `phone` = NULL, ...) {
      if (!is.null(`id`)) {
        if (!(is.character(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", `id`))
        }
        self$`id` <- `id`
      }
      if (!is.null(`lastName`)) {
        if (!(is.character(`lastName`) && length(`lastName`) == 1)) {
          stop(paste("Error! Invalid data for `lastName`. Must be a string:", `lastName`))
        }
        self$`lastName` <- `lastName`
      }
      if (!is.null(`firstName`)) {
        if (!(is.character(`firstName`) && length(`firstName`) == 1)) {
          stop(paste("Error! Invalid data for `firstName`. Must be a string:", `firstName`))
        }
        self$`firstName` <- `firstName`
      }
      if (!is.null(`middleName`)) {
        if (!(is.character(`middleName`) && length(`middleName`) == 1)) {
          stop(paste("Error! Invalid data for `middleName`. Must be a string:", `middleName`))
        }
        self$`middleName` <- `middleName`
      }
      if (!is.null(`type`)) {
        if (!(`type` %in% c())) {
          stop(paste("Error! \"", `type`, "\" cannot be assigned to `type`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`type`))
        self$`type` <- `type`
      }
      if (!is.null(`phone`)) {
        if (!(is.character(`phone`) && length(`phone`) == 1)) {
          stop(paste("Error! Invalid data for `phone`. Must be a string:", `phone`))
        }
        self$`phone` <- `phone`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return OrderBuyerInfoDTO in JSON format
    #' @export
    toJSON = function() {
      OrderBuyerInfoDTOObject <- list()
      if (!is.null(self$`id`)) {
        OrderBuyerInfoDTOObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`lastName`)) {
        OrderBuyerInfoDTOObject[["lastName"]] <-
          self$`lastName`
      }
      if (!is.null(self$`firstName`)) {
        OrderBuyerInfoDTOObject[["firstName"]] <-
          self$`firstName`
      }
      if (!is.null(self$`middleName`)) {
        OrderBuyerInfoDTOObject[["middleName"]] <-
          self$`middleName`
      }
      if (!is.null(self$`type`)) {
        OrderBuyerInfoDTOObject[["type"]] <-
          self$`type`$toJSON()
      }
      if (!is.null(self$`phone`)) {
        OrderBuyerInfoDTOObject[["phone"]] <-
          self$`phone`
      }
      OrderBuyerInfoDTOObject
    },
    #' Deserialize JSON string into an instance of OrderBuyerInfoDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of OrderBuyerInfoDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of OrderBuyerInfoDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`lastName`)) {
        self$`lastName` <- this_object$`lastName`
      }
      if (!is.null(this_object$`firstName`)) {
        self$`firstName` <- this_object$`firstName`
      }
      if (!is.null(this_object$`middleName`)) {
        self$`middleName` <- this_object$`middleName`
      }
      if (!is.null(this_object$`type`)) {
        `type_object` <- OrderBuyerType$new()
        `type_object`$fromJSON(jsonlite::toJSON(this_object$`type`, auto_unbox = TRUE, digits = NA))
        self$`type` <- `type_object`
      }
      if (!is.null(this_object$`phone`)) {
        self$`phone` <- this_object$`phone`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return OrderBuyerInfoDTO in JSON format
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
        if (!is.null(self$`lastName`)) {
          sprintf(
          '"lastName":
            "%s"
                    ',
          self$`lastName`
          )
        },
        if (!is.null(self$`firstName`)) {
          sprintf(
          '"firstName":
            "%s"
                    ',
          self$`firstName`
          )
        },
        if (!is.null(self$`middleName`)) {
          sprintf(
          '"middleName":
            "%s"
                    ',
          self$`middleName`
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
        if (!is.null(self$`phone`)) {
          sprintf(
          '"phone":
            "%s"
                    ',
          self$`phone`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of OrderBuyerInfoDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of OrderBuyerInfoDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of OrderBuyerInfoDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`id` <- this_object$`id`
      self$`lastName` <- this_object$`lastName`
      self$`firstName` <- this_object$`firstName`
      self$`middleName` <- this_object$`middleName`
      self$`type` <- OrderBuyerType$new()$fromJSON(jsonlite::toJSON(this_object$`type`, auto_unbox = TRUE, digits = NA))
      self$`phone` <- this_object$`phone`
      self
    },
    #' Validate JSON input with respect to OrderBuyerInfoDTO
    #'
    #' @description
    #' Validate JSON input with respect to OrderBuyerInfoDTO and throw an exception if invalid
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
    #' @return String representation of OrderBuyerInfoDTO
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
# OrderBuyerInfoDTO$unlock()
#
## Below is an example to define the print function
# OrderBuyerInfoDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# OrderBuyerInfoDTO$lock()

