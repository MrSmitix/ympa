#' Create a new OrderItemInstanceModificationDTO
#'
#' @description
#' Позиция в корзине, требующая маркировки.
#'
#' @docType class
#' @title OrderItemInstanceModificationDTO
#' @description OrderItemInstanceModificationDTO Class
#' @format An \code{R6Class} generator object
#' @field id Идентификатор товара в заказе.  Он приходит в ответе на запрос [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md) и в запросе Маркета [POST order/accept](../../pushapi/reference/orderAccept.md) — параметр `id` в `items`. integer
#' @field instances Список кодов маркировки единиц товара. list(\link{BriefOrderItemInstanceDTO})
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
OrderItemInstanceModificationDTO <- R6::R6Class(
  "OrderItemInstanceModificationDTO",
  public = list(
    `id` = NULL,
    `instances` = NULL,
    #' Initialize a new OrderItemInstanceModificationDTO class.
    #'
    #' @description
    #' Initialize a new OrderItemInstanceModificationDTO class.
    #'
    #' @param id Идентификатор товара в заказе.  Он приходит в ответе на запрос [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md) и в запросе Маркета [POST order/accept](../../pushapi/reference/orderAccept.md) — параметр `id` в `items`.
    #' @param instances Список кодов маркировки единиц товара.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`id`, `instances`, ...) {
      if (!missing(`id`)) {
        if (!(is.numeric(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be an integer:", `id`))
        }
        self$`id` <- `id`
      }
      if (!missing(`instances`)) {
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
    #' @return OrderItemInstanceModificationDTO in JSON format
    #' @export
    toJSON = function() {
      OrderItemInstanceModificationDTOObject <- list()
      if (!is.null(self$`id`)) {
        OrderItemInstanceModificationDTOObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`instances`)) {
        OrderItemInstanceModificationDTOObject[["instances"]] <-
          lapply(self$`instances`, function(x) x$toJSON())
      }
      OrderItemInstanceModificationDTOObject
    },
    #' Deserialize JSON string into an instance of OrderItemInstanceModificationDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of OrderItemInstanceModificationDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of OrderItemInstanceModificationDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
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
    #' @return OrderItemInstanceModificationDTO in JSON format
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
    #' Deserialize JSON string into an instance of OrderItemInstanceModificationDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of OrderItemInstanceModificationDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of OrderItemInstanceModificationDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`id` <- this_object$`id`
      self$`instances` <- ApiClient$new()$deserializeObj(this_object$`instances`, "array[BriefOrderItemInstanceDTO]", loadNamespace("ympa_r_client"))
      self
    },
    #' Validate JSON input with respect to OrderItemInstanceModificationDTO
    #'
    #' @description
    #' Validate JSON input with respect to OrderItemInstanceModificationDTO and throw an exception if invalid
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
        stop(paste("The JSON input `", input, "` is invalid for OrderItemInstanceModificationDTO: the required field `id` is missing."))
      }
      # check the required field `instances`
      if (!is.null(input_json$`instances`)) {
        stopifnot(is.vector(input_json$`instances`), length(input_json$`instances`) != 0)
        tmp <- sapply(input_json$`instances`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for OrderItemInstanceModificationDTO: the required field `instances` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of OrderItemInstanceModificationDTO
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

      # check if the required `instances` is null
      if (is.null(self$`instances`)) {
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

      # check if the required `instances` is null
      if (is.null(self$`instances`)) {
        invalid_fields["instances"] <- "Non-nullable required field `instances` cannot be null."
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
# OrderItemInstanceModificationDTO$unlock()
#
## Below is an example to define the print function
# OrderItemInstanceModificationDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# OrderItemInstanceModificationDTO$lock()

