#' Create a new UpdateOfferMappingDTO
#'
#' @description
#' Информация о товаре.
#'
#' @docType class
#' @title UpdateOfferMappingDTO
#' @description UpdateOfferMappingDTO Class
#' @format An \code{R6Class} generator object
#' @field offer  \link{UpdateOfferDTO}
#' @field mapping  \link{UpdateMappingDTO} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
UpdateOfferMappingDTO <- R6::R6Class(
  "UpdateOfferMappingDTO",
  public = list(
    `offer` = NULL,
    `mapping` = NULL,
    #' Initialize a new UpdateOfferMappingDTO class.
    #'
    #' @description
    #' Initialize a new UpdateOfferMappingDTO class.
    #'
    #' @param offer offer
    #' @param mapping mapping
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`offer`, `mapping` = NULL, ...) {
      if (!missing(`offer`)) {
        stopifnot(R6::is.R6(`offer`))
        self$`offer` <- `offer`
      }
      if (!is.null(`mapping`)) {
        stopifnot(R6::is.R6(`mapping`))
        self$`mapping` <- `mapping`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return UpdateOfferMappingDTO in JSON format
    #' @export
    toJSON = function() {
      UpdateOfferMappingDTOObject <- list()
      if (!is.null(self$`offer`)) {
        UpdateOfferMappingDTOObject[["offer"]] <-
          self$`offer`$toJSON()
      }
      if (!is.null(self$`mapping`)) {
        UpdateOfferMappingDTOObject[["mapping"]] <-
          self$`mapping`$toJSON()
      }
      UpdateOfferMappingDTOObject
    },
    #' Deserialize JSON string into an instance of UpdateOfferMappingDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of UpdateOfferMappingDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of UpdateOfferMappingDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`offer`)) {
        `offer_object` <- UpdateOfferDTO$new()
        `offer_object`$fromJSON(jsonlite::toJSON(this_object$`offer`, auto_unbox = TRUE, digits = NA))
        self$`offer` <- `offer_object`
      }
      if (!is.null(this_object$`mapping`)) {
        `mapping_object` <- UpdateMappingDTO$new()
        `mapping_object`$fromJSON(jsonlite::toJSON(this_object$`mapping`, auto_unbox = TRUE, digits = NA))
        self$`mapping` <- `mapping_object`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return UpdateOfferMappingDTO in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`offer`)) {
          sprintf(
          '"offer":
          %s
          ',
          jsonlite::toJSON(self$`offer`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`mapping`)) {
          sprintf(
          '"mapping":
          %s
          ',
          jsonlite::toJSON(self$`mapping`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of UpdateOfferMappingDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of UpdateOfferMappingDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of UpdateOfferMappingDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`offer` <- UpdateOfferDTO$new()$fromJSON(jsonlite::toJSON(this_object$`offer`, auto_unbox = TRUE, digits = NA))
      self$`mapping` <- UpdateMappingDTO$new()$fromJSON(jsonlite::toJSON(this_object$`mapping`, auto_unbox = TRUE, digits = NA))
      self
    },
    #' Validate JSON input with respect to UpdateOfferMappingDTO
    #'
    #' @description
    #' Validate JSON input with respect to UpdateOfferMappingDTO and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `offer`
      if (!is.null(input_json$`offer`)) {
        stopifnot(R6::is.R6(input_json$`offer`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for UpdateOfferMappingDTO: the required field `offer` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of UpdateOfferMappingDTO
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
      # check if the required `offer` is null
      if (is.null(self$`offer`)) {
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
      # check if the required `offer` is null
      if (is.null(self$`offer`)) {
        invalid_fields["offer"] <- "Non-nullable required field `offer` cannot be null."
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
# UpdateOfferMappingDTO$unlock()
#
## Below is an example to define the print function
# UpdateOfferMappingDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# UpdateOfferMappingDTO$lock()

