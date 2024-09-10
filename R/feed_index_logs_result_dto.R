#' Create a new FeedIndexLogsResultDTO
#'
#' @description
#' Результат выполнения запроса отчета по индексации прайс-листа.
#'
#' @docType class
#' @title FeedIndexLogsResultDTO
#' @description FeedIndexLogsResultDTO Class
#' @format An \code{R6Class} generator object
#' @field feed  \link{FeedIndexLogsFeedDTO} [optional]
#' @field indexLogRecords Список отчетов по индексации прайс-листа. list(\link{FeedIndexLogsRecordDTO})
#' @field total Количество отчетов на всех страницах выходных данных. integer [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
FeedIndexLogsResultDTO <- R6::R6Class(
  "FeedIndexLogsResultDTO",
  public = list(
    `feed` = NULL,
    `indexLogRecords` = NULL,
    `total` = NULL,
    #' Initialize a new FeedIndexLogsResultDTO class.
    #'
    #' @description
    #' Initialize a new FeedIndexLogsResultDTO class.
    #'
    #' @param indexLogRecords Список отчетов по индексации прайс-листа.
    #' @param feed feed
    #' @param total Количество отчетов на всех страницах выходных данных.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`indexLogRecords`, `feed` = NULL, `total` = NULL, ...) {
      if (!missing(`indexLogRecords`)) {
        stopifnot(is.vector(`indexLogRecords`), length(`indexLogRecords`) != 0)
        sapply(`indexLogRecords`, function(x) stopifnot(R6::is.R6(x)))
        self$`indexLogRecords` <- `indexLogRecords`
      }
      if (!is.null(`feed`)) {
        stopifnot(R6::is.R6(`feed`))
        self$`feed` <- `feed`
      }
      if (!is.null(`total`)) {
        if (!(is.numeric(`total`) && length(`total`) == 1)) {
          stop(paste("Error! Invalid data for `total`. Must be an integer:", `total`))
        }
        self$`total` <- `total`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return FeedIndexLogsResultDTO in JSON format
    #' @export
    toJSON = function() {
      FeedIndexLogsResultDTOObject <- list()
      if (!is.null(self$`feed`)) {
        FeedIndexLogsResultDTOObject[["feed"]] <-
          self$`feed`$toJSON()
      }
      if (!is.null(self$`indexLogRecords`)) {
        FeedIndexLogsResultDTOObject[["indexLogRecords"]] <-
          lapply(self$`indexLogRecords`, function(x) x$toJSON())
      }
      if (!is.null(self$`total`)) {
        FeedIndexLogsResultDTOObject[["total"]] <-
          self$`total`
      }
      FeedIndexLogsResultDTOObject
    },
    #' Deserialize JSON string into an instance of FeedIndexLogsResultDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of FeedIndexLogsResultDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of FeedIndexLogsResultDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`feed`)) {
        `feed_object` <- FeedIndexLogsFeedDTO$new()
        `feed_object`$fromJSON(jsonlite::toJSON(this_object$`feed`, auto_unbox = TRUE, digits = NA))
        self$`feed` <- `feed_object`
      }
      if (!is.null(this_object$`indexLogRecords`)) {
        self$`indexLogRecords` <- ApiClient$new()$deserializeObj(this_object$`indexLogRecords`, "array[FeedIndexLogsRecordDTO]", loadNamespace("ympa_r_client"))
      }
      if (!is.null(this_object$`total`)) {
        self$`total` <- this_object$`total`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return FeedIndexLogsResultDTO in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`feed`)) {
          sprintf(
          '"feed":
          %s
          ',
          jsonlite::toJSON(self$`feed`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`indexLogRecords`)) {
          sprintf(
          '"indexLogRecords":
          [%s]
',
          paste(sapply(self$`indexLogRecords`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        },
        if (!is.null(self$`total`)) {
          sprintf(
          '"total":
            %d
                    ',
          self$`total`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of FeedIndexLogsResultDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of FeedIndexLogsResultDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of FeedIndexLogsResultDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`feed` <- FeedIndexLogsFeedDTO$new()$fromJSON(jsonlite::toJSON(this_object$`feed`, auto_unbox = TRUE, digits = NA))
      self$`indexLogRecords` <- ApiClient$new()$deserializeObj(this_object$`indexLogRecords`, "array[FeedIndexLogsRecordDTO]", loadNamespace("ympa_r_client"))
      self$`total` <- this_object$`total`
      self
    },
    #' Validate JSON input with respect to FeedIndexLogsResultDTO
    #'
    #' @description
    #' Validate JSON input with respect to FeedIndexLogsResultDTO and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `indexLogRecords`
      if (!is.null(input_json$`indexLogRecords`)) {
        stopifnot(is.vector(input_json$`indexLogRecords`), length(input_json$`indexLogRecords`) != 0)
        tmp <- sapply(input_json$`indexLogRecords`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for FeedIndexLogsResultDTO: the required field `indexLogRecords` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of FeedIndexLogsResultDTO
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
      # check if the required `indexLogRecords` is null
      if (is.null(self$`indexLogRecords`)) {
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
      # check if the required `indexLogRecords` is null
      if (is.null(self$`indexLogRecords`)) {
        invalid_fields["indexLogRecords"] <- "Non-nullable required field `indexLogRecords` cannot be null."
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
# FeedIndexLogsResultDTO$unlock()
#
## Below is an example to define the print function
# FeedIndexLogsResultDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# FeedIndexLogsResultDTO$lock()

