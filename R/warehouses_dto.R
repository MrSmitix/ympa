#' Create a new WarehousesDTO
#'
#' @description
#' Информация о складах и группах складов.
#'
#' @docType class
#' @title WarehousesDTO
#' @description WarehousesDTO Class
#' @format An \code{R6Class} generator object
#' @field warehouses Список складов, не входящих в группы. list(\link{WarehouseDTO})
#' @field warehouseGroups Список групп складов. list(\link{WarehouseGroupDTO})
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
WarehousesDTO <- R6::R6Class(
  "WarehousesDTO",
  public = list(
    `warehouses` = NULL,
    `warehouseGroups` = NULL,
    #' Initialize a new WarehousesDTO class.
    #'
    #' @description
    #' Initialize a new WarehousesDTO class.
    #'
    #' @param warehouses Список складов, не входящих в группы.
    #' @param warehouseGroups Список групп складов.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`warehouses`, `warehouseGroups`, ...) {
      if (!missing(`warehouses`)) {
        stopifnot(is.vector(`warehouses`), length(`warehouses`) != 0)
        sapply(`warehouses`, function(x) stopifnot(R6::is.R6(x)))
        self$`warehouses` <- `warehouses`
      }
      if (!missing(`warehouseGroups`)) {
        stopifnot(is.vector(`warehouseGroups`), length(`warehouseGroups`) != 0)
        sapply(`warehouseGroups`, function(x) stopifnot(R6::is.R6(x)))
        self$`warehouseGroups` <- `warehouseGroups`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return WarehousesDTO in JSON format
    #' @export
    toJSON = function() {
      WarehousesDTOObject <- list()
      if (!is.null(self$`warehouses`)) {
        WarehousesDTOObject[["warehouses"]] <-
          lapply(self$`warehouses`, function(x) x$toJSON())
      }
      if (!is.null(self$`warehouseGroups`)) {
        WarehousesDTOObject[["warehouseGroups"]] <-
          lapply(self$`warehouseGroups`, function(x) x$toJSON())
      }
      WarehousesDTOObject
    },
    #' Deserialize JSON string into an instance of WarehousesDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of WarehousesDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of WarehousesDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`warehouses`)) {
        self$`warehouses` <- ApiClient$new()$deserializeObj(this_object$`warehouses`, "array[WarehouseDTO]", loadNamespace("ympa_r_client"))
      }
      if (!is.null(this_object$`warehouseGroups`)) {
        self$`warehouseGroups` <- ApiClient$new()$deserializeObj(this_object$`warehouseGroups`, "array[WarehouseGroupDTO]", loadNamespace("ympa_r_client"))
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return WarehousesDTO in JSON format
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
        },
        if (!is.null(self$`warehouseGroups`)) {
          sprintf(
          '"warehouseGroups":
          [%s]
',
          paste(sapply(self$`warehouseGroups`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of WarehousesDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of WarehousesDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of WarehousesDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`warehouses` <- ApiClient$new()$deserializeObj(this_object$`warehouses`, "array[WarehouseDTO]", loadNamespace("ympa_r_client"))
      self$`warehouseGroups` <- ApiClient$new()$deserializeObj(this_object$`warehouseGroups`, "array[WarehouseGroupDTO]", loadNamespace("ympa_r_client"))
      self
    },
    #' Validate JSON input with respect to WarehousesDTO
    #'
    #' @description
    #' Validate JSON input with respect to WarehousesDTO and throw an exception if invalid
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
        stop(paste("The JSON input `", input, "` is invalid for WarehousesDTO: the required field `warehouses` is missing."))
      }
      # check the required field `warehouseGroups`
      if (!is.null(input_json$`warehouseGroups`)) {
        stopifnot(is.vector(input_json$`warehouseGroups`), length(input_json$`warehouseGroups`) != 0)
        tmp <- sapply(input_json$`warehouseGroups`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for WarehousesDTO: the required field `warehouseGroups` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of WarehousesDTO
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

      # check if the required `warehouseGroups` is null
      if (is.null(self$`warehouseGroups`)) {
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

      # check if the required `warehouseGroups` is null
      if (is.null(self$`warehouseGroups`)) {
        invalid_fields["warehouseGroups"] <- "Non-nullable required field `warehouseGroups` cannot be null."
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
# WarehousesDTO$unlock()
#
## Below is an example to define the print function
# WarehousesDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# WarehousesDTO$lock()

