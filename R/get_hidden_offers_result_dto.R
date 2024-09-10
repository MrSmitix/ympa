#' Create a new GetHiddenOffersResultDTO
#'
#' @description
#' Список скрытых вами товаров. 
#'
#' @docType class
#' @title GetHiddenOffersResultDTO
#' @description GetHiddenOffersResultDTO Class
#' @format An \code{R6Class} generator object
#' @field paging  \link{ScrollingPagerDTO} [optional]
#' @field hiddenOffers Список скрытых товаров. list(\link{HiddenOfferDTO})
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
GetHiddenOffersResultDTO <- R6::R6Class(
  "GetHiddenOffersResultDTO",
  public = list(
    `paging` = NULL,
    `hiddenOffers` = NULL,
    #' Initialize a new GetHiddenOffersResultDTO class.
    #'
    #' @description
    #' Initialize a new GetHiddenOffersResultDTO class.
    #'
    #' @param hiddenOffers Список скрытых товаров.
    #' @param paging paging
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`hiddenOffers`, `paging` = NULL, ...) {
      if (!missing(`hiddenOffers`)) {
        stopifnot(is.vector(`hiddenOffers`), length(`hiddenOffers`) != 0)
        sapply(`hiddenOffers`, function(x) stopifnot(R6::is.R6(x)))
        self$`hiddenOffers` <- `hiddenOffers`
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
    #' @return GetHiddenOffersResultDTO in JSON format
    #' @export
    toJSON = function() {
      GetHiddenOffersResultDTOObject <- list()
      if (!is.null(self$`paging`)) {
        GetHiddenOffersResultDTOObject[["paging"]] <-
          self$`paging`$toJSON()
      }
      if (!is.null(self$`hiddenOffers`)) {
        GetHiddenOffersResultDTOObject[["hiddenOffers"]] <-
          lapply(self$`hiddenOffers`, function(x) x$toJSON())
      }
      GetHiddenOffersResultDTOObject
    },
    #' Deserialize JSON string into an instance of GetHiddenOffersResultDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of GetHiddenOffersResultDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of GetHiddenOffersResultDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`paging`)) {
        `paging_object` <- ScrollingPagerDTO$new()
        `paging_object`$fromJSON(jsonlite::toJSON(this_object$`paging`, auto_unbox = TRUE, digits = NA))
        self$`paging` <- `paging_object`
      }
      if (!is.null(this_object$`hiddenOffers`)) {
        self$`hiddenOffers` <- ApiClient$new()$deserializeObj(this_object$`hiddenOffers`, "array[HiddenOfferDTO]", loadNamespace("ympa_r_client"))
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return GetHiddenOffersResultDTO in JSON format
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
        if (!is.null(self$`hiddenOffers`)) {
          sprintf(
          '"hiddenOffers":
          [%s]
',
          paste(sapply(self$`hiddenOffers`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of GetHiddenOffersResultDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of GetHiddenOffersResultDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of GetHiddenOffersResultDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`paging` <- ScrollingPagerDTO$new()$fromJSON(jsonlite::toJSON(this_object$`paging`, auto_unbox = TRUE, digits = NA))
      self$`hiddenOffers` <- ApiClient$new()$deserializeObj(this_object$`hiddenOffers`, "array[HiddenOfferDTO]", loadNamespace("ympa_r_client"))
      self
    },
    #' Validate JSON input with respect to GetHiddenOffersResultDTO
    #'
    #' @description
    #' Validate JSON input with respect to GetHiddenOffersResultDTO and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `hiddenOffers`
      if (!is.null(input_json$`hiddenOffers`)) {
        stopifnot(is.vector(input_json$`hiddenOffers`), length(input_json$`hiddenOffers`) != 0)
        tmp <- sapply(input_json$`hiddenOffers`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for GetHiddenOffersResultDTO: the required field `hiddenOffers` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of GetHiddenOffersResultDTO
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
      # check if the required `hiddenOffers` is null
      if (is.null(self$`hiddenOffers`)) {
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
      # check if the required `hiddenOffers` is null
      if (is.null(self$`hiddenOffers`)) {
        invalid_fields["hiddenOffers"] <- "Non-nullable required field `hiddenOffers` cannot be null."
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
# GetHiddenOffersResultDTO$unlock()
#
## Below is an example to define the print function
# GetHiddenOffersResultDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# GetHiddenOffersResultDTO$lock()

