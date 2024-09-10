#' Create a new GenerateReportDTO
#'
#' @description
#' Идентификатор, который понадобится для отслеживания статуса генерации и получения готового отчета.
#'
#' @docType class
#' @title GenerateReportDTO
#' @description GenerateReportDTO Class
#' @format An \code{R6Class} generator object
#' @field reportId Идентификатор, который понадобится для отслеживания статуса генерации и получения готового отчета. character
#' @field estimatedGenerationTime Ожидаемая продолжительность генерации в миллисекундах. integer
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
GenerateReportDTO <- R6::R6Class(
  "GenerateReportDTO",
  public = list(
    `reportId` = NULL,
    `estimatedGenerationTime` = NULL,
    #' Initialize a new GenerateReportDTO class.
    #'
    #' @description
    #' Initialize a new GenerateReportDTO class.
    #'
    #' @param reportId Идентификатор, который понадобится для отслеживания статуса генерации и получения готового отчета.
    #' @param estimatedGenerationTime Ожидаемая продолжительность генерации в миллисекундах.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`reportId`, `estimatedGenerationTime`, ...) {
      if (!missing(`reportId`)) {
        if (!(is.character(`reportId`) && length(`reportId`) == 1)) {
          stop(paste("Error! Invalid data for `reportId`. Must be a string:", `reportId`))
        }
        self$`reportId` <- `reportId`
      }
      if (!missing(`estimatedGenerationTime`)) {
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
    #' @return GenerateReportDTO in JSON format
    #' @export
    toJSON = function() {
      GenerateReportDTOObject <- list()
      if (!is.null(self$`reportId`)) {
        GenerateReportDTOObject[["reportId"]] <-
          self$`reportId`
      }
      if (!is.null(self$`estimatedGenerationTime`)) {
        GenerateReportDTOObject[["estimatedGenerationTime"]] <-
          self$`estimatedGenerationTime`
      }
      GenerateReportDTOObject
    },
    #' Deserialize JSON string into an instance of GenerateReportDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of GenerateReportDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of GenerateReportDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`reportId`)) {
        self$`reportId` <- this_object$`reportId`
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
    #' @return GenerateReportDTO in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`reportId`)) {
          sprintf(
          '"reportId":
            "%s"
                    ',
          self$`reportId`
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
    #' Deserialize JSON string into an instance of GenerateReportDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of GenerateReportDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of GenerateReportDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`reportId` <- this_object$`reportId`
      self$`estimatedGenerationTime` <- this_object$`estimatedGenerationTime`
      self
    },
    #' Validate JSON input with respect to GenerateReportDTO
    #'
    #' @description
    #' Validate JSON input with respect to GenerateReportDTO and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `reportId`
      if (!is.null(input_json$`reportId`)) {
        if (!(is.character(input_json$`reportId`) && length(input_json$`reportId`) == 1)) {
          stop(paste("Error! Invalid data for `reportId`. Must be a string:", input_json$`reportId`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for GenerateReportDTO: the required field `reportId` is missing."))
      }
      # check the required field `estimatedGenerationTime`
      if (!is.null(input_json$`estimatedGenerationTime`)) {
        if (!(is.numeric(input_json$`estimatedGenerationTime`) && length(input_json$`estimatedGenerationTime`) == 1)) {
          stop(paste("Error! Invalid data for `estimatedGenerationTime`. Must be an integer:", input_json$`estimatedGenerationTime`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for GenerateReportDTO: the required field `estimatedGenerationTime` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of GenerateReportDTO
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
      # check if the required `reportId` is null
      if (is.null(self$`reportId`)) {
        return(FALSE)
      }

      # check if the required `estimatedGenerationTime` is null
      if (is.null(self$`estimatedGenerationTime`)) {
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
      # check if the required `reportId` is null
      if (is.null(self$`reportId`)) {
        invalid_fields["reportId"] <- "Non-nullable required field `reportId` cannot be null."
      }

      # check if the required `estimatedGenerationTime` is null
      if (is.null(self$`estimatedGenerationTime`)) {
        invalid_fields["estimatedGenerationTime"] <- "Non-nullable required field `estimatedGenerationTime` cannot be null."
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
# GenerateReportDTO$unlock()
#
## Below is an example to define the print function
# GenerateReportDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# GenerateReportDTO$lock()

