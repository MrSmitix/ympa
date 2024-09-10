#' Create a new PartnerShipmentWarehouseDTO
#'
#' @description
#' Данные о складе отправления.
#'
#' @docType class
#' @title PartnerShipmentWarehouseDTO
#' @description PartnerShipmentWarehouseDTO Class
#' @format An \code{R6Class} generator object
#' @field id Идентификатор склада отправления. integer [optional]
#' @field name Наименование склада отправления. character [optional]
#' @field address Адрес склада отправления. character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
PartnerShipmentWarehouseDTO <- R6::R6Class(
  "PartnerShipmentWarehouseDTO",
  public = list(
    `id` = NULL,
    `name` = NULL,
    `address` = NULL,
    #' Initialize a new PartnerShipmentWarehouseDTO class.
    #'
    #' @description
    #' Initialize a new PartnerShipmentWarehouseDTO class.
    #'
    #' @param id Идентификатор склада отправления.
    #' @param name Наименование склада отправления.
    #' @param address Адрес склада отправления.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`id` = NULL, `name` = NULL, `address` = NULL, ...) {
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
      if (!is.null(`address`)) {
        if (!(is.character(`address`) && length(`address`) == 1)) {
          stop(paste("Error! Invalid data for `address`. Must be a string:", `address`))
        }
        self$`address` <- `address`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return PartnerShipmentWarehouseDTO in JSON format
    #' @export
    toJSON = function() {
      PartnerShipmentWarehouseDTOObject <- list()
      if (!is.null(self$`id`)) {
        PartnerShipmentWarehouseDTOObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`name`)) {
        PartnerShipmentWarehouseDTOObject[["name"]] <-
          self$`name`
      }
      if (!is.null(self$`address`)) {
        PartnerShipmentWarehouseDTOObject[["address"]] <-
          self$`address`
      }
      PartnerShipmentWarehouseDTOObject
    },
    #' Deserialize JSON string into an instance of PartnerShipmentWarehouseDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of PartnerShipmentWarehouseDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of PartnerShipmentWarehouseDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`name`)) {
        self$`name` <- this_object$`name`
      }
      if (!is.null(this_object$`address`)) {
        self$`address` <- this_object$`address`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return PartnerShipmentWarehouseDTO in JSON format
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
        },
        if (!is.null(self$`address`)) {
          sprintf(
          '"address":
            "%s"
                    ',
          self$`address`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of PartnerShipmentWarehouseDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of PartnerShipmentWarehouseDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of PartnerShipmentWarehouseDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`id` <- this_object$`id`
      self$`name` <- this_object$`name`
      self$`address` <- this_object$`address`
      self
    },
    #' Validate JSON input with respect to PartnerShipmentWarehouseDTO
    #'
    #' @description
    #' Validate JSON input with respect to PartnerShipmentWarehouseDTO and throw an exception if invalid
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
    #' @return String representation of PartnerShipmentWarehouseDTO
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
# PartnerShipmentWarehouseDTO$unlock()
#
## Below is an example to define the print function
# PartnerShipmentWarehouseDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# PartnerShipmentWarehouseDTO$lock()

