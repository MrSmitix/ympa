#' Create a new GoodsFeedbackMediaDTO
#'
#' @description
#' Фото и видео.
#'
#' @docType class
#' @title GoodsFeedbackMediaDTO
#' @description GoodsFeedbackMediaDTO Class
#' @format An \code{R6Class} generator object
#' @field photos Ссылки на фото. list(character) [optional]
#' @field videos Ссылки на видео. list(character) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
GoodsFeedbackMediaDTO <- R6::R6Class(
  "GoodsFeedbackMediaDTO",
  public = list(
    `photos` = NULL,
    `videos` = NULL,
    #' Initialize a new GoodsFeedbackMediaDTO class.
    #'
    #' @description
    #' Initialize a new GoodsFeedbackMediaDTO class.
    #'
    #' @param photos Ссылки на фото.
    #' @param videos Ссылки на видео.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`photos` = NULL, `videos` = NULL, ...) {
      if (!is.null(`photos`)) {
        stopifnot(is.vector(`photos`), length(`photos`) != 0)
        sapply(`photos`, function(x) stopifnot(is.character(x)))
        self$`photos` <- `photos`
      }
      if (!is.null(`videos`)) {
        stopifnot(is.vector(`videos`), length(`videos`) != 0)
        sapply(`videos`, function(x) stopifnot(is.character(x)))
        self$`videos` <- `videos`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return GoodsFeedbackMediaDTO in JSON format
    #' @export
    toJSON = function() {
      GoodsFeedbackMediaDTOObject <- list()
      if (!is.null(self$`photos`)) {
        GoodsFeedbackMediaDTOObject[["photos"]] <-
          self$`photos`
      }
      if (!is.null(self$`videos`)) {
        GoodsFeedbackMediaDTOObject[["videos"]] <-
          self$`videos`
      }
      GoodsFeedbackMediaDTOObject
    },
    #' Deserialize JSON string into an instance of GoodsFeedbackMediaDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of GoodsFeedbackMediaDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of GoodsFeedbackMediaDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`photos`)) {
        self$`photos` <- ApiClient$new()$deserializeObj(this_object$`photos`, "array[character]", loadNamespace("ympa_r_client"))
      }
      if (!is.null(this_object$`videos`)) {
        self$`videos` <- ApiClient$new()$deserializeObj(this_object$`videos`, "array[character]", loadNamespace("ympa_r_client"))
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return GoodsFeedbackMediaDTO in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`photos`)) {
          sprintf(
          '"photos":
             [%s]
          ',
          paste(unlist(lapply(self$`photos`, function(x) paste0('"', x, '"'))), collapse = ",")
          )
        },
        if (!is.null(self$`videos`)) {
          sprintf(
          '"videos":
             [%s]
          ',
          paste(unlist(lapply(self$`videos`, function(x) paste0('"', x, '"'))), collapse = ",")
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of GoodsFeedbackMediaDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of GoodsFeedbackMediaDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of GoodsFeedbackMediaDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`photos` <- ApiClient$new()$deserializeObj(this_object$`photos`, "array[character]", loadNamespace("ympa_r_client"))
      self$`videos` <- ApiClient$new()$deserializeObj(this_object$`videos`, "array[character]", loadNamespace("ympa_r_client"))
      self
    },
    #' Validate JSON input with respect to GoodsFeedbackMediaDTO
    #'
    #' @description
    #' Validate JSON input with respect to GoodsFeedbackMediaDTO and throw an exception if invalid
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
    #' @return String representation of GoodsFeedbackMediaDTO
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
# GoodsFeedbackMediaDTO$unlock()
#
## Below is an example to define the print function
# GoodsFeedbackMediaDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# GoodsFeedbackMediaDTO$lock()

