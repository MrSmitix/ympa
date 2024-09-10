#' Create a new OfferMappingEntriesDTO
#'
#' @description
#' Информация о товарах в каталоге.
#'
#' @docType class
#' @title OfferMappingEntriesDTO
#' @description OfferMappingEntriesDTO Class
#' @format An \code{R6Class} generator object
#' @field paging  \link{ScrollingPagerDTO} [optional]
#' @field offerMappingEntries Информация о товарах в каталоге. list(\link{OfferMappingEntryDTO})
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
OfferMappingEntriesDTO <- R6::R6Class(
  "OfferMappingEntriesDTO",
  public = list(
    `paging` = NULL,
    `offerMappingEntries` = NULL,
    #' Initialize a new OfferMappingEntriesDTO class.
    #'
    #' @description
    #' Initialize a new OfferMappingEntriesDTO class.
    #'
    #' @param offerMappingEntries Информация о товарах в каталоге.
    #' @param paging paging
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`offerMappingEntries`, `paging` = NULL, ...) {
      if (!missing(`offerMappingEntries`)) {
        stopifnot(is.vector(`offerMappingEntries`), length(`offerMappingEntries`) != 0)
        sapply(`offerMappingEntries`, function(x) stopifnot(R6::is.R6(x)))
        self$`offerMappingEntries` <- `offerMappingEntries`
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
    #' @return OfferMappingEntriesDTO in JSON format
    #' @export
    toJSON = function() {
      OfferMappingEntriesDTOObject <- list()
      if (!is.null(self$`paging`)) {
        OfferMappingEntriesDTOObject[["paging"]] <-
          self$`paging`$toJSON()
      }
      if (!is.null(self$`offerMappingEntries`)) {
        OfferMappingEntriesDTOObject[["offerMappingEntries"]] <-
          lapply(self$`offerMappingEntries`, function(x) x$toJSON())
      }
      OfferMappingEntriesDTOObject
    },
    #' Deserialize JSON string into an instance of OfferMappingEntriesDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of OfferMappingEntriesDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of OfferMappingEntriesDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`paging`)) {
        `paging_object` <- ScrollingPagerDTO$new()
        `paging_object`$fromJSON(jsonlite::toJSON(this_object$`paging`, auto_unbox = TRUE, digits = NA))
        self$`paging` <- `paging_object`
      }
      if (!is.null(this_object$`offerMappingEntries`)) {
        self$`offerMappingEntries` <- ApiClient$new()$deserializeObj(this_object$`offerMappingEntries`, "array[OfferMappingEntryDTO]", loadNamespace("ympa_r_client"))
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return OfferMappingEntriesDTO in JSON format
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
        if (!is.null(self$`offerMappingEntries`)) {
          sprintf(
          '"offerMappingEntries":
          [%s]
',
          paste(sapply(self$`offerMappingEntries`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of OfferMappingEntriesDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of OfferMappingEntriesDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of OfferMappingEntriesDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`paging` <- ScrollingPagerDTO$new()$fromJSON(jsonlite::toJSON(this_object$`paging`, auto_unbox = TRUE, digits = NA))
      self$`offerMappingEntries` <- ApiClient$new()$deserializeObj(this_object$`offerMappingEntries`, "array[OfferMappingEntryDTO]", loadNamespace("ympa_r_client"))
      self
    },
    #' Validate JSON input with respect to OfferMappingEntriesDTO
    #'
    #' @description
    #' Validate JSON input with respect to OfferMappingEntriesDTO and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `offerMappingEntries`
      if (!is.null(input_json$`offerMappingEntries`)) {
        stopifnot(is.vector(input_json$`offerMappingEntries`), length(input_json$`offerMappingEntries`) != 0)
        tmp <- sapply(input_json$`offerMappingEntries`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for OfferMappingEntriesDTO: the required field `offerMappingEntries` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of OfferMappingEntriesDTO
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
      # check if the required `offerMappingEntries` is null
      if (is.null(self$`offerMappingEntries`)) {
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
      # check if the required `offerMappingEntries` is null
      if (is.null(self$`offerMappingEntries`)) {
        invalid_fields["offerMappingEntries"] <- "Non-nullable required field `offerMappingEntries` cannot be null."
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
# OfferMappingEntriesDTO$unlock()
#
## Below is an example to define the print function
# OfferMappingEntriesDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# OfferMappingEntriesDTO$lock()

