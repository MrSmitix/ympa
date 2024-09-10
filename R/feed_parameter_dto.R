#' Create a new FeedParameterDTO
#'
#' @description
#' Параметр прайс-листа.
#'
#' @docType class
#' @title FeedParameterDTO
#' @description FeedParameterDTO Class
#' @format An \code{R6Class} generator object
#' @field deleted Удалить ли значение параметра.  Возможное значение: * `true` — удалить значение параметра.  Используется вместе с параметром `name`. character [optional]
#' @field name Название параметра.  Возможное значение: - `reparseIntervalMinutes` — период скачивания прайс-листа. Маркет будет скачивать прайс-лист через количество минут, указанное в параметре `value`. Например, при `value=1440`, Маркет будет скачивать прайс-лист один раз в сутки.  {\% note alert \%}  Несмотря на установленное значение, Маркет скачает прайс-лист один раз в сутки.  {\% endnote \%}  Обязательный параметр. character
#' @field values Значения параметра.  Используется вместе с параметром `name`. list(integer) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
FeedParameterDTO <- R6::R6Class(
  "FeedParameterDTO",
  public = list(
    `deleted` = NULL,
    `name` = NULL,
    `values` = NULL,
    #' Initialize a new FeedParameterDTO class.
    #'
    #' @description
    #' Initialize a new FeedParameterDTO class.
    #'
    #' @param name Название параметра.  Возможное значение: - `reparseIntervalMinutes` — период скачивания прайс-листа. Маркет будет скачивать прайс-лист через количество минут, указанное в параметре `value`. Например, при `value=1440`, Маркет будет скачивать прайс-лист один раз в сутки.  {\% note alert \%}  Несмотря на установленное значение, Маркет скачает прайс-лист один раз в сутки.  {\% endnote \%}  Обязательный параметр.
    #' @param deleted Удалить ли значение параметра.  Возможное значение: * `true` — удалить значение параметра.  Используется вместе с параметром `name`.
    #' @param values Значения параметра.  Используется вместе с параметром `name`.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`name`, `deleted` = NULL, `values` = NULL, ...) {
      if (!missing(`name`)) {
        if (!(is.character(`name`) && length(`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", `name`))
        }
        self$`name` <- `name`
      }
      if (!is.null(`deleted`)) {
        if (!(is.logical(`deleted`) && length(`deleted`) == 1)) {
          stop(paste("Error! Invalid data for `deleted`. Must be a boolean:", `deleted`))
        }
        self$`deleted` <- `deleted`
      }
      if (!is.null(`values`)) {
        stopifnot(is.vector(`values`), length(`values`) != 0)
        sapply(`values`, function(x) stopifnot(is.character(x)))
        self$`values` <- `values`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return FeedParameterDTO in JSON format
    #' @export
    toJSON = function() {
      FeedParameterDTOObject <- list()
      if (!is.null(self$`deleted`)) {
        FeedParameterDTOObject[["deleted"]] <-
          self$`deleted`
      }
      if (!is.null(self$`name`)) {
        FeedParameterDTOObject[["name"]] <-
          self$`name`
      }
      if (!is.null(self$`values`)) {
        FeedParameterDTOObject[["values"]] <-
          self$`values`
      }
      FeedParameterDTOObject
    },
    #' Deserialize JSON string into an instance of FeedParameterDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of FeedParameterDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of FeedParameterDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`deleted`)) {
        self$`deleted` <- this_object$`deleted`
      }
      if (!is.null(this_object$`name`)) {
        self$`name` <- this_object$`name`
      }
      if (!is.null(this_object$`values`)) {
        self$`values` <- ApiClient$new()$deserializeObj(this_object$`values`, "array[integer]", loadNamespace("ympa_r_client"))
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return FeedParameterDTO in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`deleted`)) {
          sprintf(
          '"deleted":
            %s
                    ',
          tolower(self$`deleted`)
          )
        },
        if (!is.null(self$`name`)) {
          sprintf(
          '"name":
            "%s"
                    ',
          self$`name`
          )
        },
        if (!is.null(self$`values`)) {
          sprintf(
          '"values":
             [%s]
          ',
          paste(unlist(lapply(self$`values`, function(x) paste0('"', x, '"'))), collapse = ",")
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of FeedParameterDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of FeedParameterDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of FeedParameterDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`deleted` <- this_object$`deleted`
      self$`name` <- this_object$`name`
      self$`values` <- ApiClient$new()$deserializeObj(this_object$`values`, "array[integer]", loadNamespace("ympa_r_client"))
      self
    },
    #' Validate JSON input with respect to FeedParameterDTO
    #'
    #' @description
    #' Validate JSON input with respect to FeedParameterDTO and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `name`
      if (!is.null(input_json$`name`)) {
        if (!(is.character(input_json$`name`) && length(input_json$`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", input_json$`name`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for FeedParameterDTO: the required field `name` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of FeedParameterDTO
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
      # check if the required `name` is null
      if (is.null(self$`name`)) {
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
      # check if the required `name` is null
      if (is.null(self$`name`)) {
        invalid_fields["name"] <- "Non-nullable required field `name` cannot be null."
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
# FeedParameterDTO$unlock()
#
## Below is an example to define the print function
# FeedParameterDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# FeedParameterDTO$lock()

