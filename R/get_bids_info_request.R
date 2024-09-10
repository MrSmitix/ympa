#' Create a new GetBidsInfoRequest
#'
#' @description
#' description.
#'
#' @docType class
#' @title GetBidsInfoRequest
#' @description GetBidsInfoRequest Class
#' @format An \code{R6Class} generator object
#' @field skus Список товаров, для которых нужно получить значения ставок.  Если список не задан, постранично возвращаются все товары со ставками.  Если список задан, результаты возвращаются одной страницей, а параметры `page_token` и `limit` игнорируются. list(character) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
GetBidsInfoRequest <- R6::R6Class(
  "GetBidsInfoRequest",
  public = list(
    `skus` = NULL,
    #' Initialize a new GetBidsInfoRequest class.
    #'
    #' @description
    #' Initialize a new GetBidsInfoRequest class.
    #'
    #' @param skus Список товаров, для которых нужно получить значения ставок.  Если список не задан, постранично возвращаются все товары со ставками.  Если список задан, результаты возвращаются одной страницей, а параметры `page_token` и `limit` игнорируются.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`skus` = NULL, ...) {
      if (!is.null(`skus`)) {
        stopifnot(is.vector(`skus`), length(`skus`) != 0)
        sapply(`skus`, function(x) stopifnot(is.character(x)))
        self$`skus` <- `skus`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return GetBidsInfoRequest in JSON format
    #' @export
    toJSON = function() {
      GetBidsInfoRequestObject <- list()
      if (!is.null(self$`skus`)) {
        GetBidsInfoRequestObject[["skus"]] <-
          self$`skus`
      }
      GetBidsInfoRequestObject
    },
    #' Deserialize JSON string into an instance of GetBidsInfoRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of GetBidsInfoRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of GetBidsInfoRequest
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`skus`)) {
        self$`skus` <- ApiClient$new()$deserializeObj(this_object$`skus`, "array[character]", loadNamespace("ympa_r_client"))
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return GetBidsInfoRequest in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`skus`)) {
          sprintf(
          '"skus":
             [%s]
          ',
          paste(unlist(lapply(self$`skus`, function(x) paste0('"', x, '"'))), collapse = ",")
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of GetBidsInfoRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of GetBidsInfoRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of GetBidsInfoRequest
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`skus` <- ApiClient$new()$deserializeObj(this_object$`skus`, "array[character]", loadNamespace("ympa_r_client"))
      self
    },
    #' Validate JSON input with respect to GetBidsInfoRequest
    #'
    #' @description
    #' Validate JSON input with respect to GetBidsInfoRequest and throw an exception if invalid
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
    #' @return String representation of GetBidsInfoRequest
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
      if (length(self$`skus`) > 1500) {
        return(FALSE)
      }
      if (length(self$`skus`) < 1) {
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
      if (length(self$`skus`) > 1500) {
        invalid_fields["skus"] <- "Invalid length for `skus`, number of items must be less than or equal to 1500."
      }
      if (length(self$`skus`) < 1) {
        invalid_fields["skus"] <- "Invalid length for ``, number of items must be greater than or equal to 1."
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
# GetBidsInfoRequest$unlock()
#
## Below is an example to define the print function
# GetBidsInfoRequest$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# GetBidsInfoRequest$lock()

