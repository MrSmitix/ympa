#' Create a new PutSkuBidsRequest
#'
#' @description
#' description.
#'
#' @docType class
#' @title PutSkuBidsRequest
#' @description PutSkuBidsRequest Class
#' @format An \code{R6Class} generator object
#' @field bids Список товаров и ставки для продвижения, которые на них нужно установить. list(\link{SkuBidItemDTO})
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
PutSkuBidsRequest <- R6::R6Class(
  "PutSkuBidsRequest",
  public = list(
    `bids` = NULL,
    #' Initialize a new PutSkuBidsRequest class.
    #'
    #' @description
    #' Initialize a new PutSkuBidsRequest class.
    #'
    #' @param bids Список товаров и ставки для продвижения, которые на них нужно установить.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`bids`, ...) {
      if (!missing(`bids`)) {
        stopifnot(is.vector(`bids`), length(`bids`) != 0)
        sapply(`bids`, function(x) stopifnot(R6::is.R6(x)))
        self$`bids` <- `bids`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return PutSkuBidsRequest in JSON format
    #' @export
    toJSON = function() {
      PutSkuBidsRequestObject <- list()
      if (!is.null(self$`bids`)) {
        PutSkuBidsRequestObject[["bids"]] <-
          lapply(self$`bids`, function(x) x$toJSON())
      }
      PutSkuBidsRequestObject
    },
    #' Deserialize JSON string into an instance of PutSkuBidsRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of PutSkuBidsRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of PutSkuBidsRequest
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`bids`)) {
        self$`bids` <- ApiClient$new()$deserializeObj(this_object$`bids`, "array[SkuBidItemDTO]", loadNamespace("ympa_r_client"))
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return PutSkuBidsRequest in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`bids`)) {
          sprintf(
          '"bids":
          [%s]
',
          paste(sapply(self$`bids`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of PutSkuBidsRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of PutSkuBidsRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of PutSkuBidsRequest
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`bids` <- ApiClient$new()$deserializeObj(this_object$`bids`, "array[SkuBidItemDTO]", loadNamespace("ympa_r_client"))
      self
    },
    #' Validate JSON input with respect to PutSkuBidsRequest
    #'
    #' @description
    #' Validate JSON input with respect to PutSkuBidsRequest and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `bids`
      if (!is.null(input_json$`bids`)) {
        stopifnot(is.vector(input_json$`bids`), length(input_json$`bids`) != 0)
        tmp <- sapply(input_json$`bids`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PutSkuBidsRequest: the required field `bids` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of PutSkuBidsRequest
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
      # check if the required `bids` is null
      if (is.null(self$`bids`)) {
        return(FALSE)
      }

      if (length(self$`bids`) > 1500) {
        return(FALSE)
      }
      if (length(self$`bids`) < 1) {
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
      # check if the required `bids` is null
      if (is.null(self$`bids`)) {
        invalid_fields["bids"] <- "Non-nullable required field `bids` cannot be null."
      }

      if (length(self$`bids`) > 1500) {
        invalid_fields["bids"] <- "Invalid length for `bids`, number of items must be less than or equal to 1500."
      }
      if (length(self$`bids`) < 1) {
        invalid_fields["bids"] <- "Invalid length for ``, number of items must be greater than or equal to 1."
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
# PutSkuBidsRequest$unlock()
#
## Below is an example to define the print function
# PutSkuBidsRequest$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# PutSkuBidsRequest$lock()

