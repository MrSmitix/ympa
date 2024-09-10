#' Create a new GetCategoriesMaxSaleQuantumRequest
#'
#' @description
#' Список категорий, для которых нужно вернуть лимит на установку кванта и минимального количества товаров. 
#'
#' @docType class
#' @title GetCategoriesMaxSaleQuantumRequest
#' @description GetCategoriesMaxSaleQuantumRequest Class
#' @format An \code{R6Class} generator object
#' @field marketCategoryIds Идентификаторы листовых категории на Маркете — тех, у которых нет дочерних категорий. list(integer)
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
GetCategoriesMaxSaleQuantumRequest <- R6::R6Class(
  "GetCategoriesMaxSaleQuantumRequest",
  public = list(
    `marketCategoryIds` = NULL,
    #' Initialize a new GetCategoriesMaxSaleQuantumRequest class.
    #'
    #' @description
    #' Initialize a new GetCategoriesMaxSaleQuantumRequest class.
    #'
    #' @param marketCategoryIds Идентификаторы листовых категории на Маркете — тех, у которых нет дочерних категорий.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`marketCategoryIds`, ...) {
      if (!missing(`marketCategoryIds`)) {
        stopifnot(is.vector(`marketCategoryIds`), length(`marketCategoryIds`) != 0)
        sapply(`marketCategoryIds`, function(x) stopifnot(is.character(x)))
        if (!identical(`marketCategoryIds`, unique(`marketCategoryIds`))) {
          stop("Error! Items in `marketCategoryIds` are not unique.")
        }
        self$`marketCategoryIds` <- `marketCategoryIds`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return GetCategoriesMaxSaleQuantumRequest in JSON format
    #' @export
    toJSON = function() {
      GetCategoriesMaxSaleQuantumRequestObject <- list()
      if (!is.null(self$`marketCategoryIds`)) {
        GetCategoriesMaxSaleQuantumRequestObject[["marketCategoryIds"]] <-
          self$`marketCategoryIds`
      }
      GetCategoriesMaxSaleQuantumRequestObject
    },
    #' Deserialize JSON string into an instance of GetCategoriesMaxSaleQuantumRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of GetCategoriesMaxSaleQuantumRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of GetCategoriesMaxSaleQuantumRequest
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`marketCategoryIds`)) {
        self$`marketCategoryIds` <- ApiClient$new()$deserializeObj(this_object$`marketCategoryIds`, "set[integer]", loadNamespace("ympa_r_client"))
        if (!identical(self$`marketCategoryIds`, unique(self$`marketCategoryIds`))) {
          stop("Error! Items in `marketCategoryIds` are not unique.")
        }
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return GetCategoriesMaxSaleQuantumRequest in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`marketCategoryIds`)) {
          sprintf(
          '"marketCategoryIds":
             [%s]
          ',
          paste(unlist(lapply(self$`marketCategoryIds`, function(x) paste0('"', x, '"'))), collapse = ",")
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of GetCategoriesMaxSaleQuantumRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of GetCategoriesMaxSaleQuantumRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of GetCategoriesMaxSaleQuantumRequest
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`marketCategoryIds` <- ApiClient$new()$deserializeObj(this_object$`marketCategoryIds`, "set[integer]", loadNamespace("ympa_r_client"))
      if (!identical(self$`marketCategoryIds`, unique(self$`marketCategoryIds`))) {
        stop("Error! Items in `marketCategoryIds` are not unique.")
      }
      self
    },
    #' Validate JSON input with respect to GetCategoriesMaxSaleQuantumRequest
    #'
    #' @description
    #' Validate JSON input with respect to GetCategoriesMaxSaleQuantumRequest and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `marketCategoryIds`
      if (!is.null(input_json$`marketCategoryIds`)) {
        stopifnot(is.vector(input_json$`marketCategoryIds`), length(input_json$`marketCategoryIds`) != 0)
        if (!identical(input_json$`marketCategoryIds`, unique(input_json$`marketCategoryIds`))) {
          stop("Error! Items in `marketCategoryIds` are not unique.")
        }
        tmp <- sapply(input_json$`marketCategoryIds`, function(x) stopifnot(is.character(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for GetCategoriesMaxSaleQuantumRequest: the required field `marketCategoryIds` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of GetCategoriesMaxSaleQuantumRequest
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
      # check if the required `marketCategoryIds` is null
      if (is.null(self$`marketCategoryIds`)) {
        return(FALSE)
      }

      if (length(self$`marketCategoryIds`) > 1500) {
        return(FALSE)
      }
      if (length(self$`marketCategoryIds`) < 1) {
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
      # check if the required `marketCategoryIds` is null
      if (is.null(self$`marketCategoryIds`)) {
        invalid_fields["marketCategoryIds"] <- "Non-nullable required field `marketCategoryIds` cannot be null."
      }

      if (length(self$`marketCategoryIds`) > 1500) {
        invalid_fields["marketCategoryIds"] <- "Invalid length for `marketCategoryIds`, number of items must be less than or equal to 1500."
      }
      if (length(self$`marketCategoryIds`) < 1) {
        invalid_fields["marketCategoryIds"] <- "Invalid length for ``, number of items must be greater than or equal to 1."
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
# GetCategoriesMaxSaleQuantumRequest$unlock()
#
## Below is an example to define the print function
# GetCategoriesMaxSaleQuantumRequest$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# GetCategoriesMaxSaleQuantumRequest$lock()

