#' Create a new PagedReturnsDTO
#'
#' @description
#' Возвраты.
#'
#' @docType class
#' @title PagedReturnsDTO
#' @description PagedReturnsDTO Class
#' @format An \code{R6Class} generator object
#' @field paging  \link{ForwardScrollingPagerDTO} [optional]
#' @field returns Список возвратов. list(\link{ReturnDTO})
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
PagedReturnsDTO <- R6::R6Class(
  "PagedReturnsDTO",
  public = list(
    `paging` = NULL,
    `returns` = NULL,
    #' Initialize a new PagedReturnsDTO class.
    #'
    #' @description
    #' Initialize a new PagedReturnsDTO class.
    #'
    #' @param returns Список возвратов.
    #' @param paging paging
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`returns`, `paging` = NULL, ...) {
      if (!missing(`returns`)) {
        stopifnot(is.vector(`returns`), length(`returns`) != 0)
        sapply(`returns`, function(x) stopifnot(R6::is.R6(x)))
        self$`returns` <- `returns`
      }
      if (!is.null(`paging`)) {
        stopifnot(R6::is.R6(`paging`))
        self$`paging` <- `paging`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return PagedReturnsDTO in JSON format
    #' @export
    toJSON = function() {
      PagedReturnsDTOObject <- list()
      if (!is.null(self$`paging`)) {
        PagedReturnsDTOObject[["paging"]] <-
          self$`paging`$toJSON()
      }
      if (!is.null(self$`returns`)) {
        PagedReturnsDTOObject[["returns"]] <-
          lapply(self$`returns`, function(x) x$toJSON())
      }
      PagedReturnsDTOObject
    },
    #' Deserialize JSON string into an instance of PagedReturnsDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of PagedReturnsDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of PagedReturnsDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`paging`)) {
        `paging_object` <- ForwardScrollingPagerDTO$new()
        `paging_object`$fromJSON(jsonlite::toJSON(this_object$`paging`, auto_unbox = TRUE, digits = NA))
        self$`paging` <- `paging_object`
      }
      if (!is.null(this_object$`returns`)) {
        self$`returns` <- ApiClient$new()$deserializeObj(this_object$`returns`, "array[ReturnDTO]", loadNamespace("ympa_r_client"))
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return PagedReturnsDTO in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`paging`)) {
          sprintf(
          '"paging":
          %s
          ',
          jsonlite::toJSON(self$`paging`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`returns`)) {
          sprintf(
          '"returns":
          [%s]
',
          paste(sapply(self$`returns`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of PagedReturnsDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of PagedReturnsDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of PagedReturnsDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`paging` <- ForwardScrollingPagerDTO$new()$fromJSON(jsonlite::toJSON(this_object$`paging`, auto_unbox = TRUE, digits = NA))
      self$`returns` <- ApiClient$new()$deserializeObj(this_object$`returns`, "array[ReturnDTO]", loadNamespace("ympa_r_client"))
      self
    },
    #' Validate JSON input with respect to PagedReturnsDTO
    #'
    #' @description
    #' Validate JSON input with respect to PagedReturnsDTO and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `returns`
      if (!is.null(input_json$`returns`)) {
        stopifnot(is.vector(input_json$`returns`), length(input_json$`returns`) != 0)
        tmp <- sapply(input_json$`returns`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PagedReturnsDTO: the required field `returns` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of PagedReturnsDTO
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
      # check if the required `returns` is null
      if (is.null(self$`returns`)) {
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
      # check if the required `returns` is null
      if (is.null(self$`returns`)) {
        invalid_fields["returns"] <- "Non-nullable required field `returns` cannot be null."
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
# PagedReturnsDTO$unlock()
#
## Below is an example to define the print function
# PagedReturnsDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# PagedReturnsDTO$lock()

