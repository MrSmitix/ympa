#' Create a new GenerateGoodsRealizationReportRequest
#'
#' @description
#' Данные, необходимые для генерации отчета: идентификатор магазина и период, за который нужен отчет. 
#'
#' @docType class
#' @title GenerateGoodsRealizationReportRequest
#' @description GenerateGoodsRealizationReportRequest Class
#' @format An \code{R6Class} generator object
#' @field campaignId Идентификатор кампании. integer
#' @field year Год. integer
#' @field month Номер месяца. integer
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
GenerateGoodsRealizationReportRequest <- R6::R6Class(
  "GenerateGoodsRealizationReportRequest",
  public = list(
    `campaignId` = NULL,
    `year` = NULL,
    `month` = NULL,
    #' Initialize a new GenerateGoodsRealizationReportRequest class.
    #'
    #' @description
    #' Initialize a new GenerateGoodsRealizationReportRequest class.
    #'
    #' @param campaignId Идентификатор кампании.
    #' @param year Год.
    #' @param month Номер месяца.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`campaignId`, `year`, `month`, ...) {
      if (!missing(`campaignId`)) {
        if (!(is.numeric(`campaignId`) && length(`campaignId`) == 1)) {
          stop(paste("Error! Invalid data for `campaignId`. Must be an integer:", `campaignId`))
        }
        self$`campaignId` <- `campaignId`
      }
      if (!missing(`year`)) {
        if (!(is.numeric(`year`) && length(`year`) == 1)) {
          stop(paste("Error! Invalid data for `year`. Must be an integer:", `year`))
        }
        self$`year` <- `year`
      }
      if (!missing(`month`)) {
        if (!(is.numeric(`month`) && length(`month`) == 1)) {
          stop(paste("Error! Invalid data for `month`. Must be an integer:", `month`))
        }
        self$`month` <- `month`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return GenerateGoodsRealizationReportRequest in JSON format
    #' @export
    toJSON = function() {
      GenerateGoodsRealizationReportRequestObject <- list()
      if (!is.null(self$`campaignId`)) {
        GenerateGoodsRealizationReportRequestObject[["campaignId"]] <-
          self$`campaignId`
      }
      if (!is.null(self$`year`)) {
        GenerateGoodsRealizationReportRequestObject[["year"]] <-
          self$`year`
      }
      if (!is.null(self$`month`)) {
        GenerateGoodsRealizationReportRequestObject[["month"]] <-
          self$`month`
      }
      GenerateGoodsRealizationReportRequestObject
    },
    #' Deserialize JSON string into an instance of GenerateGoodsRealizationReportRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of GenerateGoodsRealizationReportRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of GenerateGoodsRealizationReportRequest
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`campaignId`)) {
        self$`campaignId` <- this_object$`campaignId`
      }
      if (!is.null(this_object$`year`)) {
        self$`year` <- this_object$`year`
      }
      if (!is.null(this_object$`month`)) {
        self$`month` <- this_object$`month`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return GenerateGoodsRealizationReportRequest in JSON format
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
        if (!is.null(self$`year`)) {
          sprintf(
          '"year":
            %d
                    ',
          self$`year`
          )
        },
        if (!is.null(self$`month`)) {
          sprintf(
          '"month":
            %d
                    ',
          self$`month`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of GenerateGoodsRealizationReportRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of GenerateGoodsRealizationReportRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of GenerateGoodsRealizationReportRequest
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`campaignId` <- this_object$`campaignId`
      self$`year` <- this_object$`year`
      self$`month` <- this_object$`month`
      self
    },
    #' Validate JSON input with respect to GenerateGoodsRealizationReportRequest
    #'
    #' @description
    #' Validate JSON input with respect to GenerateGoodsRealizationReportRequest and throw an exception if invalid
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
        stop(paste("The JSON input `", input, "` is invalid for GenerateGoodsRealizationReportRequest: the required field `campaignId` is missing."))
      }
      # check the required field `year`
      if (!is.null(input_json$`year`)) {
        if (!(is.numeric(input_json$`year`) && length(input_json$`year`) == 1)) {
          stop(paste("Error! Invalid data for `year`. Must be an integer:", input_json$`year`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for GenerateGoodsRealizationReportRequest: the required field `year` is missing."))
      }
      # check the required field `month`
      if (!is.null(input_json$`month`)) {
        if (!(is.numeric(input_json$`month`) && length(input_json$`month`) == 1)) {
          stop(paste("Error! Invalid data for `month`. Must be an integer:", input_json$`month`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for GenerateGoodsRealizationReportRequest: the required field `month` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of GenerateGoodsRealizationReportRequest
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

      # check if the required `year` is null
      if (is.null(self$`year`)) {
        return(FALSE)
      }

      # check if the required `month` is null
      if (is.null(self$`month`)) {
        return(FALSE)
      }

      if (self$`month` > 12) {
        return(FALSE)
      }
      if (self$`month` < 1) {
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

      # check if the required `year` is null
      if (is.null(self$`year`)) {
        invalid_fields["year"] <- "Non-nullable required field `year` cannot be null."
      }

      # check if the required `month` is null
      if (is.null(self$`month`)) {
        invalid_fields["month"] <- "Non-nullable required field `month` cannot be null."
      }

      if (self$`month` > 12) {
        invalid_fields["month"] <- "Invalid value for `month`, must be smaller than or equal to 12."
      }
      if (self$`month` < 1) {
        invalid_fields["month"] <- "Invalid value for `month`, must be bigger than or equal to 1."
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
# GenerateGoodsRealizationReportRequest$unlock()
#
## Below is an example to define the print function
# GenerateGoodsRealizationReportRequest$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# GenerateGoodsRealizationReportRequest$lock()

