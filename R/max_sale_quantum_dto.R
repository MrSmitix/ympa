#' Create a new MaxSaleQuantumDTO
#'
#' @description
#' Лимит на установку кванта и минимального количества товаров по категориям. 
#'
#' @docType class
#' @title MaxSaleQuantumDTO
#' @description MaxSaleQuantumDTO Class
#' @format An \code{R6Class} generator object
#' @field id Идентификатор категории. integer
#' @field name Название категории. character [optional]
#' @field maxSaleQuantum Лимит на установку кванта и минимального количества товаров. integer [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
MaxSaleQuantumDTO <- R6::R6Class(
  "MaxSaleQuantumDTO",
  public = list(
    `id` = NULL,
    `name` = NULL,
    `maxSaleQuantum` = NULL,
    #' Initialize a new MaxSaleQuantumDTO class.
    #'
    #' @description
    #' Initialize a new MaxSaleQuantumDTO class.
    #'
    #' @param id Идентификатор категории.
    #' @param name Название категории.
    #' @param maxSaleQuantum Лимит на установку кванта и минимального количества товаров.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`id`, `name` = NULL, `maxSaleQuantum` = NULL, ...) {
      if (!missing(`id`)) {
        if (!(is.numeric(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be an integer:", `id`))
        }
        self$`id` <- `id`
      }
      if (!is.null(`name`)) {
        if (!(is.character(`name`) && length(`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", `name`))
        }
        self$`name` <- `name`
      }
      if (!is.null(`maxSaleQuantum`)) {
        if (!(is.numeric(`maxSaleQuantum`) && length(`maxSaleQuantum`) == 1)) {
          stop(paste("Error! Invalid data for `maxSaleQuantum`. Must be an integer:", `maxSaleQuantum`))
        }
        self$`maxSaleQuantum` <- `maxSaleQuantum`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return MaxSaleQuantumDTO in JSON format
    #' @export
    toJSON = function() {
      MaxSaleQuantumDTOObject <- list()
      if (!is.null(self$`id`)) {
        MaxSaleQuantumDTOObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`name`)) {
        MaxSaleQuantumDTOObject[["name"]] <-
          self$`name`
      }
      if (!is.null(self$`maxSaleQuantum`)) {
        MaxSaleQuantumDTOObject[["maxSaleQuantum"]] <-
          self$`maxSaleQuantum`
      }
      MaxSaleQuantumDTOObject
    },
    #' Deserialize JSON string into an instance of MaxSaleQuantumDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of MaxSaleQuantumDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of MaxSaleQuantumDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`name`)) {
        self$`name` <- this_object$`name`
      }
      if (!is.null(this_object$`maxSaleQuantum`)) {
        self$`maxSaleQuantum` <- this_object$`maxSaleQuantum`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return MaxSaleQuantumDTO in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`id`)) {
          sprintf(
          '"id":
            %d
                    ',
          self$`id`
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
        if (!is.null(self$`maxSaleQuantum`)) {
          sprintf(
          '"maxSaleQuantum":
            %d
                    ',
          self$`maxSaleQuantum`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of MaxSaleQuantumDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of MaxSaleQuantumDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of MaxSaleQuantumDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`id` <- this_object$`id`
      self$`name` <- this_object$`name`
      self$`maxSaleQuantum` <- this_object$`maxSaleQuantum`
      self
    },
    #' Validate JSON input with respect to MaxSaleQuantumDTO
    #'
    #' @description
    #' Validate JSON input with respect to MaxSaleQuantumDTO and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `id`
      if (!is.null(input_json$`id`)) {
        if (!(is.numeric(input_json$`id`) && length(input_json$`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be an integer:", input_json$`id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for MaxSaleQuantumDTO: the required field `id` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of MaxSaleQuantumDTO
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
      # check if the required `id` is null
      if (is.null(self$`id`)) {
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
      # check if the required `id` is null
      if (is.null(self$`id`)) {
        invalid_fields["id"] <- "Non-nullable required field `id` cannot be null."
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
# MaxSaleQuantumDTO$unlock()
#
## Below is an example to define the print function
# MaxSaleQuantumDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# MaxSaleQuantumDTO$lock()

