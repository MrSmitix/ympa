#' Create a new SkipGoodsFeedbackReactionRequest
#'
#' @description
#' Идентификаторы отзывов.
#'
#' @docType class
#' @title SkipGoodsFeedbackReactionRequest
#' @description SkipGoodsFeedbackReactionRequest Class
#' @format An \code{R6Class} generator object
#' @field feedbackIds Список идентификаторов отзывов, на которые магазин не будет отвечать. list(integer)
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
SkipGoodsFeedbackReactionRequest <- R6::R6Class(
  "SkipGoodsFeedbackReactionRequest",
  public = list(
    `feedbackIds` = NULL,
    #' Initialize a new SkipGoodsFeedbackReactionRequest class.
    #'
    #' @description
    #' Initialize a new SkipGoodsFeedbackReactionRequest class.
    #'
    #' @param feedbackIds Список идентификаторов отзывов, на которые магазин не будет отвечать.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`feedbackIds`, ...) {
      if (!missing(`feedbackIds`)) {
        stopifnot(is.vector(`feedbackIds`), length(`feedbackIds`) != 0)
        sapply(`feedbackIds`, function(x) stopifnot(is.character(x)))
        if (!identical(`feedbackIds`, unique(`feedbackIds`))) {
          stop("Error! Items in `feedbackIds` are not unique.")
        }
        self$`feedbackIds` <- `feedbackIds`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return SkipGoodsFeedbackReactionRequest in JSON format
    #' @export
    toJSON = function() {
      SkipGoodsFeedbackReactionRequestObject <- list()
      if (!is.null(self$`feedbackIds`)) {
        SkipGoodsFeedbackReactionRequestObject[["feedbackIds"]] <-
          self$`feedbackIds`
      }
      SkipGoodsFeedbackReactionRequestObject
    },
    #' Deserialize JSON string into an instance of SkipGoodsFeedbackReactionRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of SkipGoodsFeedbackReactionRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of SkipGoodsFeedbackReactionRequest
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`feedbackIds`)) {
        self$`feedbackIds` <- ApiClient$new()$deserializeObj(this_object$`feedbackIds`, "set[integer]", loadNamespace("ympa_r_client"))
        if (!identical(self$`feedbackIds`, unique(self$`feedbackIds`))) {
          stop("Error! Items in `feedbackIds` are not unique.")
        }
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return SkipGoodsFeedbackReactionRequest in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`feedbackIds`)) {
          sprintf(
          '"feedbackIds":
             [%s]
          ',
          paste(unlist(lapply(self$`feedbackIds`, function(x) paste0('"', x, '"'))), collapse = ",")
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of SkipGoodsFeedbackReactionRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of SkipGoodsFeedbackReactionRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of SkipGoodsFeedbackReactionRequest
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`feedbackIds` <- ApiClient$new()$deserializeObj(this_object$`feedbackIds`, "set[integer]", loadNamespace("ympa_r_client"))
      if (!identical(self$`feedbackIds`, unique(self$`feedbackIds`))) {
        stop("Error! Items in `feedbackIds` are not unique.")
      }
      self
    },
    #' Validate JSON input with respect to SkipGoodsFeedbackReactionRequest
    #'
    #' @description
    #' Validate JSON input with respect to SkipGoodsFeedbackReactionRequest and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `feedbackIds`
      if (!is.null(input_json$`feedbackIds`)) {
        stopifnot(is.vector(input_json$`feedbackIds`), length(input_json$`feedbackIds`) != 0)
        if (!identical(input_json$`feedbackIds`, unique(input_json$`feedbackIds`))) {
          stop("Error! Items in `feedbackIds` are not unique.")
        }
        tmp <- sapply(input_json$`feedbackIds`, function(x) stopifnot(is.character(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for SkipGoodsFeedbackReactionRequest: the required field `feedbackIds` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of SkipGoodsFeedbackReactionRequest
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
      # check if the required `feedbackIds` is null
      if (is.null(self$`feedbackIds`)) {
        return(FALSE)
      }

      if (length(self$`feedbackIds`) > 50) {
        return(FALSE)
      }
      if (length(self$`feedbackIds`) < 1) {
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
      # check if the required `feedbackIds` is null
      if (is.null(self$`feedbackIds`)) {
        invalid_fields["feedbackIds"] <- "Non-nullable required field `feedbackIds` cannot be null."
      }

      if (length(self$`feedbackIds`) > 50) {
        invalid_fields["feedbackIds"] <- "Invalid length for `feedbackIds`, number of items must be less than or equal to 50."
      }
      if (length(self$`feedbackIds`) < 1) {
        invalid_fields["feedbackIds"] <- "Invalid length for ``, number of items must be greater than or equal to 1."
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
# SkipGoodsFeedbackReactionRequest$unlock()
#
## Below is an example to define the print function
# SkipGoodsFeedbackReactionRequest$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# SkipGoodsFeedbackReactionRequest$lock()

