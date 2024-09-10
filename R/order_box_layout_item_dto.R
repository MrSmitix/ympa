#' Create a new OrderBoxLayoutItemDTO
#'
#' @description
#' Информация о товаре в коробке.
#'
#' @docType class
#' @title OrderBoxLayoutItemDTO
#' @description OrderBoxLayoutItemDTO Class
#' @format An \code{R6Class} generator object
#' @field id Идентификатор товара в заказе.  {\% cut \"Где его взять\" \%}  Идентификатор приходит в ответе на запрос [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md) и в запросе Маркета [POST order/accept](../../pushapi/reference/orderAccept.md) — параметр `id` в `items`.  {\% endcut \%}   integer
#' @field fullCount Количество единиц товара в коробке.  Используйте это поле, если в коробке поедут целые товары, не разделенные на части. Не используйте это поле одновременно с `partialCount`. integer [optional]
#' @field partialCount  \link{OrderBoxLayoutPartialCountDTO} [optional]
#' @field instances Переданные вами коды маркировки. list(\link{BriefOrderItemInstanceDTO}) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
OrderBoxLayoutItemDTO <- R6::R6Class(
  "OrderBoxLayoutItemDTO",
  public = list(
    `id` = NULL,
    `fullCount` = NULL,
    `partialCount` = NULL,
    `instances` = NULL,
    #' Initialize a new OrderBoxLayoutItemDTO class.
    #'
    #' @description
    #' Initialize a new OrderBoxLayoutItemDTO class.
    #'
    #' @param id Идентификатор товара в заказе.  {\% cut \"Где его взять\" \%}  Идентификатор приходит в ответе на запрос [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md) и в запросе Маркета [POST order/accept](../../pushapi/reference/orderAccept.md) — параметр `id` в `items`.  {\% endcut \%}  
    #' @param fullCount Количество единиц товара в коробке.  Используйте это поле, если в коробке поедут целые товары, не разделенные на части. Не используйте это поле одновременно с `partialCount`.
    #' @param partialCount partialCount
    #' @param instances Переданные вами коды маркировки.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`id`, `fullCount` = NULL, `partialCount` = NULL, `instances` = NULL, ...) {
      if (!missing(`id`)) {
        if (!(is.numeric(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be an integer:", `id`))
        }
        self$`id` <- `id`
      }
      if (!is.null(`fullCount`)) {
        if (!(is.numeric(`fullCount`) && length(`fullCount`) == 1)) {
          stop(paste("Error! Invalid data for `fullCount`. Must be an integer:", `fullCount`))
        }
        self$`fullCount` <- `fullCount`
      }
      if (!is.null(`partialCount`)) {
        stopifnot(R6::is.R6(`partialCount`))
        self$`partialCount` <- `partialCount`
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
    #' @return OrderBoxLayoutItemDTO in JSON format
    #' @export
    toJSON = function() {
      OrderBoxLayoutItemDTOObject <- list()
      if (!is.null(self$`id`)) {
        OrderBoxLayoutItemDTOObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`fullCount`)) {
        OrderBoxLayoutItemDTOObject[["fullCount"]] <-
          self$`fullCount`
      }
      if (!is.null(self$`partialCount`)) {
        OrderBoxLayoutItemDTOObject[["partialCount"]] <-
          self$`partialCount`$toJSON()
      }
      if (!is.null(self$`instances`)) {
        OrderBoxLayoutItemDTOObject[["instances"]] <-
          lapply(self$`instances`, function(x) x$toJSON())
      }
      OrderBoxLayoutItemDTOObject
    },
    #' Deserialize JSON string into an instance of OrderBoxLayoutItemDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of OrderBoxLayoutItemDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of OrderBoxLayoutItemDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`fullCount`)) {
        self$`fullCount` <- this_object$`fullCount`
      }
      if (!is.null(this_object$`partialCount`)) {
        `partialcount_object` <- OrderBoxLayoutPartialCountDTO$new()
        `partialcount_object`$fromJSON(jsonlite::toJSON(this_object$`partialCount`, auto_unbox = TRUE, digits = NA))
        self$`partialCount` <- `partialcount_object`
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
    #' @return OrderBoxLayoutItemDTO in JSON format
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
        if (!is.null(self$`fullCount`)) {
          sprintf(
          '"fullCount":
            %d
                    ',
          self$`fullCount`
          )
        },
        if (!is.null(self$`partialCount`)) {
          sprintf(
          '"partialCount":
          %s
          ',
          jsonlite::toJSON(self$`partialCount`$toJSON(), auto_unbox = TRUE, digits = NA)
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
    #' Deserialize JSON string into an instance of OrderBoxLayoutItemDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of OrderBoxLayoutItemDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of OrderBoxLayoutItemDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`id` <- this_object$`id`
      self$`fullCount` <- this_object$`fullCount`
      self$`partialCount` <- OrderBoxLayoutPartialCountDTO$new()$fromJSON(jsonlite::toJSON(this_object$`partialCount`, auto_unbox = TRUE, digits = NA))
      self$`instances` <- ApiClient$new()$deserializeObj(this_object$`instances`, "array[BriefOrderItemInstanceDTO]", loadNamespace("ympa_r_client"))
      self
    },
    #' Validate JSON input with respect to OrderBoxLayoutItemDTO
    #'
    #' @description
    #' Validate JSON input with respect to OrderBoxLayoutItemDTO and throw an exception if invalid
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
        stop(paste("The JSON input `", input, "` is invalid for OrderBoxLayoutItemDTO: the required field `id` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of OrderBoxLayoutItemDTO
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

      if (self$`fullCount` < 1) {
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

      if (self$`fullCount` < 1) {
        invalid_fields["fullCount"] <- "Invalid value for `fullCount`, must be bigger than or equal to 1."
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
# OrderBoxLayoutItemDTO$unlock()
#
## Below is an example to define the print function
# OrderBoxLayoutItemDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# OrderBoxLayoutItemDTO$lock()

