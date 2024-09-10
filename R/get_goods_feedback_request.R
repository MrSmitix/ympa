#' Create a new GetGoodsFeedbackRequest
#'
#' @description
#' Фильтр запроса отзывов в кабинете. 
#'
#' @docType class
#' @title GetGoodsFeedbackRequest
#' @description GetGoodsFeedbackRequest Class
#' @format An \code{R6Class} generator object
#' @field dateTimeFrom Начало периода. Не включительно.  Если параметр не указан, возвращается информация за 6 месяцев до указанной в `dateTimeTo` даты. character [optional]
#' @field dateTimeTo Конец периода. Не включительно.  Если параметр не указан, используется текущая дата. character [optional]
#' @field reactionStatus  \link{FeedbackReactionStatusType} [optional]
#' @field ratingValues Оценка товара. list(integer) [optional]
#' @field modelIds Фильтр по идентификатору модели товара.  Получить идентификатор модели можно с помощью одного из запросов:  * [POST businesses/{businessId}/offer-mappings](../../reference/business-assortment/getOfferMappings.md);  * [POST businesses/{businessId}/offer-cards](../../reference/content/getOfferCardsContentStatus.md);  * [POST models](../../reference/models/getModels.md). list(integer) [optional]
#' @field paid Фильтр отзывов за баллы Плюса. character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
GetGoodsFeedbackRequest <- R6::R6Class(
  "GetGoodsFeedbackRequest",
  public = list(
    `dateTimeFrom` = NULL,
    `dateTimeTo` = NULL,
    `reactionStatus` = NULL,
    `ratingValues` = NULL,
    `modelIds` = NULL,
    `paid` = NULL,
    #' Initialize a new GetGoodsFeedbackRequest class.
    #'
    #' @description
    #' Initialize a new GetGoodsFeedbackRequest class.
    #'
    #' @param dateTimeFrom Начало периода. Не включительно.  Если параметр не указан, возвращается информация за 6 месяцев до указанной в `dateTimeTo` даты.
    #' @param dateTimeTo Конец периода. Не включительно.  Если параметр не указан, используется текущая дата.
    #' @param reactionStatus reactionStatus
    #' @param ratingValues Оценка товара.
    #' @param modelIds Фильтр по идентификатору модели товара.  Получить идентификатор модели можно с помощью одного из запросов:  * [POST businesses/{businessId}/offer-mappings](../../reference/business-assortment/getOfferMappings.md);  * [POST businesses/{businessId}/offer-cards](../../reference/content/getOfferCardsContentStatus.md);  * [POST models](../../reference/models/getModels.md).
    #' @param paid Фильтр отзывов за баллы Плюса.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`dateTimeFrom` = NULL, `dateTimeTo` = NULL, `reactionStatus` = NULL, `ratingValues` = NULL, `modelIds` = NULL, `paid` = NULL, ...) {
      if (!is.null(`dateTimeFrom`)) {
        if (!is.character(`dateTimeFrom`)) {
          stop(paste("Error! Invalid data for `dateTimeFrom`. Must be a string:", `dateTimeFrom`))
        }
        self$`dateTimeFrom` <- `dateTimeFrom`
      }
      if (!is.null(`dateTimeTo`)) {
        if (!is.character(`dateTimeTo`)) {
          stop(paste("Error! Invalid data for `dateTimeTo`. Must be a string:", `dateTimeTo`))
        }
        self$`dateTimeTo` <- `dateTimeTo`
      }
      if (!is.null(`reactionStatus`)) {
        if (!(`reactionStatus` %in% c())) {
          stop(paste("Error! \"", `reactionStatus`, "\" cannot be assigned to `reactionStatus`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`reactionStatus`))
        self$`reactionStatus` <- `reactionStatus`
      }
      if (!is.null(`ratingValues`)) {
        stopifnot(is.vector(`ratingValues`), length(`ratingValues`) != 0)
        sapply(`ratingValues`, function(x) stopifnot(is.character(x)))
        if (!identical(`ratingValues`, unique(`ratingValues`))) {
          stop("Error! Items in `ratingValues` are not unique.")
        }
        self$`ratingValues` <- `ratingValues`
      }
      if (!is.null(`modelIds`)) {
        stopifnot(is.vector(`modelIds`), length(`modelIds`) != 0)
        sapply(`modelIds`, function(x) stopifnot(is.character(x)))
        if (!identical(`modelIds`, unique(`modelIds`))) {
          stop("Error! Items in `modelIds` are not unique.")
        }
        self$`modelIds` <- `modelIds`
      }
      if (!is.null(`paid`)) {
        if (!(is.logical(`paid`) && length(`paid`) == 1)) {
          stop(paste("Error! Invalid data for `paid`. Must be a boolean:", `paid`))
        }
        self$`paid` <- `paid`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return GetGoodsFeedbackRequest in JSON format
    #' @export
    toJSON = function() {
      GetGoodsFeedbackRequestObject <- list()
      if (!is.null(self$`dateTimeFrom`)) {
        GetGoodsFeedbackRequestObject[["dateTimeFrom"]] <-
          self$`dateTimeFrom`
      }
      if (!is.null(self$`dateTimeTo`)) {
        GetGoodsFeedbackRequestObject[["dateTimeTo"]] <-
          self$`dateTimeTo`
      }
      if (!is.null(self$`reactionStatus`)) {
        GetGoodsFeedbackRequestObject[["reactionStatus"]] <-
          self$`reactionStatus`$toJSON()
      }
      if (!is.null(self$`ratingValues`)) {
        GetGoodsFeedbackRequestObject[["ratingValues"]] <-
          self$`ratingValues`
      }
      if (!is.null(self$`modelIds`)) {
        GetGoodsFeedbackRequestObject[["modelIds"]] <-
          self$`modelIds`
      }
      if (!is.null(self$`paid`)) {
        GetGoodsFeedbackRequestObject[["paid"]] <-
          self$`paid`
      }
      GetGoodsFeedbackRequestObject
    },
    #' Deserialize JSON string into an instance of GetGoodsFeedbackRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of GetGoodsFeedbackRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of GetGoodsFeedbackRequest
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`dateTimeFrom`)) {
        self$`dateTimeFrom` <- this_object$`dateTimeFrom`
      }
      if (!is.null(this_object$`dateTimeTo`)) {
        self$`dateTimeTo` <- this_object$`dateTimeTo`
      }
      if (!is.null(this_object$`reactionStatus`)) {
        `reactionstatus_object` <- FeedbackReactionStatusType$new()
        `reactionstatus_object`$fromJSON(jsonlite::toJSON(this_object$`reactionStatus`, auto_unbox = TRUE, digits = NA))
        self$`reactionStatus` <- `reactionstatus_object`
      }
      if (!is.null(this_object$`ratingValues`)) {
        self$`ratingValues` <- ApiClient$new()$deserializeObj(this_object$`ratingValues`, "set[integer]", loadNamespace("ympa_r_client"))
        if (!identical(self$`ratingValues`, unique(self$`ratingValues`))) {
          stop("Error! Items in `ratingValues` are not unique.")
        }
      }
      if (!is.null(this_object$`modelIds`)) {
        self$`modelIds` <- ApiClient$new()$deserializeObj(this_object$`modelIds`, "set[integer]", loadNamespace("ympa_r_client"))
        if (!identical(self$`modelIds`, unique(self$`modelIds`))) {
          stop("Error! Items in `modelIds` are not unique.")
        }
      }
      if (!is.null(this_object$`paid`)) {
        self$`paid` <- this_object$`paid`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return GetGoodsFeedbackRequest in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`dateTimeFrom`)) {
          sprintf(
          '"dateTimeFrom":
            "%s"
                    ',
          self$`dateTimeFrom`
          )
        },
        if (!is.null(self$`dateTimeTo`)) {
          sprintf(
          '"dateTimeTo":
            "%s"
                    ',
          self$`dateTimeTo`
          )
        },
        if (!is.null(self$`reactionStatus`)) {
          sprintf(
          '"reactionStatus":
          %s
          ',
          jsonlite::toJSON(self$`reactionStatus`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`ratingValues`)) {
          sprintf(
          '"ratingValues":
             [%s]
          ',
          paste(unlist(lapply(self$`ratingValues`, function(x) paste0('"', x, '"'))), collapse = ",")
          )
        },
        if (!is.null(self$`modelIds`)) {
          sprintf(
          '"modelIds":
             [%s]
          ',
          paste(unlist(lapply(self$`modelIds`, function(x) paste0('"', x, '"'))), collapse = ",")
          )
        },
        if (!is.null(self$`paid`)) {
          sprintf(
          '"paid":
            %s
                    ',
          tolower(self$`paid`)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of GetGoodsFeedbackRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of GetGoodsFeedbackRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of GetGoodsFeedbackRequest
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`dateTimeFrom` <- this_object$`dateTimeFrom`
      self$`dateTimeTo` <- this_object$`dateTimeTo`
      self$`reactionStatus` <- FeedbackReactionStatusType$new()$fromJSON(jsonlite::toJSON(this_object$`reactionStatus`, auto_unbox = TRUE, digits = NA))
      self$`ratingValues` <- ApiClient$new()$deserializeObj(this_object$`ratingValues`, "set[integer]", loadNamespace("ympa_r_client"))
      if (!identical(self$`ratingValues`, unique(self$`ratingValues`))) {
        stop("Error! Items in `ratingValues` are not unique.")
      }
      self$`modelIds` <- ApiClient$new()$deserializeObj(this_object$`modelIds`, "set[integer]", loadNamespace("ympa_r_client"))
      if (!identical(self$`modelIds`, unique(self$`modelIds`))) {
        stop("Error! Items in `modelIds` are not unique.")
      }
      self$`paid` <- this_object$`paid`
      self
    },
    #' Validate JSON input with respect to GetGoodsFeedbackRequest
    #'
    #' @description
    #' Validate JSON input with respect to GetGoodsFeedbackRequest and throw an exception if invalid
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
    #' @return String representation of GetGoodsFeedbackRequest
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
      if (length(self$`ratingValues`) > 5) {
        return(FALSE)
      }

      if (length(self$`modelIds`) > 20) {
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
      if (length(self$`ratingValues`) > 5) {
        invalid_fields["ratingValues"] <- "Invalid length for `ratingValues`, number of items must be less than or equal to 5."
      }

      if (length(self$`modelIds`) > 20) {
        invalid_fields["modelIds"] <- "Invalid length for `modelIds`, number of items must be less than or equal to 20."
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
# GetGoodsFeedbackRequest$unlock()
#
## Below is an example to define the print function
# GetGoodsFeedbackRequest$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# GetGoodsFeedbackRequest$lock()

