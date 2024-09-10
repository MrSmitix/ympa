#' Create a new OrderLabelDTO
#'
#' @description
#' Данные для печати ярлыка.
#'
#' @docType class
#' @title OrderLabelDTO
#' @description OrderLabelDTO Class
#' @format An \code{R6Class} generator object
#' @field orderId Идентификатор заказа. integer
#' @field placesNumber Количество коробок в заказе. integer
#' @field url URL файла с ярлыками‑наклейками на все коробки в заказе.  Соответствует URL, по которому выполняется запрос [GET campaigns/{campaignId}/orders/{orderId}/delivery/labels](../../reference/orders/generateOrderLabels.md). character
#' @field parcelBoxLabels Информация на ярлыке. list(\link{ParcelBoxLabelDTO})
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
OrderLabelDTO <- R6::R6Class(
  "OrderLabelDTO",
  public = list(
    `orderId` = NULL,
    `placesNumber` = NULL,
    `url` = NULL,
    `parcelBoxLabels` = NULL,
    #' Initialize a new OrderLabelDTO class.
    #'
    #' @description
    #' Initialize a new OrderLabelDTO class.
    #'
    #' @param orderId Идентификатор заказа.
    #' @param placesNumber Количество коробок в заказе.
    #' @param url URL файла с ярлыками‑наклейками на все коробки в заказе.  Соответствует URL, по которому выполняется запрос [GET campaigns/{campaignId}/orders/{orderId}/delivery/labels](../../reference/orders/generateOrderLabels.md).
    #' @param parcelBoxLabels Информация на ярлыке.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`orderId`, `placesNumber`, `url`, `parcelBoxLabels`, ...) {
      if (!missing(`orderId`)) {
        if (!(is.numeric(`orderId`) && length(`orderId`) == 1)) {
          stop(paste("Error! Invalid data for `orderId`. Must be an integer:", `orderId`))
        }
        self$`orderId` <- `orderId`
      }
      if (!missing(`placesNumber`)) {
        if (!(is.numeric(`placesNumber`) && length(`placesNumber`) == 1)) {
          stop(paste("Error! Invalid data for `placesNumber`. Must be an integer:", `placesNumber`))
        }
        self$`placesNumber` <- `placesNumber`
      }
      if (!missing(`url`)) {
        if (!(is.character(`url`) && length(`url`) == 1)) {
          stop(paste("Error! Invalid data for `url`. Must be a string:", `url`))
        }
        self$`url` <- `url`
      }
      if (!missing(`parcelBoxLabels`)) {
        stopifnot(is.vector(`parcelBoxLabels`), length(`parcelBoxLabels`) != 0)
        sapply(`parcelBoxLabels`, function(x) stopifnot(R6::is.R6(x)))
        self$`parcelBoxLabels` <- `parcelBoxLabels`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return OrderLabelDTO in JSON format
    #' @export
    toJSON = function() {
      OrderLabelDTOObject <- list()
      if (!is.null(self$`orderId`)) {
        OrderLabelDTOObject[["orderId"]] <-
          self$`orderId`
      }
      if (!is.null(self$`placesNumber`)) {
        OrderLabelDTOObject[["placesNumber"]] <-
          self$`placesNumber`
      }
      if (!is.null(self$`url`)) {
        OrderLabelDTOObject[["url"]] <-
          self$`url`
      }
      if (!is.null(self$`parcelBoxLabels`)) {
        OrderLabelDTOObject[["parcelBoxLabels"]] <-
          lapply(self$`parcelBoxLabels`, function(x) x$toJSON())
      }
      OrderLabelDTOObject
    },
    #' Deserialize JSON string into an instance of OrderLabelDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of OrderLabelDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of OrderLabelDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`orderId`)) {
        self$`orderId` <- this_object$`orderId`
      }
      if (!is.null(this_object$`placesNumber`)) {
        self$`placesNumber` <- this_object$`placesNumber`
      }
      if (!is.null(this_object$`url`)) {
        self$`url` <- this_object$`url`
      }
      if (!is.null(this_object$`parcelBoxLabels`)) {
        self$`parcelBoxLabels` <- ApiClient$new()$deserializeObj(this_object$`parcelBoxLabels`, "array[ParcelBoxLabelDTO]", loadNamespace("ympa_r_client"))
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return OrderLabelDTO in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`orderId`)) {
          sprintf(
          '"orderId":
            %d
                    ',
          self$`orderId`
          )
        },
        if (!is.null(self$`placesNumber`)) {
          sprintf(
          '"placesNumber":
            %d
                    ',
          self$`placesNumber`
          )
        },
        if (!is.null(self$`url`)) {
          sprintf(
          '"url":
            "%s"
                    ',
          self$`url`
          )
        },
        if (!is.null(self$`parcelBoxLabels`)) {
          sprintf(
          '"parcelBoxLabels":
          [%s]
',
          paste(sapply(self$`parcelBoxLabels`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of OrderLabelDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of OrderLabelDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of OrderLabelDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`orderId` <- this_object$`orderId`
      self$`placesNumber` <- this_object$`placesNumber`
      self$`url` <- this_object$`url`
      self$`parcelBoxLabels` <- ApiClient$new()$deserializeObj(this_object$`parcelBoxLabels`, "array[ParcelBoxLabelDTO]", loadNamespace("ympa_r_client"))
      self
    },
    #' Validate JSON input with respect to OrderLabelDTO
    #'
    #' @description
    #' Validate JSON input with respect to OrderLabelDTO and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `orderId`
      if (!is.null(input_json$`orderId`)) {
        if (!(is.numeric(input_json$`orderId`) && length(input_json$`orderId`) == 1)) {
          stop(paste("Error! Invalid data for `orderId`. Must be an integer:", input_json$`orderId`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for OrderLabelDTO: the required field `orderId` is missing."))
      }
      # check the required field `placesNumber`
      if (!is.null(input_json$`placesNumber`)) {
        if (!(is.numeric(input_json$`placesNumber`) && length(input_json$`placesNumber`) == 1)) {
          stop(paste("Error! Invalid data for `placesNumber`. Must be an integer:", input_json$`placesNumber`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for OrderLabelDTO: the required field `placesNumber` is missing."))
      }
      # check the required field `url`
      if (!is.null(input_json$`url`)) {
        if (!(is.character(input_json$`url`) && length(input_json$`url`) == 1)) {
          stop(paste("Error! Invalid data for `url`. Must be a string:", input_json$`url`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for OrderLabelDTO: the required field `url` is missing."))
      }
      # check the required field `parcelBoxLabels`
      if (!is.null(input_json$`parcelBoxLabels`)) {
        stopifnot(is.vector(input_json$`parcelBoxLabels`), length(input_json$`parcelBoxLabels`) != 0)
        tmp <- sapply(input_json$`parcelBoxLabels`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for OrderLabelDTO: the required field `parcelBoxLabels` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of OrderLabelDTO
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
      # check if the required `orderId` is null
      if (is.null(self$`orderId`)) {
        return(FALSE)
      }

      # check if the required `placesNumber` is null
      if (is.null(self$`placesNumber`)) {
        return(FALSE)
      }

      # check if the required `url` is null
      if (is.null(self$`url`)) {
        return(FALSE)
      }

      # check if the required `parcelBoxLabels` is null
      if (is.null(self$`parcelBoxLabels`)) {
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
      # check if the required `orderId` is null
      if (is.null(self$`orderId`)) {
        invalid_fields["orderId"] <- "Non-nullable required field `orderId` cannot be null."
      }

      # check if the required `placesNumber` is null
      if (is.null(self$`placesNumber`)) {
        invalid_fields["placesNumber"] <- "Non-nullable required field `placesNumber` cannot be null."
      }

      # check if the required `url` is null
      if (is.null(self$`url`)) {
        invalid_fields["url"] <- "Non-nullable required field `url` cannot be null."
      }

      # check if the required `parcelBoxLabels` is null
      if (is.null(self$`parcelBoxLabels`)) {
        invalid_fields["parcelBoxLabels"] <- "Non-nullable required field `parcelBoxLabels` cannot be null."
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
# OrderLabelDTO$unlock()
#
## Below is an example to define the print function
# OrderLabelDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# OrderLabelDTO$lock()

