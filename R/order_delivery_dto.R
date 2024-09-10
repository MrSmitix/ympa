#' Create a new OrderDeliveryDTO
#'
#' @description
#' Информация о доставке.
#'
#' @docType class
#' @title OrderDeliveryDTO
#' @description OrderDeliveryDTO Class
#' @format An \code{R6Class} generator object
#' @field id Идентификатор доставки, присвоенный магазином.  Указывается, только если магазин передал данный идентификатор в ответе на запрос методом [POST cart](../../pushapi/reference/cart.md). character [optional]
#' @field type  \link{OrderDeliveryType} [optional]
#' @field serviceName Наименование службы доставки. character [optional]
#' @field price {\% note warning \"\" \%}  Этот параметр устарел. Стоимость доставки смотрите в параметре `deliveryTotal`.  {\% endnote \%}  Стоимость доставки в валюте заказа. numeric [optional]
#' @field deliveryPartnerType  \link{OrderDeliveryPartnerType} [optional]
#' @field courier  \link{OrderCourierDTO} [optional]
#' @field dates  \link{OrderDeliveryDatesDTO} [optional]
#' @field region  \link{RegionDTO} [optional]
#' @field address  \link{OrderDeliveryAddressDTO} [optional]
#' @field vat  \link{OrderVatType} [optional]
#' @field deliveryServiceId Идентификатор службы доставки. integer [optional]
#' @field liftType  \link{OrderLiftType} [optional]
#' @field liftPrice Стоимость подъема на этаж. numeric [optional]
#' @field outletCode Идентификатор пункта самовывоза, присвоенный магазином. character [optional]
#' @field outletStorageLimitDate Формат даты: `ДД-ММ-ГГГГ`. character [optional]
#' @field dispatchType  \link{OrderDeliveryDispatchType} [optional]
#' @field tracks Информация для отслеживания перемещений посылки. list(\link{OrderTrackDTO}) [optional]
#' @field shipments Информация о посылках. list(\link{OrderShipmentDTO}) [optional]
#' @field estimated Приблизительная ли дата доставки. character [optional]
#' @field eacType  \link{OrderDeliveryEacType} [optional]
#' @field eacCode Код подтверждения ЭАПП (для типа `MERCHANT_TO_COURIER`). character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
OrderDeliveryDTO <- R6::R6Class(
  "OrderDeliveryDTO",
  public = list(
    `id` = NULL,
    `type` = NULL,
    `serviceName` = NULL,
    `price` = NULL,
    `deliveryPartnerType` = NULL,
    `courier` = NULL,
    `dates` = NULL,
    `region` = NULL,
    `address` = NULL,
    `vat` = NULL,
    `deliveryServiceId` = NULL,
    `liftType` = NULL,
    `liftPrice` = NULL,
    `outletCode` = NULL,
    `outletStorageLimitDate` = NULL,
    `dispatchType` = NULL,
    `tracks` = NULL,
    `shipments` = NULL,
    `estimated` = NULL,
    `eacType` = NULL,
    `eacCode` = NULL,
    #' Initialize a new OrderDeliveryDTO class.
    #'
    #' @description
    #' Initialize a new OrderDeliveryDTO class.
    #'
    #' @param id Идентификатор доставки, присвоенный магазином.  Указывается, только если магазин передал данный идентификатор в ответе на запрос методом [POST cart](../../pushapi/reference/cart.md).
    #' @param type type
    #' @param serviceName Наименование службы доставки.
    #' @param price {\% note warning \"\" \%}  Этот параметр устарел. Стоимость доставки смотрите в параметре `deliveryTotal`.  {\% endnote \%}  Стоимость доставки в валюте заказа.
    #' @param deliveryPartnerType deliveryPartnerType
    #' @param courier courier
    #' @param dates dates
    #' @param region region
    #' @param address address
    #' @param vat vat
    #' @param deliveryServiceId Идентификатор службы доставки.
    #' @param liftType liftType
    #' @param liftPrice Стоимость подъема на этаж.
    #' @param outletCode Идентификатор пункта самовывоза, присвоенный магазином.
    #' @param outletStorageLimitDate Формат даты: `ДД-ММ-ГГГГ`.
    #' @param dispatchType dispatchType
    #' @param tracks Информация для отслеживания перемещений посылки.
    #' @param shipments Информация о посылках.
    #' @param estimated Приблизительная ли дата доставки.
    #' @param eacType eacType
    #' @param eacCode Код подтверждения ЭАПП (для типа `MERCHANT_TO_COURIER`).
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`id` = NULL, `type` = NULL, `serviceName` = NULL, `price` = NULL, `deliveryPartnerType` = NULL, `courier` = NULL, `dates` = NULL, `region` = NULL, `address` = NULL, `vat` = NULL, `deliveryServiceId` = NULL, `liftType` = NULL, `liftPrice` = NULL, `outletCode` = NULL, `outletStorageLimitDate` = NULL, `dispatchType` = NULL, `tracks` = NULL, `shipments` = NULL, `estimated` = NULL, `eacType` = NULL, `eacCode` = NULL, ...) {
      if (!is.null(`id`)) {
        if (!(is.character(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", `id`))
        }
        self$`id` <- `id`
      }
      if (!is.null(`type`)) {
        if (!(`type` %in% c())) {
          stop(paste("Error! \"", `type`, "\" cannot be assigned to `type`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`type`))
        self$`type` <- `type`
      }
      if (!is.null(`serviceName`)) {
        if (!(is.character(`serviceName`) && length(`serviceName`) == 1)) {
          stop(paste("Error! Invalid data for `serviceName`. Must be a string:", `serviceName`))
        }
        self$`serviceName` <- `serviceName`
      }
      if (!is.null(`price`)) {
        self$`price` <- `price`
      }
      if (!is.null(`deliveryPartnerType`)) {
        if (!(`deliveryPartnerType` %in% c())) {
          stop(paste("Error! \"", `deliveryPartnerType`, "\" cannot be assigned to `deliveryPartnerType`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`deliveryPartnerType`))
        self$`deliveryPartnerType` <- `deliveryPartnerType`
      }
      if (!is.null(`courier`)) {
        stopifnot(R6::is.R6(`courier`))
        self$`courier` <- `courier`
      }
      if (!is.null(`dates`)) {
        stopifnot(R6::is.R6(`dates`))
        self$`dates` <- `dates`
      }
      if (!is.null(`region`)) {
        stopifnot(R6::is.R6(`region`))
        self$`region` <- `region`
      }
      if (!is.null(`address`)) {
        stopifnot(R6::is.R6(`address`))
        self$`address` <- `address`
      }
      if (!is.null(`vat`)) {
        if (!(`vat` %in% c())) {
          stop(paste("Error! \"", `vat`, "\" cannot be assigned to `vat`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`vat`))
        self$`vat` <- `vat`
      }
      if (!is.null(`deliveryServiceId`)) {
        if (!(is.numeric(`deliveryServiceId`) && length(`deliveryServiceId`) == 1)) {
          stop(paste("Error! Invalid data for `deliveryServiceId`. Must be an integer:", `deliveryServiceId`))
        }
        self$`deliveryServiceId` <- `deliveryServiceId`
      }
      if (!is.null(`liftType`)) {
        if (!(`liftType` %in% c())) {
          stop(paste("Error! \"", `liftType`, "\" cannot be assigned to `liftType`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`liftType`))
        self$`liftType` <- `liftType`
      }
      if (!is.null(`liftPrice`)) {
        self$`liftPrice` <- `liftPrice`
      }
      if (!is.null(`outletCode`)) {
        if (!(is.character(`outletCode`) && length(`outletCode`) == 1)) {
          stop(paste("Error! Invalid data for `outletCode`. Must be a string:", `outletCode`))
        }
        self$`outletCode` <- `outletCode`
      }
      if (!is.null(`outletStorageLimitDate`)) {
        if (!(is.character(`outletStorageLimitDate`) && length(`outletStorageLimitDate`) == 1)) {
          stop(paste("Error! Invalid data for `outletStorageLimitDate`. Must be a string:", `outletStorageLimitDate`))
        }
        self$`outletStorageLimitDate` <- `outletStorageLimitDate`
      }
      if (!is.null(`dispatchType`)) {
        if (!(`dispatchType` %in% c())) {
          stop(paste("Error! \"", `dispatchType`, "\" cannot be assigned to `dispatchType`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`dispatchType`))
        self$`dispatchType` <- `dispatchType`
      }
      if (!is.null(`tracks`)) {
        stopifnot(is.vector(`tracks`), length(`tracks`) != 0)
        sapply(`tracks`, function(x) stopifnot(R6::is.R6(x)))
        self$`tracks` <- `tracks`
      }
      if (!is.null(`shipments`)) {
        stopifnot(is.vector(`shipments`), length(`shipments`) != 0)
        sapply(`shipments`, function(x) stopifnot(R6::is.R6(x)))
        self$`shipments` <- `shipments`
      }
      if (!is.null(`estimated`)) {
        if (!(is.logical(`estimated`) && length(`estimated`) == 1)) {
          stop(paste("Error! Invalid data for `estimated`. Must be a boolean:", `estimated`))
        }
        self$`estimated` <- `estimated`
      }
      if (!is.null(`eacType`)) {
        if (!(`eacType` %in% c())) {
          stop(paste("Error! \"", `eacType`, "\" cannot be assigned to `eacType`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`eacType`))
        self$`eacType` <- `eacType`
      }
      if (!is.null(`eacCode`)) {
        if (!(is.character(`eacCode`) && length(`eacCode`) == 1)) {
          stop(paste("Error! Invalid data for `eacCode`. Must be a string:", `eacCode`))
        }
        self$`eacCode` <- `eacCode`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return OrderDeliveryDTO in JSON format
    #' @export
    toJSON = function() {
      OrderDeliveryDTOObject <- list()
      if (!is.null(self$`id`)) {
        OrderDeliveryDTOObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`type`)) {
        OrderDeliveryDTOObject[["type"]] <-
          self$`type`$toJSON()
      }
      if (!is.null(self$`serviceName`)) {
        OrderDeliveryDTOObject[["serviceName"]] <-
          self$`serviceName`
      }
      if (!is.null(self$`price`)) {
        OrderDeliveryDTOObject[["price"]] <-
          self$`price`
      }
      if (!is.null(self$`deliveryPartnerType`)) {
        OrderDeliveryDTOObject[["deliveryPartnerType"]] <-
          self$`deliveryPartnerType`$toJSON()
      }
      if (!is.null(self$`courier`)) {
        OrderDeliveryDTOObject[["courier"]] <-
          self$`courier`$toJSON()
      }
      if (!is.null(self$`dates`)) {
        OrderDeliveryDTOObject[["dates"]] <-
          self$`dates`$toJSON()
      }
      if (!is.null(self$`region`)) {
        OrderDeliveryDTOObject[["region"]] <-
          self$`region`$toJSON()
      }
      if (!is.null(self$`address`)) {
        OrderDeliveryDTOObject[["address"]] <-
          self$`address`$toJSON()
      }
      if (!is.null(self$`vat`)) {
        OrderDeliveryDTOObject[["vat"]] <-
          self$`vat`$toJSON()
      }
      if (!is.null(self$`deliveryServiceId`)) {
        OrderDeliveryDTOObject[["deliveryServiceId"]] <-
          self$`deliveryServiceId`
      }
      if (!is.null(self$`liftType`)) {
        OrderDeliveryDTOObject[["liftType"]] <-
          self$`liftType`$toJSON()
      }
      if (!is.null(self$`liftPrice`)) {
        OrderDeliveryDTOObject[["liftPrice"]] <-
          self$`liftPrice`
      }
      if (!is.null(self$`outletCode`)) {
        OrderDeliveryDTOObject[["outletCode"]] <-
          self$`outletCode`
      }
      if (!is.null(self$`outletStorageLimitDate`)) {
        OrderDeliveryDTOObject[["outletStorageLimitDate"]] <-
          self$`outletStorageLimitDate`
      }
      if (!is.null(self$`dispatchType`)) {
        OrderDeliveryDTOObject[["dispatchType"]] <-
          self$`dispatchType`$toJSON()
      }
      if (!is.null(self$`tracks`)) {
        OrderDeliveryDTOObject[["tracks"]] <-
          lapply(self$`tracks`, function(x) x$toJSON())
      }
      if (!is.null(self$`shipments`)) {
        OrderDeliveryDTOObject[["shipments"]] <-
          lapply(self$`shipments`, function(x) x$toJSON())
      }
      if (!is.null(self$`estimated`)) {
        OrderDeliveryDTOObject[["estimated"]] <-
          self$`estimated`
      }
      if (!is.null(self$`eacType`)) {
        OrderDeliveryDTOObject[["eacType"]] <-
          self$`eacType`$toJSON()
      }
      if (!is.null(self$`eacCode`)) {
        OrderDeliveryDTOObject[["eacCode"]] <-
          self$`eacCode`
      }
      OrderDeliveryDTOObject
    },
    #' Deserialize JSON string into an instance of OrderDeliveryDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of OrderDeliveryDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of OrderDeliveryDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`type`)) {
        `type_object` <- OrderDeliveryType$new()
        `type_object`$fromJSON(jsonlite::toJSON(this_object$`type`, auto_unbox = TRUE, digits = NA))
        self$`type` <- `type_object`
      }
      if (!is.null(this_object$`serviceName`)) {
        self$`serviceName` <- this_object$`serviceName`
      }
      if (!is.null(this_object$`price`)) {
        self$`price` <- this_object$`price`
      }
      if (!is.null(this_object$`deliveryPartnerType`)) {
        `deliverypartnertype_object` <- OrderDeliveryPartnerType$new()
        `deliverypartnertype_object`$fromJSON(jsonlite::toJSON(this_object$`deliveryPartnerType`, auto_unbox = TRUE, digits = NA))
        self$`deliveryPartnerType` <- `deliverypartnertype_object`
      }
      if (!is.null(this_object$`courier`)) {
        `courier_object` <- OrderCourierDTO$new()
        `courier_object`$fromJSON(jsonlite::toJSON(this_object$`courier`, auto_unbox = TRUE, digits = NA))
        self$`courier` <- `courier_object`
      }
      if (!is.null(this_object$`dates`)) {
        `dates_object` <- OrderDeliveryDatesDTO$new()
        `dates_object`$fromJSON(jsonlite::toJSON(this_object$`dates`, auto_unbox = TRUE, digits = NA))
        self$`dates` <- `dates_object`
      }
      if (!is.null(this_object$`region`)) {
        `region_object` <- RegionDTO$new()
        `region_object`$fromJSON(jsonlite::toJSON(this_object$`region`, auto_unbox = TRUE, digits = NA))
        self$`region` <- `region_object`
      }
      if (!is.null(this_object$`address`)) {
        `address_object` <- OrderDeliveryAddressDTO$new()
        `address_object`$fromJSON(jsonlite::toJSON(this_object$`address`, auto_unbox = TRUE, digits = NA))
        self$`address` <- `address_object`
      }
      if (!is.null(this_object$`vat`)) {
        `vat_object` <- OrderVatType$new()
        `vat_object`$fromJSON(jsonlite::toJSON(this_object$`vat`, auto_unbox = TRUE, digits = NA))
        self$`vat` <- `vat_object`
      }
      if (!is.null(this_object$`deliveryServiceId`)) {
        self$`deliveryServiceId` <- this_object$`deliveryServiceId`
      }
      if (!is.null(this_object$`liftType`)) {
        `lifttype_object` <- OrderLiftType$new()
        `lifttype_object`$fromJSON(jsonlite::toJSON(this_object$`liftType`, auto_unbox = TRUE, digits = NA))
        self$`liftType` <- `lifttype_object`
      }
      if (!is.null(this_object$`liftPrice`)) {
        self$`liftPrice` <- this_object$`liftPrice`
      }
      if (!is.null(this_object$`outletCode`)) {
        self$`outletCode` <- this_object$`outletCode`
      }
      if (!is.null(this_object$`outletStorageLimitDate`)) {
        self$`outletStorageLimitDate` <- this_object$`outletStorageLimitDate`
      }
      if (!is.null(this_object$`dispatchType`)) {
        `dispatchtype_object` <- OrderDeliveryDispatchType$new()
        `dispatchtype_object`$fromJSON(jsonlite::toJSON(this_object$`dispatchType`, auto_unbox = TRUE, digits = NA))
        self$`dispatchType` <- `dispatchtype_object`
      }
      if (!is.null(this_object$`tracks`)) {
        self$`tracks` <- ApiClient$new()$deserializeObj(this_object$`tracks`, "array[OrderTrackDTO]", loadNamespace("ympa_r_client"))
      }
      if (!is.null(this_object$`shipments`)) {
        self$`shipments` <- ApiClient$new()$deserializeObj(this_object$`shipments`, "array[OrderShipmentDTO]", loadNamespace("ympa_r_client"))
      }
      if (!is.null(this_object$`estimated`)) {
        self$`estimated` <- this_object$`estimated`
      }
      if (!is.null(this_object$`eacType`)) {
        `eactype_object` <- OrderDeliveryEacType$new()
        `eactype_object`$fromJSON(jsonlite::toJSON(this_object$`eacType`, auto_unbox = TRUE, digits = NA))
        self$`eacType` <- `eactype_object`
      }
      if (!is.null(this_object$`eacCode`)) {
        self$`eacCode` <- this_object$`eacCode`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return OrderDeliveryDTO in JSON format
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
        if (!is.null(self$`type`)) {
          sprintf(
          '"type":
          %s
          ',
          jsonlite::toJSON(self$`type`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`serviceName`)) {
          sprintf(
          '"serviceName":
            "%s"
                    ',
          self$`serviceName`
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
        if (!is.null(self$`deliveryPartnerType`)) {
          sprintf(
          '"deliveryPartnerType":
          %s
          ',
          jsonlite::toJSON(self$`deliveryPartnerType`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`courier`)) {
          sprintf(
          '"courier":
          %s
          ',
          jsonlite::toJSON(self$`courier`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`dates`)) {
          sprintf(
          '"dates":
          %s
          ',
          jsonlite::toJSON(self$`dates`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`region`)) {
          sprintf(
          '"region":
          %s
          ',
          jsonlite::toJSON(self$`region`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`address`)) {
          sprintf(
          '"address":
          %s
          ',
          jsonlite::toJSON(self$`address`$toJSON(), auto_unbox = TRUE, digits = NA)
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
        if (!is.null(self$`deliveryServiceId`)) {
          sprintf(
          '"deliveryServiceId":
            %d
                    ',
          self$`deliveryServiceId`
          )
        },
        if (!is.null(self$`liftType`)) {
          sprintf(
          '"liftType":
          %s
          ',
          jsonlite::toJSON(self$`liftType`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`liftPrice`)) {
          sprintf(
          '"liftPrice":
            %d
                    ',
          self$`liftPrice`
          )
        },
        if (!is.null(self$`outletCode`)) {
          sprintf(
          '"outletCode":
            "%s"
                    ',
          self$`outletCode`
          )
        },
        if (!is.null(self$`outletStorageLimitDate`)) {
          sprintf(
          '"outletStorageLimitDate":
            "%s"
                    ',
          self$`outletStorageLimitDate`
          )
        },
        if (!is.null(self$`dispatchType`)) {
          sprintf(
          '"dispatchType":
          %s
          ',
          jsonlite::toJSON(self$`dispatchType`$toJSON(), auto_unbox = TRUE, digits = NA)
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
        if (!is.null(self$`shipments`)) {
          sprintf(
          '"shipments":
          [%s]
',
          paste(sapply(self$`shipments`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        },
        if (!is.null(self$`estimated`)) {
          sprintf(
          '"estimated":
            %s
                    ',
          tolower(self$`estimated`)
          )
        },
        if (!is.null(self$`eacType`)) {
          sprintf(
          '"eacType":
          %s
          ',
          jsonlite::toJSON(self$`eacType`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`eacCode`)) {
          sprintf(
          '"eacCode":
            "%s"
                    ',
          self$`eacCode`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of OrderDeliveryDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of OrderDeliveryDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of OrderDeliveryDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`id` <- this_object$`id`
      self$`type` <- OrderDeliveryType$new()$fromJSON(jsonlite::toJSON(this_object$`type`, auto_unbox = TRUE, digits = NA))
      self$`serviceName` <- this_object$`serviceName`
      self$`price` <- this_object$`price`
      self$`deliveryPartnerType` <- OrderDeliveryPartnerType$new()$fromJSON(jsonlite::toJSON(this_object$`deliveryPartnerType`, auto_unbox = TRUE, digits = NA))
      self$`courier` <- OrderCourierDTO$new()$fromJSON(jsonlite::toJSON(this_object$`courier`, auto_unbox = TRUE, digits = NA))
      self$`dates` <- OrderDeliveryDatesDTO$new()$fromJSON(jsonlite::toJSON(this_object$`dates`, auto_unbox = TRUE, digits = NA))
      self$`region` <- RegionDTO$new()$fromJSON(jsonlite::toJSON(this_object$`region`, auto_unbox = TRUE, digits = NA))
      self$`address` <- OrderDeliveryAddressDTO$new()$fromJSON(jsonlite::toJSON(this_object$`address`, auto_unbox = TRUE, digits = NA))
      self$`vat` <- OrderVatType$new()$fromJSON(jsonlite::toJSON(this_object$`vat`, auto_unbox = TRUE, digits = NA))
      self$`deliveryServiceId` <- this_object$`deliveryServiceId`
      self$`liftType` <- OrderLiftType$new()$fromJSON(jsonlite::toJSON(this_object$`liftType`, auto_unbox = TRUE, digits = NA))
      self$`liftPrice` <- this_object$`liftPrice`
      self$`outletCode` <- this_object$`outletCode`
      self$`outletStorageLimitDate` <- this_object$`outletStorageLimitDate`
      self$`dispatchType` <- OrderDeliveryDispatchType$new()$fromJSON(jsonlite::toJSON(this_object$`dispatchType`, auto_unbox = TRUE, digits = NA))
      self$`tracks` <- ApiClient$new()$deserializeObj(this_object$`tracks`, "array[OrderTrackDTO]", loadNamespace("ympa_r_client"))
      self$`shipments` <- ApiClient$new()$deserializeObj(this_object$`shipments`, "array[OrderShipmentDTO]", loadNamespace("ympa_r_client"))
      self$`estimated` <- this_object$`estimated`
      self$`eacType` <- OrderDeliveryEacType$new()$fromJSON(jsonlite::toJSON(this_object$`eacType`, auto_unbox = TRUE, digits = NA))
      self$`eacCode` <- this_object$`eacCode`
      self
    },
    #' Validate JSON input with respect to OrderDeliveryDTO
    #'
    #' @description
    #' Validate JSON input with respect to OrderDeliveryDTO and throw an exception if invalid
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
    #' @return String representation of OrderDeliveryDTO
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
# OrderDeliveryDTO$unlock()
#
## Below is an example to define the print function
# OrderDeliveryDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# OrderDeliveryDTO$lock()

