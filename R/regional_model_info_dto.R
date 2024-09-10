#' Create a new RegionalModelInfoDTO
#'
#' @description
#' Региональная информация.
#'
#' @docType class
#' @title RegionalModelInfoDTO
#' @description RegionalModelInfoDTO Class
#' @format An \code{R6Class} generator object
#' @field currency  \link{CurrencyType} [optional]
#' @field regionId Идентификатор региона, для которого выводится информация о предложениях модели (доставляемых в этот регион).  Информацию о регионе по идентификатору можно получить с помощью запроса [GET regions/{regionId}](../../reference/regions/searchRegionsById.md). integer [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
RegionalModelInfoDTO <- R6::R6Class(
  "RegionalModelInfoDTO",
  public = list(
    `currency` = NULL,
    `regionId` = NULL,
    #' Initialize a new RegionalModelInfoDTO class.
    #'
    #' @description
    #' Initialize a new RegionalModelInfoDTO class.
    #'
    #' @param currency currency
    #' @param regionId Идентификатор региона, для которого выводится информация о предложениях модели (доставляемых в этот регион).  Информацию о регионе по идентификатору можно получить с помощью запроса [GET regions/{regionId}](../../reference/regions/searchRegionsById.md).
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`currency` = NULL, `regionId` = NULL, ...) {
      if (!is.null(`currency`)) {
        if (!(`currency` %in% c())) {
          stop(paste("Error! \"", `currency`, "\" cannot be assigned to `currency`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`currency`))
        self$`currency` <- `currency`
      }
      if (!is.null(`regionId`)) {
        if (!(is.numeric(`regionId`) && length(`regionId`) == 1)) {
          stop(paste("Error! Invalid data for `regionId`. Must be an integer:", `regionId`))
        }
        self$`regionId` <- `regionId`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return RegionalModelInfoDTO in JSON format
    #' @export
    toJSON = function() {
      RegionalModelInfoDTOObject <- list()
      if (!is.null(self$`currency`)) {
        RegionalModelInfoDTOObject[["currency"]] <-
          self$`currency`$toJSON()
      }
      if (!is.null(self$`regionId`)) {
        RegionalModelInfoDTOObject[["regionId"]] <-
          self$`regionId`
      }
      RegionalModelInfoDTOObject
    },
    #' Deserialize JSON string into an instance of RegionalModelInfoDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of RegionalModelInfoDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of RegionalModelInfoDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`currency`)) {
        `currency_object` <- CurrencyType$new()
        `currency_object`$fromJSON(jsonlite::toJSON(this_object$`currency`, auto_unbox = TRUE, digits = NA))
        self$`currency` <- `currency_object`
      }
      if (!is.null(this_object$`regionId`)) {
        self$`regionId` <- this_object$`regionId`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return RegionalModelInfoDTO in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`currency`)) {
          sprintf(
          '"currency":
          %s
          ',
          jsonlite::toJSON(self$`currency`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`regionId`)) {
          sprintf(
          '"regionId":
            %d
                    ',
          self$`regionId`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of RegionalModelInfoDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of RegionalModelInfoDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of RegionalModelInfoDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`currency` <- CurrencyType$new()$fromJSON(jsonlite::toJSON(this_object$`currency`, auto_unbox = TRUE, digits = NA))
      self$`regionId` <- this_object$`regionId`
      self
    },
    #' Validate JSON input with respect to RegionalModelInfoDTO
    #'
    #' @description
    #' Validate JSON input with respect to RegionalModelInfoDTO and throw an exception if invalid
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
    #' @return String representation of RegionalModelInfoDTO
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
# RegionalModelInfoDTO$unlock()
#
## Below is an example to define the print function
# RegionalModelInfoDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# RegionalModelInfoDTO$lock()

