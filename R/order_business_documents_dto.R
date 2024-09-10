#' Create a new OrderBusinessDocumentsDTO
#'
#' @description
#' Информация о документах. 
#'
#' @docType class
#' @title OrderBusinessDocumentsDTO
#' @description OrderBusinessDocumentsDTO Class
#' @format An \code{R6Class} generator object
#' @field upd  \link{DocumentDTO} [optional]
#' @field ukd  \link{DocumentDTO} [optional]
#' @field torgTwelve  \link{DocumentDTO} [optional]
#' @field sf  \link{DocumentDTO} [optional]
#' @field ksf  \link{DocumentDTO} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
OrderBusinessDocumentsDTO <- R6::R6Class(
  "OrderBusinessDocumentsDTO",
  public = list(
    `upd` = NULL,
    `ukd` = NULL,
    `torgTwelve` = NULL,
    `sf` = NULL,
    `ksf` = NULL,
    #' Initialize a new OrderBusinessDocumentsDTO class.
    #'
    #' @description
    #' Initialize a new OrderBusinessDocumentsDTO class.
    #'
    #' @param upd upd
    #' @param ukd ukd
    #' @param torgTwelve torgTwelve
    #' @param sf sf
    #' @param ksf ksf
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`upd` = NULL, `ukd` = NULL, `torgTwelve` = NULL, `sf` = NULL, `ksf` = NULL, ...) {
      if (!is.null(`upd`)) {
        stopifnot(R6::is.R6(`upd`))
        self$`upd` <- `upd`
      }
      if (!is.null(`ukd`)) {
        stopifnot(R6::is.R6(`ukd`))
        self$`ukd` <- `ukd`
      }
      if (!is.null(`torgTwelve`)) {
        stopifnot(R6::is.R6(`torgTwelve`))
        self$`torgTwelve` <- `torgTwelve`
      }
      if (!is.null(`sf`)) {
        stopifnot(R6::is.R6(`sf`))
        self$`sf` <- `sf`
      }
      if (!is.null(`ksf`)) {
        stopifnot(R6::is.R6(`ksf`))
        self$`ksf` <- `ksf`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return OrderBusinessDocumentsDTO in JSON format
    #' @export
    toJSON = function() {
      OrderBusinessDocumentsDTOObject <- list()
      if (!is.null(self$`upd`)) {
        OrderBusinessDocumentsDTOObject[["upd"]] <-
          self$`upd`$toJSON()
      }
      if (!is.null(self$`ukd`)) {
        OrderBusinessDocumentsDTOObject[["ukd"]] <-
          self$`ukd`$toJSON()
      }
      if (!is.null(self$`torgTwelve`)) {
        OrderBusinessDocumentsDTOObject[["torgTwelve"]] <-
          self$`torgTwelve`$toJSON()
      }
      if (!is.null(self$`sf`)) {
        OrderBusinessDocumentsDTOObject[["sf"]] <-
          self$`sf`$toJSON()
      }
      if (!is.null(self$`ksf`)) {
        OrderBusinessDocumentsDTOObject[["ksf"]] <-
          self$`ksf`$toJSON()
      }
      OrderBusinessDocumentsDTOObject
    },
    #' Deserialize JSON string into an instance of OrderBusinessDocumentsDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of OrderBusinessDocumentsDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of OrderBusinessDocumentsDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`upd`)) {
        `upd_object` <- DocumentDTO$new()
        `upd_object`$fromJSON(jsonlite::toJSON(this_object$`upd`, auto_unbox = TRUE, digits = NA))
        self$`upd` <- `upd_object`
      }
      if (!is.null(this_object$`ukd`)) {
        `ukd_object` <- DocumentDTO$new()
        `ukd_object`$fromJSON(jsonlite::toJSON(this_object$`ukd`, auto_unbox = TRUE, digits = NA))
        self$`ukd` <- `ukd_object`
      }
      if (!is.null(this_object$`torgTwelve`)) {
        `torgtwelve_object` <- DocumentDTO$new()
        `torgtwelve_object`$fromJSON(jsonlite::toJSON(this_object$`torgTwelve`, auto_unbox = TRUE, digits = NA))
        self$`torgTwelve` <- `torgtwelve_object`
      }
      if (!is.null(this_object$`sf`)) {
        `sf_object` <- DocumentDTO$new()
        `sf_object`$fromJSON(jsonlite::toJSON(this_object$`sf`, auto_unbox = TRUE, digits = NA))
        self$`sf` <- `sf_object`
      }
      if (!is.null(this_object$`ksf`)) {
        `ksf_object` <- DocumentDTO$new()
        `ksf_object`$fromJSON(jsonlite::toJSON(this_object$`ksf`, auto_unbox = TRUE, digits = NA))
        self$`ksf` <- `ksf_object`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return OrderBusinessDocumentsDTO in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`upd`)) {
          sprintf(
          '"upd":
          %s
          ',
          jsonlite::toJSON(self$`upd`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`ukd`)) {
          sprintf(
          '"ukd":
          %s
          ',
          jsonlite::toJSON(self$`ukd`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`torgTwelve`)) {
          sprintf(
          '"torgTwelve":
          %s
          ',
          jsonlite::toJSON(self$`torgTwelve`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`sf`)) {
          sprintf(
          '"sf":
          %s
          ',
          jsonlite::toJSON(self$`sf`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`ksf`)) {
          sprintf(
          '"ksf":
          %s
          ',
          jsonlite::toJSON(self$`ksf`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of OrderBusinessDocumentsDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of OrderBusinessDocumentsDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of OrderBusinessDocumentsDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`upd` <- DocumentDTO$new()$fromJSON(jsonlite::toJSON(this_object$`upd`, auto_unbox = TRUE, digits = NA))
      self$`ukd` <- DocumentDTO$new()$fromJSON(jsonlite::toJSON(this_object$`ukd`, auto_unbox = TRUE, digits = NA))
      self$`torgTwelve` <- DocumentDTO$new()$fromJSON(jsonlite::toJSON(this_object$`torgTwelve`, auto_unbox = TRUE, digits = NA))
      self$`sf` <- DocumentDTO$new()$fromJSON(jsonlite::toJSON(this_object$`sf`, auto_unbox = TRUE, digits = NA))
      self$`ksf` <- DocumentDTO$new()$fromJSON(jsonlite::toJSON(this_object$`ksf`, auto_unbox = TRUE, digits = NA))
      self
    },
    #' Validate JSON input with respect to OrderBusinessDocumentsDTO
    #'
    #' @description
    #' Validate JSON input with respect to OrderBusinessDocumentsDTO and throw an exception if invalid
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
    #' @return String representation of OrderBusinessDocumentsDTO
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
# OrderBusinessDocumentsDTO$unlock()
#
## Below is an example to define the print function
# OrderBusinessDocumentsDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# OrderBusinessDocumentsDTO$lock()

