#' Create a new DeleteOffersDTO
#'
#' @description
#' Список товаров, которые не удалось удалить, потому что они хранятся на складе Маркета.
#'
#' @docType class
#' @title DeleteOffersDTO
#' @description DeleteOffersDTO Class
#' @format An \code{R6Class} generator object
#' @field notDeletedOfferIds Список SKU товаров, которые не удалось удалить. list(character) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
DeleteOffersDTO <- R6::R6Class(
  "DeleteOffersDTO",
  public = list(
    `notDeletedOfferIds` = NULL,
    #' Initialize a new DeleteOffersDTO class.
    #'
    #' @description
    #' Initialize a new DeleteOffersDTO class.
    #'
    #' @param notDeletedOfferIds Список SKU товаров, которые не удалось удалить.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`notDeletedOfferIds` = NULL, ...) {
      if (!is.null(`notDeletedOfferIds`)) {
        stopifnot(is.vector(`notDeletedOfferIds`), length(`notDeletedOfferIds`) != 0)
        sapply(`notDeletedOfferIds`, function(x) stopifnot(is.character(x)))
        self$`notDeletedOfferIds` <- `notDeletedOfferIds`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return DeleteOffersDTO in JSON format
    #' @export
    toJSON = function() {
      DeleteOffersDTOObject <- list()
      if (!is.null(self$`notDeletedOfferIds`)) {
        DeleteOffersDTOObject[["notDeletedOfferIds"]] <-
          self$`notDeletedOfferIds`
      }
      DeleteOffersDTOObject
    },
    #' Deserialize JSON string into an instance of DeleteOffersDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of DeleteOffersDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of DeleteOffersDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`notDeletedOfferIds`)) {
        self$`notDeletedOfferIds` <- ApiClient$new()$deserializeObj(this_object$`notDeletedOfferIds`, "array[character]", loadNamespace("ympa_r_client"))
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return DeleteOffersDTO in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`notDeletedOfferIds`)) {
          sprintf(
          '"notDeletedOfferIds":
             [%s]
          ',
          paste(unlist(lapply(self$`notDeletedOfferIds`, function(x) paste0('"', x, '"'))), collapse = ",")
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of DeleteOffersDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of DeleteOffersDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of DeleteOffersDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`notDeletedOfferIds` <- ApiClient$new()$deserializeObj(this_object$`notDeletedOfferIds`, "array[character]", loadNamespace("ympa_r_client"))
      self
    },
    #' Validate JSON input with respect to DeleteOffersDTO
    #'
    #' @description
    #' Validate JSON input with respect to DeleteOffersDTO and throw an exception if invalid
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
    #' @return String representation of DeleteOffersDTO
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
# DeleteOffersDTO$unlock()
#
## Below is an example to define the print function
# DeleteOffersDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# DeleteOffersDTO$lock()

