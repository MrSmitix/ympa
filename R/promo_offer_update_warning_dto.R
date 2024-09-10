#' Create a new PromoOfferUpdateWarningDTO
#'
#' @description
#' Предупреждение, которое появилось при добавлении товара в акцию или изменении его цен.
#'
#' @docType class
#' @title PromoOfferUpdateWarningDTO
#' @description PromoOfferUpdateWarningDTO Class
#' @format An \code{R6Class} generator object
#' @field code  \link{PromoOfferUpdateWarningCodeType}
#' @field campaignIds Идентификаторы магазинов в кабинете, для которых получены предупреждения.  Не возвращается, если предупреждения действуют для всех магазинов в кабинете. list(integer) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
PromoOfferUpdateWarningDTO <- R6::R6Class(
  "PromoOfferUpdateWarningDTO",
  public = list(
    `code` = NULL,
    `campaignIds` = NULL,
    #' Initialize a new PromoOfferUpdateWarningDTO class.
    #'
    #' @description
    #' Initialize a new PromoOfferUpdateWarningDTO class.
    #'
    #' @param code code
    #' @param campaignIds Идентификаторы магазинов в кабинете, для которых получены предупреждения.  Не возвращается, если предупреждения действуют для всех магазинов в кабинете.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`code`, `campaignIds` = NULL, ...) {
      if (!missing(`code`)) {
        if (!(`code` %in% c())) {
          stop(paste("Error! \"", `code`, "\" cannot be assigned to `code`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`code`))
        self$`code` <- `code`
      }
      if (!is.null(`campaignIds`)) {
        stopifnot(is.vector(`campaignIds`), length(`campaignIds`) != 0)
        sapply(`campaignIds`, function(x) stopifnot(is.character(x)))
        self$`campaignIds` <- `campaignIds`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return PromoOfferUpdateWarningDTO in JSON format
    #' @export
    toJSON = function() {
      PromoOfferUpdateWarningDTOObject <- list()
      if (!is.null(self$`code`)) {
        PromoOfferUpdateWarningDTOObject[["code"]] <-
          self$`code`$toJSON()
      }
      if (!is.null(self$`campaignIds`)) {
        PromoOfferUpdateWarningDTOObject[["campaignIds"]] <-
          self$`campaignIds`
      }
      PromoOfferUpdateWarningDTOObject
    },
    #' Deserialize JSON string into an instance of PromoOfferUpdateWarningDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of PromoOfferUpdateWarningDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of PromoOfferUpdateWarningDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`code`)) {
        `code_object` <- PromoOfferUpdateWarningCodeType$new()
        `code_object`$fromJSON(jsonlite::toJSON(this_object$`code`, auto_unbox = TRUE, digits = NA))
        self$`code` <- `code_object`
      }
      if (!is.null(this_object$`campaignIds`)) {
        self$`campaignIds` <- ApiClient$new()$deserializeObj(this_object$`campaignIds`, "array[integer]", loadNamespace("ympa_r_client"))
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return PromoOfferUpdateWarningDTO in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`code`)) {
          sprintf(
          '"code":
          %s
          ',
          jsonlite::toJSON(self$`code`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`campaignIds`)) {
          sprintf(
          '"campaignIds":
             [%s]
          ',
          paste(unlist(lapply(self$`campaignIds`, function(x) paste0('"', x, '"'))), collapse = ",")
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of PromoOfferUpdateWarningDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of PromoOfferUpdateWarningDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of PromoOfferUpdateWarningDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`code` <- PromoOfferUpdateWarningCodeType$new()$fromJSON(jsonlite::toJSON(this_object$`code`, auto_unbox = TRUE, digits = NA))
      self$`campaignIds` <- ApiClient$new()$deserializeObj(this_object$`campaignIds`, "array[integer]", loadNamespace("ympa_r_client"))
      self
    },
    #' Validate JSON input with respect to PromoOfferUpdateWarningDTO
    #'
    #' @description
    #' Validate JSON input with respect to PromoOfferUpdateWarningDTO and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `code`
      if (!is.null(input_json$`code`)) {
        stopifnot(R6::is.R6(input_json$`code`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PromoOfferUpdateWarningDTO: the required field `code` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of PromoOfferUpdateWarningDTO
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
      # check if the required `code` is null
      if (is.null(self$`code`)) {
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
      # check if the required `code` is null
      if (is.null(self$`code`)) {
        invalid_fields["code"] <- "Non-nullable required field `code` cannot be null."
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
# PromoOfferUpdateWarningDTO$unlock()
#
## Below is an example to define the print function
# PromoOfferUpdateWarningDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# PromoOfferUpdateWarningDTO$lock()

