#' Create a new OrderItemPromoDTO
#'
#' @description
#' Информация о вознаграждениях партнеру за скидки на товар по промокодам, купонам и акциям.
#'
#' @docType class
#' @title OrderItemPromoDTO
#' @description OrderItemPromoDTO Class
#' @format An \code{R6Class} generator object
#' @field type  \link{OrderPromoType}
#' @field discount Размер пользовательской скидки в валюте покупателя. numeric [optional]
#' @field subsidy Вознаграждение партнеру от Маркета за товар, проданный в рамках акции.  Передается в валюте заказа. numeric [optional]
#' @field shopPromoId Идентификатор акции поставщика. character [optional]
#' @field marketPromoId Идентификатор акции в рамках соглашения на оказание услуг по продвижению сервиса между Маркетом и партнером.  Параметр передается, только если параметр `type=MARKET_DEAL`. character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
OrderItemPromoDTO <- R6::R6Class(
  "OrderItemPromoDTO",
  public = list(
    `type` = NULL,
    `discount` = NULL,
    `subsidy` = NULL,
    `shopPromoId` = NULL,
    `marketPromoId` = NULL,
    #' Initialize a new OrderItemPromoDTO class.
    #'
    #' @description
    #' Initialize a new OrderItemPromoDTO class.
    #'
    #' @param type type
    #' @param discount Размер пользовательской скидки в валюте покупателя.
    #' @param subsidy Вознаграждение партнеру от Маркета за товар, проданный в рамках акции.  Передается в валюте заказа.
    #' @param shopPromoId Идентификатор акции поставщика.
    #' @param marketPromoId Идентификатор акции в рамках соглашения на оказание услуг по продвижению сервиса между Маркетом и партнером.  Параметр передается, только если параметр `type=MARKET_DEAL`.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`type`, `discount` = NULL, `subsidy` = NULL, `shopPromoId` = NULL, `marketPromoId` = NULL, ...) {
      if (!missing(`type`)) {
        if (!(`type` %in% c())) {
          stop(paste("Error! \"", `type`, "\" cannot be assigned to `type`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`type`))
        self$`type` <- `type`
      }
      if (!is.null(`discount`)) {
        self$`discount` <- `discount`
      }
      if (!is.null(`subsidy`)) {
        self$`subsidy` <- `subsidy`
      }
      if (!is.null(`shopPromoId`)) {
        if (!(is.character(`shopPromoId`) && length(`shopPromoId`) == 1)) {
          stop(paste("Error! Invalid data for `shopPromoId`. Must be a string:", `shopPromoId`))
        }
        self$`shopPromoId` <- `shopPromoId`
      }
      if (!is.null(`marketPromoId`)) {
        if (!(is.character(`marketPromoId`) && length(`marketPromoId`) == 1)) {
          stop(paste("Error! Invalid data for `marketPromoId`. Must be a string:", `marketPromoId`))
        }
        self$`marketPromoId` <- `marketPromoId`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return OrderItemPromoDTO in JSON format
    #' @export
    toJSON = function() {
      OrderItemPromoDTOObject <- list()
      if (!is.null(self$`type`)) {
        OrderItemPromoDTOObject[["type"]] <-
          self$`type`$toJSON()
      }
      if (!is.null(self$`discount`)) {
        OrderItemPromoDTOObject[["discount"]] <-
          self$`discount`
      }
      if (!is.null(self$`subsidy`)) {
        OrderItemPromoDTOObject[["subsidy"]] <-
          self$`subsidy`
      }
      if (!is.null(self$`shopPromoId`)) {
        OrderItemPromoDTOObject[["shopPromoId"]] <-
          self$`shopPromoId`
      }
      if (!is.null(self$`marketPromoId`)) {
        OrderItemPromoDTOObject[["marketPromoId"]] <-
          self$`marketPromoId`
      }
      OrderItemPromoDTOObject
    },
    #' Deserialize JSON string into an instance of OrderItemPromoDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of OrderItemPromoDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of OrderItemPromoDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`type`)) {
        `type_object` <- OrderPromoType$new()
        `type_object`$fromJSON(jsonlite::toJSON(this_object$`type`, auto_unbox = TRUE, digits = NA))
        self$`type` <- `type_object`
      }
      if (!is.null(this_object$`discount`)) {
        self$`discount` <- this_object$`discount`
      }
      if (!is.null(this_object$`subsidy`)) {
        self$`subsidy` <- this_object$`subsidy`
      }
      if (!is.null(this_object$`shopPromoId`)) {
        self$`shopPromoId` <- this_object$`shopPromoId`
      }
      if (!is.null(this_object$`marketPromoId`)) {
        self$`marketPromoId` <- this_object$`marketPromoId`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return OrderItemPromoDTO in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`type`)) {
          sprintf(
          '"type":
          %s
          ',
          jsonlite::toJSON(self$`type`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`discount`)) {
          sprintf(
          '"discount":
            %d
                    ',
          self$`discount`
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
        if (!is.null(self$`shopPromoId`)) {
          sprintf(
          '"shopPromoId":
            "%s"
                    ',
          self$`shopPromoId`
          )
        },
        if (!is.null(self$`marketPromoId`)) {
          sprintf(
          '"marketPromoId":
            "%s"
                    ',
          self$`marketPromoId`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of OrderItemPromoDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of OrderItemPromoDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of OrderItemPromoDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`type` <- OrderPromoType$new()$fromJSON(jsonlite::toJSON(this_object$`type`, auto_unbox = TRUE, digits = NA))
      self$`discount` <- this_object$`discount`
      self$`subsidy` <- this_object$`subsidy`
      self$`shopPromoId` <- this_object$`shopPromoId`
      self$`marketPromoId` <- this_object$`marketPromoId`
      self
    },
    #' Validate JSON input with respect to OrderItemPromoDTO
    #'
    #' @description
    #' Validate JSON input with respect to OrderItemPromoDTO and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `type`
      if (!is.null(input_json$`type`)) {
        stopifnot(R6::is.R6(input_json$`type`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for OrderItemPromoDTO: the required field `type` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of OrderItemPromoDTO
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
      # check if the required `type` is null
      if (is.null(self$`type`)) {
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
      # check if the required `type` is null
      if (is.null(self$`type`)) {
        invalid_fields["type"] <- "Non-nullable required field `type` cannot be null."
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
# OrderItemPromoDTO$unlock()
#
## Below is an example to define the print function
# OrderItemPromoDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# OrderItemPromoDTO$lock()

