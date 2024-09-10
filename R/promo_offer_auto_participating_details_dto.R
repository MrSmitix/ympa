#' Create a new PromoOfferAutoParticipatingDetailsDTO
#'
#' @description
#' Информация об автоматическом добавлении товара в акцию.  Причины, по которым товар не был добавлен автоматически в других магазинах, можно узнать в кабинете продавца на Маркете на странице акции.  Об автоматическом и ручном добавлении товаров в акцию читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/promos/market/index). 
#'
#' @docType class
#' @title PromoOfferAutoParticipatingDetailsDTO
#' @description PromoOfferAutoParticipatingDetailsDTO Class
#' @format An \code{R6Class} generator object
#' @field campaignIds Магазины, в которых товар добавлен в акцию автоматически.  Возвращается, если статус товара в акции — `PARTIALLY_AUTO`. list(integer) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
PromoOfferAutoParticipatingDetailsDTO <- R6::R6Class(
  "PromoOfferAutoParticipatingDetailsDTO",
  public = list(
    `campaignIds` = NULL,
    #' Initialize a new PromoOfferAutoParticipatingDetailsDTO class.
    #'
    #' @description
    #' Initialize a new PromoOfferAutoParticipatingDetailsDTO class.
    #'
    #' @param campaignIds Магазины, в которых товар добавлен в акцию автоматически.  Возвращается, если статус товара в акции — `PARTIALLY_AUTO`.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`campaignIds` = NULL, ...) {
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
    #' @return PromoOfferAutoParticipatingDetailsDTO in JSON format
    #' @export
    toJSON = function() {
      PromoOfferAutoParticipatingDetailsDTOObject <- list()
      if (!is.null(self$`campaignIds`)) {
        PromoOfferAutoParticipatingDetailsDTOObject[["campaignIds"]] <-
          self$`campaignIds`
      }
      PromoOfferAutoParticipatingDetailsDTOObject
    },
    #' Deserialize JSON string into an instance of PromoOfferAutoParticipatingDetailsDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of PromoOfferAutoParticipatingDetailsDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of PromoOfferAutoParticipatingDetailsDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
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
    #' @return PromoOfferAutoParticipatingDetailsDTO in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
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
    #' Deserialize JSON string into an instance of PromoOfferAutoParticipatingDetailsDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of PromoOfferAutoParticipatingDetailsDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of PromoOfferAutoParticipatingDetailsDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`campaignIds` <- ApiClient$new()$deserializeObj(this_object$`campaignIds`, "array[integer]", loadNamespace("ympa_r_client"))
      self
    },
    #' Validate JSON input with respect to PromoOfferAutoParticipatingDetailsDTO
    #'
    #' @description
    #' Validate JSON input with respect to PromoOfferAutoParticipatingDetailsDTO and throw an exception if invalid
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
    #' @return String representation of PromoOfferAutoParticipatingDetailsDTO
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
# PromoOfferAutoParticipatingDetailsDTO$unlock()
#
## Below is an example to define the print function
# PromoOfferAutoParticipatingDetailsDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# PromoOfferAutoParticipatingDetailsDTO$lock()

