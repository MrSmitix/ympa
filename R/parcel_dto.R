#' Create a new ParcelDTO
#'
#' @description
#' Информация о грузовых местах в заказе.
#'
#' @docType class
#' @title ParcelDTO
#' @description ParcelDTO Class
#' @format An \code{R6Class} generator object
#' @field boxes Список грузовых мест. Маркет определяет количество мест по длине этого списка. list(\link{ParcelBoxDTO})
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ParcelDTO <- R6::R6Class(
  "ParcelDTO",
  public = list(
    `boxes` = NULL,
    #' Initialize a new ParcelDTO class.
    #'
    #' @description
    #' Initialize a new ParcelDTO class.
    #'
    #' @param boxes Список грузовых мест. Маркет определяет количество мест по длине этого списка.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`boxes`, ...) {
      if (!missing(`boxes`)) {
        stopifnot(is.vector(`boxes`), length(`boxes`) != 0)
        sapply(`boxes`, function(x) stopifnot(R6::is.R6(x)))
        self$`boxes` <- `boxes`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return ParcelDTO in JSON format
    #' @export
    toJSON = function() {
      ParcelDTOObject <- list()
      if (!is.null(self$`boxes`)) {
        ParcelDTOObject[["boxes"]] <-
          lapply(self$`boxes`, function(x) x$toJSON())
      }
      ParcelDTOObject
    },
    #' Deserialize JSON string into an instance of ParcelDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of ParcelDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of ParcelDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`boxes`)) {
        self$`boxes` <- ApiClient$new()$deserializeObj(this_object$`boxes`, "array[ParcelBoxDTO]", loadNamespace("ympa_r_client"))
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return ParcelDTO in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`boxes`)) {
          sprintf(
          '"boxes":
          [%s]
',
          paste(sapply(self$`boxes`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of ParcelDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of ParcelDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of ParcelDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`boxes` <- ApiClient$new()$deserializeObj(this_object$`boxes`, "array[ParcelBoxDTO]", loadNamespace("ympa_r_client"))
      self
    },
    #' Validate JSON input with respect to ParcelDTO
    #'
    #' @description
    #' Validate JSON input with respect to ParcelDTO and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `boxes`
      if (!is.null(input_json$`boxes`)) {
        stopifnot(is.vector(input_json$`boxes`), length(input_json$`boxes`) != 0)
        tmp <- sapply(input_json$`boxes`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ParcelDTO: the required field `boxes` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of ParcelDTO
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
      # check if the required `boxes` is null
      if (is.null(self$`boxes`)) {
        return(FALSE)
      }

      if (length(self$`boxes`) < 1) {
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
      # check if the required `boxes` is null
      if (is.null(self$`boxes`)) {
        invalid_fields["boxes"] <- "Non-nullable required field `boxes` cannot be null."
      }

      if (length(self$`boxes`) < 1) {
        invalid_fields["boxes"] <- "Invalid length for ``, number of items must be greater than or equal to 1."
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
# ParcelDTO$unlock()
#
## Below is an example to define the print function
# ParcelDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# ParcelDTO$lock()

