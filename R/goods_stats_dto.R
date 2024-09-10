#' Create a new GoodsStatsDTO
#'
#' @description
#' Отчет по товарам.
#'
#' @docType class
#' @title GoodsStatsDTO
#' @description GoodsStatsDTO Class
#' @format An \code{R6Class} generator object
#' @field shopSkus Список товаров. list(\link{GoodsStatsGoodsDTO})
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
GoodsStatsDTO <- R6::R6Class(
  "GoodsStatsDTO",
  public = list(
    `shopSkus` = NULL,
    #' Initialize a new GoodsStatsDTO class.
    #'
    #' @description
    #' Initialize a new GoodsStatsDTO class.
    #'
    #' @param shopSkus Список товаров.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`shopSkus`, ...) {
      if (!missing(`shopSkus`)) {
        stopifnot(is.vector(`shopSkus`), length(`shopSkus`) != 0)
        sapply(`shopSkus`, function(x) stopifnot(R6::is.R6(x)))
        self$`shopSkus` <- `shopSkus`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return GoodsStatsDTO in JSON format
    #' @export
    toJSON = function() {
      GoodsStatsDTOObject <- list()
      if (!is.null(self$`shopSkus`)) {
        GoodsStatsDTOObject[["shopSkus"]] <-
          lapply(self$`shopSkus`, function(x) x$toJSON())
      }
      GoodsStatsDTOObject
    },
    #' Deserialize JSON string into an instance of GoodsStatsDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of GoodsStatsDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of GoodsStatsDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`shopSkus`)) {
        self$`shopSkus` <- ApiClient$new()$deserializeObj(this_object$`shopSkus`, "array[GoodsStatsGoodsDTO]", loadNamespace("ympa_r_client"))
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return GoodsStatsDTO in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`shopSkus`)) {
          sprintf(
          '"shopSkus":
          [%s]
',
          paste(sapply(self$`shopSkus`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of GoodsStatsDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of GoodsStatsDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of GoodsStatsDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`shopSkus` <- ApiClient$new()$deserializeObj(this_object$`shopSkus`, "array[GoodsStatsGoodsDTO]", loadNamespace("ympa_r_client"))
      self
    },
    #' Validate JSON input with respect to GoodsStatsDTO
    #'
    #' @description
    #' Validate JSON input with respect to GoodsStatsDTO and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `shopSkus`
      if (!is.null(input_json$`shopSkus`)) {
        stopifnot(is.vector(input_json$`shopSkus`), length(input_json$`shopSkus`) != 0)
        tmp <- sapply(input_json$`shopSkus`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for GoodsStatsDTO: the required field `shopSkus` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of GoodsStatsDTO
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
# GoodsStatsDTO$unlock()
#
## Below is an example to define the print function
# GoodsStatsDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# GoodsStatsDTO$lock()

