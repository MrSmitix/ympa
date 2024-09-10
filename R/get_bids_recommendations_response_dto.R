#' Create a new GetBidsRecommendationsResponseDTO
#'
#' @description
#' Список товаров с рекомендованными ставками.
#'
#' @docType class
#' @title GetBidsRecommendationsResponseDTO
#' @description GetBidsRecommendationsResponseDTO Class
#' @format An \code{R6Class} generator object
#' @field recommendations Список товаров с рекомендованными ставками. list(\link{SkuBidRecommendationItemDTO})
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
GetBidsRecommendationsResponseDTO <- R6::R6Class(
  "GetBidsRecommendationsResponseDTO",
  public = list(
    `recommendations` = NULL,
    #' Initialize a new GetBidsRecommendationsResponseDTO class.
    #'
    #' @description
    #' Initialize a new GetBidsRecommendationsResponseDTO class.
    #'
    #' @param recommendations Список товаров с рекомендованными ставками.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`recommendations`, ...) {
      if (!missing(`recommendations`)) {
        stopifnot(is.vector(`recommendations`), length(`recommendations`) != 0)
        sapply(`recommendations`, function(x) stopifnot(R6::is.R6(x)))
        self$`recommendations` <- `recommendations`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return GetBidsRecommendationsResponseDTO in JSON format
    #' @export
    toJSON = function() {
      GetBidsRecommendationsResponseDTOObject <- list()
      if (!is.null(self$`recommendations`)) {
        GetBidsRecommendationsResponseDTOObject[["recommendations"]] <-
          lapply(self$`recommendations`, function(x) x$toJSON())
      }
      GetBidsRecommendationsResponseDTOObject
    },
    #' Deserialize JSON string into an instance of GetBidsRecommendationsResponseDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of GetBidsRecommendationsResponseDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of GetBidsRecommendationsResponseDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`recommendations`)) {
        self$`recommendations` <- ApiClient$new()$deserializeObj(this_object$`recommendations`, "array[SkuBidRecommendationItemDTO]", loadNamespace("ympa_r_client"))
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return GetBidsRecommendationsResponseDTO in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`recommendations`)) {
          sprintf(
          '"recommendations":
          [%s]
',
          paste(sapply(self$`recommendations`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of GetBidsRecommendationsResponseDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of GetBidsRecommendationsResponseDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of GetBidsRecommendationsResponseDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`recommendations` <- ApiClient$new()$deserializeObj(this_object$`recommendations`, "array[SkuBidRecommendationItemDTO]", loadNamespace("ympa_r_client"))
      self
    },
    #' Validate JSON input with respect to GetBidsRecommendationsResponseDTO
    #'
    #' @description
    #' Validate JSON input with respect to GetBidsRecommendationsResponseDTO and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `recommendations`
      if (!is.null(input_json$`recommendations`)) {
        stopifnot(is.vector(input_json$`recommendations`), length(input_json$`recommendations`) != 0)
        tmp <- sapply(input_json$`recommendations`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for GetBidsRecommendationsResponseDTO: the required field `recommendations` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of GetBidsRecommendationsResponseDTO
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
      # check if the required `recommendations` is null
      if (is.null(self$`recommendations`)) {
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
      # check if the required `recommendations` is null
      if (is.null(self$`recommendations`)) {
        invalid_fields["recommendations"] <- "Non-nullable required field `recommendations` cannot be null."
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
# GetBidsRecommendationsResponseDTO$unlock()
#
## Below is an example to define the print function
# GetBidsRecommendationsResponseDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# GetBidsRecommendationsResponseDTO$lock()

