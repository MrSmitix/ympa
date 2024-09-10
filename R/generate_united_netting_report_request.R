#' Create a new GenerateUnitedNettingReportRequest
#'
#' @description
#' Данные, необходимые для генерации отчета: идентификатор магазина, период, за который нужен отчет, а также фильтры. 
#'
#' @docType class
#' @title GenerateUnitedNettingReportRequest
#' @description GenerateUnitedNettingReportRequest Class
#' @format An \code{R6Class} generator object
#' @field businessId Идентификатор бизнеса. integer
#' @field dateTimeFrom {\% note warning \"\" \%}  Этот параметр устарел. Не используйте его.  {\% endnote \%}  Начало периода, включительно. character [optional]
#' @field dateTimeTo {\% note warning \"\" \%}  Этот параметр устарел. Не используйте его.  {\% endnote \%}  Конец периода, включительно. Максимальный период — 1 год. character [optional]
#' @field dateFrom Начало периода, включительно. character [optional]
#' @field dateTo Конец периода, включительно. Максимальный период — 1 год. character [optional]
#' @field bankOrderId Номер платежного поручения. integer [optional]
#' @field bankOrderDateTime Дата платежного поручения. character [optional]
#' @field placementPrograms Список моделей, которые нужны в отчете. list(\link{PlacementType}) [optional]
#' @field inns Список ИНН, которые нужны в отчете. list(character) [optional]
#' @field campaignIds Список магазинов, которые нужны в отчете. list(integer) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
GenerateUnitedNettingReportRequest <- R6::R6Class(
  "GenerateUnitedNettingReportRequest",
  public = list(
    `businessId` = NULL,
    `dateTimeFrom` = NULL,
    `dateTimeTo` = NULL,
    `dateFrom` = NULL,
    `dateTo` = NULL,
    `bankOrderId` = NULL,
    `bankOrderDateTime` = NULL,
    `placementPrograms` = NULL,
    `inns` = NULL,
    `campaignIds` = NULL,
    #' Initialize a new GenerateUnitedNettingReportRequest class.
    #'
    #' @description
    #' Initialize a new GenerateUnitedNettingReportRequest class.
    #'
    #' @param businessId Идентификатор бизнеса.
    #' @param dateTimeFrom {\% note warning \"\" \%}  Этот параметр устарел. Не используйте его.  {\% endnote \%}  Начало периода, включительно.
    #' @param dateTimeTo {\% note warning \"\" \%}  Этот параметр устарел. Не используйте его.  {\% endnote \%}  Конец периода, включительно. Максимальный период — 1 год.
    #' @param dateFrom Начало периода, включительно.
    #' @param dateTo Конец периода, включительно. Максимальный период — 1 год.
    #' @param bankOrderId Номер платежного поручения.
    #' @param bankOrderDateTime Дата платежного поручения.
    #' @param placementPrograms Список моделей, которые нужны в отчете.
    #' @param inns Список ИНН, которые нужны в отчете.
    #' @param campaignIds Список магазинов, которые нужны в отчете.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`businessId`, `dateTimeFrom` = NULL, `dateTimeTo` = NULL, `dateFrom` = NULL, `dateTo` = NULL, `bankOrderId` = NULL, `bankOrderDateTime` = NULL, `placementPrograms` = NULL, `inns` = NULL, `campaignIds` = NULL, ...) {
      if (!missing(`businessId`)) {
        if (!(is.numeric(`businessId`) && length(`businessId`) == 1)) {
          stop(paste("Error! Invalid data for `businessId`. Must be an integer:", `businessId`))
        }
        self$`businessId` <- `businessId`
      }
      if (!is.null(`dateTimeFrom`)) {
        if (!is.character(`dateTimeFrom`)) {
          stop(paste("Error! Invalid data for `dateTimeFrom`. Must be a string:", `dateTimeFrom`))
        }
        self$`dateTimeFrom` <- `dateTimeFrom`
      }
      if (!is.null(`dateTimeTo`)) {
        if (!is.character(`dateTimeTo`)) {
          stop(paste("Error! Invalid data for `dateTimeTo`. Must be a string:", `dateTimeTo`))
        }
        self$`dateTimeTo` <- `dateTimeTo`
      }
      if (!is.null(`dateFrom`)) {
        if (!is.character(`dateFrom`)) {
          stop(paste("Error! Invalid data for `dateFrom`. Must be a string:", `dateFrom`))
        }
        self$`dateFrom` <- `dateFrom`
      }
      if (!is.null(`dateTo`)) {
        if (!is.character(`dateTo`)) {
          stop(paste("Error! Invalid data for `dateTo`. Must be a string:", `dateTo`))
        }
        self$`dateTo` <- `dateTo`
      }
      if (!is.null(`bankOrderId`)) {
        if (!(is.numeric(`bankOrderId`) && length(`bankOrderId`) == 1)) {
          stop(paste("Error! Invalid data for `bankOrderId`. Must be an integer:", `bankOrderId`))
        }
        self$`bankOrderId` <- `bankOrderId`
      }
      if (!is.null(`bankOrderDateTime`)) {
        if (!is.character(`bankOrderDateTime`)) {
          stop(paste("Error! Invalid data for `bankOrderDateTime`. Must be a string:", `bankOrderDateTime`))
        }
        self$`bankOrderDateTime` <- `bankOrderDateTime`
      }
      if (!is.null(`placementPrograms`)) {
        stopifnot(is.vector(`placementPrograms`), length(`placementPrograms`) != 0)
        sapply(`placementPrograms`, function(x) stopifnot(R6::is.R6(x)))
        self$`placementPrograms` <- `placementPrograms`
      }
      if (!is.null(`inns`)) {
        stopifnot(is.vector(`inns`), length(`inns`) != 0)
        sapply(`inns`, function(x) stopifnot(is.character(x)))
        self$`inns` <- `inns`
      }
      if (!is.null(`campaignIds`)) {
        stopifnot(is.vector(`campaignIds`), length(`campaignIds`) != 0)
        sapply(`campaignIds`, function(x) stopifnot(is.character(x)))
        self$`campaignIds` <- `campaignIds`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return GenerateUnitedNettingReportRequest in JSON format
    #' @export
    toJSON = function() {
      GenerateUnitedNettingReportRequestObject <- list()
      if (!is.null(self$`businessId`)) {
        GenerateUnitedNettingReportRequestObject[["businessId"]] <-
          self$`businessId`
      }
      if (!is.null(self$`dateTimeFrom`)) {
        GenerateUnitedNettingReportRequestObject[["dateTimeFrom"]] <-
          self$`dateTimeFrom`
      }
      if (!is.null(self$`dateTimeTo`)) {
        GenerateUnitedNettingReportRequestObject[["dateTimeTo"]] <-
          self$`dateTimeTo`
      }
      if (!is.null(self$`dateFrom`)) {
        GenerateUnitedNettingReportRequestObject[["dateFrom"]] <-
          self$`dateFrom`
      }
      if (!is.null(self$`dateTo`)) {
        GenerateUnitedNettingReportRequestObject[["dateTo"]] <-
          self$`dateTo`
      }
      if (!is.null(self$`bankOrderId`)) {
        GenerateUnitedNettingReportRequestObject[["bankOrderId"]] <-
          self$`bankOrderId`
      }
      if (!is.null(self$`bankOrderDateTime`)) {
        GenerateUnitedNettingReportRequestObject[["bankOrderDateTime"]] <-
          self$`bankOrderDateTime`
      }
      if (!is.null(self$`placementPrograms`)) {
        GenerateUnitedNettingReportRequestObject[["placementPrograms"]] <-
          lapply(self$`placementPrograms`, function(x) x$toJSON())
      }
      if (!is.null(self$`inns`)) {
        GenerateUnitedNettingReportRequestObject[["inns"]] <-
          self$`inns`
      }
      if (!is.null(self$`campaignIds`)) {
        GenerateUnitedNettingReportRequestObject[["campaignIds"]] <-
          self$`campaignIds`
      }
      GenerateUnitedNettingReportRequestObject
    },
    #' Deserialize JSON string into an instance of GenerateUnitedNettingReportRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of GenerateUnitedNettingReportRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of GenerateUnitedNettingReportRequest
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`businessId`)) {
        self$`businessId` <- this_object$`businessId`
      }
      if (!is.null(this_object$`dateTimeFrom`)) {
        self$`dateTimeFrom` <- this_object$`dateTimeFrom`
      }
      if (!is.null(this_object$`dateTimeTo`)) {
        self$`dateTimeTo` <- this_object$`dateTimeTo`
      }
      if (!is.null(this_object$`dateFrom`)) {
        self$`dateFrom` <- this_object$`dateFrom`
      }
      if (!is.null(this_object$`dateTo`)) {
        self$`dateTo` <- this_object$`dateTo`
      }
      if (!is.null(this_object$`bankOrderId`)) {
        self$`bankOrderId` <- this_object$`bankOrderId`
      }
      if (!is.null(this_object$`bankOrderDateTime`)) {
        self$`bankOrderDateTime` <- this_object$`bankOrderDateTime`
      }
      if (!is.null(this_object$`placementPrograms`)) {
        self$`placementPrograms` <- ApiClient$new()$deserializeObj(this_object$`placementPrograms`, "array[PlacementType]", loadNamespace("ympa_r_client"))
      }
      if (!is.null(this_object$`inns`)) {
        self$`inns` <- ApiClient$new()$deserializeObj(this_object$`inns`, "array[character]", loadNamespace("ympa_r_client"))
      }
      if (!is.null(this_object$`campaignIds`)) {
        self$`campaignIds` <- ApiClient$new()$deserializeObj(this_object$`campaignIds`, "array[integer]", loadNamespace("ympa_r_client"))
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return GenerateUnitedNettingReportRequest in JSON format
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
        if (!is.null(self$`dateTimeFrom`)) {
          sprintf(
          '"dateTimeFrom":
            "%s"
                    ',
          self$`dateTimeFrom`
          )
        },
        if (!is.null(self$`dateTimeTo`)) {
          sprintf(
          '"dateTimeTo":
            "%s"
                    ',
          self$`dateTimeTo`
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
        if (!is.null(self$`bankOrderId`)) {
          sprintf(
          '"bankOrderId":
            %d
                    ',
          self$`bankOrderId`
          )
        },
        if (!is.null(self$`bankOrderDateTime`)) {
          sprintf(
          '"bankOrderDateTime":
            "%s"
                    ',
          self$`bankOrderDateTime`
          )
        },
        if (!is.null(self$`placementPrograms`)) {
          sprintf(
          '"placementPrograms":
          [%s]
',
          paste(sapply(self$`placementPrograms`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        },
        if (!is.null(self$`inns`)) {
          sprintf(
          '"inns":
             [%s]
          ',
          paste(unlist(lapply(self$`inns`, function(x) paste0('"', x, '"'))), collapse = ",")
          )
        },
        if (!is.null(self$`campaignIds`)) {
          sprintf(
          '"campaignIds":
             [%s]
          ',
          paste(unlist(lapply(self$`campaignIds`, function(x) paste0('"', x, '"'))), collapse = ",")
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of GenerateUnitedNettingReportRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of GenerateUnitedNettingReportRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of GenerateUnitedNettingReportRequest
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`businessId` <- this_object$`businessId`
      self$`dateTimeFrom` <- this_object$`dateTimeFrom`
      self$`dateTimeTo` <- this_object$`dateTimeTo`
      self$`dateFrom` <- this_object$`dateFrom`
      self$`dateTo` <- this_object$`dateTo`
      self$`bankOrderId` <- this_object$`bankOrderId`
      self$`bankOrderDateTime` <- this_object$`bankOrderDateTime`
      self$`placementPrograms` <- ApiClient$new()$deserializeObj(this_object$`placementPrograms`, "array[PlacementType]", loadNamespace("ympa_r_client"))
      self$`inns` <- ApiClient$new()$deserializeObj(this_object$`inns`, "array[character]", loadNamespace("ympa_r_client"))
      self$`campaignIds` <- ApiClient$new()$deserializeObj(this_object$`campaignIds`, "array[integer]", loadNamespace("ympa_r_client"))
      self
    },
    #' Validate JSON input with respect to GenerateUnitedNettingReportRequest
    #'
    #' @description
    #' Validate JSON input with respect to GenerateUnitedNettingReportRequest and throw an exception if invalid
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
        stop(paste("The JSON input `", input, "` is invalid for GenerateUnitedNettingReportRequest: the required field `businessId` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of GenerateUnitedNettingReportRequest
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
# GenerateUnitedNettingReportRequest$unlock()
#
## Below is an example to define the print function
# GenerateUnitedNettingReportRequest$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# GenerateUnitedNettingReportRequest$lock()

