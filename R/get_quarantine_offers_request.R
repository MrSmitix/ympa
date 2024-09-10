#' Create a new GetQuarantineOffersRequest
#'
#' @description
#' Фильтрации товаров  В запросе можно указать либо фильтр offerIds, либо любые другие фильтры товаров. Совместное использование фильтра offerIds с другими фильтрациями приведет к ошибке. 
#'
#' @docType class
#' @title GetQuarantineOffersRequest
#' @description GetQuarantineOffersRequest Class
#' @format An \code{R6Class} generator object
#' @field offerIds Идентификаторы товаров, информация о которых нужна. <br><br> ⚠️ Не используйте это поле одновременно с фильтрами по статусам карточек, категориям, брендам или тегам. Если вы хотите воспользоваться фильтрами, оставьте поле пустым. list(character) [optional]
#' @field cardStatuses Фильтр по статусам карточек.  [Что такое карточка товара](https://yandex.ru/support/marketplace/assortment/content/index.html) list(\link{OfferCardStatusType}) [optional]
#' @field categoryIds Фильтр по категориям на Маркете. list(integer) [optional]
#' @field vendorNames Фильтр по брендам. list(character) [optional]
#' @field tags Фильтр по тегам. list(character) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
GetQuarantineOffersRequest <- R6::R6Class(
  "GetQuarantineOffersRequest",
  public = list(
    `offerIds` = NULL,
    `cardStatuses` = NULL,
    `categoryIds` = NULL,
    `vendorNames` = NULL,
    `tags` = NULL,
    #' Initialize a new GetQuarantineOffersRequest class.
    #'
    #' @description
    #' Initialize a new GetQuarantineOffersRequest class.
    #'
    #' @param offerIds Идентификаторы товаров, информация о которых нужна. <br><br> ⚠️ Не используйте это поле одновременно с фильтрами по статусам карточек, категориям, брендам или тегам. Если вы хотите воспользоваться фильтрами, оставьте поле пустым.
    #' @param cardStatuses Фильтр по статусам карточек.  [Что такое карточка товара](https://yandex.ru/support/marketplace/assortment/content/index.html)
    #' @param categoryIds Фильтр по категориям на Маркете.
    #' @param vendorNames Фильтр по брендам.
    #' @param tags Фильтр по тегам.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`offerIds` = NULL, `cardStatuses` = NULL, `categoryIds` = NULL, `vendorNames` = NULL, `tags` = NULL, ...) {
      if (!is.null(`offerIds`)) {
        stopifnot(is.vector(`offerIds`), length(`offerIds`) != 0)
        sapply(`offerIds`, function(x) stopifnot(is.character(x)))
        self$`offerIds` <- `offerIds`
      }
      if (!is.null(`cardStatuses`)) {
        stopifnot(is.vector(`cardStatuses`), length(`cardStatuses`) != 0)
        sapply(`cardStatuses`, function(x) stopifnot(R6::is.R6(x)))
        self$`cardStatuses` <- `cardStatuses`
      }
      if (!is.null(`categoryIds`)) {
        stopifnot(is.vector(`categoryIds`), length(`categoryIds`) != 0)
        sapply(`categoryIds`, function(x) stopifnot(is.character(x)))
        self$`categoryIds` <- `categoryIds`
      }
      if (!is.null(`vendorNames`)) {
        stopifnot(is.vector(`vendorNames`), length(`vendorNames`) != 0)
        sapply(`vendorNames`, function(x) stopifnot(is.character(x)))
        self$`vendorNames` <- `vendorNames`
      }
      if (!is.null(`tags`)) {
        stopifnot(is.vector(`tags`), length(`tags`) != 0)
        sapply(`tags`, function(x) stopifnot(is.character(x)))
        self$`tags` <- `tags`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return GetQuarantineOffersRequest in JSON format
    #' @export
    toJSON = function() {
      GetQuarantineOffersRequestObject <- list()
      if (!is.null(self$`offerIds`)) {
        GetQuarantineOffersRequestObject[["offerIds"]] <-
          self$`offerIds`
      }
      if (!is.null(self$`cardStatuses`)) {
        GetQuarantineOffersRequestObject[["cardStatuses"]] <-
          lapply(self$`cardStatuses`, function(x) x$toJSON())
      }
      if (!is.null(self$`categoryIds`)) {
        GetQuarantineOffersRequestObject[["categoryIds"]] <-
          self$`categoryIds`
      }
      if (!is.null(self$`vendorNames`)) {
        GetQuarantineOffersRequestObject[["vendorNames"]] <-
          self$`vendorNames`
      }
      if (!is.null(self$`tags`)) {
        GetQuarantineOffersRequestObject[["tags"]] <-
          self$`tags`
      }
      GetQuarantineOffersRequestObject
    },
    #' Deserialize JSON string into an instance of GetQuarantineOffersRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of GetQuarantineOffersRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of GetQuarantineOffersRequest
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`offerIds`)) {
        self$`offerIds` <- ApiClient$new()$deserializeObj(this_object$`offerIds`, "array[character]", loadNamespace("ympa_r_client"))
      }
      if (!is.null(this_object$`cardStatuses`)) {
        self$`cardStatuses` <- ApiClient$new()$deserializeObj(this_object$`cardStatuses`, "array[OfferCardStatusType]", loadNamespace("ympa_r_client"))
      }
      if (!is.null(this_object$`categoryIds`)) {
        self$`categoryIds` <- ApiClient$new()$deserializeObj(this_object$`categoryIds`, "array[integer]", loadNamespace("ympa_r_client"))
      }
      if (!is.null(this_object$`vendorNames`)) {
        self$`vendorNames` <- ApiClient$new()$deserializeObj(this_object$`vendorNames`, "array[character]", loadNamespace("ympa_r_client"))
      }
      if (!is.null(this_object$`tags`)) {
        self$`tags` <- ApiClient$new()$deserializeObj(this_object$`tags`, "array[character]", loadNamespace("ympa_r_client"))
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return GetQuarantineOffersRequest in JSON format
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
        },
        if (!is.null(self$`cardStatuses`)) {
          sprintf(
          '"cardStatuses":
          [%s]
',
          paste(sapply(self$`cardStatuses`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        },
        if (!is.null(self$`categoryIds`)) {
          sprintf(
          '"categoryIds":
             [%s]
          ',
          paste(unlist(lapply(self$`categoryIds`, function(x) paste0('"', x, '"'))), collapse = ",")
          )
        },
        if (!is.null(self$`vendorNames`)) {
          sprintf(
          '"vendorNames":
             [%s]
          ',
          paste(unlist(lapply(self$`vendorNames`, function(x) paste0('"', x, '"'))), collapse = ",")
          )
        },
        if (!is.null(self$`tags`)) {
          sprintf(
          '"tags":
             [%s]
          ',
          paste(unlist(lapply(self$`tags`, function(x) paste0('"', x, '"'))), collapse = ",")
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of GetQuarantineOffersRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of GetQuarantineOffersRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of GetQuarantineOffersRequest
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`offerIds` <- ApiClient$new()$deserializeObj(this_object$`offerIds`, "array[character]", loadNamespace("ympa_r_client"))
      self$`cardStatuses` <- ApiClient$new()$deserializeObj(this_object$`cardStatuses`, "array[OfferCardStatusType]", loadNamespace("ympa_r_client"))
      self$`categoryIds` <- ApiClient$new()$deserializeObj(this_object$`categoryIds`, "array[integer]", loadNamespace("ympa_r_client"))
      self$`vendorNames` <- ApiClient$new()$deserializeObj(this_object$`vendorNames`, "array[character]", loadNamespace("ympa_r_client"))
      self$`tags` <- ApiClient$new()$deserializeObj(this_object$`tags`, "array[character]", loadNamespace("ympa_r_client"))
      self
    },
    #' Validate JSON input with respect to GetQuarantineOffersRequest
    #'
    #' @description
    #' Validate JSON input with respect to GetQuarantineOffersRequest and throw an exception if invalid
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
    #' @return String representation of GetQuarantineOffersRequest
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
      if (length(self$`offerIds`) > 500) {
        return(FALSE)
      }
      if (length(self$`offerIds`) < 1) {
        return(FALSE)
      }

      if (length(self$`cardStatuses`) < 1) {
        return(FALSE)
      }

      if (length(self$`categoryIds`) < 1) {
        return(FALSE)
      }

      if (length(self$`vendorNames`) < 1) {
        return(FALSE)
      }

      if (length(self$`tags`) < 1) {
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
      if (length(self$`offerIds`) > 500) {
        invalid_fields["offerIds"] <- "Invalid length for `offerIds`, number of items must be less than or equal to 500."
      }
      if (length(self$`offerIds`) < 1) {
        invalid_fields["offerIds"] <- "Invalid length for ``, number of items must be greater than or equal to 1."
      }

      if (length(self$`cardStatuses`) < 1) {
        invalid_fields["cardStatuses"] <- "Invalid length for ``, number of items must be greater than or equal to 1."
      }

      if (length(self$`categoryIds`) < 1) {
        invalid_fields["categoryIds"] <- "Invalid length for ``, number of items must be greater than or equal to 1."
      }

      if (length(self$`vendorNames`) < 1) {
        invalid_fields["vendorNames"] <- "Invalid length for ``, number of items must be greater than or equal to 1."
      }

      if (length(self$`tags`) < 1) {
        invalid_fields["tags"] <- "Invalid length for ``, number of items must be greater than or equal to 1."
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
# GetQuarantineOffersRequest$unlock()
#
## Below is an example to define the print function
# GetQuarantineOffersRequest$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# GetQuarantineOffersRequest$lock()

