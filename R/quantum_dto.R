#' Create a new QuantumDTO
#'
#' @description
#' Настройка продажи квантами.  Чтобы сбросить установленные ранее значения, передайте пустой параметр `quantum`.  {% cut \"Пример\" %}  ```json {   \"offers\": [     {       \"offerId\": \"08e35dc1-89a2-11e3-8055-0015e9b8c48d\",       \"quantum\": {}     }   ] } ```  {% endcut %} 
#'
#' @docType class
#' @title QuantumDTO
#' @description QuantumDTO Class
#' @format An \code{R6Class} generator object
#' @field minQuantity Минимальное количество единиц товара в заказе. Например, если указать 10, покупатель сможет добавить в корзину не меньше 10 единиц.  ⚠️ Если количество товара на складе меньше заданного, ограничение не сработает и покупатель сможет его заказать. integer [optional]
#' @field stepQuantity На сколько единиц покупатель сможет увеличить количество товара в корзине.  Например, если задать 5, покупатель сможет добавить к заказу только 5, 10, 15, ... единиц товара.  ⚠️ Если количество товара на складе не дотягивает до кванта, ограничение не сработает и покупатель сможет заказать количество, не кратное кванту. integer [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
QuantumDTO <- R6::R6Class(
  "QuantumDTO",
  public = list(
    `minQuantity` = NULL,
    `stepQuantity` = NULL,
    #' Initialize a new QuantumDTO class.
    #'
    #' @description
    #' Initialize a new QuantumDTO class.
    #'
    #' @param minQuantity Минимальное количество единиц товара в заказе. Например, если указать 10, покупатель сможет добавить в корзину не меньше 10 единиц.  ⚠️ Если количество товара на складе меньше заданного, ограничение не сработает и покупатель сможет его заказать.
    #' @param stepQuantity На сколько единиц покупатель сможет увеличить количество товара в корзине.  Например, если задать 5, покупатель сможет добавить к заказу только 5, 10, 15, ... единиц товара.  ⚠️ Если количество товара на складе не дотягивает до кванта, ограничение не сработает и покупатель сможет заказать количество, не кратное кванту.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`minQuantity` = NULL, `stepQuantity` = NULL, ...) {
      if (!is.null(`minQuantity`)) {
        if (!(is.numeric(`minQuantity`) && length(`minQuantity`) == 1)) {
          stop(paste("Error! Invalid data for `minQuantity`. Must be an integer:", `minQuantity`))
        }
        self$`minQuantity` <- `minQuantity`
      }
      if (!is.null(`stepQuantity`)) {
        if (!(is.numeric(`stepQuantity`) && length(`stepQuantity`) == 1)) {
          stop(paste("Error! Invalid data for `stepQuantity`. Must be an integer:", `stepQuantity`))
        }
        self$`stepQuantity` <- `stepQuantity`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return QuantumDTO in JSON format
    #' @export
    toJSON = function() {
      QuantumDTOObject <- list()
      if (!is.null(self$`minQuantity`)) {
        QuantumDTOObject[["minQuantity"]] <-
          self$`minQuantity`
      }
      if (!is.null(self$`stepQuantity`)) {
        QuantumDTOObject[["stepQuantity"]] <-
          self$`stepQuantity`
      }
      QuantumDTOObject
    },
    #' Deserialize JSON string into an instance of QuantumDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of QuantumDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of QuantumDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`minQuantity`)) {
        self$`minQuantity` <- this_object$`minQuantity`
      }
      if (!is.null(this_object$`stepQuantity`)) {
        self$`stepQuantity` <- this_object$`stepQuantity`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return QuantumDTO in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`minQuantity`)) {
          sprintf(
          '"minQuantity":
            %d
                    ',
          self$`minQuantity`
          )
        },
        if (!is.null(self$`stepQuantity`)) {
          sprintf(
          '"stepQuantity":
            %d
                    ',
          self$`stepQuantity`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of QuantumDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of QuantumDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of QuantumDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`minQuantity` <- this_object$`minQuantity`
      self$`stepQuantity` <- this_object$`stepQuantity`
      self
    },
    #' Validate JSON input with respect to QuantumDTO
    #'
    #' @description
    #' Validate JSON input with respect to QuantumDTO and throw an exception if invalid
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
    #' @return String representation of QuantumDTO
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
      if (self$`minQuantity` < 1) {
        return(FALSE)
      }

      if (self$`stepQuantity` > 100) {
        return(FALSE)
      }
      if (self$`stepQuantity` < 1) {
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
      if (self$`minQuantity` < 1) {
        invalid_fields["minQuantity"] <- "Invalid value for `minQuantity`, must be bigger than or equal to 1."
      }

      if (self$`stepQuantity` > 100) {
        invalid_fields["stepQuantity"] <- "Invalid value for `stepQuantity`, must be smaller than or equal to 100."
      }
      if (self$`stepQuantity` < 1) {
        invalid_fields["stepQuantity"] <- "Invalid value for `stepQuantity`, must be bigger than or equal to 1."
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
# QuantumDTO$unlock()
#
## Below is an example to define the print function
# QuantumDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# QuantumDTO$lock()

