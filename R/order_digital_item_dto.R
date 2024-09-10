#' Create a new OrderDigitalItemDTO
#'
#' @description
#' Ключ цифрового товара.
#'
#' @docType class
#' @title OrderDigitalItemDTO
#' @description OrderDigitalItemDTO Class
#' @format An \code{R6Class} generator object
#' @field id Идентификатор товара в заказе.  Он приходит в ответе на запрос [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md) и в запросе Маркета [POST order/accept](../../pushapi/reference/orderAccept.md) — параметр `id` в `items`. integer
#' @field code Сам ключ. character
#' @field slip Инструкция по активации. character
#' @field activate_till Дата, до которой нужно активировать ключ. Если ключ действует бессрочно, укажите любую дату в отдаленном будущем.  Формат даты: `ГГГГ-ММ-ДД`. character
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
OrderDigitalItemDTO <- R6::R6Class(
  "OrderDigitalItemDTO",
  public = list(
    `id` = NULL,
    `code` = NULL,
    `slip` = NULL,
    `activate_till` = NULL,
    #' Initialize a new OrderDigitalItemDTO class.
    #'
    #' @description
    #' Initialize a new OrderDigitalItemDTO class.
    #'
    #' @param id Идентификатор товара в заказе.  Он приходит в ответе на запрос [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md) и в запросе Маркета [POST order/accept](../../pushapi/reference/orderAccept.md) — параметр `id` в `items`.
    #' @param code Сам ключ.
    #' @param slip Инструкция по активации.
    #' @param activate_till Дата, до которой нужно активировать ключ. Если ключ действует бессрочно, укажите любую дату в отдаленном будущем.  Формат даты: `ГГГГ-ММ-ДД`.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`id`, `code`, `slip`, `activate_till`, ...) {
      if (!missing(`id`)) {
        if (!(is.numeric(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be an integer:", `id`))
        }
        self$`id` <- `id`
      }
      if (!missing(`code`)) {
        if (!(is.character(`code`) && length(`code`) == 1)) {
          stop(paste("Error! Invalid data for `code`. Must be a string:", `code`))
        }
        self$`code` <- `code`
      }
      if (!missing(`slip`)) {
        if (!(is.character(`slip`) && length(`slip`) == 1)) {
          stop(paste("Error! Invalid data for `slip`. Must be a string:", `slip`))
        }
        self$`slip` <- `slip`
      }
      if (!missing(`activate_till`)) {
        if (!(is.character(`activate_till`) && length(`activate_till`) == 1)) {
          stop(paste("Error! Invalid data for `activate_till`. Must be a string:", `activate_till`))
        }
        self$`activate_till` <- `activate_till`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return OrderDigitalItemDTO in JSON format
    #' @export
    toJSON = function() {
      OrderDigitalItemDTOObject <- list()
      if (!is.null(self$`id`)) {
        OrderDigitalItemDTOObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`code`)) {
        OrderDigitalItemDTOObject[["code"]] <-
          self$`code`
      }
      if (!is.null(self$`slip`)) {
        OrderDigitalItemDTOObject[["slip"]] <-
          self$`slip`
      }
      if (!is.null(self$`activate_till`)) {
        OrderDigitalItemDTOObject[["activate_till"]] <-
          self$`activate_till`
      }
      OrderDigitalItemDTOObject
    },
    #' Deserialize JSON string into an instance of OrderDigitalItemDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of OrderDigitalItemDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of OrderDigitalItemDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`code`)) {
        self$`code` <- this_object$`code`
      }
      if (!is.null(this_object$`slip`)) {
        self$`slip` <- this_object$`slip`
      }
      if (!is.null(this_object$`activate_till`)) {
        self$`activate_till` <- this_object$`activate_till`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return OrderDigitalItemDTO in JSON format
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
        if (!is.null(self$`code`)) {
          sprintf(
          '"code":
            "%s"
                    ',
          self$`code`
          )
        },
        if (!is.null(self$`slip`)) {
          sprintf(
          '"slip":
            "%s"
                    ',
          self$`slip`
          )
        },
        if (!is.null(self$`activate_till`)) {
          sprintf(
          '"activate_till":
            "%s"
                    ',
          self$`activate_till`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of OrderDigitalItemDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of OrderDigitalItemDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of OrderDigitalItemDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`id` <- this_object$`id`
      self$`code` <- this_object$`code`
      self$`slip` <- this_object$`slip`
      self$`activate_till` <- this_object$`activate_till`
      self
    },
    #' Validate JSON input with respect to OrderDigitalItemDTO
    #'
    #' @description
    #' Validate JSON input with respect to OrderDigitalItemDTO and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `id`
      if (!is.null(input_json$`id`)) {
        if (!(is.numeric(input_json$`id`) && length(input_json$`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be an integer:", input_json$`id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for OrderDigitalItemDTO: the required field `id` is missing."))
      }
      # check the required field `code`
      if (!is.null(input_json$`code`)) {
        if (!(is.character(input_json$`code`) && length(input_json$`code`) == 1)) {
          stop(paste("Error! Invalid data for `code`. Must be a string:", input_json$`code`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for OrderDigitalItemDTO: the required field `code` is missing."))
      }
      # check the required field `slip`
      if (!is.null(input_json$`slip`)) {
        if (!(is.character(input_json$`slip`) && length(input_json$`slip`) == 1)) {
          stop(paste("Error! Invalid data for `slip`. Must be a string:", input_json$`slip`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for OrderDigitalItemDTO: the required field `slip` is missing."))
      }
      # check the required field `activate_till`
      if (!is.null(input_json$`activate_till`)) {
        if (!(is.character(input_json$`activate_till`) && length(input_json$`activate_till`) == 1)) {
          stop(paste("Error! Invalid data for `activate_till`. Must be a string:", input_json$`activate_till`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for OrderDigitalItemDTO: the required field `activate_till` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of OrderDigitalItemDTO
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
      # check if the required `id` is null
      if (is.null(self$`id`)) {
        return(FALSE)
      }

      # check if the required `code` is null
      if (is.null(self$`code`)) {
        return(FALSE)
      }

      # check if the required `slip` is null
      if (is.null(self$`slip`)) {
        return(FALSE)
      }

      # check if the required `activate_till` is null
      if (is.null(self$`activate_till`)) {
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
      # check if the required `id` is null
      if (is.null(self$`id`)) {
        invalid_fields["id"] <- "Non-nullable required field `id` cannot be null."
      }

      # check if the required `code` is null
      if (is.null(self$`code`)) {
        invalid_fields["code"] <- "Non-nullable required field `code` cannot be null."
      }

      # check if the required `slip` is null
      if (is.null(self$`slip`)) {
        invalid_fields["slip"] <- "Non-nullable required field `slip` cannot be null."
      }

      # check if the required `activate_till` is null
      if (is.null(self$`activate_till`)) {
        invalid_fields["activate_till"] <- "Non-nullable required field `activate_till` cannot be null."
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
# OrderDigitalItemDTO$unlock()
#
## Below is an example to define the print function
# OrderDigitalItemDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# OrderDigitalItemDTO$lock()

