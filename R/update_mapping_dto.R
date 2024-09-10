#' Create a new UpdateMappingDTO
#'
#' @description
#' Карточка на Маркете, которая, с вашей точки зрения, подходит товару. Чтобы определить идентификатор подходящей карточки, воспользуйтесь поиском в кабинете (**Товары** → **Каталог** → **Загрузить товары**).  По результатам проверки Маркет может привязать товар к более подходящей карточке. 
#'
#' @docType class
#' @title UpdateMappingDTO
#' @description UpdateMappingDTO Class
#' @format An \code{R6Class} generator object
#' @field marketSku SKU на Маркете. integer [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
UpdateMappingDTO <- R6::R6Class(
  "UpdateMappingDTO",
  public = list(
    `marketSku` = NULL,
    #' Initialize a new UpdateMappingDTO class.
    #'
    #' @description
    #' Initialize a new UpdateMappingDTO class.
    #'
    #' @param marketSku SKU на Маркете.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`marketSku` = NULL, ...) {
      if (!is.null(`marketSku`)) {
        if (!(is.numeric(`marketSku`) && length(`marketSku`) == 1)) {
          stop(paste("Error! Invalid data for `marketSku`. Must be an integer:", `marketSku`))
        }
        self$`marketSku` <- `marketSku`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return UpdateMappingDTO in JSON format
    #' @export
    toJSON = function() {
      UpdateMappingDTOObject <- list()
      if (!is.null(self$`marketSku`)) {
        UpdateMappingDTOObject[["marketSku"]] <-
          self$`marketSku`
      }
      UpdateMappingDTOObject
    },
    #' Deserialize JSON string into an instance of UpdateMappingDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of UpdateMappingDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of UpdateMappingDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`marketSku`)) {
        self$`marketSku` <- this_object$`marketSku`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return UpdateMappingDTO in JSON format
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
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of UpdateMappingDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of UpdateMappingDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of UpdateMappingDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`marketSku` <- this_object$`marketSku`
      self
    },
    #' Validate JSON input with respect to UpdateMappingDTO
    #'
    #' @description
    #' Validate JSON input with respect to UpdateMappingDTO and throw an exception if invalid
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
    #' @return String representation of UpdateMappingDTO
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
# UpdateMappingDTO$unlock()
#
## Below is an example to define the print function
# UpdateMappingDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# UpdateMappingDTO$lock()

