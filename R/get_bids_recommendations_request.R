#' Create a new GetBidsRecommendationsRequest
#'
#' @description
#' description.
#'
#' @docType class
#' @title GetBidsRecommendationsRequest
#' @description GetBidsRecommendationsRequest Class
#' @format An \code{R6Class} generator object
#' @field skus Список товаров, для которых нужно получить рекомендации по ставкам. list(character)
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
GetBidsRecommendationsRequest <- R6::R6Class(
  "GetBidsRecommendationsRequest",
  public = list(
    `skus` = NULL,
    #' Initialize a new GetBidsRecommendationsRequest class.
    #'
    #' @description
    #' Initialize a new GetBidsRecommendationsRequest class.
    #'
    #' @param skus Список товаров, для которых нужно получить рекомендации по ставкам.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`skus`, ...) {
      if (!missing(`skus`)) {
        stopifnot(is.vector(`skus`), length(`skus`) != 0)
        sapply(`skus`, function(x) stopifnot(is.character(x)))
        self$`skus` <- `skus`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return GetBidsRecommendationsRequest in JSON format
    #' @export
    toJSON = function() {
      GetBidsRecommendationsRequestObject <- list()
      if (!is.null(self$`skus`)) {
        GetBidsRecommendationsRequestObject[["skus"]] <-
          self$`skus`
      }
      GetBidsRecommendationsRequestObject
    },
    #' Deserialize JSON string into an instance of GetBidsRecommendationsRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of GetBidsRecommendationsRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of GetBidsRecommendationsRequest
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`skus`)) {
        self$`skus` <- ApiClient$new()$deserializeObj(this_object$`skus`, "array[character]", loadNamespace("ympa_r_client"))
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return GetBidsRecommendationsRequest in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`skus`)) {
          sprintf(
          '"skus":
             [%s]
          ',
          paste(unlist(lapply(self$`skus`, function(x) paste0('"', x, '"'))), collapse = ",")
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of GetBidsRecommendationsRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of GetBidsRecommendationsRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of GetBidsRecommendationsRequest
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`skus` <- ApiClient$new()$deserializeObj(this_object$`skus`, "array[character]", loadNamespace("ympa_r_client"))
      self
    },
    #' Validate JSON input with respect to GetBidsRecommendationsRequest
    #'
    #' @description
    #' Validate JSON input with respect to GetBidsRecommendationsRequest and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `skus`
      if (!is.null(input_json$`skus`)) {
        stopifnot(is.vector(input_json$`skus`), length(input_json$`skus`) != 0)
        tmp <- sapply(input_json$`skus`, function(x) stopifnot(is.character(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for GetBidsRecommendationsRequest: the required field `skus` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of GetBidsRecommendationsRequest
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
      # check if the required `skus` is null
      if (is.null(self$`skus`)) {
        return(FALSE)
      }

      if (length(self$`skus`) > 1500) {
        return(FALSE)
      }
      if (length(self$`skus`) < 1) {
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
      # check if the required `skus` is null
      if (is.null(self$`skus`)) {
        invalid_fields["skus"] <- "Non-nullable required field `skus` cannot be null."
      }

      if (length(self$`skus`) > 1500) {
        invalid_fields["skus"] <- "Invalid length for `skus`, number of items must be less than or equal to 1500."
      }
      if (length(self$`skus`) < 1) {
        invalid_fields["skus"] <- "Invalid length for ``, number of items must be greater than or equal to 1."
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
# GetBidsRecommendationsRequest$unlock()
#
## Below is an example to define the print function
# GetBidsRecommendationsRequest$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# GetBidsRecommendationsRequest$lock()

