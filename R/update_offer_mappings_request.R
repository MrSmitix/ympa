#' Create a new UpdateOfferMappingsRequest
#'
#' @description
#' UpdateOfferMappingsRequest Class
#'
#' @docType class
#' @title UpdateOfferMappingsRequest
#' @description UpdateOfferMappingsRequest Class
#' @format An \code{R6Class} generator object
#' @field offerMappings Перечень товаров, которые нужно добавить или обновить. list(\link{UpdateOfferMappingDTO})
#' @field onlyPartnerMediaContent Будут использоваться только переданные вами изображения товаров.  Значение по умолчанию — `false`. Если вы хотите заменить изображения, которые добавил Маркет, передайте значение `true`. character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
UpdateOfferMappingsRequest <- R6::R6Class(
  "UpdateOfferMappingsRequest",
  public = list(
    `offerMappings` = NULL,
    `onlyPartnerMediaContent` = NULL,
    #' Initialize a new UpdateOfferMappingsRequest class.
    #'
    #' @description
    #' Initialize a new UpdateOfferMappingsRequest class.
    #'
    #' @param offerMappings Перечень товаров, которые нужно добавить или обновить.
    #' @param onlyPartnerMediaContent Будут использоваться только переданные вами изображения товаров.  Значение по умолчанию — `false`. Если вы хотите заменить изображения, которые добавил Маркет, передайте значение `true`.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`offerMappings`, `onlyPartnerMediaContent` = NULL, ...) {
      if (!missing(`offerMappings`)) {
        stopifnot(is.vector(`offerMappings`), length(`offerMappings`) != 0)
        sapply(`offerMappings`, function(x) stopifnot(R6::is.R6(x)))
        self$`offerMappings` <- `offerMappings`
      }
      if (!is.null(`onlyPartnerMediaContent`)) {
        if (!(is.logical(`onlyPartnerMediaContent`) && length(`onlyPartnerMediaContent`) == 1)) {
          stop(paste("Error! Invalid data for `onlyPartnerMediaContent`. Must be a boolean:", `onlyPartnerMediaContent`))
        }
        self$`onlyPartnerMediaContent` <- `onlyPartnerMediaContent`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return UpdateOfferMappingsRequest in JSON format
    #' @export
    toJSON = function() {
      UpdateOfferMappingsRequestObject <- list()
      if (!is.null(self$`offerMappings`)) {
        UpdateOfferMappingsRequestObject[["offerMappings"]] <-
          lapply(self$`offerMappings`, function(x) x$toJSON())
      }
      if (!is.null(self$`onlyPartnerMediaContent`)) {
        UpdateOfferMappingsRequestObject[["onlyPartnerMediaContent"]] <-
          self$`onlyPartnerMediaContent`
      }
      UpdateOfferMappingsRequestObject
    },
    #' Deserialize JSON string into an instance of UpdateOfferMappingsRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of UpdateOfferMappingsRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of UpdateOfferMappingsRequest
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`offerMappings`)) {
        self$`offerMappings` <- ApiClient$new()$deserializeObj(this_object$`offerMappings`, "array[UpdateOfferMappingDTO]", loadNamespace("ympa_r_client"))
      }
      if (!is.null(this_object$`onlyPartnerMediaContent`)) {
        self$`onlyPartnerMediaContent` <- this_object$`onlyPartnerMediaContent`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return UpdateOfferMappingsRequest in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`offerMappings`)) {
          sprintf(
          '"offerMappings":
          [%s]
',
          paste(sapply(self$`offerMappings`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        },
        if (!is.null(self$`onlyPartnerMediaContent`)) {
          sprintf(
          '"onlyPartnerMediaContent":
            %s
                    ',
          tolower(self$`onlyPartnerMediaContent`)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of UpdateOfferMappingsRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of UpdateOfferMappingsRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of UpdateOfferMappingsRequest
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`offerMappings` <- ApiClient$new()$deserializeObj(this_object$`offerMappings`, "array[UpdateOfferMappingDTO]", loadNamespace("ympa_r_client"))
      self$`onlyPartnerMediaContent` <- this_object$`onlyPartnerMediaContent`
      self
    },
    #' Validate JSON input with respect to UpdateOfferMappingsRequest
    #'
    #' @description
    #' Validate JSON input with respect to UpdateOfferMappingsRequest and throw an exception if invalid
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
        stop(paste("The JSON input `", input, "` is invalid for UpdateOfferMappingsRequest: the required field `offerMappings` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of UpdateOfferMappingsRequest
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

      if (length(self$`offerMappings`) > 500) {
        return(FALSE)
      }
      if (length(self$`offerMappings`) < 1) {
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

      if (length(self$`offerMappings`) > 500) {
        invalid_fields["offerMappings"] <- "Invalid length for `offerMappings`, number of items must be less than or equal to 500."
      }
      if (length(self$`offerMappings`) < 1) {
        invalid_fields["offerMappings"] <- "Invalid length for ``, number of items must be greater than or equal to 1."
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
# UpdateOfferMappingsRequest$unlock()
#
## Below is an example to define the print function
# UpdateOfferMappingsRequest$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# UpdateOfferMappingsRequest$lock()

