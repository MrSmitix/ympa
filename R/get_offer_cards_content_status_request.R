#' Create a new GetOfferCardsContentStatusRequest
#'
#' @description
#' GetOfferCardsContentStatusRequest Class
#'
#' @docType class
#' @title GetOfferCardsContentStatusRequest
#' @description GetOfferCardsContentStatusRequest Class
#' @format An \code{R6Class} generator object
#' @field offerIds Идентификаторы товаров, информация о которых нужна. <br><br> ⚠️ Не используйте это поле одновременно с фильтрами по статусам карточек, категориям, брендам или тегам. Если вы хотите воспользоваться фильтрами, оставьте поле пустым. list(character) [optional]
#' @field cardStatuses Фильтр по статусам карточек.  [Что такое карточка товара](https://yandex.ru/support/marketplace/assortment/content/index.html) list(\link{OfferCardStatusType}) [optional]
#' @field categoryIds Фильтр по категориям на Маркете. list(integer) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
GetOfferCardsContentStatusRequest <- R6::R6Class(
  "GetOfferCardsContentStatusRequest",
  public = list(
    `offerIds` = NULL,
    `cardStatuses` = NULL,
    `categoryIds` = NULL,
    #' Initialize a new GetOfferCardsContentStatusRequest class.
    #'
    #' @description
    #' Initialize a new GetOfferCardsContentStatusRequest class.
    #'
    #' @param offerIds Идентификаторы товаров, информация о которых нужна. <br><br> ⚠️ Не используйте это поле одновременно с фильтрами по статусам карточек, категориям, брендам или тегам. Если вы хотите воспользоваться фильтрами, оставьте поле пустым.
    #' @param cardStatuses Фильтр по статусам карточек.  [Что такое карточка товара](https://yandex.ru/support/marketplace/assortment/content/index.html)
    #' @param categoryIds Фильтр по категориям на Маркете.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`offerIds` = NULL, `cardStatuses` = NULL, `categoryIds` = NULL, ...) {
      if (!is.null(`offerIds`)) {
        stopifnot(is.vector(`offerIds`), length(`offerIds`) != 0)
        sapply(`offerIds`, function(x) stopifnot(is.character(x)))
        if (!identical(`offerIds`, unique(`offerIds`))) {
          stop("Error! Items in `offerIds` are not unique.")
        }
        self$`offerIds` <- `offerIds`
      }
      if (!is.null(`cardStatuses`)) {
        stopifnot(is.vector(`cardStatuses`), length(`cardStatuses`) != 0)
        sapply(`cardStatuses`, function(x) stopifnot(R6::is.R6(x)))
        if (!identical(`cardStatuses`, unique(`cardStatuses`))) {
          stop("Error! Items in `cardStatuses` are not unique.")
        }
        self$`cardStatuses` <- `cardStatuses`
      }
      if (!is.null(`categoryIds`)) {
        stopifnot(is.vector(`categoryIds`), length(`categoryIds`) != 0)
        sapply(`categoryIds`, function(x) stopifnot(is.character(x)))
        if (!identical(`categoryIds`, unique(`categoryIds`))) {
          stop("Error! Items in `categoryIds` are not unique.")
        }
        self$`categoryIds` <- `categoryIds`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return GetOfferCardsContentStatusRequest in JSON format
    #' @export
    toJSON = function() {
      GetOfferCardsContentStatusRequestObject <- list()
      if (!is.null(self$`offerIds`)) {
        GetOfferCardsContentStatusRequestObject[["offerIds"]] <-
          self$`offerIds`
      }
      if (!is.null(self$`cardStatuses`)) {
        GetOfferCardsContentStatusRequestObject[["cardStatuses"]] <-
          lapply(self$`cardStatuses`, function(x) x$toJSON())
      }
      if (!is.null(self$`categoryIds`)) {
        GetOfferCardsContentStatusRequestObject[["categoryIds"]] <-
          self$`categoryIds`
      }
      GetOfferCardsContentStatusRequestObject
    },
    #' Deserialize JSON string into an instance of GetOfferCardsContentStatusRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of GetOfferCardsContentStatusRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of GetOfferCardsContentStatusRequest
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`offerIds`)) {
        self$`offerIds` <- ApiClient$new()$deserializeObj(this_object$`offerIds`, "set[character]", loadNamespace("ympa_r_client"))
        if (!identical(self$`offerIds`, unique(self$`offerIds`))) {
          stop("Error! Items in `offerIds` are not unique.")
        }
      }
      if (!is.null(this_object$`cardStatuses`)) {
        self$`cardStatuses` <- ApiClient$new()$deserializeObj(this_object$`cardStatuses`, "set[OfferCardStatusType]", loadNamespace("ympa_r_client"))
        if (!identical(self$`cardStatuses`, unique(self$`cardStatuses`))) {
          stop("Error! Items in `cardStatuses` are not unique.")
        }
      }
      if (!is.null(this_object$`categoryIds`)) {
        self$`categoryIds` <- ApiClient$new()$deserializeObj(this_object$`categoryIds`, "set[integer]", loadNamespace("ympa_r_client"))
        if (!identical(self$`categoryIds`, unique(self$`categoryIds`))) {
          stop("Error! Items in `categoryIds` are not unique.")
        }
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return GetOfferCardsContentStatusRequest in JSON format
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
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of GetOfferCardsContentStatusRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of GetOfferCardsContentStatusRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of GetOfferCardsContentStatusRequest
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`offerIds` <- ApiClient$new()$deserializeObj(this_object$`offerIds`, "set[character]", loadNamespace("ympa_r_client"))
      if (!identical(self$`offerIds`, unique(self$`offerIds`))) {
        stop("Error! Items in `offerIds` are not unique.")
      }
      self$`cardStatuses` <- ApiClient$new()$deserializeObj(this_object$`cardStatuses`, "set[OfferCardStatusType]", loadNamespace("ympa_r_client"))
      if (!identical(self$`cardStatuses`, unique(self$`cardStatuses`))) {
        stop("Error! Items in `cardStatuses` are not unique.")
      }
      self$`categoryIds` <- ApiClient$new()$deserializeObj(this_object$`categoryIds`, "set[integer]", loadNamespace("ympa_r_client"))
      if (!identical(self$`categoryIds`, unique(self$`categoryIds`))) {
        stop("Error! Items in `categoryIds` are not unique.")
      }
      self
    },
    #' Validate JSON input with respect to GetOfferCardsContentStatusRequest
    #'
    #' @description
    #' Validate JSON input with respect to GetOfferCardsContentStatusRequest and throw an exception if invalid
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
    #' @return String representation of GetOfferCardsContentStatusRequest
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
      if (length(self$`offerIds`) > 200) {
        return(FALSE)
      }


      if (length(self$`categoryIds`) > 200) {
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
      if (length(self$`offerIds`) > 200) {
        invalid_fields["offerIds"] <- "Invalid length for `offerIds`, number of items must be less than or equal to 200."
      }


      if (length(self$`categoryIds`) > 200) {
        invalid_fields["categoryIds"] <- "Invalid length for `categoryIds`, number of items must be less than or equal to 200."
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
# GetOfferCardsContentStatusRequest$unlock()
#
## Below is an example to define the print function
# GetOfferCardsContentStatusRequest$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# GetOfferCardsContentStatusRequest$lock()

