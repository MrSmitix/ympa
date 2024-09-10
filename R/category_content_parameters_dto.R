#' Create a new CategoryContentParametersDTO
#'
#' @description
#' Информация о параметрах категории.
#'
#' @docType class
#' @title CategoryContentParametersDTO
#' @description CategoryContentParametersDTO Class
#' @format An \code{R6Class} generator object
#' @field categoryId Идентификатор категории на Маркете. Чтобы узнать идентификатор категории, к которой относится товар, воспользуйтесь запросом [POST categories/tree](../../reference/categories/getCategoriesTree.md). integer
#' @field parameters Список характеристик. list(\link{CategoryParameterDTO}) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CategoryContentParametersDTO <- R6::R6Class(
  "CategoryContentParametersDTO",
  public = list(
    `categoryId` = NULL,
    `parameters` = NULL,
    #' Initialize a new CategoryContentParametersDTO class.
    #'
    #' @description
    #' Initialize a new CategoryContentParametersDTO class.
    #'
    #' @param categoryId Идентификатор категории на Маркете. Чтобы узнать идентификатор категории, к которой относится товар, воспользуйтесь запросом [POST categories/tree](../../reference/categories/getCategoriesTree.md).
    #' @param parameters Список характеристик.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`categoryId`, `parameters` = NULL, ...) {
      if (!missing(`categoryId`)) {
        if (!(is.numeric(`categoryId`) && length(`categoryId`) == 1)) {
          stop(paste("Error! Invalid data for `categoryId`. Must be an integer:", `categoryId`))
        }
        self$`categoryId` <- `categoryId`
      }
      if (!is.null(`parameters`)) {
        stopifnot(is.vector(`parameters`), length(`parameters`) != 0)
        sapply(`parameters`, function(x) stopifnot(R6::is.R6(x)))
        self$`parameters` <- `parameters`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return CategoryContentParametersDTO in JSON format
    #' @export
    toJSON = function() {
      CategoryContentParametersDTOObject <- list()
      if (!is.null(self$`categoryId`)) {
        CategoryContentParametersDTOObject[["categoryId"]] <-
          self$`categoryId`
      }
      if (!is.null(self$`parameters`)) {
        CategoryContentParametersDTOObject[["parameters"]] <-
          lapply(self$`parameters`, function(x) x$toJSON())
      }
      CategoryContentParametersDTOObject
    },
    #' Deserialize JSON string into an instance of CategoryContentParametersDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of CategoryContentParametersDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of CategoryContentParametersDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`categoryId`)) {
        self$`categoryId` <- this_object$`categoryId`
      }
      if (!is.null(this_object$`parameters`)) {
        self$`parameters` <- ApiClient$new()$deserializeObj(this_object$`parameters`, "array[CategoryParameterDTO]", loadNamespace("ympa_r_client"))
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return CategoryContentParametersDTO in JSON format
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
        if (!is.null(self$`parameters`)) {
          sprintf(
          '"parameters":
          [%s]
',
          paste(sapply(self$`parameters`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of CategoryContentParametersDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of CategoryContentParametersDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of CategoryContentParametersDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`categoryId` <- this_object$`categoryId`
      self$`parameters` <- ApiClient$new()$deserializeObj(this_object$`parameters`, "array[CategoryParameterDTO]", loadNamespace("ympa_r_client"))
      self
    },
    #' Validate JSON input with respect to CategoryContentParametersDTO
    #'
    #' @description
    #' Validate JSON input with respect to CategoryContentParametersDTO and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `categoryId`
      if (!is.null(input_json$`categoryId`)) {
        if (!(is.numeric(input_json$`categoryId`) && length(input_json$`categoryId`) == 1)) {
          stop(paste("Error! Invalid data for `categoryId`. Must be an integer:", input_json$`categoryId`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CategoryContentParametersDTO: the required field `categoryId` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CategoryContentParametersDTO
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
      # check if the required `categoryId` is null
      if (is.null(self$`categoryId`)) {
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
      # check if the required `categoryId` is null
      if (is.null(self$`categoryId`)) {
        invalid_fields["categoryId"] <- "Non-nullable required field `categoryId` cannot be null."
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
# CategoryContentParametersDTO$unlock()
#
## Below is an example to define the print function
# CategoryContentParametersDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CategoryContentParametersDTO$lock()

