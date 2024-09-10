#' Create a new UpdateStockItemDTO
#'
#' @description
#' Информация об остатках товара. 
#'
#' @docType class
#' @title UpdateStockItemDTO
#' @description UpdateStockItemDTO Class
#' @format An \code{R6Class} generator object
#' @field count Количество доступного товара. integer
#' @field updatedAt Дата и время последнего обновления информации об остатках. <br><br> Если вы не передали параметр `updatedAt`, используется текущее время. <br><br> Формат даты и времени: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:42:42+03:00`. character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
UpdateStockItemDTO <- R6::R6Class(
  "UpdateStockItemDTO",
  public = list(
    `count` = NULL,
    `updatedAt` = NULL,
    #' Initialize a new UpdateStockItemDTO class.
    #'
    #' @description
    #' Initialize a new UpdateStockItemDTO class.
    #'
    #' @param count Количество доступного товара.
    #' @param updatedAt Дата и время последнего обновления информации об остатках. <br><br> Если вы не передали параметр `updatedAt`, используется текущее время. <br><br> Формат даты и времени: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:42:42+03:00`.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`count`, `updatedAt` = NULL, ...) {
      if (!missing(`count`)) {
        if (!(is.numeric(`count`) && length(`count`) == 1)) {
          stop(paste("Error! Invalid data for `count`. Must be an integer:", `count`))
        }
        self$`count` <- `count`
      }
      if (!is.null(`updatedAt`)) {
        if (!is.character(`updatedAt`)) {
          stop(paste("Error! Invalid data for `updatedAt`. Must be a string:", `updatedAt`))
        }
        self$`updatedAt` <- `updatedAt`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return UpdateStockItemDTO in JSON format
    #' @export
    toJSON = function() {
      UpdateStockItemDTOObject <- list()
      if (!is.null(self$`count`)) {
        UpdateStockItemDTOObject[["count"]] <-
          self$`count`
      }
      if (!is.null(self$`updatedAt`)) {
        UpdateStockItemDTOObject[["updatedAt"]] <-
          self$`updatedAt`
      }
      UpdateStockItemDTOObject
    },
    #' Deserialize JSON string into an instance of UpdateStockItemDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of UpdateStockItemDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of UpdateStockItemDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`count`)) {
        self$`count` <- this_object$`count`
      }
      if (!is.null(this_object$`updatedAt`)) {
        self$`updatedAt` <- this_object$`updatedAt`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return UpdateStockItemDTO in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`count`)) {
          sprintf(
          '"count":
            %d
                    ',
          self$`count`
          )
        },
        if (!is.null(self$`updatedAt`)) {
          sprintf(
          '"updatedAt":
            "%s"
                    ',
          self$`updatedAt`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of UpdateStockItemDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of UpdateStockItemDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of UpdateStockItemDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`count` <- this_object$`count`
      self$`updatedAt` <- this_object$`updatedAt`
      self
    },
    #' Validate JSON input with respect to UpdateStockItemDTO
    #'
    #' @description
    #' Validate JSON input with respect to UpdateStockItemDTO and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `count`
      if (!is.null(input_json$`count`)) {
        if (!(is.numeric(input_json$`count`) && length(input_json$`count`) == 1)) {
          stop(paste("Error! Invalid data for `count`. Must be an integer:", input_json$`count`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for UpdateStockItemDTO: the required field `count` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of UpdateStockItemDTO
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
      # check if the required `count` is null
      if (is.null(self$`count`)) {
        return(FALSE)
      }

      if (self$`count` > 2000000000) {
        return(FALSE)
      }
      if (self$`count` < 0) {
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
      # check if the required `count` is null
      if (is.null(self$`count`)) {
        invalid_fields["count"] <- "Non-nullable required field `count` cannot be null."
      }

      if (self$`count` > 2000000000) {
        invalid_fields["count"] <- "Invalid value for `count`, must be smaller than or equal to 2000000000."
      }
      if (self$`count` < 0) {
        invalid_fields["count"] <- "Invalid value for `count`, must be bigger than or equal to 0."
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
# UpdateStockItemDTO$unlock()
#
## Below is an example to define the print function
# UpdateStockItemDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# UpdateStockItemDTO$lock()

