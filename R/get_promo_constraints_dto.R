#' Create a new GetPromoConstraintsDTO
#'
#' @description
#' Ограничения в акции.
#'
#' @docType class
#' @title GetPromoConstraintsDTO
#' @description GetPromoConstraintsDTO Class
#' @format An \code{R6Class} generator object
#' @field warehouseIds Идентификаторы складов, для которых действует акция. Товары, которые лежат на других складах, не будут продаваться по акции.  Параметр возвращается, только если в условиях акции есть ограничение по складу. list(integer) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
GetPromoConstraintsDTO <- R6::R6Class(
  "GetPromoConstraintsDTO",
  public = list(
    `warehouseIds` = NULL,
    #' Initialize a new GetPromoConstraintsDTO class.
    #'
    #' @description
    #' Initialize a new GetPromoConstraintsDTO class.
    #'
    #' @param warehouseIds Идентификаторы складов, для которых действует акция. Товары, которые лежат на других складах, не будут продаваться по акции.  Параметр возвращается, только если в условиях акции есть ограничение по складу.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`warehouseIds` = NULL, ...) {
      if (!is.null(`warehouseIds`)) {
        stopifnot(is.vector(`warehouseIds`), length(`warehouseIds`) != 0)
        sapply(`warehouseIds`, function(x) stopifnot(is.character(x)))
        self$`warehouseIds` <- `warehouseIds`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return GetPromoConstraintsDTO in JSON format
    #' @export
    toJSON = function() {
      GetPromoConstraintsDTOObject <- list()
      if (!is.null(self$`warehouseIds`)) {
        GetPromoConstraintsDTOObject[["warehouseIds"]] <-
          self$`warehouseIds`
      }
      GetPromoConstraintsDTOObject
    },
    #' Deserialize JSON string into an instance of GetPromoConstraintsDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of GetPromoConstraintsDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of GetPromoConstraintsDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`warehouseIds`)) {
        self$`warehouseIds` <- ApiClient$new()$deserializeObj(this_object$`warehouseIds`, "array[integer]", loadNamespace("ympa_r_client"))
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return GetPromoConstraintsDTO in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`warehouseIds`)) {
          sprintf(
          '"warehouseIds":
             [%s]
          ',
          paste(unlist(lapply(self$`warehouseIds`, function(x) paste0('"', x, '"'))), collapse = ",")
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of GetPromoConstraintsDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of GetPromoConstraintsDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of GetPromoConstraintsDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`warehouseIds` <- ApiClient$new()$deserializeObj(this_object$`warehouseIds`, "array[integer]", loadNamespace("ympa_r_client"))
      self
    },
    #' Validate JSON input with respect to GetPromoConstraintsDTO
    #'
    #' @description
    #' Validate JSON input with respect to GetPromoConstraintsDTO and throw an exception if invalid
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
    #' @return String representation of GetPromoConstraintsDTO
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
# GetPromoConstraintsDTO$unlock()
#
## Below is an example to define the print function
# GetPromoConstraintsDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# GetPromoConstraintsDTO$lock()

