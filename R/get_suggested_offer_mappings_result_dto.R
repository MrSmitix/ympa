#' Create a new GetSuggestedOfferMappingsResultDTO
#'
#' @description
#' Подобранные карточки на Маркете.
#'
#' @docType class
#' @title GetSuggestedOfferMappingsResultDTO
#' @description GetSuggestedOfferMappingsResultDTO Class
#' @format An \code{R6Class} generator object
#' @field offers Список товаров. list(\link{SuggestedOfferMappingDTO})
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
GetSuggestedOfferMappingsResultDTO <- R6::R6Class(
  "GetSuggestedOfferMappingsResultDTO",
  public = list(
    `offers` = NULL,
    #' Initialize a new GetSuggestedOfferMappingsResultDTO class.
    #'
    #' @description
    #' Initialize a new GetSuggestedOfferMappingsResultDTO class.
    #'
    #' @param offers Список товаров.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`offers`, ...) {
      if (!missing(`offers`)) {
        stopifnot(is.vector(`offers`), length(`offers`) != 0)
        sapply(`offers`, function(x) stopifnot(R6::is.R6(x)))
        self$`offers` <- `offers`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return GetSuggestedOfferMappingsResultDTO in JSON format
    #' @export
    toJSON = function() {
      GetSuggestedOfferMappingsResultDTOObject <- list()
      if (!is.null(self$`offers`)) {
        GetSuggestedOfferMappingsResultDTOObject[["offers"]] <-
          lapply(self$`offers`, function(x) x$toJSON())
      }
      GetSuggestedOfferMappingsResultDTOObject
    },
    #' Deserialize JSON string into an instance of GetSuggestedOfferMappingsResultDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of GetSuggestedOfferMappingsResultDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of GetSuggestedOfferMappingsResultDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`offers`)) {
        self$`offers` <- ApiClient$new()$deserializeObj(this_object$`offers`, "array[SuggestedOfferMappingDTO]", loadNamespace("ympa_r_client"))
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return GetSuggestedOfferMappingsResultDTO in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`offers`)) {
          sprintf(
          '"offers":
          [%s]
',
          paste(sapply(self$`offers`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of GetSuggestedOfferMappingsResultDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of GetSuggestedOfferMappingsResultDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of GetSuggestedOfferMappingsResultDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`offers` <- ApiClient$new()$deserializeObj(this_object$`offers`, "array[SuggestedOfferMappingDTO]", loadNamespace("ympa_r_client"))
      self
    },
    #' Validate JSON input with respect to GetSuggestedOfferMappingsResultDTO
    #'
    #' @description
    #' Validate JSON input with respect to GetSuggestedOfferMappingsResultDTO and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `offers`
      if (!is.null(input_json$`offers`)) {
        stopifnot(is.vector(input_json$`offers`), length(input_json$`offers`) != 0)
        tmp <- sapply(input_json$`offers`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for GetSuggestedOfferMappingsResultDTO: the required field `offers` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of GetSuggestedOfferMappingsResultDTO
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
      # check if the required `offers` is null
      if (is.null(self$`offers`)) {
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
      # check if the required `offers` is null
      if (is.null(self$`offers`)) {
        invalid_fields["offers"] <- "Non-nullable required field `offers` cannot be null."
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
# GetSuggestedOfferMappingsResultDTO$unlock()
#
## Below is an example to define the print function
# GetSuggestedOfferMappingsResultDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# GetSuggestedOfferMappingsResultDTO$lock()

