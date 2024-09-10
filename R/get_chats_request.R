#' Create a new GetChatsRequest
#'
#' @description
#' Фильтры по чатам, которые нужно вернуть. 
#'
#' @docType class
#' @title GetChatsRequest
#' @description GetChatsRequest Class
#' @format An \code{R6Class} generator object
#' @field orderIds Фильтр по идентификаторам заказов на Маркете. list(integer) [optional]
#' @field types Фильтр по типам чатов. list(\link{ChatType}) [optional]
#' @field statuses Фильтр по статусам чатов. list(\link{ChatStatusType}) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
GetChatsRequest <- R6::R6Class(
  "GetChatsRequest",
  public = list(
    `orderIds` = NULL,
    `types` = NULL,
    `statuses` = NULL,
    #' Initialize a new GetChatsRequest class.
    #'
    #' @description
    #' Initialize a new GetChatsRequest class.
    #'
    #' @param orderIds Фильтр по идентификаторам заказов на Маркете.
    #' @param types Фильтр по типам чатов.
    #' @param statuses Фильтр по статусам чатов.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`orderIds` = NULL, `types` = NULL, `statuses` = NULL, ...) {
      if (!is.null(`orderIds`)) {
        stopifnot(is.vector(`orderIds`), length(`orderIds`) != 0)
        sapply(`orderIds`, function(x) stopifnot(is.character(x)))
        self$`orderIds` <- `orderIds`
      }
      if (!is.null(`types`)) {
        stopifnot(is.vector(`types`), length(`types`) != 0)
        sapply(`types`, function(x) stopifnot(R6::is.R6(x)))
        self$`types` <- `types`
      }
      if (!is.null(`statuses`)) {
        stopifnot(is.vector(`statuses`), length(`statuses`) != 0)
        sapply(`statuses`, function(x) stopifnot(R6::is.R6(x)))
        self$`statuses` <- `statuses`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return GetChatsRequest in JSON format
    #' @export
    toJSON = function() {
      GetChatsRequestObject <- list()
      if (!is.null(self$`orderIds`)) {
        GetChatsRequestObject[["orderIds"]] <-
          self$`orderIds`
      }
      if (!is.null(self$`types`)) {
        GetChatsRequestObject[["types"]] <-
          lapply(self$`types`, function(x) x$toJSON())
      }
      if (!is.null(self$`statuses`)) {
        GetChatsRequestObject[["statuses"]] <-
          lapply(self$`statuses`, function(x) x$toJSON())
      }
      GetChatsRequestObject
    },
    #' Deserialize JSON string into an instance of GetChatsRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of GetChatsRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of GetChatsRequest
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`orderIds`)) {
        self$`orderIds` <- ApiClient$new()$deserializeObj(this_object$`orderIds`, "array[integer]", loadNamespace("ympa_r_client"))
      }
      if (!is.null(this_object$`types`)) {
        self$`types` <- ApiClient$new()$deserializeObj(this_object$`types`, "array[ChatType]", loadNamespace("ympa_r_client"))
      }
      if (!is.null(this_object$`statuses`)) {
        self$`statuses` <- ApiClient$new()$deserializeObj(this_object$`statuses`, "array[ChatStatusType]", loadNamespace("ympa_r_client"))
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return GetChatsRequest in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`orderIds`)) {
          sprintf(
          '"orderIds":
             [%s]
          ',
          paste(unlist(lapply(self$`orderIds`, function(x) paste0('"', x, '"'))), collapse = ",")
          )
        },
        if (!is.null(self$`types`)) {
          sprintf(
          '"types":
          [%s]
',
          paste(sapply(self$`types`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        },
        if (!is.null(self$`statuses`)) {
          sprintf(
          '"statuses":
          [%s]
',
          paste(sapply(self$`statuses`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of GetChatsRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of GetChatsRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of GetChatsRequest
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`orderIds` <- ApiClient$new()$deserializeObj(this_object$`orderIds`, "array[integer]", loadNamespace("ympa_r_client"))
      self$`types` <- ApiClient$new()$deserializeObj(this_object$`types`, "array[ChatType]", loadNamespace("ympa_r_client"))
      self$`statuses` <- ApiClient$new()$deserializeObj(this_object$`statuses`, "array[ChatStatusType]", loadNamespace("ympa_r_client"))
      self
    },
    #' Validate JSON input with respect to GetChatsRequest
    #'
    #' @description
    #' Validate JSON input with respect to GetChatsRequest and throw an exception if invalid
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
    #' @return String representation of GetChatsRequest
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
      if (length(self$`orderIds`) < 1) {
        return(FALSE)
      }

      if (length(self$`types`) < 1) {
        return(FALSE)
      }

      if (length(self$`statuses`) < 1) {
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
      if (length(self$`orderIds`) < 1) {
        invalid_fields["orderIds"] <- "Invalid length for ``, number of items must be greater than or equal to 1."
      }

      if (length(self$`types`) < 1) {
        invalid_fields["types"] <- "Invalid length for ``, number of items must be greater than or equal to 1."
      }

      if (length(self$`statuses`) < 1) {
        invalid_fields["statuses"] <- "Invalid length for ``, number of items must be greater than or equal to 1."
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
# GetChatsRequest$unlock()
#
## Below is an example to define the print function
# GetChatsRequest$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# GetChatsRequest$lock()

