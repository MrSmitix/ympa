#' Create a new ConfirmPricesRequest
#'
#' @description
#' Запрос на подтверждение цены. 
#'
#' @docType class
#' @title ConfirmPricesRequest
#' @description ConfirmPricesRequest Class
#' @format An \code{R6Class} generator object
#' @field offerIds Идентификаторы товаров, у которых подтверждается цена. list(character)
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ConfirmPricesRequest <- R6::R6Class(
  "ConfirmPricesRequest",
  public = list(
    `offerIds` = NULL,
    #' Initialize a new ConfirmPricesRequest class.
    #'
    #' @description
    #' Initialize a new ConfirmPricesRequest class.
    #'
    #' @param offerIds Идентификаторы товаров, у которых подтверждается цена.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`offerIds`, ...) {
      if (!missing(`offerIds`)) {
        stopifnot(is.vector(`offerIds`), length(`offerIds`) != 0)
        sapply(`offerIds`, function(x) stopifnot(is.character(x)))
        self$`offerIds` <- `offerIds`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return ConfirmPricesRequest in JSON format
    #' @export
    toJSON = function() {
      ConfirmPricesRequestObject <- list()
      if (!is.null(self$`offerIds`)) {
        ConfirmPricesRequestObject[["offerIds"]] <-
          self$`offerIds`
      }
      ConfirmPricesRequestObject
    },
    #' Deserialize JSON string into an instance of ConfirmPricesRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of ConfirmPricesRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of ConfirmPricesRequest
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`offerIds`)) {
        self$`offerIds` <- ApiClient$new()$deserializeObj(this_object$`offerIds`, "array[character]", loadNamespace("ympa_r_client"))
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return ConfirmPricesRequest in JSON format
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
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of ConfirmPricesRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of ConfirmPricesRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of ConfirmPricesRequest
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`offerIds` <- ApiClient$new()$deserializeObj(this_object$`offerIds`, "array[character]", loadNamespace("ympa_r_client"))
      self
    },
    #' Validate JSON input with respect to ConfirmPricesRequest
    #'
    #' @description
    #' Validate JSON input with respect to ConfirmPricesRequest and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `offerIds`
      if (!is.null(input_json$`offerIds`)) {
        stopifnot(is.vector(input_json$`offerIds`), length(input_json$`offerIds`) != 0)
        tmp <- sapply(input_json$`offerIds`, function(x) stopifnot(is.character(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ConfirmPricesRequest: the required field `offerIds` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of ConfirmPricesRequest
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
      # check if the required `offerIds` is null
      if (is.null(self$`offerIds`)) {
        return(FALSE)
      }

      if (length(self$`offerIds`) > 200) {
        return(FALSE)
      }
      if (length(self$`offerIds`) < 1) {
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
      # check if the required `offerIds` is null
      if (is.null(self$`offerIds`)) {
        invalid_fields["offerIds"] <- "Non-nullable required field `offerIds` cannot be null."
      }

      if (length(self$`offerIds`) > 200) {
        invalid_fields["offerIds"] <- "Invalid length for `offerIds`, number of items must be less than or equal to 200."
      }
      if (length(self$`offerIds`) < 1) {
        invalid_fields["offerIds"] <- "Invalid length for ``, number of items must be greater than or equal to 1."
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
# ConfirmPricesRequest$unlock()
#
## Below is an example to define the print function
# ConfirmPricesRequest$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# ConfirmPricesRequest$lock()

