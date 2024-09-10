#' Create a new OrdersStatsOrderDTO
#'
#' @description
#' Информация о заказе.
#'
#' @docType class
#' @title OrdersStatsOrderDTO
#' @description OrdersStatsOrderDTO Class
#' @format An \code{R6Class} generator object
#' @field id Идентификатор заказа. integer [optional]
#' @field creationDate Дата создания заказа.  Формат даты: `ГГГГ-ММ-ДД`. character [optional]
#' @field statusUpdateDate Дата и время, когда статус заказа был изменен в последний раз.  Формат даты и времени: ISO 8601. Например, `2017-11-21T00:00:00`. Часовой пояс — UTC+03:00 (Москва). character [optional]
#' @field status  \link{OrderStatsStatusType} [optional]
#' @field partnerOrderId Идентификатор заказа в информационной системе магазина. character [optional]
#' @field paymentType  \link{OrdersStatsOrderPaymentType} [optional]
#' @field fake Тип заказа:  * `false` — настоящий заказ покупателя.  * `true` — [тестовый](../../pushapi/concepts/sandbox.md) заказ Маркета. character [optional]
#' @field deliveryRegion  \link{OrdersStatsDeliveryRegionDTO} [optional]
#' @field items Список товаров в заказе после возможных изменений. list(\link{OrdersStatsItemDTO})
#' @field initialItems Список товаров в заказе до изменений. list(\link{OrdersStatsItemDTO}) [optional]
#' @field payments Информация о денежных переводах по заказу. list(\link{OrdersStatsPaymentDTO})
#' @field commissions Информация о комиссиях за заказ. list(\link{OrdersStatsCommissionDTO})
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
OrdersStatsOrderDTO <- R6::R6Class(
  "OrdersStatsOrderDTO",
  public = list(
    `id` = NULL,
    `creationDate` = NULL,
    `statusUpdateDate` = NULL,
    `status` = NULL,
    `partnerOrderId` = NULL,
    `paymentType` = NULL,
    `fake` = NULL,
    `deliveryRegion` = NULL,
    `items` = NULL,
    `initialItems` = NULL,
    `payments` = NULL,
    `commissions` = NULL,
    #' Initialize a new OrdersStatsOrderDTO class.
    #'
    #' @description
    #' Initialize a new OrdersStatsOrderDTO class.
    #'
    #' @param items Список товаров в заказе после возможных изменений.
    #' @param payments Информация о денежных переводах по заказу.
    #' @param commissions Информация о комиссиях за заказ.
    #' @param id Идентификатор заказа.
    #' @param creationDate Дата создания заказа.  Формат даты: `ГГГГ-ММ-ДД`.
    #' @param statusUpdateDate Дата и время, когда статус заказа был изменен в последний раз.  Формат даты и времени: ISO 8601. Например, `2017-11-21T00:00:00`. Часовой пояс — UTC+03:00 (Москва).
    #' @param status status
    #' @param partnerOrderId Идентификатор заказа в информационной системе магазина.
    #' @param paymentType paymentType
    #' @param fake Тип заказа:  * `false` — настоящий заказ покупателя.  * `true` — [тестовый](../../pushapi/concepts/sandbox.md) заказ Маркета.
    #' @param deliveryRegion deliveryRegion
    #' @param initialItems Список товаров в заказе до изменений.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`items`, `payments`, `commissions`, `id` = NULL, `creationDate` = NULL, `statusUpdateDate` = NULL, `status` = NULL, `partnerOrderId` = NULL, `paymentType` = NULL, `fake` = NULL, `deliveryRegion` = NULL, `initialItems` = NULL, ...) {
      if (!missing(`items`)) {
        stopifnot(is.vector(`items`), length(`items`) != 0)
        sapply(`items`, function(x) stopifnot(R6::is.R6(x)))
        self$`items` <- `items`
      }
      if (!missing(`payments`)) {
        stopifnot(is.vector(`payments`), length(`payments`) != 0)
        sapply(`payments`, function(x) stopifnot(R6::is.R6(x)))
        self$`payments` <- `payments`
      }
      if (!missing(`commissions`)) {
        stopifnot(is.vector(`commissions`), length(`commissions`) != 0)
        sapply(`commissions`, function(x) stopifnot(R6::is.R6(x)))
        self$`commissions` <- `commissions`
      }
      if (!is.null(`id`)) {
        if (!(is.numeric(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be an integer:", `id`))
        }
        self$`id` <- `id`
      }
      if (!is.null(`creationDate`)) {
        if (!is.character(`creationDate`)) {
          stop(paste("Error! Invalid data for `creationDate`. Must be a string:", `creationDate`))
        }
        self$`creationDate` <- `creationDate`
      }
      if (!is.null(`statusUpdateDate`)) {
        if (!is.character(`statusUpdateDate`)) {
          stop(paste("Error! Invalid data for `statusUpdateDate`. Must be a string:", `statusUpdateDate`))
        }
        self$`statusUpdateDate` <- `statusUpdateDate`
      }
      if (!is.null(`status`)) {
        if (!(`status` %in% c())) {
          stop(paste("Error! \"", `status`, "\" cannot be assigned to `status`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`status`))
        self$`status` <- `status`
      }
      if (!is.null(`partnerOrderId`)) {
        if (!(is.character(`partnerOrderId`) && length(`partnerOrderId`) == 1)) {
          stop(paste("Error! Invalid data for `partnerOrderId`. Must be a string:", `partnerOrderId`))
        }
        self$`partnerOrderId` <- `partnerOrderId`
      }
      if (!is.null(`paymentType`)) {
        if (!(`paymentType` %in% c())) {
          stop(paste("Error! \"", `paymentType`, "\" cannot be assigned to `paymentType`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`paymentType`))
        self$`paymentType` <- `paymentType`
      }
      if (!is.null(`fake`)) {
        if (!(is.logical(`fake`) && length(`fake`) == 1)) {
          stop(paste("Error! Invalid data for `fake`. Must be a boolean:", `fake`))
        }
        self$`fake` <- `fake`
      }
      if (!is.null(`deliveryRegion`)) {
        stopifnot(R6::is.R6(`deliveryRegion`))
        self$`deliveryRegion` <- `deliveryRegion`
      }
      if (!is.null(`initialItems`)) {
        stopifnot(is.vector(`initialItems`), length(`initialItems`) != 0)
        sapply(`initialItems`, function(x) stopifnot(R6::is.R6(x)))
        self$`initialItems` <- `initialItems`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return OrdersStatsOrderDTO in JSON format
    #' @export
    toJSON = function() {
      OrdersStatsOrderDTOObject <- list()
      if (!is.null(self$`id`)) {
        OrdersStatsOrderDTOObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`creationDate`)) {
        OrdersStatsOrderDTOObject[["creationDate"]] <-
          self$`creationDate`
      }
      if (!is.null(self$`statusUpdateDate`)) {
        OrdersStatsOrderDTOObject[["statusUpdateDate"]] <-
          self$`statusUpdateDate`
      }
      if (!is.null(self$`status`)) {
        OrdersStatsOrderDTOObject[["status"]] <-
          self$`status`$toJSON()
      }
      if (!is.null(self$`partnerOrderId`)) {
        OrdersStatsOrderDTOObject[["partnerOrderId"]] <-
          self$`partnerOrderId`
      }
      if (!is.null(self$`paymentType`)) {
        OrdersStatsOrderDTOObject[["paymentType"]] <-
          self$`paymentType`$toJSON()
      }
      if (!is.null(self$`fake`)) {
        OrdersStatsOrderDTOObject[["fake"]] <-
          self$`fake`
      }
      if (!is.null(self$`deliveryRegion`)) {
        OrdersStatsOrderDTOObject[["deliveryRegion"]] <-
          self$`deliveryRegion`$toJSON()
      }
      if (!is.null(self$`items`)) {
        OrdersStatsOrderDTOObject[["items"]] <-
          lapply(self$`items`, function(x) x$toJSON())
      }
      if (!is.null(self$`initialItems`)) {
        OrdersStatsOrderDTOObject[["initialItems"]] <-
          lapply(self$`initialItems`, function(x) x$toJSON())
      }
      if (!is.null(self$`payments`)) {
        OrdersStatsOrderDTOObject[["payments"]] <-
          lapply(self$`payments`, function(x) x$toJSON())
      }
      if (!is.null(self$`commissions`)) {
        OrdersStatsOrderDTOObject[["commissions"]] <-
          lapply(self$`commissions`, function(x) x$toJSON())
      }
      OrdersStatsOrderDTOObject
    },
    #' Deserialize JSON string into an instance of OrdersStatsOrderDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of OrdersStatsOrderDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of OrdersStatsOrderDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`creationDate`)) {
        self$`creationDate` <- this_object$`creationDate`
      }
      if (!is.null(this_object$`statusUpdateDate`)) {
        self$`statusUpdateDate` <- this_object$`statusUpdateDate`
      }
      if (!is.null(this_object$`status`)) {
        `status_object` <- OrderStatsStatusType$new()
        `status_object`$fromJSON(jsonlite::toJSON(this_object$`status`, auto_unbox = TRUE, digits = NA))
        self$`status` <- `status_object`
      }
      if (!is.null(this_object$`partnerOrderId`)) {
        self$`partnerOrderId` <- this_object$`partnerOrderId`
      }
      if (!is.null(this_object$`paymentType`)) {
        `paymenttype_object` <- OrdersStatsOrderPaymentType$new()
        `paymenttype_object`$fromJSON(jsonlite::toJSON(this_object$`paymentType`, auto_unbox = TRUE, digits = NA))
        self$`paymentType` <- `paymenttype_object`
      }
      if (!is.null(this_object$`fake`)) {
        self$`fake` <- this_object$`fake`
      }
      if (!is.null(this_object$`deliveryRegion`)) {
        `deliveryregion_object` <- OrdersStatsDeliveryRegionDTO$new()
        `deliveryregion_object`$fromJSON(jsonlite::toJSON(this_object$`deliveryRegion`, auto_unbox = TRUE, digits = NA))
        self$`deliveryRegion` <- `deliveryregion_object`
      }
      if (!is.null(this_object$`items`)) {
        self$`items` <- ApiClient$new()$deserializeObj(this_object$`items`, "array[OrdersStatsItemDTO]", loadNamespace("ympa_r_client"))
      }
      if (!is.null(this_object$`initialItems`)) {
        self$`initialItems` <- ApiClient$new()$deserializeObj(this_object$`initialItems`, "array[OrdersStatsItemDTO]", loadNamespace("ympa_r_client"))
      }
      if (!is.null(this_object$`payments`)) {
        self$`payments` <- ApiClient$new()$deserializeObj(this_object$`payments`, "array[OrdersStatsPaymentDTO]", loadNamespace("ympa_r_client"))
      }
      if (!is.null(this_object$`commissions`)) {
        self$`commissions` <- ApiClient$new()$deserializeObj(this_object$`commissions`, "array[OrdersStatsCommissionDTO]", loadNamespace("ympa_r_client"))
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return OrdersStatsOrderDTO in JSON format
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
        if (!is.null(self$`creationDate`)) {
          sprintf(
          '"creationDate":
            "%s"
                    ',
          self$`creationDate`
          )
        },
        if (!is.null(self$`statusUpdateDate`)) {
          sprintf(
          '"statusUpdateDate":
            "%s"
                    ',
          self$`statusUpdateDate`
          )
        },
        if (!is.null(self$`status`)) {
          sprintf(
          '"status":
          %s
          ',
          jsonlite::toJSON(self$`status`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`partnerOrderId`)) {
          sprintf(
          '"partnerOrderId":
            "%s"
                    ',
          self$`partnerOrderId`
          )
        },
        if (!is.null(self$`paymentType`)) {
          sprintf(
          '"paymentType":
          %s
          ',
          jsonlite::toJSON(self$`paymentType`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`fake`)) {
          sprintf(
          '"fake":
            %s
                    ',
          tolower(self$`fake`)
          )
        },
        if (!is.null(self$`deliveryRegion`)) {
          sprintf(
          '"deliveryRegion":
          %s
          ',
          jsonlite::toJSON(self$`deliveryRegion`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`items`)) {
          sprintf(
          '"items":
          [%s]
',
          paste(sapply(self$`items`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        },
        if (!is.null(self$`initialItems`)) {
          sprintf(
          '"initialItems":
          [%s]
',
          paste(sapply(self$`initialItems`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        },
        if (!is.null(self$`payments`)) {
          sprintf(
          '"payments":
          [%s]
',
          paste(sapply(self$`payments`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        },
        if (!is.null(self$`commissions`)) {
          sprintf(
          '"commissions":
          [%s]
',
          paste(sapply(self$`commissions`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of OrdersStatsOrderDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of OrdersStatsOrderDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of OrdersStatsOrderDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`id` <- this_object$`id`
      self$`creationDate` <- this_object$`creationDate`
      self$`statusUpdateDate` <- this_object$`statusUpdateDate`
      self$`status` <- OrderStatsStatusType$new()$fromJSON(jsonlite::toJSON(this_object$`status`, auto_unbox = TRUE, digits = NA))
      self$`partnerOrderId` <- this_object$`partnerOrderId`
      self$`paymentType` <- OrdersStatsOrderPaymentType$new()$fromJSON(jsonlite::toJSON(this_object$`paymentType`, auto_unbox = TRUE, digits = NA))
      self$`fake` <- this_object$`fake`
      self$`deliveryRegion` <- OrdersStatsDeliveryRegionDTO$new()$fromJSON(jsonlite::toJSON(this_object$`deliveryRegion`, auto_unbox = TRUE, digits = NA))
      self$`items` <- ApiClient$new()$deserializeObj(this_object$`items`, "array[OrdersStatsItemDTO]", loadNamespace("ympa_r_client"))
      self$`initialItems` <- ApiClient$new()$deserializeObj(this_object$`initialItems`, "array[OrdersStatsItemDTO]", loadNamespace("ympa_r_client"))
      self$`payments` <- ApiClient$new()$deserializeObj(this_object$`payments`, "array[OrdersStatsPaymentDTO]", loadNamespace("ympa_r_client"))
      self$`commissions` <- ApiClient$new()$deserializeObj(this_object$`commissions`, "array[OrdersStatsCommissionDTO]", loadNamespace("ympa_r_client"))
      self
    },
    #' Validate JSON input with respect to OrdersStatsOrderDTO
    #'
    #' @description
    #' Validate JSON input with respect to OrdersStatsOrderDTO and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `items`
      if (!is.null(input_json$`items`)) {
        stopifnot(is.vector(input_json$`items`), length(input_json$`items`) != 0)
        tmp <- sapply(input_json$`items`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for OrdersStatsOrderDTO: the required field `items` is missing."))
      }
      # check the required field `payments`
      if (!is.null(input_json$`payments`)) {
        stopifnot(is.vector(input_json$`payments`), length(input_json$`payments`) != 0)
        tmp <- sapply(input_json$`payments`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for OrdersStatsOrderDTO: the required field `payments` is missing."))
      }
      # check the required field `commissions`
      if (!is.null(input_json$`commissions`)) {
        stopifnot(is.vector(input_json$`commissions`), length(input_json$`commissions`) != 0)
        tmp <- sapply(input_json$`commissions`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for OrdersStatsOrderDTO: the required field `commissions` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of OrdersStatsOrderDTO
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
      # check if the required `items` is null
      if (is.null(self$`items`)) {
        return(FALSE)
      }

      # check if the required `payments` is null
      if (is.null(self$`payments`)) {
        return(FALSE)
      }

      # check if the required `commissions` is null
      if (is.null(self$`commissions`)) {
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
      # check if the required `items` is null
      if (is.null(self$`items`)) {
        invalid_fields["items"] <- "Non-nullable required field `items` cannot be null."
      }

      # check if the required `payments` is null
      if (is.null(self$`payments`)) {
        invalid_fields["payments"] <- "Non-nullable required field `payments` cannot be null."
      }

      # check if the required `commissions` is null
      if (is.null(self$`commissions`)) {
        invalid_fields["commissions"] <- "Non-nullable required field `commissions` cannot be null."
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
# OrdersStatsOrderDTO$unlock()
#
## Below is an example to define the print function
# OrdersStatsOrderDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# OrdersStatsOrderDTO$lock()

