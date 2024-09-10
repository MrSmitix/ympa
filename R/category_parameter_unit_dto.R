#' Create a new CategoryParameterUnitDTO
#'
#' @description
#' Единицы измерения характеристики товара.
#'
#' @docType class
#' @title CategoryParameterUnitDTO
#' @description CategoryParameterUnitDTO Class
#' @format An \code{R6Class} generator object
#' @field defaultUnitId Единица измерения по умолчанию. integer
#' @field units Допустимые единицы измерения. list(\link{UnitDTO})
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CategoryParameterUnitDTO <- R6::R6Class(
  "CategoryParameterUnitDTO",
  public = list(
    `defaultUnitId` = NULL,
    `units` = NULL,
    #' Initialize a new CategoryParameterUnitDTO class.
    #'
    #' @description
    #' Initialize a new CategoryParameterUnitDTO class.
    #'
    #' @param defaultUnitId Единица измерения по умолчанию.
    #' @param units Допустимые единицы измерения.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`defaultUnitId`, `units`, ...) {
      if (!missing(`defaultUnitId`)) {
        if (!(is.numeric(`defaultUnitId`) && length(`defaultUnitId`) == 1)) {
          stop(paste("Error! Invalid data for `defaultUnitId`. Must be an integer:", `defaultUnitId`))
        }
        self$`defaultUnitId` <- `defaultUnitId`
      }
      if (!missing(`units`)) {
        stopifnot(is.vector(`units`), length(`units`) != 0)
        sapply(`units`, function(x) stopifnot(R6::is.R6(x)))
        self$`units` <- `units`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return CategoryParameterUnitDTO in JSON format
    #' @export
    toJSON = function() {
      CategoryParameterUnitDTOObject <- list()
      if (!is.null(self$`defaultUnitId`)) {
        CategoryParameterUnitDTOObject[["defaultUnitId"]] <-
          self$`defaultUnitId`
      }
      if (!is.null(self$`units`)) {
        CategoryParameterUnitDTOObject[["units"]] <-
          lapply(self$`units`, function(x) x$toJSON())
      }
      CategoryParameterUnitDTOObject
    },
    #' Deserialize JSON string into an instance of CategoryParameterUnitDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of CategoryParameterUnitDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of CategoryParameterUnitDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`defaultUnitId`)) {
        self$`defaultUnitId` <- this_object$`defaultUnitId`
      }
      if (!is.null(this_object$`units`)) {
        self$`units` <- ApiClient$new()$deserializeObj(this_object$`units`, "array[UnitDTO]", loadNamespace("ympa_r_client"))
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return CategoryParameterUnitDTO in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`defaultUnitId`)) {
          sprintf(
          '"defaultUnitId":
            %d
                    ',
          self$`defaultUnitId`
          )
        },
        if (!is.null(self$`units`)) {
          sprintf(
          '"units":
          [%s]
',
          paste(sapply(self$`units`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of CategoryParameterUnitDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of CategoryParameterUnitDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of CategoryParameterUnitDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`defaultUnitId` <- this_object$`defaultUnitId`
      self$`units` <- ApiClient$new()$deserializeObj(this_object$`units`, "array[UnitDTO]", loadNamespace("ympa_r_client"))
      self
    },
    #' Validate JSON input with respect to CategoryParameterUnitDTO
    #'
    #' @description
    #' Validate JSON input with respect to CategoryParameterUnitDTO and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `defaultUnitId`
      if (!is.null(input_json$`defaultUnitId`)) {
        if (!(is.numeric(input_json$`defaultUnitId`) && length(input_json$`defaultUnitId`) == 1)) {
          stop(paste("Error! Invalid data for `defaultUnitId`. Must be an integer:", input_json$`defaultUnitId`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CategoryParameterUnitDTO: the required field `defaultUnitId` is missing."))
      }
      # check the required field `units`
      if (!is.null(input_json$`units`)) {
        stopifnot(is.vector(input_json$`units`), length(input_json$`units`) != 0)
        tmp <- sapply(input_json$`units`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CategoryParameterUnitDTO: the required field `units` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CategoryParameterUnitDTO
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
      # check if the required `defaultUnitId` is null
      if (is.null(self$`defaultUnitId`)) {
        return(FALSE)
      }

      # check if the required `units` is null
      if (is.null(self$`units`)) {
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
      # check if the required `defaultUnitId` is null
      if (is.null(self$`defaultUnitId`)) {
        invalid_fields["defaultUnitId"] <- "Non-nullable required field `defaultUnitId` cannot be null."
      }

      # check if the required `units` is null
      if (is.null(self$`units`)) {
        invalid_fields["units"] <- "Non-nullable required field `units` cannot be null."
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
# CategoryParameterUnitDTO$unlock()
#
## Below is an example to define the print function
# CategoryParameterUnitDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CategoryParameterUnitDTO$lock()

