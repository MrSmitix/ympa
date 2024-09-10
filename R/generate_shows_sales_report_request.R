#' Create a new GenerateShowsSalesReportRequest
#'
#' @description
#' Данные, необходимые для генерации отчета.
#'
#' @docType class
#' @title GenerateShowsSalesReportRequest
#' @description GenerateShowsSalesReportRequest Class
#' @format An \code{R6Class} generator object
#' @field businessId Идентификатор бизнеса.  Указывается, если нужно составить отчет по всем магазинам бизнеса. В запросе обязательно должен быть либо `businessID`, либо `campaignId`, но не оба сразу. integer [optional]
#' @field campaignId Идентификатор кампании.  Указывается, если нужно составить отчет по конкретному магазину. В запросе обязательно должен быть либо `businessID`, либо `campaignId`, но не оба сразу. integer [optional]
#' @field dateFrom Начало периода, включительно. character
#' @field dateTo Конец периода, включительно. character
#' @field grouping  \link{ShowsSalesGroupingType}
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
GenerateShowsSalesReportRequest <- R6::R6Class(
  "GenerateShowsSalesReportRequest",
  public = list(
    `businessId` = NULL,
    `campaignId` = NULL,
    `dateFrom` = NULL,
    `dateTo` = NULL,
    `grouping` = NULL,
    #' Initialize a new GenerateShowsSalesReportRequest class.
    #'
    #' @description
    #' Initialize a new GenerateShowsSalesReportRequest class.
    #'
    #' @param dateFrom Начало периода, включительно.
    #' @param dateTo Конец периода, включительно.
    #' @param grouping grouping
    #' @param businessId Идентификатор бизнеса.  Указывается, если нужно составить отчет по всем магазинам бизнеса. В запросе обязательно должен быть либо `businessID`, либо `campaignId`, но не оба сразу.
    #' @param campaignId Идентификатор кампании.  Указывается, если нужно составить отчет по конкретному магазину. В запросе обязательно должен быть либо `businessID`, либо `campaignId`, но не оба сразу.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`dateFrom`, `dateTo`, `grouping`, `businessId` = NULL, `campaignId` = NULL, ...) {
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
      if (!missing(`grouping`)) {
        if (!(`grouping` %in% c())) {
          stop(paste("Error! \"", `grouping`, "\" cannot be assigned to `grouping`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`grouping`))
        self$`grouping` <- `grouping`
      }
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
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return GenerateShowsSalesReportRequest in JSON format
    #' @export
    toJSON = function() {
      GenerateShowsSalesReportRequestObject <- list()
      if (!is.null(self$`businessId`)) {
        GenerateShowsSalesReportRequestObject[["businessId"]] <-
          self$`businessId`
      }
      if (!is.null(self$`campaignId`)) {
        GenerateShowsSalesReportRequestObject[["campaignId"]] <-
          self$`campaignId`
      }
      if (!is.null(self$`dateFrom`)) {
        GenerateShowsSalesReportRequestObject[["dateFrom"]] <-
          self$`dateFrom`
      }
      if (!is.null(self$`dateTo`)) {
        GenerateShowsSalesReportRequestObject[["dateTo"]] <-
          self$`dateTo`
      }
      if (!is.null(self$`grouping`)) {
        GenerateShowsSalesReportRequestObject[["grouping"]] <-
          self$`grouping`$toJSON()
      }
      GenerateShowsSalesReportRequestObject
    },
    #' Deserialize JSON string into an instance of GenerateShowsSalesReportRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of GenerateShowsSalesReportRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of GenerateShowsSalesReportRequest
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`businessId`)) {
        self$`businessId` <- this_object$`businessId`
      }
      if (!is.null(this_object$`campaignId`)) {
        self$`campaignId` <- this_object$`campaignId`
      }
      if (!is.null(this_object$`dateFrom`)) {
        self$`dateFrom` <- this_object$`dateFrom`
      }
      if (!is.null(this_object$`dateTo`)) {
        self$`dateTo` <- this_object$`dateTo`
      }
      if (!is.null(this_object$`grouping`)) {
        `grouping_object` <- ShowsSalesGroupingType$new()
        `grouping_object`$fromJSON(jsonlite::toJSON(this_object$`grouping`, auto_unbox = TRUE, digits = NA))
        self$`grouping` <- `grouping_object`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return GenerateShowsSalesReportRequest in JSON format
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
        if (!is.null(self$`grouping`)) {
          sprintf(
          '"grouping":
          %s
          ',
          jsonlite::toJSON(self$`grouping`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of GenerateShowsSalesReportRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of GenerateShowsSalesReportRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of GenerateShowsSalesReportRequest
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`businessId` <- this_object$`businessId`
      self$`campaignId` <- this_object$`campaignId`
      self$`dateFrom` <- this_object$`dateFrom`
      self$`dateTo` <- this_object$`dateTo`
      self$`grouping` <- ShowsSalesGroupingType$new()$fromJSON(jsonlite::toJSON(this_object$`grouping`, auto_unbox = TRUE, digits = NA))
      self
    },
    #' Validate JSON input with respect to GenerateShowsSalesReportRequest
    #'
    #' @description
    #' Validate JSON input with respect to GenerateShowsSalesReportRequest and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `dateFrom`
      if (!is.null(input_json$`dateFrom`)) {
        if (!(is.character(input_json$`dateFrom`) && length(input_json$`dateFrom`) == 1)) {
          stop(paste("Error! Invalid data for `dateFrom`. Must be a string:", input_json$`dateFrom`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for GenerateShowsSalesReportRequest: the required field `dateFrom` is missing."))
      }
      # check the required field `dateTo`
      if (!is.null(input_json$`dateTo`)) {
        if (!(is.character(input_json$`dateTo`) && length(input_json$`dateTo`) == 1)) {
          stop(paste("Error! Invalid data for `dateTo`. Must be a string:", input_json$`dateTo`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for GenerateShowsSalesReportRequest: the required field `dateTo` is missing."))
      }
      # check the required field `grouping`
      if (!is.null(input_json$`grouping`)) {
        stopifnot(R6::is.R6(input_json$`grouping`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for GenerateShowsSalesReportRequest: the required field `grouping` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of GenerateShowsSalesReportRequest
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
      # check if the required `dateFrom` is null
      if (is.null(self$`dateFrom`)) {
        return(FALSE)
      }

      # check if the required `dateTo` is null
      if (is.null(self$`dateTo`)) {
        return(FALSE)
      }

      # check if the required `grouping` is null
      if (is.null(self$`grouping`)) {
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
      # check if the required `dateFrom` is null
      if (is.null(self$`dateFrom`)) {
        invalid_fields["dateFrom"] <- "Non-nullable required field `dateFrom` cannot be null."
      }

      # check if the required `dateTo` is null
      if (is.null(self$`dateTo`)) {
        invalid_fields["dateTo"] <- "Non-nullable required field `dateTo` cannot be null."
      }

      # check if the required `grouping` is null
      if (is.null(self$`grouping`)) {
        invalid_fields["grouping"] <- "Non-nullable required field `grouping` cannot be null."
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
# GenerateShowsSalesReportRequest$unlock()
#
## Below is an example to define the print function
# GenerateShowsSalesReportRequest$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# GenerateShowsSalesReportRequest$lock()

