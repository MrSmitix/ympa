#' Create a new GetGoodsStatsRequest
#'
#' @description
#' Запрос отчета по товарам.
#'
#' @docType class
#' @title GetGoodsStatsRequest
#' @description GetGoodsStatsRequest Class
#' @format An \code{R6Class} generator object
#' @field shopSkus Список ваших идентификаторов SKU. list(character)
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
GetGoodsStatsRequest <- R6::R6Class(
  "GetGoodsStatsRequest",
  public = list(
    `shopSkus` = NULL,
    #' Initialize a new GetGoodsStatsRequest class.
    #'
    #' @description
    #' Initialize a new GetGoodsStatsRequest class.
    #'
    #' @param shopSkus Список ваших идентификаторов SKU.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`shopSkus`, ...) {
      if (!missing(`shopSkus`)) {
        stopifnot(is.vector(`shopSkus`), length(`shopSkus`) != 0)
        sapply(`shopSkus`, function(x) stopifnot(is.character(x)))
        if (!identical(`shopSkus`, unique(`shopSkus`))) {
          stop("Error! Items in `shopSkus` are not unique.")
        }
        self$`shopSkus` <- `shopSkus`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return GetGoodsStatsRequest in JSON format
    #' @export
    toJSON = function() {
      GetGoodsStatsRequestObject <- list()
      if (!is.null(self$`shopSkus`)) {
        GetGoodsStatsRequestObject[["shopSkus"]] <-
          self$`shopSkus`
      }
      GetGoodsStatsRequestObject
    },
    #' Deserialize JSON string into an instance of GetGoodsStatsRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of GetGoodsStatsRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of GetGoodsStatsRequest
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`shopSkus`)) {
        self$`shopSkus` <- ApiClient$new()$deserializeObj(this_object$`shopSkus`, "set[character]", loadNamespace("ympa_r_client"))
        if (!identical(self$`shopSkus`, unique(self$`shopSkus`))) {
          stop("Error! Items in `shopSkus` are not unique.")
        }
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return GetGoodsStatsRequest in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`shopSkus`)) {
          sprintf(
          '"shopSkus":
             [%s]
          ',
          paste(unlist(lapply(self$`shopSkus`, function(x) paste0('"', x, '"'))), collapse = ",")
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of GetGoodsStatsRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of GetGoodsStatsRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of GetGoodsStatsRequest
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`shopSkus` <- ApiClient$new()$deserializeObj(this_object$`shopSkus`, "set[character]", loadNamespace("ympa_r_client"))
      if (!identical(self$`shopSkus`, unique(self$`shopSkus`))) {
        stop("Error! Items in `shopSkus` are not unique.")
      }
      self
    },
    #' Validate JSON input with respect to GetGoodsStatsRequest
    #'
    #' @description
    #' Validate JSON input with respect to GetGoodsStatsRequest and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `shopSkus`
      if (!is.null(input_json$`shopSkus`)) {
        stopifnot(is.vector(input_json$`shopSkus`), length(input_json$`shopSkus`) != 0)
        if (!identical(input_json$`shopSkus`, unique(input_json$`shopSkus`))) {
          stop("Error! Items in `shopSkus` are not unique.")
        }
        tmp <- sapply(input_json$`shopSkus`, function(x) stopifnot(is.character(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for GetGoodsStatsRequest: the required field `shopSkus` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of GetGoodsStatsRequest
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
      # check if the required `shopSkus` is null
      if (is.null(self$`shopSkus`)) {
        return(FALSE)
      }

      if (length(self$`shopSkus`) > 500) {
        return(FALSE)
      }
      if (length(self$`shopSkus`) < 1) {
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
      # check if the required `shopSkus` is null
      if (is.null(self$`shopSkus`)) {
        invalid_fields["shopSkus"] <- "Non-nullable required field `shopSkus` cannot be null."
      }

      if (length(self$`shopSkus`) > 500) {
        invalid_fields["shopSkus"] <- "Invalid length for `shopSkus`, number of items must be less than or equal to 500."
      }
      if (length(self$`shopSkus`) < 1) {
        invalid_fields["shopSkus"] <- "Invalid length for ``, number of items must be greater than or equal to 1."
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
# GetGoodsStatsRequest$unlock()
#
## Below is an example to define the print function
# GetGoodsStatsRequest$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# GetGoodsStatsRequest$lock()

