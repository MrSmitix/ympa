#' Create a new FeedIndexLogsRecordDTO
#'
#' @description
#' Список отчетов по индексации прайс-листа.
#'
#' @docType class
#' @title FeedIndexLogsRecordDTO
#' @description FeedIndexLogsRecordDTO Class
#' @format An \code{R6Class} generator object
#' @field downloadTime Дата и время загрузки прайс-листа.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:42:42+03:00`. character [optional]
#' @field fileTime Дата и время, которые магазин указал в прайс-листе.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:42:42+03:00`. character [optional]
#' @field generationId Идентификатор индексации. integer [optional]
#' @field indexType  \link{FeedIndexLogsIndexType} [optional]
#' @field publishedTime Дата и время публикации предложений из прайс-листа на Яндекс Маркете.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:42:42+03:00`. character [optional]
#' @field status  \link{FeedIndexLogsStatusType} [optional]
#' @field error  \link{FeedIndexLogsErrorDTO} [optional]
#' @field offers  \link{FeedIndexLogsOffersDTO} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
FeedIndexLogsRecordDTO <- R6::R6Class(
  "FeedIndexLogsRecordDTO",
  public = list(
    `downloadTime` = NULL,
    `fileTime` = NULL,
    `generationId` = NULL,
    `indexType` = NULL,
    `publishedTime` = NULL,
    `status` = NULL,
    `error` = NULL,
    `offers` = NULL,
    #' Initialize a new FeedIndexLogsRecordDTO class.
    #'
    #' @description
    #' Initialize a new FeedIndexLogsRecordDTO class.
    #'
    #' @param downloadTime Дата и время загрузки прайс-листа.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:42:42+03:00`.
    #' @param fileTime Дата и время, которые магазин указал в прайс-листе.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:42:42+03:00`.
    #' @param generationId Идентификатор индексации.
    #' @param indexType indexType
    #' @param publishedTime Дата и время публикации предложений из прайс-листа на Яндекс Маркете.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:42:42+03:00`.
    #' @param status status
    #' @param error error
    #' @param offers offers
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`downloadTime` = NULL, `fileTime` = NULL, `generationId` = NULL, `indexType` = NULL, `publishedTime` = NULL, `status` = NULL, `error` = NULL, `offers` = NULL, ...) {
      if (!is.null(`downloadTime`)) {
        if (!is.character(`downloadTime`)) {
          stop(paste("Error! Invalid data for `downloadTime`. Must be a string:", `downloadTime`))
        }
        self$`downloadTime` <- `downloadTime`
      }
      if (!is.null(`fileTime`)) {
        if (!is.character(`fileTime`)) {
          stop(paste("Error! Invalid data for `fileTime`. Must be a string:", `fileTime`))
        }
        self$`fileTime` <- `fileTime`
      }
      if (!is.null(`generationId`)) {
        if (!(is.numeric(`generationId`) && length(`generationId`) == 1)) {
          stop(paste("Error! Invalid data for `generationId`. Must be an integer:", `generationId`))
        }
        self$`generationId` <- `generationId`
      }
      if (!is.null(`indexType`)) {
        if (!(`indexType` %in% c())) {
          stop(paste("Error! \"", `indexType`, "\" cannot be assigned to `indexType`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`indexType`))
        self$`indexType` <- `indexType`
      }
      if (!is.null(`publishedTime`)) {
        if (!is.character(`publishedTime`)) {
          stop(paste("Error! Invalid data for `publishedTime`. Must be a string:", `publishedTime`))
        }
        self$`publishedTime` <- `publishedTime`
      }
      if (!is.null(`status`)) {
        if (!(`status` %in% c())) {
          stop(paste("Error! \"", `status`, "\" cannot be assigned to `status`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`status`))
        self$`status` <- `status`
      }
      if (!is.null(`error`)) {
        stopifnot(R6::is.R6(`error`))
        self$`error` <- `error`
      }
      if (!is.null(`offers`)) {
        stopifnot(R6::is.R6(`offers`))
        self$`offers` <- `offers`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return FeedIndexLogsRecordDTO in JSON format
    #' @export
    toJSON = function() {
      FeedIndexLogsRecordDTOObject <- list()
      if (!is.null(self$`downloadTime`)) {
        FeedIndexLogsRecordDTOObject[["downloadTime"]] <-
          self$`downloadTime`
      }
      if (!is.null(self$`fileTime`)) {
        FeedIndexLogsRecordDTOObject[["fileTime"]] <-
          self$`fileTime`
      }
      if (!is.null(self$`generationId`)) {
        FeedIndexLogsRecordDTOObject[["generationId"]] <-
          self$`generationId`
      }
      if (!is.null(self$`indexType`)) {
        FeedIndexLogsRecordDTOObject[["indexType"]] <-
          self$`indexType`$toJSON()
      }
      if (!is.null(self$`publishedTime`)) {
        FeedIndexLogsRecordDTOObject[["publishedTime"]] <-
          self$`publishedTime`
      }
      if (!is.null(self$`status`)) {
        FeedIndexLogsRecordDTOObject[["status"]] <-
          self$`status`$toJSON()
      }
      if (!is.null(self$`error`)) {
        FeedIndexLogsRecordDTOObject[["error"]] <-
          self$`error`$toJSON()
      }
      if (!is.null(self$`offers`)) {
        FeedIndexLogsRecordDTOObject[["offers"]] <-
          self$`offers`$toJSON()
      }
      FeedIndexLogsRecordDTOObject
    },
    #' Deserialize JSON string into an instance of FeedIndexLogsRecordDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of FeedIndexLogsRecordDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of FeedIndexLogsRecordDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`downloadTime`)) {
        self$`downloadTime` <- this_object$`downloadTime`
      }
      if (!is.null(this_object$`fileTime`)) {
        self$`fileTime` <- this_object$`fileTime`
      }
      if (!is.null(this_object$`generationId`)) {
        self$`generationId` <- this_object$`generationId`
      }
      if (!is.null(this_object$`indexType`)) {
        `indextype_object` <- FeedIndexLogsIndexType$new()
        `indextype_object`$fromJSON(jsonlite::toJSON(this_object$`indexType`, auto_unbox = TRUE, digits = NA))
        self$`indexType` <- `indextype_object`
      }
      if (!is.null(this_object$`publishedTime`)) {
        self$`publishedTime` <- this_object$`publishedTime`
      }
      if (!is.null(this_object$`status`)) {
        `status_object` <- FeedIndexLogsStatusType$new()
        `status_object`$fromJSON(jsonlite::toJSON(this_object$`status`, auto_unbox = TRUE, digits = NA))
        self$`status` <- `status_object`
      }
      if (!is.null(this_object$`error`)) {
        `error_object` <- FeedIndexLogsErrorDTO$new()
        `error_object`$fromJSON(jsonlite::toJSON(this_object$`error`, auto_unbox = TRUE, digits = NA))
        self$`error` <- `error_object`
      }
      if (!is.null(this_object$`offers`)) {
        `offers_object` <- FeedIndexLogsOffersDTO$new()
        `offers_object`$fromJSON(jsonlite::toJSON(this_object$`offers`, auto_unbox = TRUE, digits = NA))
        self$`offers` <- `offers_object`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return FeedIndexLogsRecordDTO in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`downloadTime`)) {
          sprintf(
          '"downloadTime":
            "%s"
                    ',
          self$`downloadTime`
          )
        },
        if (!is.null(self$`fileTime`)) {
          sprintf(
          '"fileTime":
            "%s"
                    ',
          self$`fileTime`
          )
        },
        if (!is.null(self$`generationId`)) {
          sprintf(
          '"generationId":
            %d
                    ',
          self$`generationId`
          )
        },
        if (!is.null(self$`indexType`)) {
          sprintf(
          '"indexType":
          %s
          ',
          jsonlite::toJSON(self$`indexType`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`publishedTime`)) {
          sprintf(
          '"publishedTime":
            "%s"
                    ',
          self$`publishedTime`
          )
        },
        if (!is.null(self$`status`)) {
          sprintf(
          '"status":
          %s
          ',
          jsonlite::toJSON(self$`status`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`error`)) {
          sprintf(
          '"error":
          %s
          ',
          jsonlite::toJSON(self$`error`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`offers`)) {
          sprintf(
          '"offers":
          %s
          ',
          jsonlite::toJSON(self$`offers`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of FeedIndexLogsRecordDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of FeedIndexLogsRecordDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of FeedIndexLogsRecordDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`downloadTime` <- this_object$`downloadTime`
      self$`fileTime` <- this_object$`fileTime`
      self$`generationId` <- this_object$`generationId`
      self$`indexType` <- FeedIndexLogsIndexType$new()$fromJSON(jsonlite::toJSON(this_object$`indexType`, auto_unbox = TRUE, digits = NA))
      self$`publishedTime` <- this_object$`publishedTime`
      self$`status` <- FeedIndexLogsStatusType$new()$fromJSON(jsonlite::toJSON(this_object$`status`, auto_unbox = TRUE, digits = NA))
      self$`error` <- FeedIndexLogsErrorDTO$new()$fromJSON(jsonlite::toJSON(this_object$`error`, auto_unbox = TRUE, digits = NA))
      self$`offers` <- FeedIndexLogsOffersDTO$new()$fromJSON(jsonlite::toJSON(this_object$`offers`, auto_unbox = TRUE, digits = NA))
      self
    },
    #' Validate JSON input with respect to FeedIndexLogsRecordDTO
    #'
    #' @description
    #' Validate JSON input with respect to FeedIndexLogsRecordDTO and throw an exception if invalid
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
    #' @return String representation of FeedIndexLogsRecordDTO
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
# FeedIndexLogsRecordDTO$unlock()
#
## Below is an example to define the print function
# FeedIndexLogsRecordDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# FeedIndexLogsRecordDTO$lock()

