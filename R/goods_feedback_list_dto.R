#' Create a new GoodsFeedbackListDTO
#'
#' @description
#' Список отзывов о товарах. 
#'
#' @docType class
#' @title GoodsFeedbackListDTO
#' @description GoodsFeedbackListDTO Class
#' @format An \code{R6Class} generator object
#' @field feedbacks Список отзывов. list(\link{GoodsFeedbackDTO})
#' @field paging  \link{ForwardScrollingPagerDTO} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
GoodsFeedbackListDTO <- R6::R6Class(
  "GoodsFeedbackListDTO",
  public = list(
    `feedbacks` = NULL,
    `paging` = NULL,
    #' Initialize a new GoodsFeedbackListDTO class.
    #'
    #' @description
    #' Initialize a new GoodsFeedbackListDTO class.
    #'
    #' @param feedbacks Список отзывов.
    #' @param paging paging
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`feedbacks`, `paging` = NULL, ...) {
      if (!missing(`feedbacks`)) {
        stopifnot(is.vector(`feedbacks`), length(`feedbacks`) != 0)
        sapply(`feedbacks`, function(x) stopifnot(R6::is.R6(x)))
        self$`feedbacks` <- `feedbacks`
      }
      if (!is.null(`paging`)) {
        stopifnot(R6::is.R6(`paging`))
        self$`paging` <- `paging`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return GoodsFeedbackListDTO in JSON format
    #' @export
    toJSON = function() {
      GoodsFeedbackListDTOObject <- list()
      if (!is.null(self$`feedbacks`)) {
        GoodsFeedbackListDTOObject[["feedbacks"]] <-
          lapply(self$`feedbacks`, function(x) x$toJSON())
      }
      if (!is.null(self$`paging`)) {
        GoodsFeedbackListDTOObject[["paging"]] <-
          self$`paging`$toJSON()
      }
      GoodsFeedbackListDTOObject
    },
    #' Deserialize JSON string into an instance of GoodsFeedbackListDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of GoodsFeedbackListDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of GoodsFeedbackListDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`feedbacks`)) {
        self$`feedbacks` <- ApiClient$new()$deserializeObj(this_object$`feedbacks`, "array[GoodsFeedbackDTO]", loadNamespace("ympa_r_client"))
      }
      if (!is.null(this_object$`paging`)) {
        `paging_object` <- ForwardScrollingPagerDTO$new()
        `paging_object`$fromJSON(jsonlite::toJSON(this_object$`paging`, auto_unbox = TRUE, digits = NA))
        self$`paging` <- `paging_object`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return GoodsFeedbackListDTO in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`feedbacks`)) {
          sprintf(
          '"feedbacks":
          [%s]
',
          paste(sapply(self$`feedbacks`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        },
        if (!is.null(self$`paging`)) {
          sprintf(
          '"paging":
          %s
          ',
          jsonlite::toJSON(self$`paging`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of GoodsFeedbackListDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of GoodsFeedbackListDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of GoodsFeedbackListDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`feedbacks` <- ApiClient$new()$deserializeObj(this_object$`feedbacks`, "array[GoodsFeedbackDTO]", loadNamespace("ympa_r_client"))
      self$`paging` <- ForwardScrollingPagerDTO$new()$fromJSON(jsonlite::toJSON(this_object$`paging`, auto_unbox = TRUE, digits = NA))
      self
    },
    #' Validate JSON input with respect to GoodsFeedbackListDTO
    #'
    #' @description
    #' Validate JSON input with respect to GoodsFeedbackListDTO and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `feedbacks`
      if (!is.null(input_json$`feedbacks`)) {
        stopifnot(is.vector(input_json$`feedbacks`), length(input_json$`feedbacks`) != 0)
        tmp <- sapply(input_json$`feedbacks`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for GoodsFeedbackListDTO: the required field `feedbacks` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of GoodsFeedbackListDTO
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
      # check if the required `feedbacks` is null
      if (is.null(self$`feedbacks`)) {
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
      # check if the required `feedbacks` is null
      if (is.null(self$`feedbacks`)) {
        invalid_fields["feedbacks"] <- "Non-nullable required field `feedbacks` cannot be null."
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
# GoodsFeedbackListDTO$unlock()
#
## Below is an example to define the print function
# GoodsFeedbackListDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# GoodsFeedbackListDTO$lock()

