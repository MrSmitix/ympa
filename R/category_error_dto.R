#' Create a new CategoryErrorDTO
#'
#' @description
#' Текст ошибки.
#'
#' @docType class
#' @title CategoryErrorDTO
#' @description CategoryErrorDTO Class
#' @format An \code{R6Class} generator object
#' @field categoryId Идентификатор категории. integer [optional]
#' @field type  \link{CategoryErrorType} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CategoryErrorDTO <- R6::R6Class(
  "CategoryErrorDTO",
  public = list(
    `categoryId` = NULL,
    `type` = NULL,
    #' Initialize a new CategoryErrorDTO class.
    #'
    #' @description
    #' Initialize a new CategoryErrorDTO class.
    #'
    #' @param categoryId Идентификатор категории.
    #' @param type type
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`categoryId` = NULL, `type` = NULL, ...) {
      if (!is.null(`categoryId`)) {
        if (!(is.numeric(`categoryId`) && length(`categoryId`) == 1)) {
          stop(paste("Error! Invalid data for `categoryId`. Must be an integer:", `categoryId`))
        }
        self$`categoryId` <- `categoryId`
      }
      if (!is.null(`type`)) {
        if (!(`type` %in% c())) {
          stop(paste("Error! \"", `type`, "\" cannot be assigned to `type`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`type`))
        self$`type` <- `type`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return CategoryErrorDTO in JSON format
    #' @export
    toJSON = function() {
      CategoryErrorDTOObject <- list()
      if (!is.null(self$`categoryId`)) {
        CategoryErrorDTOObject[["categoryId"]] <-
          self$`categoryId`
      }
      if (!is.null(self$`type`)) {
        CategoryErrorDTOObject[["type"]] <-
          self$`type`$toJSON()
      }
      CategoryErrorDTOObject
    },
    #' Deserialize JSON string into an instance of CategoryErrorDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of CategoryErrorDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of CategoryErrorDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`categoryId`)) {
        self$`categoryId` <- this_object$`categoryId`
      }
      if (!is.null(this_object$`type`)) {
        `type_object` <- CategoryErrorType$new()
        `type_object`$fromJSON(jsonlite::toJSON(this_object$`type`, auto_unbox = TRUE, digits = NA))
        self$`type` <- `type_object`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return CategoryErrorDTO in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`categoryId`)) {
          sprintf(
          '"categoryId":
            %d
                    ',
          self$`categoryId`
          )
        },
        if (!is.null(self$`type`)) {
          sprintf(
          '"type":
          %s
          ',
          jsonlite::toJSON(self$`type`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of CategoryErrorDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of CategoryErrorDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of CategoryErrorDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`categoryId` <- this_object$`categoryId`
      self$`type` <- CategoryErrorType$new()$fromJSON(jsonlite::toJSON(this_object$`type`, auto_unbox = TRUE, digits = NA))
      self
    },
    #' Validate JSON input with respect to CategoryErrorDTO
    #'
    #' @description
    #' Validate JSON input with respect to CategoryErrorDTO and throw an exception if invalid
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
    #' @return String representation of CategoryErrorDTO
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
# CategoryErrorDTO$unlock()
#
## Below is an example to define the print function
# CategoryErrorDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CategoryErrorDTO$lock()

