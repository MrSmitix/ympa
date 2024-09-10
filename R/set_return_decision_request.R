#' Create a new SetReturnDecisionRequest
#'
#' @description
#' Решения по позиции в возврате.
#'
#' @docType class
#' @title SetReturnDecisionRequest
#' @description SetReturnDecisionRequest Class
#' @format An \code{R6Class} generator object
#' @field returnItemId Идентификатор товара в возврате. integer
#' @field decisionType  \link{ReturnRequestDecisionType}
#' @field comment Комментарий к решению. Укажите:  * для `REFUND_MONEY_INCLUDING_SHIPMENT`— стоимость обратной пересылки;  * для `REPAIR` — когда вы устраните недостатки товара;  * для `DECLINE_REFUND` — причину отказа;  * для `OTHER_DECISION` — какое решение вы предлагаете. character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
SetReturnDecisionRequest <- R6::R6Class(
  "SetReturnDecisionRequest",
  public = list(
    `returnItemId` = NULL,
    `decisionType` = NULL,
    `comment` = NULL,
    #' Initialize a new SetReturnDecisionRequest class.
    #'
    #' @description
    #' Initialize a new SetReturnDecisionRequest class.
    #'
    #' @param returnItemId Идентификатор товара в возврате.
    #' @param decisionType decisionType
    #' @param comment Комментарий к решению. Укажите:  * для `REFUND_MONEY_INCLUDING_SHIPMENT`— стоимость обратной пересылки;  * для `REPAIR` — когда вы устраните недостатки товара;  * для `DECLINE_REFUND` — причину отказа;  * для `OTHER_DECISION` — какое решение вы предлагаете.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`returnItemId`, `decisionType`, `comment` = NULL, ...) {
      if (!missing(`returnItemId`)) {
        if (!(is.numeric(`returnItemId`) && length(`returnItemId`) == 1)) {
          stop(paste("Error! Invalid data for `returnItemId`. Must be an integer:", `returnItemId`))
        }
        self$`returnItemId` <- `returnItemId`
      }
      if (!missing(`decisionType`)) {
        if (!(`decisionType` %in% c())) {
          stop(paste("Error! \"", `decisionType`, "\" cannot be assigned to `decisionType`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`decisionType`))
        self$`decisionType` <- `decisionType`
      }
      if (!is.null(`comment`)) {
        if (!(is.character(`comment`) && length(`comment`) == 1)) {
          stop(paste("Error! Invalid data for `comment`. Must be a string:", `comment`))
        }
        self$`comment` <- `comment`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return SetReturnDecisionRequest in JSON format
    #' @export
    toJSON = function() {
      SetReturnDecisionRequestObject <- list()
      if (!is.null(self$`returnItemId`)) {
        SetReturnDecisionRequestObject[["returnItemId"]] <-
          self$`returnItemId`
      }
      if (!is.null(self$`decisionType`)) {
        SetReturnDecisionRequestObject[["decisionType"]] <-
          self$`decisionType`$toJSON()
      }
      if (!is.null(self$`comment`)) {
        SetReturnDecisionRequestObject[["comment"]] <-
          self$`comment`
      }
      SetReturnDecisionRequestObject
    },
    #' Deserialize JSON string into an instance of SetReturnDecisionRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of SetReturnDecisionRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of SetReturnDecisionRequest
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`returnItemId`)) {
        self$`returnItemId` <- this_object$`returnItemId`
      }
      if (!is.null(this_object$`decisionType`)) {
        `decisiontype_object` <- ReturnRequestDecisionType$new()
        `decisiontype_object`$fromJSON(jsonlite::toJSON(this_object$`decisionType`, auto_unbox = TRUE, digits = NA))
        self$`decisionType` <- `decisiontype_object`
      }
      if (!is.null(this_object$`comment`)) {
        self$`comment` <- this_object$`comment`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return SetReturnDecisionRequest in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`returnItemId`)) {
          sprintf(
          '"returnItemId":
            %d
                    ',
          self$`returnItemId`
          )
        },
        if (!is.null(self$`decisionType`)) {
          sprintf(
          '"decisionType":
          %s
          ',
          jsonlite::toJSON(self$`decisionType`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`comment`)) {
          sprintf(
          '"comment":
            "%s"
                    ',
          self$`comment`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of SetReturnDecisionRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of SetReturnDecisionRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of SetReturnDecisionRequest
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`returnItemId` <- this_object$`returnItemId`
      self$`decisionType` <- ReturnRequestDecisionType$new()$fromJSON(jsonlite::toJSON(this_object$`decisionType`, auto_unbox = TRUE, digits = NA))
      self$`comment` <- this_object$`comment`
      self
    },
    #' Validate JSON input with respect to SetReturnDecisionRequest
    #'
    #' @description
    #' Validate JSON input with respect to SetReturnDecisionRequest and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `returnItemId`
      if (!is.null(input_json$`returnItemId`)) {
        if (!(is.numeric(input_json$`returnItemId`) && length(input_json$`returnItemId`) == 1)) {
          stop(paste("Error! Invalid data for `returnItemId`. Must be an integer:", input_json$`returnItemId`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for SetReturnDecisionRequest: the required field `returnItemId` is missing."))
      }
      # check the required field `decisionType`
      if (!is.null(input_json$`decisionType`)) {
        stopifnot(R6::is.R6(input_json$`decisionType`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for SetReturnDecisionRequest: the required field `decisionType` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of SetReturnDecisionRequest
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
      # check if the required `returnItemId` is null
      if (is.null(self$`returnItemId`)) {
        return(FALSE)
      }

      # check if the required `decisionType` is null
      if (is.null(self$`decisionType`)) {
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
      # check if the required `returnItemId` is null
      if (is.null(self$`returnItemId`)) {
        invalid_fields["returnItemId"] <- "Non-nullable required field `returnItemId` cannot be null."
      }

      # check if the required `decisionType` is null
      if (is.null(self$`decisionType`)) {
        invalid_fields["decisionType"] <- "Non-nullable required field `decisionType` cannot be null."
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
# SetReturnDecisionRequest$unlock()
#
## Below is an example to define the print function
# SetReturnDecisionRequest$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# SetReturnDecisionRequest$lock()

