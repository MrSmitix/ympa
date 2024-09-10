#' Create a new GetGoodsFeedbackCommentsRequest
#'
#' @description
#' Фильтр запроса комментариев отзыва. 
#'
#' @docType class
#' @title GetGoodsFeedbackCommentsRequest
#' @description GetGoodsFeedbackCommentsRequest Class
#' @format An \code{R6Class} generator object
#' @field feedbackId Идентификатор отзыва. integer
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
GetGoodsFeedbackCommentsRequest <- R6::R6Class(
  "GetGoodsFeedbackCommentsRequest",
  public = list(
    `feedbackId` = NULL,
    #' Initialize a new GetGoodsFeedbackCommentsRequest class.
    #'
    #' @description
    #' Initialize a new GetGoodsFeedbackCommentsRequest class.
    #'
    #' @param feedbackId Идентификатор отзыва.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`feedbackId`, ...) {
      if (!missing(`feedbackId`)) {
        if (!(is.numeric(`feedbackId`) && length(`feedbackId`) == 1)) {
          stop(paste("Error! Invalid data for `feedbackId`. Must be an integer:", `feedbackId`))
        }
        self$`feedbackId` <- `feedbackId`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return GetGoodsFeedbackCommentsRequest in JSON format
    #' @export
    toJSON = function() {
      GetGoodsFeedbackCommentsRequestObject <- list()
      if (!is.null(self$`feedbackId`)) {
        GetGoodsFeedbackCommentsRequestObject[["feedbackId"]] <-
          self$`feedbackId`
      }
      GetGoodsFeedbackCommentsRequestObject
    },
    #' Deserialize JSON string into an instance of GetGoodsFeedbackCommentsRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of GetGoodsFeedbackCommentsRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of GetGoodsFeedbackCommentsRequest
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`feedbackId`)) {
        self$`feedbackId` <- this_object$`feedbackId`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return GetGoodsFeedbackCommentsRequest in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`feedbackId`)) {
          sprintf(
          '"feedbackId":
            %d
                    ',
          self$`feedbackId`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of GetGoodsFeedbackCommentsRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of GetGoodsFeedbackCommentsRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of GetGoodsFeedbackCommentsRequest
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`feedbackId` <- this_object$`feedbackId`
      self
    },
    #' Validate JSON input with respect to GetGoodsFeedbackCommentsRequest
    #'
    #' @description
    #' Validate JSON input with respect to GetGoodsFeedbackCommentsRequest and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `feedbackId`
      if (!is.null(input_json$`feedbackId`)) {
        if (!(is.numeric(input_json$`feedbackId`) && length(input_json$`feedbackId`) == 1)) {
          stop(paste("Error! Invalid data for `feedbackId`. Must be an integer:", input_json$`feedbackId`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for GetGoodsFeedbackCommentsRequest: the required field `feedbackId` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of GetGoodsFeedbackCommentsRequest
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
      # check if the required `feedbackId` is null
      if (is.null(self$`feedbackId`)) {
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
      # check if the required `feedbackId` is null
      if (is.null(self$`feedbackId`)) {
        invalid_fields["feedbackId"] <- "Non-nullable required field `feedbackId` cannot be null."
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
# GetGoodsFeedbackCommentsRequest$unlock()
#
## Below is an example to define the print function
# GetGoodsFeedbackCommentsRequest$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# GetGoodsFeedbackCommentsRequest$lock()

