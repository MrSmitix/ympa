#' Create a new GetWarehouseStocksDTO
#'
#' @description
#' Список складов с информацией об остатках на каждом из них.
#'
#' @docType class
#' @title GetWarehouseStocksDTO
#' @description GetWarehouseStocksDTO Class
#' @format An \code{R6Class} generator object
#' @field paging  \link{ScrollingPagerDTO} [optional]
#' @field warehouses Страница списка складов. list(\link{WarehouseOffersDTO})
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
GetWarehouseStocksDTO <- R6::R6Class(
  "GetWarehouseStocksDTO",
  public = list(
    `paging` = NULL,
    `warehouses` = NULL,
    #' Initialize a new GetWarehouseStocksDTO class.
    #'
    #' @description
    #' Initialize a new GetWarehouseStocksDTO class.
    #'
    #' @param warehouses Страница списка складов.
    #' @param paging paging
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`warehouses`, `paging` = NULL, ...) {
      if (!missing(`warehouses`)) {
        stopifnot(is.vector(`warehouses`), length(`warehouses`) != 0)
        sapply(`warehouses`, function(x) stopifnot(R6::is.R6(x)))
        self$`warehouses` <- `warehouses`
      }
      if (!is.null(`paging`)) {
        stopifnot(R6::is.R6(`paging`))
        self$`paging` <- `paging`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return GetWarehouseStocksDTO in JSON format
    #' @export
    toJSON = function() {
      GetWarehouseStocksDTOObject <- list()
      if (!is.null(self$`paging`)) {
        GetWarehouseStocksDTOObject[["paging"]] <-
          self$`paging`$toJSON()
      }
      if (!is.null(self$`warehouses`)) {
        GetWarehouseStocksDTOObject[["warehouses"]] <-
          lapply(self$`warehouses`, function(x) x$toJSON())
      }
      GetWarehouseStocksDTOObject
    },
    #' Deserialize JSON string into an instance of GetWarehouseStocksDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of GetWarehouseStocksDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of GetWarehouseStocksDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`paging`)) {
        `paging_object` <- ScrollingPagerDTO$new()
        `paging_object`$fromJSON(jsonlite::toJSON(this_object$`paging`, auto_unbox = TRUE, digits = NA))
        self$`paging` <- `paging_object`
      }
      if (!is.null(this_object$`warehouses`)) {
        self$`warehouses` <- ApiClient$new()$deserializeObj(this_object$`warehouses`, "array[WarehouseOffersDTO]", loadNamespace("ympa_r_client"))
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return GetWarehouseStocksDTO in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`paging`)) {
          sprintf(
          '"paging":
          %s
          ',
          jsonlite::toJSON(self$`paging`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`warehouses`)) {
          sprintf(
          '"warehouses":
          [%s]
',
          paste(sapply(self$`warehouses`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of GetWarehouseStocksDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of GetWarehouseStocksDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of GetWarehouseStocksDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`paging` <- ScrollingPagerDTO$new()$fromJSON(jsonlite::toJSON(this_object$`paging`, auto_unbox = TRUE, digits = NA))
      self$`warehouses` <- ApiClient$new()$deserializeObj(this_object$`warehouses`, "array[WarehouseOffersDTO]", loadNamespace("ympa_r_client"))
      self
    },
    #' Validate JSON input with respect to GetWarehouseStocksDTO
    #'
    #' @description
    #' Validate JSON input with respect to GetWarehouseStocksDTO and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `warehouses`
      if (!is.null(input_json$`warehouses`)) {
        stopifnot(is.vector(input_json$`warehouses`), length(input_json$`warehouses`) != 0)
        tmp <- sapply(input_json$`warehouses`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for GetWarehouseStocksDTO: the required field `warehouses` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of GetWarehouseStocksDTO
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
      # check if the required `warehouses` is null
      if (is.null(self$`warehouses`)) {
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
      # check if the required `warehouses` is null
      if (is.null(self$`warehouses`)) {
        invalid_fields["warehouses"] <- "Non-nullable required field `warehouses` cannot be null."
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
# GetWarehouseStocksDTO$unlock()
#
## Below is an example to define the print function
# GetWarehouseStocksDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# GetWarehouseStocksDTO$lock()

