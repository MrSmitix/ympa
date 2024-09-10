#' Create a new UpdateOfferMappingsResponse
#'
#' @description
#' Описывает проблемы, возникшие при сохранении товара.
#'
#' @docType class
#' @title UpdateOfferMappingsResponse
#' @description UpdateOfferMappingsResponse Class
#' @format An \code{R6Class} generator object
#' @field status  \link{ApiResponseStatusType} [optional]
#' @field results Ошибки и предупреждения, которые появились при обработке списка характеристик. Каждый элемент списка соответствует одному товару.  Если ошибок и предупреждений нет, поле не передается. list(\link{UpdateOfferMappingResultDTO}) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
UpdateOfferMappingsResponse <- R6::R6Class(
  "UpdateOfferMappingsResponse",
  public = list(
    `status` = NULL,
    `results` = NULL,
    #' Initialize a new UpdateOfferMappingsResponse class.
    #'
    #' @description
    #' Initialize a new UpdateOfferMappingsResponse class.
    #'
    #' @param status status
    #' @param results Ошибки и предупреждения, которые появились при обработке списка характеристик. Каждый элемент списка соответствует одному товару.  Если ошибок и предупреждений нет, поле не передается.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`status` = NULL, `results` = NULL, ...) {
      if (!is.null(`status`)) {
        if (!(`status` %in% c())) {
          stop(paste("Error! \"", `status`, "\" cannot be assigned to `status`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`status`))
        self$`status` <- `status`
      }
      if (!is.null(`results`)) {
        stopifnot(is.vector(`results`), length(`results`) != 0)
        sapply(`results`, function(x) stopifnot(R6::is.R6(x)))
        self$`results` <- `results`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return UpdateOfferMappingsResponse in JSON format
    #' @export
    toJSON = function() {
      UpdateOfferMappingsResponseObject <- list()
      if (!is.null(self$`status`)) {
        UpdateOfferMappingsResponseObject[["status"]] <-
          self$`status`$toJSON()
      }
      if (!is.null(self$`results`)) {
        UpdateOfferMappingsResponseObject[["results"]] <-
          lapply(self$`results`, function(x) x$toJSON())
      }
      UpdateOfferMappingsResponseObject
    },
    #' Deserialize JSON string into an instance of UpdateOfferMappingsResponse
    #'
    #' @description
    #' Deserialize JSON string into an instance of UpdateOfferMappingsResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of UpdateOfferMappingsResponse
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`status`)) {
        `status_object` <- ApiResponseStatusType$new()
        `status_object`$fromJSON(jsonlite::toJSON(this_object$`status`, auto_unbox = TRUE, digits = NA))
        self$`status` <- `status_object`
      }
      if (!is.null(this_object$`results`)) {
        self$`results` <- ApiClient$new()$deserializeObj(this_object$`results`, "array[UpdateOfferMappingResultDTO]", loadNamespace("ympa_r_client"))
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return UpdateOfferMappingsResponse in JSON format
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
        if (!is.null(self$`results`)) {
          sprintf(
          '"results":
          [%s]
',
          paste(sapply(self$`results`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of UpdateOfferMappingsResponse
    #'
    #' @description
    #' Deserialize JSON string into an instance of UpdateOfferMappingsResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of UpdateOfferMappingsResponse
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`status` <- ApiResponseStatusType$new()$fromJSON(jsonlite::toJSON(this_object$`status`, auto_unbox = TRUE, digits = NA))
      self$`results` <- ApiClient$new()$deserializeObj(this_object$`results`, "array[UpdateOfferMappingResultDTO]", loadNamespace("ympa_r_client"))
      self
    },
    #' Validate JSON input with respect to UpdateOfferMappingsResponse
    #'
    #' @description
    #' Validate JSON input with respect to UpdateOfferMappingsResponse and throw an exception if invalid
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
    #' @return String representation of UpdateOfferMappingsResponse
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
# UpdateOfferMappingsResponse$unlock()
#
## Below is an example to define the print function
# UpdateOfferMappingsResponse$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# UpdateOfferMappingsResponse$lock()

