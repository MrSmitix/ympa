#' Create a new OrderItemDTO
#'
#' @description
#' Список товаров в заказе.
#'
#' @docType class
#' @title OrderItemDTO
#' @description OrderItemDTO Class
#' @format An \code{R6Class} generator object
#' @field id Идентификатор товара в заказе.  Позволяет идентифицировать товар в рамках данного заказа. integer [optional]
#' @field offerId Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) character [optional]
#' @field offerName Название товара. character [optional]
#' @field price Цена на товар в валюте заказа без учета вознаграждения партнеру за скидки по промокодам, купонам и акциям (параметр `subsidies`). numeric [optional]
#' @field buyerPrice Цена на товар в валюте покупателя. В цене уже учтены скидки по:  * акциям; * купонам; * промокодам. numeric [optional]
#' @field buyerPriceBeforeDiscount Стоимость товара в валюте покупателя до применения скидок по:  * акциям; * купонам; * промокодам. numeric [optional]
#' @field priceBeforeDiscount {\% note warning \"\" \%}  Этот параметр устарел.  {\% endnote \%}  Стоимость товара в валюте магазина до применения скидок. numeric [optional]
#' @field count Количество единиц товара. integer [optional]
#' @field vat  \link{OrderVatType} [optional]
#' @field shopSku Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) character [optional]
#' @field subsidy {\% note warning \"\" \%}  Этот параметр устарел. Вместо него используйте `subsidies`.  {\% endnote \%}  Общее вознаграждение партнеру за DBS-доставку и все скидки на товар:  * по промокодам; * по купонам; * по баллам Плюса; * по акциям.  Передается в валюте заказа. numeric [optional]
#' @field partnerWarehouseId {\% note warning \"\" \%}  Этот параметр устарел. Не используйте его.  {\% endnote \%}  Идентификатор склада в системе партнера, на который сформирован заказ. character [optional]
#' @field promos Информация о вознаграждениях партнеру за скидки на товар по промокодам, купонам и акциям. list(\link{OrderItemPromoDTO}) [optional]
#' @field instances Информация о маркировке единиц товара.  Возвращаются данные для маркировки, переданные в запросе [PUT campaigns/{campaignId}/orders/{orderId}/cis](../../reference/orders/provideOrderItemCis.md).  Если магазин еще не передавал коды для этого заказа, `instances` отсутствует. list(\link{OrderItemInstanceDTO}) [optional]
#' @field details Информация об удалении товара из заказа. list(\link{OrderItemDetailDTO}) [optional]
#' @field subsidies Список субсидий по типам. list(\link{OrderItemSubsidyDTO}) [optional]
#' @field requiredInstanceTypes Список необходимых маркировок товара. list(\link{OrderItemInstanceType}) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
OrderItemDTO <- R6::R6Class(
  "OrderItemDTO",
  public = list(
    `id` = NULL,
    `offerId` = NULL,
    `offerName` = NULL,
    `price` = NULL,
    `buyerPrice` = NULL,
    `buyerPriceBeforeDiscount` = NULL,
    `priceBeforeDiscount` = NULL,
    `count` = NULL,
    `vat` = NULL,
    `shopSku` = NULL,
    `subsidy` = NULL,
    `partnerWarehouseId` = NULL,
    `promos` = NULL,
    `instances` = NULL,
    `details` = NULL,
    `subsidies` = NULL,
    `requiredInstanceTypes` = NULL,
    #' Initialize a new OrderItemDTO class.
    #'
    #' @description
    #' Initialize a new OrderItemDTO class.
    #'
    #' @param id Идентификатор товара в заказе.  Позволяет идентифицировать товар в рамках данного заказа.
    #' @param offerId Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)
    #' @param offerName Название товара.
    #' @param price Цена на товар в валюте заказа без учета вознаграждения партнеру за скидки по промокодам, купонам и акциям (параметр `subsidies`).
    #' @param buyerPrice Цена на товар в валюте покупателя. В цене уже учтены скидки по:  * акциям; * купонам; * промокодам.
    #' @param buyerPriceBeforeDiscount Стоимость товара в валюте покупателя до применения скидок по:  * акциям; * купонам; * промокодам.
    #' @param priceBeforeDiscount {\% note warning \"\" \%}  Этот параметр устарел.  {\% endnote \%}  Стоимость товара в валюте магазина до применения скидок.
    #' @param count Количество единиц товара.
    #' @param vat vat
    #' @param shopSku Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)
    #' @param subsidy {\% note warning \"\" \%}  Этот параметр устарел. Вместо него используйте `subsidies`.  {\% endnote \%}  Общее вознаграждение партнеру за DBS-доставку и все скидки на товар:  * по промокодам; * по купонам; * по баллам Плюса; * по акциям.  Передается в валюте заказа.
    #' @param partnerWarehouseId {\% note warning \"\" \%}  Этот параметр устарел. Не используйте его.  {\% endnote \%}  Идентификатор склада в системе партнера, на который сформирован заказ.
    #' @param promos Информация о вознаграждениях партнеру за скидки на товар по промокодам, купонам и акциям.
    #' @param instances Информация о маркировке единиц товара.  Возвращаются данные для маркировки, переданные в запросе [PUT campaigns/{campaignId}/orders/{orderId}/cis](../../reference/orders/provideOrderItemCis.md).  Если магазин еще не передавал коды для этого заказа, `instances` отсутствует.
    #' @param details Информация об удалении товара из заказа.
    #' @param subsidies Список субсидий по типам.
    #' @param requiredInstanceTypes Список необходимых маркировок товара.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`id` = NULL, `offerId` = NULL, `offerName` = NULL, `price` = NULL, `buyerPrice` = NULL, `buyerPriceBeforeDiscount` = NULL, `priceBeforeDiscount` = NULL, `count` = NULL, `vat` = NULL, `shopSku` = NULL, `subsidy` = NULL, `partnerWarehouseId` = NULL, `promos` = NULL, `instances` = NULL, `details` = NULL, `subsidies` = NULL, `requiredInstanceTypes` = NULL, ...) {
      if (!is.null(`id`)) {
        if (!(is.numeric(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be an integer:", `id`))
        }
        self$`id` <- `id`
      }
      if (!is.null(`offerId`)) {
        if (!(is.character(`offerId`) && length(`offerId`) == 1)) {
          stop(paste("Error! Invalid data for `offerId`. Must be a string:", `offerId`))
        }
        self$`offerId` <- `offerId`
      }
      if (!is.null(`offerName`)) {
        if (!(is.character(`offerName`) && length(`offerName`) == 1)) {
          stop(paste("Error! Invalid data for `offerName`. Must be a string:", `offerName`))
        }
        self$`offerName` <- `offerName`
      }
      if (!is.null(`price`)) {
        self$`price` <- `price`
      }
      if (!is.null(`buyerPrice`)) {
        self$`buyerPrice` <- `buyerPrice`
      }
      if (!is.null(`buyerPriceBeforeDiscount`)) {
        self$`buyerPriceBeforeDiscount` <- `buyerPriceBeforeDiscount`
      }
      if (!is.null(`priceBeforeDiscount`)) {
        self$`priceBeforeDiscount` <- `priceBeforeDiscount`
      }
      if (!is.null(`count`)) {
        if (!(is.numeric(`count`) && length(`count`) == 1)) {
          stop(paste("Error! Invalid data for `count`. Must be an integer:", `count`))
        }
        self$`count` <- `count`
      }
      if (!is.null(`vat`)) {
        if (!(`vat` %in% c())) {
          stop(paste("Error! \"", `vat`, "\" cannot be assigned to `vat`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`vat`))
        self$`vat` <- `vat`
      }
      if (!is.null(`shopSku`)) {
        if (!(is.character(`shopSku`) && length(`shopSku`) == 1)) {
          stop(paste("Error! Invalid data for `shopSku`. Must be a string:", `shopSku`))
        }
        self$`shopSku` <- `shopSku`
      }
      if (!is.null(`subsidy`)) {
        self$`subsidy` <- `subsidy`
      }
      if (!is.null(`partnerWarehouseId`)) {
        if (!(is.character(`partnerWarehouseId`) && length(`partnerWarehouseId`) == 1)) {
          stop(paste("Error! Invalid data for `partnerWarehouseId`. Must be a string:", `partnerWarehouseId`))
        }
        self$`partnerWarehouseId` <- `partnerWarehouseId`
      }
      if (!is.null(`promos`)) {
        stopifnot(is.vector(`promos`), length(`promos`) != 0)
        sapply(`promos`, function(x) stopifnot(R6::is.R6(x)))
        self$`promos` <- `promos`
      }
      if (!is.null(`instances`)) {
        stopifnot(is.vector(`instances`), length(`instances`) != 0)
        sapply(`instances`, function(x) stopifnot(R6::is.R6(x)))
        self$`instances` <- `instances`
      }
      if (!is.null(`details`)) {
        stopifnot(is.vector(`details`), length(`details`) != 0)
        sapply(`details`, function(x) stopifnot(R6::is.R6(x)))
        self$`details` <- `details`
      }
      if (!is.null(`subsidies`)) {
        stopifnot(is.vector(`subsidies`), length(`subsidies`) != 0)
        sapply(`subsidies`, function(x) stopifnot(R6::is.R6(x)))
        self$`subsidies` <- `subsidies`
      }
      if (!is.null(`requiredInstanceTypes`)) {
        stopifnot(is.vector(`requiredInstanceTypes`), length(`requiredInstanceTypes`) != 0)
        sapply(`requiredInstanceTypes`, function(x) stopifnot(R6::is.R6(x)))
        self$`requiredInstanceTypes` <- `requiredInstanceTypes`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return OrderItemDTO in JSON format
    #' @export
    toJSON = function() {
      OrderItemDTOObject <- list()
      if (!is.null(self$`id`)) {
        OrderItemDTOObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`offerId`)) {
        OrderItemDTOObject[["offerId"]] <-
          self$`offerId`
      }
      if (!is.null(self$`offerName`)) {
        OrderItemDTOObject[["offerName"]] <-
          self$`offerName`
      }
      if (!is.null(self$`price`)) {
        OrderItemDTOObject[["price"]] <-
          self$`price`
      }
      if (!is.null(self$`buyerPrice`)) {
        OrderItemDTOObject[["buyerPrice"]] <-
          self$`buyerPrice`
      }
      if (!is.null(self$`buyerPriceBeforeDiscount`)) {
        OrderItemDTOObject[["buyerPriceBeforeDiscount"]] <-
          self$`buyerPriceBeforeDiscount`
      }
      if (!is.null(self$`priceBeforeDiscount`)) {
        OrderItemDTOObject[["priceBeforeDiscount"]] <-
          self$`priceBeforeDiscount`
      }
      if (!is.null(self$`count`)) {
        OrderItemDTOObject[["count"]] <-
          self$`count`
      }
      if (!is.null(self$`vat`)) {
        OrderItemDTOObject[["vat"]] <-
          self$`vat`$toJSON()
      }
      if (!is.null(self$`shopSku`)) {
        OrderItemDTOObject[["shopSku"]] <-
          self$`shopSku`
      }
      if (!is.null(self$`subsidy`)) {
        OrderItemDTOObject[["subsidy"]] <-
          self$`subsidy`
      }
      if (!is.null(self$`partnerWarehouseId`)) {
        OrderItemDTOObject[["partnerWarehouseId"]] <-
          self$`partnerWarehouseId`
      }
      if (!is.null(self$`promos`)) {
        OrderItemDTOObject[["promos"]] <-
          lapply(self$`promos`, function(x) x$toJSON())
      }
      if (!is.null(self$`instances`)) {
        OrderItemDTOObject[["instances"]] <-
          lapply(self$`instances`, function(x) x$toJSON())
      }
      if (!is.null(self$`details`)) {
        OrderItemDTOObject[["details"]] <-
          lapply(self$`details`, function(x) x$toJSON())
      }
      if (!is.null(self$`subsidies`)) {
        OrderItemDTOObject[["subsidies"]] <-
          lapply(self$`subsidies`, function(x) x$toJSON())
      }
      if (!is.null(self$`requiredInstanceTypes`)) {
        OrderItemDTOObject[["requiredInstanceTypes"]] <-
          lapply(self$`requiredInstanceTypes`, function(x) x$toJSON())
      }
      OrderItemDTOObject
    },
    #' Deserialize JSON string into an instance of OrderItemDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of OrderItemDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of OrderItemDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`offerId`)) {
        self$`offerId` <- this_object$`offerId`
      }
      if (!is.null(this_object$`offerName`)) {
        self$`offerName` <- this_object$`offerName`
      }
      if (!is.null(this_object$`price`)) {
        self$`price` <- this_object$`price`
      }
      if (!is.null(this_object$`buyerPrice`)) {
        self$`buyerPrice` <- this_object$`buyerPrice`
      }
      if (!is.null(this_object$`buyerPriceBeforeDiscount`)) {
        self$`buyerPriceBeforeDiscount` <- this_object$`buyerPriceBeforeDiscount`
      }
      if (!is.null(this_object$`priceBeforeDiscount`)) {
        self$`priceBeforeDiscount` <- this_object$`priceBeforeDiscount`
      }
      if (!is.null(this_object$`count`)) {
        self$`count` <- this_object$`count`
      }
      if (!is.null(this_object$`vat`)) {
        `vat_object` <- OrderVatType$new()
        `vat_object`$fromJSON(jsonlite::toJSON(this_object$`vat`, auto_unbox = TRUE, digits = NA))
        self$`vat` <- `vat_object`
      }
      if (!is.null(this_object$`shopSku`)) {
        self$`shopSku` <- this_object$`shopSku`
      }
      if (!is.null(this_object$`subsidy`)) {
        self$`subsidy` <- this_object$`subsidy`
      }
      if (!is.null(this_object$`partnerWarehouseId`)) {
        self$`partnerWarehouseId` <- this_object$`partnerWarehouseId`
      }
      if (!is.null(this_object$`promos`)) {
        self$`promos` <- ApiClient$new()$deserializeObj(this_object$`promos`, "array[OrderItemPromoDTO]", loadNamespace("ympa_r_client"))
      }
      if (!is.null(this_object$`instances`)) {
        self$`instances` <- ApiClient$new()$deserializeObj(this_object$`instances`, "array[OrderItemInstanceDTO]", loadNamespace("ympa_r_client"))
      }
      if (!is.null(this_object$`details`)) {
        self$`details` <- ApiClient$new()$deserializeObj(this_object$`details`, "array[OrderItemDetailDTO]", loadNamespace("ympa_r_client"))
      }
      if (!is.null(this_object$`subsidies`)) {
        self$`subsidies` <- ApiClient$new()$deserializeObj(this_object$`subsidies`, "array[OrderItemSubsidyDTO]", loadNamespace("ympa_r_client"))
      }
      if (!is.null(this_object$`requiredInstanceTypes`)) {
        self$`requiredInstanceTypes` <- ApiClient$new()$deserializeObj(this_object$`requiredInstanceTypes`, "array[OrderItemInstanceType]", loadNamespace("ympa_r_client"))
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return OrderItemDTO in JSON format
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
        if (!is.null(self$`offerId`)) {
          sprintf(
          '"offerId":
            "%s"
                    ',
          self$`offerId`
          )
        },
        if (!is.null(self$`offerName`)) {
          sprintf(
          '"offerName":
            "%s"
                    ',
          self$`offerName`
          )
        },
        if (!is.null(self$`price`)) {
          sprintf(
          '"price":
            %d
                    ',
          self$`price`
          )
        },
        if (!is.null(self$`buyerPrice`)) {
          sprintf(
          '"buyerPrice":
            %d
                    ',
          self$`buyerPrice`
          )
        },
        if (!is.null(self$`buyerPriceBeforeDiscount`)) {
          sprintf(
          '"buyerPriceBeforeDiscount":
            %d
                    ',
          self$`buyerPriceBeforeDiscount`
          )
        },
        if (!is.null(self$`priceBeforeDiscount`)) {
          sprintf(
          '"priceBeforeDiscount":
            %d
                    ',
          self$`priceBeforeDiscount`
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
        if (!is.null(self$`vat`)) {
          sprintf(
          '"vat":
          %s
          ',
          jsonlite::toJSON(self$`vat`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`shopSku`)) {
          sprintf(
          '"shopSku":
            "%s"
                    ',
          self$`shopSku`
          )
        },
        if (!is.null(self$`subsidy`)) {
          sprintf(
          '"subsidy":
            %d
                    ',
          self$`subsidy`
          )
        },
        if (!is.null(self$`partnerWarehouseId`)) {
          sprintf(
          '"partnerWarehouseId":
            "%s"
                    ',
          self$`partnerWarehouseId`
          )
        },
        if (!is.null(self$`promos`)) {
          sprintf(
          '"promos":
          [%s]
',
          paste(sapply(self$`promos`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        },
        if (!is.null(self$`instances`)) {
          sprintf(
          '"instances":
          [%s]
',
          paste(sapply(self$`instances`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        },
        if (!is.null(self$`details`)) {
          sprintf(
          '"details":
          [%s]
',
          paste(sapply(self$`details`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
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
        if (!is.null(self$`requiredInstanceTypes`)) {
          sprintf(
          '"requiredInstanceTypes":
          [%s]
',
          paste(sapply(self$`requiredInstanceTypes`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of OrderItemDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of OrderItemDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of OrderItemDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`id` <- this_object$`id`
      self$`offerId` <- this_object$`offerId`
      self$`offerName` <- this_object$`offerName`
      self$`price` <- this_object$`price`
      self$`buyerPrice` <- this_object$`buyerPrice`
      self$`buyerPriceBeforeDiscount` <- this_object$`buyerPriceBeforeDiscount`
      self$`priceBeforeDiscount` <- this_object$`priceBeforeDiscount`
      self$`count` <- this_object$`count`
      self$`vat` <- OrderVatType$new()$fromJSON(jsonlite::toJSON(this_object$`vat`, auto_unbox = TRUE, digits = NA))
      self$`shopSku` <- this_object$`shopSku`
      self$`subsidy` <- this_object$`subsidy`
      self$`partnerWarehouseId` <- this_object$`partnerWarehouseId`
      self$`promos` <- ApiClient$new()$deserializeObj(this_object$`promos`, "array[OrderItemPromoDTO]", loadNamespace("ympa_r_client"))
      self$`instances` <- ApiClient$new()$deserializeObj(this_object$`instances`, "array[OrderItemInstanceDTO]", loadNamespace("ympa_r_client"))
      self$`details` <- ApiClient$new()$deserializeObj(this_object$`details`, "array[OrderItemDetailDTO]", loadNamespace("ympa_r_client"))
      self$`subsidies` <- ApiClient$new()$deserializeObj(this_object$`subsidies`, "array[OrderItemSubsidyDTO]", loadNamespace("ympa_r_client"))
      self$`requiredInstanceTypes` <- ApiClient$new()$deserializeObj(this_object$`requiredInstanceTypes`, "array[OrderItemInstanceType]", loadNamespace("ympa_r_client"))
      self
    },
    #' Validate JSON input with respect to OrderItemDTO
    #'
    #' @description
    #' Validate JSON input with respect to OrderItemDTO and throw an exception if invalid
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
    #' @return String representation of OrderItemDTO
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
      if (nchar(self$`offerId`) > 255) {
        return(FALSE)
      }
      if (nchar(self$`offerId`) < 1) {
        return(FALSE)
      }
      if (!str_detect(self$`offerId`, "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")) {
        return(FALSE)
      }

      if (nchar(self$`shopSku`) > 255) {
        return(FALSE)
      }
      if (nchar(self$`shopSku`) < 1) {
        return(FALSE)
      }
      if (!str_detect(self$`shopSku`, "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")) {
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
      if (nchar(self$`offerId`) > 255) {
        invalid_fields["offerId"] <- "Invalid length for `offerId`, must be smaller than or equal to 255."
      }
      if (nchar(self$`offerId`) < 1) {
        invalid_fields["offerId"] <- "Invalid length for `offerId`, must be bigger than or equal to 1."
      }
      if (!str_detect(self$`offerId`, "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")) {
        invalid_fields["offerId"] <- "Invalid value for `offerId`, must conform to the pattern ^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$."
      }

      if (nchar(self$`shopSku`) > 255) {
        invalid_fields["shopSku"] <- "Invalid length for `shopSku`, must be smaller than or equal to 255."
      }
      if (nchar(self$`shopSku`) < 1) {
        invalid_fields["shopSku"] <- "Invalid length for `shopSku`, must be bigger than or equal to 1."
      }
      if (!str_detect(self$`shopSku`, "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")) {
        invalid_fields["shopSku"] <- "Invalid value for `shopSku`, must conform to the pattern ^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$."
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
# OrderItemDTO$unlock()
#
## Below is an example to define the print function
# OrderItemDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# OrderItemDTO$lock()

