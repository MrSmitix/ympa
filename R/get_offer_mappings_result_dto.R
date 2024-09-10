#' Create a new GetOfferMappingsResultDTO
#'
#' @description
#' Информация о товарах.
#'
#' @docType class
#' @title GetOfferMappingsResultDTO
#' @description GetOfferMappingsResultDTO Class
#' @format An \code{R6Class} generator object
#' @field paging  \link{ScrollingPagerDTO} [optional]
#' @field offerMappings Информация о товарах. list(\link{GetOfferMappingDTO})
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
GetOfferMappingsResultDTO <- R6::R6Class(
  "GetOfferMappingsResultDTO",
  public = list(
    `paging` = NULL,
    `offerMappings` = NULL,
    #' Initialize a new GetOfferMappingsResultDTO class.
    #'
    #' @description
    #' Initialize a new GetOfferMappingsResultDTO class.
    #'
    #' @param offerMappings Информация о товарах.
    #' @param paging paging
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`offerMappings`, `paging` = NULL, ...) {
      if (!missing(`offerMappings`)) {
        stopifnot(is.vector(`offerMappings`), length(`offerMappings`) != 0)
        sapply(`offerMappings`, function(x) stopifnot(R6::is.R6(x)))
        self$`offerMappings` <- `offerMappings`
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
    #' @return GetOfferMappingsResultDTO in JSON format
    #' @export
    toJSON = function() {
      GetOfferMappingsResultDTOObject <- list()
      if (!is.null(self$`paging`)) {
        GetOfferMappingsResultDTOObject[["paging"]] <-
          self$`paging`$toJSON()
      }
      if (!is.null(self$`offerMappings`)) {
        GetOfferMappingsResultDTOObject[["offerMappings"]] <-
          lapply(self$`offerMappings`, function(x) x$toJSON())
      }
      GetOfferMappingsResultDTOObject
    },
    #' Deserialize JSON string into an instance of GetOfferMappingsResultDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of GetOfferMappingsResultDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of GetOfferMappingsResultDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`paging`)) {
        `paging_object` <- ScrollingPagerDTO$new()
        `paging_object`$fromJSON(jsonlite::toJSON(this_object$`paging`, auto_unbox = TRUE, digits = NA))
        self$`paging` <- `paging_object`
      }
      if (!is.null(this_object$`offerMappings`)) {
        self$`offerMappings` <- ApiClient$new()$deserializeObj(this_object$`offerMappings`, "array[GetOfferMappingDTO]", loadNamespace("ympa_r_client"))
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return GetOfferMappingsResultDTO in JSON format
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
        if (!is.null(self$`offerMappings`)) {
          sprintf(
          '"offerMappings":
          [%s]
',
          paste(sapply(self$`offerMappings`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of GetOfferMappingsResultDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of GetOfferMappingsResultDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of GetOfferMappingsResultDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`paging` <- ScrollingPagerDTO$new()$fromJSON(jsonlite::toJSON(this_object$`paging`, auto_unbox = TRUE, digits = NA))
      self$`offerMappings` <- ApiClient$new()$deserializeObj(this_object$`offerMappings`, "array[GetOfferMappingDTO]", loadNamespace("ympa_r_client"))
      self
    },
    #' Validate JSON input with respect to GetOfferMappingsResultDTO
    #'
    #' @description
    #' Validate JSON input with respect to GetOfferMappingsResultDTO and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `offerMappings`
      if (!is.null(input_json$`offerMappings`)) {
        stopifnot(is.vector(input_json$`offerMappings`), length(input_json$`offerMappings`) != 0)
        tmp <- sapply(input_json$`offerMappings`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for GetOfferMappingsResultDTO: the required field `offerMappings` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of GetOfferMappingsResultDTO
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
      # check if the required `offerMappings` is null
      if (is.null(self$`offerMappings`)) {
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
      # check if the required `offerMappings` is null
      if (is.null(self$`offerMappings`)) {
        invalid_fields["offerMappings"] <- "Non-nullable required field `offerMappings` cannot be null."
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
# GetOfferMappingsResultDTO$unlock()
#
## Below is an example to define the print function
# GetOfferMappingsResultDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# GetOfferMappingsResultDTO$lock()

