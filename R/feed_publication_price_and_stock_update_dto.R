#' Create a new FeedPublicationPriceAndStockUpdateDTO
#'
#' @description
#' Последнее обновление цен и наличия товаров на Маркете. Если последнее по времени обновление было полным, в параметре выводятся те же данные, что и в параметре `full`. Выводится, если параметр `publication status=OK`. 
#'
#' @docType class
#' @title FeedPublicationPriceAndStockUpdateDTO
#' @description FeedPublicationPriceAndStockUpdateDTO Class
#' @format An \code{R6Class} generator object
#' @field fileTime Дата и время, которые магазин указал в прайс-листе.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:42:42+03:00`. character [optional]
#' @field publishedTime Дата и время публикации предложений из прайс-листа на Маркете.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:42:42+03:00`. character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
FeedPublicationPriceAndStockUpdateDTO <- R6::R6Class(
  "FeedPublicationPriceAndStockUpdateDTO",
  public = list(
    `fileTime` = NULL,
    `publishedTime` = NULL,
    #' Initialize a new FeedPublicationPriceAndStockUpdateDTO class.
    #'
    #' @description
    #' Initialize a new FeedPublicationPriceAndStockUpdateDTO class.
    #'
    #' @param fileTime Дата и время, которые магазин указал в прайс-листе.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:42:42+03:00`.
    #' @param publishedTime Дата и время публикации предложений из прайс-листа на Маркете.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:42:42+03:00`.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`fileTime` = NULL, `publishedTime` = NULL, ...) {
      if (!is.null(`fileTime`)) {
        if (!is.character(`fileTime`)) {
          stop(paste("Error! Invalid data for `fileTime`. Must be a string:", `fileTime`))
        }
        self$`fileTime` <- `fileTime`
      }
      if (!is.null(`publishedTime`)) {
        if (!is.character(`publishedTime`)) {
          stop(paste("Error! Invalid data for `publishedTime`. Must be a string:", `publishedTime`))
        }
        self$`publishedTime` <- `publishedTime`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return FeedPublicationPriceAndStockUpdateDTO in JSON format
    #' @export
    toJSON = function() {
      FeedPublicationPriceAndStockUpdateDTOObject <- list()
      if (!is.null(self$`fileTime`)) {
        FeedPublicationPriceAndStockUpdateDTOObject[["fileTime"]] <-
          self$`fileTime`
      }
      if (!is.null(self$`publishedTime`)) {
        FeedPublicationPriceAndStockUpdateDTOObject[["publishedTime"]] <-
          self$`publishedTime`
      }
      FeedPublicationPriceAndStockUpdateDTOObject
    },
    #' Deserialize JSON string into an instance of FeedPublicationPriceAndStockUpdateDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of FeedPublicationPriceAndStockUpdateDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of FeedPublicationPriceAndStockUpdateDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`fileTime`)) {
        self$`fileTime` <- this_object$`fileTime`
      }
      if (!is.null(this_object$`publishedTime`)) {
        self$`publishedTime` <- this_object$`publishedTime`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return FeedPublicationPriceAndStockUpdateDTO in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`fileTime`)) {
          sprintf(
          '"fileTime":
            "%s"
                    ',
          self$`fileTime`
          )
        },
        if (!is.null(self$`publishedTime`)) {
          sprintf(
          '"publishedTime":
            "%s"
                    ',
          self$`publishedTime`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of FeedPublicationPriceAndStockUpdateDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of FeedPublicationPriceAndStockUpdateDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of FeedPublicationPriceAndStockUpdateDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`fileTime` <- this_object$`fileTime`
      self$`publishedTime` <- this_object$`publishedTime`
      self
    },
    #' Validate JSON input with respect to FeedPublicationPriceAndStockUpdateDTO
    #'
    #' @description
    #' Validate JSON input with respect to FeedPublicationPriceAndStockUpdateDTO and throw an exception if invalid
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
    #' @return String representation of FeedPublicationPriceAndStockUpdateDTO
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
# FeedPublicationPriceAndStockUpdateDTO$unlock()
#
## Below is an example to define the print function
# FeedPublicationPriceAndStockUpdateDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# FeedPublicationPriceAndStockUpdateDTO$lock()

