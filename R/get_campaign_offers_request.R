#' Create a new GetCampaignOffersRequest
#'
#' @description
#' Фильтрации товаров  В запросе можно указать либо фильтр offerIds, либо любые другие фильтры товаров. Совместное использование фильтра offerIds с другими фильтрациями приведет к ошибке. 
#'
#' @docType class
#' @title GetCampaignOffersRequest
#' @description GetCampaignOffersRequest Class
#' @format An \code{R6Class} generator object
#' @field offerIds Идентификаторы товаров, информация о которых нужна.  {\% note warning \"Такой список возвращается только целиком\" \%}  Не используйте это поле одновременно с фильтрами по статусам карточек, категориям, брендам или тегам. Если вы хотите воспользоваться фильтрами, оставьте поле пустым.  Если вы запрашиваете информацию по конкретным SKU, не заполняйте:  * `page_token` * `limit`  {\% endnote \%}    list(character) [optional]
#' @field statuses Фильтр по статусам товаров. list(\link{OfferCampaignStatusType}) [optional]
#' @field categoryIds Фильтр по категориям на Маркете. list(integer) [optional]
#' @field vendorNames Фильтр по брендам. list(character) [optional]
#' @field tags Фильтр по тегам. list(character) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
GetCampaignOffersRequest <- R6::R6Class(
  "GetCampaignOffersRequest",
  public = list(
    `offerIds` = NULL,
    `statuses` = NULL,
    `categoryIds` = NULL,
    `vendorNames` = NULL,
    `tags` = NULL,
    #' Initialize a new GetCampaignOffersRequest class.
    #'
    #' @description
    #' Initialize a new GetCampaignOffersRequest class.
    #'
    #' @param offerIds Идентификаторы товаров, информация о которых нужна.  {\% note warning \"Такой список возвращается только целиком\" \%}  Не используйте это поле одновременно с фильтрами по статусам карточек, категориям, брендам или тегам. Если вы хотите воспользоваться фильтрами, оставьте поле пустым.  Если вы запрашиваете информацию по конкретным SKU, не заполняйте:  * `page_token` * `limit`  {\% endnote \%}   
    #' @param statuses Фильтр по статусам товаров.
    #' @param categoryIds Фильтр по категориям на Маркете.
    #' @param vendorNames Фильтр по брендам.
    #' @param tags Фильтр по тегам.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`offerIds` = NULL, `statuses` = NULL, `categoryIds` = NULL, `vendorNames` = NULL, `tags` = NULL, ...) {
      if (!is.null(`offerIds`)) {
        stopifnot(is.vector(`offerIds`), length(`offerIds`) != 0)
        sapply(`offerIds`, function(x) stopifnot(is.character(x)))
        self$`offerIds` <- `offerIds`
      }
      if (!is.null(`statuses`)) {
        stopifnot(is.vector(`statuses`), length(`statuses`) != 0)
        sapply(`statuses`, function(x) stopifnot(R6::is.R6(x)))
        self$`statuses` <- `statuses`
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
    #' @return GetCampaignOffersRequest in JSON format
    #' @export
    toJSON = function() {
      GetCampaignOffersRequestObject <- list()
      if (!is.null(self$`offerIds`)) {
        GetCampaignOffersRequestObject[["offerIds"]] <-
          self$`offerIds`
      }
      if (!is.null(self$`statuses`)) {
        GetCampaignOffersRequestObject[["statuses"]] <-
          lapply(self$`statuses`, function(x) x$toJSON())
      }
      if (!is.null(self$`categoryIds`)) {
        GetCampaignOffersRequestObject[["categoryIds"]] <-
          self$`categoryIds`
      }
      if (!is.null(self$`vendorNames`)) {
        GetCampaignOffersRequestObject[["vendorNames"]] <-
          self$`vendorNames`
      }
      if (!is.null(self$`tags`)) {
        GetCampaignOffersRequestObject[["tags"]] <-
          self$`tags`
      }
      GetCampaignOffersRequestObject
    },
    #' Deserialize JSON string into an instance of GetCampaignOffersRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of GetCampaignOffersRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of GetCampaignOffersRequest
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`offerIds`)) {
        self$`offerIds` <- ApiClient$new()$deserializeObj(this_object$`offerIds`, "array[character]", loadNamespace("ympa_r_client"))
      }
      if (!is.null(this_object$`statuses`)) {
        self$`statuses` <- ApiClient$new()$deserializeObj(this_object$`statuses`, "array[OfferCampaignStatusType]", loadNamespace("ympa_r_client"))
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
    #' @return GetCampaignOffersRequest in JSON format
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
        if (!is.null(self$`statuses`)) {
          sprintf(
          '"statuses":
          [%s]
',
          paste(sapply(self$`statuses`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
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
    #' Deserialize JSON string into an instance of GetCampaignOffersRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of GetCampaignOffersRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of GetCampaignOffersRequest
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`offerIds` <- ApiClient$new()$deserializeObj(this_object$`offerIds`, "array[character]", loadNamespace("ympa_r_client"))
      self$`statuses` <- ApiClient$new()$deserializeObj(this_object$`statuses`, "array[OfferCampaignStatusType]", loadNamespace("ympa_r_client"))
      self$`categoryIds` <- ApiClient$new()$deserializeObj(this_object$`categoryIds`, "array[integer]", loadNamespace("ympa_r_client"))
      self$`vendorNames` <- ApiClient$new()$deserializeObj(this_object$`vendorNames`, "array[character]", loadNamespace("ympa_r_client"))
      self$`tags` <- ApiClient$new()$deserializeObj(this_object$`tags`, "array[character]", loadNamespace("ympa_r_client"))
      self
    },
    #' Validate JSON input with respect to GetCampaignOffersRequest
    #'
    #' @description
    #' Validate JSON input with respect to GetCampaignOffersRequest and throw an exception if invalid
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
    #' @return String representation of GetCampaignOffersRequest
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
# GetCampaignOffersRequest$unlock()
#
## Below is an example to define the print function
# GetCampaignOffersRequest$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# GetCampaignOffersRequest$lock()

