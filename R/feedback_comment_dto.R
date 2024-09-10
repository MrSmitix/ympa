#' Create a new FeedbackCommentDTO
#'
#' @description
#' Комментарий к отзыву на магазин.
#'
#' @docType class
#' @title FeedbackCommentDTO
#' @description FeedbackCommentDTO Class
#' @format An \code{R6Class} generator object
#' @field id Идентификатор ответа. integer [optional]
#' @field parentId Идентификатор родительского ответа. integer [optional]
#' @field body Текст ответа. character [optional]
#' @field createdAt Дата и время создания ответа.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:00:00+03:00`. character [optional]
#' @field updatedAt Дата и время изменения ответа.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:00:00+03:00`. character [optional]
#' @field author  \link{FeedbackCommentAuthorDTO} [optional]
#' @field children Дочерние ответы. list(\link{FeedbackCommentDTO}) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
FeedbackCommentDTO <- R6::R6Class(
  "FeedbackCommentDTO",
  public = list(
    `id` = NULL,
    `parentId` = NULL,
    `body` = NULL,
    `createdAt` = NULL,
    `updatedAt` = NULL,
    `author` = NULL,
    `children` = NULL,
    #' Initialize a new FeedbackCommentDTO class.
    #'
    #' @description
    #' Initialize a new FeedbackCommentDTO class.
    #'
    #' @param id Идентификатор ответа.
    #' @param parentId Идентификатор родительского ответа.
    #' @param body Текст ответа.
    #' @param createdAt Дата и время создания ответа.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:00:00+03:00`.
    #' @param updatedAt Дата и время изменения ответа.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:00:00+03:00`.
    #' @param author author
    #' @param children Дочерние ответы.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`id` = NULL, `parentId` = NULL, `body` = NULL, `createdAt` = NULL, `updatedAt` = NULL, `author` = NULL, `children` = NULL, ...) {
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
      if (!is.null(`body`)) {
        if (!(is.character(`body`) && length(`body`) == 1)) {
          stop(paste("Error! Invalid data for `body`. Must be a string:", `body`))
        }
        self$`body` <- `body`
      }
      if (!is.null(`createdAt`)) {
        if (!is.character(`createdAt`)) {
          stop(paste("Error! Invalid data for `createdAt`. Must be a string:", `createdAt`))
        }
        self$`createdAt` <- `createdAt`
      }
      if (!is.null(`updatedAt`)) {
        if (!is.character(`updatedAt`)) {
          stop(paste("Error! Invalid data for `updatedAt`. Must be a string:", `updatedAt`))
        }
        self$`updatedAt` <- `updatedAt`
      }
      if (!is.null(`author`)) {
        stopifnot(R6::is.R6(`author`))
        self$`author` <- `author`
      }
      if (!is.null(`children`)) {
        stopifnot(is.vector(`children`), length(`children`) != 0)
        sapply(`children`, function(x) stopifnot(R6::is.R6(x)))
        self$`children` <- `children`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return FeedbackCommentDTO in JSON format
    #' @export
    toJSON = function() {
      FeedbackCommentDTOObject <- list()
      if (!is.null(self$`id`)) {
        FeedbackCommentDTOObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`parentId`)) {
        FeedbackCommentDTOObject[["parentId"]] <-
          self$`parentId`
      }
      if (!is.null(self$`body`)) {
        FeedbackCommentDTOObject[["body"]] <-
          self$`body`
      }
      if (!is.null(self$`createdAt`)) {
        FeedbackCommentDTOObject[["createdAt"]] <-
          self$`createdAt`
      }
      if (!is.null(self$`updatedAt`)) {
        FeedbackCommentDTOObject[["updatedAt"]] <-
          self$`updatedAt`
      }
      if (!is.null(self$`author`)) {
        FeedbackCommentDTOObject[["author"]] <-
          self$`author`$toJSON()
      }
      if (!is.null(self$`children`)) {
        FeedbackCommentDTOObject[["children"]] <-
          lapply(self$`children`, function(x) x$toJSON())
      }
      FeedbackCommentDTOObject
    },
    #' Deserialize JSON string into an instance of FeedbackCommentDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of FeedbackCommentDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of FeedbackCommentDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`parentId`)) {
        self$`parentId` <- this_object$`parentId`
      }
      if (!is.null(this_object$`body`)) {
        self$`body` <- this_object$`body`
      }
      if (!is.null(this_object$`createdAt`)) {
        self$`createdAt` <- this_object$`createdAt`
      }
      if (!is.null(this_object$`updatedAt`)) {
        self$`updatedAt` <- this_object$`updatedAt`
      }
      if (!is.null(this_object$`author`)) {
        `author_object` <- FeedbackCommentAuthorDTO$new()
        `author_object`$fromJSON(jsonlite::toJSON(this_object$`author`, auto_unbox = TRUE, digits = NA))
        self$`author` <- `author_object`
      }
      if (!is.null(this_object$`children`)) {
        self$`children` <- ApiClient$new()$deserializeObj(this_object$`children`, "array[FeedbackCommentDTO]", loadNamespace("ympa_r_client"))
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return FeedbackCommentDTO in JSON format
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
        if (!is.null(self$`body`)) {
          sprintf(
          '"body":
            "%s"
                    ',
          self$`body`
          )
        },
        if (!is.null(self$`createdAt`)) {
          sprintf(
          '"createdAt":
            "%s"
                    ',
          self$`createdAt`
          )
        },
        if (!is.null(self$`updatedAt`)) {
          sprintf(
          '"updatedAt":
            "%s"
                    ',
          self$`updatedAt`
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
        if (!is.null(self$`children`)) {
          sprintf(
          '"children":
          [%s]
',
          paste(sapply(self$`children`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of FeedbackCommentDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of FeedbackCommentDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of FeedbackCommentDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`id` <- this_object$`id`
      self$`parentId` <- this_object$`parentId`
      self$`body` <- this_object$`body`
      self$`createdAt` <- this_object$`createdAt`
      self$`updatedAt` <- this_object$`updatedAt`
      self$`author` <- FeedbackCommentAuthorDTO$new()$fromJSON(jsonlite::toJSON(this_object$`author`, auto_unbox = TRUE, digits = NA))
      self$`children` <- ApiClient$new()$deserializeObj(this_object$`children`, "array[FeedbackCommentDTO]", loadNamespace("ympa_r_client"))
      self
    },
    #' Validate JSON input with respect to FeedbackCommentDTO
    #'
    #' @description
    #' Validate JSON input with respect to FeedbackCommentDTO and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of FeedbackCommentDTO
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
# FeedbackCommentDTO$unlock()
#
## Below is an example to define the print function
# FeedbackCommentDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# FeedbackCommentDTO$lock()

