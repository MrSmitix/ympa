#' Create a new GenerateGoodsFeedbackRequest
#'
#' @description
#' Данные, необходимые для генерации отчета. 
#'
#' @docType class
#' @title GenerateGoodsFeedbackRequest
#' @description GenerateGoodsFeedbackRequest Class
#' @format An \code{R6Class} generator object
#' @field businessId Идентификатор бизнеса. integer
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
GenerateGoodsFeedbackRequest <- R6::R6Class(
  "GenerateGoodsFeedbackRequest",
  public = list(
    `businessId` = NULL,
    #' Initialize a new GenerateGoodsFeedbackRequest class.
    #'
    #' @description
    #' Initialize a new GenerateGoodsFeedbackRequest class.
    #'
    #' @param businessId Идентификатор бизнеса.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`businessId`, ...) {
      if (!missing(`businessId`)) {
        if (!(is.numeric(`businessId`) && length(`businessId`) == 1)) {
          stop(paste("Error! Invalid data for `businessId`. Must be an integer:", `businessId`))
        }
        self$`businessId` <- `businessId`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return GenerateGoodsFeedbackRequest in JSON format
    #' @export
    toJSON = function() {
      GenerateGoodsFeedbackRequestObject <- list()
      if (!is.null(self$`businessId`)) {
        GenerateGoodsFeedbackRequestObject[["businessId"]] <-
          self$`businessId`
      }
      GenerateGoodsFeedbackRequestObject
    },
    #' Deserialize JSON string into an instance of GenerateGoodsFeedbackRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of GenerateGoodsFeedbackRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of GenerateGoodsFeedbackRequest
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`businessId`)) {
        self$`businessId` <- this_object$`businessId`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return GenerateGoodsFeedbackRequest in JSON format
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
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of GenerateGoodsFeedbackRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of GenerateGoodsFeedbackRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of GenerateGoodsFeedbackRequest
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`businessId` <- this_object$`businessId`
      self
    },
    #' Validate JSON input with respect to GenerateGoodsFeedbackRequest
    #'
    #' @description
    #' Validate JSON input with respect to GenerateGoodsFeedbackRequest and throw an exception if invalid
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
        stop(paste("The JSON input `", input, "` is invalid for GenerateGoodsFeedbackRequest: the required field `businessId` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of GenerateGoodsFeedbackRequest
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
# GenerateGoodsFeedbackRequest$unlock()
#
## Below is an example to define the print function
# GenerateGoodsFeedbackRequest$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# GenerateGoodsFeedbackRequest$lock()

