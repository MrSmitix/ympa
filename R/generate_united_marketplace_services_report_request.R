#' Create a new GenerateUnitedMarketplaceServicesReportRequest
#'
#' @description
#' Данные, необходимые для генерации отчета: идентификатор магазина, период, за который нужен отчет, а также фильтры. 
#'
#' @docType class
#' @title GenerateUnitedMarketplaceServicesReportRequest
#' @description GenerateUnitedMarketplaceServicesReportRequest Class
#' @format An \code{R6Class} generator object
#' @field businessId Идентификатор бизнеса. integer
#' @field dateTimeFrom {\% note warning \"\" \%}  Этот параметр устарел. Не используйте его.  {\% endnote \%}  Начало периода, включительно. character [optional]
#' @field dateTimeTo {\% note warning \"\" \%}  Этот параметр устарел. Не используйте его.  {\% endnote \%}  Конец периода, включительно. Максимальный период — 1 год. character [optional]
#' @field dateFrom Начало периода, включительно. character [optional]
#' @field dateTo Конец периода, включительно. Максимальный период — 1 год. character [optional]
#' @field yearFrom Начальный год формирования акта. integer [optional]
#' @field monthFrom Начальный номер месяца формирования акта. integer [optional]
#' @field yearTo Конечный год формирования акта. integer [optional]
#' @field monthTo Конечный номер месяца формирования акта. integer [optional]
#' @field placementPrograms Список моделей, которые нужны в отчете. list(\link{PlacementType}) [optional]
#' @field inns Список ИНН, которые нужны в отчете. list(character) [optional]
#' @field campaignIds Список магазинов, которые нужны в отчете. list(integer) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
GenerateUnitedMarketplaceServicesReportRequest <- R6::R6Class(
  "GenerateUnitedMarketplaceServicesReportRequest",
  public = list(
    `businessId` = NULL,
    `dateTimeFrom` = NULL,
    `dateTimeTo` = NULL,
    `dateFrom` = NULL,
    `dateTo` = NULL,
    `yearFrom` = NULL,
    `monthFrom` = NULL,
    `yearTo` = NULL,
    `monthTo` = NULL,
    `placementPrograms` = NULL,
    `inns` = NULL,
    `campaignIds` = NULL,
    #' Initialize a new GenerateUnitedMarketplaceServicesReportRequest class.
    #'
    #' @description
    #' Initialize a new GenerateUnitedMarketplaceServicesReportRequest class.
    #'
    #' @param businessId Идентификатор бизнеса.
    #' @param dateTimeFrom {\% note warning \"\" \%}  Этот параметр устарел. Не используйте его.  {\% endnote \%}  Начало периода, включительно.
    #' @param dateTimeTo {\% note warning \"\" \%}  Этот параметр устарел. Не используйте его.  {\% endnote \%}  Конец периода, включительно. Максимальный период — 1 год.
    #' @param dateFrom Начало периода, включительно.
    #' @param dateTo Конец периода, включительно. Максимальный период — 1 год.
    #' @param yearFrom Начальный год формирования акта.
    #' @param monthFrom Начальный номер месяца формирования акта.
    #' @param yearTo Конечный год формирования акта.
    #' @param monthTo Конечный номер месяца формирования акта.
    #' @param placementPrograms Список моделей, которые нужны в отчете.
    #' @param inns Список ИНН, которые нужны в отчете.
    #' @param campaignIds Список магазинов, которые нужны в отчете.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`businessId`, `dateTimeFrom` = NULL, `dateTimeTo` = NULL, `dateFrom` = NULL, `dateTo` = NULL, `yearFrom` = NULL, `monthFrom` = NULL, `yearTo` = NULL, `monthTo` = NULL, `placementPrograms` = NULL, `inns` = NULL, `campaignIds` = NULL, ...) {
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
      if (!is.null(`yearFrom`)) {
        if (!(is.numeric(`yearFrom`) && length(`yearFrom`) == 1)) {
          stop(paste("Error! Invalid data for `yearFrom`. Must be an integer:", `yearFrom`))
        }
        self$`yearFrom` <- `yearFrom`
      }
      if (!is.null(`monthFrom`)) {
        if (!(is.numeric(`monthFrom`) && length(`monthFrom`) == 1)) {
          stop(paste("Error! Invalid data for `monthFrom`. Must be an integer:", `monthFrom`))
        }
        self$`monthFrom` <- `monthFrom`
      }
      if (!is.null(`yearTo`)) {
        if (!(is.numeric(`yearTo`) && length(`yearTo`) == 1)) {
          stop(paste("Error! Invalid data for `yearTo`. Must be an integer:", `yearTo`))
        }
        self$`yearTo` <- `yearTo`
      }
      if (!is.null(`monthTo`)) {
        if (!(is.numeric(`monthTo`) && length(`monthTo`) == 1)) {
          stop(paste("Error! Invalid data for `monthTo`. Must be an integer:", `monthTo`))
        }
        self$`monthTo` <- `monthTo`
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
    #' @return GenerateUnitedMarketplaceServicesReportRequest in JSON format
    #' @export
    toJSON = function() {
      GenerateUnitedMarketplaceServicesReportRequestObject <- list()
      if (!is.null(self$`businessId`)) {
        GenerateUnitedMarketplaceServicesReportRequestObject[["businessId"]] <-
          self$`businessId`
      }
      if (!is.null(self$`dateTimeFrom`)) {
        GenerateUnitedMarketplaceServicesReportRequestObject[["dateTimeFrom"]] <-
          self$`dateTimeFrom`
      }
      if (!is.null(self$`dateTimeTo`)) {
        GenerateUnitedMarketplaceServicesReportRequestObject[["dateTimeTo"]] <-
          self$`dateTimeTo`
      }
      if (!is.null(self$`dateFrom`)) {
        GenerateUnitedMarketplaceServicesReportRequestObject[["dateFrom"]] <-
          self$`dateFrom`
      }
      if (!is.null(self$`dateTo`)) {
        GenerateUnitedMarketplaceServicesReportRequestObject[["dateTo"]] <-
          self$`dateTo`
      }
      if (!is.null(self$`yearFrom`)) {
        GenerateUnitedMarketplaceServicesReportRequestObject[["yearFrom"]] <-
          self$`yearFrom`
      }
      if (!is.null(self$`monthFrom`)) {
        GenerateUnitedMarketplaceServicesReportRequestObject[["monthFrom"]] <-
          self$`monthFrom`
      }
      if (!is.null(self$`yearTo`)) {
        GenerateUnitedMarketplaceServicesReportRequestObject[["yearTo"]] <-
          self$`yearTo`
      }
      if (!is.null(self$`monthTo`)) {
        GenerateUnitedMarketplaceServicesReportRequestObject[["monthTo"]] <-
          self$`monthTo`
      }
      if (!is.null(self$`placementPrograms`)) {
        GenerateUnitedMarketplaceServicesReportRequestObject[["placementPrograms"]] <-
          lapply(self$`placementPrograms`, function(x) x$toJSON())
      }
      if (!is.null(self$`inns`)) {
        GenerateUnitedMarketplaceServicesReportRequestObject[["inns"]] <-
          self$`inns`
      }
      if (!is.null(self$`campaignIds`)) {
        GenerateUnitedMarketplaceServicesReportRequestObject[["campaignIds"]] <-
          self$`campaignIds`
      }
      GenerateUnitedMarketplaceServicesReportRequestObject
    },
    #' Deserialize JSON string into an instance of GenerateUnitedMarketplaceServicesReportRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of GenerateUnitedMarketplaceServicesReportRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of GenerateUnitedMarketplaceServicesReportRequest
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
      if (!is.null(this_object$`yearFrom`)) {
        self$`yearFrom` <- this_object$`yearFrom`
      }
      if (!is.null(this_object$`monthFrom`)) {
        self$`monthFrom` <- this_object$`monthFrom`
      }
      if (!is.null(this_object$`yearTo`)) {
        self$`yearTo` <- this_object$`yearTo`
      }
      if (!is.null(this_object$`monthTo`)) {
        self$`monthTo` <- this_object$`monthTo`
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
    #' @return GenerateUnitedMarketplaceServicesReportRequest in JSON format
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
        if (!is.null(self$`yearFrom`)) {
          sprintf(
          '"yearFrom":
            %d
                    ',
          self$`yearFrom`
          )
        },
        if (!is.null(self$`monthFrom`)) {
          sprintf(
          '"monthFrom":
            %d
                    ',
          self$`monthFrom`
          )
        },
        if (!is.null(self$`yearTo`)) {
          sprintf(
          '"yearTo":
            %d
                    ',
          self$`yearTo`
          )
        },
        if (!is.null(self$`monthTo`)) {
          sprintf(
          '"monthTo":
            %d
                    ',
          self$`monthTo`
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
    #' Deserialize JSON string into an instance of GenerateUnitedMarketplaceServicesReportRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of GenerateUnitedMarketplaceServicesReportRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of GenerateUnitedMarketplaceServicesReportRequest
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`businessId` <- this_object$`businessId`
      self$`dateTimeFrom` <- this_object$`dateTimeFrom`
      self$`dateTimeTo` <- this_object$`dateTimeTo`
      self$`dateFrom` <- this_object$`dateFrom`
      self$`dateTo` <- this_object$`dateTo`
      self$`yearFrom` <- this_object$`yearFrom`
      self$`monthFrom` <- this_object$`monthFrom`
      self$`yearTo` <- this_object$`yearTo`
      self$`monthTo` <- this_object$`monthTo`
      self$`placementPrograms` <- ApiClient$new()$deserializeObj(this_object$`placementPrograms`, "array[PlacementType]", loadNamespace("ympa_r_client"))
      self$`inns` <- ApiClient$new()$deserializeObj(this_object$`inns`, "array[character]", loadNamespace("ympa_r_client"))
      self$`campaignIds` <- ApiClient$new()$deserializeObj(this_object$`campaignIds`, "array[integer]", loadNamespace("ympa_r_client"))
      self
    },
    #' Validate JSON input with respect to GenerateUnitedMarketplaceServicesReportRequest
    #'
    #' @description
    #' Validate JSON input with respect to GenerateUnitedMarketplaceServicesReportRequest and throw an exception if invalid
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
        stop(paste("The JSON input `", input, "` is invalid for GenerateUnitedMarketplaceServicesReportRequest: the required field `businessId` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of GenerateUnitedMarketplaceServicesReportRequest
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

      if (self$`monthFrom` > 12) {
        return(FALSE)
      }
      if (self$`monthFrom` < 1) {
        return(FALSE)
      }

      if (self$`monthTo` > 12) {
        return(FALSE)
      }
      if (self$`monthTo` < 1) {
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

      if (self$`monthFrom` > 12) {
        invalid_fields["monthFrom"] <- "Invalid value for `monthFrom`, must be smaller than or equal to 12."
      }
      if (self$`monthFrom` < 1) {
        invalid_fields["monthFrom"] <- "Invalid value for `monthFrom`, must be bigger than or equal to 1."
      }

      if (self$`monthTo` > 12) {
        invalid_fields["monthTo"] <- "Invalid value for `monthTo`, must be smaller than or equal to 12."
      }
      if (self$`monthTo` < 1) {
        invalid_fields["monthTo"] <- "Invalid value for `monthTo`, must be bigger than or equal to 1."
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
# GenerateUnitedMarketplaceServicesReportRequest$unlock()
#
## Below is an example to define the print function
# GenerateUnitedMarketplaceServicesReportRequest$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# GenerateUnitedMarketplaceServicesReportRequest$lock()

