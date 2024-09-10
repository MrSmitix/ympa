#' Create a new FlippingPagerDTO
#'
#' @description
#' Модель для пагинации.
#'
#' @docType class
#' @title FlippingPagerDTO
#' @description FlippingPagerDTO Class
#' @format An \code{R6Class} generator object
#' @field total Сколько всего найдено элементов. integer [optional]
#' @field from Начальный номер найденного элемента на странице. integer [optional]
#' @field to Конечный номер найденного элемента на странице. integer [optional]
#' @field currentPage Текущая страница. integer [optional]
#' @field pagesCount Общее количество страниц. integer [optional]
#' @field pageSize Размер страницы. integer [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
FlippingPagerDTO <- R6::R6Class(
  "FlippingPagerDTO",
  public = list(
    `total` = NULL,
    `from` = NULL,
    `to` = NULL,
    `currentPage` = NULL,
    `pagesCount` = NULL,
    `pageSize` = NULL,
    #' Initialize a new FlippingPagerDTO class.
    #'
    #' @description
    #' Initialize a new FlippingPagerDTO class.
    #'
    #' @param total Сколько всего найдено элементов.
    #' @param from Начальный номер найденного элемента на странице.
    #' @param to Конечный номер найденного элемента на странице.
    #' @param currentPage Текущая страница.
    #' @param pagesCount Общее количество страниц.
    #' @param pageSize Размер страницы.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`total` = NULL, `from` = NULL, `to` = NULL, `currentPage` = NULL, `pagesCount` = NULL, `pageSize` = NULL, ...) {
      if (!is.null(`total`)) {
        if (!(is.numeric(`total`) && length(`total`) == 1)) {
          stop(paste("Error! Invalid data for `total`. Must be an integer:", `total`))
        }
        self$`total` <- `total`
      }
      if (!is.null(`from`)) {
        if (!(is.numeric(`from`) && length(`from`) == 1)) {
          stop(paste("Error! Invalid data for `from`. Must be an integer:", `from`))
        }
        self$`from` <- `from`
      }
      if (!is.null(`to`)) {
        if (!(is.numeric(`to`) && length(`to`) == 1)) {
          stop(paste("Error! Invalid data for `to`. Must be an integer:", `to`))
        }
        self$`to` <- `to`
      }
      if (!is.null(`currentPage`)) {
        if (!(is.numeric(`currentPage`) && length(`currentPage`) == 1)) {
          stop(paste("Error! Invalid data for `currentPage`. Must be an integer:", `currentPage`))
        }
        self$`currentPage` <- `currentPage`
      }
      if (!is.null(`pagesCount`)) {
        if (!(is.numeric(`pagesCount`) && length(`pagesCount`) == 1)) {
          stop(paste("Error! Invalid data for `pagesCount`. Must be an integer:", `pagesCount`))
        }
        self$`pagesCount` <- `pagesCount`
      }
      if (!is.null(`pageSize`)) {
        if (!(is.numeric(`pageSize`) && length(`pageSize`) == 1)) {
          stop(paste("Error! Invalid data for `pageSize`. Must be an integer:", `pageSize`))
        }
        self$`pageSize` <- `pageSize`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return FlippingPagerDTO in JSON format
    #' @export
    toJSON = function() {
      FlippingPagerDTOObject <- list()
      if (!is.null(self$`total`)) {
        FlippingPagerDTOObject[["total"]] <-
          self$`total`
      }
      if (!is.null(self$`from`)) {
        FlippingPagerDTOObject[["from"]] <-
          self$`from`
      }
      if (!is.null(self$`to`)) {
        FlippingPagerDTOObject[["to"]] <-
          self$`to`
      }
      if (!is.null(self$`currentPage`)) {
        FlippingPagerDTOObject[["currentPage"]] <-
          self$`currentPage`
      }
      if (!is.null(self$`pagesCount`)) {
        FlippingPagerDTOObject[["pagesCount"]] <-
          self$`pagesCount`
      }
      if (!is.null(self$`pageSize`)) {
        FlippingPagerDTOObject[["pageSize"]] <-
          self$`pageSize`
      }
      FlippingPagerDTOObject
    },
    #' Deserialize JSON string into an instance of FlippingPagerDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of FlippingPagerDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of FlippingPagerDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`total`)) {
        self$`total` <- this_object$`total`
      }
      if (!is.null(this_object$`from`)) {
        self$`from` <- this_object$`from`
      }
      if (!is.null(this_object$`to`)) {
        self$`to` <- this_object$`to`
      }
      if (!is.null(this_object$`currentPage`)) {
        self$`currentPage` <- this_object$`currentPage`
      }
      if (!is.null(this_object$`pagesCount`)) {
        self$`pagesCount` <- this_object$`pagesCount`
      }
      if (!is.null(this_object$`pageSize`)) {
        self$`pageSize` <- this_object$`pageSize`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return FlippingPagerDTO in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`total`)) {
          sprintf(
          '"total":
            %d
                    ',
          self$`total`
          )
        },
        if (!is.null(self$`from`)) {
          sprintf(
          '"from":
            %d
                    ',
          self$`from`
          )
        },
        if (!is.null(self$`to`)) {
          sprintf(
          '"to":
            %d
                    ',
          self$`to`
          )
        },
        if (!is.null(self$`currentPage`)) {
          sprintf(
          '"currentPage":
            %d
                    ',
          self$`currentPage`
          )
        },
        if (!is.null(self$`pagesCount`)) {
          sprintf(
          '"pagesCount":
            %d
                    ',
          self$`pagesCount`
          )
        },
        if (!is.null(self$`pageSize`)) {
          sprintf(
          '"pageSize":
            %d
                    ',
          self$`pageSize`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of FlippingPagerDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of FlippingPagerDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of FlippingPagerDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`total` <- this_object$`total`
      self$`from` <- this_object$`from`
      self$`to` <- this_object$`to`
      self$`currentPage` <- this_object$`currentPage`
      self$`pagesCount` <- this_object$`pagesCount`
      self$`pageSize` <- this_object$`pageSize`
      self
    },
    #' Validate JSON input with respect to FlippingPagerDTO
    #'
    #' @description
    #' Validate JSON input with respect to FlippingPagerDTO and throw an exception if invalid
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
    #' @return String representation of FlippingPagerDTO
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
# FlippingPagerDTO$unlock()
#
## Below is an example to define the print function
# FlippingPagerDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# FlippingPagerDTO$lock()

