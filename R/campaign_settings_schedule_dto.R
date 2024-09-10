#' Create a new CampaignSettingsScheduleDTO
#'
#' @description
#' Расписание работы службы доставки в своем регионе.
#'
#' @docType class
#' @title CampaignSettingsScheduleDTO
#' @description CampaignSettingsScheduleDTO Class
#' @format An \code{R6Class} generator object
#' @field availableOnHolidays Признак работы службы доставки в государственные праздники. Возможные значения. * `false` — служба доставки не работает в праздничные дни. * `true` — служба доставки работает в праздничные дни. character [optional]
#' @field customHolidays Список дней, в которые служба доставки не работает. Дни магазин указал в кабинете продавца на Маркете. list(character)
#' @field customWorkingDays Список выходных и праздничных дней, в которые служба доставки работает. Дни магазин указал в кабинете продавца на Маркете. list(character)
#' @field period  \link{CampaignSettingsTimePeriodDTO} [optional]
#' @field totalHolidays Итоговый список нерабочих дней службы доставки. Список рассчитывается с учетом выходных, нерабочих дней и государственных праздников. Информацию по ним магазин указывает в кабинете продавца на Маркете. list(character)
#' @field weeklyHolidays Список выходных дней недели и государственных праздников. list(integer)
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CampaignSettingsScheduleDTO <- R6::R6Class(
  "CampaignSettingsScheduleDTO",
  public = list(
    `availableOnHolidays` = NULL,
    `customHolidays` = NULL,
    `customWorkingDays` = NULL,
    `period` = NULL,
    `totalHolidays` = NULL,
    `weeklyHolidays` = NULL,
    #' Initialize a new CampaignSettingsScheduleDTO class.
    #'
    #' @description
    #' Initialize a new CampaignSettingsScheduleDTO class.
    #'
    #' @param customHolidays Список дней, в которые служба доставки не работает. Дни магазин указал в кабинете продавца на Маркете.
    #' @param customWorkingDays Список выходных и праздничных дней, в которые служба доставки работает. Дни магазин указал в кабинете продавца на Маркете.
    #' @param totalHolidays Итоговый список нерабочих дней службы доставки. Список рассчитывается с учетом выходных, нерабочих дней и государственных праздников. Информацию по ним магазин указывает в кабинете продавца на Маркете.
    #' @param weeklyHolidays Список выходных дней недели и государственных праздников.
    #' @param availableOnHolidays Признак работы службы доставки в государственные праздники. Возможные значения. * `false` — служба доставки не работает в праздничные дни. * `true` — служба доставки работает в праздничные дни.
    #' @param period period
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`customHolidays`, `customWorkingDays`, `totalHolidays`, `weeklyHolidays`, `availableOnHolidays` = NULL, `period` = NULL, ...) {
      if (!missing(`customHolidays`)) {
        stopifnot(is.vector(`customHolidays`), length(`customHolidays`) != 0)
        sapply(`customHolidays`, function(x) stopifnot(is.character(x)))
        self$`customHolidays` <- `customHolidays`
      }
      if (!missing(`customWorkingDays`)) {
        stopifnot(is.vector(`customWorkingDays`), length(`customWorkingDays`) != 0)
        sapply(`customWorkingDays`, function(x) stopifnot(is.character(x)))
        self$`customWorkingDays` <- `customWorkingDays`
      }
      if (!missing(`totalHolidays`)) {
        stopifnot(is.vector(`totalHolidays`), length(`totalHolidays`) != 0)
        sapply(`totalHolidays`, function(x) stopifnot(is.character(x)))
        self$`totalHolidays` <- `totalHolidays`
      }
      if (!missing(`weeklyHolidays`)) {
        stopifnot(is.vector(`weeklyHolidays`), length(`weeklyHolidays`) != 0)
        sapply(`weeklyHolidays`, function(x) stopifnot(is.character(x)))
        self$`weeklyHolidays` <- `weeklyHolidays`
      }
      if (!is.null(`availableOnHolidays`)) {
        if (!(is.logical(`availableOnHolidays`) && length(`availableOnHolidays`) == 1)) {
          stop(paste("Error! Invalid data for `availableOnHolidays`. Must be a boolean:", `availableOnHolidays`))
        }
        self$`availableOnHolidays` <- `availableOnHolidays`
      }
      if (!is.null(`period`)) {
        stopifnot(R6::is.R6(`period`))
        self$`period` <- `period`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return CampaignSettingsScheduleDTO in JSON format
    #' @export
    toJSON = function() {
      CampaignSettingsScheduleDTOObject <- list()
      if (!is.null(self$`availableOnHolidays`)) {
        CampaignSettingsScheduleDTOObject[["availableOnHolidays"]] <-
          self$`availableOnHolidays`
      }
      if (!is.null(self$`customHolidays`)) {
        CampaignSettingsScheduleDTOObject[["customHolidays"]] <-
          self$`customHolidays`
      }
      if (!is.null(self$`customWorkingDays`)) {
        CampaignSettingsScheduleDTOObject[["customWorkingDays"]] <-
          self$`customWorkingDays`
      }
      if (!is.null(self$`period`)) {
        CampaignSettingsScheduleDTOObject[["period"]] <-
          self$`period`$toJSON()
      }
      if (!is.null(self$`totalHolidays`)) {
        CampaignSettingsScheduleDTOObject[["totalHolidays"]] <-
          self$`totalHolidays`
      }
      if (!is.null(self$`weeklyHolidays`)) {
        CampaignSettingsScheduleDTOObject[["weeklyHolidays"]] <-
          self$`weeklyHolidays`
      }
      CampaignSettingsScheduleDTOObject
    },
    #' Deserialize JSON string into an instance of CampaignSettingsScheduleDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of CampaignSettingsScheduleDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of CampaignSettingsScheduleDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`availableOnHolidays`)) {
        self$`availableOnHolidays` <- this_object$`availableOnHolidays`
      }
      if (!is.null(this_object$`customHolidays`)) {
        self$`customHolidays` <- ApiClient$new()$deserializeObj(this_object$`customHolidays`, "array[character]", loadNamespace("ympa_r_client"))
      }
      if (!is.null(this_object$`customWorkingDays`)) {
        self$`customWorkingDays` <- ApiClient$new()$deserializeObj(this_object$`customWorkingDays`, "array[character]", loadNamespace("ympa_r_client"))
      }
      if (!is.null(this_object$`period`)) {
        `period_object` <- CampaignSettingsTimePeriodDTO$new()
        `period_object`$fromJSON(jsonlite::toJSON(this_object$`period`, auto_unbox = TRUE, digits = NA))
        self$`period` <- `period_object`
      }
      if (!is.null(this_object$`totalHolidays`)) {
        self$`totalHolidays` <- ApiClient$new()$deserializeObj(this_object$`totalHolidays`, "array[character]", loadNamespace("ympa_r_client"))
      }
      if (!is.null(this_object$`weeklyHolidays`)) {
        self$`weeklyHolidays` <- ApiClient$new()$deserializeObj(this_object$`weeklyHolidays`, "array[integer]", loadNamespace("ympa_r_client"))
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return CampaignSettingsScheduleDTO in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`availableOnHolidays`)) {
          sprintf(
          '"availableOnHolidays":
            %s
                    ',
          tolower(self$`availableOnHolidays`)
          )
        },
        if (!is.null(self$`customHolidays`)) {
          sprintf(
          '"customHolidays":
             [%s]
          ',
          paste(unlist(lapply(self$`customHolidays`, function(x) paste0('"', x, '"'))), collapse = ",")
          )
        },
        if (!is.null(self$`customWorkingDays`)) {
          sprintf(
          '"customWorkingDays":
             [%s]
          ',
          paste(unlist(lapply(self$`customWorkingDays`, function(x) paste0('"', x, '"'))), collapse = ",")
          )
        },
        if (!is.null(self$`period`)) {
          sprintf(
          '"period":
          %s
          ',
          jsonlite::toJSON(self$`period`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`totalHolidays`)) {
          sprintf(
          '"totalHolidays":
             [%s]
          ',
          paste(unlist(lapply(self$`totalHolidays`, function(x) paste0('"', x, '"'))), collapse = ",")
          )
        },
        if (!is.null(self$`weeklyHolidays`)) {
          sprintf(
          '"weeklyHolidays":
             [%s]
          ',
          paste(unlist(lapply(self$`weeklyHolidays`, function(x) paste0('"', x, '"'))), collapse = ",")
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of CampaignSettingsScheduleDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of CampaignSettingsScheduleDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of CampaignSettingsScheduleDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`availableOnHolidays` <- this_object$`availableOnHolidays`
      self$`customHolidays` <- ApiClient$new()$deserializeObj(this_object$`customHolidays`, "array[character]", loadNamespace("ympa_r_client"))
      self$`customWorkingDays` <- ApiClient$new()$deserializeObj(this_object$`customWorkingDays`, "array[character]", loadNamespace("ympa_r_client"))
      self$`period` <- CampaignSettingsTimePeriodDTO$new()$fromJSON(jsonlite::toJSON(this_object$`period`, auto_unbox = TRUE, digits = NA))
      self$`totalHolidays` <- ApiClient$new()$deserializeObj(this_object$`totalHolidays`, "array[character]", loadNamespace("ympa_r_client"))
      self$`weeklyHolidays` <- ApiClient$new()$deserializeObj(this_object$`weeklyHolidays`, "array[integer]", loadNamespace("ympa_r_client"))
      self
    },
    #' Validate JSON input with respect to CampaignSettingsScheduleDTO
    #'
    #' @description
    #' Validate JSON input with respect to CampaignSettingsScheduleDTO and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `customHolidays`
      if (!is.null(input_json$`customHolidays`)) {
        stopifnot(is.vector(input_json$`customHolidays`), length(input_json$`customHolidays`) != 0)
        tmp <- sapply(input_json$`customHolidays`, function(x) stopifnot(is.character(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CampaignSettingsScheduleDTO: the required field `customHolidays` is missing."))
      }
      # check the required field `customWorkingDays`
      if (!is.null(input_json$`customWorkingDays`)) {
        stopifnot(is.vector(input_json$`customWorkingDays`), length(input_json$`customWorkingDays`) != 0)
        tmp <- sapply(input_json$`customWorkingDays`, function(x) stopifnot(is.character(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CampaignSettingsScheduleDTO: the required field `customWorkingDays` is missing."))
      }
      # check the required field `totalHolidays`
      if (!is.null(input_json$`totalHolidays`)) {
        stopifnot(is.vector(input_json$`totalHolidays`), length(input_json$`totalHolidays`) != 0)
        tmp <- sapply(input_json$`totalHolidays`, function(x) stopifnot(is.character(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CampaignSettingsScheduleDTO: the required field `totalHolidays` is missing."))
      }
      # check the required field `weeklyHolidays`
      if (!is.null(input_json$`weeklyHolidays`)) {
        stopifnot(is.vector(input_json$`weeklyHolidays`), length(input_json$`weeklyHolidays`) != 0)
        tmp <- sapply(input_json$`weeklyHolidays`, function(x) stopifnot(is.character(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CampaignSettingsScheduleDTO: the required field `weeklyHolidays` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CampaignSettingsScheduleDTO
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
      # check if the required `customHolidays` is null
      if (is.null(self$`customHolidays`)) {
        return(FALSE)
      }

      # check if the required `customWorkingDays` is null
      if (is.null(self$`customWorkingDays`)) {
        return(FALSE)
      }

      # check if the required `totalHolidays` is null
      if (is.null(self$`totalHolidays`)) {
        return(FALSE)
      }

      # check if the required `weeklyHolidays` is null
      if (is.null(self$`weeklyHolidays`)) {
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
      # check if the required `customHolidays` is null
      if (is.null(self$`customHolidays`)) {
        invalid_fields["customHolidays"] <- "Non-nullable required field `customHolidays` cannot be null."
      }

      # check if the required `customWorkingDays` is null
      if (is.null(self$`customWorkingDays`)) {
        invalid_fields["customWorkingDays"] <- "Non-nullable required field `customWorkingDays` cannot be null."
      }

      # check if the required `totalHolidays` is null
      if (is.null(self$`totalHolidays`)) {
        invalid_fields["totalHolidays"] <- "Non-nullable required field `totalHolidays` cannot be null."
      }

      # check if the required `weeklyHolidays` is null
      if (is.null(self$`weeklyHolidays`)) {
        invalid_fields["weeklyHolidays"] <- "Non-nullable required field `weeklyHolidays` cannot be null."
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
# CampaignSettingsScheduleDTO$unlock()
#
## Below is an example to define the print function
# CampaignSettingsScheduleDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CampaignSettingsScheduleDTO$lock()

