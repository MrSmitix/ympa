#' Create a new GetQualityRatingRequest
#'
#' @description
#' Запрос информации по индексу качества.
#'
#' @docType class
#' @title GetQualityRatingRequest
#' @description GetQualityRatingRequest Class
#' @format An \code{R6Class} generator object
#' @field dateFrom Начало периода.  Формат даты: `ГГГГ‑ММ‑ДД`.  Не может быть раньше 30 дней от текущей даты. character [optional]
#' @field dateTo Конец периода.  Формат даты: `ГГГГ‑ММ‑ДД`.  Не может быть позже текущей даты. character [optional]
#' @field campaignIds Список идентификаторов магазинов. list(integer)
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
GetQualityRatingRequest <- R6::R6Class(
  "GetQualityRatingRequest",
  public = list(
    `dateFrom` = NULL,
    `dateTo` = NULL,
    `campaignIds` = NULL,
    #' Initialize a new GetQualityRatingRequest class.
    #'
    #' @description
    #' Initialize a new GetQualityRatingRequest class.
    #'
    #' @param campaignIds Список идентификаторов магазинов.
    #' @param dateFrom Начало периода.  Формат даты: `ГГГГ‑ММ‑ДД`.  Не может быть раньше 30 дней от текущей даты.
    #' @param dateTo Конец периода.  Формат даты: `ГГГГ‑ММ‑ДД`.  Не может быть позже текущей даты.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`campaignIds`, `dateFrom` = NULL, `dateTo` = NULL, ...) {
      if (!missing(`campaignIds`)) {
        stopifnot(is.vector(`campaignIds`), length(`campaignIds`) != 0)
        sapply(`campaignIds`, function(x) stopifnot(is.character(x)))
        if (!identical(`campaignIds`, unique(`campaignIds`))) {
          stop("Error! Items in `campaignIds` are not unique.")
        }
        self$`campaignIds` <- `campaignIds`
      }
      if (!is.null(`dateFrom`)) {
        if (!is.character(`dateFrom`)) {
          stop(paste("Error! Invalid data for `dateFrom`. Must be a string:", `dateFrom`))
        }
        self$`dateFrom` <- `dateFrom`
      }
      if (!is.null(`dateTo`)) {
        if (!is.character(`dateTo`)) {
          stop(paste("Error! Invalid data for `dateTo`. Must be a string:", `dateTo`))
        }
        self$`dateTo` <- `dateTo`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return GetQualityRatingRequest in JSON format
    #' @export
    toJSON = function() {
      GetQualityRatingRequestObject <- list()
      if (!is.null(self$`dateFrom`)) {
        GetQualityRatingRequestObject[["dateFrom"]] <-
          self$`dateFrom`
      }
      if (!is.null(self$`dateTo`)) {
        GetQualityRatingRequestObject[["dateTo"]] <-
          self$`dateTo`
      }
      if (!is.null(self$`campaignIds`)) {
        GetQualityRatingRequestObject[["campaignIds"]] <-
          self$`campaignIds`
      }
      GetQualityRatingRequestObject
    },
    #' Deserialize JSON string into an instance of GetQualityRatingRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of GetQualityRatingRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of GetQualityRatingRequest
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`dateFrom`)) {
        self$`dateFrom` <- this_object$`dateFrom`
      }
      if (!is.null(this_object$`dateTo`)) {
        self$`dateTo` <- this_object$`dateTo`
      }
      if (!is.null(this_object$`campaignIds`)) {
        self$`campaignIds` <- ApiClient$new()$deserializeObj(this_object$`campaignIds`, "set[integer]", loadNamespace("ympa_r_client"))
        if (!identical(self$`campaignIds`, unique(self$`campaignIds`))) {
          stop("Error! Items in `campaignIds` are not unique.")
        }
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return GetQualityRatingRequest in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`dateFrom`)) {
          sprintf(
          '"dateFrom":
            "%s"
                    ',
          self$`dateFrom`
          )
        },
        if (!is.null(self$`dateTo`)) {
          sprintf(
          '"dateTo":
            "%s"
                    ',
          self$`dateTo`
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
    #' Deserialize JSON string into an instance of GetQualityRatingRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of GetQualityRatingRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of GetQualityRatingRequest
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`dateFrom` <- this_object$`dateFrom`
      self$`dateTo` <- this_object$`dateTo`
      self$`campaignIds` <- ApiClient$new()$deserializeObj(this_object$`campaignIds`, "set[integer]", loadNamespace("ympa_r_client"))
      if (!identical(self$`campaignIds`, unique(self$`campaignIds`))) {
        stop("Error! Items in `campaignIds` are not unique.")
      }
      self
    },
    #' Validate JSON input with respect to GetQualityRatingRequest
    #'
    #' @description
    #' Validate JSON input with respect to GetQualityRatingRequest and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `campaignIds`
      if (!is.null(input_json$`campaignIds`)) {
        stopifnot(is.vector(input_json$`campaignIds`), length(input_json$`campaignIds`) != 0)
        if (!identical(input_json$`campaignIds`, unique(input_json$`campaignIds`))) {
          stop("Error! Items in `campaignIds` are not unique.")
        }
        tmp <- sapply(input_json$`campaignIds`, function(x) stopifnot(is.character(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for GetQualityRatingRequest: the required field `campaignIds` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of GetQualityRatingRequest
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
      # check if the required `campaignIds` is null
      if (is.null(self$`campaignIds`)) {
        return(FALSE)
      }

      if (length(self$`campaignIds`) > 50) {
        return(FALSE)
      }
      if (length(self$`campaignIds`) < 1) {
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
      # check if the required `campaignIds` is null
      if (is.null(self$`campaignIds`)) {
        invalid_fields["campaignIds"] <- "Non-nullable required field `campaignIds` cannot be null."
      }

      if (length(self$`campaignIds`) > 50) {
        invalid_fields["campaignIds"] <- "Invalid length for `campaignIds`, number of items must be less than or equal to 50."
      }
      if (length(self$`campaignIds`) < 1) {
        invalid_fields["campaignIds"] <- "Invalid length for ``, number of items must be greater than or equal to 1."
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
# GetQualityRatingRequest$unlock()
#
## Below is an example to define the print function
# GetQualityRatingRequest$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# GetQualityRatingRequest$lock()

