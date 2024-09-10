#' Create a new GenerateGoodsTurnoverRequest
#'
#' @description
#' Данные, необходимые для генерации отчета. 
#'
#' @docType class
#' @title GenerateGoodsTurnoverRequest
#' @description GenerateGoodsTurnoverRequest Class
#' @format An \code{R6Class} generator object
#' @field campaignId Идентификатор кампании. integer
#' @field date Дата, за которую нужно рассчитать оборачиваемость. Если параметр не указан, используется текущая дата. character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
GenerateGoodsTurnoverRequest <- R6::R6Class(
  "GenerateGoodsTurnoverRequest",
  public = list(
    `campaignId` = NULL,
    `date` = NULL,
    #' Initialize a new GenerateGoodsTurnoverRequest class.
    #'
    #' @description
    #' Initialize a new GenerateGoodsTurnoverRequest class.
    #'
    #' @param campaignId Идентификатор кампании.
    #' @param date Дата, за которую нужно рассчитать оборачиваемость. Если параметр не указан, используется текущая дата.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`campaignId`, `date` = NULL, ...) {
      if (!missing(`campaignId`)) {
        if (!(is.numeric(`campaignId`) && length(`campaignId`) == 1)) {
          stop(paste("Error! Invalid data for `campaignId`. Must be an integer:", `campaignId`))
        }
        self$`campaignId` <- `campaignId`
      }
      if (!is.null(`date`)) {
        if (!is.character(`date`)) {
          stop(paste("Error! Invalid data for `date`. Must be a string:", `date`))
        }
        self$`date` <- `date`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return GenerateGoodsTurnoverRequest in JSON format
    #' @export
    toJSON = function() {
      GenerateGoodsTurnoverRequestObject <- list()
      if (!is.null(self$`campaignId`)) {
        GenerateGoodsTurnoverRequestObject[["campaignId"]] <-
          self$`campaignId`
      }
      if (!is.null(self$`date`)) {
        GenerateGoodsTurnoverRequestObject[["date"]] <-
          self$`date`
      }
      GenerateGoodsTurnoverRequestObject
    },
    #' Deserialize JSON string into an instance of GenerateGoodsTurnoverRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of GenerateGoodsTurnoverRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of GenerateGoodsTurnoverRequest
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`campaignId`)) {
        self$`campaignId` <- this_object$`campaignId`
      }
      if (!is.null(this_object$`date`)) {
        self$`date` <- this_object$`date`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return GenerateGoodsTurnoverRequest in JSON format
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
        if (!is.null(self$`date`)) {
          sprintf(
          '"date":
            "%s"
                    ',
          self$`date`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of GenerateGoodsTurnoverRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of GenerateGoodsTurnoverRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of GenerateGoodsTurnoverRequest
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`campaignId` <- this_object$`campaignId`
      self$`date` <- this_object$`date`
      self
    },
    #' Validate JSON input with respect to GenerateGoodsTurnoverRequest
    #'
    #' @description
    #' Validate JSON input with respect to GenerateGoodsTurnoverRequest and throw an exception if invalid
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
        stop(paste("The JSON input `", input, "` is invalid for GenerateGoodsTurnoverRequest: the required field `campaignId` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of GenerateGoodsTurnoverRequest
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
# GenerateGoodsTurnoverRequest$unlock()
#
## Below is an example to define the print function
# GenerateGoodsTurnoverRequest$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# GenerateGoodsTurnoverRequest$lock()

