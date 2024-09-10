#' Create a new ReturnDecisionDTO
#'
#' @description
#' Решения по возвратам.
#'
#' @docType class
#' @title ReturnDecisionDTO
#' @description ReturnDecisionDTO Class
#' @format An \code{R6Class} generator object
#' @field returnItemId Идентификатор товара в возврате. integer [optional]
#' @field count Количество единиц товара. integer [optional]
#' @field comment Комментарий. character [optional]
#' @field reasonType  \link{ReturnDecisionReasonType} [optional]
#' @field subreasonType  \link{ReturnDecisionSubreasonType} [optional]
#' @field decisionType  \link{ReturnDecisionType} [optional]
#' @field refundAmount Сумма возврата. integer [optional]
#' @field partnerCompensation Компенсация за обратную доставку. integer [optional]
#' @field images Список хеш-кодов фотографий товара от покупателя. list(character) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ReturnDecisionDTO <- R6::R6Class(
  "ReturnDecisionDTO",
  public = list(
    `returnItemId` = NULL,
    `count` = NULL,
    `comment` = NULL,
    `reasonType` = NULL,
    `subreasonType` = NULL,
    `decisionType` = NULL,
    `refundAmount` = NULL,
    `partnerCompensation` = NULL,
    `images` = NULL,
    #' Initialize a new ReturnDecisionDTO class.
    #'
    #' @description
    #' Initialize a new ReturnDecisionDTO class.
    #'
    #' @param returnItemId Идентификатор товара в возврате.
    #' @param count Количество единиц товара.
    #' @param comment Комментарий.
    #' @param reasonType reasonType
    #' @param subreasonType subreasonType
    #' @param decisionType decisionType
    #' @param refundAmount Сумма возврата.
    #' @param partnerCompensation Компенсация за обратную доставку.
    #' @param images Список хеш-кодов фотографий товара от покупателя.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`returnItemId` = NULL, `count` = NULL, `comment` = NULL, `reasonType` = NULL, `subreasonType` = NULL, `decisionType` = NULL, `refundAmount` = NULL, `partnerCompensation` = NULL, `images` = NULL, ...) {
      if (!is.null(`returnItemId`)) {
        if (!(is.numeric(`returnItemId`) && length(`returnItemId`) == 1)) {
          stop(paste("Error! Invalid data for `returnItemId`. Must be an integer:", `returnItemId`))
        }
        self$`returnItemId` <- `returnItemId`
      }
      if (!is.null(`count`)) {
        if (!(is.numeric(`count`) && length(`count`) == 1)) {
          stop(paste("Error! Invalid data for `count`. Must be an integer:", `count`))
        }
        self$`count` <- `count`
      }
      if (!is.null(`comment`)) {
        if (!(is.character(`comment`) && length(`comment`) == 1)) {
          stop(paste("Error! Invalid data for `comment`. Must be a string:", `comment`))
        }
        self$`comment` <- `comment`
      }
      if (!is.null(`reasonType`)) {
        if (!(`reasonType` %in% c())) {
          stop(paste("Error! \"", `reasonType`, "\" cannot be assigned to `reasonType`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`reasonType`))
        self$`reasonType` <- `reasonType`
      }
      if (!is.null(`subreasonType`)) {
        if (!(`subreasonType` %in% c())) {
          stop(paste("Error! \"", `subreasonType`, "\" cannot be assigned to `subreasonType`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`subreasonType`))
        self$`subreasonType` <- `subreasonType`
      }
      if (!is.null(`decisionType`)) {
        if (!(`decisionType` %in% c())) {
          stop(paste("Error! \"", `decisionType`, "\" cannot be assigned to `decisionType`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`decisionType`))
        self$`decisionType` <- `decisionType`
      }
      if (!is.null(`refundAmount`)) {
        if (!(is.numeric(`refundAmount`) && length(`refundAmount`) == 1)) {
          stop(paste("Error! Invalid data for `refundAmount`. Must be an integer:", `refundAmount`))
        }
        self$`refundAmount` <- `refundAmount`
      }
      if (!is.null(`partnerCompensation`)) {
        if (!(is.numeric(`partnerCompensation`) && length(`partnerCompensation`) == 1)) {
          stop(paste("Error! Invalid data for `partnerCompensation`. Must be an integer:", `partnerCompensation`))
        }
        self$`partnerCompensation` <- `partnerCompensation`
      }
      if (!is.null(`images`)) {
        stopifnot(is.vector(`images`), length(`images`) != 0)
        sapply(`images`, function(x) stopifnot(is.character(x)))
        self$`images` <- `images`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return ReturnDecisionDTO in JSON format
    #' @export
    toJSON = function() {
      ReturnDecisionDTOObject <- list()
      if (!is.null(self$`returnItemId`)) {
        ReturnDecisionDTOObject[["returnItemId"]] <-
          self$`returnItemId`
      }
      if (!is.null(self$`count`)) {
        ReturnDecisionDTOObject[["count"]] <-
          self$`count`
      }
      if (!is.null(self$`comment`)) {
        ReturnDecisionDTOObject[["comment"]] <-
          self$`comment`
      }
      if (!is.null(self$`reasonType`)) {
        ReturnDecisionDTOObject[["reasonType"]] <-
          self$`reasonType`$toJSON()
      }
      if (!is.null(self$`subreasonType`)) {
        ReturnDecisionDTOObject[["subreasonType"]] <-
          self$`subreasonType`$toJSON()
      }
      if (!is.null(self$`decisionType`)) {
        ReturnDecisionDTOObject[["decisionType"]] <-
          self$`decisionType`$toJSON()
      }
      if (!is.null(self$`refundAmount`)) {
        ReturnDecisionDTOObject[["refundAmount"]] <-
          self$`refundAmount`
      }
      if (!is.null(self$`partnerCompensation`)) {
        ReturnDecisionDTOObject[["partnerCompensation"]] <-
          self$`partnerCompensation`
      }
      if (!is.null(self$`images`)) {
        ReturnDecisionDTOObject[["images"]] <-
          self$`images`
      }
      ReturnDecisionDTOObject
    },
    #' Deserialize JSON string into an instance of ReturnDecisionDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of ReturnDecisionDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of ReturnDecisionDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`returnItemId`)) {
        self$`returnItemId` <- this_object$`returnItemId`
      }
      if (!is.null(this_object$`count`)) {
        self$`count` <- this_object$`count`
      }
      if (!is.null(this_object$`comment`)) {
        self$`comment` <- this_object$`comment`
      }
      if (!is.null(this_object$`reasonType`)) {
        `reasontype_object` <- ReturnDecisionReasonType$new()
        `reasontype_object`$fromJSON(jsonlite::toJSON(this_object$`reasonType`, auto_unbox = TRUE, digits = NA))
        self$`reasonType` <- `reasontype_object`
      }
      if (!is.null(this_object$`subreasonType`)) {
        `subreasontype_object` <- ReturnDecisionSubreasonType$new()
        `subreasontype_object`$fromJSON(jsonlite::toJSON(this_object$`subreasonType`, auto_unbox = TRUE, digits = NA))
        self$`subreasonType` <- `subreasontype_object`
      }
      if (!is.null(this_object$`decisionType`)) {
        `decisiontype_object` <- ReturnDecisionType$new()
        `decisiontype_object`$fromJSON(jsonlite::toJSON(this_object$`decisionType`, auto_unbox = TRUE, digits = NA))
        self$`decisionType` <- `decisiontype_object`
      }
      if (!is.null(this_object$`refundAmount`)) {
        self$`refundAmount` <- this_object$`refundAmount`
      }
      if (!is.null(this_object$`partnerCompensation`)) {
        self$`partnerCompensation` <- this_object$`partnerCompensation`
      }
      if (!is.null(this_object$`images`)) {
        self$`images` <- ApiClient$new()$deserializeObj(this_object$`images`, "array[character]", loadNamespace("ympa_r_client"))
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return ReturnDecisionDTO in JSON format
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
        if (!is.null(self$`count`)) {
          sprintf(
          '"count":
            %d
                    ',
          self$`count`
          )
        },
        if (!is.null(self$`comment`)) {
          sprintf(
          '"comment":
            "%s"
                    ',
          self$`comment`
          )
        },
        if (!is.null(self$`reasonType`)) {
          sprintf(
          '"reasonType":
          %s
          ',
          jsonlite::toJSON(self$`reasonType`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`subreasonType`)) {
          sprintf(
          '"subreasonType":
          %s
          ',
          jsonlite::toJSON(self$`subreasonType`$toJSON(), auto_unbox = TRUE, digits = NA)
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
        if (!is.null(self$`refundAmount`)) {
          sprintf(
          '"refundAmount":
            %d
                    ',
          self$`refundAmount`
          )
        },
        if (!is.null(self$`partnerCompensation`)) {
          sprintf(
          '"partnerCompensation":
            %d
                    ',
          self$`partnerCompensation`
          )
        },
        if (!is.null(self$`images`)) {
          sprintf(
          '"images":
             [%s]
          ',
          paste(unlist(lapply(self$`images`, function(x) paste0('"', x, '"'))), collapse = ",")
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of ReturnDecisionDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of ReturnDecisionDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of ReturnDecisionDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`returnItemId` <- this_object$`returnItemId`
      self$`count` <- this_object$`count`
      self$`comment` <- this_object$`comment`
      self$`reasonType` <- ReturnDecisionReasonType$new()$fromJSON(jsonlite::toJSON(this_object$`reasonType`, auto_unbox = TRUE, digits = NA))
      self$`subreasonType` <- ReturnDecisionSubreasonType$new()$fromJSON(jsonlite::toJSON(this_object$`subreasonType`, auto_unbox = TRUE, digits = NA))
      self$`decisionType` <- ReturnDecisionType$new()$fromJSON(jsonlite::toJSON(this_object$`decisionType`, auto_unbox = TRUE, digits = NA))
      self$`refundAmount` <- this_object$`refundAmount`
      self$`partnerCompensation` <- this_object$`partnerCompensation`
      self$`images` <- ApiClient$new()$deserializeObj(this_object$`images`, "array[character]", loadNamespace("ympa_r_client"))
      self
    },
    #' Validate JSON input with respect to ReturnDecisionDTO
    #'
    #' @description
    #' Validate JSON input with respect to ReturnDecisionDTO and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of ReturnDecisionDTO
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
# ReturnDecisionDTO$unlock()
#
## Below is an example to define the print function
# ReturnDecisionDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# ReturnDecisionDTO$lock()

