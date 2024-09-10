#' Create a new GetMappingDTO
#'
#' @description
#' Информация о товарах в каталоге. 
#'
#' @docType class
#' @title GetMappingDTO
#' @description GetMappingDTO Class
#' @format An \code{R6Class} generator object
#' @field marketSku SKU на Маркете. integer [optional]
#' @field marketSkuName Название карточки товара.  Может отсутствовать в ответе, если товар еще не привязан к карточке. character [optional]
#' @field marketModelId Идентификатор модели на Маркете.  Может отсутствовать в ответе, если товар еще не привязан к карточке. integer [optional]
#' @field marketModelName Название модели на Маркете.  Может отсутствовать в ответе, если товар еще не привязан к карточке. character [optional]
#' @field marketCategoryId Идентификатор категории на Маркете, в которую попал товар.  Может отсутствовать в ответе, если Маркет еще не определил категорию товара. integer [optional]
#' @field marketCategoryName Название категории карточки на Маркете.  Может отсутствовать в ответе, если Маркет еще не определил категорию товара. character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
GetMappingDTO <- R6::R6Class(
  "GetMappingDTO",
  public = list(
    `marketSku` = NULL,
    `marketSkuName` = NULL,
    `marketModelId` = NULL,
    `marketModelName` = NULL,
    `marketCategoryId` = NULL,
    `marketCategoryName` = NULL,
    #' Initialize a new GetMappingDTO class.
    #'
    #' @description
    #' Initialize a new GetMappingDTO class.
    #'
    #' @param marketSku SKU на Маркете.
    #' @param marketSkuName Название карточки товара.  Может отсутствовать в ответе, если товар еще не привязан к карточке.
    #' @param marketModelId Идентификатор модели на Маркете.  Может отсутствовать в ответе, если товар еще не привязан к карточке.
    #' @param marketModelName Название модели на Маркете.  Может отсутствовать в ответе, если товар еще не привязан к карточке.
    #' @param marketCategoryId Идентификатор категории на Маркете, в которую попал товар.  Может отсутствовать в ответе, если Маркет еще не определил категорию товара.
    #' @param marketCategoryName Название категории карточки на Маркете.  Может отсутствовать в ответе, если Маркет еще не определил категорию товара.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`marketSku` = NULL, `marketSkuName` = NULL, `marketModelId` = NULL, `marketModelName` = NULL, `marketCategoryId` = NULL, `marketCategoryName` = NULL, ...) {
      if (!is.null(`marketSku`)) {
        if (!(is.numeric(`marketSku`) && length(`marketSku`) == 1)) {
          stop(paste("Error! Invalid data for `marketSku`. Must be an integer:", `marketSku`))
        }
        self$`marketSku` <- `marketSku`
      }
      if (!is.null(`marketSkuName`)) {
        if (!(is.character(`marketSkuName`) && length(`marketSkuName`) == 1)) {
          stop(paste("Error! Invalid data for `marketSkuName`. Must be a string:", `marketSkuName`))
        }
        self$`marketSkuName` <- `marketSkuName`
      }
      if (!is.null(`marketModelId`)) {
        if (!(is.numeric(`marketModelId`) && length(`marketModelId`) == 1)) {
          stop(paste("Error! Invalid data for `marketModelId`. Must be an integer:", `marketModelId`))
        }
        self$`marketModelId` <- `marketModelId`
      }
      if (!is.null(`marketModelName`)) {
        if (!(is.character(`marketModelName`) && length(`marketModelName`) == 1)) {
          stop(paste("Error! Invalid data for `marketModelName`. Must be a string:", `marketModelName`))
        }
        self$`marketModelName` <- `marketModelName`
      }
      if (!is.null(`marketCategoryId`)) {
        if (!(is.numeric(`marketCategoryId`) && length(`marketCategoryId`) == 1)) {
          stop(paste("Error! Invalid data for `marketCategoryId`. Must be an integer:", `marketCategoryId`))
        }
        self$`marketCategoryId` <- `marketCategoryId`
      }
      if (!is.null(`marketCategoryName`)) {
        if (!(is.character(`marketCategoryName`) && length(`marketCategoryName`) == 1)) {
          stop(paste("Error! Invalid data for `marketCategoryName`. Must be a string:", `marketCategoryName`))
        }
        self$`marketCategoryName` <- `marketCategoryName`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return GetMappingDTO in JSON format
    #' @export
    toJSON = function() {
      GetMappingDTOObject <- list()
      if (!is.null(self$`marketSku`)) {
        GetMappingDTOObject[["marketSku"]] <-
          self$`marketSku`
      }
      if (!is.null(self$`marketSkuName`)) {
        GetMappingDTOObject[["marketSkuName"]] <-
          self$`marketSkuName`
      }
      if (!is.null(self$`marketModelId`)) {
        GetMappingDTOObject[["marketModelId"]] <-
          self$`marketModelId`
      }
      if (!is.null(self$`marketModelName`)) {
        GetMappingDTOObject[["marketModelName"]] <-
          self$`marketModelName`
      }
      if (!is.null(self$`marketCategoryId`)) {
        GetMappingDTOObject[["marketCategoryId"]] <-
          self$`marketCategoryId`
      }
      if (!is.null(self$`marketCategoryName`)) {
        GetMappingDTOObject[["marketCategoryName"]] <-
          self$`marketCategoryName`
      }
      GetMappingDTOObject
    },
    #' Deserialize JSON string into an instance of GetMappingDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of GetMappingDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of GetMappingDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`marketSku`)) {
        self$`marketSku` <- this_object$`marketSku`
      }
      if (!is.null(this_object$`marketSkuName`)) {
        self$`marketSkuName` <- this_object$`marketSkuName`
      }
      if (!is.null(this_object$`marketModelId`)) {
        self$`marketModelId` <- this_object$`marketModelId`
      }
      if (!is.null(this_object$`marketModelName`)) {
        self$`marketModelName` <- this_object$`marketModelName`
      }
      if (!is.null(this_object$`marketCategoryId`)) {
        self$`marketCategoryId` <- this_object$`marketCategoryId`
      }
      if (!is.null(this_object$`marketCategoryName`)) {
        self$`marketCategoryName` <- this_object$`marketCategoryName`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return GetMappingDTO in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`marketSku`)) {
          sprintf(
          '"marketSku":
            %d
                    ',
          self$`marketSku`
          )
        },
        if (!is.null(self$`marketSkuName`)) {
          sprintf(
          '"marketSkuName":
            "%s"
                    ',
          self$`marketSkuName`
          )
        },
        if (!is.null(self$`marketModelId`)) {
          sprintf(
          '"marketModelId":
            %d
                    ',
          self$`marketModelId`
          )
        },
        if (!is.null(self$`marketModelName`)) {
          sprintf(
          '"marketModelName":
            "%s"
                    ',
          self$`marketModelName`
          )
        },
        if (!is.null(self$`marketCategoryId`)) {
          sprintf(
          '"marketCategoryId":
            %d
                    ',
          self$`marketCategoryId`
          )
        },
        if (!is.null(self$`marketCategoryName`)) {
          sprintf(
          '"marketCategoryName":
            "%s"
                    ',
          self$`marketCategoryName`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of GetMappingDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of GetMappingDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of GetMappingDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`marketSku` <- this_object$`marketSku`
      self$`marketSkuName` <- this_object$`marketSkuName`
      self$`marketModelId` <- this_object$`marketModelId`
      self$`marketModelName` <- this_object$`marketModelName`
      self$`marketCategoryId` <- this_object$`marketCategoryId`
      self$`marketCategoryName` <- this_object$`marketCategoryName`
      self
    },
    #' Validate JSON input with respect to GetMappingDTO
    #'
    #' @description
    #' Validate JSON input with respect to GetMappingDTO and throw an exception if invalid
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
    #' @return String representation of GetMappingDTO
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
# GetMappingDTO$unlock()
#
## Below is an example to define the print function
# GetMappingDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# GetMappingDTO$lock()

