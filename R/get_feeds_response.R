#' Create a new GetFeedsResponse
#'
#' @description
#' Ответ на запрос списка прайс-листов.
#'
#' @docType class
#' @title GetFeedsResponse
#' @description GetFeedsResponse Class
#' @format An \code{R6Class} generator object
#' @field feeds Список прайс-листов. list(\link{FeedDTO})
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
GetFeedsResponse <- R6::R6Class(
  "GetFeedsResponse",
  public = list(
    `feeds` = NULL,
    #' Initialize a new GetFeedsResponse class.
    #'
    #' @description
    #' Initialize a new GetFeedsResponse class.
    #'
    #' @param feeds Список прайс-листов.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`feeds`, ...) {
      if (!missing(`feeds`)) {
        stopifnot(is.vector(`feeds`), length(`feeds`) != 0)
        sapply(`feeds`, function(x) stopifnot(R6::is.R6(x)))
        self$`feeds` <- `feeds`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return GetFeedsResponse in JSON format
    #' @export
    toJSON = function() {
      GetFeedsResponseObject <- list()
      if (!is.null(self$`feeds`)) {
        GetFeedsResponseObject[["feeds"]] <-
          lapply(self$`feeds`, function(x) x$toJSON())
      }
      GetFeedsResponseObject
    },
    #' Deserialize JSON string into an instance of GetFeedsResponse
    #'
    #' @description
    #' Deserialize JSON string into an instance of GetFeedsResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of GetFeedsResponse
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`feeds`)) {
        self$`feeds` <- ApiClient$new()$deserializeObj(this_object$`feeds`, "array[FeedDTO]", loadNamespace("ympa_r_client"))
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return GetFeedsResponse in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`feeds`)) {
          sprintf(
          '"feeds":
          [%s]
',
          paste(sapply(self$`feeds`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of GetFeedsResponse
    #'
    #' @description
    #' Deserialize JSON string into an instance of GetFeedsResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of GetFeedsResponse
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`feeds` <- ApiClient$new()$deserializeObj(this_object$`feeds`, "array[FeedDTO]", loadNamespace("ympa_r_client"))
      self
    },
    #' Validate JSON input with respect to GetFeedsResponse
    #'
    #' @description
    #' Validate JSON input with respect to GetFeedsResponse and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `feeds`
      if (!is.null(input_json$`feeds`)) {
        stopifnot(is.vector(input_json$`feeds`), length(input_json$`feeds`) != 0)
        tmp <- sapply(input_json$`feeds`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for GetFeedsResponse: the required field `feeds` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of GetFeedsResponse
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
      # check if the required `feeds` is null
      if (is.null(self$`feeds`)) {
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
      # check if the required `feeds` is null
      if (is.null(self$`feeds`)) {
        invalid_fields["feeds"] <- "Non-nullable required field `feeds` cannot be null."
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
# GetFeedsResponse$unlock()
#
## Below is an example to define the print function
# GetFeedsResponse$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# GetFeedsResponse$lock()

