#' Create a new AddOffersToArchiveDTO
#'
#' @description
#' Товары, которые не удалось поместить в архив.
#'
#' @docType class
#' @title AddOffersToArchiveDTO
#' @description AddOffersToArchiveDTO Class
#' @format An \code{R6Class} generator object
#' @field notArchivedOffers Список товаров, которые не удалось поместить в архив. list(\link{AddOffersToArchiveErrorDTO}) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
AddOffersToArchiveDTO <- R6::R6Class(
  "AddOffersToArchiveDTO",
  public = list(
    `notArchivedOffers` = NULL,
    #' Initialize a new AddOffersToArchiveDTO class.
    #'
    #' @description
    #' Initialize a new AddOffersToArchiveDTO class.
    #'
    #' @param notArchivedOffers Список товаров, которые не удалось поместить в архив.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`notArchivedOffers` = NULL, ...) {
      if (!is.null(`notArchivedOffers`)) {
        stopifnot(is.vector(`notArchivedOffers`), length(`notArchivedOffers`) != 0)
        sapply(`notArchivedOffers`, function(x) stopifnot(R6::is.R6(x)))
        self$`notArchivedOffers` <- `notArchivedOffers`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return AddOffersToArchiveDTO in JSON format
    #' @export
    toJSON = function() {
      AddOffersToArchiveDTOObject <- list()
      if (!is.null(self$`notArchivedOffers`)) {
        AddOffersToArchiveDTOObject[["notArchivedOffers"]] <-
          lapply(self$`notArchivedOffers`, function(x) x$toJSON())
      }
      AddOffersToArchiveDTOObject
    },
    #' Deserialize JSON string into an instance of AddOffersToArchiveDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of AddOffersToArchiveDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of AddOffersToArchiveDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`notArchivedOffers`)) {
        self$`notArchivedOffers` <- ApiClient$new()$deserializeObj(this_object$`notArchivedOffers`, "array[AddOffersToArchiveErrorDTO]", loadNamespace("ympa_r_client"))
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return AddOffersToArchiveDTO in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`notArchivedOffers`)) {
          sprintf(
          '"notArchivedOffers":
          [%s]
',
          paste(sapply(self$`notArchivedOffers`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of AddOffersToArchiveDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of AddOffersToArchiveDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of AddOffersToArchiveDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`notArchivedOffers` <- ApiClient$new()$deserializeObj(this_object$`notArchivedOffers`, "array[AddOffersToArchiveErrorDTO]", loadNamespace("ympa_r_client"))
      self
    },
    #' Validate JSON input with respect to AddOffersToArchiveDTO
    #'
    #' @description
    #' Validate JSON input with respect to AddOffersToArchiveDTO and throw an exception if invalid
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
    #' @return String representation of AddOffersToArchiveDTO
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
# AddOffersToArchiveDTO$unlock()
#
## Below is an example to define the print function
# AddOffersToArchiveDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# AddOffersToArchiveDTO$lock()

