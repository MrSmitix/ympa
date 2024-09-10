#' Create a new SetOrderDeliveryTrackCodeRequest
#'
#' @description
#' SetOrderDeliveryTrackCodeRequest Class
#'
#' @docType class
#' @title SetOrderDeliveryTrackCodeRequest
#' @description SetOrderDeliveryTrackCodeRequest Class
#' @format An \code{R6Class} generator object
#' @field trackCode Трек‑номер посылки. character
#' @field deliveryServiceId Идентификатор службы доставки. Информацию о службе доставки можно получить с помощью запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md). integer
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
SetOrderDeliveryTrackCodeRequest <- R6::R6Class(
  "SetOrderDeliveryTrackCodeRequest",
  public = list(
    `trackCode` = NULL,
    `deliveryServiceId` = NULL,
    #' Initialize a new SetOrderDeliveryTrackCodeRequest class.
    #'
    #' @description
    #' Initialize a new SetOrderDeliveryTrackCodeRequest class.
    #'
    #' @param trackCode Трек‑номер посылки.
    #' @param deliveryServiceId Идентификатор службы доставки. Информацию о службе доставки можно получить с помощью запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md).
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`trackCode`, `deliveryServiceId`, ...) {
      if (!missing(`trackCode`)) {
        if (!(is.character(`trackCode`) && length(`trackCode`) == 1)) {
          stop(paste("Error! Invalid data for `trackCode`. Must be a string:", `trackCode`))
        }
        self$`trackCode` <- `trackCode`
      }
      if (!missing(`deliveryServiceId`)) {
        if (!(is.numeric(`deliveryServiceId`) && length(`deliveryServiceId`) == 1)) {
          stop(paste("Error! Invalid data for `deliveryServiceId`. Must be an integer:", `deliveryServiceId`))
        }
        self$`deliveryServiceId` <- `deliveryServiceId`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return SetOrderDeliveryTrackCodeRequest in JSON format
    #' @export
    toJSON = function() {
      SetOrderDeliveryTrackCodeRequestObject <- list()
      if (!is.null(self$`trackCode`)) {
        SetOrderDeliveryTrackCodeRequestObject[["trackCode"]] <-
          self$`trackCode`
      }
      if (!is.null(self$`deliveryServiceId`)) {
        SetOrderDeliveryTrackCodeRequestObject[["deliveryServiceId"]] <-
          self$`deliveryServiceId`
      }
      SetOrderDeliveryTrackCodeRequestObject
    },
    #' Deserialize JSON string into an instance of SetOrderDeliveryTrackCodeRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of SetOrderDeliveryTrackCodeRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of SetOrderDeliveryTrackCodeRequest
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`trackCode`)) {
        self$`trackCode` <- this_object$`trackCode`
      }
      if (!is.null(this_object$`deliveryServiceId`)) {
        self$`deliveryServiceId` <- this_object$`deliveryServiceId`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return SetOrderDeliveryTrackCodeRequest in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`trackCode`)) {
          sprintf(
          '"trackCode":
            "%s"
                    ',
          self$`trackCode`
          )
        },
        if (!is.null(self$`deliveryServiceId`)) {
          sprintf(
          '"deliveryServiceId":
            %d
                    ',
          self$`deliveryServiceId`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of SetOrderDeliveryTrackCodeRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of SetOrderDeliveryTrackCodeRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of SetOrderDeliveryTrackCodeRequest
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`trackCode` <- this_object$`trackCode`
      self$`deliveryServiceId` <- this_object$`deliveryServiceId`
      self
    },
    #' Validate JSON input with respect to SetOrderDeliveryTrackCodeRequest
    #'
    #' @description
    #' Validate JSON input with respect to SetOrderDeliveryTrackCodeRequest and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `trackCode`
      if (!is.null(input_json$`trackCode`)) {
        if (!(is.character(input_json$`trackCode`) && length(input_json$`trackCode`) == 1)) {
          stop(paste("Error! Invalid data for `trackCode`. Must be a string:", input_json$`trackCode`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for SetOrderDeliveryTrackCodeRequest: the required field `trackCode` is missing."))
      }
      # check the required field `deliveryServiceId`
      if (!is.null(input_json$`deliveryServiceId`)) {
        if (!(is.numeric(input_json$`deliveryServiceId`) && length(input_json$`deliveryServiceId`) == 1)) {
          stop(paste("Error! Invalid data for `deliveryServiceId`. Must be an integer:", input_json$`deliveryServiceId`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for SetOrderDeliveryTrackCodeRequest: the required field `deliveryServiceId` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of SetOrderDeliveryTrackCodeRequest
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
      # check if the required `trackCode` is null
      if (is.null(self$`trackCode`)) {
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
      # check if the required `trackCode` is null
      if (is.null(self$`trackCode`)) {
        invalid_fields["trackCode"] <- "Non-nullable required field `trackCode` cannot be null."
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
# SetOrderDeliveryTrackCodeRequest$unlock()
#
## Below is an example to define the print function
# SetOrderDeliveryTrackCodeRequest$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# SetOrderDeliveryTrackCodeRequest$lock()

