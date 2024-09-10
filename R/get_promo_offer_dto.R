#' Create a new GetPromoOfferDTO
#'
#' @description
#' Товар, который участвует или может участвовать в акции.
#'
#' @docType class
#' @title GetPromoOfferDTO
#' @description GetPromoOfferDTO Class
#' @format An \code{R6Class} generator object
#' @field offerId Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) character
#' @field status  \link{PromoOfferParticipationStatusType}
#' @field params  \link{PromoOfferParamsDTO}
#' @field autoParticipatingDetails  \link{PromoOfferAutoParticipatingDetailsDTO} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
GetPromoOfferDTO <- R6::R6Class(
  "GetPromoOfferDTO",
  public = list(
    `offerId` = NULL,
    `status` = NULL,
    `params` = NULL,
    `autoParticipatingDetails` = NULL,
    #' Initialize a new GetPromoOfferDTO class.
    #'
    #' @description
    #' Initialize a new GetPromoOfferDTO class.
    #'
    #' @param offerId Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)
    #' @param status status
    #' @param params params
    #' @param autoParticipatingDetails autoParticipatingDetails
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`offerId`, `status`, `params`, `autoParticipatingDetails` = NULL, ...) {
      if (!missing(`offerId`)) {
        if (!(is.character(`offerId`) && length(`offerId`) == 1)) {
          stop(paste("Error! Invalid data for `offerId`. Must be a string:", `offerId`))
        }
        self$`offerId` <- `offerId`
      }
      if (!missing(`status`)) {
        if (!(`status` %in% c())) {
          stop(paste("Error! \"", `status`, "\" cannot be assigned to `status`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`status`))
        self$`status` <- `status`
      }
      if (!missing(`params`)) {
        stopifnot(R6::is.R6(`params`))
        self$`params` <- `params`
      }
      if (!is.null(`autoParticipatingDetails`)) {
        stopifnot(R6::is.R6(`autoParticipatingDetails`))
        self$`autoParticipatingDetails` <- `autoParticipatingDetails`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return GetPromoOfferDTO in JSON format
    #' @export
    toJSON = function() {
      GetPromoOfferDTOObject <- list()
      if (!is.null(self$`offerId`)) {
        GetPromoOfferDTOObject[["offerId"]] <-
          self$`offerId`
      }
      if (!is.null(self$`status`)) {
        GetPromoOfferDTOObject[["status"]] <-
          self$`status`$toJSON()
      }
      if (!is.null(self$`params`)) {
        GetPromoOfferDTOObject[["params"]] <-
          self$`params`$toJSON()
      }
      if (!is.null(self$`autoParticipatingDetails`)) {
        GetPromoOfferDTOObject[["autoParticipatingDetails"]] <-
          self$`autoParticipatingDetails`$toJSON()
      }
      GetPromoOfferDTOObject
    },
    #' Deserialize JSON string into an instance of GetPromoOfferDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of GetPromoOfferDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of GetPromoOfferDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`offerId`)) {
        self$`offerId` <- this_object$`offerId`
      }
      if (!is.null(this_object$`status`)) {
        `status_object` <- PromoOfferParticipationStatusType$new()
        `status_object`$fromJSON(jsonlite::toJSON(this_object$`status`, auto_unbox = TRUE, digits = NA))
        self$`status` <- `status_object`
      }
      if (!is.null(this_object$`params`)) {
        `params_object` <- PromoOfferParamsDTO$new()
        `params_object`$fromJSON(jsonlite::toJSON(this_object$`params`, auto_unbox = TRUE, digits = NA))
        self$`params` <- `params_object`
      }
      if (!is.null(this_object$`autoParticipatingDetails`)) {
        `autoparticipatingdetails_object` <- PromoOfferAutoParticipatingDetailsDTO$new()
        `autoparticipatingdetails_object`$fromJSON(jsonlite::toJSON(this_object$`autoParticipatingDetails`, auto_unbox = TRUE, digits = NA))
        self$`autoParticipatingDetails` <- `autoparticipatingdetails_object`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return GetPromoOfferDTO in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`offerId`)) {
          sprintf(
          '"offerId":
            "%s"
                    ',
          self$`offerId`
          )
        },
        if (!is.null(self$`status`)) {
          sprintf(
          '"status":
          %s
          ',
          jsonlite::toJSON(self$`status`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`params`)) {
          sprintf(
          '"params":
          %s
          ',
          jsonlite::toJSON(self$`params`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`autoParticipatingDetails`)) {
          sprintf(
          '"autoParticipatingDetails":
          %s
          ',
          jsonlite::toJSON(self$`autoParticipatingDetails`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of GetPromoOfferDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of GetPromoOfferDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of GetPromoOfferDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`offerId` <- this_object$`offerId`
      self$`status` <- PromoOfferParticipationStatusType$new()$fromJSON(jsonlite::toJSON(this_object$`status`, auto_unbox = TRUE, digits = NA))
      self$`params` <- PromoOfferParamsDTO$new()$fromJSON(jsonlite::toJSON(this_object$`params`, auto_unbox = TRUE, digits = NA))
      self$`autoParticipatingDetails` <- PromoOfferAutoParticipatingDetailsDTO$new()$fromJSON(jsonlite::toJSON(this_object$`autoParticipatingDetails`, auto_unbox = TRUE, digits = NA))
      self
    },
    #' Validate JSON input with respect to GetPromoOfferDTO
    #'
    #' @description
    #' Validate JSON input with respect to GetPromoOfferDTO and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `offerId`
      if (!is.null(input_json$`offerId`)) {
        if (!(is.character(input_json$`offerId`) && length(input_json$`offerId`) == 1)) {
          stop(paste("Error! Invalid data for `offerId`. Must be a string:", input_json$`offerId`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for GetPromoOfferDTO: the required field `offerId` is missing."))
      }
      # check the required field `status`
      if (!is.null(input_json$`status`)) {
        stopifnot(R6::is.R6(input_json$`status`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for GetPromoOfferDTO: the required field `status` is missing."))
      }
      # check the required field `params`
      if (!is.null(input_json$`params`)) {
        stopifnot(R6::is.R6(input_json$`params`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for GetPromoOfferDTO: the required field `params` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of GetPromoOfferDTO
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
      # check if the required `offerId` is null
      if (is.null(self$`offerId`)) {
        return(FALSE)
      }

      if (nchar(self$`offerId`) > 255) {
        return(FALSE)
      }
      if (nchar(self$`offerId`) < 1) {
        return(FALSE)
      }
      if (!str_detect(self$`offerId`, "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")) {
        return(FALSE)
      }

      # check if the required `status` is null
      if (is.null(self$`status`)) {
        return(FALSE)
      }

      # check if the required `params` is null
      if (is.null(self$`params`)) {
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
      # check if the required `offerId` is null
      if (is.null(self$`offerId`)) {
        invalid_fields["offerId"] <- "Non-nullable required field `offerId` cannot be null."
      }

      if (nchar(self$`offerId`) > 255) {
        invalid_fields["offerId"] <- "Invalid length for `offerId`, must be smaller than or equal to 255."
      }
      if (nchar(self$`offerId`) < 1) {
        invalid_fields["offerId"] <- "Invalid length for `offerId`, must be bigger than or equal to 1."
      }
      if (!str_detect(self$`offerId`, "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")) {
        invalid_fields["offerId"] <- "Invalid value for `offerId`, must conform to the pattern ^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$."
      }

      # check if the required `status` is null
      if (is.null(self$`status`)) {
        invalid_fields["status"] <- "Non-nullable required field `status` cannot be null."
      }

      # check if the required `params` is null
      if (is.null(self$`params`)) {
        invalid_fields["params"] <- "Non-nullable required field `params` cannot be null."
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
# GetPromoOfferDTO$unlock()
#
## Below is an example to define the print function
# GetPromoOfferDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# GetPromoOfferDTO$lock()

