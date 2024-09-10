#' Create a new ReturnDTO
#'
#' @description
#' Возврат заказа.
#'
#' @docType class
#' @title ReturnDTO
#' @description ReturnDTO Class
#' @format An \code{R6Class} generator object
#' @field id Идентификатор возврата. integer [optional]
#' @field orderId Номер заказа. integer [optional]
#' @field creationDate Дата создания возврата клиентом. character [optional]
#' @field updateDate Дата обновления возврата. character [optional]
#' @field refundStatus  \link{RefundStatusType} [optional]
#' @field logisticPickupPoint  \link{LogisticPickupPointDTO} [optional]
#' @field shipmentRecipientType  \link{RecipientType} [optional]
#' @field shipmentStatus  \link{ReturnShipmentStatusType} [optional]
#' @field refundAmount Сумма возврата. integer [optional]
#' @field items Список товаров в возврате. list(\link{ReturnItemDTO})
#' @field returnType  \link{ReturnType} [optional]
#' @field fastReturn Используется ли опция **Быстрый возврат денег за дешевый брак**. character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ReturnDTO <- R6::R6Class(
  "ReturnDTO",
  public = list(
    `id` = NULL,
    `orderId` = NULL,
    `creationDate` = NULL,
    `updateDate` = NULL,
    `refundStatus` = NULL,
    `logisticPickupPoint` = NULL,
    `shipmentRecipientType` = NULL,
    `shipmentStatus` = NULL,
    `refundAmount` = NULL,
    `items` = NULL,
    `returnType` = NULL,
    `fastReturn` = NULL,
    #' Initialize a new ReturnDTO class.
    #'
    #' @description
    #' Initialize a new ReturnDTO class.
    #'
    #' @param items Список товаров в возврате.
    #' @param id Идентификатор возврата.
    #' @param orderId Номер заказа.
    #' @param creationDate Дата создания возврата клиентом.
    #' @param updateDate Дата обновления возврата.
    #' @param refundStatus refundStatus
    #' @param logisticPickupPoint logisticPickupPoint
    #' @param shipmentRecipientType shipmentRecipientType
    #' @param shipmentStatus shipmentStatus
    #' @param refundAmount Сумма возврата.
    #' @param returnType returnType
    #' @param fastReturn Используется ли опция **Быстрый возврат денег за дешевый брак**.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`items`, `id` = NULL, `orderId` = NULL, `creationDate` = NULL, `updateDate` = NULL, `refundStatus` = NULL, `logisticPickupPoint` = NULL, `shipmentRecipientType` = NULL, `shipmentStatus` = NULL, `refundAmount` = NULL, `returnType` = NULL, `fastReturn` = NULL, ...) {
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
      if (!is.null(`orderId`)) {
        if (!(is.numeric(`orderId`) && length(`orderId`) == 1)) {
          stop(paste("Error! Invalid data for `orderId`. Must be an integer:", `orderId`))
        }
        self$`orderId` <- `orderId`
      }
      if (!is.null(`creationDate`)) {
        if (!is.character(`creationDate`)) {
          stop(paste("Error! Invalid data for `creationDate`. Must be a string:", `creationDate`))
        }
        self$`creationDate` <- `creationDate`
      }
      if (!is.null(`updateDate`)) {
        if (!is.character(`updateDate`)) {
          stop(paste("Error! Invalid data for `updateDate`. Must be a string:", `updateDate`))
        }
        self$`updateDate` <- `updateDate`
      }
      if (!is.null(`refundStatus`)) {
        if (!(`refundStatus` %in% c())) {
          stop(paste("Error! \"", `refundStatus`, "\" cannot be assigned to `refundStatus`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`refundStatus`))
        self$`refundStatus` <- `refundStatus`
      }
      if (!is.null(`logisticPickupPoint`)) {
        stopifnot(R6::is.R6(`logisticPickupPoint`))
        self$`logisticPickupPoint` <- `logisticPickupPoint`
      }
      if (!is.null(`shipmentRecipientType`)) {
        if (!(`shipmentRecipientType` %in% c())) {
          stop(paste("Error! \"", `shipmentRecipientType`, "\" cannot be assigned to `shipmentRecipientType`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`shipmentRecipientType`))
        self$`shipmentRecipientType` <- `shipmentRecipientType`
      }
      if (!is.null(`shipmentStatus`)) {
        if (!(`shipmentStatus` %in% c())) {
          stop(paste("Error! \"", `shipmentStatus`, "\" cannot be assigned to `shipmentStatus`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`shipmentStatus`))
        self$`shipmentStatus` <- `shipmentStatus`
      }
      if (!is.null(`refundAmount`)) {
        if (!(is.numeric(`refundAmount`) && length(`refundAmount`) == 1)) {
          stop(paste("Error! Invalid data for `refundAmount`. Must be an integer:", `refundAmount`))
        }
        self$`refundAmount` <- `refundAmount`
      }
      if (!is.null(`returnType`)) {
        if (!(`returnType` %in% c())) {
          stop(paste("Error! \"", `returnType`, "\" cannot be assigned to `returnType`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`returnType`))
        self$`returnType` <- `returnType`
      }
      if (!is.null(`fastReturn`)) {
        if (!(is.logical(`fastReturn`) && length(`fastReturn`) == 1)) {
          stop(paste("Error! Invalid data for `fastReturn`. Must be a boolean:", `fastReturn`))
        }
        self$`fastReturn` <- `fastReturn`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return ReturnDTO in JSON format
    #' @export
    toJSON = function() {
      ReturnDTOObject <- list()
      if (!is.null(self$`id`)) {
        ReturnDTOObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`orderId`)) {
        ReturnDTOObject[["orderId"]] <-
          self$`orderId`
      }
      if (!is.null(self$`creationDate`)) {
        ReturnDTOObject[["creationDate"]] <-
          self$`creationDate`
      }
      if (!is.null(self$`updateDate`)) {
        ReturnDTOObject[["updateDate"]] <-
          self$`updateDate`
      }
      if (!is.null(self$`refundStatus`)) {
        ReturnDTOObject[["refundStatus"]] <-
          self$`refundStatus`$toJSON()
      }
      if (!is.null(self$`logisticPickupPoint`)) {
        ReturnDTOObject[["logisticPickupPoint"]] <-
          self$`logisticPickupPoint`$toJSON()
      }
      if (!is.null(self$`shipmentRecipientType`)) {
        ReturnDTOObject[["shipmentRecipientType"]] <-
          self$`shipmentRecipientType`$toJSON()
      }
      if (!is.null(self$`shipmentStatus`)) {
        ReturnDTOObject[["shipmentStatus"]] <-
          self$`shipmentStatus`$toJSON()
      }
      if (!is.null(self$`refundAmount`)) {
        ReturnDTOObject[["refundAmount"]] <-
          self$`refundAmount`
      }
      if (!is.null(self$`items`)) {
        ReturnDTOObject[["items"]] <-
          lapply(self$`items`, function(x) x$toJSON())
      }
      if (!is.null(self$`returnType`)) {
        ReturnDTOObject[["returnType"]] <-
          self$`returnType`$toJSON()
      }
      if (!is.null(self$`fastReturn`)) {
        ReturnDTOObject[["fastReturn"]] <-
          self$`fastReturn`
      }
      ReturnDTOObject
    },
    #' Deserialize JSON string into an instance of ReturnDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of ReturnDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of ReturnDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`orderId`)) {
        self$`orderId` <- this_object$`orderId`
      }
      if (!is.null(this_object$`creationDate`)) {
        self$`creationDate` <- this_object$`creationDate`
      }
      if (!is.null(this_object$`updateDate`)) {
        self$`updateDate` <- this_object$`updateDate`
      }
      if (!is.null(this_object$`refundStatus`)) {
        `refundstatus_object` <- RefundStatusType$new()
        `refundstatus_object`$fromJSON(jsonlite::toJSON(this_object$`refundStatus`, auto_unbox = TRUE, digits = NA))
        self$`refundStatus` <- `refundstatus_object`
      }
      if (!is.null(this_object$`logisticPickupPoint`)) {
        `logisticpickuppoint_object` <- LogisticPickupPointDTO$new()
        `logisticpickuppoint_object`$fromJSON(jsonlite::toJSON(this_object$`logisticPickupPoint`, auto_unbox = TRUE, digits = NA))
        self$`logisticPickupPoint` <- `logisticpickuppoint_object`
      }
      if (!is.null(this_object$`shipmentRecipientType`)) {
        `shipmentrecipienttype_object` <- RecipientType$new()
        `shipmentrecipienttype_object`$fromJSON(jsonlite::toJSON(this_object$`shipmentRecipientType`, auto_unbox = TRUE, digits = NA))
        self$`shipmentRecipientType` <- `shipmentrecipienttype_object`
      }
      if (!is.null(this_object$`shipmentStatus`)) {
        `shipmentstatus_object` <- ReturnShipmentStatusType$new()
        `shipmentstatus_object`$fromJSON(jsonlite::toJSON(this_object$`shipmentStatus`, auto_unbox = TRUE, digits = NA))
        self$`shipmentStatus` <- `shipmentstatus_object`
      }
      if (!is.null(this_object$`refundAmount`)) {
        self$`refundAmount` <- this_object$`refundAmount`
      }
      if (!is.null(this_object$`items`)) {
        self$`items` <- ApiClient$new()$deserializeObj(this_object$`items`, "array[ReturnItemDTO]", loadNamespace("ympa_r_client"))
      }
      if (!is.null(this_object$`returnType`)) {
        `returntype_object` <- ReturnType$new()
        `returntype_object`$fromJSON(jsonlite::toJSON(this_object$`returnType`, auto_unbox = TRUE, digits = NA))
        self$`returnType` <- `returntype_object`
      }
      if (!is.null(this_object$`fastReturn`)) {
        self$`fastReturn` <- this_object$`fastReturn`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return ReturnDTO in JSON format
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
        if (!is.null(self$`orderId`)) {
          sprintf(
          '"orderId":
            %d
                    ',
          self$`orderId`
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
        if (!is.null(self$`updateDate`)) {
          sprintf(
          '"updateDate":
            "%s"
                    ',
          self$`updateDate`
          )
        },
        if (!is.null(self$`refundStatus`)) {
          sprintf(
          '"refundStatus":
          %s
          ',
          jsonlite::toJSON(self$`refundStatus`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`logisticPickupPoint`)) {
          sprintf(
          '"logisticPickupPoint":
          %s
          ',
          jsonlite::toJSON(self$`logisticPickupPoint`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`shipmentRecipientType`)) {
          sprintf(
          '"shipmentRecipientType":
          %s
          ',
          jsonlite::toJSON(self$`shipmentRecipientType`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`shipmentStatus`)) {
          sprintf(
          '"shipmentStatus":
          %s
          ',
          jsonlite::toJSON(self$`shipmentStatus`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`refundAmount`)) {
          sprintf(
          '"refundAmount":
            %d
                    ',
          self$`refundAmount`
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
        if (!is.null(self$`returnType`)) {
          sprintf(
          '"returnType":
          %s
          ',
          jsonlite::toJSON(self$`returnType`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`fastReturn`)) {
          sprintf(
          '"fastReturn":
            %s
                    ',
          tolower(self$`fastReturn`)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of ReturnDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of ReturnDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of ReturnDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`id` <- this_object$`id`
      self$`orderId` <- this_object$`orderId`
      self$`creationDate` <- this_object$`creationDate`
      self$`updateDate` <- this_object$`updateDate`
      self$`refundStatus` <- RefundStatusType$new()$fromJSON(jsonlite::toJSON(this_object$`refundStatus`, auto_unbox = TRUE, digits = NA))
      self$`logisticPickupPoint` <- LogisticPickupPointDTO$new()$fromJSON(jsonlite::toJSON(this_object$`logisticPickupPoint`, auto_unbox = TRUE, digits = NA))
      self$`shipmentRecipientType` <- RecipientType$new()$fromJSON(jsonlite::toJSON(this_object$`shipmentRecipientType`, auto_unbox = TRUE, digits = NA))
      self$`shipmentStatus` <- ReturnShipmentStatusType$new()$fromJSON(jsonlite::toJSON(this_object$`shipmentStatus`, auto_unbox = TRUE, digits = NA))
      self$`refundAmount` <- this_object$`refundAmount`
      self$`items` <- ApiClient$new()$deserializeObj(this_object$`items`, "array[ReturnItemDTO]", loadNamespace("ympa_r_client"))
      self$`returnType` <- ReturnType$new()$fromJSON(jsonlite::toJSON(this_object$`returnType`, auto_unbox = TRUE, digits = NA))
      self$`fastReturn` <- this_object$`fastReturn`
      self
    },
    #' Validate JSON input with respect to ReturnDTO
    #'
    #' @description
    #' Validate JSON input with respect to ReturnDTO and throw an exception if invalid
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
        stop(paste("The JSON input `", input, "` is invalid for ReturnDTO: the required field `items` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of ReturnDTO
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
# ReturnDTO$unlock()
#
## Below is an example to define the print function
# ReturnDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# ReturnDTO$lock()

