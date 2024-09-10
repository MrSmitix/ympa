#' Create a new ValueRestrictionDTO
#'
#' @description
#' Ограничение на возможные значения, накладываемое другой характеристикой.  Если ограничивающая характеристика принимает определенное значение, список возможных значений ограничиваемой характеристики сокращается.  **Пример**  Характеристика **размер** сама по себе может принимать девять разных значений: `S`, `M`, `L`, `44`, `46`, `48`, `42/164`, `46/176`, `44S`.  Если ограничивающая характеристика **размерная сетка** принимает значение `RU`, список возможных значений размера сокращается до `44`, `46`, `48`. 
#'
#' @docType class
#' @title ValueRestrictionDTO
#' @description ValueRestrictionDTO Class
#' @format An \code{R6Class} generator object
#' @field limitingParameterId Идентификатор ограничивающей характеристики. integer
#' @field limitedValues Значения ограничивающей характеристики и соответствующие допустимые значения текущей характеристики. list(\link{OptionValuesLimitedDTO})
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ValueRestrictionDTO <- R6::R6Class(
  "ValueRestrictionDTO",
  public = list(
    `limitingParameterId` = NULL,
    `limitedValues` = NULL,
    #' Initialize a new ValueRestrictionDTO class.
    #'
    #' @description
    #' Initialize a new ValueRestrictionDTO class.
    #'
    #' @param limitingParameterId Идентификатор ограничивающей характеристики.
    #' @param limitedValues Значения ограничивающей характеристики и соответствующие допустимые значения текущей характеристики.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`limitingParameterId`, `limitedValues`, ...) {
      if (!missing(`limitingParameterId`)) {
        if (!(is.numeric(`limitingParameterId`) && length(`limitingParameterId`) == 1)) {
          stop(paste("Error! Invalid data for `limitingParameterId`. Must be an integer:", `limitingParameterId`))
        }
        self$`limitingParameterId` <- `limitingParameterId`
      }
      if (!missing(`limitedValues`)) {
        stopifnot(is.vector(`limitedValues`), length(`limitedValues`) != 0)
        sapply(`limitedValues`, function(x) stopifnot(R6::is.R6(x)))
        self$`limitedValues` <- `limitedValues`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return ValueRestrictionDTO in JSON format
    #' @export
    toJSON = function() {
      ValueRestrictionDTOObject <- list()
      if (!is.null(self$`limitingParameterId`)) {
        ValueRestrictionDTOObject[["limitingParameterId"]] <-
          self$`limitingParameterId`
      }
      if (!is.null(self$`limitedValues`)) {
        ValueRestrictionDTOObject[["limitedValues"]] <-
          lapply(self$`limitedValues`, function(x) x$toJSON())
      }
      ValueRestrictionDTOObject
    },
    #' Deserialize JSON string into an instance of ValueRestrictionDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of ValueRestrictionDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of ValueRestrictionDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`limitingParameterId`)) {
        self$`limitingParameterId` <- this_object$`limitingParameterId`
      }
      if (!is.null(this_object$`limitedValues`)) {
        self$`limitedValues` <- ApiClient$new()$deserializeObj(this_object$`limitedValues`, "array[OptionValuesLimitedDTO]", loadNamespace("ympa_r_client"))
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return ValueRestrictionDTO in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`limitingParameterId`)) {
          sprintf(
          '"limitingParameterId":
            %d
                    ',
          self$`limitingParameterId`
          )
        },
        if (!is.null(self$`limitedValues`)) {
          sprintf(
          '"limitedValues":
          [%s]
',
          paste(sapply(self$`limitedValues`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of ValueRestrictionDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of ValueRestrictionDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of ValueRestrictionDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`limitingParameterId` <- this_object$`limitingParameterId`
      self$`limitedValues` <- ApiClient$new()$deserializeObj(this_object$`limitedValues`, "array[OptionValuesLimitedDTO]", loadNamespace("ympa_r_client"))
      self
    },
    #' Validate JSON input with respect to ValueRestrictionDTO
    #'
    #' @description
    #' Validate JSON input with respect to ValueRestrictionDTO and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `limitingParameterId`
      if (!is.null(input_json$`limitingParameterId`)) {
        if (!(is.numeric(input_json$`limitingParameterId`) && length(input_json$`limitingParameterId`) == 1)) {
          stop(paste("Error! Invalid data for `limitingParameterId`. Must be an integer:", input_json$`limitingParameterId`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ValueRestrictionDTO: the required field `limitingParameterId` is missing."))
      }
      # check the required field `limitedValues`
      if (!is.null(input_json$`limitedValues`)) {
        stopifnot(is.vector(input_json$`limitedValues`), length(input_json$`limitedValues`) != 0)
        tmp <- sapply(input_json$`limitedValues`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ValueRestrictionDTO: the required field `limitedValues` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of ValueRestrictionDTO
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
      # check if the required `limitingParameterId` is null
      if (is.null(self$`limitingParameterId`)) {
        return(FALSE)
      }

      # check if the required `limitedValues` is null
      if (is.null(self$`limitedValues`)) {
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
      # check if the required `limitingParameterId` is null
      if (is.null(self$`limitingParameterId`)) {
        invalid_fields["limitingParameterId"] <- "Non-nullable required field `limitingParameterId` cannot be null."
      }

      # check if the required `limitedValues` is null
      if (is.null(self$`limitedValues`)) {
        invalid_fields["limitedValues"] <- "Non-nullable required field `limitedValues` cannot be null."
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
# ValueRestrictionDTO$unlock()
#
## Below is an example to define the print function
# ValueRestrictionDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# ValueRestrictionDTO$lock()

