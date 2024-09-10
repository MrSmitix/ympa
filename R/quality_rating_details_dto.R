#' Create a new QualityRatingDetailsDTO
#'
#' @description
#' Информация о заказах, которые повлияли на индекс качества.
#'
#' @docType class
#' @title QualityRatingDetailsDTO
#' @description QualityRatingDetailsDTO Class
#' @format An \code{R6Class} generator object
#' @field affectedOrders Список заказов, которые повлияли на индекс качества. list(\link{QualityRatingAffectedOrderDTO})
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
QualityRatingDetailsDTO <- R6::R6Class(
  "QualityRatingDetailsDTO",
  public = list(
    `affectedOrders` = NULL,
    #' Initialize a new QualityRatingDetailsDTO class.
    #'
    #' @description
    #' Initialize a new QualityRatingDetailsDTO class.
    #'
    #' @param affectedOrders Список заказов, которые повлияли на индекс качества.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`affectedOrders`, ...) {
      if (!missing(`affectedOrders`)) {
        stopifnot(is.vector(`affectedOrders`), length(`affectedOrders`) != 0)
        sapply(`affectedOrders`, function(x) stopifnot(R6::is.R6(x)))
        self$`affectedOrders` <- `affectedOrders`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return QualityRatingDetailsDTO in JSON format
    #' @export
    toJSON = function() {
      QualityRatingDetailsDTOObject <- list()
      if (!is.null(self$`affectedOrders`)) {
        QualityRatingDetailsDTOObject[["affectedOrders"]] <-
          lapply(self$`affectedOrders`, function(x) x$toJSON())
      }
      QualityRatingDetailsDTOObject
    },
    #' Deserialize JSON string into an instance of QualityRatingDetailsDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of QualityRatingDetailsDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of QualityRatingDetailsDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`affectedOrders`)) {
        self$`affectedOrders` <- ApiClient$new()$deserializeObj(this_object$`affectedOrders`, "array[QualityRatingAffectedOrderDTO]", loadNamespace("ympa_r_client"))
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return QualityRatingDetailsDTO in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`affectedOrders`)) {
          sprintf(
          '"affectedOrders":
          [%s]
',
          paste(sapply(self$`affectedOrders`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of QualityRatingDetailsDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of QualityRatingDetailsDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of QualityRatingDetailsDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`affectedOrders` <- ApiClient$new()$deserializeObj(this_object$`affectedOrders`, "array[QualityRatingAffectedOrderDTO]", loadNamespace("ympa_r_client"))
      self
    },
    #' Validate JSON input with respect to QualityRatingDetailsDTO
    #'
    #' @description
    #' Validate JSON input with respect to QualityRatingDetailsDTO and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `affectedOrders`
      if (!is.null(input_json$`affectedOrders`)) {
        stopifnot(is.vector(input_json$`affectedOrders`), length(input_json$`affectedOrders`) != 0)
        tmp <- sapply(input_json$`affectedOrders`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for QualityRatingDetailsDTO: the required field `affectedOrders` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of QualityRatingDetailsDTO
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
      # check if the required `affectedOrders` is null
      if (is.null(self$`affectedOrders`)) {
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
      # check if the required `affectedOrders` is null
      if (is.null(self$`affectedOrders`)) {
        invalid_fields["affectedOrders"] <- "Non-nullable required field `affectedOrders` cannot be null."
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
# QualityRatingDetailsDTO$unlock()
#
## Below is an example to define the print function
# QualityRatingDetailsDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# QualityRatingDetailsDTO$lock()

