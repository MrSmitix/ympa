#' Create a new GenerateUnitedOrdersRequest
#'
#' @description
#' Данные, необходимые для генерации отчета. 
#'
#' @docType class
#' @title GenerateUnitedOrdersRequest
#' @description GenerateUnitedOrdersRequest Class
#' @format An \code{R6Class} generator object
#' @field businessId Идентификатор бизнеса. integer
#' @field dateFrom Начало периода, включительно. character
#' @field dateTo Конец периода, включительно. Максимальный период — 1 год. character
#' @field campaignIds Список магазинов, которые нужны в отчете. list(integer) [optional]
#' @field promoId Идентификатор акции, товары из которой нужны в отчете. character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
GenerateUnitedOrdersRequest <- R6::R6Class(
  "GenerateUnitedOrdersRequest",
  public = list(
    `businessId` = NULL,
    `dateFrom` = NULL,
    `dateTo` = NULL,
    `campaignIds` = NULL,
    `promoId` = NULL,
    #' Initialize a new GenerateUnitedOrdersRequest class.
    #'
    #' @description
    #' Initialize a new GenerateUnitedOrdersRequest class.
    #'
    #' @param businessId Идентификатор бизнеса.
    #' @param dateFrom Начало периода, включительно.
    #' @param dateTo Конец периода, включительно. Максимальный период — 1 год.
    #' @param campaignIds Список магазинов, которые нужны в отчете.
    #' @param promoId Идентификатор акции, товары из которой нужны в отчете.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`businessId`, `dateFrom`, `dateTo`, `campaignIds` = NULL, `promoId` = NULL, ...) {
      if (!missing(`businessId`)) {
        if (!(is.numeric(`businessId`) && length(`businessId`) == 1)) {
          stop(paste("Error! Invalid data for `businessId`. Must be an integer:", `businessId`))
        }
        self$`businessId` <- `businessId`
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
      if (!is.null(`campaignIds`)) {
        stopifnot(is.vector(`campaignIds`), length(`campaignIds`) != 0)
        sapply(`campaignIds`, function(x) stopifnot(is.character(x)))
        self$`campaignIds` <- `campaignIds`
      }
      if (!is.null(`promoId`)) {
        if (!(is.character(`promoId`) && length(`promoId`) == 1)) {
          stop(paste("Error! Invalid data for `promoId`. Must be a string:", `promoId`))
        }
        self$`promoId` <- `promoId`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return GenerateUnitedOrdersRequest in JSON format
    #' @export
    toJSON = function() {
      GenerateUnitedOrdersRequestObject <- list()
      if (!is.null(self$`businessId`)) {
        GenerateUnitedOrdersRequestObject[["businessId"]] <-
          self$`businessId`
      }
      if (!is.null(self$`dateFrom`)) {
        GenerateUnitedOrdersRequestObject[["dateFrom"]] <-
          self$`dateFrom`
      }
      if (!is.null(self$`dateTo`)) {
        GenerateUnitedOrdersRequestObject[["dateTo"]] <-
          self$`dateTo`
      }
      if (!is.null(self$`campaignIds`)) {
        GenerateUnitedOrdersRequestObject[["campaignIds"]] <-
          self$`campaignIds`
      }
      if (!is.null(self$`promoId`)) {
        GenerateUnitedOrdersRequestObject[["promoId"]] <-
          self$`promoId`
      }
      GenerateUnitedOrdersRequestObject
    },
    #' Deserialize JSON string into an instance of GenerateUnitedOrdersRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of GenerateUnitedOrdersRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of GenerateUnitedOrdersRequest
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`businessId`)) {
        self$`businessId` <- this_object$`businessId`
      }
      if (!is.null(this_object$`dateFrom`)) {
        self$`dateFrom` <- this_object$`dateFrom`
      }
      if (!is.null(this_object$`dateTo`)) {
        self$`dateTo` <- this_object$`dateTo`
      }
      if (!is.null(this_object$`campaignIds`)) {
        self$`campaignIds` <- ApiClient$new()$deserializeObj(this_object$`campaignIds`, "array[integer]", loadNamespace("ympa_r_client"))
      }
      if (!is.null(this_object$`promoId`)) {
        self$`promoId` <- this_object$`promoId`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return GenerateUnitedOrdersRequest in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`businessId`)) {
          sprintf(
          '"businessId":
            %d
                    ',
          self$`businessId`
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
        if (!is.null(self$`campaignIds`)) {
          sprintf(
          '"campaignIds":
             [%s]
          ',
          paste(unlist(lapply(self$`campaignIds`, function(x) paste0('"', x, '"'))), collapse = ",")
          )
        },
        if (!is.null(self$`promoId`)) {
          sprintf(
          '"promoId":
            "%s"
                    ',
          self$`promoId`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of GenerateUnitedOrdersRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of GenerateUnitedOrdersRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of GenerateUnitedOrdersRequest
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`businessId` <- this_object$`businessId`
      self$`dateFrom` <- this_object$`dateFrom`
      self$`dateTo` <- this_object$`dateTo`
      self$`campaignIds` <- ApiClient$new()$deserializeObj(this_object$`campaignIds`, "array[integer]", loadNamespace("ympa_r_client"))
      self$`promoId` <- this_object$`promoId`
      self
    },
    #' Validate JSON input with respect to GenerateUnitedOrdersRequest
    #'
    #' @description
    #' Validate JSON input with respect to GenerateUnitedOrdersRequest and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `businessId`
      if (!is.null(input_json$`businessId`)) {
        if (!(is.numeric(input_json$`businessId`) && length(input_json$`businessId`) == 1)) {
          stop(paste("Error! Invalid data for `businessId`. Must be an integer:", input_json$`businessId`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for GenerateUnitedOrdersRequest: the required field `businessId` is missing."))
      }
      # check the required field `dateFrom`
      if (!is.null(input_json$`dateFrom`)) {
        if (!(is.character(input_json$`dateFrom`) && length(input_json$`dateFrom`) == 1)) {
          stop(paste("Error! Invalid data for `dateFrom`. Must be a string:", input_json$`dateFrom`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for GenerateUnitedOrdersRequest: the required field `dateFrom` is missing."))
      }
      # check the required field `dateTo`
      if (!is.null(input_json$`dateTo`)) {
        if (!(is.character(input_json$`dateTo`) && length(input_json$`dateTo`) == 1)) {
          stop(paste("Error! Invalid data for `dateTo`. Must be a string:", input_json$`dateTo`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for GenerateUnitedOrdersRequest: the required field `dateTo` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of GenerateUnitedOrdersRequest
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
      # check if the required `businessId` is null
      if (is.null(self$`businessId`)) {
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
      # check if the required `businessId` is null
      if (is.null(self$`businessId`)) {
        invalid_fields["businessId"] <- "Non-nullable required field `businessId` cannot be null."
      }

      # check if the required `dateFrom` is null
      if (is.null(self$`dateFrom`)) {
        invalid_fields["dateFrom"] <- "Non-nullable required field `dateFrom` cannot be null."
      }

      # check if the required `dateTo` is null
      if (is.null(self$`dateTo`)) {
        invalid_fields["dateTo"] <- "Non-nullable required field `dateTo` cannot be null."
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
# GenerateUnitedOrdersRequest$unlock()
#
## Below is an example to define the print function
# GenerateUnitedOrdersRequest$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# GenerateUnitedOrdersRequest$lock()

