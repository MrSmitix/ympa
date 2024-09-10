#' Create a new ReportInfoDTO
#'
#' @description
#' Статус генерации и ссылка на готовый отчет.
#'
#' @docType class
#' @title ReportInfoDTO
#' @description ReportInfoDTO Class
#' @format An \code{R6Class} generator object
#' @field status  \link{ReportStatusType}
#' @field subStatus  \link{ReportSubStatusType} [optional]
#' @field generationRequestedAt Дата и время запроса на генерацию. character
#' @field generationFinishedAt Дата и время завершения генерации. character [optional]
#' @field file Ссылка на готовый отчет. character [optional]
#' @field estimatedGenerationTime Ожидаемая продолжительность генерации в миллисекундах. integer [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ReportInfoDTO <- R6::R6Class(
  "ReportInfoDTO",
  public = list(
    `status` = NULL,
    `subStatus` = NULL,
    `generationRequestedAt` = NULL,
    `generationFinishedAt` = NULL,
    `file` = NULL,
    `estimatedGenerationTime` = NULL,
    #' Initialize a new ReportInfoDTO class.
    #'
    #' @description
    #' Initialize a new ReportInfoDTO class.
    #'
    #' @param status status
    #' @param generationRequestedAt Дата и время запроса на генерацию.
    #' @param subStatus subStatus
    #' @param generationFinishedAt Дата и время завершения генерации.
    #' @param file Ссылка на готовый отчет.
    #' @param estimatedGenerationTime Ожидаемая продолжительность генерации в миллисекундах.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`status`, `generationRequestedAt`, `subStatus` = NULL, `generationFinishedAt` = NULL, `file` = NULL, `estimatedGenerationTime` = NULL, ...) {
      if (!missing(`status`)) {
        if (!(`status` %in% c())) {
          stop(paste("Error! \"", `status`, "\" cannot be assigned to `status`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`status`))
        self$`status` <- `status`
      }
      if (!missing(`generationRequestedAt`)) {
        if (!(is.character(`generationRequestedAt`) && length(`generationRequestedAt`) == 1)) {
          stop(paste("Error! Invalid data for `generationRequestedAt`. Must be a string:", `generationRequestedAt`))
        }
        self$`generationRequestedAt` <- `generationRequestedAt`
      }
      if (!is.null(`subStatus`)) {
        if (!(`subStatus` %in% c())) {
          stop(paste("Error! \"", `subStatus`, "\" cannot be assigned to `subStatus`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`subStatus`))
        self$`subStatus` <- `subStatus`
      }
      if (!is.null(`generationFinishedAt`)) {
        if (!is.character(`generationFinishedAt`)) {
          stop(paste("Error! Invalid data for `generationFinishedAt`. Must be a string:", `generationFinishedAt`))
        }
        self$`generationFinishedAt` <- `generationFinishedAt`
      }
      if (!is.null(`file`)) {
        if (!(is.character(`file`) && length(`file`) == 1)) {
          stop(paste("Error! Invalid data for `file`. Must be a string:", `file`))
        }
        self$`file` <- `file`
      }
      if (!is.null(`estimatedGenerationTime`)) {
        if (!(is.numeric(`estimatedGenerationTime`) && length(`estimatedGenerationTime`) == 1)) {
          stop(paste("Error! Invalid data for `estimatedGenerationTime`. Must be an integer:", `estimatedGenerationTime`))
        }
        self$`estimatedGenerationTime` <- `estimatedGenerationTime`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return ReportInfoDTO in JSON format
    #' @export
    toJSON = function() {
      ReportInfoDTOObject <- list()
      if (!is.null(self$`status`)) {
        ReportInfoDTOObject[["status"]] <-
          self$`status`$toJSON()
      }
      if (!is.null(self$`subStatus`)) {
        ReportInfoDTOObject[["subStatus"]] <-
          self$`subStatus`$toJSON()
      }
      if (!is.null(self$`generationRequestedAt`)) {
        ReportInfoDTOObject[["generationRequestedAt"]] <-
          self$`generationRequestedAt`
      }
      if (!is.null(self$`generationFinishedAt`)) {
        ReportInfoDTOObject[["generationFinishedAt"]] <-
          self$`generationFinishedAt`
      }
      if (!is.null(self$`file`)) {
        ReportInfoDTOObject[["file"]] <-
          self$`file`
      }
      if (!is.null(self$`estimatedGenerationTime`)) {
        ReportInfoDTOObject[["estimatedGenerationTime"]] <-
          self$`estimatedGenerationTime`
      }
      ReportInfoDTOObject
    },
    #' Deserialize JSON string into an instance of ReportInfoDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of ReportInfoDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of ReportInfoDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`status`)) {
        `status_object` <- ReportStatusType$new()
        `status_object`$fromJSON(jsonlite::toJSON(this_object$`status`, auto_unbox = TRUE, digits = NA))
        self$`status` <- `status_object`
      }
      if (!is.null(this_object$`subStatus`)) {
        `substatus_object` <- ReportSubStatusType$new()
        `substatus_object`$fromJSON(jsonlite::toJSON(this_object$`subStatus`, auto_unbox = TRUE, digits = NA))
        self$`subStatus` <- `substatus_object`
      }
      if (!is.null(this_object$`generationRequestedAt`)) {
        self$`generationRequestedAt` <- this_object$`generationRequestedAt`
      }
      if (!is.null(this_object$`generationFinishedAt`)) {
        self$`generationFinishedAt` <- this_object$`generationFinishedAt`
      }
      if (!is.null(this_object$`file`)) {
        self$`file` <- this_object$`file`
      }
      if (!is.null(this_object$`estimatedGenerationTime`)) {
        self$`estimatedGenerationTime` <- this_object$`estimatedGenerationTime`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return ReportInfoDTO in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`status`)) {
          sprintf(
          '"status":
          %s
          ',
          jsonlite::toJSON(self$`status`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`subStatus`)) {
          sprintf(
          '"subStatus":
          %s
          ',
          jsonlite::toJSON(self$`subStatus`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`generationRequestedAt`)) {
          sprintf(
          '"generationRequestedAt":
            "%s"
                    ',
          self$`generationRequestedAt`
          )
        },
        if (!is.null(self$`generationFinishedAt`)) {
          sprintf(
          '"generationFinishedAt":
            "%s"
                    ',
          self$`generationFinishedAt`
          )
        },
        if (!is.null(self$`file`)) {
          sprintf(
          '"file":
            "%s"
                    ',
          self$`file`
          )
        },
        if (!is.null(self$`estimatedGenerationTime`)) {
          sprintf(
          '"estimatedGenerationTime":
            %d
                    ',
          self$`estimatedGenerationTime`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of ReportInfoDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of ReportInfoDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of ReportInfoDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`status` <- ReportStatusType$new()$fromJSON(jsonlite::toJSON(this_object$`status`, auto_unbox = TRUE, digits = NA))
      self$`subStatus` <- ReportSubStatusType$new()$fromJSON(jsonlite::toJSON(this_object$`subStatus`, auto_unbox = TRUE, digits = NA))
      self$`generationRequestedAt` <- this_object$`generationRequestedAt`
      self$`generationFinishedAt` <- this_object$`generationFinishedAt`
      self$`file` <- this_object$`file`
      self$`estimatedGenerationTime` <- this_object$`estimatedGenerationTime`
      self
    },
    #' Validate JSON input with respect to ReportInfoDTO
    #'
    #' @description
    #' Validate JSON input with respect to ReportInfoDTO and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `status`
      if (!is.null(input_json$`status`)) {
        stopifnot(R6::is.R6(input_json$`status`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ReportInfoDTO: the required field `status` is missing."))
      }
      # check the required field `generationRequestedAt`
      if (!is.null(input_json$`generationRequestedAt`)) {
        if (!(is.character(input_json$`generationRequestedAt`) && length(input_json$`generationRequestedAt`) == 1)) {
          stop(paste("Error! Invalid data for `generationRequestedAt`. Must be a string:", input_json$`generationRequestedAt`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ReportInfoDTO: the required field `generationRequestedAt` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of ReportInfoDTO
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
      # check if the required `status` is null
      if (is.null(self$`status`)) {
        return(FALSE)
      }

      # check if the required `generationRequestedAt` is null
      if (is.null(self$`generationRequestedAt`)) {
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
      # check if the required `status` is null
      if (is.null(self$`status`)) {
        invalid_fields["status"] <- "Non-nullable required field `status` cannot be null."
      }

      # check if the required `generationRequestedAt` is null
      if (is.null(self$`generationRequestedAt`)) {
        invalid_fields["generationRequestedAt"] <- "Non-nullable required field `generationRequestedAt` cannot be null."
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
# ReportInfoDTO$unlock()
#
## Below is an example to define the print function
# ReportInfoDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# ReportInfoDTO$lock()

