#' Create a new DeletePromoOffersRequest
#'
#' @description
#' Удаление товаров из акции.  Чтобы убрать:  * все товары из акции и больше не участвовать в ней, передайте значение `true` в параметре `deleteAllOffers`;  * часть товаров, передайте их идентификаторы в параметре `offersIds`. 
#'
#' @docType class
#' @title DeletePromoOffersRequest
#' @description DeletePromoOffersRequest Class
#' @format An \code{R6Class} generator object
#' @field promoId Идентификатор акции. character
#' @field deleteAllOffers Чтобы убрать все товары из акции и больше не участвовать в ней, передайте значение `true` и не передавайте параметр `offerIds`. character [optional]
#' @field offerIds Товары, которые нужно убрать из акции. list(character) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
DeletePromoOffersRequest <- R6::R6Class(
  "DeletePromoOffersRequest",
  public = list(
    `promoId` = NULL,
    `deleteAllOffers` = NULL,
    `offerIds` = NULL,
    #' Initialize a new DeletePromoOffersRequest class.
    #'
    #' @description
    #' Initialize a new DeletePromoOffersRequest class.
    #'
    #' @param promoId Идентификатор акции.
    #' @param deleteAllOffers Чтобы убрать все товары из акции и больше не участвовать в ней, передайте значение `true` и не передавайте параметр `offerIds`.
    #' @param offerIds Товары, которые нужно убрать из акции.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`promoId`, `deleteAllOffers` = NULL, `offerIds` = NULL, ...) {
      if (!missing(`promoId`)) {
        if (!(is.character(`promoId`) && length(`promoId`) == 1)) {
          stop(paste("Error! Invalid data for `promoId`. Must be a string:", `promoId`))
        }
        self$`promoId` <- `promoId`
      }
      if (!is.null(`deleteAllOffers`)) {
        if (!(is.logical(`deleteAllOffers`) && length(`deleteAllOffers`) == 1)) {
          stop(paste("Error! Invalid data for `deleteAllOffers`. Must be a boolean:", `deleteAllOffers`))
        }
        self$`deleteAllOffers` <- `deleteAllOffers`
      }
      if (!is.null(`offerIds`)) {
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
    #' @return DeletePromoOffersRequest in JSON format
    #' @export
    toJSON = function() {
      DeletePromoOffersRequestObject <- list()
      if (!is.null(self$`promoId`)) {
        DeletePromoOffersRequestObject[["promoId"]] <-
          self$`promoId`
      }
      if (!is.null(self$`deleteAllOffers`)) {
        DeletePromoOffersRequestObject[["deleteAllOffers"]] <-
          self$`deleteAllOffers`
      }
      if (!is.null(self$`offerIds`)) {
        DeletePromoOffersRequestObject[["offerIds"]] <-
          self$`offerIds`
      }
      DeletePromoOffersRequestObject
    },
    #' Deserialize JSON string into an instance of DeletePromoOffersRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of DeletePromoOffersRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of DeletePromoOffersRequest
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`promoId`)) {
        self$`promoId` <- this_object$`promoId`
      }
      if (!is.null(this_object$`deleteAllOffers`)) {
        self$`deleteAllOffers` <- this_object$`deleteAllOffers`
      }
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
    #' @return DeletePromoOffersRequest in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`promoId`)) {
          sprintf(
          '"promoId":
            "%s"
                    ',
          self$`promoId`
          )
        },
        if (!is.null(self$`deleteAllOffers`)) {
          sprintf(
          '"deleteAllOffers":
            %s
                    ',
          tolower(self$`deleteAllOffers`)
          )
        },
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
    #' Deserialize JSON string into an instance of DeletePromoOffersRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of DeletePromoOffersRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of DeletePromoOffersRequest
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`promoId` <- this_object$`promoId`
      self$`deleteAllOffers` <- this_object$`deleteAllOffers`
      self$`offerIds` <- ApiClient$new()$deserializeObj(this_object$`offerIds`, "array[character]", loadNamespace("ympa_r_client"))
      self
    },
    #' Validate JSON input with respect to DeletePromoOffersRequest
    #'
    #' @description
    #' Validate JSON input with respect to DeletePromoOffersRequest and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `promoId`
      if (!is.null(input_json$`promoId`)) {
        if (!(is.character(input_json$`promoId`) && length(input_json$`promoId`) == 1)) {
          stop(paste("Error! Invalid data for `promoId`. Must be a string:", input_json$`promoId`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for DeletePromoOffersRequest: the required field `promoId` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of DeletePromoOffersRequest
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
      # check if the required `promoId` is null
      if (is.null(self$`promoId`)) {
        return(FALSE)
      }

      if (length(self$`offerIds`) > 500) {
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
      # check if the required `promoId` is null
      if (is.null(self$`promoId`)) {
        invalid_fields["promoId"] <- "Non-nullable required field `promoId` cannot be null."
      }

      if (length(self$`offerIds`) > 500) {
        invalid_fields["offerIds"] <- "Invalid length for `offerIds`, number of items must be less than or equal to 500."
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
# DeletePromoOffersRequest$unlock()
#
## Below is an example to define the print function
# DeletePromoOffersRequest$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# DeletePromoOffersRequest$lock()

