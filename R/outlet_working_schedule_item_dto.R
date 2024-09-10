#' Create a new OutletWorkingScheduleItemDTO
#'
#' @description
#' Расписание работы точки продаж.
#'
#' @docType class
#' @title OutletWorkingScheduleItemDTO
#' @description OutletWorkingScheduleItemDTO Class
#' @format An \code{R6Class} generator object
#' @field startDay  \link{DayOfWeekType}
#' @field endDay  \link{DayOfWeekType}
#' @field startTime Точка продаж работает c указанного часа.  Формат: `ЧЧ:ММ`. character
#' @field endTime Точка продаж работает до указанного часа.  Формат: `ЧЧ:ММ`. character
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
OutletWorkingScheduleItemDTO <- R6::R6Class(
  "OutletWorkingScheduleItemDTO",
  public = list(
    `startDay` = NULL,
    `endDay` = NULL,
    `startTime` = NULL,
    `endTime` = NULL,
    #' Initialize a new OutletWorkingScheduleItemDTO class.
    #'
    #' @description
    #' Initialize a new OutletWorkingScheduleItemDTO class.
    #'
    #' @param startDay startDay
    #' @param endDay endDay
    #' @param startTime Точка продаж работает c указанного часа.  Формат: `ЧЧ:ММ`.
    #' @param endTime Точка продаж работает до указанного часа.  Формат: `ЧЧ:ММ`.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`startDay`, `endDay`, `startTime`, `endTime`, ...) {
      if (!missing(`startDay`)) {
        if (!(`startDay` %in% c())) {
          stop(paste("Error! \"", `startDay`, "\" cannot be assigned to `startDay`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`startDay`))
        self$`startDay` <- `startDay`
      }
      if (!missing(`endDay`)) {
        if (!(`endDay` %in% c())) {
          stop(paste("Error! \"", `endDay`, "\" cannot be assigned to `endDay`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`endDay`))
        self$`endDay` <- `endDay`
      }
      if (!missing(`startTime`)) {
        if (!(is.character(`startTime`) && length(`startTime`) == 1)) {
          stop(paste("Error! Invalid data for `startTime`. Must be a string:", `startTime`))
        }
        self$`startTime` <- `startTime`
      }
      if (!missing(`endTime`)) {
        if (!(is.character(`endTime`) && length(`endTime`) == 1)) {
          stop(paste("Error! Invalid data for `endTime`. Must be a string:", `endTime`))
        }
        self$`endTime` <- `endTime`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return OutletWorkingScheduleItemDTO in JSON format
    #' @export
    toJSON = function() {
      OutletWorkingScheduleItemDTOObject <- list()
      if (!is.null(self$`startDay`)) {
        OutletWorkingScheduleItemDTOObject[["startDay"]] <-
          self$`startDay`$toJSON()
      }
      if (!is.null(self$`endDay`)) {
        OutletWorkingScheduleItemDTOObject[["endDay"]] <-
          self$`endDay`$toJSON()
      }
      if (!is.null(self$`startTime`)) {
        OutletWorkingScheduleItemDTOObject[["startTime"]] <-
          self$`startTime`
      }
      if (!is.null(self$`endTime`)) {
        OutletWorkingScheduleItemDTOObject[["endTime"]] <-
          self$`endTime`
      }
      OutletWorkingScheduleItemDTOObject
    },
    #' Deserialize JSON string into an instance of OutletWorkingScheduleItemDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of OutletWorkingScheduleItemDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of OutletWorkingScheduleItemDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`startDay`)) {
        `startday_object` <- DayOfWeekType$new()
        `startday_object`$fromJSON(jsonlite::toJSON(this_object$`startDay`, auto_unbox = TRUE, digits = NA))
        self$`startDay` <- `startday_object`
      }
      if (!is.null(this_object$`endDay`)) {
        `endday_object` <- DayOfWeekType$new()
        `endday_object`$fromJSON(jsonlite::toJSON(this_object$`endDay`, auto_unbox = TRUE, digits = NA))
        self$`endDay` <- `endday_object`
      }
      if (!is.null(this_object$`startTime`)) {
        self$`startTime` <- this_object$`startTime`
      }
      if (!is.null(this_object$`endTime`)) {
        self$`endTime` <- this_object$`endTime`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return OutletWorkingScheduleItemDTO in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`startDay`)) {
          sprintf(
          '"startDay":
          %s
          ',
          jsonlite::toJSON(self$`startDay`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`endDay`)) {
          sprintf(
          '"endDay":
          %s
          ',
          jsonlite::toJSON(self$`endDay`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`startTime`)) {
          sprintf(
          '"startTime":
            "%s"
                    ',
          self$`startTime`
          )
        },
        if (!is.null(self$`endTime`)) {
          sprintf(
          '"endTime":
            "%s"
                    ',
          self$`endTime`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of OutletWorkingScheduleItemDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of OutletWorkingScheduleItemDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of OutletWorkingScheduleItemDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`startDay` <- DayOfWeekType$new()$fromJSON(jsonlite::toJSON(this_object$`startDay`, auto_unbox = TRUE, digits = NA))
      self$`endDay` <- DayOfWeekType$new()$fromJSON(jsonlite::toJSON(this_object$`endDay`, auto_unbox = TRUE, digits = NA))
      self$`startTime` <- this_object$`startTime`
      self$`endTime` <- this_object$`endTime`
      self
    },
    #' Validate JSON input with respect to OutletWorkingScheduleItemDTO
    #'
    #' @description
    #' Validate JSON input with respect to OutletWorkingScheduleItemDTO and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `startDay`
      if (!is.null(input_json$`startDay`)) {
        stopifnot(R6::is.R6(input_json$`startDay`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for OutletWorkingScheduleItemDTO: the required field `startDay` is missing."))
      }
      # check the required field `endDay`
      if (!is.null(input_json$`endDay`)) {
        stopifnot(R6::is.R6(input_json$`endDay`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for OutletWorkingScheduleItemDTO: the required field `endDay` is missing."))
      }
      # check the required field `startTime`
      if (!is.null(input_json$`startTime`)) {
        if (!(is.character(input_json$`startTime`) && length(input_json$`startTime`) == 1)) {
          stop(paste("Error! Invalid data for `startTime`. Must be a string:", input_json$`startTime`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for OutletWorkingScheduleItemDTO: the required field `startTime` is missing."))
      }
      # check the required field `endTime`
      if (!is.null(input_json$`endTime`)) {
        if (!(is.character(input_json$`endTime`) && length(input_json$`endTime`) == 1)) {
          stop(paste("Error! Invalid data for `endTime`. Must be a string:", input_json$`endTime`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for OutletWorkingScheduleItemDTO: the required field `endTime` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of OutletWorkingScheduleItemDTO
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
      # check if the required `startDay` is null
      if (is.null(self$`startDay`)) {
        return(FALSE)
      }

      # check if the required `endDay` is null
      if (is.null(self$`endDay`)) {
        return(FALSE)
      }

      # check if the required `startTime` is null
      if (is.null(self$`startTime`)) {
        return(FALSE)
      }

      if (nchar(self$`startTime`) < 1) {
        return(FALSE)
      }

      # check if the required `endTime` is null
      if (is.null(self$`endTime`)) {
        return(FALSE)
      }

      if (nchar(self$`endTime`) < 1) {
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
      # check if the required `startDay` is null
      if (is.null(self$`startDay`)) {
        invalid_fields["startDay"] <- "Non-nullable required field `startDay` cannot be null."
      }

      # check if the required `endDay` is null
      if (is.null(self$`endDay`)) {
        invalid_fields["endDay"] <- "Non-nullable required field `endDay` cannot be null."
      }

      # check if the required `startTime` is null
      if (is.null(self$`startTime`)) {
        invalid_fields["startTime"] <- "Non-nullable required field `startTime` cannot be null."
      }

      if (nchar(self$`startTime`) < 1) {
        invalid_fields["startTime"] <- "Invalid length for `startTime`, must be bigger than or equal to 1."
      }

      # check if the required `endTime` is null
      if (is.null(self$`endTime`)) {
        invalid_fields["endTime"] <- "Non-nullable required field `endTime` cannot be null."
      }

      if (nchar(self$`endTime`) < 1) {
        invalid_fields["endTime"] <- "Invalid length for `endTime`, must be bigger than or equal to 1."
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
# OutletWorkingScheduleItemDTO$unlock()
#
## Below is an example to define the print function
# OutletWorkingScheduleItemDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# OutletWorkingScheduleItemDTO$lock()

