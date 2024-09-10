#' Create a new GetPromoOffersRequest
#'
#' @description
#' Получение списка товаров, которые участвуют или могут участвовать в акции.
#'
#' @docType class
#' @title GetPromoOffersRequest
#' @description GetPromoOffersRequest Class
#' @format An \code{R6Class} generator object
#' @field promoId Идентификатор акции. character
#' @field statusType  \link{PromoOfferParticipationStatusFilterType} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
GetPromoOffersRequest <- R6::R6Class(
  "GetPromoOffersRequest",
  public = list(
    `promoId` = NULL,
    `statusType` = NULL,
    #' Initialize a new GetPromoOffersRequest class.
    #'
    #' @description
    #' Initialize a new GetPromoOffersRequest class.
    #'
    #' @param promoId Идентификатор акции.
    #' @param statusType statusType
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`promoId`, `statusType` = NULL, ...) {
      if (!missing(`promoId`)) {
        if (!(is.character(`promoId`) && length(`promoId`) == 1)) {
          stop(paste("Error! Invalid data for `promoId`. Must be a string:", `promoId`))
        }
        self$`promoId` <- `promoId`
      }
      if (!is.null(`statusType`)) {
        if (!(`statusType` %in% c())) {
          stop(paste("Error! \"", `statusType`, "\" cannot be assigned to `statusType`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`statusType`))
        self$`statusType` <- `statusType`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return GetPromoOffersRequest in JSON format
    #' @export
    toJSON = function() {
      GetPromoOffersRequestObject <- list()
      if (!is.null(self$`promoId`)) {
        GetPromoOffersRequestObject[["promoId"]] <-
          self$`promoId`
      }
      if (!is.null(self$`statusType`)) {
        GetPromoOffersRequestObject[["statusType"]] <-
          self$`statusType`$toJSON()
      }
      GetPromoOffersRequestObject
    },
    #' Deserialize JSON string into an instance of GetPromoOffersRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of GetPromoOffersRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of GetPromoOffersRequest
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`promoId`)) {
        self$`promoId` <- this_object$`promoId`
      }
      if (!is.null(this_object$`statusType`)) {
        `statustype_object` <- PromoOfferParticipationStatusFilterType$new()
        `statustype_object`$fromJSON(jsonlite::toJSON(this_object$`statusType`, auto_unbox = TRUE, digits = NA))
        self$`statusType` <- `statustype_object`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return GetPromoOffersRequest in JSON format
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
        if (!is.null(self$`statusType`)) {
          sprintf(
          '"statusType":
          %s
          ',
          jsonlite::toJSON(self$`statusType`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of GetPromoOffersRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of GetPromoOffersRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of GetPromoOffersRequest
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`promoId` <- this_object$`promoId`
      self$`statusType` <- PromoOfferParticipationStatusFilterType$new()$fromJSON(jsonlite::toJSON(this_object$`statusType`, auto_unbox = TRUE, digits = NA))
      self
    },
    #' Validate JSON input with respect to GetPromoOffersRequest
    #'
    #' @description
    #' Validate JSON input with respect to GetPromoOffersRequest and throw an exception if invalid
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
        stop(paste("The JSON input `", input, "` is invalid for GetPromoOffersRequest: the required field `promoId` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of GetPromoOffersRequest
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
# GetPromoOffersRequest$unlock()
#
## Below is an example to define the print function
# GetPromoOffersRequest$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# GetPromoOffersRequest$lock()

