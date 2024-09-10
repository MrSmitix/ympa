#' Create a new OrderItemModificationDTO
#'
#' @description
#' Список товаров в заказе.  Если магазин не передал информацию о товаре во входных данных, он будет удален из заказа.  Обязательный параметр. 
#'
#' @docType class
#' @title OrderItemModificationDTO
#' @description OrderItemModificationDTO Class
#' @format An \code{R6Class} generator object
#' @field id Идентификатор товара в рамках заказа.  Получить идентификатор можно с помощью ресурсов [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md) или [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md).  Обязательный параметр. integer
#' @field count Новое количество товара. integer
#' @field instances Информация о маркировке единиц товара.  Передавайте в запросе все единицы товара, который подлежит маркировке.  Обязательный параметр, если в заказе есть товары, подлежащие маркировке [в системе «Честный ЗНАК»](https://честныйзнак.рф/). list(\link{BriefOrderItemInstanceDTO}) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
OrderItemModificationDTO <- R6::R6Class(
  "OrderItemModificationDTO",
  public = list(
    `id` = NULL,
    `count` = NULL,
    `instances` = NULL,
    #' Initialize a new OrderItemModificationDTO class.
    #'
    #' @description
    #' Initialize a new OrderItemModificationDTO class.
    #'
    #' @param id Идентификатор товара в рамках заказа.  Получить идентификатор можно с помощью ресурсов [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md) или [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md).  Обязательный параметр.
    #' @param count Новое количество товара.
    #' @param instances Информация о маркировке единиц товара.  Передавайте в запросе все единицы товара, который подлежит маркировке.  Обязательный параметр, если в заказе есть товары, подлежащие маркировке [в системе «Честный ЗНАК»](https://честныйзнак.рф/).
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`id`, `count`, `instances` = NULL, ...) {
      if (!missing(`id`)) {
        if (!(is.numeric(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be an integer:", `id`))
        }
        self$`id` <- `id`
      }
      if (!missing(`count`)) {
        if (!(is.numeric(`count`) && length(`count`) == 1)) {
          stop(paste("Error! Invalid data for `count`. Must be an integer:", `count`))
        }
        self$`count` <- `count`
      }
      if (!is.null(`instances`)) {
        stopifnot(is.vector(`instances`), length(`instances`) != 0)
        sapply(`instances`, function(x) stopifnot(R6::is.R6(x)))
        self$`instances` <- `instances`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return OrderItemModificationDTO in JSON format
    #' @export
    toJSON = function() {
      OrderItemModificationDTOObject <- list()
      if (!is.null(self$`id`)) {
        OrderItemModificationDTOObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`count`)) {
        OrderItemModificationDTOObject[["count"]] <-
          self$`count`
      }
      if (!is.null(self$`instances`)) {
        OrderItemModificationDTOObject[["instances"]] <-
          lapply(self$`instances`, function(x) x$toJSON())
      }
      OrderItemModificationDTOObject
    },
    #' Deserialize JSON string into an instance of OrderItemModificationDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of OrderItemModificationDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of OrderItemModificationDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`count`)) {
        self$`count` <- this_object$`count`
      }
      if (!is.null(this_object$`instances`)) {
        self$`instances` <- ApiClient$new()$deserializeObj(this_object$`instances`, "array[BriefOrderItemInstanceDTO]", loadNamespace("ympa_r_client"))
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return OrderItemModificationDTO in JSON format
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
        if (!is.null(self$`count`)) {
          sprintf(
          '"count":
            %d
                    ',
          self$`count`
          )
        },
        if (!is.null(self$`instances`)) {
          sprintf(
          '"instances":
          [%s]
',
          paste(sapply(self$`instances`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of OrderItemModificationDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of OrderItemModificationDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of OrderItemModificationDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`id` <- this_object$`id`
      self$`count` <- this_object$`count`
      self$`instances` <- ApiClient$new()$deserializeObj(this_object$`instances`, "array[BriefOrderItemInstanceDTO]", loadNamespace("ympa_r_client"))
      self
    },
    #' Validate JSON input with respect to OrderItemModificationDTO
    #'
    #' @description
    #' Validate JSON input with respect to OrderItemModificationDTO and throw an exception if invalid
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
        stop(paste("The JSON input `", input, "` is invalid for OrderItemModificationDTO: the required field `id` is missing."))
      }
      # check the required field `count`
      if (!is.null(input_json$`count`)) {
        if (!(is.numeric(input_json$`count`) && length(input_json$`count`) == 1)) {
          stop(paste("Error! Invalid data for `count`. Must be an integer:", input_json$`count`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for OrderItemModificationDTO: the required field `count` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of OrderItemModificationDTO
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

      # check if the required `count` is null
      if (is.null(self$`count`)) {
        return(FALSE)
      }

      if (self$`count` < 0) {
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

      # check if the required `count` is null
      if (is.null(self$`count`)) {
        invalid_fields["count"] <- "Non-nullable required field `count` cannot be null."
      }

      if (self$`count` < 0) {
        invalid_fields["count"] <- "Invalid value for `count`, must be bigger than or equal to 0."
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
# OrderItemModificationDTO$unlock()
#
## Below is an example to define the print function
# OrderItemModificationDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# OrderItemModificationDTO$lock()

