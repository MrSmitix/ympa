#' Create a new CategoryDTO
#'
#' @description
#' Информация о категории.  Категория считается листовой, если у нее нет дочерних категорий. 
#'
#' @docType class
#' @title CategoryDTO
#' @description CategoryDTO Class
#' @format An \code{R6Class} generator object
#' @field id Идентификатор категории. integer
#' @field name Название категории. character
#' @field children Дочерние категории. list(\link{CategoryDTO}) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CategoryDTO <- R6::R6Class(
  "CategoryDTO",
  public = list(
    `id` = NULL,
    `name` = NULL,
    `children` = NULL,
    #' Initialize a new CategoryDTO class.
    #'
    #' @description
    #' Initialize a new CategoryDTO class.
    #'
    #' @param id Идентификатор категории.
    #' @param name Название категории.
    #' @param children Дочерние категории.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`id`, `name`, `children` = NULL, ...) {
      if (!missing(`id`)) {
        if (!(is.numeric(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be an integer:", `id`))
        }
        self$`id` <- `id`
      }
      if (!missing(`name`)) {
        if (!(is.character(`name`) && length(`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", `name`))
        }
        self$`name` <- `name`
      }
      if (!is.null(`children`)) {
        stopifnot(is.vector(`children`), length(`children`) != 0)
        sapply(`children`, function(x) stopifnot(R6::is.R6(x)))
        self$`children` <- `children`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return CategoryDTO in JSON format
    #' @export
    toJSON = function() {
      CategoryDTOObject <- list()
      if (!is.null(self$`id`)) {
        CategoryDTOObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`name`)) {
        CategoryDTOObject[["name"]] <-
          self$`name`
      }
      if (!is.null(self$`children`)) {
        CategoryDTOObject[["children"]] <-
          lapply(self$`children`, function(x) x$toJSON())
      }
      CategoryDTOObject
    },
    #' Deserialize JSON string into an instance of CategoryDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of CategoryDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of CategoryDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`name`)) {
        self$`name` <- this_object$`name`
      }
      if (!is.null(this_object$`children`)) {
        self$`children` <- ApiClient$new()$deserializeObj(this_object$`children`, "array[CategoryDTO]", loadNamespace("ympa_r_client"))
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return CategoryDTO in JSON format
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
        if (!is.null(self$`children`)) {
          sprintf(
          '"children":
          [%s]
',
          paste(sapply(self$`children`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of CategoryDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of CategoryDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of CategoryDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`id` <- this_object$`id`
      self$`name` <- this_object$`name`
      self$`children` <- ApiClient$new()$deserializeObj(this_object$`children`, "array[CategoryDTO]", loadNamespace("ympa_r_client"))
      self
    },
    #' Validate JSON input with respect to CategoryDTO
    #'
    #' @description
    #' Validate JSON input with respect to CategoryDTO and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `id`
      if (!is.null(input_json$`id`)) {
        if (!(is.numeric(input_json$`id`) && length(input_json$`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be an integer:", input_json$`id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CategoryDTO: the required field `id` is missing."))
      }
      # check the required field `name`
      if (!is.null(input_json$`name`)) {
        if (!(is.character(input_json$`name`) && length(input_json$`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", input_json$`name`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CategoryDTO: the required field `name` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CategoryDTO
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
      # check if the required `id` is null
      if (is.null(self$`id`)) {
        return(FALSE)
      }

      # check if the required `name` is null
      if (is.null(self$`name`)) {
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
      # check if the required `id` is null
      if (is.null(self$`id`)) {
        invalid_fields["id"] <- "Non-nullable required field `id` cannot be null."
      }

      # check if the required `name` is null
      if (is.null(self$`name`)) {
        invalid_fields["name"] <- "Non-nullable required field `name` cannot be null."
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
# CategoryDTO$unlock()
#
## Below is an example to define the print function
# CategoryDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CategoryDTO$lock()

