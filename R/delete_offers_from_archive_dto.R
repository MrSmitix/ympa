#' Create a new DeleteOffersFromArchiveDTO
#'
#' @description
#' Товары, которые не удалось восстановить из архива.
#'
#' @docType class
#' @title DeleteOffersFromArchiveDTO
#' @description DeleteOffersFromArchiveDTO Class
#' @format An \code{R6Class} generator object
#' @field notUnarchivedOfferIds Список товаров, которые не удалось восстановить из архива. list(character) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
DeleteOffersFromArchiveDTO <- R6::R6Class(
  "DeleteOffersFromArchiveDTO",
  public = list(
    `notUnarchivedOfferIds` = NULL,
    #' Initialize a new DeleteOffersFromArchiveDTO class.
    #'
    #' @description
    #' Initialize a new DeleteOffersFromArchiveDTO class.
    #'
    #' @param notUnarchivedOfferIds Список товаров, которые не удалось восстановить из архива.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`notUnarchivedOfferIds` = NULL, ...) {
      if (!is.null(`notUnarchivedOfferIds`)) {
        stopifnot(is.vector(`notUnarchivedOfferIds`), length(`notUnarchivedOfferIds`) != 0)
        sapply(`notUnarchivedOfferIds`, function(x) stopifnot(is.character(x)))
        self$`notUnarchivedOfferIds` <- `notUnarchivedOfferIds`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return DeleteOffersFromArchiveDTO in JSON format
    #' @export
    toJSON = function() {
      DeleteOffersFromArchiveDTOObject <- list()
      if (!is.null(self$`notUnarchivedOfferIds`)) {
        DeleteOffersFromArchiveDTOObject[["notUnarchivedOfferIds"]] <-
          self$`notUnarchivedOfferIds`
      }
      DeleteOffersFromArchiveDTOObject
    },
    #' Deserialize JSON string into an instance of DeleteOffersFromArchiveDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of DeleteOffersFromArchiveDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of DeleteOffersFromArchiveDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`notUnarchivedOfferIds`)) {
        self$`notUnarchivedOfferIds` <- ApiClient$new()$deserializeObj(this_object$`notUnarchivedOfferIds`, "array[character]", loadNamespace("ympa_r_client"))
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return DeleteOffersFromArchiveDTO in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`notUnarchivedOfferIds`)) {
          sprintf(
          '"notUnarchivedOfferIds":
             [%s]
          ',
          paste(unlist(lapply(self$`notUnarchivedOfferIds`, function(x) paste0('"', x, '"'))), collapse = ",")
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of DeleteOffersFromArchiveDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of DeleteOffersFromArchiveDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of DeleteOffersFromArchiveDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`notUnarchivedOfferIds` <- ApiClient$new()$deserializeObj(this_object$`notUnarchivedOfferIds`, "array[character]", loadNamespace("ympa_r_client"))
      self
    },
    #' Validate JSON input with respect to DeleteOffersFromArchiveDTO
    #'
    #' @description
    #' Validate JSON input with respect to DeleteOffersFromArchiveDTO and throw an exception if invalid
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
    #' @return String representation of DeleteOffersFromArchiveDTO
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
# DeleteOffersFromArchiveDTO$unlock()
#
## Below is an example to define the print function
# DeleteOffersFromArchiveDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# DeleteOffersFromArchiveDTO$lock()

