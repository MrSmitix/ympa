#' Create a new DeleteHiddenOffersRequest
#'
#' @description
#' Запрос на возобновление показа оферов.
#'
#' @docType class
#' @title DeleteHiddenOffersRequest
#' @description DeleteHiddenOffersRequest Class
#' @format An \code{R6Class} generator object
#' @field hiddenOffers Список скрытых товаров. list(\link{HiddenOfferDTO})
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
DeleteHiddenOffersRequest <- R6::R6Class(
  "DeleteHiddenOffersRequest",
  public = list(
    `hiddenOffers` = NULL,
    #' Initialize a new DeleteHiddenOffersRequest class.
    #'
    #' @description
    #' Initialize a new DeleteHiddenOffersRequest class.
    #'
    #' @param hiddenOffers Список скрытых товаров.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`hiddenOffers`, ...) {
      if (!missing(`hiddenOffers`)) {
        stopifnot(is.vector(`hiddenOffers`), length(`hiddenOffers`) != 0)
        sapply(`hiddenOffers`, function(x) stopifnot(R6::is.R6(x)))
        self$`hiddenOffers` <- `hiddenOffers`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return DeleteHiddenOffersRequest in JSON format
    #' @export
    toJSON = function() {
      DeleteHiddenOffersRequestObject <- list()
      if (!is.null(self$`hiddenOffers`)) {
        DeleteHiddenOffersRequestObject[["hiddenOffers"]] <-
          lapply(self$`hiddenOffers`, function(x) x$toJSON())
      }
      DeleteHiddenOffersRequestObject
    },
    #' Deserialize JSON string into an instance of DeleteHiddenOffersRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of DeleteHiddenOffersRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of DeleteHiddenOffersRequest
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
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
    #' @return DeleteHiddenOffersRequest in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
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
    #' Deserialize JSON string into an instance of DeleteHiddenOffersRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of DeleteHiddenOffersRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of DeleteHiddenOffersRequest
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`hiddenOffers` <- ApiClient$new()$deserializeObj(this_object$`hiddenOffers`, "array[HiddenOfferDTO]", loadNamespace("ympa_r_client"))
      self
    },
    #' Validate JSON input with respect to DeleteHiddenOffersRequest
    #'
    #' @description
    #' Validate JSON input with respect to DeleteHiddenOffersRequest and throw an exception if invalid
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
        stop(paste("The JSON input `", input, "` is invalid for DeleteHiddenOffersRequest: the required field `hiddenOffers` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of DeleteHiddenOffersRequest
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

      if (length(self$`hiddenOffers`) > 500) {
        return(FALSE)
      }
      if (length(self$`hiddenOffers`) < 1) {
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

      if (length(self$`hiddenOffers`) > 500) {
        invalid_fields["hiddenOffers"] <- "Invalid length for `hiddenOffers`, number of items must be less than or equal to 500."
      }
      if (length(self$`hiddenOffers`) < 1) {
        invalid_fields["hiddenOffers"] <- "Invalid length for ``, number of items must be greater than or equal to 1."
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
# DeleteHiddenOffersRequest$unlock()
#
## Below is an example to define the print function
# DeleteHiddenOffersRequest$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# DeleteHiddenOffersRequest$lock()

