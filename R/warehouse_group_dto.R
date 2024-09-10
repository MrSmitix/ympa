#' Create a new WarehouseGroupDTO
#'
#' @description
#' Информация о группе складов.
#'
#' @docType class
#' @title WarehouseGroupDTO
#' @description WarehouseGroupDTO Class
#' @format An \code{R6Class} generator object
#' @field name Название группы складов. character
#' @field mainWarehouse  \link{WarehouseDTO}
#' @field warehouses Список складов, входящих в группу. list(\link{WarehouseDTO})
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
WarehouseGroupDTO <- R6::R6Class(
  "WarehouseGroupDTO",
  public = list(
    `name` = NULL,
    `mainWarehouse` = NULL,
    `warehouses` = NULL,
    #' Initialize a new WarehouseGroupDTO class.
    #'
    #' @description
    #' Initialize a new WarehouseGroupDTO class.
    #'
    #' @param name Название группы складов.
    #' @param mainWarehouse mainWarehouse
    #' @param warehouses Список складов, входящих в группу.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`name`, `mainWarehouse`, `warehouses`, ...) {
      if (!missing(`name`)) {
        if (!(is.character(`name`) && length(`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", `name`))
        }
        self$`name` <- `name`
      }
      if (!missing(`mainWarehouse`)) {
        stopifnot(R6::is.R6(`mainWarehouse`))
        self$`mainWarehouse` <- `mainWarehouse`
      }
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
    #' @return WarehouseGroupDTO in JSON format
    #' @export
    toJSON = function() {
      WarehouseGroupDTOObject <- list()
      if (!is.null(self$`name`)) {
        WarehouseGroupDTOObject[["name"]] <-
          self$`name`
      }
      if (!is.null(self$`mainWarehouse`)) {
        WarehouseGroupDTOObject[["mainWarehouse"]] <-
          self$`mainWarehouse`$toJSON()
      }
      if (!is.null(self$`warehouses`)) {
        WarehouseGroupDTOObject[["warehouses"]] <-
          lapply(self$`warehouses`, function(x) x$toJSON())
      }
      WarehouseGroupDTOObject
    },
    #' Deserialize JSON string into an instance of WarehouseGroupDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of WarehouseGroupDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of WarehouseGroupDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`name`)) {
        self$`name` <- this_object$`name`
      }
      if (!is.null(this_object$`mainWarehouse`)) {
        `mainwarehouse_object` <- WarehouseDTO$new()
        `mainwarehouse_object`$fromJSON(jsonlite::toJSON(this_object$`mainWarehouse`, auto_unbox = TRUE, digits = NA))
        self$`mainWarehouse` <- `mainwarehouse_object`
      }
      if (!is.null(this_object$`warehouses`)) {
        self$`warehouses` <- ApiClient$new()$deserializeObj(this_object$`warehouses`, "array[WarehouseDTO]", loadNamespace("ympa_r_client"))
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return WarehouseGroupDTO in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`name`)) {
          sprintf(
          '"name":
            "%s"
                    ',
          self$`name`
          )
        },
        if (!is.null(self$`mainWarehouse`)) {
          sprintf(
          '"mainWarehouse":
          %s
          ',
          jsonlite::toJSON(self$`mainWarehouse`$toJSON(), auto_unbox = TRUE, digits = NA)
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
    #' Deserialize JSON string into an instance of WarehouseGroupDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of WarehouseGroupDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of WarehouseGroupDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`name` <- this_object$`name`
      self$`mainWarehouse` <- WarehouseDTO$new()$fromJSON(jsonlite::toJSON(this_object$`mainWarehouse`, auto_unbox = TRUE, digits = NA))
      self$`warehouses` <- ApiClient$new()$deserializeObj(this_object$`warehouses`, "array[WarehouseDTO]", loadNamespace("ympa_r_client"))
      self
    },
    #' Validate JSON input with respect to WarehouseGroupDTO
    #'
    #' @description
    #' Validate JSON input with respect to WarehouseGroupDTO and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `name`
      if (!is.null(input_json$`name`)) {
        if (!(is.character(input_json$`name`) && length(input_json$`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", input_json$`name`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for WarehouseGroupDTO: the required field `name` is missing."))
      }
      # check the required field `mainWarehouse`
      if (!is.null(input_json$`mainWarehouse`)) {
        stopifnot(R6::is.R6(input_json$`mainWarehouse`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for WarehouseGroupDTO: the required field `mainWarehouse` is missing."))
      }
      # check the required field `warehouses`
      if (!is.null(input_json$`warehouses`)) {
        stopifnot(is.vector(input_json$`warehouses`), length(input_json$`warehouses`) != 0)
        tmp <- sapply(input_json$`warehouses`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for WarehouseGroupDTO: the required field `warehouses` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of WarehouseGroupDTO
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
      # check if the required `name` is null
      if (is.null(self$`name`)) {
        return(FALSE)
      }

      # check if the required `mainWarehouse` is null
      if (is.null(self$`mainWarehouse`)) {
        return(FALSE)
      }

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
      # check if the required `name` is null
      if (is.null(self$`name`)) {
        invalid_fields["name"] <- "Non-nullable required field `name` cannot be null."
      }

      # check if the required `mainWarehouse` is null
      if (is.null(self$`mainWarehouse`)) {
        invalid_fields["mainWarehouse"] <- "Non-nullable required field `mainWarehouse` cannot be null."
      }

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
# WarehouseGroupDTO$unlock()
#
## Below is an example to define the print function
# WarehouseGroupDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# WarehouseGroupDTO$lock()

