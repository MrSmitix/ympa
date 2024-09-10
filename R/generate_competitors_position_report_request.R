#' Create a new GenerateCompetitorsPositionReportRequest
#'
#' @description
#' Данные, необходимые для генерации отчета.
#'
#' @docType class
#' @title GenerateCompetitorsPositionReportRequest
#' @description GenerateCompetitorsPositionReportRequest Class
#' @format An \code{R6Class} generator object
#' @field businessId Идентификатор бизнеса. integer
#' @field categoryId Идентификатор категории. integer
#' @field dateFrom Начало периода, включительно. character
#' @field dateTo Конец периода, включительно. character
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
GenerateCompetitorsPositionReportRequest <- R6::R6Class(
  "GenerateCompetitorsPositionReportRequest",
  public = list(
    `businessId` = NULL,
    `categoryId` = NULL,
    `dateFrom` = NULL,
    `dateTo` = NULL,
    #' Initialize a new GenerateCompetitorsPositionReportRequest class.
    #'
    #' @description
    #' Initialize a new GenerateCompetitorsPositionReportRequest class.
    #'
    #' @param businessId Идентификатор бизнеса.
    #' @param categoryId Идентификатор категории.
    #' @param dateFrom Начало периода, включительно.
    #' @param dateTo Конец периода, включительно.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`businessId`, `categoryId`, `dateFrom`, `dateTo`, ...) {
      if (!missing(`businessId`)) {
        if (!(is.numeric(`businessId`) && length(`businessId`) == 1)) {
          stop(paste("Error! Invalid data for `businessId`. Must be an integer:", `businessId`))
        }
        self$`businessId` <- `businessId`
      }
      if (!missing(`categoryId`)) {
        if (!(is.numeric(`categoryId`) && length(`categoryId`) == 1)) {
          stop(paste("Error! Invalid data for `categoryId`. Must be an integer:", `categoryId`))
        }
        self$`categoryId` <- `categoryId`
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
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return GenerateCompetitorsPositionReportRequest in JSON format
    #' @export
    toJSON = function() {
      GenerateCompetitorsPositionReportRequestObject <- list()
      if (!is.null(self$`businessId`)) {
        GenerateCompetitorsPositionReportRequestObject[["businessId"]] <-
          self$`businessId`
      }
      if (!is.null(self$`categoryId`)) {
        GenerateCompetitorsPositionReportRequestObject[["categoryId"]] <-
          self$`categoryId`
      }
      if (!is.null(self$`dateFrom`)) {
        GenerateCompetitorsPositionReportRequestObject[["dateFrom"]] <-
          self$`dateFrom`
      }
      if (!is.null(self$`dateTo`)) {
        GenerateCompetitorsPositionReportRequestObject[["dateTo"]] <-
          self$`dateTo`
      }
      GenerateCompetitorsPositionReportRequestObject
    },
    #' Deserialize JSON string into an instance of GenerateCompetitorsPositionReportRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of GenerateCompetitorsPositionReportRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of GenerateCompetitorsPositionReportRequest
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`businessId`)) {
        self$`businessId` <- this_object$`businessId`
      }
      if (!is.null(this_object$`categoryId`)) {
        self$`categoryId` <- this_object$`categoryId`
      }
      if (!is.null(this_object$`dateFrom`)) {
        self$`dateFrom` <- this_object$`dateFrom`
      }
      if (!is.null(this_object$`dateTo`)) {
        self$`dateTo` <- this_object$`dateTo`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return GenerateCompetitorsPositionReportRequest in JSON format
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
        if (!is.null(self$`categoryId`)) {
          sprintf(
          '"categoryId":
            %d
                    ',
          self$`categoryId`
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
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of GenerateCompetitorsPositionReportRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of GenerateCompetitorsPositionReportRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of GenerateCompetitorsPositionReportRequest
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`businessId` <- this_object$`businessId`
      self$`categoryId` <- this_object$`categoryId`
      self$`dateFrom` <- this_object$`dateFrom`
      self$`dateTo` <- this_object$`dateTo`
      self
    },
    #' Validate JSON input with respect to GenerateCompetitorsPositionReportRequest
    #'
    #' @description
    #' Validate JSON input with respect to GenerateCompetitorsPositionReportRequest and throw an exception if invalid
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
        stop(paste("The JSON input `", input, "` is invalid for GenerateCompetitorsPositionReportRequest: the required field `businessId` is missing."))
      }
      # check the required field `categoryId`
      if (!is.null(input_json$`categoryId`)) {
        if (!(is.numeric(input_json$`categoryId`) && length(input_json$`categoryId`) == 1)) {
          stop(paste("Error! Invalid data for `categoryId`. Must be an integer:", input_json$`categoryId`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for GenerateCompetitorsPositionReportRequest: the required field `categoryId` is missing."))
      }
      # check the required field `dateFrom`
      if (!is.null(input_json$`dateFrom`)) {
        if (!(is.character(input_json$`dateFrom`) && length(input_json$`dateFrom`) == 1)) {
          stop(paste("Error! Invalid data for `dateFrom`. Must be a string:", input_json$`dateFrom`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for GenerateCompetitorsPositionReportRequest: the required field `dateFrom` is missing."))
      }
      # check the required field `dateTo`
      if (!is.null(input_json$`dateTo`)) {
        if (!(is.character(input_json$`dateTo`) && length(input_json$`dateTo`) == 1)) {
          stop(paste("Error! Invalid data for `dateTo`. Must be a string:", input_json$`dateTo`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for GenerateCompetitorsPositionReportRequest: the required field `dateTo` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of GenerateCompetitorsPositionReportRequest
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

      # check if the required `categoryId` is null
      if (is.null(self$`categoryId`)) {
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

      # check if the required `categoryId` is null
      if (is.null(self$`categoryId`)) {
        invalid_fields["categoryId"] <- "Non-nullable required field `categoryId` cannot be null."
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
# GenerateCompetitorsPositionReportRequest$unlock()
#
## Below is an example to define the print function
# GenerateCompetitorsPositionReportRequest$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# GenerateCompetitorsPositionReportRequest$lock()

