#' Create a new GoodsFeedbackIdentifiersDTO
#'
#' @description
#' Идентификаторы, которые связаны с отзывом.
#'
#' @docType class
#' @title GoodsFeedbackIdentifiersDTO
#' @description GoodsFeedbackIdentifiersDTO Class
#' @format An \code{R6Class} generator object
#' @field orderId Идентификатор заказа на Маркете. integer
#' @field modelId Идентификатор модели товара. integer
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
GoodsFeedbackIdentifiersDTO <- R6::R6Class(
  "GoodsFeedbackIdentifiersDTO",
  public = list(
    `orderId` = NULL,
    `modelId` = NULL,
    #' Initialize a new GoodsFeedbackIdentifiersDTO class.
    #'
    #' @description
    #' Initialize a new GoodsFeedbackIdentifiersDTO class.
    #'
    #' @param orderId Идентификатор заказа на Маркете.
    #' @param modelId Идентификатор модели товара.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`orderId`, `modelId`, ...) {
      if (!missing(`orderId`)) {
        if (!(is.numeric(`orderId`) && length(`orderId`) == 1)) {
          stop(paste("Error! Invalid data for `orderId`. Must be an integer:", `orderId`))
        }
        self$`orderId` <- `orderId`
      }
      if (!missing(`modelId`)) {
        if (!(is.numeric(`modelId`) && length(`modelId`) == 1)) {
          stop(paste("Error! Invalid data for `modelId`. Must be an integer:", `modelId`))
        }
        self$`modelId` <- `modelId`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return GoodsFeedbackIdentifiersDTO in JSON format
    #' @export
    toJSON = function() {
      GoodsFeedbackIdentifiersDTOObject <- list()
      if (!is.null(self$`orderId`)) {
        GoodsFeedbackIdentifiersDTOObject[["orderId"]] <-
          self$`orderId`
      }
      if (!is.null(self$`modelId`)) {
        GoodsFeedbackIdentifiersDTOObject[["modelId"]] <-
          self$`modelId`
      }
      GoodsFeedbackIdentifiersDTOObject
    },
    #' Deserialize JSON string into an instance of GoodsFeedbackIdentifiersDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of GoodsFeedbackIdentifiersDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of GoodsFeedbackIdentifiersDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`orderId`)) {
        self$`orderId` <- this_object$`orderId`
      }
      if (!is.null(this_object$`modelId`)) {
        self$`modelId` <- this_object$`modelId`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return GoodsFeedbackIdentifiersDTO in JSON format
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
        if (!is.null(self$`modelId`)) {
          sprintf(
          '"modelId":
            %d
                    ',
          self$`modelId`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of GoodsFeedbackIdentifiersDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of GoodsFeedbackIdentifiersDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of GoodsFeedbackIdentifiersDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`orderId` <- this_object$`orderId`
      self$`modelId` <- this_object$`modelId`
      self
    },
    #' Validate JSON input with respect to GoodsFeedbackIdentifiersDTO
    #'
    #' @description
    #' Validate JSON input with respect to GoodsFeedbackIdentifiersDTO and throw an exception if invalid
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
        stop(paste("The JSON input `", input, "` is invalid for GoodsFeedbackIdentifiersDTO: the required field `orderId` is missing."))
      }
      # check the required field `modelId`
      if (!is.null(input_json$`modelId`)) {
        if (!(is.numeric(input_json$`modelId`) && length(input_json$`modelId`) == 1)) {
          stop(paste("Error! Invalid data for `modelId`. Must be an integer:", input_json$`modelId`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for GoodsFeedbackIdentifiersDTO: the required field `modelId` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of GoodsFeedbackIdentifiersDTO
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

      # check if the required `modelId` is null
      if (is.null(self$`modelId`)) {
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

      # check if the required `modelId` is null
      if (is.null(self$`modelId`)) {
        invalid_fields["modelId"] <- "Non-nullable required field `modelId` cannot be null."
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
# GoodsFeedbackIdentifiersDTO$unlock()
#
## Below is an example to define the print function
# GoodsFeedbackIdentifiersDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# GoodsFeedbackIdentifiersDTO$lock()

