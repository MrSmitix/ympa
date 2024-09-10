#' Create a new UpdateGoodsFeedbackCommentDTO
#'
#' @description
#' Комментарий к отзыву или другому комментарию.
#'
#' @docType class
#' @title UpdateGoodsFeedbackCommentDTO
#' @description UpdateGoodsFeedbackCommentDTO Class
#' @format An \code{R6Class} generator object
#' @field id Идентификатор комментария к отзыву. integer [optional]
#' @field parentId Идентификатор комментария к отзыву. integer [optional]
#' @field text Текст комментария. character
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
UpdateGoodsFeedbackCommentDTO <- R6::R6Class(
  "UpdateGoodsFeedbackCommentDTO",
  public = list(
    `id` = NULL,
    `parentId` = NULL,
    `text` = NULL,
    #' Initialize a new UpdateGoodsFeedbackCommentDTO class.
    #'
    #' @description
    #' Initialize a new UpdateGoodsFeedbackCommentDTO class.
    #'
    #' @param text Текст комментария.
    #' @param id Идентификатор комментария к отзыву.
    #' @param parentId Идентификатор комментария к отзыву.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`text`, `id` = NULL, `parentId` = NULL, ...) {
      if (!missing(`text`)) {
        if (!(is.character(`text`) && length(`text`) == 1)) {
          stop(paste("Error! Invalid data for `text`. Must be a string:", `text`))
        }
        self$`text` <- `text`
      }
      if (!is.null(`id`)) {
        if (!(is.numeric(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be an integer:", `id`))
        }
        self$`id` <- `id`
      }
      if (!is.null(`parentId`)) {
        if (!(is.numeric(`parentId`) && length(`parentId`) == 1)) {
          stop(paste("Error! Invalid data for `parentId`. Must be an integer:", `parentId`))
        }
        self$`parentId` <- `parentId`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return UpdateGoodsFeedbackCommentDTO in JSON format
    #' @export
    toJSON = function() {
      UpdateGoodsFeedbackCommentDTOObject <- list()
      if (!is.null(self$`id`)) {
        UpdateGoodsFeedbackCommentDTOObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`parentId`)) {
        UpdateGoodsFeedbackCommentDTOObject[["parentId"]] <-
          self$`parentId`
      }
      if (!is.null(self$`text`)) {
        UpdateGoodsFeedbackCommentDTOObject[["text"]] <-
          self$`text`
      }
      UpdateGoodsFeedbackCommentDTOObject
    },
    #' Deserialize JSON string into an instance of UpdateGoodsFeedbackCommentDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of UpdateGoodsFeedbackCommentDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of UpdateGoodsFeedbackCommentDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`parentId`)) {
        self$`parentId` <- this_object$`parentId`
      }
      if (!is.null(this_object$`text`)) {
        self$`text` <- this_object$`text`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return UpdateGoodsFeedbackCommentDTO in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`id`)) {
          sprintf(
          '"id":
            %d
                    ',
          self$`id`
          )
        },
        if (!is.null(self$`parentId`)) {
          sprintf(
          '"parentId":
            %d
                    ',
          self$`parentId`
          )
        },
        if (!is.null(self$`text`)) {
          sprintf(
          '"text":
            "%s"
                    ',
          self$`text`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of UpdateGoodsFeedbackCommentDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of UpdateGoodsFeedbackCommentDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of UpdateGoodsFeedbackCommentDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`id` <- this_object$`id`
      self$`parentId` <- this_object$`parentId`
      self$`text` <- this_object$`text`
      self
    },
    #' Validate JSON input with respect to UpdateGoodsFeedbackCommentDTO
    #'
    #' @description
    #' Validate JSON input with respect to UpdateGoodsFeedbackCommentDTO and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `text`
      if (!is.null(input_json$`text`)) {
        if (!(is.character(input_json$`text`) && length(input_json$`text`) == 1)) {
          stop(paste("Error! Invalid data for `text`. Must be a string:", input_json$`text`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for UpdateGoodsFeedbackCommentDTO: the required field `text` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of UpdateGoodsFeedbackCommentDTO
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
      # check if the required `text` is null
      if (is.null(self$`text`)) {
        return(FALSE)
      }

      if (nchar(self$`text`) > 4096) {
        return(FALSE)
      }
      if (nchar(self$`text`) < 1) {
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
      # check if the required `text` is null
      if (is.null(self$`text`)) {
        invalid_fields["text"] <- "Non-nullable required field `text` cannot be null."
      }

      if (nchar(self$`text`) > 4096) {
        invalid_fields["text"] <- "Invalid length for `text`, must be smaller than or equal to 4096."
      }
      if (nchar(self$`text`) < 1) {
        invalid_fields["text"] <- "Invalid length for `text`, must be bigger than or equal to 1."
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
# UpdateGoodsFeedbackCommentDTO$unlock()
#
## Below is an example to define the print function
# UpdateGoodsFeedbackCommentDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# UpdateGoodsFeedbackCommentDTO$lock()

