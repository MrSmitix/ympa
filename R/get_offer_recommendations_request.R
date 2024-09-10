#' Create a new GetOfferRecommendationsRequest
#'
#' @description
#' GetOfferRecommendationsRequest Class
#'
#' @docType class
#' @title GetOfferRecommendationsRequest
#' @description GetOfferRecommendationsRequest Class
#' @format An \code{R6Class} generator object
#' @field offerIds Идентификаторы товаров, информация о которых нужна. ⚠️ Не используйте это поле одновременно с остальными фильтрами. Если вы хотите воспользоваться фильтрами, оставьте поле пустым. list(character) [optional]
#' @field cofinancePriceFilter  \link{FieldStateType} [optional]
#' @field recommendedCofinancePriceFilter  \link{FieldStateType} [optional]
#' @field competitivenessFilter  \link{PriceCompetitivenessType} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
GetOfferRecommendationsRequest <- R6::R6Class(
  "GetOfferRecommendationsRequest",
  public = list(
    `offerIds` = NULL,
    `cofinancePriceFilter` = NULL,
    `recommendedCofinancePriceFilter` = NULL,
    `competitivenessFilter` = NULL,
    #' Initialize a new GetOfferRecommendationsRequest class.
    #'
    #' @description
    #' Initialize a new GetOfferRecommendationsRequest class.
    #'
    #' @param offerIds Идентификаторы товаров, информация о которых нужна. ⚠️ Не используйте это поле одновременно с остальными фильтрами. Если вы хотите воспользоваться фильтрами, оставьте поле пустым.
    #' @param cofinancePriceFilter cofinancePriceFilter
    #' @param recommendedCofinancePriceFilter recommendedCofinancePriceFilter
    #' @param competitivenessFilter competitivenessFilter
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`offerIds` = NULL, `cofinancePriceFilter` = NULL, `recommendedCofinancePriceFilter` = NULL, `competitivenessFilter` = NULL, ...) {
      if (!is.null(`offerIds`)) {
        stopifnot(is.vector(`offerIds`), length(`offerIds`) != 0)
        sapply(`offerIds`, function(x) stopifnot(is.character(x)))
        self$`offerIds` <- `offerIds`
      }
      if (!is.null(`cofinancePriceFilter`)) {
        if (!(`cofinancePriceFilter` %in% c())) {
          stop(paste("Error! \"", `cofinancePriceFilter`, "\" cannot be assigned to `cofinancePriceFilter`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`cofinancePriceFilter`))
        self$`cofinancePriceFilter` <- `cofinancePriceFilter`
      }
      if (!is.null(`recommendedCofinancePriceFilter`)) {
        if (!(`recommendedCofinancePriceFilter` %in% c())) {
          stop(paste("Error! \"", `recommendedCofinancePriceFilter`, "\" cannot be assigned to `recommendedCofinancePriceFilter`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`recommendedCofinancePriceFilter`))
        self$`recommendedCofinancePriceFilter` <- `recommendedCofinancePriceFilter`
      }
      if (!is.null(`competitivenessFilter`)) {
        if (!(`competitivenessFilter` %in% c())) {
          stop(paste("Error! \"", `competitivenessFilter`, "\" cannot be assigned to `competitivenessFilter`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`competitivenessFilter`))
        self$`competitivenessFilter` <- `competitivenessFilter`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return GetOfferRecommendationsRequest in JSON format
    #' @export
    toJSON = function() {
      GetOfferRecommendationsRequestObject <- list()
      if (!is.null(self$`offerIds`)) {
        GetOfferRecommendationsRequestObject[["offerIds"]] <-
          self$`offerIds`
      }
      if (!is.null(self$`cofinancePriceFilter`)) {
        GetOfferRecommendationsRequestObject[["cofinancePriceFilter"]] <-
          self$`cofinancePriceFilter`$toJSON()
      }
      if (!is.null(self$`recommendedCofinancePriceFilter`)) {
        GetOfferRecommendationsRequestObject[["recommendedCofinancePriceFilter"]] <-
          self$`recommendedCofinancePriceFilter`$toJSON()
      }
      if (!is.null(self$`competitivenessFilter`)) {
        GetOfferRecommendationsRequestObject[["competitivenessFilter"]] <-
          self$`competitivenessFilter`$toJSON()
      }
      GetOfferRecommendationsRequestObject
    },
    #' Deserialize JSON string into an instance of GetOfferRecommendationsRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of GetOfferRecommendationsRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of GetOfferRecommendationsRequest
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`offerIds`)) {
        self$`offerIds` <- ApiClient$new()$deserializeObj(this_object$`offerIds`, "array[character]", loadNamespace("ympa_r_client"))
      }
      if (!is.null(this_object$`cofinancePriceFilter`)) {
        `cofinancepricefilter_object` <- FieldStateType$new()
        `cofinancepricefilter_object`$fromJSON(jsonlite::toJSON(this_object$`cofinancePriceFilter`, auto_unbox = TRUE, digits = NA))
        self$`cofinancePriceFilter` <- `cofinancepricefilter_object`
      }
      if (!is.null(this_object$`recommendedCofinancePriceFilter`)) {
        `recommendedcofinancepricefilter_object` <- FieldStateType$new()
        `recommendedcofinancepricefilter_object`$fromJSON(jsonlite::toJSON(this_object$`recommendedCofinancePriceFilter`, auto_unbox = TRUE, digits = NA))
        self$`recommendedCofinancePriceFilter` <- `recommendedcofinancepricefilter_object`
      }
      if (!is.null(this_object$`competitivenessFilter`)) {
        `competitivenessfilter_object` <- PriceCompetitivenessType$new()
        `competitivenessfilter_object`$fromJSON(jsonlite::toJSON(this_object$`competitivenessFilter`, auto_unbox = TRUE, digits = NA))
        self$`competitivenessFilter` <- `competitivenessfilter_object`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return GetOfferRecommendationsRequest in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`offerIds`)) {
          sprintf(
          '"offerIds":
             [%s]
          ',
          paste(unlist(lapply(self$`offerIds`, function(x) paste0('"', x, '"'))), collapse = ",")
          )
        },
        if (!is.null(self$`cofinancePriceFilter`)) {
          sprintf(
          '"cofinancePriceFilter":
          %s
          ',
          jsonlite::toJSON(self$`cofinancePriceFilter`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`recommendedCofinancePriceFilter`)) {
          sprintf(
          '"recommendedCofinancePriceFilter":
          %s
          ',
          jsonlite::toJSON(self$`recommendedCofinancePriceFilter`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`competitivenessFilter`)) {
          sprintf(
          '"competitivenessFilter":
          %s
          ',
          jsonlite::toJSON(self$`competitivenessFilter`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of GetOfferRecommendationsRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of GetOfferRecommendationsRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of GetOfferRecommendationsRequest
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`offerIds` <- ApiClient$new()$deserializeObj(this_object$`offerIds`, "array[character]", loadNamespace("ympa_r_client"))
      self$`cofinancePriceFilter` <- FieldStateType$new()$fromJSON(jsonlite::toJSON(this_object$`cofinancePriceFilter`, auto_unbox = TRUE, digits = NA))
      self$`recommendedCofinancePriceFilter` <- FieldStateType$new()$fromJSON(jsonlite::toJSON(this_object$`recommendedCofinancePriceFilter`, auto_unbox = TRUE, digits = NA))
      self$`competitivenessFilter` <- PriceCompetitivenessType$new()$fromJSON(jsonlite::toJSON(this_object$`competitivenessFilter`, auto_unbox = TRUE, digits = NA))
      self
    },
    #' Validate JSON input with respect to GetOfferRecommendationsRequest
    #'
    #' @description
    #' Validate JSON input with respect to GetOfferRecommendationsRequest and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of GetOfferRecommendationsRequest
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
# GetOfferRecommendationsRequest$unlock()
#
## Below is an example to define the print function
# GetOfferRecommendationsRequest$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# GetOfferRecommendationsRequest$lock()

