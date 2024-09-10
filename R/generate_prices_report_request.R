#' Create a new GeneratePricesReportRequest
#'
#' @description
#' Данные, необходимые для генерации отчета.
#'
#' @docType class
#' @title GeneratePricesReportRequest
#' @description GeneratePricesReportRequest Class
#' @format An \code{R6Class} generator object
#' @field businessId Идентификатор бизнеса.  В большинстве случаев обязателен. Не указывается, если задан `campaignId`. integer [optional]
#' @field campaignId Идентификатор кампании.  Как правило, не используется. Передавайте только если в кабинете есть магазины с уникальными ценами и вы хотите получить отчет для них. В этом случае передавать `businessId` не нужно. integer [optional]
#' @field categoryIds Фильтр по категориям на Маркете. list(integer) [optional]
#' @field creationDateFrom Фильтр по времени появления предложения — начало периода.  Формат даты: `ДД-ММ-ГГГГ`. character [optional]
#' @field creationDateTo Фильтр по времени появления предложения — окончание периода.  Формат даты: `ДД-ММ-ГГГГ`. character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
GeneratePricesReportRequest <- R6::R6Class(
  "GeneratePricesReportRequest",
  public = list(
    `businessId` = NULL,
    `campaignId` = NULL,
    `categoryIds` = NULL,
    `creationDateFrom` = NULL,
    `creationDateTo` = NULL,
    #' Initialize a new GeneratePricesReportRequest class.
    #'
    #' @description
    #' Initialize a new GeneratePricesReportRequest class.
    #'
    #' @param businessId Идентификатор бизнеса.  В большинстве случаев обязателен. Не указывается, если задан `campaignId`.
    #' @param campaignId Идентификатор кампании.  Как правило, не используется. Передавайте только если в кабинете есть магазины с уникальными ценами и вы хотите получить отчет для них. В этом случае передавать `businessId` не нужно.
    #' @param categoryIds Фильтр по категориям на Маркете.
    #' @param creationDateFrom Фильтр по времени появления предложения — начало периода.  Формат даты: `ДД-ММ-ГГГГ`.
    #' @param creationDateTo Фильтр по времени появления предложения — окончание периода.  Формат даты: `ДД-ММ-ГГГГ`.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`businessId` = NULL, `campaignId` = NULL, `categoryIds` = NULL, `creationDateFrom` = NULL, `creationDateTo` = NULL, ...) {
      if (!is.null(`businessId`)) {
        if (!(is.numeric(`businessId`) && length(`businessId`) == 1)) {
          stop(paste("Error! Invalid data for `businessId`. Must be an integer:", `businessId`))
        }
        self$`businessId` <- `businessId`
      }
      if (!is.null(`campaignId`)) {
        if (!(is.numeric(`campaignId`) && length(`campaignId`) == 1)) {
          stop(paste("Error! Invalid data for `campaignId`. Must be an integer:", `campaignId`))
        }
        self$`campaignId` <- `campaignId`
      }
      if (!is.null(`categoryIds`)) {
        stopifnot(is.vector(`categoryIds`), length(`categoryIds`) != 0)
        sapply(`categoryIds`, function(x) stopifnot(is.character(x)))
        self$`categoryIds` <- `categoryIds`
      }
      if (!is.null(`creationDateFrom`)) {
        if (!is.character(`creationDateFrom`)) {
          stop(paste("Error! Invalid data for `creationDateFrom`. Must be a string:", `creationDateFrom`))
        }
        self$`creationDateFrom` <- `creationDateFrom`
      }
      if (!is.null(`creationDateTo`)) {
        if (!is.character(`creationDateTo`)) {
          stop(paste("Error! Invalid data for `creationDateTo`. Must be a string:", `creationDateTo`))
        }
        self$`creationDateTo` <- `creationDateTo`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return GeneratePricesReportRequest in JSON format
    #' @export
    toJSON = function() {
      GeneratePricesReportRequestObject <- list()
      if (!is.null(self$`businessId`)) {
        GeneratePricesReportRequestObject[["businessId"]] <-
          self$`businessId`
      }
      if (!is.null(self$`campaignId`)) {
        GeneratePricesReportRequestObject[["campaignId"]] <-
          self$`campaignId`
      }
      if (!is.null(self$`categoryIds`)) {
        GeneratePricesReportRequestObject[["categoryIds"]] <-
          self$`categoryIds`
      }
      if (!is.null(self$`creationDateFrom`)) {
        GeneratePricesReportRequestObject[["creationDateFrom"]] <-
          self$`creationDateFrom`
      }
      if (!is.null(self$`creationDateTo`)) {
        GeneratePricesReportRequestObject[["creationDateTo"]] <-
          self$`creationDateTo`
      }
      GeneratePricesReportRequestObject
    },
    #' Deserialize JSON string into an instance of GeneratePricesReportRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of GeneratePricesReportRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of GeneratePricesReportRequest
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`businessId`)) {
        self$`businessId` <- this_object$`businessId`
      }
      if (!is.null(this_object$`campaignId`)) {
        self$`campaignId` <- this_object$`campaignId`
      }
      if (!is.null(this_object$`categoryIds`)) {
        self$`categoryIds` <- ApiClient$new()$deserializeObj(this_object$`categoryIds`, "array[integer]", loadNamespace("ympa_r_client"))
      }
      if (!is.null(this_object$`creationDateFrom`)) {
        self$`creationDateFrom` <- this_object$`creationDateFrom`
      }
      if (!is.null(this_object$`creationDateTo`)) {
        self$`creationDateTo` <- this_object$`creationDateTo`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return GeneratePricesReportRequest in JSON format
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
        if (!is.null(self$`campaignId`)) {
          sprintf(
          '"campaignId":
            %d
                    ',
          self$`campaignId`
          )
        },
        if (!is.null(self$`categoryIds`)) {
          sprintf(
          '"categoryIds":
             [%s]
          ',
          paste(unlist(lapply(self$`categoryIds`, function(x) paste0('"', x, '"'))), collapse = ",")
          )
        },
        if (!is.null(self$`creationDateFrom`)) {
          sprintf(
          '"creationDateFrom":
            "%s"
                    ',
          self$`creationDateFrom`
          )
        },
        if (!is.null(self$`creationDateTo`)) {
          sprintf(
          '"creationDateTo":
            "%s"
                    ',
          self$`creationDateTo`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of GeneratePricesReportRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of GeneratePricesReportRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of GeneratePricesReportRequest
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`businessId` <- this_object$`businessId`
      self$`campaignId` <- this_object$`campaignId`
      self$`categoryIds` <- ApiClient$new()$deserializeObj(this_object$`categoryIds`, "array[integer]", loadNamespace("ympa_r_client"))
      self$`creationDateFrom` <- this_object$`creationDateFrom`
      self$`creationDateTo` <- this_object$`creationDateTo`
      self
    },
    #' Validate JSON input with respect to GeneratePricesReportRequest
    #'
    #' @description
    #' Validate JSON input with respect to GeneratePricesReportRequest and throw an exception if invalid
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
    #' @return String representation of GeneratePricesReportRequest
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
# GeneratePricesReportRequest$unlock()
#
## Below is an example to define the print function
# GeneratePricesReportRequest$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# GeneratePricesReportRequest$lock()

