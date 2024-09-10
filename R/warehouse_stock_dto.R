#' Create a new WarehouseStockDTO
#'
#' @description
#' Информация об остатках товара.
#'
#' @docType class
#' @title WarehouseStockDTO
#' @description WarehouseStockDTO Class
#' @format An \code{R6Class} generator object
#' @field type  \link{WarehouseStockType}
#' @field count Значение остатков. integer
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
WarehouseStockDTO <- R6::R6Class(
  "WarehouseStockDTO",
  public = list(
    `type` = NULL,
    `count` = NULL,
    #' Initialize a new WarehouseStockDTO class.
    #'
    #' @description
    #' Initialize a new WarehouseStockDTO class.
    #'
    #' @param type type
    #' @param count Значение остатков.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`type`, `count`, ...) {
      if (!missing(`type`)) {
        if (!(`type` %in% c())) {
          stop(paste("Error! \"", `type`, "\" cannot be assigned to `type`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`type`))
        self$`type` <- `type`
      }
      if (!missing(`count`)) {
        if (!(is.numeric(`count`) && length(`count`) == 1)) {
          stop(paste("Error! Invalid data for `count`. Must be an integer:", `count`))
        }
        self$`count` <- `count`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return WarehouseStockDTO in JSON format
    #' @export
    toJSON = function() {
      WarehouseStockDTOObject <- list()
      if (!is.null(self$`type`)) {
        WarehouseStockDTOObject[["type"]] <-
          self$`type`$toJSON()
      }
      if (!is.null(self$`count`)) {
        WarehouseStockDTOObject[["count"]] <-
          self$`count`
      }
      WarehouseStockDTOObject
    },
    #' Deserialize JSON string into an instance of WarehouseStockDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of WarehouseStockDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of WarehouseStockDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`type`)) {
        `type_object` <- WarehouseStockType$new()
        `type_object`$fromJSON(jsonlite::toJSON(this_object$`type`, auto_unbox = TRUE, digits = NA))
        self$`type` <- `type_object`
      }
      if (!is.null(this_object$`count`)) {
        self$`count` <- this_object$`count`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return WarehouseStockDTO in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`type`)) {
          sprintf(
          '"type":
          %s
          ',
          jsonlite::toJSON(self$`type`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`count`)) {
          sprintf(
          '"count":
            %d
                    ',
          self$`count`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of WarehouseStockDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of WarehouseStockDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of WarehouseStockDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`type` <- WarehouseStockType$new()$fromJSON(jsonlite::toJSON(this_object$`type`, auto_unbox = TRUE, digits = NA))
      self$`count` <- this_object$`count`
      self
    },
    #' Validate JSON input with respect to WarehouseStockDTO
    #'
    #' @description
    #' Validate JSON input with respect to WarehouseStockDTO and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `type`
      if (!is.null(input_json$`type`)) {
        stopifnot(R6::is.R6(input_json$`type`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for WarehouseStockDTO: the required field `type` is missing."))
      }
      # check the required field `count`
      if (!is.null(input_json$`count`)) {
        if (!(is.numeric(input_json$`count`) && length(input_json$`count`) == 1)) {
          stop(paste("Error! Invalid data for `count`. Must be an integer:", input_json$`count`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for WarehouseStockDTO: the required field `count` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of WarehouseStockDTO
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
      # check if the required `type` is null
      if (is.null(self$`type`)) {
        return(FALSE)
      }

      # check if the required `count` is null
      if (is.null(self$`count`)) {
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
      # check if the required `type` is null
      if (is.null(self$`type`)) {
        invalid_fields["type"] <- "Non-nullable required field `type` cannot be null."
      }

      # check if the required `count` is null
      if (is.null(self$`count`)) {
        invalid_fields["count"] <- "Non-nullable required field `count` cannot be null."
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
# WarehouseStockDTO$unlock()
#
## Below is an example to define the print function
# WarehouseStockDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# WarehouseStockDTO$lock()

