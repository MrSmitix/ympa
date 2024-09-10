#' Create a new GetPromosResultDTO
#'
#' @description
#' Информация об акциях Маркета.
#'
#' @docType class
#' @title GetPromosResultDTO
#' @description GetPromosResultDTO Class
#' @format An \code{R6Class} generator object
#' @field promos Акции Маркета. list(\link{GetPromoDTO})
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
GetPromosResultDTO <- R6::R6Class(
  "GetPromosResultDTO",
  public = list(
    `promos` = NULL,
    #' Initialize a new GetPromosResultDTO class.
    #'
    #' @description
    #' Initialize a new GetPromosResultDTO class.
    #'
    #' @param promos Акции Маркета.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`promos`, ...) {
      if (!missing(`promos`)) {
        stopifnot(is.vector(`promos`), length(`promos`) != 0)
        sapply(`promos`, function(x) stopifnot(R6::is.R6(x)))
        self$`promos` <- `promos`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return GetPromosResultDTO in JSON format
    #' @export
    toJSON = function() {
      GetPromosResultDTOObject <- list()
      if (!is.null(self$`promos`)) {
        GetPromosResultDTOObject[["promos"]] <-
          lapply(self$`promos`, function(x) x$toJSON())
      }
      GetPromosResultDTOObject
    },
    #' Deserialize JSON string into an instance of GetPromosResultDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of GetPromosResultDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of GetPromosResultDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`promos`)) {
        self$`promos` <- ApiClient$new()$deserializeObj(this_object$`promos`, "array[GetPromoDTO]", loadNamespace("ympa_r_client"))
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return GetPromosResultDTO in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`promos`)) {
          sprintf(
          '"promos":
          [%s]
',
          paste(sapply(self$`promos`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of GetPromosResultDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of GetPromosResultDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of GetPromosResultDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`promos` <- ApiClient$new()$deserializeObj(this_object$`promos`, "array[GetPromoDTO]", loadNamespace("ympa_r_client"))
      self
    },
    #' Validate JSON input with respect to GetPromosResultDTO
    #'
    #' @description
    #' Validate JSON input with respect to GetPromosResultDTO and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `promos`
      if (!is.null(input_json$`promos`)) {
        stopifnot(is.vector(input_json$`promos`), length(input_json$`promos`) != 0)
        tmp <- sapply(input_json$`promos`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for GetPromosResultDTO: the required field `promos` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of GetPromosResultDTO
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
      # check if the required `promos` is null
      if (is.null(self$`promos`)) {
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
      # check if the required `promos` is null
      if (is.null(self$`promos`)) {
        invalid_fields["promos"] <- "Non-nullable required field `promos` cannot be null."
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
# GetPromosResultDTO$unlock()
#
## Below is an example to define the print function
# GetPromosResultDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# GetPromosResultDTO$lock()

