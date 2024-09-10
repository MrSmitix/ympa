#' Create a new ParcelBoxLabelDTO
#'
#' @description
#' Информация о ярлыке для коробки.
#'
#' @docType class
#' @title ParcelBoxLabelDTO
#' @description ParcelBoxLabelDTO Class
#' @format An \code{R6Class} generator object
#' @field url Соответствует URL, по которому выполняется запрос [GET campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes/{boxId}/label](../../reference/orders/generateOrderLabel.md). character
#' @field supplierName Юридическое название магазина. character
#' @field deliveryServiceName Юридическое название службы доставки. character
#' @field orderId Идентификатор заказа в системе Маркета. integer
#' @field orderNum Идентификатор заказа в информационной системе магазина.  Совпадает с `orderId`, если Маркету неизвестен номер заказа в системе магазина. character
#' @field recipientName Фамилия и инициалы получателя заказа. character
#' @field boxId Идентификатор коробки. integer
#' @field fulfilmentId Идентификатор коробки в информационной системе магазина.  Возвращается в формате: `номер заказа на Маркете-номер коробки`. Например, `7206821‑1`, `7206821‑2` и т. д. character
#' @field place Номер коробки в заказе. Возвращается в формате: `номер места/общее количество мест`. character
#' @field weight {\% note warning \"\" \%}  Этот параметр устарел. Не используйте его.  {\% endnote \%}  Общая масса всех товаров в заказе. Возвращается в формате: `weight кг`. character
#' @field deliveryServiceId Идентификатор службы доставки. Информацию о службе доставки можно получить с помощью запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md). character
#' @field deliveryAddress Адрес получателя. character [optional]
#' @field shipmentDate Дата отгрузки в формате `dd.MM.yyyy`. character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ParcelBoxLabelDTO <- R6::R6Class(
  "ParcelBoxLabelDTO",
  public = list(
    `url` = NULL,
    `supplierName` = NULL,
    `deliveryServiceName` = NULL,
    `orderId` = NULL,
    `orderNum` = NULL,
    `recipientName` = NULL,
    `boxId` = NULL,
    `fulfilmentId` = NULL,
    `place` = NULL,
    `weight` = NULL,
    `deliveryServiceId` = NULL,
    `deliveryAddress` = NULL,
    `shipmentDate` = NULL,
    #' Initialize a new ParcelBoxLabelDTO class.
    #'
    #' @description
    #' Initialize a new ParcelBoxLabelDTO class.
    #'
    #' @param url Соответствует URL, по которому выполняется запрос [GET campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes/{boxId}/label](../../reference/orders/generateOrderLabel.md).
    #' @param supplierName Юридическое название магазина.
    #' @param deliveryServiceName Юридическое название службы доставки.
    #' @param orderId Идентификатор заказа в системе Маркета.
    #' @param orderNum Идентификатор заказа в информационной системе магазина.  Совпадает с `orderId`, если Маркету неизвестен номер заказа в системе магазина.
    #' @param recipientName Фамилия и инициалы получателя заказа.
    #' @param boxId Идентификатор коробки.
    #' @param fulfilmentId Идентификатор коробки в информационной системе магазина.  Возвращается в формате: `номер заказа на Маркете-номер коробки`. Например, `7206821‑1`, `7206821‑2` и т. д.
    #' @param place Номер коробки в заказе. Возвращается в формате: `номер места/общее количество мест`.
    #' @param weight {\% note warning \"\" \%}  Этот параметр устарел. Не используйте его.  {\% endnote \%}  Общая масса всех товаров в заказе. Возвращается в формате: `weight кг`.
    #' @param deliveryServiceId Идентификатор службы доставки. Информацию о службе доставки можно получить с помощью запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md).
    #' @param deliveryAddress Адрес получателя.
    #' @param shipmentDate Дата отгрузки в формате `dd.MM.yyyy`.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`url`, `supplierName`, `deliveryServiceName`, `orderId`, `orderNum`, `recipientName`, `boxId`, `fulfilmentId`, `place`, `weight`, `deliveryServiceId`, `deliveryAddress` = NULL, `shipmentDate` = NULL, ...) {
      if (!missing(`url`)) {
        if (!(is.character(`url`) && length(`url`) == 1)) {
          stop(paste("Error! Invalid data for `url`. Must be a string:", `url`))
        }
        self$`url` <- `url`
      }
      if (!missing(`supplierName`)) {
        if (!(is.character(`supplierName`) && length(`supplierName`) == 1)) {
          stop(paste("Error! Invalid data for `supplierName`. Must be a string:", `supplierName`))
        }
        self$`supplierName` <- `supplierName`
      }
      if (!missing(`deliveryServiceName`)) {
        if (!(is.character(`deliveryServiceName`) && length(`deliveryServiceName`) == 1)) {
          stop(paste("Error! Invalid data for `deliveryServiceName`. Must be a string:", `deliveryServiceName`))
        }
        self$`deliveryServiceName` <- `deliveryServiceName`
      }
      if (!missing(`orderId`)) {
        if (!(is.numeric(`orderId`) && length(`orderId`) == 1)) {
          stop(paste("Error! Invalid data for `orderId`. Must be an integer:", `orderId`))
        }
        self$`orderId` <- `orderId`
      }
      if (!missing(`orderNum`)) {
        if (!(is.character(`orderNum`) && length(`orderNum`) == 1)) {
          stop(paste("Error! Invalid data for `orderNum`. Must be a string:", `orderNum`))
        }
        self$`orderNum` <- `orderNum`
      }
      if (!missing(`recipientName`)) {
        if (!(is.character(`recipientName`) && length(`recipientName`) == 1)) {
          stop(paste("Error! Invalid data for `recipientName`. Must be a string:", `recipientName`))
        }
        self$`recipientName` <- `recipientName`
      }
      if (!missing(`boxId`)) {
        if (!(is.numeric(`boxId`) && length(`boxId`) == 1)) {
          stop(paste("Error! Invalid data for `boxId`. Must be an integer:", `boxId`))
        }
        self$`boxId` <- `boxId`
      }
      if (!missing(`fulfilmentId`)) {
        if (!(is.character(`fulfilmentId`) && length(`fulfilmentId`) == 1)) {
          stop(paste("Error! Invalid data for `fulfilmentId`. Must be a string:", `fulfilmentId`))
        }
        self$`fulfilmentId` <- `fulfilmentId`
      }
      if (!missing(`place`)) {
        if (!(is.character(`place`) && length(`place`) == 1)) {
          stop(paste("Error! Invalid data for `place`. Must be a string:", `place`))
        }
        self$`place` <- `place`
      }
      if (!missing(`weight`)) {
        if (!(is.character(`weight`) && length(`weight`) == 1)) {
          stop(paste("Error! Invalid data for `weight`. Must be a string:", `weight`))
        }
        self$`weight` <- `weight`
      }
      if (!missing(`deliveryServiceId`)) {
        if (!(is.character(`deliveryServiceId`) && length(`deliveryServiceId`) == 1)) {
          stop(paste("Error! Invalid data for `deliveryServiceId`. Must be a string:", `deliveryServiceId`))
        }
        self$`deliveryServiceId` <- `deliveryServiceId`
      }
      if (!is.null(`deliveryAddress`)) {
        if (!(is.character(`deliveryAddress`) && length(`deliveryAddress`) == 1)) {
          stop(paste("Error! Invalid data for `deliveryAddress`. Must be a string:", `deliveryAddress`))
        }
        self$`deliveryAddress` <- `deliveryAddress`
      }
      if (!is.null(`shipmentDate`)) {
        if (!(is.character(`shipmentDate`) && length(`shipmentDate`) == 1)) {
          stop(paste("Error! Invalid data for `shipmentDate`. Must be a string:", `shipmentDate`))
        }
        self$`shipmentDate` <- `shipmentDate`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return ParcelBoxLabelDTO in JSON format
    #' @export
    toJSON = function() {
      ParcelBoxLabelDTOObject <- list()
      if (!is.null(self$`url`)) {
        ParcelBoxLabelDTOObject[["url"]] <-
          self$`url`
      }
      if (!is.null(self$`supplierName`)) {
        ParcelBoxLabelDTOObject[["supplierName"]] <-
          self$`supplierName`
      }
      if (!is.null(self$`deliveryServiceName`)) {
        ParcelBoxLabelDTOObject[["deliveryServiceName"]] <-
          self$`deliveryServiceName`
      }
      if (!is.null(self$`orderId`)) {
        ParcelBoxLabelDTOObject[["orderId"]] <-
          self$`orderId`
      }
      if (!is.null(self$`orderNum`)) {
        ParcelBoxLabelDTOObject[["orderNum"]] <-
          self$`orderNum`
      }
      if (!is.null(self$`recipientName`)) {
        ParcelBoxLabelDTOObject[["recipientName"]] <-
          self$`recipientName`
      }
      if (!is.null(self$`boxId`)) {
        ParcelBoxLabelDTOObject[["boxId"]] <-
          self$`boxId`
      }
      if (!is.null(self$`fulfilmentId`)) {
        ParcelBoxLabelDTOObject[["fulfilmentId"]] <-
          self$`fulfilmentId`
      }
      if (!is.null(self$`place`)) {
        ParcelBoxLabelDTOObject[["place"]] <-
          self$`place`
      }
      if (!is.null(self$`weight`)) {
        ParcelBoxLabelDTOObject[["weight"]] <-
          self$`weight`
      }
      if (!is.null(self$`deliveryServiceId`)) {
        ParcelBoxLabelDTOObject[["deliveryServiceId"]] <-
          self$`deliveryServiceId`
      }
      if (!is.null(self$`deliveryAddress`)) {
        ParcelBoxLabelDTOObject[["deliveryAddress"]] <-
          self$`deliveryAddress`
      }
      if (!is.null(self$`shipmentDate`)) {
        ParcelBoxLabelDTOObject[["shipmentDate"]] <-
          self$`shipmentDate`
      }
      ParcelBoxLabelDTOObject
    },
    #' Deserialize JSON string into an instance of ParcelBoxLabelDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of ParcelBoxLabelDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of ParcelBoxLabelDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`url`)) {
        self$`url` <- this_object$`url`
      }
      if (!is.null(this_object$`supplierName`)) {
        self$`supplierName` <- this_object$`supplierName`
      }
      if (!is.null(this_object$`deliveryServiceName`)) {
        self$`deliveryServiceName` <- this_object$`deliveryServiceName`
      }
      if (!is.null(this_object$`orderId`)) {
        self$`orderId` <- this_object$`orderId`
      }
      if (!is.null(this_object$`orderNum`)) {
        self$`orderNum` <- this_object$`orderNum`
      }
      if (!is.null(this_object$`recipientName`)) {
        self$`recipientName` <- this_object$`recipientName`
      }
      if (!is.null(this_object$`boxId`)) {
        self$`boxId` <- this_object$`boxId`
      }
      if (!is.null(this_object$`fulfilmentId`)) {
        self$`fulfilmentId` <- this_object$`fulfilmentId`
      }
      if (!is.null(this_object$`place`)) {
        self$`place` <- this_object$`place`
      }
      if (!is.null(this_object$`weight`)) {
        self$`weight` <- this_object$`weight`
      }
      if (!is.null(this_object$`deliveryServiceId`)) {
        self$`deliveryServiceId` <- this_object$`deliveryServiceId`
      }
      if (!is.null(this_object$`deliveryAddress`)) {
        self$`deliveryAddress` <- this_object$`deliveryAddress`
      }
      if (!is.null(this_object$`shipmentDate`)) {
        self$`shipmentDate` <- this_object$`shipmentDate`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return ParcelBoxLabelDTO in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`url`)) {
          sprintf(
          '"url":
            "%s"
                    ',
          self$`url`
          )
        },
        if (!is.null(self$`supplierName`)) {
          sprintf(
          '"supplierName":
            "%s"
                    ',
          self$`supplierName`
          )
        },
        if (!is.null(self$`deliveryServiceName`)) {
          sprintf(
          '"deliveryServiceName":
            "%s"
                    ',
          self$`deliveryServiceName`
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
        if (!is.null(self$`orderNum`)) {
          sprintf(
          '"orderNum":
            "%s"
                    ',
          self$`orderNum`
          )
        },
        if (!is.null(self$`recipientName`)) {
          sprintf(
          '"recipientName":
            "%s"
                    ',
          self$`recipientName`
          )
        },
        if (!is.null(self$`boxId`)) {
          sprintf(
          '"boxId":
            %d
                    ',
          self$`boxId`
          )
        },
        if (!is.null(self$`fulfilmentId`)) {
          sprintf(
          '"fulfilmentId":
            "%s"
                    ',
          self$`fulfilmentId`
          )
        },
        if (!is.null(self$`place`)) {
          sprintf(
          '"place":
            "%s"
                    ',
          self$`place`
          )
        },
        if (!is.null(self$`weight`)) {
          sprintf(
          '"weight":
            "%s"
                    ',
          self$`weight`
          )
        },
        if (!is.null(self$`deliveryServiceId`)) {
          sprintf(
          '"deliveryServiceId":
            "%s"
                    ',
          self$`deliveryServiceId`
          )
        },
        if (!is.null(self$`deliveryAddress`)) {
          sprintf(
          '"deliveryAddress":
            "%s"
                    ',
          self$`deliveryAddress`
          )
        },
        if (!is.null(self$`shipmentDate`)) {
          sprintf(
          '"shipmentDate":
            "%s"
                    ',
          self$`shipmentDate`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of ParcelBoxLabelDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of ParcelBoxLabelDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of ParcelBoxLabelDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`url` <- this_object$`url`
      self$`supplierName` <- this_object$`supplierName`
      self$`deliveryServiceName` <- this_object$`deliveryServiceName`
      self$`orderId` <- this_object$`orderId`
      self$`orderNum` <- this_object$`orderNum`
      self$`recipientName` <- this_object$`recipientName`
      self$`boxId` <- this_object$`boxId`
      self$`fulfilmentId` <- this_object$`fulfilmentId`
      self$`place` <- this_object$`place`
      self$`weight` <- this_object$`weight`
      self$`deliveryServiceId` <- this_object$`deliveryServiceId`
      self$`deliveryAddress` <- this_object$`deliveryAddress`
      self$`shipmentDate` <- this_object$`shipmentDate`
      self
    },
    #' Validate JSON input with respect to ParcelBoxLabelDTO
    #'
    #' @description
    #' Validate JSON input with respect to ParcelBoxLabelDTO and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `url`
      if (!is.null(input_json$`url`)) {
        if (!(is.character(input_json$`url`) && length(input_json$`url`) == 1)) {
          stop(paste("Error! Invalid data for `url`. Must be a string:", input_json$`url`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ParcelBoxLabelDTO: the required field `url` is missing."))
      }
      # check the required field `supplierName`
      if (!is.null(input_json$`supplierName`)) {
        if (!(is.character(input_json$`supplierName`) && length(input_json$`supplierName`) == 1)) {
          stop(paste("Error! Invalid data for `supplierName`. Must be a string:", input_json$`supplierName`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ParcelBoxLabelDTO: the required field `supplierName` is missing."))
      }
      # check the required field `deliveryServiceName`
      if (!is.null(input_json$`deliveryServiceName`)) {
        if (!(is.character(input_json$`deliveryServiceName`) && length(input_json$`deliveryServiceName`) == 1)) {
          stop(paste("Error! Invalid data for `deliveryServiceName`. Must be a string:", input_json$`deliveryServiceName`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ParcelBoxLabelDTO: the required field `deliveryServiceName` is missing."))
      }
      # check the required field `orderId`
      if (!is.null(input_json$`orderId`)) {
        if (!(is.numeric(input_json$`orderId`) && length(input_json$`orderId`) == 1)) {
          stop(paste("Error! Invalid data for `orderId`. Must be an integer:", input_json$`orderId`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ParcelBoxLabelDTO: the required field `orderId` is missing."))
      }
      # check the required field `orderNum`
      if (!is.null(input_json$`orderNum`)) {
        if (!(is.character(input_json$`orderNum`) && length(input_json$`orderNum`) == 1)) {
          stop(paste("Error! Invalid data for `orderNum`. Must be a string:", input_json$`orderNum`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ParcelBoxLabelDTO: the required field `orderNum` is missing."))
      }
      # check the required field `recipientName`
      if (!is.null(input_json$`recipientName`)) {
        if (!(is.character(input_json$`recipientName`) && length(input_json$`recipientName`) == 1)) {
          stop(paste("Error! Invalid data for `recipientName`. Must be a string:", input_json$`recipientName`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ParcelBoxLabelDTO: the required field `recipientName` is missing."))
      }
      # check the required field `boxId`
      if (!is.null(input_json$`boxId`)) {
        if (!(is.numeric(input_json$`boxId`) && length(input_json$`boxId`) == 1)) {
          stop(paste("Error! Invalid data for `boxId`. Must be an integer:", input_json$`boxId`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ParcelBoxLabelDTO: the required field `boxId` is missing."))
      }
      # check the required field `fulfilmentId`
      if (!is.null(input_json$`fulfilmentId`)) {
        if (!(is.character(input_json$`fulfilmentId`) && length(input_json$`fulfilmentId`) == 1)) {
          stop(paste("Error! Invalid data for `fulfilmentId`. Must be a string:", input_json$`fulfilmentId`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ParcelBoxLabelDTO: the required field `fulfilmentId` is missing."))
      }
      # check the required field `place`
      if (!is.null(input_json$`place`)) {
        if (!(is.character(input_json$`place`) && length(input_json$`place`) == 1)) {
          stop(paste("Error! Invalid data for `place`. Must be a string:", input_json$`place`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ParcelBoxLabelDTO: the required field `place` is missing."))
      }
      # check the required field `weight`
      if (!is.null(input_json$`weight`)) {
        if (!(is.character(input_json$`weight`) && length(input_json$`weight`) == 1)) {
          stop(paste("Error! Invalid data for `weight`. Must be a string:", input_json$`weight`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ParcelBoxLabelDTO: the required field `weight` is missing."))
      }
      # check the required field `deliveryServiceId`
      if (!is.null(input_json$`deliveryServiceId`)) {
        if (!(is.character(input_json$`deliveryServiceId`) && length(input_json$`deliveryServiceId`) == 1)) {
          stop(paste("Error! Invalid data for `deliveryServiceId`. Must be a string:", input_json$`deliveryServiceId`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ParcelBoxLabelDTO: the required field `deliveryServiceId` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of ParcelBoxLabelDTO
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
      # check if the required `url` is null
      if (is.null(self$`url`)) {
        return(FALSE)
      }

      # check if the required `supplierName` is null
      if (is.null(self$`supplierName`)) {
        return(FALSE)
      }

      # check if the required `deliveryServiceName` is null
      if (is.null(self$`deliveryServiceName`)) {
        return(FALSE)
      }

      # check if the required `orderId` is null
      if (is.null(self$`orderId`)) {
        return(FALSE)
      }

      # check if the required `orderNum` is null
      if (is.null(self$`orderNum`)) {
        return(FALSE)
      }

      # check if the required `recipientName` is null
      if (is.null(self$`recipientName`)) {
        return(FALSE)
      }

      # check if the required `boxId` is null
      if (is.null(self$`boxId`)) {
        return(FALSE)
      }

      # check if the required `fulfilmentId` is null
      if (is.null(self$`fulfilmentId`)) {
        return(FALSE)
      }

      # check if the required `place` is null
      if (is.null(self$`place`)) {
        return(FALSE)
      }

      # check if the required `weight` is null
      if (is.null(self$`weight`)) {
        return(FALSE)
      }

      # check if the required `deliveryServiceId` is null
      if (is.null(self$`deliveryServiceId`)) {
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
      # check if the required `url` is null
      if (is.null(self$`url`)) {
        invalid_fields["url"] <- "Non-nullable required field `url` cannot be null."
      }

      # check if the required `supplierName` is null
      if (is.null(self$`supplierName`)) {
        invalid_fields["supplierName"] <- "Non-nullable required field `supplierName` cannot be null."
      }

      # check if the required `deliveryServiceName` is null
      if (is.null(self$`deliveryServiceName`)) {
        invalid_fields["deliveryServiceName"] <- "Non-nullable required field `deliveryServiceName` cannot be null."
      }

      # check if the required `orderId` is null
      if (is.null(self$`orderId`)) {
        invalid_fields["orderId"] <- "Non-nullable required field `orderId` cannot be null."
      }

      # check if the required `orderNum` is null
      if (is.null(self$`orderNum`)) {
        invalid_fields["orderNum"] <- "Non-nullable required field `orderNum` cannot be null."
      }

      # check if the required `recipientName` is null
      if (is.null(self$`recipientName`)) {
        invalid_fields["recipientName"] <- "Non-nullable required field `recipientName` cannot be null."
      }

      # check if the required `boxId` is null
      if (is.null(self$`boxId`)) {
        invalid_fields["boxId"] <- "Non-nullable required field `boxId` cannot be null."
      }

      # check if the required `fulfilmentId` is null
      if (is.null(self$`fulfilmentId`)) {
        invalid_fields["fulfilmentId"] <- "Non-nullable required field `fulfilmentId` cannot be null."
      }

      # check if the required `place` is null
      if (is.null(self$`place`)) {
        invalid_fields["place"] <- "Non-nullable required field `place` cannot be null."
      }

      # check if the required `weight` is null
      if (is.null(self$`weight`)) {
        invalid_fields["weight"] <- "Non-nullable required field `weight` cannot be null."
      }

      # check if the required `deliveryServiceId` is null
      if (is.null(self$`deliveryServiceId`)) {
        invalid_fields["deliveryServiceId"] <- "Non-nullable required field `deliveryServiceId` cannot be null."
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
# ParcelBoxLabelDTO$unlock()
#
## Below is an example to define the print function
# ParcelBoxLabelDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# ParcelBoxLabelDTO$lock()

