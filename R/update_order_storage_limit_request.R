#' Create a new UpdateOrderStorageLimitRequest
#'
#' @description
#' Запрос на обновление срока хранения заказа в ПВЗ.
#'
#' @docType class
#' @title UpdateOrderStorageLimitRequest
#' @description UpdateOrderStorageLimitRequest Class
#' @format An \code{R6Class} generator object
#' @field newDate Новая дата, до которой заказ будет храниться в пункте выдачи.  Срок хранения можно увеличить не больше, чем на 30 дней.  Формат даты: `ГГГГ-ММ-ДД`. character
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
UpdateOrderStorageLimitRequest <- R6::R6Class(
  "UpdateOrderStorageLimitRequest",
  public = list(
    `newDate` = NULL,
    #' Initialize a new UpdateOrderStorageLimitRequest class.
    #'
    #' @description
    #' Initialize a new UpdateOrderStorageLimitRequest class.
    #'
    #' @param newDate Новая дата, до которой заказ будет храниться в пункте выдачи.  Срок хранения можно увеличить не больше, чем на 30 дней.  Формат даты: `ГГГГ-ММ-ДД`.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`newDate`, ...) {
      if (!missing(`newDate`)) {
        if (!(is.character(`newDate`) && length(`newDate`) == 1)) {
          stop(paste("Error! Invalid data for `newDate`. Must be a string:", `newDate`))
        }
        self$`newDate` <- `newDate`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return UpdateOrderStorageLimitRequest in JSON format
    #' @export
    toJSON = function() {
      UpdateOrderStorageLimitRequestObject <- list()
      if (!is.null(self$`newDate`)) {
        UpdateOrderStorageLimitRequestObject[["newDate"]] <-
          self$`newDate`
      }
      UpdateOrderStorageLimitRequestObject
    },
    #' Deserialize JSON string into an instance of UpdateOrderStorageLimitRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of UpdateOrderStorageLimitRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of UpdateOrderStorageLimitRequest
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`newDate`)) {
        self$`newDate` <- this_object$`newDate`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return UpdateOrderStorageLimitRequest in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`newDate`)) {
          sprintf(
          '"newDate":
            "%s"
                    ',
          self$`newDate`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of UpdateOrderStorageLimitRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of UpdateOrderStorageLimitRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of UpdateOrderStorageLimitRequest
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`newDate` <- this_object$`newDate`
      self
    },
    #' Validate JSON input with respect to UpdateOrderStorageLimitRequest
    #'
    #' @description
    #' Validate JSON input with respect to UpdateOrderStorageLimitRequest and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `newDate`
      if (!is.null(input_json$`newDate`)) {
        if (!(is.character(input_json$`newDate`) && length(input_json$`newDate`) == 1)) {
          stop(paste("Error! Invalid data for `newDate`. Must be a string:", input_json$`newDate`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for UpdateOrderStorageLimitRequest: the required field `newDate` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of UpdateOrderStorageLimitRequest
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
      # check if the required `newDate` is null
      if (is.null(self$`newDate`)) {
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
      # check if the required `newDate` is null
      if (is.null(self$`newDate`)) {
        invalid_fields["newDate"] <- "Non-nullable required field `newDate` cannot be null."
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
# UpdateOrderStorageLimitRequest$unlock()
#
## Below is an example to define the print function
# UpdateOrderStorageLimitRequest$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# UpdateOrderStorageLimitRequest$lock()

