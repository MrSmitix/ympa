#' Create a new OfferMappingDTO
#'
#' @description
#' Информация о текущей карточке товара на Маркете.
#'
#' @docType class
#' @title OfferMappingDTO
#' @description OfferMappingDTO Class
#' @format An \code{R6Class} generator object
#' @field marketSku SKU на Маркете. integer [optional]
#' @field modelId Идентификатор модели для текущей карточки товара на Маркете.  Например, две лопатки разных цветов имеют разные SKU на Маркете (параметр `marketSku`), но одинаковый идентификатор модели товара. integer [optional]
#' @field categoryId Идентификатор категории для текущей карточки товара на Маркете. integer [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
OfferMappingDTO <- R6::R6Class(
  "OfferMappingDTO",
  public = list(
    `marketSku` = NULL,
    `modelId` = NULL,
    `categoryId` = NULL,
    #' Initialize a new OfferMappingDTO class.
    #'
    #' @description
    #' Initialize a new OfferMappingDTO class.
    #'
    #' @param marketSku SKU на Маркете.
    #' @param modelId Идентификатор модели для текущей карточки товара на Маркете.  Например, две лопатки разных цветов имеют разные SKU на Маркете (параметр `marketSku`), но одинаковый идентификатор модели товара.
    #' @param categoryId Идентификатор категории для текущей карточки товара на Маркете.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`marketSku` = NULL, `modelId` = NULL, `categoryId` = NULL, ...) {
      if (!is.null(`marketSku`)) {
        if (!(is.numeric(`marketSku`) && length(`marketSku`) == 1)) {
          stop(paste("Error! Invalid data for `marketSku`. Must be an integer:", `marketSku`))
        }
        self$`marketSku` <- `marketSku`
      }
      if (!is.null(`modelId`)) {
        if (!(is.numeric(`modelId`) && length(`modelId`) == 1)) {
          stop(paste("Error! Invalid data for `modelId`. Must be an integer:", `modelId`))
        }
        self$`modelId` <- `modelId`
      }
      if (!is.null(`categoryId`)) {
        if (!(is.numeric(`categoryId`) && length(`categoryId`) == 1)) {
          stop(paste("Error! Invalid data for `categoryId`. Must be an integer:", `categoryId`))
        }
        self$`categoryId` <- `categoryId`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return OfferMappingDTO in JSON format
    #' @export
    toJSON = function() {
      OfferMappingDTOObject <- list()
      if (!is.null(self$`marketSku`)) {
        OfferMappingDTOObject[["marketSku"]] <-
          self$`marketSku`
      }
      if (!is.null(self$`modelId`)) {
        OfferMappingDTOObject[["modelId"]] <-
          self$`modelId`
      }
      if (!is.null(self$`categoryId`)) {
        OfferMappingDTOObject[["categoryId"]] <-
          self$`categoryId`
      }
      OfferMappingDTOObject
    },
    #' Deserialize JSON string into an instance of OfferMappingDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of OfferMappingDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of OfferMappingDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`marketSku`)) {
        self$`marketSku` <- this_object$`marketSku`
      }
      if (!is.null(this_object$`modelId`)) {
        self$`modelId` <- this_object$`modelId`
      }
      if (!is.null(this_object$`categoryId`)) {
        self$`categoryId` <- this_object$`categoryId`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return OfferMappingDTO in JSON format
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
        if (!is.null(self$`modelId`)) {
          sprintf(
          '"modelId":
            %d
                    ',
          self$`modelId`
          )
        },
        if (!is.null(self$`categoryId`)) {
          sprintf(
          '"categoryId":
            %d
                    ',
          self$`categoryId`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of OfferMappingDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of OfferMappingDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of OfferMappingDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`marketSku` <- this_object$`marketSku`
      self$`modelId` <- this_object$`modelId`
      self$`categoryId` <- this_object$`categoryId`
      self
    },
    #' Validate JSON input with respect to OfferMappingDTO
    #'
    #' @description
    #' Validate JSON input with respect to OfferMappingDTO and throw an exception if invalid
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
    #' @return String representation of OfferMappingDTO
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
# OfferMappingDTO$unlock()
#
## Below is an example to define the print function
# OfferMappingDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# OfferMappingDTO$lock()

