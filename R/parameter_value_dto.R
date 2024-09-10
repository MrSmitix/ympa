#' Create a new ParameterValueDTO
#'
#' @description
#' Значение характеристики.  Вы можете указывать несколько значений одной характеристики при условии, что:  * Тип характеристики — `ENUM`. * В ответе на запрос [POST category/{categoryId}/parameters](../../reference/content/getCategoryContentParameters.md) у данной характеристики поле `multivalue` имеет значение `true`.  Для этого в `parameterValues` передавайте каждое значение отдельно — несколько объектов с параметрами `parameterId`, `valueId` и `value`. Параметр `parameterId` должен быть одинаковым. 
#'
#' @docType class
#' @title ParameterValueDTO
#' @description ParameterValueDTO Class
#' @format An \code{R6Class} generator object
#' @field parameterId Идентификатор характеристики. integer
#' @field unitId Идентификатор единицы измерения. Если вы не передали параметр `unitId`, используется единица измерения по умолчанию. integer [optional]
#' @field valueId Идентификатор значения.  Обязательно указывайте идентификатор, если передаете значение из перечня допустимых значений, полученного от Маркета.  Только для характеристик типа `ENUM`. integer [optional]
#' @field value Значение. character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ParameterValueDTO <- R6::R6Class(
  "ParameterValueDTO",
  public = list(
    `parameterId` = NULL,
    `unitId` = NULL,
    `valueId` = NULL,
    `value` = NULL,
    #' Initialize a new ParameterValueDTO class.
    #'
    #' @description
    #' Initialize a new ParameterValueDTO class.
    #'
    #' @param parameterId Идентификатор характеристики.
    #' @param unitId Идентификатор единицы измерения. Если вы не передали параметр `unitId`, используется единица измерения по умолчанию.
    #' @param valueId Идентификатор значения.  Обязательно указывайте идентификатор, если передаете значение из перечня допустимых значений, полученного от Маркета.  Только для характеристик типа `ENUM`.
    #' @param value Значение.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`parameterId`, `unitId` = NULL, `valueId` = NULL, `value` = NULL, ...) {
      if (!missing(`parameterId`)) {
        if (!(is.numeric(`parameterId`) && length(`parameterId`) == 1)) {
          stop(paste("Error! Invalid data for `parameterId`. Must be an integer:", `parameterId`))
        }
        self$`parameterId` <- `parameterId`
      }
      if (!is.null(`unitId`)) {
        if (!(is.numeric(`unitId`) && length(`unitId`) == 1)) {
          stop(paste("Error! Invalid data for `unitId`. Must be an integer:", `unitId`))
        }
        self$`unitId` <- `unitId`
      }
      if (!is.null(`valueId`)) {
        if (!(is.numeric(`valueId`) && length(`valueId`) == 1)) {
          stop(paste("Error! Invalid data for `valueId`. Must be an integer:", `valueId`))
        }
        self$`valueId` <- `valueId`
      }
      if (!is.null(`value`)) {
        if (!(is.character(`value`) && length(`value`) == 1)) {
          stop(paste("Error! Invalid data for `value`. Must be a string:", `value`))
        }
        self$`value` <- `value`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return ParameterValueDTO in JSON format
    #' @export
    toJSON = function() {
      ParameterValueDTOObject <- list()
      if (!is.null(self$`parameterId`)) {
        ParameterValueDTOObject[["parameterId"]] <-
          self$`parameterId`
      }
      if (!is.null(self$`unitId`)) {
        ParameterValueDTOObject[["unitId"]] <-
          self$`unitId`
      }
      if (!is.null(self$`valueId`)) {
        ParameterValueDTOObject[["valueId"]] <-
          self$`valueId`
      }
      if (!is.null(self$`value`)) {
        ParameterValueDTOObject[["value"]] <-
          self$`value`
      }
      ParameterValueDTOObject
    },
    #' Deserialize JSON string into an instance of ParameterValueDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of ParameterValueDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of ParameterValueDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`parameterId`)) {
        self$`parameterId` <- this_object$`parameterId`
      }
      if (!is.null(this_object$`unitId`)) {
        self$`unitId` <- this_object$`unitId`
      }
      if (!is.null(this_object$`valueId`)) {
        self$`valueId` <- this_object$`valueId`
      }
      if (!is.null(this_object$`value`)) {
        self$`value` <- this_object$`value`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return ParameterValueDTO in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`parameterId`)) {
          sprintf(
          '"parameterId":
            %d
                    ',
          self$`parameterId`
          )
        },
        if (!is.null(self$`unitId`)) {
          sprintf(
          '"unitId":
            %d
                    ',
          self$`unitId`
          )
        },
        if (!is.null(self$`valueId`)) {
          sprintf(
          '"valueId":
            %d
                    ',
          self$`valueId`
          )
        },
        if (!is.null(self$`value`)) {
          sprintf(
          '"value":
            "%s"
                    ',
          self$`value`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of ParameterValueDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of ParameterValueDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of ParameterValueDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`parameterId` <- this_object$`parameterId`
      self$`unitId` <- this_object$`unitId`
      self$`valueId` <- this_object$`valueId`
      self$`value` <- this_object$`value`
      self
    },
    #' Validate JSON input with respect to ParameterValueDTO
    #'
    #' @description
    #' Validate JSON input with respect to ParameterValueDTO and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `parameterId`
      if (!is.null(input_json$`parameterId`)) {
        if (!(is.numeric(input_json$`parameterId`) && length(input_json$`parameterId`) == 1)) {
          stop(paste("Error! Invalid data for `parameterId`. Must be an integer:", input_json$`parameterId`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ParameterValueDTO: the required field `parameterId` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of ParameterValueDTO
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
      # check if the required `parameterId` is null
      if (is.null(self$`parameterId`)) {
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
      # check if the required `parameterId` is null
      if (is.null(self$`parameterId`)) {
        invalid_fields["parameterId"] <- "Non-nullable required field `parameterId` cannot be null."
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
# ParameterValueDTO$unlock()
#
## Below is an example to define the print function
# ParameterValueDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# ParameterValueDTO$lock()

