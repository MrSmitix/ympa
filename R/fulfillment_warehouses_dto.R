#' Create a new FulfillmentWarehousesDTO
#'
#' @description
#' Список складов Маркета (FBY).
#'
#' @docType class
#' @title FulfillmentWarehousesDTO
#' @description FulfillmentWarehousesDTO Class
#' @format An \code{R6Class} generator object
#' @field warehouses Список складов Маркета (FBY). list(\link{FulfillmentWarehouseDTO})
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
FulfillmentWarehousesDTO <- R6::R6Class(
  "FulfillmentWarehousesDTO",
  public = list(
    `warehouses` = NULL,
    #' Initialize a new FulfillmentWarehousesDTO class.
    #'
    #' @description
    #' Initialize a new FulfillmentWarehousesDTO class.
    #'
    #' @param warehouses Список складов Маркета (FBY).
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`warehouses`, ...) {
      if (!missing(`warehouses`)) {
        stopifnot(is.vector(`warehouses`), length(`warehouses`) != 0)
        sapply(`warehouses`, function(x) stopifnot(R6::is.R6(x)))
        self$`warehouses` <- `warehouses`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return FulfillmentWarehousesDTO in JSON format
    #' @export
    toJSON = function() {
      FulfillmentWarehousesDTOObject <- list()
      if (!is.null(self$`warehouses`)) {
        FulfillmentWarehousesDTOObject[["warehouses"]] <-
          lapply(self$`warehouses`, function(x) x$toJSON())
      }
      FulfillmentWarehousesDTOObject
    },
    #' Deserialize JSON string into an instance of FulfillmentWarehousesDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of FulfillmentWarehousesDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of FulfillmentWarehousesDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`warehouses`)) {
        self$`warehouses` <- ApiClient$new()$deserializeObj(this_object$`warehouses`, "array[FulfillmentWarehouseDTO]", loadNamespace("ympa_r_client"))
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return FulfillmentWarehousesDTO in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
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
    #' Deserialize JSON string into an instance of FulfillmentWarehousesDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of FulfillmentWarehousesDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of FulfillmentWarehousesDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`warehouses` <- ApiClient$new()$deserializeObj(this_object$`warehouses`, "array[FulfillmentWarehouseDTO]", loadNamespace("ympa_r_client"))
      self
    },
    #' Validate JSON input with respect to FulfillmentWarehousesDTO
    #'
    #' @description
    #' Validate JSON input with respect to FulfillmentWarehousesDTO and throw an exception if invalid
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
        stop(paste("The JSON input `", input, "` is invalid for FulfillmentWarehousesDTO: the required field `warehouses` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of FulfillmentWarehousesDTO
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
# FulfillmentWarehousesDTO$unlock()
#
## Below is an example to define the print function
# FulfillmentWarehousesDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# FulfillmentWarehousesDTO$lock()

