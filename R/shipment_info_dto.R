#' Create a new ShipmentInfoDTO
#'
#' @description
#' Список с информацией об отгрузках.
#'
#' @docType class
#' @title ShipmentInfoDTO
#' @description ShipmentInfoDTO Class
#' @format An \code{R6Class} generator object
#' @field id Идентификатор отгрузки. integer [optional]
#' @field planIntervalFrom Начало планового интервала отгрузки. character [optional]
#' @field planIntervalTo Конец планового интервала отгрузки. character [optional]
#' @field shipmentType  \link{ShipmentType} [optional]
#' @field warehouse  \link{PartnerShipmentWarehouseDTO} [optional]
#' @field warehouseTo  \link{PartnerShipmentWarehouseDTO} [optional]
#' @field externalId Идентификатор отгрузки в вашей системе. Если вы еще не передавали идентификатор, вернется идентификатор из параметра `id`. character [optional]
#' @field deliveryService  \link{DeliveryServiceDTO} [optional]
#' @field palletsCount  \link{PalletsCountDTO} [optional]
#' @field orderIds Идентификаторы заказов в отгрузке. list(integer)
#' @field draftCount Количество заказов, которое Маркет запланировал к отгрузке. integer [optional]
#' @field plannedCount Количество заказов, которое Маркет подтвердил к отгрузке. integer [optional]
#' @field factCount Количество заказов, принятых в сортировочном центре или пункте приема. integer [optional]
#' @field status  \link{ShipmentStatusType} [optional]
#' @field statusDescription Описание статуса отгрузки. character [optional]
#' @field statusUpdateTime Время последнего изменения статуса отгрузки. character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ShipmentInfoDTO <- R6::R6Class(
  "ShipmentInfoDTO",
  public = list(
    `id` = NULL,
    `planIntervalFrom` = NULL,
    `planIntervalTo` = NULL,
    `shipmentType` = NULL,
    `warehouse` = NULL,
    `warehouseTo` = NULL,
    `externalId` = NULL,
    `deliveryService` = NULL,
    `palletsCount` = NULL,
    `orderIds` = NULL,
    `draftCount` = NULL,
    `plannedCount` = NULL,
    `factCount` = NULL,
    `status` = NULL,
    `statusDescription` = NULL,
    `statusUpdateTime` = NULL,
    #' Initialize a new ShipmentInfoDTO class.
    #'
    #' @description
    #' Initialize a new ShipmentInfoDTO class.
    #'
    #' @param orderIds Идентификаторы заказов в отгрузке.
    #' @param id Идентификатор отгрузки.
    #' @param planIntervalFrom Начало планового интервала отгрузки.
    #' @param planIntervalTo Конец планового интервала отгрузки.
    #' @param shipmentType shipmentType
    #' @param warehouse warehouse
    #' @param warehouseTo warehouseTo
    #' @param externalId Идентификатор отгрузки в вашей системе. Если вы еще не передавали идентификатор, вернется идентификатор из параметра `id`.
    #' @param deliveryService deliveryService
    #' @param palletsCount palletsCount
    #' @param draftCount Количество заказов, которое Маркет запланировал к отгрузке.
    #' @param plannedCount Количество заказов, которое Маркет подтвердил к отгрузке.
    #' @param factCount Количество заказов, принятых в сортировочном центре или пункте приема.
    #' @param status status
    #' @param statusDescription Описание статуса отгрузки.
    #' @param statusUpdateTime Время последнего изменения статуса отгрузки.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`orderIds`, `id` = NULL, `planIntervalFrom` = NULL, `planIntervalTo` = NULL, `shipmentType` = NULL, `warehouse` = NULL, `warehouseTo` = NULL, `externalId` = NULL, `deliveryService` = NULL, `palletsCount` = NULL, `draftCount` = NULL, `plannedCount` = NULL, `factCount` = NULL, `status` = NULL, `statusDescription` = NULL, `statusUpdateTime` = NULL, ...) {
      if (!missing(`orderIds`)) {
        stopifnot(is.vector(`orderIds`), length(`orderIds`) != 0)
        sapply(`orderIds`, function(x) stopifnot(is.character(x)))
        if (!identical(`orderIds`, unique(`orderIds`))) {
          stop("Error! Items in `orderIds` are not unique.")
        }
        self$`orderIds` <- `orderIds`
      }
      if (!is.null(`id`)) {
        if (!(is.numeric(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be an integer:", `id`))
        }
        self$`id` <- `id`
      }
      if (!is.null(`planIntervalFrom`)) {
        if (!is.character(`planIntervalFrom`)) {
          stop(paste("Error! Invalid data for `planIntervalFrom`. Must be a string:", `planIntervalFrom`))
        }
        self$`planIntervalFrom` <- `planIntervalFrom`
      }
      if (!is.null(`planIntervalTo`)) {
        if (!is.character(`planIntervalTo`)) {
          stop(paste("Error! Invalid data for `planIntervalTo`. Must be a string:", `planIntervalTo`))
        }
        self$`planIntervalTo` <- `planIntervalTo`
      }
      if (!is.null(`shipmentType`)) {
        if (!(`shipmentType` %in% c())) {
          stop(paste("Error! \"", `shipmentType`, "\" cannot be assigned to `shipmentType`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`shipmentType`))
        self$`shipmentType` <- `shipmentType`
      }
      if (!is.null(`warehouse`)) {
        stopifnot(R6::is.R6(`warehouse`))
        self$`warehouse` <- `warehouse`
      }
      if (!is.null(`warehouseTo`)) {
        stopifnot(R6::is.R6(`warehouseTo`))
        self$`warehouseTo` <- `warehouseTo`
      }
      if (!is.null(`externalId`)) {
        if (!(is.character(`externalId`) && length(`externalId`) == 1)) {
          stop(paste("Error! Invalid data for `externalId`. Must be a string:", `externalId`))
        }
        self$`externalId` <- `externalId`
      }
      if (!is.null(`deliveryService`)) {
        stopifnot(R6::is.R6(`deliveryService`))
        self$`deliveryService` <- `deliveryService`
      }
      if (!is.null(`palletsCount`)) {
        stopifnot(R6::is.R6(`palletsCount`))
        self$`palletsCount` <- `palletsCount`
      }
      if (!is.null(`draftCount`)) {
        if (!(is.numeric(`draftCount`) && length(`draftCount`) == 1)) {
          stop(paste("Error! Invalid data for `draftCount`. Must be an integer:", `draftCount`))
        }
        self$`draftCount` <- `draftCount`
      }
      if (!is.null(`plannedCount`)) {
        if (!(is.numeric(`plannedCount`) && length(`plannedCount`) == 1)) {
          stop(paste("Error! Invalid data for `plannedCount`. Must be an integer:", `plannedCount`))
        }
        self$`plannedCount` <- `plannedCount`
      }
      if (!is.null(`factCount`)) {
        if (!(is.numeric(`factCount`) && length(`factCount`) == 1)) {
          stop(paste("Error! Invalid data for `factCount`. Must be an integer:", `factCount`))
        }
        self$`factCount` <- `factCount`
      }
      if (!is.null(`status`)) {
        if (!(`status` %in% c())) {
          stop(paste("Error! \"", `status`, "\" cannot be assigned to `status`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`status`))
        self$`status` <- `status`
      }
      if (!is.null(`statusDescription`)) {
        if (!(is.character(`statusDescription`) && length(`statusDescription`) == 1)) {
          stop(paste("Error! Invalid data for `statusDescription`. Must be a string:", `statusDescription`))
        }
        self$`statusDescription` <- `statusDescription`
      }
      if (!is.null(`statusUpdateTime`)) {
        if (!is.character(`statusUpdateTime`)) {
          stop(paste("Error! Invalid data for `statusUpdateTime`. Must be a string:", `statusUpdateTime`))
        }
        self$`statusUpdateTime` <- `statusUpdateTime`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return ShipmentInfoDTO in JSON format
    #' @export
    toJSON = function() {
      ShipmentInfoDTOObject <- list()
      if (!is.null(self$`id`)) {
        ShipmentInfoDTOObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`planIntervalFrom`)) {
        ShipmentInfoDTOObject[["planIntervalFrom"]] <-
          self$`planIntervalFrom`
      }
      if (!is.null(self$`planIntervalTo`)) {
        ShipmentInfoDTOObject[["planIntervalTo"]] <-
          self$`planIntervalTo`
      }
      if (!is.null(self$`shipmentType`)) {
        ShipmentInfoDTOObject[["shipmentType"]] <-
          self$`shipmentType`$toJSON()
      }
      if (!is.null(self$`warehouse`)) {
        ShipmentInfoDTOObject[["warehouse"]] <-
          self$`warehouse`$toJSON()
      }
      if (!is.null(self$`warehouseTo`)) {
        ShipmentInfoDTOObject[["warehouseTo"]] <-
          self$`warehouseTo`$toJSON()
      }
      if (!is.null(self$`externalId`)) {
        ShipmentInfoDTOObject[["externalId"]] <-
          self$`externalId`
      }
      if (!is.null(self$`deliveryService`)) {
        ShipmentInfoDTOObject[["deliveryService"]] <-
          self$`deliveryService`$toJSON()
      }
      if (!is.null(self$`palletsCount`)) {
        ShipmentInfoDTOObject[["palletsCount"]] <-
          self$`palletsCount`$toJSON()
      }
      if (!is.null(self$`orderIds`)) {
        ShipmentInfoDTOObject[["orderIds"]] <-
          self$`orderIds`
      }
      if (!is.null(self$`draftCount`)) {
        ShipmentInfoDTOObject[["draftCount"]] <-
          self$`draftCount`
      }
      if (!is.null(self$`plannedCount`)) {
        ShipmentInfoDTOObject[["plannedCount"]] <-
          self$`plannedCount`
      }
      if (!is.null(self$`factCount`)) {
        ShipmentInfoDTOObject[["factCount"]] <-
          self$`factCount`
      }
      if (!is.null(self$`status`)) {
        ShipmentInfoDTOObject[["status"]] <-
          self$`status`$toJSON()
      }
      if (!is.null(self$`statusDescription`)) {
        ShipmentInfoDTOObject[["statusDescription"]] <-
          self$`statusDescription`
      }
      if (!is.null(self$`statusUpdateTime`)) {
        ShipmentInfoDTOObject[["statusUpdateTime"]] <-
          self$`statusUpdateTime`
      }
      ShipmentInfoDTOObject
    },
    #' Deserialize JSON string into an instance of ShipmentInfoDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of ShipmentInfoDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of ShipmentInfoDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`planIntervalFrom`)) {
        self$`planIntervalFrom` <- this_object$`planIntervalFrom`
      }
      if (!is.null(this_object$`planIntervalTo`)) {
        self$`planIntervalTo` <- this_object$`planIntervalTo`
      }
      if (!is.null(this_object$`shipmentType`)) {
        `shipmenttype_object` <- ShipmentType$new()
        `shipmenttype_object`$fromJSON(jsonlite::toJSON(this_object$`shipmentType`, auto_unbox = TRUE, digits = NA))
        self$`shipmentType` <- `shipmenttype_object`
      }
      if (!is.null(this_object$`warehouse`)) {
        `warehouse_object` <- PartnerShipmentWarehouseDTO$new()
        `warehouse_object`$fromJSON(jsonlite::toJSON(this_object$`warehouse`, auto_unbox = TRUE, digits = NA))
        self$`warehouse` <- `warehouse_object`
      }
      if (!is.null(this_object$`warehouseTo`)) {
        `warehouseto_object` <- PartnerShipmentWarehouseDTO$new()
        `warehouseto_object`$fromJSON(jsonlite::toJSON(this_object$`warehouseTo`, auto_unbox = TRUE, digits = NA))
        self$`warehouseTo` <- `warehouseto_object`
      }
      if (!is.null(this_object$`externalId`)) {
        self$`externalId` <- this_object$`externalId`
      }
      if (!is.null(this_object$`deliveryService`)) {
        `deliveryservice_object` <- DeliveryServiceDTO$new()
        `deliveryservice_object`$fromJSON(jsonlite::toJSON(this_object$`deliveryService`, auto_unbox = TRUE, digits = NA))
        self$`deliveryService` <- `deliveryservice_object`
      }
      if (!is.null(this_object$`palletsCount`)) {
        `palletscount_object` <- PalletsCountDTO$new()
        `palletscount_object`$fromJSON(jsonlite::toJSON(this_object$`palletsCount`, auto_unbox = TRUE, digits = NA))
        self$`palletsCount` <- `palletscount_object`
      }
      if (!is.null(this_object$`orderIds`)) {
        self$`orderIds` <- ApiClient$new()$deserializeObj(this_object$`orderIds`, "set[integer]", loadNamespace("ympa_r_client"))
        if (!identical(self$`orderIds`, unique(self$`orderIds`))) {
          stop("Error! Items in `orderIds` are not unique.")
        }
      }
      if (!is.null(this_object$`draftCount`)) {
        self$`draftCount` <- this_object$`draftCount`
      }
      if (!is.null(this_object$`plannedCount`)) {
        self$`plannedCount` <- this_object$`plannedCount`
      }
      if (!is.null(this_object$`factCount`)) {
        self$`factCount` <- this_object$`factCount`
      }
      if (!is.null(this_object$`status`)) {
        `status_object` <- ShipmentStatusType$new()
        `status_object`$fromJSON(jsonlite::toJSON(this_object$`status`, auto_unbox = TRUE, digits = NA))
        self$`status` <- `status_object`
      }
      if (!is.null(this_object$`statusDescription`)) {
        self$`statusDescription` <- this_object$`statusDescription`
      }
      if (!is.null(this_object$`statusUpdateTime`)) {
        self$`statusUpdateTime` <- this_object$`statusUpdateTime`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return ShipmentInfoDTO in JSON format
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
        if (!is.null(self$`planIntervalFrom`)) {
          sprintf(
          '"planIntervalFrom":
            "%s"
                    ',
          self$`planIntervalFrom`
          )
        },
        if (!is.null(self$`planIntervalTo`)) {
          sprintf(
          '"planIntervalTo":
            "%s"
                    ',
          self$`planIntervalTo`
          )
        },
        if (!is.null(self$`shipmentType`)) {
          sprintf(
          '"shipmentType":
          %s
          ',
          jsonlite::toJSON(self$`shipmentType`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`warehouse`)) {
          sprintf(
          '"warehouse":
          %s
          ',
          jsonlite::toJSON(self$`warehouse`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`warehouseTo`)) {
          sprintf(
          '"warehouseTo":
          %s
          ',
          jsonlite::toJSON(self$`warehouseTo`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`externalId`)) {
          sprintf(
          '"externalId":
            "%s"
                    ',
          self$`externalId`
          )
        },
        if (!is.null(self$`deliveryService`)) {
          sprintf(
          '"deliveryService":
          %s
          ',
          jsonlite::toJSON(self$`deliveryService`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`palletsCount`)) {
          sprintf(
          '"palletsCount":
          %s
          ',
          jsonlite::toJSON(self$`palletsCount`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`orderIds`)) {
          sprintf(
          '"orderIds":
             [%s]
          ',
          paste(unlist(lapply(self$`orderIds`, function(x) paste0('"', x, '"'))), collapse = ",")
          )
        },
        if (!is.null(self$`draftCount`)) {
          sprintf(
          '"draftCount":
            %d
                    ',
          self$`draftCount`
          )
        },
        if (!is.null(self$`plannedCount`)) {
          sprintf(
          '"plannedCount":
            %d
                    ',
          self$`plannedCount`
          )
        },
        if (!is.null(self$`factCount`)) {
          sprintf(
          '"factCount":
            %d
                    ',
          self$`factCount`
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
        if (!is.null(self$`statusDescription`)) {
          sprintf(
          '"statusDescription":
            "%s"
                    ',
          self$`statusDescription`
          )
        },
        if (!is.null(self$`statusUpdateTime`)) {
          sprintf(
          '"statusUpdateTime":
            "%s"
                    ',
          self$`statusUpdateTime`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of ShipmentInfoDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of ShipmentInfoDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of ShipmentInfoDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`id` <- this_object$`id`
      self$`planIntervalFrom` <- this_object$`planIntervalFrom`
      self$`planIntervalTo` <- this_object$`planIntervalTo`
      self$`shipmentType` <- ShipmentType$new()$fromJSON(jsonlite::toJSON(this_object$`shipmentType`, auto_unbox = TRUE, digits = NA))
      self$`warehouse` <- PartnerShipmentWarehouseDTO$new()$fromJSON(jsonlite::toJSON(this_object$`warehouse`, auto_unbox = TRUE, digits = NA))
      self$`warehouseTo` <- PartnerShipmentWarehouseDTO$new()$fromJSON(jsonlite::toJSON(this_object$`warehouseTo`, auto_unbox = TRUE, digits = NA))
      self$`externalId` <- this_object$`externalId`
      self$`deliveryService` <- DeliveryServiceDTO$new()$fromJSON(jsonlite::toJSON(this_object$`deliveryService`, auto_unbox = TRUE, digits = NA))
      self$`palletsCount` <- PalletsCountDTO$new()$fromJSON(jsonlite::toJSON(this_object$`palletsCount`, auto_unbox = TRUE, digits = NA))
      self$`orderIds` <- ApiClient$new()$deserializeObj(this_object$`orderIds`, "set[integer]", loadNamespace("ympa_r_client"))
      if (!identical(self$`orderIds`, unique(self$`orderIds`))) {
        stop("Error! Items in `orderIds` are not unique.")
      }
      self$`draftCount` <- this_object$`draftCount`
      self$`plannedCount` <- this_object$`plannedCount`
      self$`factCount` <- this_object$`factCount`
      self$`status` <- ShipmentStatusType$new()$fromJSON(jsonlite::toJSON(this_object$`status`, auto_unbox = TRUE, digits = NA))
      self$`statusDescription` <- this_object$`statusDescription`
      self$`statusUpdateTime` <- this_object$`statusUpdateTime`
      self
    },
    #' Validate JSON input with respect to ShipmentInfoDTO
    #'
    #' @description
    #' Validate JSON input with respect to ShipmentInfoDTO and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `orderIds`
      if (!is.null(input_json$`orderIds`)) {
        stopifnot(is.vector(input_json$`orderIds`), length(input_json$`orderIds`) != 0)
        if (!identical(input_json$`orderIds`, unique(input_json$`orderIds`))) {
          stop("Error! Items in `orderIds` are not unique.")
        }
        tmp <- sapply(input_json$`orderIds`, function(x) stopifnot(is.character(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ShipmentInfoDTO: the required field `orderIds` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of ShipmentInfoDTO
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
      # check if the required `orderIds` is null
      if (is.null(self$`orderIds`)) {
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
      # check if the required `orderIds` is null
      if (is.null(self$`orderIds`)) {
        invalid_fields["orderIds"] <- "Non-nullable required field `orderIds` cannot be null."
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
# ShipmentInfoDTO$unlock()
#
## Below is an example to define the print function
# ShipmentInfoDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# ShipmentInfoDTO$lock()

