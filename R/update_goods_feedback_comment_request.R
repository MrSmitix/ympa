#' Create a new UpdateGoodsFeedbackCommentRequest
#'
#' @description
#' Комментарий к отзыву.
#'
#' @docType class
#' @title UpdateGoodsFeedbackCommentRequest
#' @description UpdateGoodsFeedbackCommentRequest Class
#' @format An \code{R6Class} generator object
#' @field feedbackId Идентификатор отзыва. integer
#' @field comment  \link{UpdateGoodsFeedbackCommentDTO}
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
UpdateGoodsFeedbackCommentRequest <- R6::R6Class(
  "UpdateGoodsFeedbackCommentRequest",
  public = list(
    `feedbackId` = NULL,
    `comment` = NULL,
    #' Initialize a new UpdateGoodsFeedbackCommentRequest class.
    #'
    #' @description
    #' Initialize a new UpdateGoodsFeedbackCommentRequest class.
    #'
    #' @param feedbackId Идентификатор отзыва.
    #' @param comment comment
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`feedbackId`, `comment`, ...) {
      if (!missing(`feedbackId`)) {
        if (!(is.numeric(`feedbackId`) && length(`feedbackId`) == 1)) {
          stop(paste("Error! Invalid data for `feedbackId`. Must be an integer:", `feedbackId`))
        }
        self$`feedbackId` <- `feedbackId`
      }
      if (!missing(`comment`)) {
        stopifnot(R6::is.R6(`comment`))
        self$`comment` <- `comment`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return UpdateGoodsFeedbackCommentRequest in JSON format
    #' @export
    toJSON = function() {
      UpdateGoodsFeedbackCommentRequestObject <- list()
      if (!is.null(self$`feedbackId`)) {
        UpdateGoodsFeedbackCommentRequestObject[["feedbackId"]] <-
          self$`feedbackId`
      }
      if (!is.null(self$`comment`)) {
        UpdateGoodsFeedbackCommentRequestObject[["comment"]] <-
          self$`comment`$toJSON()
      }
      UpdateGoodsFeedbackCommentRequestObject
    },
    #' Deserialize JSON string into an instance of UpdateGoodsFeedbackCommentRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of UpdateGoodsFeedbackCommentRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of UpdateGoodsFeedbackCommentRequest
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`feedbackId`)) {
        self$`feedbackId` <- this_object$`feedbackId`
      }
      if (!is.null(this_object$`comment`)) {
        `comment_object` <- UpdateGoodsFeedbackCommentDTO$new()
        `comment_object`$fromJSON(jsonlite::toJSON(this_object$`comment`, auto_unbox = TRUE, digits = NA))
        self$`comment` <- `comment_object`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return UpdateGoodsFeedbackCommentRequest in JSON format
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
        },
        if (!is.null(self$`comment`)) {
          sprintf(
          '"comment":
          %s
          ',
          jsonlite::toJSON(self$`comment`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of UpdateGoodsFeedbackCommentRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of UpdateGoodsFeedbackCommentRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of UpdateGoodsFeedbackCommentRequest
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`feedbackId` <- this_object$`feedbackId`
      self$`comment` <- UpdateGoodsFeedbackCommentDTO$new()$fromJSON(jsonlite::toJSON(this_object$`comment`, auto_unbox = TRUE, digits = NA))
      self
    },
    #' Validate JSON input with respect to UpdateGoodsFeedbackCommentRequest
    #'
    #' @description
    #' Validate JSON input with respect to UpdateGoodsFeedbackCommentRequest and throw an exception if invalid
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
        stop(paste("The JSON input `", input, "` is invalid for UpdateGoodsFeedbackCommentRequest: the required field `feedbackId` is missing."))
      }
      # check the required field `comment`
      if (!is.null(input_json$`comment`)) {
        stopifnot(R6::is.R6(input_json$`comment`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for UpdateGoodsFeedbackCommentRequest: the required field `comment` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of UpdateGoodsFeedbackCommentRequest
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

      # check if the required `comment` is null
      if (is.null(self$`comment`)) {
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

      # check if the required `comment` is null
      if (is.null(self$`comment`)) {
        invalid_fields["comment"] <- "Non-nullable required field `comment` cannot be null."
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
# UpdateGoodsFeedbackCommentRequest$unlock()
#
## Below is an example to define the print function
# UpdateGoodsFeedbackCommentRequest$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# UpdateGoodsFeedbackCommentRequest$lock()

