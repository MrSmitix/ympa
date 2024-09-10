#' Create a new DeletePromoOffersResultDTO
#'
#' @description
#' Результат удаления товаров из акции.  Возвращается, только если в запросе был передан параметр `offerIds`. 
#'
#' @docType class
#' @title DeletePromoOffersResultDTO
#' @description DeletePromoOffersResultDTO Class
#' @format An \code{R6Class} generator object
#' @field rejectedOffers Товары, при удалении которых появились ошибки.  Возвращается, только если есть такие товары. list(\link{RejectedPromoOfferDeleteDTO}) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
DeletePromoOffersResultDTO <- R6::R6Class(
  "DeletePromoOffersResultDTO",
  public = list(
    `rejectedOffers` = NULL,
    #' Initialize a new DeletePromoOffersResultDTO class.
    #'
    #' @description
    #' Initialize a new DeletePromoOffersResultDTO class.
    #'
    #' @param rejectedOffers Товары, при удалении которых появились ошибки.  Возвращается, только если есть такие товары.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`rejectedOffers` = NULL, ...) {
      if (!is.null(`rejectedOffers`)) {
        stopifnot(is.vector(`rejectedOffers`), length(`rejectedOffers`) != 0)
        sapply(`rejectedOffers`, function(x) stopifnot(R6::is.R6(x)))
        self$`rejectedOffers` <- `rejectedOffers`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return DeletePromoOffersResultDTO in JSON format
    #' @export
    toJSON = function() {
      DeletePromoOffersResultDTOObject <- list()
      if (!is.null(self$`rejectedOffers`)) {
        DeletePromoOffersResultDTOObject[["rejectedOffers"]] <-
          lapply(self$`rejectedOffers`, function(x) x$toJSON())
      }
      DeletePromoOffersResultDTOObject
    },
    #' Deserialize JSON string into an instance of DeletePromoOffersResultDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of DeletePromoOffersResultDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of DeletePromoOffersResultDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`rejectedOffers`)) {
        self$`rejectedOffers` <- ApiClient$new()$deserializeObj(this_object$`rejectedOffers`, "array[RejectedPromoOfferDeleteDTO]", loadNamespace("ympa_r_client"))
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return DeletePromoOffersResultDTO in JSON format
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
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of DeletePromoOffersResultDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of DeletePromoOffersResultDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of DeletePromoOffersResultDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`rejectedOffers` <- ApiClient$new()$deserializeObj(this_object$`rejectedOffers`, "array[RejectedPromoOfferDeleteDTO]", loadNamespace("ympa_r_client"))
      self
    },
    #' Validate JSON input with respect to DeletePromoOffersResultDTO
    #'
    #' @description
    #' Validate JSON input with respect to DeletePromoOffersResultDTO and throw an exception if invalid
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
    #' @return String representation of DeletePromoOffersResultDTO
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
# DeletePromoOffersResultDTO$unlock()
#
## Below is an example to define the print function
# DeletePromoOffersResultDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# DeletePromoOffersResultDTO$lock()

