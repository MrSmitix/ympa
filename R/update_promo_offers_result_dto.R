#' Create a new UpdatePromoOffersResultDTO
#'
#' @description
#' Ошибки и предупреждения, которые появились при добавлении товаров в акцию.
#'
#' @docType class
#' @title UpdatePromoOffersResultDTO
#' @description UpdatePromoOffersResultDTO Class
#' @format An \code{R6Class} generator object
#' @field rejectedOffers Изменения, которые были отклонены.  Возвращается, только если есть отклоненные изменения. list(\link{RejectedPromoOfferUpdateDTO}) [optional]
#' @field warningOffers Изменения, по которым есть предупреждения. Они информируют о возможных проблемах. Информация о товарах обновится.  Возвращается, только если есть предупреждения. list(\link{WarningPromoOfferUpdateDTO}) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
UpdatePromoOffersResultDTO <- R6::R6Class(
  "UpdatePromoOffersResultDTO",
  public = list(
    `rejectedOffers` = NULL,
    `warningOffers` = NULL,
    #' Initialize a new UpdatePromoOffersResultDTO class.
    #'
    #' @description
    #' Initialize a new UpdatePromoOffersResultDTO class.
    #'
    #' @param rejectedOffers Изменения, которые были отклонены.  Возвращается, только если есть отклоненные изменения.
    #' @param warningOffers Изменения, по которым есть предупреждения. Они информируют о возможных проблемах. Информация о товарах обновится.  Возвращается, только если есть предупреждения.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`rejectedOffers` = NULL, `warningOffers` = NULL, ...) {
      if (!is.null(`rejectedOffers`)) {
        stopifnot(is.vector(`rejectedOffers`), length(`rejectedOffers`) != 0)
        sapply(`rejectedOffers`, function(x) stopifnot(R6::is.R6(x)))
        self$`rejectedOffers` <- `rejectedOffers`
      }
      if (!is.null(`warningOffers`)) {
        stopifnot(is.vector(`warningOffers`), length(`warningOffers`) != 0)
        sapply(`warningOffers`, function(x) stopifnot(R6::is.R6(x)))
        self$`warningOffers` <- `warningOffers`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return UpdatePromoOffersResultDTO in JSON format
    #' @export
    toJSON = function() {
      UpdatePromoOffersResultDTOObject <- list()
      if (!is.null(self$`rejectedOffers`)) {
        UpdatePromoOffersResultDTOObject[["rejectedOffers"]] <-
          lapply(self$`rejectedOffers`, function(x) x$toJSON())
      }
      if (!is.null(self$`warningOffers`)) {
        UpdatePromoOffersResultDTOObject[["warningOffers"]] <-
          lapply(self$`warningOffers`, function(x) x$toJSON())
      }
      UpdatePromoOffersResultDTOObject
    },
    #' Deserialize JSON string into an instance of UpdatePromoOffersResultDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of UpdatePromoOffersResultDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of UpdatePromoOffersResultDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`rejectedOffers`)) {
        self$`rejectedOffers` <- ApiClient$new()$deserializeObj(this_object$`rejectedOffers`, "array[RejectedPromoOfferUpdateDTO]", loadNamespace("ympa_r_client"))
      }
      if (!is.null(this_object$`warningOffers`)) {
        self$`warningOffers` <- ApiClient$new()$deserializeObj(this_object$`warningOffers`, "array[WarningPromoOfferUpdateDTO]", loadNamespace("ympa_r_client"))
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return UpdatePromoOffersResultDTO in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`rejectedOffers`)) {
          sprintf(
          '"rejectedOffers":
          [%s]
',
          paste(sapply(self$`rejectedOffers`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        },
        if (!is.null(self$`warningOffers`)) {
          sprintf(
          '"warningOffers":
          [%s]
',
          paste(sapply(self$`warningOffers`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of UpdatePromoOffersResultDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of UpdatePromoOffersResultDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of UpdatePromoOffersResultDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`rejectedOffers` <- ApiClient$new()$deserializeObj(this_object$`rejectedOffers`, "array[RejectedPromoOfferUpdateDTO]", loadNamespace("ympa_r_client"))
      self$`warningOffers` <- ApiClient$new()$deserializeObj(this_object$`warningOffers`, "array[WarningPromoOfferUpdateDTO]", loadNamespace("ympa_r_client"))
      self
    },
    #' Validate JSON input with respect to UpdatePromoOffersResultDTO
    #'
    #' @description
    #' Validate JSON input with respect to UpdatePromoOffersResultDTO and throw an exception if invalid
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
    #' @return String representation of UpdatePromoOffersResultDTO
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
# UpdatePromoOffersResultDTO$unlock()
#
## Below is an example to define the print function
# UpdatePromoOffersResultDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# UpdatePromoOffersResultDTO$lock()

