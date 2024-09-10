#' Create a new OfferRecommendationsResultDTO
#'
#' @description
#' Список товаров с рекомендациями.
#'
#' @docType class
#' @title OfferRecommendationsResultDTO
#' @description OfferRecommendationsResultDTO Class
#' @format An \code{R6Class} generator object
#' @field paging  \link{ScrollingPagerDTO} [optional]
#' @field offerRecommendations Страница списка товаров. list(\link{OfferRecommendationDTO})
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
OfferRecommendationsResultDTO <- R6::R6Class(
  "OfferRecommendationsResultDTO",
  public = list(
    `paging` = NULL,
    `offerRecommendations` = NULL,
    #' Initialize a new OfferRecommendationsResultDTO class.
    #'
    #' @description
    #' Initialize a new OfferRecommendationsResultDTO class.
    #'
    #' @param offerRecommendations Страница списка товаров.
    #' @param paging paging
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`offerRecommendations`, `paging` = NULL, ...) {
      if (!missing(`offerRecommendations`)) {
        stopifnot(is.vector(`offerRecommendations`), length(`offerRecommendations`) != 0)
        sapply(`offerRecommendations`, function(x) stopifnot(R6::is.R6(x)))
        self$`offerRecommendations` <- `offerRecommendations`
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
    #' @return OfferRecommendationsResultDTO in JSON format
    #' @export
    toJSON = function() {
      OfferRecommendationsResultDTOObject <- list()
      if (!is.null(self$`paging`)) {
        OfferRecommendationsResultDTOObject[["paging"]] <-
          self$`paging`$toJSON()
      }
      if (!is.null(self$`offerRecommendations`)) {
        OfferRecommendationsResultDTOObject[["offerRecommendations"]] <-
          lapply(self$`offerRecommendations`, function(x) x$toJSON())
      }
      OfferRecommendationsResultDTOObject
    },
    #' Deserialize JSON string into an instance of OfferRecommendationsResultDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of OfferRecommendationsResultDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of OfferRecommendationsResultDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`paging`)) {
        `paging_object` <- ScrollingPagerDTO$new()
        `paging_object`$fromJSON(jsonlite::toJSON(this_object$`paging`, auto_unbox = TRUE, digits = NA))
        self$`paging` <- `paging_object`
      }
      if (!is.null(this_object$`offerRecommendations`)) {
        self$`offerRecommendations` <- ApiClient$new()$deserializeObj(this_object$`offerRecommendations`, "array[OfferRecommendationDTO]", loadNamespace("ympa_r_client"))
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return OfferRecommendationsResultDTO in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`paging`)) {
          sprintf(
          '"paging":
          %s
          ',
          jsonlite::toJSON(self$`paging`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`offerRecommendations`)) {
          sprintf(
          '"offerRecommendations":
          [%s]
',
          paste(sapply(self$`offerRecommendations`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of OfferRecommendationsResultDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of OfferRecommendationsResultDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of OfferRecommendationsResultDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`paging` <- ScrollingPagerDTO$new()$fromJSON(jsonlite::toJSON(this_object$`paging`, auto_unbox = TRUE, digits = NA))
      self$`offerRecommendations` <- ApiClient$new()$deserializeObj(this_object$`offerRecommendations`, "array[OfferRecommendationDTO]", loadNamespace("ympa_r_client"))
      self
    },
    #' Validate JSON input with respect to OfferRecommendationsResultDTO
    #'
    #' @description
    #' Validate JSON input with respect to OfferRecommendationsResultDTO and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `offerRecommendations`
      if (!is.null(input_json$`offerRecommendations`)) {
        stopifnot(is.vector(input_json$`offerRecommendations`), length(input_json$`offerRecommendations`) != 0)
        tmp <- sapply(input_json$`offerRecommendations`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for OfferRecommendationsResultDTO: the required field `offerRecommendations` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of OfferRecommendationsResultDTO
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
      # check if the required `offerRecommendations` is null
      if (is.null(self$`offerRecommendations`)) {
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
      # check if the required `offerRecommendations` is null
      if (is.null(self$`offerRecommendations`)) {
        invalid_fields["offerRecommendations"] <- "Non-nullable required field `offerRecommendations` cannot be null."
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
# OfferRecommendationsResultDTO$unlock()
#
## Below is an example to define the print function
# OfferRecommendationsResultDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# OfferRecommendationsResultDTO$lock()

