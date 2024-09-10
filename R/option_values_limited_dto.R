#' Create a new OptionValuesLimitedDTO
#'
#' @description
#' Значение ограничивающей характеристики и список допустимых значений ограничиваемой характеристики.
#'
#' @docType class
#' @title OptionValuesLimitedDTO
#' @description OptionValuesLimitedDTO Class
#' @format An \code{R6Class} generator object
#' @field limitingOptionValueId Идентификатор значения ограничивающей характеристики. integer
#' @field optionValueIds Идентификаторы допустимых значений ограничиваемой характеристики. list(integer)
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
OptionValuesLimitedDTO <- R6::R6Class(
  "OptionValuesLimitedDTO",
  public = list(
    `limitingOptionValueId` = NULL,
    `optionValueIds` = NULL,
    #' Initialize a new OptionValuesLimitedDTO class.
    #'
    #' @description
    #' Initialize a new OptionValuesLimitedDTO class.
    #'
    #' @param limitingOptionValueId Идентификатор значения ограничивающей характеристики.
    #' @param optionValueIds Идентификаторы допустимых значений ограничиваемой характеристики.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`limitingOptionValueId`, `optionValueIds`, ...) {
      if (!missing(`limitingOptionValueId`)) {
        if (!(is.numeric(`limitingOptionValueId`) && length(`limitingOptionValueId`) == 1)) {
          stop(paste("Error! Invalid data for `limitingOptionValueId`. Must be an integer:", `limitingOptionValueId`))
        }
        self$`limitingOptionValueId` <- `limitingOptionValueId`
      }
      if (!missing(`optionValueIds`)) {
        stopifnot(is.vector(`optionValueIds`), length(`optionValueIds`) != 0)
        sapply(`optionValueIds`, function(x) stopifnot(is.character(x)))
        self$`optionValueIds` <- `optionValueIds`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return OptionValuesLimitedDTO in JSON format
    #' @export
    toJSON = function() {
      OptionValuesLimitedDTOObject <- list()
      if (!is.null(self$`limitingOptionValueId`)) {
        OptionValuesLimitedDTOObject[["limitingOptionValueId"]] <-
          self$`limitingOptionValueId`
      }
      if (!is.null(self$`optionValueIds`)) {
        OptionValuesLimitedDTOObject[["optionValueIds"]] <-
          self$`optionValueIds`
      }
      OptionValuesLimitedDTOObject
    },
    #' Deserialize JSON string into an instance of OptionValuesLimitedDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of OptionValuesLimitedDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of OptionValuesLimitedDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`limitingOptionValueId`)) {
        self$`limitingOptionValueId` <- this_object$`limitingOptionValueId`
      }
      if (!is.null(this_object$`optionValueIds`)) {
        self$`optionValueIds` <- ApiClient$new()$deserializeObj(this_object$`optionValueIds`, "array[integer]", loadNamespace("ympa_r_client"))
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return OptionValuesLimitedDTO in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`limitingOptionValueId`)) {
          sprintf(
          '"limitingOptionValueId":
            %d
                    ',
          self$`limitingOptionValueId`
          )
        },
        if (!is.null(self$`optionValueIds`)) {
          sprintf(
          '"optionValueIds":
             [%s]
          ',
          paste(unlist(lapply(self$`optionValueIds`, function(x) paste0('"', x, '"'))), collapse = ",")
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of OptionValuesLimitedDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of OptionValuesLimitedDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of OptionValuesLimitedDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`limitingOptionValueId` <- this_object$`limitingOptionValueId`
      self$`optionValueIds` <- ApiClient$new()$deserializeObj(this_object$`optionValueIds`, "array[integer]", loadNamespace("ympa_r_client"))
      self
    },
    #' Validate JSON input with respect to OptionValuesLimitedDTO
    #'
    #' @description
    #' Validate JSON input with respect to OptionValuesLimitedDTO and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `limitingOptionValueId`
      if (!is.null(input_json$`limitingOptionValueId`)) {
        if (!(is.numeric(input_json$`limitingOptionValueId`) && length(input_json$`limitingOptionValueId`) == 1)) {
          stop(paste("Error! Invalid data for `limitingOptionValueId`. Must be an integer:", input_json$`limitingOptionValueId`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for OptionValuesLimitedDTO: the required field `limitingOptionValueId` is missing."))
      }
      # check the required field `optionValueIds`
      if (!is.null(input_json$`optionValueIds`)) {
        stopifnot(is.vector(input_json$`optionValueIds`), length(input_json$`optionValueIds`) != 0)
        tmp <- sapply(input_json$`optionValueIds`, function(x) stopifnot(is.character(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for OptionValuesLimitedDTO: the required field `optionValueIds` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of OptionValuesLimitedDTO
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
      # check if the required `limitingOptionValueId` is null
      if (is.null(self$`limitingOptionValueId`)) {
        return(FALSE)
      }

      # check if the required `optionValueIds` is null
      if (is.null(self$`optionValueIds`)) {
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
      # check if the required `limitingOptionValueId` is null
      if (is.null(self$`limitingOptionValueId`)) {
        invalid_fields["limitingOptionValueId"] <- "Non-nullable required field `limitingOptionValueId` cannot be null."
      }

      # check if the required `optionValueIds` is null
      if (is.null(self$`optionValueIds`)) {
        invalid_fields["optionValueIds"] <- "Non-nullable required field `optionValueIds` cannot be null."
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
# OptionValuesLimitedDTO$unlock()
#
## Below is an example to define the print function
# OptionValuesLimitedDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# OptionValuesLimitedDTO$lock()

