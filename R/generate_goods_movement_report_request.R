#' Create a new GenerateGoodsMovementReportRequest
#'
#' @description
#' Данные, необходимые для генерации отчета.
#'
#' @docType class
#' @title GenerateGoodsMovementReportRequest
#' @description GenerateGoodsMovementReportRequest Class
#' @format An \code{R6Class} generator object
#' @field campaignId Идентификатор кампании. integer
#' @field dateFrom Начало периода, включительно. character
#' @field dateTo Конец периода, включительно. character
#' @field shopSku Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
GenerateGoodsMovementReportRequest <- R6::R6Class(
  "GenerateGoodsMovementReportRequest",
  public = list(
    `campaignId` = NULL,
    `dateFrom` = NULL,
    `dateTo` = NULL,
    `shopSku` = NULL,
    #' Initialize a new GenerateGoodsMovementReportRequest class.
    #'
    #' @description
    #' Initialize a new GenerateGoodsMovementReportRequest class.
    #'
    #' @param campaignId Идентификатор кампании.
    #' @param dateFrom Начало периода, включительно.
    #' @param dateTo Конец периода, включительно.
    #' @param shopSku Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`campaignId`, `dateFrom`, `dateTo`, `shopSku` = NULL, ...) {
      if (!missing(`campaignId`)) {
        if (!(is.numeric(`campaignId`) && length(`campaignId`) == 1)) {
          stop(paste("Error! Invalid data for `campaignId`. Must be an integer:", `campaignId`))
        }
        self$`campaignId` <- `campaignId`
      }
      if (!missing(`dateFrom`)) {
        if (!(is.character(`dateFrom`) && length(`dateFrom`) == 1)) {
          stop(paste("Error! Invalid data for `dateFrom`. Must be a string:", `dateFrom`))
        }
        self$`dateFrom` <- `dateFrom`
      }
      if (!missing(`dateTo`)) {
        if (!(is.character(`dateTo`) && length(`dateTo`) == 1)) {
          stop(paste("Error! Invalid data for `dateTo`. Must be a string:", `dateTo`))
        }
        self$`dateTo` <- `dateTo`
      }
      if (!is.null(`shopSku`)) {
        if (!(is.character(`shopSku`) && length(`shopSku`) == 1)) {
          stop(paste("Error! Invalid data for `shopSku`. Must be a string:", `shopSku`))
        }
        self$`shopSku` <- `shopSku`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return GenerateGoodsMovementReportRequest in JSON format
    #' @export
    toJSON = function() {
      GenerateGoodsMovementReportRequestObject <- list()
      if (!is.null(self$`campaignId`)) {
        GenerateGoodsMovementReportRequestObject[["campaignId"]] <-
          self$`campaignId`
      }
      if (!is.null(self$`dateFrom`)) {
        GenerateGoodsMovementReportRequestObject[["dateFrom"]] <-
          self$`dateFrom`
      }
      if (!is.null(self$`dateTo`)) {
        GenerateGoodsMovementReportRequestObject[["dateTo"]] <-
          self$`dateTo`
      }
      if (!is.null(self$`shopSku`)) {
        GenerateGoodsMovementReportRequestObject[["shopSku"]] <-
          self$`shopSku`
      }
      GenerateGoodsMovementReportRequestObject
    },
    #' Deserialize JSON string into an instance of GenerateGoodsMovementReportRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of GenerateGoodsMovementReportRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of GenerateGoodsMovementReportRequest
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`campaignId`)) {
        self$`campaignId` <- this_object$`campaignId`
      }
      if (!is.null(this_object$`dateFrom`)) {
        self$`dateFrom` <- this_object$`dateFrom`
      }
      if (!is.null(this_object$`dateTo`)) {
        self$`dateTo` <- this_object$`dateTo`
      }
      if (!is.null(this_object$`shopSku`)) {
        self$`shopSku` <- this_object$`shopSku`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return GenerateGoodsMovementReportRequest in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`campaignId`)) {
          sprintf(
          '"campaignId":
            %d
                    ',
          self$`campaignId`
          )
        },
        if (!is.null(self$`dateFrom`)) {
          sprintf(
          '"dateFrom":
            "%s"
                    ',
          self$`dateFrom`
          )
        },
        if (!is.null(self$`dateTo`)) {
          sprintf(
          '"dateTo":
            "%s"
                    ',
          self$`dateTo`
          )
        },
        if (!is.null(self$`shopSku`)) {
          sprintf(
          '"shopSku":
            "%s"
                    ',
          self$`shopSku`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of GenerateGoodsMovementReportRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of GenerateGoodsMovementReportRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of GenerateGoodsMovementReportRequest
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`campaignId` <- this_object$`campaignId`
      self$`dateFrom` <- this_object$`dateFrom`
      self$`dateTo` <- this_object$`dateTo`
      self$`shopSku` <- this_object$`shopSku`
      self
    },
    #' Validate JSON input with respect to GenerateGoodsMovementReportRequest
    #'
    #' @description
    #' Validate JSON input with respect to GenerateGoodsMovementReportRequest and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `campaignId`
      if (!is.null(input_json$`campaignId`)) {
        if (!(is.numeric(input_json$`campaignId`) && length(input_json$`campaignId`) == 1)) {
          stop(paste("Error! Invalid data for `campaignId`. Must be an integer:", input_json$`campaignId`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for GenerateGoodsMovementReportRequest: the required field `campaignId` is missing."))
      }
      # check the required field `dateFrom`
      if (!is.null(input_json$`dateFrom`)) {
        if (!(is.character(input_json$`dateFrom`) && length(input_json$`dateFrom`) == 1)) {
          stop(paste("Error! Invalid data for `dateFrom`. Must be a string:", input_json$`dateFrom`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for GenerateGoodsMovementReportRequest: the required field `dateFrom` is missing."))
      }
      # check the required field `dateTo`
      if (!is.null(input_json$`dateTo`)) {
        if (!(is.character(input_json$`dateTo`) && length(input_json$`dateTo`) == 1)) {
          stop(paste("Error! Invalid data for `dateTo`. Must be a string:", input_json$`dateTo`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for GenerateGoodsMovementReportRequest: the required field `dateTo` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of GenerateGoodsMovementReportRequest
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
      # check if the required `campaignId` is null
      if (is.null(self$`campaignId`)) {
        return(FALSE)
      }

      # check if the required `dateFrom` is null
      if (is.null(self$`dateFrom`)) {
        return(FALSE)
      }

      # check if the required `dateTo` is null
      if (is.null(self$`dateTo`)) {
        return(FALSE)
      }

      if (nchar(self$`shopSku`) > 255) {
        return(FALSE)
      }
      if (nchar(self$`shopSku`) < 1) {
        return(FALSE)
      }
      if (!str_detect(self$`shopSku`, "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")) {
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
      # check if the required `campaignId` is null
      if (is.null(self$`campaignId`)) {
        invalid_fields["campaignId"] <- "Non-nullable required field `campaignId` cannot be null."
      }

      # check if the required `dateFrom` is null
      if (is.null(self$`dateFrom`)) {
        invalid_fields["dateFrom"] <- "Non-nullable required field `dateFrom` cannot be null."
      }

      # check if the required `dateTo` is null
      if (is.null(self$`dateTo`)) {
        invalid_fields["dateTo"] <- "Non-nullable required field `dateTo` cannot be null."
      }

      if (nchar(self$`shopSku`) > 255) {
        invalid_fields["shopSku"] <- "Invalid length for `shopSku`, must be smaller than or equal to 255."
      }
      if (nchar(self$`shopSku`) < 1) {
        invalid_fields["shopSku"] <- "Invalid length for `shopSku`, must be bigger than or equal to 1."
      }
      if (!str_detect(self$`shopSku`, "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")) {
        invalid_fields["shopSku"] <- "Invalid value for `shopSku`, must conform to the pattern ^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$."
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
# GenerateGoodsMovementReportRequest$unlock()
#
## Below is an example to define the print function
# GenerateGoodsMovementReportRequest$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# GenerateGoodsMovementReportRequest$lock()

