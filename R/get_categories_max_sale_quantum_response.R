#' Create a new GetCategoriesMaxSaleQuantumResponse
#'
#' @description
#' GetCategoriesMaxSaleQuantumResponse Class
#'
#' @docType class
#' @title GetCategoriesMaxSaleQuantumResponse
#' @description GetCategoriesMaxSaleQuantumResponse Class
#' @format An \code{R6Class} generator object
#' @field status  \link{ApiResponseStatusType} [optional]
#' @field results Категории и лимит на установку кванта и минимального количества товаров. list(\link{MaxSaleQuantumDTO})
#' @field errors Ошибки, которые появились из-за переданных категорий. list(\link{CategoryErrorDTO}) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
GetCategoriesMaxSaleQuantumResponse <- R6::R6Class(
  "GetCategoriesMaxSaleQuantumResponse",
  public = list(
    `status` = NULL,
    `results` = NULL,
    `errors` = NULL,
    #' Initialize a new GetCategoriesMaxSaleQuantumResponse class.
    #'
    #' @description
    #' Initialize a new GetCategoriesMaxSaleQuantumResponse class.
    #'
    #' @param results Категории и лимит на установку кванта и минимального количества товаров.
    #' @param status status
    #' @param errors Ошибки, которые появились из-за переданных категорий.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`results`, `status` = NULL, `errors` = NULL, ...) {
      if (!missing(`results`)) {
        stopifnot(is.vector(`results`), length(`results`) != 0)
        sapply(`results`, function(x) stopifnot(R6::is.R6(x)))
        self$`results` <- `results`
      }
      if (!is.null(`status`)) {
        if (!(`status` %in% c())) {
          stop(paste("Error! \"", `status`, "\" cannot be assigned to `status`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`status`))
        self$`status` <- `status`
      }
      if (!is.null(`errors`)) {
        stopifnot(is.vector(`errors`), length(`errors`) != 0)
        sapply(`errors`, function(x) stopifnot(R6::is.R6(x)))
        self$`errors` <- `errors`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return GetCategoriesMaxSaleQuantumResponse in JSON format
    #' @export
    toJSON = function() {
      GetCategoriesMaxSaleQuantumResponseObject <- list()
      if (!is.null(self$`status`)) {
        GetCategoriesMaxSaleQuantumResponseObject[["status"]] <-
          self$`status`$toJSON()
      }
      if (!is.null(self$`results`)) {
        GetCategoriesMaxSaleQuantumResponseObject[["results"]] <-
          lapply(self$`results`, function(x) x$toJSON())
      }
      if (!is.null(self$`errors`)) {
        GetCategoriesMaxSaleQuantumResponseObject[["errors"]] <-
          lapply(self$`errors`, function(x) x$toJSON())
      }
      GetCategoriesMaxSaleQuantumResponseObject
    },
    #' Deserialize JSON string into an instance of GetCategoriesMaxSaleQuantumResponse
    #'
    #' @description
    #' Deserialize JSON string into an instance of GetCategoriesMaxSaleQuantumResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of GetCategoriesMaxSaleQuantumResponse
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`status`)) {
        `status_object` <- ApiResponseStatusType$new()
        `status_object`$fromJSON(jsonlite::toJSON(this_object$`status`, auto_unbox = TRUE, digits = NA))
        self$`status` <- `status_object`
      }
      if (!is.null(this_object$`results`)) {
        self$`results` <- ApiClient$new()$deserializeObj(this_object$`results`, "array[MaxSaleQuantumDTO]", loadNamespace("ympa_r_client"))
      }
      if (!is.null(this_object$`errors`)) {
        self$`errors` <- ApiClient$new()$deserializeObj(this_object$`errors`, "array[CategoryErrorDTO]", loadNamespace("ympa_r_client"))
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return GetCategoriesMaxSaleQuantumResponse in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`status`)) {
          sprintf(
          '"status":
          %s
          ',
          jsonlite::toJSON(self$`status`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`results`)) {
          sprintf(
          '"results":
          [%s]
',
          paste(sapply(self$`results`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        },
        if (!is.null(self$`errors`)) {
          sprintf(
          '"errors":
          [%s]
',
          paste(sapply(self$`errors`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of GetCategoriesMaxSaleQuantumResponse
    #'
    #' @description
    #' Deserialize JSON string into an instance of GetCategoriesMaxSaleQuantumResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of GetCategoriesMaxSaleQuantumResponse
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`status` <- ApiResponseStatusType$new()$fromJSON(jsonlite::toJSON(this_object$`status`, auto_unbox = TRUE, digits = NA))
      self$`results` <- ApiClient$new()$deserializeObj(this_object$`results`, "array[MaxSaleQuantumDTO]", loadNamespace("ympa_r_client"))
      self$`errors` <- ApiClient$new()$deserializeObj(this_object$`errors`, "array[CategoryErrorDTO]", loadNamespace("ympa_r_client"))
      self
    },
    #' Validate JSON input with respect to GetCategoriesMaxSaleQuantumResponse
    #'
    #' @description
    #' Validate JSON input with respect to GetCategoriesMaxSaleQuantumResponse and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `results`
      if (!is.null(input_json$`results`)) {
        stopifnot(is.vector(input_json$`results`), length(input_json$`results`) != 0)
        tmp <- sapply(input_json$`results`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for GetCategoriesMaxSaleQuantumResponse: the required field `results` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of GetCategoriesMaxSaleQuantumResponse
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
      # check if the required `results` is null
      if (is.null(self$`results`)) {
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
      # check if the required `results` is null
      if (is.null(self$`results`)) {
        invalid_fields["results"] <- "Non-nullable required field `results` cannot be null."
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
# GetCategoriesMaxSaleQuantumResponse$unlock()
#
## Below is an example to define the print function
# GetCategoriesMaxSaleQuantumResponse$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# GetCategoriesMaxSaleQuantumResponse$lock()

