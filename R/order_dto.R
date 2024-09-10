#' Create a new OrderDTO
#'
#' @description
#' Заказ.
#'
#' @docType class
#' @title OrderDTO
#' @description OrderDTO Class
#' @format An \code{R6Class} generator object
#' @field id Идентификатор заказа. integer [optional]
#' @field status  \link{OrderStatusType} [optional]
#' @field substatus  \link{OrderSubstatusType} [optional]
#' @field creationDate  character [optional]
#' @field updatedAt  character [optional]
#' @field currency  \link{CurrencyType} [optional]
#' @field itemsTotal Платеж покупателя. numeric [optional]
#' @field deliveryTotal Стоимость доставки. numeric [optional]
#' @field buyerItemsTotal {\% note warning \"\" \%}  Этот параметр устарел.  {\% endnote \%}  Стоимость всех товаров в заказе в валюте покупателя после применения скидок и без учета стоимости доставки. numeric [optional]
#' @field buyerTotal {\% note warning \"\" \%}  Этот параметр устарел.  {\% endnote \%}  Стоимость всех товаров в заказе в валюте покупателя после применения скидок и с учетом стоимости доставки. numeric [optional]
#' @field buyerItemsTotalBeforeDiscount Стоимость всех товаров в заказе в валюте покупателя без учета стоимости доставки и до применения скидок по:  * акциям; * купонам; * промокодам. numeric [optional]
#' @field buyerTotalBeforeDiscount {\% note warning \"\" \%}  Этот параметр устарел.  {\% endnote \%}  Стоимость всех товаров в заказе в валюте покупателя до применения скидок и с учетом стоимости доставки (`buyerItemsTotalBeforeDiscount` + стоимость доставки). numeric [optional]
#' @field paymentType  \link{OrderPaymentType} [optional]
#' @field paymentMethod  \link{OrderPaymentMethodType} [optional]
#' @field fake Тип заказа:  * `false` — настоящий заказ покупателя.  * `true` — [тестовый](../../pushapi/concepts/sandbox.md) заказ Маркета. character [optional]
#' @field items Список товаров в заказе. list(\link{OrderItemDTO})
#' @field subsidies Список субсидий по типам. list(\link{OrderSubsidyDTO}) [optional]
#' @field delivery  \link{OrderDeliveryDTO} [optional]
#' @field buyer  \link{OrderBuyerDTO} [optional]
#' @field notes Комментарий к заказу. character [optional]
#' @field taxSystem  \link{OrderTaxSystemType} [optional]
#' @field cancelRequested **Только для модели DBS**  Запрошена ли отмена. character [optional]
#' @field expiryDate  character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
OrderDTO <- R6::R6Class(
  "OrderDTO",
  public = list(
    `id` = NULL,
    `status` = NULL,
    `substatus` = NULL,
    `creationDate` = NULL,
    `updatedAt` = NULL,
    `currency` = NULL,
    `itemsTotal` = NULL,
    `deliveryTotal` = NULL,
    `buyerItemsTotal` = NULL,
    `buyerTotal` = NULL,
    `buyerItemsTotalBeforeDiscount` = NULL,
    `buyerTotalBeforeDiscount` = NULL,
    `paymentType` = NULL,
    `paymentMethod` = NULL,
    `fake` = NULL,
    `items` = NULL,
    `subsidies` = NULL,
    `delivery` = NULL,
    `buyer` = NULL,
    `notes` = NULL,
    `taxSystem` = NULL,
    `cancelRequested` = NULL,
    `expiryDate` = NULL,
    #' Initialize a new OrderDTO class.
    #'
    #' @description
    #' Initialize a new OrderDTO class.
    #'
    #' @param items Список товаров в заказе.
    #' @param id Идентификатор заказа.
    #' @param status status
    #' @param substatus substatus
    #' @param creationDate creationDate
    #' @param updatedAt updatedAt
    #' @param currency currency
    #' @param itemsTotal Платеж покупателя.
    #' @param deliveryTotal Стоимость доставки.
    #' @param buyerItemsTotal {\% note warning \"\" \%}  Этот параметр устарел.  {\% endnote \%}  Стоимость всех товаров в заказе в валюте покупателя после применения скидок и без учета стоимости доставки.
    #' @param buyerTotal {\% note warning \"\" \%}  Этот параметр устарел.  {\% endnote \%}  Стоимость всех товаров в заказе в валюте покупателя после применения скидок и с учетом стоимости доставки.
    #' @param buyerItemsTotalBeforeDiscount Стоимость всех товаров в заказе в валюте покупателя без учета стоимости доставки и до применения скидок по:  * акциям; * купонам; * промокодам.
    #' @param buyerTotalBeforeDiscount {\% note warning \"\" \%}  Этот параметр устарел.  {\% endnote \%}  Стоимость всех товаров в заказе в валюте покупателя до применения скидок и с учетом стоимости доставки (`buyerItemsTotalBeforeDiscount` + стоимость доставки).
    #' @param paymentType paymentType
    #' @param paymentMethod paymentMethod
    #' @param fake Тип заказа:  * `false` — настоящий заказ покупателя.  * `true` — [тестовый](../../pushapi/concepts/sandbox.md) заказ Маркета.
    #' @param subsidies Список субсидий по типам.
    #' @param delivery delivery
    #' @param buyer buyer
    #' @param notes Комментарий к заказу.
    #' @param taxSystem taxSystem
    #' @param cancelRequested **Только для модели DBS**  Запрошена ли отмена.
    #' @param expiryDate expiryDate
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`items`, `id` = NULL, `status` = NULL, `substatus` = NULL, `creationDate` = NULL, `updatedAt` = NULL, `currency` = NULL, `itemsTotal` = NULL, `deliveryTotal` = NULL, `buyerItemsTotal` = NULL, `buyerTotal` = NULL, `buyerItemsTotalBeforeDiscount` = NULL, `buyerTotalBeforeDiscount` = NULL, `paymentType` = NULL, `paymentMethod` = NULL, `fake` = NULL, `subsidies` = NULL, `delivery` = NULL, `buyer` = NULL, `notes` = NULL, `taxSystem` = NULL, `cancelRequested` = NULL, `expiryDate` = NULL, ...) {
      if (!missing(`items`)) {
        stopifnot(is.vector(`items`), length(`items`) != 0)
        sapply(`items`, function(x) stopifnot(R6::is.R6(x)))
        self$`items` <- `items`
      }
      if (!is.null(`id`)) {
        if (!(is.numeric(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be an integer:", `id`))
        }
        self$`id` <- `id`
      }
      if (!is.null(`status`)) {
        if (!(`status` %in% c())) {
          stop(paste("Error! \"", `status`, "\" cannot be assigned to `status`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`status`))
        self$`status` <- `status`
      }
      if (!is.null(`substatus`)) {
        if (!(`substatus` %in% c())) {
          stop(paste("Error! \"", `substatus`, "\" cannot be assigned to `substatus`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`substatus`))
        self$`substatus` <- `substatus`
      }
      if (!is.null(`creationDate`)) {
        if (!(is.character(`creationDate`) && length(`creationDate`) == 1)) {
          stop(paste("Error! Invalid data for `creationDate`. Must be a string:", `creationDate`))
        }
        self$`creationDate` <- `creationDate`
      }
      if (!is.null(`updatedAt`)) {
        if (!(is.character(`updatedAt`) && length(`updatedAt`) == 1)) {
          stop(paste("Error! Invalid data for `updatedAt`. Must be a string:", `updatedAt`))
        }
        self$`updatedAt` <- `updatedAt`
      }
      if (!is.null(`currency`)) {
        if (!(`currency` %in% c())) {
          stop(paste("Error! \"", `currency`, "\" cannot be assigned to `currency`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`currency`))
        self$`currency` <- `currency`
      }
      if (!is.null(`itemsTotal`)) {
        self$`itemsTotal` <- `itemsTotal`
      }
      if (!is.null(`deliveryTotal`)) {
        self$`deliveryTotal` <- `deliveryTotal`
      }
      if (!is.null(`buyerItemsTotal`)) {
        self$`buyerItemsTotal` <- `buyerItemsTotal`
      }
      if (!is.null(`buyerTotal`)) {
        self$`buyerTotal` <- `buyerTotal`
      }
      if (!is.null(`buyerItemsTotalBeforeDiscount`)) {
        self$`buyerItemsTotalBeforeDiscount` <- `buyerItemsTotalBeforeDiscount`
      }
      if (!is.null(`buyerTotalBeforeDiscount`)) {
        self$`buyerTotalBeforeDiscount` <- `buyerTotalBeforeDiscount`
      }
      if (!is.null(`paymentType`)) {
        if (!(`paymentType` %in% c())) {
          stop(paste("Error! \"", `paymentType`, "\" cannot be assigned to `paymentType`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`paymentType`))
        self$`paymentType` <- `paymentType`
      }
      if (!is.null(`paymentMethod`)) {
        if (!(`paymentMethod` %in% c())) {
          stop(paste("Error! \"", `paymentMethod`, "\" cannot be assigned to `paymentMethod`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`paymentMethod`))
        self$`paymentMethod` <- `paymentMethod`
      }
      if (!is.null(`fake`)) {
        if (!(is.logical(`fake`) && length(`fake`) == 1)) {
          stop(paste("Error! Invalid data for `fake`. Must be a boolean:", `fake`))
        }
        self$`fake` <- `fake`
      }
      if (!is.null(`subsidies`)) {
        stopifnot(is.vector(`subsidies`), length(`subsidies`) != 0)
        sapply(`subsidies`, function(x) stopifnot(R6::is.R6(x)))
        self$`subsidies` <- `subsidies`
      }
      if (!is.null(`delivery`)) {
        stopifnot(R6::is.R6(`delivery`))
        self$`delivery` <- `delivery`
      }
      if (!is.null(`buyer`)) {
        stopifnot(R6::is.R6(`buyer`))
        self$`buyer` <- `buyer`
      }
      if (!is.null(`notes`)) {
        if (!(is.character(`notes`) && length(`notes`) == 1)) {
          stop(paste("Error! Invalid data for `notes`. Must be a string:", `notes`))
        }
        self$`notes` <- `notes`
      }
      if (!is.null(`taxSystem`)) {
        if (!(`taxSystem` %in% c())) {
          stop(paste("Error! \"", `taxSystem`, "\" cannot be assigned to `taxSystem`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`taxSystem`))
        self$`taxSystem` <- `taxSystem`
      }
      if (!is.null(`cancelRequested`)) {
        if (!(is.logical(`cancelRequested`) && length(`cancelRequested`) == 1)) {
          stop(paste("Error! Invalid data for `cancelRequested`. Must be a boolean:", `cancelRequested`))
        }
        self$`cancelRequested` <- `cancelRequested`
      }
      if (!is.null(`expiryDate`)) {
        if (!(is.character(`expiryDate`) && length(`expiryDate`) == 1)) {
          stop(paste("Error! Invalid data for `expiryDate`. Must be a string:", `expiryDate`))
        }
        self$`expiryDate` <- `expiryDate`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return OrderDTO in JSON format
    #' @export
    toJSON = function() {
      OrderDTOObject <- list()
      if (!is.null(self$`id`)) {
        OrderDTOObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`status`)) {
        OrderDTOObject[["status"]] <-
          self$`status`$toJSON()
      }
      if (!is.null(self$`substatus`)) {
        OrderDTOObject[["substatus"]] <-
          self$`substatus`$toJSON()
      }
      if (!is.null(self$`creationDate`)) {
        OrderDTOObject[["creationDate"]] <-
          self$`creationDate`
      }
      if (!is.null(self$`updatedAt`)) {
        OrderDTOObject[["updatedAt"]] <-
          self$`updatedAt`
      }
      if (!is.null(self$`currency`)) {
        OrderDTOObject[["currency"]] <-
          self$`currency`$toJSON()
      }
      if (!is.null(self$`itemsTotal`)) {
        OrderDTOObject[["itemsTotal"]] <-
          self$`itemsTotal`
      }
      if (!is.null(self$`deliveryTotal`)) {
        OrderDTOObject[["deliveryTotal"]] <-
          self$`deliveryTotal`
      }
      if (!is.null(self$`buyerItemsTotal`)) {
        OrderDTOObject[["buyerItemsTotal"]] <-
          self$`buyerItemsTotal`
      }
      if (!is.null(self$`buyerTotal`)) {
        OrderDTOObject[["buyerTotal"]] <-
          self$`buyerTotal`
      }
      if (!is.null(self$`buyerItemsTotalBeforeDiscount`)) {
        OrderDTOObject[["buyerItemsTotalBeforeDiscount"]] <-
          self$`buyerItemsTotalBeforeDiscount`
      }
      if (!is.null(self$`buyerTotalBeforeDiscount`)) {
        OrderDTOObject[["buyerTotalBeforeDiscount"]] <-
          self$`buyerTotalBeforeDiscount`
      }
      if (!is.null(self$`paymentType`)) {
        OrderDTOObject[["paymentType"]] <-
          self$`paymentType`$toJSON()
      }
      if (!is.null(self$`paymentMethod`)) {
        OrderDTOObject[["paymentMethod"]] <-
          self$`paymentMethod`$toJSON()
      }
      if (!is.null(self$`fake`)) {
        OrderDTOObject[["fake"]] <-
          self$`fake`
      }
      if (!is.null(self$`items`)) {
        OrderDTOObject[["items"]] <-
          lapply(self$`items`, function(x) x$toJSON())
      }
      if (!is.null(self$`subsidies`)) {
        OrderDTOObject[["subsidies"]] <-
          lapply(self$`subsidies`, function(x) x$toJSON())
      }
      if (!is.null(self$`delivery`)) {
        OrderDTOObject[["delivery"]] <-
          self$`delivery`$toJSON()
      }
      if (!is.null(self$`buyer`)) {
        OrderDTOObject[["buyer"]] <-
          self$`buyer`$toJSON()
      }
      if (!is.null(self$`notes`)) {
        OrderDTOObject[["notes"]] <-
          self$`notes`
      }
      if (!is.null(self$`taxSystem`)) {
        OrderDTOObject[["taxSystem"]] <-
          self$`taxSystem`$toJSON()
      }
      if (!is.null(self$`cancelRequested`)) {
        OrderDTOObject[["cancelRequested"]] <-
          self$`cancelRequested`
      }
      if (!is.null(self$`expiryDate`)) {
        OrderDTOObject[["expiryDate"]] <-
          self$`expiryDate`
      }
      OrderDTOObject
    },
    #' Deserialize JSON string into an instance of OrderDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of OrderDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of OrderDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`status`)) {
        `status_object` <- OrderStatusType$new()
        `status_object`$fromJSON(jsonlite::toJSON(this_object$`status`, auto_unbox = TRUE, digits = NA))
        self$`status` <- `status_object`
      }
      if (!is.null(this_object$`substatus`)) {
        `substatus_object` <- OrderSubstatusType$new()
        `substatus_object`$fromJSON(jsonlite::toJSON(this_object$`substatus`, auto_unbox = TRUE, digits = NA))
        self$`substatus` <- `substatus_object`
      }
      if (!is.null(this_object$`creationDate`)) {
        self$`creationDate` <- this_object$`creationDate`
      }
      if (!is.null(this_object$`updatedAt`)) {
        self$`updatedAt` <- this_object$`updatedAt`
      }
      if (!is.null(this_object$`currency`)) {
        `currency_object` <- CurrencyType$new()
        `currency_object`$fromJSON(jsonlite::toJSON(this_object$`currency`, auto_unbox = TRUE, digits = NA))
        self$`currency` <- `currency_object`
      }
      if (!is.null(this_object$`itemsTotal`)) {
        self$`itemsTotal` <- this_object$`itemsTotal`
      }
      if (!is.null(this_object$`deliveryTotal`)) {
        self$`deliveryTotal` <- this_object$`deliveryTotal`
      }
      if (!is.null(this_object$`buyerItemsTotal`)) {
        self$`buyerItemsTotal` <- this_object$`buyerItemsTotal`
      }
      if (!is.null(this_object$`buyerTotal`)) {
        self$`buyerTotal` <- this_object$`buyerTotal`
      }
      if (!is.null(this_object$`buyerItemsTotalBeforeDiscount`)) {
        self$`buyerItemsTotalBeforeDiscount` <- this_object$`buyerItemsTotalBeforeDiscount`
      }
      if (!is.null(this_object$`buyerTotalBeforeDiscount`)) {
        self$`buyerTotalBeforeDiscount` <- this_object$`buyerTotalBeforeDiscount`
      }
      if (!is.null(this_object$`paymentType`)) {
        `paymenttype_object` <- OrderPaymentType$new()
        `paymenttype_object`$fromJSON(jsonlite::toJSON(this_object$`paymentType`, auto_unbox = TRUE, digits = NA))
        self$`paymentType` <- `paymenttype_object`
      }
      if (!is.null(this_object$`paymentMethod`)) {
        `paymentmethod_object` <- OrderPaymentMethodType$new()
        `paymentmethod_object`$fromJSON(jsonlite::toJSON(this_object$`paymentMethod`, auto_unbox = TRUE, digits = NA))
        self$`paymentMethod` <- `paymentmethod_object`
      }
      if (!is.null(this_object$`fake`)) {
        self$`fake` <- this_object$`fake`
      }
      if (!is.null(this_object$`items`)) {
        self$`items` <- ApiClient$new()$deserializeObj(this_object$`items`, "array[OrderItemDTO]", loadNamespace("ympa_r_client"))
      }
      if (!is.null(this_object$`subsidies`)) {
        self$`subsidies` <- ApiClient$new()$deserializeObj(this_object$`subsidies`, "array[OrderSubsidyDTO]", loadNamespace("ympa_r_client"))
      }
      if (!is.null(this_object$`delivery`)) {
        `delivery_object` <- OrderDeliveryDTO$new()
        `delivery_object`$fromJSON(jsonlite::toJSON(this_object$`delivery`, auto_unbox = TRUE, digits = NA))
        self$`delivery` <- `delivery_object`
      }
      if (!is.null(this_object$`buyer`)) {
        `buyer_object` <- OrderBuyerDTO$new()
        `buyer_object`$fromJSON(jsonlite::toJSON(this_object$`buyer`, auto_unbox = TRUE, digits = NA))
        self$`buyer` <- `buyer_object`
      }
      if (!is.null(this_object$`notes`)) {
        self$`notes` <- this_object$`notes`
      }
      if (!is.null(this_object$`taxSystem`)) {
        `taxsystem_object` <- OrderTaxSystemType$new()
        `taxsystem_object`$fromJSON(jsonlite::toJSON(this_object$`taxSystem`, auto_unbox = TRUE, digits = NA))
        self$`taxSystem` <- `taxsystem_object`
      }
      if (!is.null(this_object$`cancelRequested`)) {
        self$`cancelRequested` <- this_object$`cancelRequested`
      }
      if (!is.null(this_object$`expiryDate`)) {
        self$`expiryDate` <- this_object$`expiryDate`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return OrderDTO in JSON format
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
        if (!is.null(self$`status`)) {
          sprintf(
          '"status":
          %s
          ',
          jsonlite::toJSON(self$`status`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`substatus`)) {
          sprintf(
          '"substatus":
          %s
          ',
          jsonlite::toJSON(self$`substatus`$toJSON(), auto_unbox = TRUE, digits = NA)
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
        if (!is.null(self$`updatedAt`)) {
          sprintf(
          '"updatedAt":
            "%s"
                    ',
          self$`updatedAt`
          )
        },
        if (!is.null(self$`currency`)) {
          sprintf(
          '"currency":
          %s
          ',
          jsonlite::toJSON(self$`currency`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`itemsTotal`)) {
          sprintf(
          '"itemsTotal":
            %d
                    ',
          self$`itemsTotal`
          )
        },
        if (!is.null(self$`deliveryTotal`)) {
          sprintf(
          '"deliveryTotal":
            %d
                    ',
          self$`deliveryTotal`
          )
        },
        if (!is.null(self$`buyerItemsTotal`)) {
          sprintf(
          '"buyerItemsTotal":
            %d
                    ',
          self$`buyerItemsTotal`
          )
        },
        if (!is.null(self$`buyerTotal`)) {
          sprintf(
          '"buyerTotal":
            %d
                    ',
          self$`buyerTotal`
          )
        },
        if (!is.null(self$`buyerItemsTotalBeforeDiscount`)) {
          sprintf(
          '"buyerItemsTotalBeforeDiscount":
            %d
                    ',
          self$`buyerItemsTotalBeforeDiscount`
          )
        },
        if (!is.null(self$`buyerTotalBeforeDiscount`)) {
          sprintf(
          '"buyerTotalBeforeDiscount":
            %d
                    ',
          self$`buyerTotalBeforeDiscount`
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
        if (!is.null(self$`paymentMethod`)) {
          sprintf(
          '"paymentMethod":
          %s
          ',
          jsonlite::toJSON(self$`paymentMethod`$toJSON(), auto_unbox = TRUE, digits = NA)
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
        if (!is.null(self$`items`)) {
          sprintf(
          '"items":
          [%s]
',
          paste(sapply(self$`items`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        },
        if (!is.null(self$`subsidies`)) {
          sprintf(
          '"subsidies":
          [%s]
',
          paste(sapply(self$`subsidies`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        },
        if (!is.null(self$`delivery`)) {
          sprintf(
          '"delivery":
          %s
          ',
          jsonlite::toJSON(self$`delivery`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`buyer`)) {
          sprintf(
          '"buyer":
          %s
          ',
          jsonlite::toJSON(self$`buyer`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`notes`)) {
          sprintf(
          '"notes":
            "%s"
                    ',
          self$`notes`
          )
        },
        if (!is.null(self$`taxSystem`)) {
          sprintf(
          '"taxSystem":
          %s
          ',
          jsonlite::toJSON(self$`taxSystem`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`cancelRequested`)) {
          sprintf(
          '"cancelRequested":
            %s
                    ',
          tolower(self$`cancelRequested`)
          )
        },
        if (!is.null(self$`expiryDate`)) {
          sprintf(
          '"expiryDate":
            "%s"
                    ',
          self$`expiryDate`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of OrderDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of OrderDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of OrderDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`id` <- this_object$`id`
      self$`status` <- OrderStatusType$new()$fromJSON(jsonlite::toJSON(this_object$`status`, auto_unbox = TRUE, digits = NA))
      self$`substatus` <- OrderSubstatusType$new()$fromJSON(jsonlite::toJSON(this_object$`substatus`, auto_unbox = TRUE, digits = NA))
      self$`creationDate` <- this_object$`creationDate`
      self$`updatedAt` <- this_object$`updatedAt`
      self$`currency` <- CurrencyType$new()$fromJSON(jsonlite::toJSON(this_object$`currency`, auto_unbox = TRUE, digits = NA))
      self$`itemsTotal` <- this_object$`itemsTotal`
      self$`deliveryTotal` <- this_object$`deliveryTotal`
      self$`buyerItemsTotal` <- this_object$`buyerItemsTotal`
      self$`buyerTotal` <- this_object$`buyerTotal`
      self$`buyerItemsTotalBeforeDiscount` <- this_object$`buyerItemsTotalBeforeDiscount`
      self$`buyerTotalBeforeDiscount` <- this_object$`buyerTotalBeforeDiscount`
      self$`paymentType` <- OrderPaymentType$new()$fromJSON(jsonlite::toJSON(this_object$`paymentType`, auto_unbox = TRUE, digits = NA))
      self$`paymentMethod` <- OrderPaymentMethodType$new()$fromJSON(jsonlite::toJSON(this_object$`paymentMethod`, auto_unbox = TRUE, digits = NA))
      self$`fake` <- this_object$`fake`
      self$`items` <- ApiClient$new()$deserializeObj(this_object$`items`, "array[OrderItemDTO]", loadNamespace("ympa_r_client"))
      self$`subsidies` <- ApiClient$new()$deserializeObj(this_object$`subsidies`, "array[OrderSubsidyDTO]", loadNamespace("ympa_r_client"))
      self$`delivery` <- OrderDeliveryDTO$new()$fromJSON(jsonlite::toJSON(this_object$`delivery`, auto_unbox = TRUE, digits = NA))
      self$`buyer` <- OrderBuyerDTO$new()$fromJSON(jsonlite::toJSON(this_object$`buyer`, auto_unbox = TRUE, digits = NA))
      self$`notes` <- this_object$`notes`
      self$`taxSystem` <- OrderTaxSystemType$new()$fromJSON(jsonlite::toJSON(this_object$`taxSystem`, auto_unbox = TRUE, digits = NA))
      self$`cancelRequested` <- this_object$`cancelRequested`
      self$`expiryDate` <- this_object$`expiryDate`
      self
    },
    #' Validate JSON input with respect to OrderDTO
    #'
    #' @description
    #' Validate JSON input with respect to OrderDTO and throw an exception if invalid
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
        stop(paste("The JSON input `", input, "` is invalid for OrderDTO: the required field `items` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of OrderDTO
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
# OrderDTO$unlock()
#
## Below is an example to define the print function
# OrderDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# OrderDTO$lock()

