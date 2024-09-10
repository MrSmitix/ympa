#' Create a new GetWarehouseStocksRequest
#'
#' @description
#' Фильтры для запроса остатков. 
#'
#' @docType class
#' @title GetWarehouseStocksRequest
#' @description GetWarehouseStocksRequest Class
#' @format An \code{R6Class} generator object
#' @field withTurnover **Только для модели FBY**  Возвращать ли информацию по оборачиваемости.  Значение по умолчанию — `false`. Если информация нужна, передайте значение `true`. character [optional]
#' @field archived Фильтр по нахождению в архиве.  Передайте `true`, чтобы получить информацию об остатках товаров, которые находятся в архиве. Если фильтр не заполнен или передано `false`, в ответе возвращается информация о товарах, которые не находятся в архиве. character [optional]
#' @field offerIds Фильтр по вашим SKU товаров.  Возвращается информация об остатках всех переданных SKU, включая товары в архиве.  {\% note warning \"Такой список возвращается только целиком\" \%}  Если вы запрашиваете информацию по конкретным SKU, не заполняйте:  * `page_token` * `limit` * `archived`  {\% endnote \%}    list(character) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
GetWarehouseStocksRequest <- R6::R6Class(
  "GetWarehouseStocksRequest",
  public = list(
    `withTurnover` = NULL,
    `archived` = NULL,
    `offerIds` = NULL,
    #' Initialize a new GetWarehouseStocksRequest class.
    #'
    #' @description
    #' Initialize a new GetWarehouseStocksRequest class.
    #'
    #' @param withTurnover **Только для модели FBY**  Возвращать ли информацию по оборачиваемости.  Значение по умолчанию — `false`. Если информация нужна, передайте значение `true`.. Default to FALSE.
    #' @param archived Фильтр по нахождению в архиве.  Передайте `true`, чтобы получить информацию об остатках товаров, которые находятся в архиве. Если фильтр не заполнен или передано `false`, в ответе возвращается информация о товарах, которые не находятся в архиве.
    #' @param offerIds Фильтр по вашим SKU товаров.  Возвращается информация об остатках всех переданных SKU, включая товары в архиве.  {\% note warning \"Такой список возвращается только целиком\" \%}  Если вы запрашиваете информацию по конкретным SKU, не заполняйте:  * `page_token` * `limit` * `archived`  {\% endnote \%}   
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`withTurnover` = FALSE, `archived` = NULL, `offerIds` = NULL, ...) {
      if (!is.null(`withTurnover`)) {
        if (!(is.logical(`withTurnover`) && length(`withTurnover`) == 1)) {
          stop(paste("Error! Invalid data for `withTurnover`. Must be a boolean:", `withTurnover`))
        }
        self$`withTurnover` <- `withTurnover`
      }
      if (!is.null(`archived`)) {
        if (!(is.logical(`archived`) && length(`archived`) == 1)) {
          stop(paste("Error! Invalid data for `archived`. Must be a boolean:", `archived`))
        }
        self$`archived` <- `archived`
      }
      if (!is.null(`offerIds`)) {
        stopifnot(is.vector(`offerIds`), length(`offerIds`) != 0)
        sapply(`offerIds`, function(x) stopifnot(is.character(x)))
        if (!identical(`offerIds`, unique(`offerIds`))) {
          stop("Error! Items in `offerIds` are not unique.")
        }
        self$`offerIds` <- `offerIds`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return GetWarehouseStocksRequest in JSON format
    #' @export
    toJSON = function() {
      GetWarehouseStocksRequestObject <- list()
      if (!is.null(self$`withTurnover`)) {
        GetWarehouseStocksRequestObject[["withTurnover"]] <-
          self$`withTurnover`
      }
      if (!is.null(self$`archived`)) {
        GetWarehouseStocksRequestObject[["archived"]] <-
          self$`archived`
      }
      if (!is.null(self$`offerIds`)) {
        GetWarehouseStocksRequestObject[["offerIds"]] <-
          self$`offerIds`
      }
      GetWarehouseStocksRequestObject
    },
    #' Deserialize JSON string into an instance of GetWarehouseStocksRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of GetWarehouseStocksRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of GetWarehouseStocksRequest
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`withTurnover`)) {
        self$`withTurnover` <- this_object$`withTurnover`
      }
      if (!is.null(this_object$`archived`)) {
        self$`archived` <- this_object$`archived`
      }
      if (!is.null(this_object$`offerIds`)) {
        self$`offerIds` <- ApiClient$new()$deserializeObj(this_object$`offerIds`, "set[character]", loadNamespace("ympa_r_client"))
        if (!identical(self$`offerIds`, unique(self$`offerIds`))) {
          stop("Error! Items in `offerIds` are not unique.")
        }
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return GetWarehouseStocksRequest in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`withTurnover`)) {
          sprintf(
          '"withTurnover":
            %s
                    ',
          tolower(self$`withTurnover`)
          )
        },
        if (!is.null(self$`archived`)) {
          sprintf(
          '"archived":
            %s
                    ',
          tolower(self$`archived`)
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
    #' Deserialize JSON string into an instance of GetWarehouseStocksRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of GetWarehouseStocksRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of GetWarehouseStocksRequest
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`withTurnover` <- this_object$`withTurnover`
      self$`archived` <- this_object$`archived`
      self$`offerIds` <- ApiClient$new()$deserializeObj(this_object$`offerIds`, "set[character]", loadNamespace("ympa_r_client"))
      if (!identical(self$`offerIds`, unique(self$`offerIds`))) {
        stop("Error! Items in `offerIds` are not unique.")
      }
      self
    },
    #' Validate JSON input with respect to GetWarehouseStocksRequest
    #'
    #' @description
    #' Validate JSON input with respect to GetWarehouseStocksRequest and throw an exception if invalid
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
    #' @return String representation of GetWarehouseStocksRequest
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
# GetWarehouseStocksRequest$unlock()
#
## Below is an example to define the print function
# GetWarehouseStocksRequest$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# GetWarehouseStocksRequest$lock()

