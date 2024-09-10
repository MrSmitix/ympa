#' Create a new GoodsFeedbackDTO
#'
#' @description
#' Отзыв о товаре.
#'
#' @docType class
#' @title GoodsFeedbackDTO
#' @description GoodsFeedbackDTO Class
#' @format An \code{R6Class} generator object
#' @field feedbackId Идентификатор отзыва. integer
#' @field createdAt Дата и время создания отзыва. character
#' @field needReaction Нужен ли ответ на отзыв. character
#' @field identifiers  \link{GoodsFeedbackIdentifiersDTO}
#' @field author Имя автора отзыва. character [optional]
#' @field description  \link{GoodsFeedbackDescriptionDTO} [optional]
#' @field media  \link{GoodsFeedbackMediaDTO} [optional]
#' @field statistics  \link{GoodsFeedbackStatisticsDTO}
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
GoodsFeedbackDTO <- R6::R6Class(
  "GoodsFeedbackDTO",
  public = list(
    `feedbackId` = NULL,
    `createdAt` = NULL,
    `needReaction` = NULL,
    `identifiers` = NULL,
    `author` = NULL,
    `description` = NULL,
    `media` = NULL,
    `statistics` = NULL,
    #' Initialize a new GoodsFeedbackDTO class.
    #'
    #' @description
    #' Initialize a new GoodsFeedbackDTO class.
    #'
    #' @param feedbackId Идентификатор отзыва.
    #' @param createdAt Дата и время создания отзыва.
    #' @param needReaction Нужен ли ответ на отзыв.
    #' @param identifiers identifiers
    #' @param statistics statistics
    #' @param author Имя автора отзыва.
    #' @param description description
    #' @param media media
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`feedbackId`, `createdAt`, `needReaction`, `identifiers`, `statistics`, `author` = NULL, `description` = NULL, `media` = NULL, ...) {
      if (!missing(`feedbackId`)) {
        if (!(is.numeric(`feedbackId`) && length(`feedbackId`) == 1)) {
          stop(paste("Error! Invalid data for `feedbackId`. Must be an integer:", `feedbackId`))
        }
        self$`feedbackId` <- `feedbackId`
      }
      if (!missing(`createdAt`)) {
        if (!(is.character(`createdAt`) && length(`createdAt`) == 1)) {
          stop(paste("Error! Invalid data for `createdAt`. Must be a string:", `createdAt`))
        }
        self$`createdAt` <- `createdAt`
      }
      if (!missing(`needReaction`)) {
        if (!(is.logical(`needReaction`) && length(`needReaction`) == 1)) {
          stop(paste("Error! Invalid data for `needReaction`. Must be a boolean:", `needReaction`))
        }
        self$`needReaction` <- `needReaction`
      }
      if (!missing(`identifiers`)) {
        stopifnot(R6::is.R6(`identifiers`))
        self$`identifiers` <- `identifiers`
      }
      if (!missing(`statistics`)) {
        stopifnot(R6::is.R6(`statistics`))
        self$`statistics` <- `statistics`
      }
      if (!is.null(`author`)) {
        if (!(is.character(`author`) && length(`author`) == 1)) {
          stop(paste("Error! Invalid data for `author`. Must be a string:", `author`))
        }
        self$`author` <- `author`
      }
      if (!is.null(`description`)) {
        stopifnot(R6::is.R6(`description`))
        self$`description` <- `description`
      }
      if (!is.null(`media`)) {
        stopifnot(R6::is.R6(`media`))
        self$`media` <- `media`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return GoodsFeedbackDTO in JSON format
    #' @export
    toJSON = function() {
      GoodsFeedbackDTOObject <- list()
      if (!is.null(self$`feedbackId`)) {
        GoodsFeedbackDTOObject[["feedbackId"]] <-
          self$`feedbackId`
      }
      if (!is.null(self$`createdAt`)) {
        GoodsFeedbackDTOObject[["createdAt"]] <-
          self$`createdAt`
      }
      if (!is.null(self$`needReaction`)) {
        GoodsFeedbackDTOObject[["needReaction"]] <-
          self$`needReaction`
      }
      if (!is.null(self$`identifiers`)) {
        GoodsFeedbackDTOObject[["identifiers"]] <-
          self$`identifiers`$toJSON()
      }
      if (!is.null(self$`author`)) {
        GoodsFeedbackDTOObject[["author"]] <-
          self$`author`
      }
      if (!is.null(self$`description`)) {
        GoodsFeedbackDTOObject[["description"]] <-
          self$`description`$toJSON()
      }
      if (!is.null(self$`media`)) {
        GoodsFeedbackDTOObject[["media"]] <-
          self$`media`$toJSON()
      }
      if (!is.null(self$`statistics`)) {
        GoodsFeedbackDTOObject[["statistics"]] <-
          self$`statistics`$toJSON()
      }
      GoodsFeedbackDTOObject
    },
    #' Deserialize JSON string into an instance of GoodsFeedbackDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of GoodsFeedbackDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of GoodsFeedbackDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`feedbackId`)) {
        self$`feedbackId` <- this_object$`feedbackId`
      }
      if (!is.null(this_object$`createdAt`)) {
        self$`createdAt` <- this_object$`createdAt`
      }
      if (!is.null(this_object$`needReaction`)) {
        self$`needReaction` <- this_object$`needReaction`
      }
      if (!is.null(this_object$`identifiers`)) {
        `identifiers_object` <- GoodsFeedbackIdentifiersDTO$new()
        `identifiers_object`$fromJSON(jsonlite::toJSON(this_object$`identifiers`, auto_unbox = TRUE, digits = NA))
        self$`identifiers` <- `identifiers_object`
      }
      if (!is.null(this_object$`author`)) {
        self$`author` <- this_object$`author`
      }
      if (!is.null(this_object$`description`)) {
        `description_object` <- GoodsFeedbackDescriptionDTO$new()
        `description_object`$fromJSON(jsonlite::toJSON(this_object$`description`, auto_unbox = TRUE, digits = NA))
        self$`description` <- `description_object`
      }
      if (!is.null(this_object$`media`)) {
        `media_object` <- GoodsFeedbackMediaDTO$new()
        `media_object`$fromJSON(jsonlite::toJSON(this_object$`media`, auto_unbox = TRUE, digits = NA))
        self$`media` <- `media_object`
      }
      if (!is.null(this_object$`statistics`)) {
        `statistics_object` <- GoodsFeedbackStatisticsDTO$new()
        `statistics_object`$fromJSON(jsonlite::toJSON(this_object$`statistics`, auto_unbox = TRUE, digits = NA))
        self$`statistics` <- `statistics_object`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return GoodsFeedbackDTO in JSON format
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
        if (!is.null(self$`createdAt`)) {
          sprintf(
          '"createdAt":
            "%s"
                    ',
          self$`createdAt`
          )
        },
        if (!is.null(self$`needReaction`)) {
          sprintf(
          '"needReaction":
            %s
                    ',
          tolower(self$`needReaction`)
          )
        },
        if (!is.null(self$`identifiers`)) {
          sprintf(
          '"identifiers":
          %s
          ',
          jsonlite::toJSON(self$`identifiers`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`author`)) {
          sprintf(
          '"author":
            "%s"
                    ',
          self$`author`
          )
        },
        if (!is.null(self$`description`)) {
          sprintf(
          '"description":
          %s
          ',
          jsonlite::toJSON(self$`description`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`media`)) {
          sprintf(
          '"media":
          %s
          ',
          jsonlite::toJSON(self$`media`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`statistics`)) {
          sprintf(
          '"statistics":
          %s
          ',
          jsonlite::toJSON(self$`statistics`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of GoodsFeedbackDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of GoodsFeedbackDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of GoodsFeedbackDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`feedbackId` <- this_object$`feedbackId`
      self$`createdAt` <- this_object$`createdAt`
      self$`needReaction` <- this_object$`needReaction`
      self$`identifiers` <- GoodsFeedbackIdentifiersDTO$new()$fromJSON(jsonlite::toJSON(this_object$`identifiers`, auto_unbox = TRUE, digits = NA))
      self$`author` <- this_object$`author`
      self$`description` <- GoodsFeedbackDescriptionDTO$new()$fromJSON(jsonlite::toJSON(this_object$`description`, auto_unbox = TRUE, digits = NA))
      self$`media` <- GoodsFeedbackMediaDTO$new()$fromJSON(jsonlite::toJSON(this_object$`media`, auto_unbox = TRUE, digits = NA))
      self$`statistics` <- GoodsFeedbackStatisticsDTO$new()$fromJSON(jsonlite::toJSON(this_object$`statistics`, auto_unbox = TRUE, digits = NA))
      self
    },
    #' Validate JSON input with respect to GoodsFeedbackDTO
    #'
    #' @description
    #' Validate JSON input with respect to GoodsFeedbackDTO and throw an exception if invalid
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
        stop(paste("The JSON input `", input, "` is invalid for GoodsFeedbackDTO: the required field `feedbackId` is missing."))
      }
      # check the required field `createdAt`
      if (!is.null(input_json$`createdAt`)) {
        if (!(is.character(input_json$`createdAt`) && length(input_json$`createdAt`) == 1)) {
          stop(paste("Error! Invalid data for `createdAt`. Must be a string:", input_json$`createdAt`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for GoodsFeedbackDTO: the required field `createdAt` is missing."))
      }
      # check the required field `needReaction`
      if (!is.null(input_json$`needReaction`)) {
        if (!(is.logical(input_json$`needReaction`) && length(input_json$`needReaction`) == 1)) {
          stop(paste("Error! Invalid data for `needReaction`. Must be a boolean:", input_json$`needReaction`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for GoodsFeedbackDTO: the required field `needReaction` is missing."))
      }
      # check the required field `identifiers`
      if (!is.null(input_json$`identifiers`)) {
        stopifnot(R6::is.R6(input_json$`identifiers`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for GoodsFeedbackDTO: the required field `identifiers` is missing."))
      }
      # check the required field `statistics`
      if (!is.null(input_json$`statistics`)) {
        stopifnot(R6::is.R6(input_json$`statistics`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for GoodsFeedbackDTO: the required field `statistics` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of GoodsFeedbackDTO
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

      # check if the required `createdAt` is null
      if (is.null(self$`createdAt`)) {
        return(FALSE)
      }

      # check if the required `needReaction` is null
      if (is.null(self$`needReaction`)) {
        return(FALSE)
      }

      # check if the required `identifiers` is null
      if (is.null(self$`identifiers`)) {
        return(FALSE)
      }

      # check if the required `statistics` is null
      if (is.null(self$`statistics`)) {
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

      # check if the required `createdAt` is null
      if (is.null(self$`createdAt`)) {
        invalid_fields["createdAt"] <- "Non-nullable required field `createdAt` cannot be null."
      }

      # check if the required `needReaction` is null
      if (is.null(self$`needReaction`)) {
        invalid_fields["needReaction"] <- "Non-nullable required field `needReaction` cannot be null."
      }

      # check if the required `identifiers` is null
      if (is.null(self$`identifiers`)) {
        invalid_fields["identifiers"] <- "Non-nullable required field `identifiers` cannot be null."
      }

      # check if the required `statistics` is null
      if (is.null(self$`statistics`)) {
        invalid_fields["statistics"] <- "Non-nullable required field `statistics` cannot be null."
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
# GoodsFeedbackDTO$unlock()
#
## Below is an example to define the print function
# GoodsFeedbackDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# GoodsFeedbackDTO$lock()

