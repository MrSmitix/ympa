#' Create a new FeedPublicationDTO
#'
#' @description
#' Информация о последней публикации предложений из прайс-листа на Маркете.
#'
#' @docType class
#' @title FeedPublicationDTO
#' @description FeedPublicationDTO Class
#' @format An \code{R6Class} generator object
#' @field status  \link{FeedStatusType} [optional]
#' @field full  \link{FeedPublicationFullDTO} [optional]
#' @field priceAndStockUpdate  \link{FeedPublicationPriceAndStockUpdateDTO} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
FeedPublicationDTO <- R6::R6Class(
  "FeedPublicationDTO",
  public = list(
    `status` = NULL,
    `full` = NULL,
    `priceAndStockUpdate` = NULL,
    #' Initialize a new FeedPublicationDTO class.
    #'
    #' @description
    #' Initialize a new FeedPublicationDTO class.
    #'
    #' @param status status
    #' @param full full
    #' @param priceAndStockUpdate priceAndStockUpdate
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`status` = NULL, `full` = NULL, `priceAndStockUpdate` = NULL, ...) {
      if (!is.null(`status`)) {
        if (!(`status` %in% c())) {
          stop(paste("Error! \"", `status`, "\" cannot be assigned to `status`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`status`))
        self$`status` <- `status`
      }
      if (!is.null(`full`)) {
        stopifnot(R6::is.R6(`full`))
        self$`full` <- `full`
      }
      if (!is.null(`priceAndStockUpdate`)) {
        stopifnot(R6::is.R6(`priceAndStockUpdate`))
        self$`priceAndStockUpdate` <- `priceAndStockUpdate`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return FeedPublicationDTO in JSON format
    #' @export
    toJSON = function() {
      FeedPublicationDTOObject <- list()
      if (!is.null(self$`status`)) {
        FeedPublicationDTOObject[["status"]] <-
          self$`status`$toJSON()
      }
      if (!is.null(self$`full`)) {
        FeedPublicationDTOObject[["full"]] <-
          self$`full`$toJSON()
      }
      if (!is.null(self$`priceAndStockUpdate`)) {
        FeedPublicationDTOObject[["priceAndStockUpdate"]] <-
          self$`priceAndStockUpdate`$toJSON()
      }
      FeedPublicationDTOObject
    },
    #' Deserialize JSON string into an instance of FeedPublicationDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of FeedPublicationDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of FeedPublicationDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`status`)) {
        `status_object` <- FeedStatusType$new()
        `status_object`$fromJSON(jsonlite::toJSON(this_object$`status`, auto_unbox = TRUE, digits = NA))
        self$`status` <- `status_object`
      }
      if (!is.null(this_object$`full`)) {
        `full_object` <- FeedPublicationFullDTO$new()
        `full_object`$fromJSON(jsonlite::toJSON(this_object$`full`, auto_unbox = TRUE, digits = NA))
        self$`full` <- `full_object`
      }
      if (!is.null(this_object$`priceAndStockUpdate`)) {
        `priceandstockupdate_object` <- FeedPublicationPriceAndStockUpdateDTO$new()
        `priceandstockupdate_object`$fromJSON(jsonlite::toJSON(this_object$`priceAndStockUpdate`, auto_unbox = TRUE, digits = NA))
        self$`priceAndStockUpdate` <- `priceandstockupdate_object`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return FeedPublicationDTO in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`status`)) {
          sprintf(
          '"status":
          %s
          ',
          jsonlite::toJSON(self$`status`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`full`)) {
          sprintf(
          '"full":
          %s
          ',
          jsonlite::toJSON(self$`full`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`priceAndStockUpdate`)) {
          sprintf(
          '"priceAndStockUpdate":
          %s
          ',
          jsonlite::toJSON(self$`priceAndStockUpdate`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of FeedPublicationDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of FeedPublicationDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of FeedPublicationDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`status` <- FeedStatusType$new()$fromJSON(jsonlite::toJSON(this_object$`status`, auto_unbox = TRUE, digits = NA))
      self$`full` <- FeedPublicationFullDTO$new()$fromJSON(jsonlite::toJSON(this_object$`full`, auto_unbox = TRUE, digits = NA))
      self$`priceAndStockUpdate` <- FeedPublicationPriceAndStockUpdateDTO$new()$fromJSON(jsonlite::toJSON(this_object$`priceAndStockUpdate`, auto_unbox = TRUE, digits = NA))
      self
    },
    #' Validate JSON input with respect to FeedPublicationDTO
    #'
    #' @description
    #' Validate JSON input with respect to FeedPublicationDTO and throw an exception if invalid
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
    #' @return String representation of FeedPublicationDTO
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
# FeedPublicationDTO$unlock()
#
## Below is an example to define the print function
# FeedPublicationDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# FeedPublicationDTO$lock()

