#' Create a new OrdersStatsWarehouseDTO
#'
#' @description
#' Информация о складе, на котором хранится товар.
#'
#' @docType class
#' @title OrdersStatsWarehouseDTO
#' @description OrdersStatsWarehouseDTO Class
#' @format An \code{R6Class} generator object
#' @field id Идентификатор склада. integer [optional]
#' @field name Название склада. character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
OrdersStatsWarehouseDTO <- R6::R6Class(
  "OrdersStatsWarehouseDTO",
  public = list(
    `id` = NULL,
    `name` = NULL,
    #' Initialize a new OrdersStatsWarehouseDTO class.
    #'
    #' @description
    #' Initialize a new OrdersStatsWarehouseDTO class.
    #'
    #' @param id Идентификатор склада.
    #' @param name Название склада.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`id` = NULL, `name` = NULL, ...) {
      if (!is.null(`id`)) {
        if (!(is.numeric(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be an integer:", `id`))
        }
        self$`id` <- `id`
      }
      if (!is.null(`name`)) {
        if (!(is.character(`name`) && length(`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", `name`))
        }
        self$`name` <- `name`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return OrdersStatsWarehouseDTO in JSON format
    #' @export
    toJSON = function() {
      OrdersStatsWarehouseDTOObject <- list()
      if (!is.null(self$`id`)) {
        OrdersStatsWarehouseDTOObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`name`)) {
        OrdersStatsWarehouseDTOObject[["name"]] <-
          self$`name`
      }
      OrdersStatsWarehouseDTOObject
    },
    #' Deserialize JSON string into an instance of OrdersStatsWarehouseDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of OrdersStatsWarehouseDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of OrdersStatsWarehouseDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`name`)) {
        self$`name` <- this_object$`name`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return OrdersStatsWarehouseDTO in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`id`)) {
          sprintf(
          '"id":
            %d
                    ',
          self$`id`
          )
        },
        if (!is.null(self$`name`)) {
          sprintf(
          '"name":
            "%s"
                    ',
          self$`name`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of OrdersStatsWarehouseDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of OrdersStatsWarehouseDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of OrdersStatsWarehouseDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`id` <- this_object$`id`
      self$`name` <- this_object$`name`
      self
    },
    #' Validate JSON input with respect to OrdersStatsWarehouseDTO
    #'
    #' @description
    #' Validate JSON input with respect to OrdersStatsWarehouseDTO and throw an exception if invalid
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
    #' @return String representation of OrdersStatsWarehouseDTO
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
# OrdersStatsWarehouseDTO$unlock()
#
## Below is an example to define the print function
# OrdersStatsWarehouseDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# OrdersStatsWarehouseDTO$lock()

