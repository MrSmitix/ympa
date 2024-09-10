#' Create a new GenerateShelfsStatisticsRequest
#'
#' @description
#' Данные, необходимые для генерации отчета. 
#'
#' @docType class
#' @title GenerateShelfsStatisticsRequest
#' @description GenerateShelfsStatisticsRequest Class
#' @format An \code{R6Class} generator object
#' @field businessId Идентификатор бизнеса. integer
#' @field dateFrom Начало периода, включительно. character
#' @field dateTo Конец периода, включительно. character
#' @field attributionType  \link{ShelfsStatisticsAttributionType}
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
GenerateShelfsStatisticsRequest <- R6::R6Class(
  "GenerateShelfsStatisticsRequest",
  public = list(
    `businessId` = NULL,
    `dateFrom` = NULL,
    `dateTo` = NULL,
    `attributionType` = NULL,
    #' Initialize a new GenerateShelfsStatisticsRequest class.
    #'
    #' @description
    #' Initialize a new GenerateShelfsStatisticsRequest class.
    #'
    #' @param businessId Идентификатор бизнеса.
    #' @param dateFrom Начало периода, включительно.
    #' @param dateTo Конец периода, включительно.
    #' @param attributionType attributionType
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`businessId`, `dateFrom`, `dateTo`, `attributionType`, ...) {
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
      if (!missing(`attributionType`)) {
        if (!(`attributionType` %in% c())) {
          stop(paste("Error! \"", `attributionType`, "\" cannot be assigned to `attributionType`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`attributionType`))
        self$`attributionType` <- `attributionType`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return GenerateShelfsStatisticsRequest in JSON format
    #' @export
    toJSON = function() {
      GenerateShelfsStatisticsRequestObject <- list()
      if (!is.null(self$`businessId`)) {
        GenerateShelfsStatisticsRequestObject[["businessId"]] <-
          self$`businessId`
      }
      if (!is.null(self$`dateFrom`)) {
        GenerateShelfsStatisticsRequestObject[["dateFrom"]] <-
          self$`dateFrom`
      }
      if (!is.null(self$`dateTo`)) {
        GenerateShelfsStatisticsRequestObject[["dateTo"]] <-
          self$`dateTo`
      }
      if (!is.null(self$`attributionType`)) {
        GenerateShelfsStatisticsRequestObject[["attributionType"]] <-
          self$`attributionType`$toJSON()
      }
      GenerateShelfsStatisticsRequestObject
    },
    #' Deserialize JSON string into an instance of GenerateShelfsStatisticsRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of GenerateShelfsStatisticsRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of GenerateShelfsStatisticsRequest
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
      if (!is.null(this_object$`attributionType`)) {
        `attributiontype_object` <- ShelfsStatisticsAttributionType$new()
        `attributiontype_object`$fromJSON(jsonlite::toJSON(this_object$`attributionType`, auto_unbox = TRUE, digits = NA))
        self$`attributionType` <- `attributiontype_object`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return GenerateShelfsStatisticsRequest in JSON format
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
        if (!is.null(self$`attributionType`)) {
          sprintf(
          '"attributionType":
          %s
          ',
          jsonlite::toJSON(self$`attributionType`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of GenerateShelfsStatisticsRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of GenerateShelfsStatisticsRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of GenerateShelfsStatisticsRequest
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`businessId` <- this_object$`businessId`
      self$`dateFrom` <- this_object$`dateFrom`
      self$`dateTo` <- this_object$`dateTo`
      self$`attributionType` <- ShelfsStatisticsAttributionType$new()$fromJSON(jsonlite::toJSON(this_object$`attributionType`, auto_unbox = TRUE, digits = NA))
      self
    },
    #' Validate JSON input with respect to GenerateShelfsStatisticsRequest
    #'
    #' @description
    #' Validate JSON input with respect to GenerateShelfsStatisticsRequest and throw an exception if invalid
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
        stop(paste("The JSON input `", input, "` is invalid for GenerateShelfsStatisticsRequest: the required field `businessId` is missing."))
      }
      # check the required field `dateFrom`
      if (!is.null(input_json$`dateFrom`)) {
        if (!(is.character(input_json$`dateFrom`) && length(input_json$`dateFrom`) == 1)) {
          stop(paste("Error! Invalid data for `dateFrom`. Must be a string:", input_json$`dateFrom`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for GenerateShelfsStatisticsRequest: the required field `dateFrom` is missing."))
      }
      # check the required field `dateTo`
      if (!is.null(input_json$`dateTo`)) {
        if (!(is.character(input_json$`dateTo`) && length(input_json$`dateTo`) == 1)) {
          stop(paste("Error! Invalid data for `dateTo`. Must be a string:", input_json$`dateTo`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for GenerateShelfsStatisticsRequest: the required field `dateTo` is missing."))
      }
      # check the required field `attributionType`
      if (!is.null(input_json$`attributionType`)) {
        stopifnot(R6::is.R6(input_json$`attributionType`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for GenerateShelfsStatisticsRequest: the required field `attributionType` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of GenerateShelfsStatisticsRequest
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

      # check if the required `attributionType` is null
      if (is.null(self$`attributionType`)) {
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

      # check if the required `attributionType` is null
      if (is.null(self$`attributionType`)) {
        invalid_fields["attributionType"] <- "Non-nullable required field `attributionType` cannot be null."
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
# GenerateShelfsStatisticsRequest$unlock()
#
## Below is an example to define the print function
# GenerateShelfsStatisticsRequest$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# GenerateShelfsStatisticsRequest$lock()

