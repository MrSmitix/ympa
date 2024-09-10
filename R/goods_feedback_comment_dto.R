#' Create a new GoodsFeedbackCommentDTO
#'
#' @description
#' Комментарий к отзыву.
#'
#' @docType class
#' @title GoodsFeedbackCommentDTO
#' @description GoodsFeedbackCommentDTO Class
#' @format An \code{R6Class} generator object
#' @field id Идентификатор комментария к отзыву. integer
#' @field text Текст комментария. character
#' @field canModify Может ли продавец изменять комментарий или удалять его. character [optional]
#' @field parentId Идентификатор комментария к отзыву. integer [optional]
#' @field author  \link{GoodsFeedbackCommentAuthorDTO}
#' @field status  \link{GoodsFeedbackCommentStatusType}
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
GoodsFeedbackCommentDTO <- R6::R6Class(
  "GoodsFeedbackCommentDTO",
  public = list(
    `id` = NULL,
    `text` = NULL,
    `canModify` = NULL,
    `parentId` = NULL,
    `author` = NULL,
    `status` = NULL,
    #' Initialize a new GoodsFeedbackCommentDTO class.
    #'
    #' @description
    #' Initialize a new GoodsFeedbackCommentDTO class.
    #'
    #' @param id Идентификатор комментария к отзыву.
    #' @param text Текст комментария.
    #' @param author author
    #' @param status status
    #' @param canModify Может ли продавец изменять комментарий или удалять его.
    #' @param parentId Идентификатор комментария к отзыву.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`id`, `text`, `author`, `status`, `canModify` = NULL, `parentId` = NULL, ...) {
      if (!missing(`id`)) {
        if (!(is.numeric(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be an integer:", `id`))
        }
        self$`id` <- `id`
      }
      if (!missing(`text`)) {
        if (!(is.character(`text`) && length(`text`) == 1)) {
          stop(paste("Error! Invalid data for `text`. Must be a string:", `text`))
        }
        self$`text` <- `text`
      }
      if (!missing(`author`)) {
        stopifnot(R6::is.R6(`author`))
        self$`author` <- `author`
      }
      if (!missing(`status`)) {
        if (!(`status` %in% c())) {
          stop(paste("Error! \"", `status`, "\" cannot be assigned to `status`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`status`))
        self$`status` <- `status`
      }
      if (!is.null(`canModify`)) {
        if (!(is.logical(`canModify`) && length(`canModify`) == 1)) {
          stop(paste("Error! Invalid data for `canModify`. Must be a boolean:", `canModify`))
        }
        self$`canModify` <- `canModify`
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
    #' @return GoodsFeedbackCommentDTO in JSON format
    #' @export
    toJSON = function() {
      GoodsFeedbackCommentDTOObject <- list()
      if (!is.null(self$`id`)) {
        GoodsFeedbackCommentDTOObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`text`)) {
        GoodsFeedbackCommentDTOObject[["text"]] <-
          self$`text`
      }
      if (!is.null(self$`canModify`)) {
        GoodsFeedbackCommentDTOObject[["canModify"]] <-
          self$`canModify`
      }
      if (!is.null(self$`parentId`)) {
        GoodsFeedbackCommentDTOObject[["parentId"]] <-
          self$`parentId`
      }
      if (!is.null(self$`author`)) {
        GoodsFeedbackCommentDTOObject[["author"]] <-
          self$`author`$toJSON()
      }
      if (!is.null(self$`status`)) {
        GoodsFeedbackCommentDTOObject[["status"]] <-
          self$`status`$toJSON()
      }
      GoodsFeedbackCommentDTOObject
    },
    #' Deserialize JSON string into an instance of GoodsFeedbackCommentDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of GoodsFeedbackCommentDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of GoodsFeedbackCommentDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`text`)) {
        self$`text` <- this_object$`text`
      }
      if (!is.null(this_object$`canModify`)) {
        self$`canModify` <- this_object$`canModify`
      }
      if (!is.null(this_object$`parentId`)) {
        self$`parentId` <- this_object$`parentId`
      }
      if (!is.null(this_object$`author`)) {
        `author_object` <- GoodsFeedbackCommentAuthorDTO$new()
        `author_object`$fromJSON(jsonlite::toJSON(this_object$`author`, auto_unbox = TRUE, digits = NA))
        self$`author` <- `author_object`
      }
      if (!is.null(this_object$`status`)) {
        `status_object` <- GoodsFeedbackCommentStatusType$new()
        `status_object`$fromJSON(jsonlite::toJSON(this_object$`status`, auto_unbox = TRUE, digits = NA))
        self$`status` <- `status_object`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return GoodsFeedbackCommentDTO in JSON format
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
        if (!is.null(self$`text`)) {
          sprintf(
          '"text":
            "%s"
                    ',
          self$`text`
          )
        },
        if (!is.null(self$`canModify`)) {
          sprintf(
          '"canModify":
            %s
                    ',
          tolower(self$`canModify`)
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
        if (!is.null(self$`author`)) {
          sprintf(
          '"author":
          %s
          ',
          jsonlite::toJSON(self$`author`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`status`)) {
          sprintf(
          '"status":
          %s
          ',
          jsonlite::toJSON(self$`status`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of GoodsFeedbackCommentDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of GoodsFeedbackCommentDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of GoodsFeedbackCommentDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`id` <- this_object$`id`
      self$`text` <- this_object$`text`
      self$`canModify` <- this_object$`canModify`
      self$`parentId` <- this_object$`parentId`
      self$`author` <- GoodsFeedbackCommentAuthorDTO$new()$fromJSON(jsonlite::toJSON(this_object$`author`, auto_unbox = TRUE, digits = NA))
      self$`status` <- GoodsFeedbackCommentStatusType$new()$fromJSON(jsonlite::toJSON(this_object$`status`, auto_unbox = TRUE, digits = NA))
      self
    },
    #' Validate JSON input with respect to GoodsFeedbackCommentDTO
    #'
    #' @description
    #' Validate JSON input with respect to GoodsFeedbackCommentDTO and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `id`
      if (!is.null(input_json$`id`)) {
        if (!(is.numeric(input_json$`id`) && length(input_json$`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be an integer:", input_json$`id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for GoodsFeedbackCommentDTO: the required field `id` is missing."))
      }
      # check the required field `text`
      if (!is.null(input_json$`text`)) {
        if (!(is.character(input_json$`text`) && length(input_json$`text`) == 1)) {
          stop(paste("Error! Invalid data for `text`. Must be a string:", input_json$`text`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for GoodsFeedbackCommentDTO: the required field `text` is missing."))
      }
      # check the required field `author`
      if (!is.null(input_json$`author`)) {
        stopifnot(R6::is.R6(input_json$`author`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for GoodsFeedbackCommentDTO: the required field `author` is missing."))
      }
      # check the required field `status`
      if (!is.null(input_json$`status`)) {
        stopifnot(R6::is.R6(input_json$`status`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for GoodsFeedbackCommentDTO: the required field `status` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of GoodsFeedbackCommentDTO
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
      # check if the required `id` is null
      if (is.null(self$`id`)) {
        return(FALSE)
      }

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

      # check if the required `author` is null
      if (is.null(self$`author`)) {
        return(FALSE)
      }

      # check if the required `status` is null
      if (is.null(self$`status`)) {
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
      # check if the required `id` is null
      if (is.null(self$`id`)) {
        invalid_fields["id"] <- "Non-nullable required field `id` cannot be null."
      }

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

      # check if the required `author` is null
      if (is.null(self$`author`)) {
        invalid_fields["author"] <- "Non-nullable required field `author` cannot be null."
      }

      # check if the required `status` is null
      if (is.null(self$`status`)) {
        invalid_fields["status"] <- "Non-nullable required field `status` cannot be null."
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
# GoodsFeedbackCommentDTO$unlock()
#
## Below is an example to define the print function
# GoodsFeedbackCommentDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# GoodsFeedbackCommentDTO$lock()

