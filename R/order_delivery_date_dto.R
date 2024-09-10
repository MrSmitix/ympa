#' Create a new OrderDeliveryDateDTO
#'
#' @description
#' Информация о новой дате доставки заказа.
#'
#' @docType class
#' @title OrderDeliveryDateDTO
#' @description OrderDeliveryDateDTO Class
#' @format An \code{R6Class} generator object
#' @field toDate Новая дата доставки заказа.  Формат даты: `ГГГГ-ММ-ДД`. character
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
OrderDeliveryDateDTO <- R6::R6Class(
  "OrderDeliveryDateDTO",
  public = list(
    `toDate` = NULL,
    #' Initialize a new OrderDeliveryDateDTO class.
    #'
    #' @description
    #' Initialize a new OrderDeliveryDateDTO class.
    #'
    #' @param toDate Новая дата доставки заказа.  Формат даты: `ГГГГ-ММ-ДД`.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`toDate`, ...) {
      if (!missing(`toDate`)) {
        if (!(is.character(`toDate`) && length(`toDate`) == 1)) {
          stop(paste("Error! Invalid data for `toDate`. Must be a string:", `toDate`))
        }
        self$`toDate` <- `toDate`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return OrderDeliveryDateDTO in JSON format
    #' @export
    toJSON = function() {
      OrderDeliveryDateDTOObject <- list()
      if (!is.null(self$`toDate`)) {
        OrderDeliveryDateDTOObject[["toDate"]] <-
          self$`toDate`
      }
      OrderDeliveryDateDTOObject
    },
    #' Deserialize JSON string into an instance of OrderDeliveryDateDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of OrderDeliveryDateDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of OrderDeliveryDateDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`toDate`)) {
        self$`toDate` <- this_object$`toDate`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return OrderDeliveryDateDTO in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`toDate`)) {
          sprintf(
          '"toDate":
            "%s"
                    ',
          self$`toDate`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of OrderDeliveryDateDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of OrderDeliveryDateDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of OrderDeliveryDateDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`toDate` <- this_object$`toDate`
      self
    },
    #' Validate JSON input with respect to OrderDeliveryDateDTO
    #'
    #' @description
    #' Validate JSON input with respect to OrderDeliveryDateDTO and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `toDate`
      if (!is.null(input_json$`toDate`)) {
        if (!(is.character(input_json$`toDate`) && length(input_json$`toDate`) == 1)) {
          stop(paste("Error! Invalid data for `toDate`. Must be a string:", input_json$`toDate`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for OrderDeliveryDateDTO: the required field `toDate` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of OrderDeliveryDateDTO
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
      # check if the required `toDate` is null
      if (is.null(self$`toDate`)) {
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
      # check if the required `toDate` is null
      if (is.null(self$`toDate`)) {
        invalid_fields["toDate"] <- "Non-nullable required field `toDate` cannot be null."
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
# OrderDeliveryDateDTO$unlock()
#
## Below is an example to define the print function
# OrderDeliveryDateDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# OrderDeliveryDateDTO$lock()

