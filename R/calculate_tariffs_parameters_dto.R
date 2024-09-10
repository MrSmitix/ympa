#' Create a new CalculateTariffsParametersDTO
#'
#' @description
#' Параметры для расчета стоимости услуг.
#'
#' @docType class
#' @title CalculateTariffsParametersDTO
#' @description CalculateTariffsParametersDTO Class
#' @format An \code{R6Class} generator object
#' @field campaignId Идентификатор кампании. У пользователя, который выполняет запрос, должен быть доступ к этой кампании.  Используйте параметр `campaignId`, если уже завершили подключение магазина на Маркете. Иначе вернется пустой список.  Обязательный параметр, если не указан параметр `sellingProgram`. Совместное использование параметров приведет к ошибке. integer [optional]
#' @field sellingProgram  \link{SellingProgramType} [optional]
#' @field frequency  \link{PaymentFrequencyType} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CalculateTariffsParametersDTO <- R6::R6Class(
  "CalculateTariffsParametersDTO",
  public = list(
    `campaignId` = NULL,
    `sellingProgram` = NULL,
    `frequency` = NULL,
    #' Initialize a new CalculateTariffsParametersDTO class.
    #'
    #' @description
    #' Initialize a new CalculateTariffsParametersDTO class.
    #'
    #' @param campaignId Идентификатор кампании. У пользователя, который выполняет запрос, должен быть доступ к этой кампании.  Используйте параметр `campaignId`, если уже завершили подключение магазина на Маркете. Иначе вернется пустой список.  Обязательный параметр, если не указан параметр `sellingProgram`. Совместное использование параметров приведет к ошибке.
    #' @param sellingProgram sellingProgram
    #' @param frequency frequency
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`campaignId` = NULL, `sellingProgram` = NULL, `frequency` = NULL, ...) {
      if (!is.null(`campaignId`)) {
        if (!(is.numeric(`campaignId`) && length(`campaignId`) == 1)) {
          stop(paste("Error! Invalid data for `campaignId`. Must be an integer:", `campaignId`))
        }
        self$`campaignId` <- `campaignId`
      }
      if (!is.null(`sellingProgram`)) {
        if (!(`sellingProgram` %in% c())) {
          stop(paste("Error! \"", `sellingProgram`, "\" cannot be assigned to `sellingProgram`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`sellingProgram`))
        self$`sellingProgram` <- `sellingProgram`
      }
      if (!is.null(`frequency`)) {
        if (!(`frequency` %in% c())) {
          stop(paste("Error! \"", `frequency`, "\" cannot be assigned to `frequency`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`frequency`))
        self$`frequency` <- `frequency`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return CalculateTariffsParametersDTO in JSON format
    #' @export
    toJSON = function() {
      CalculateTariffsParametersDTOObject <- list()
      if (!is.null(self$`campaignId`)) {
        CalculateTariffsParametersDTOObject[["campaignId"]] <-
          self$`campaignId`
      }
      if (!is.null(self$`sellingProgram`)) {
        CalculateTariffsParametersDTOObject[["sellingProgram"]] <-
          self$`sellingProgram`$toJSON()
      }
      if (!is.null(self$`frequency`)) {
        CalculateTariffsParametersDTOObject[["frequency"]] <-
          self$`frequency`$toJSON()
      }
      CalculateTariffsParametersDTOObject
    },
    #' Deserialize JSON string into an instance of CalculateTariffsParametersDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of CalculateTariffsParametersDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of CalculateTariffsParametersDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`campaignId`)) {
        self$`campaignId` <- this_object$`campaignId`
      }
      if (!is.null(this_object$`sellingProgram`)) {
        `sellingprogram_object` <- SellingProgramType$new()
        `sellingprogram_object`$fromJSON(jsonlite::toJSON(this_object$`sellingProgram`, auto_unbox = TRUE, digits = NA))
        self$`sellingProgram` <- `sellingprogram_object`
      }
      if (!is.null(this_object$`frequency`)) {
        `frequency_object` <- PaymentFrequencyType$new()
        `frequency_object`$fromJSON(jsonlite::toJSON(this_object$`frequency`, auto_unbox = TRUE, digits = NA))
        self$`frequency` <- `frequency_object`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return CalculateTariffsParametersDTO in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`campaignId`)) {
          sprintf(
          '"campaignId":
            %d
                    ',
          self$`campaignId`
          )
        },
        if (!is.null(self$`sellingProgram`)) {
          sprintf(
          '"sellingProgram":
          %s
          ',
          jsonlite::toJSON(self$`sellingProgram`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`frequency`)) {
          sprintf(
          '"frequency":
          %s
          ',
          jsonlite::toJSON(self$`frequency`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of CalculateTariffsParametersDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of CalculateTariffsParametersDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of CalculateTariffsParametersDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`campaignId` <- this_object$`campaignId`
      self$`sellingProgram` <- SellingProgramType$new()$fromJSON(jsonlite::toJSON(this_object$`sellingProgram`, auto_unbox = TRUE, digits = NA))
      self$`frequency` <- PaymentFrequencyType$new()$fromJSON(jsonlite::toJSON(this_object$`frequency`, auto_unbox = TRUE, digits = NA))
      self
    },
    #' Validate JSON input with respect to CalculateTariffsParametersDTO
    #'
    #' @description
    #' Validate JSON input with respect to CalculateTariffsParametersDTO and throw an exception if invalid
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
    #' @return String representation of CalculateTariffsParametersDTO
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
# CalculateTariffsParametersDTO$unlock()
#
## Below is an example to define the print function
# CalculateTariffsParametersDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CalculateTariffsParametersDTO$lock()

