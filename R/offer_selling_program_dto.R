#' Create a new OfferSellingProgramDTO
#'
#' @description
#' Информация о том, по каким моделям можно продавать товар, а по каким нельзя.
#'
#' @docType class
#' @title OfferSellingProgramDTO
#' @description OfferSellingProgramDTO Class
#' @format An \code{R6Class} generator object
#' @field sellingProgram  \link{SellingProgramType}
#' @field status  \link{OfferSellingProgramStatusType}
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
OfferSellingProgramDTO <- R6::R6Class(
  "OfferSellingProgramDTO",
  public = list(
    `sellingProgram` = NULL,
    `status` = NULL,
    #' Initialize a new OfferSellingProgramDTO class.
    #'
    #' @description
    #' Initialize a new OfferSellingProgramDTO class.
    #'
    #' @param sellingProgram sellingProgram
    #' @param status status
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`sellingProgram`, `status`, ...) {
      if (!missing(`sellingProgram`)) {
        if (!(`sellingProgram` %in% c())) {
          stop(paste("Error! \"", `sellingProgram`, "\" cannot be assigned to `sellingProgram`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`sellingProgram`))
        self$`sellingProgram` <- `sellingProgram`
      }
      if (!missing(`status`)) {
        if (!(`status` %in% c())) {
          stop(paste("Error! \"", `status`, "\" cannot be assigned to `status`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`status`))
        self$`status` <- `status`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return OfferSellingProgramDTO in JSON format
    #' @export
    toJSON = function() {
      OfferSellingProgramDTOObject <- list()
      if (!is.null(self$`sellingProgram`)) {
        OfferSellingProgramDTOObject[["sellingProgram"]] <-
          self$`sellingProgram`$toJSON()
      }
      if (!is.null(self$`status`)) {
        OfferSellingProgramDTOObject[["status"]] <-
          self$`status`$toJSON()
      }
      OfferSellingProgramDTOObject
    },
    #' Deserialize JSON string into an instance of OfferSellingProgramDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of OfferSellingProgramDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of OfferSellingProgramDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`sellingProgram`)) {
        `sellingprogram_object` <- SellingProgramType$new()
        `sellingprogram_object`$fromJSON(jsonlite::toJSON(this_object$`sellingProgram`, auto_unbox = TRUE, digits = NA))
        self$`sellingProgram` <- `sellingprogram_object`
      }
      if (!is.null(this_object$`status`)) {
        `status_object` <- OfferSellingProgramStatusType$new()
        `status_object`$fromJSON(jsonlite::toJSON(this_object$`status`, auto_unbox = TRUE, digits = NA))
        self$`status` <- `status_object`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return OfferSellingProgramDTO in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`sellingProgram`)) {
          sprintf(
          '"sellingProgram":
          %s
          ',
          jsonlite::toJSON(self$`sellingProgram`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`status`)) {
          sprintf(
          '"status":
          %s
          ',
          jsonlite::toJSON(self$`status`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of OfferSellingProgramDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of OfferSellingProgramDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of OfferSellingProgramDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`sellingProgram` <- SellingProgramType$new()$fromJSON(jsonlite::toJSON(this_object$`sellingProgram`, auto_unbox = TRUE, digits = NA))
      self$`status` <- OfferSellingProgramStatusType$new()$fromJSON(jsonlite::toJSON(this_object$`status`, auto_unbox = TRUE, digits = NA))
      self
    },
    #' Validate JSON input with respect to OfferSellingProgramDTO
    #'
    #' @description
    #' Validate JSON input with respect to OfferSellingProgramDTO and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `sellingProgram`
      if (!is.null(input_json$`sellingProgram`)) {
        stopifnot(R6::is.R6(input_json$`sellingProgram`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for OfferSellingProgramDTO: the required field `sellingProgram` is missing."))
      }
      # check the required field `status`
      if (!is.null(input_json$`status`)) {
        stopifnot(R6::is.R6(input_json$`status`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for OfferSellingProgramDTO: the required field `status` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of OfferSellingProgramDTO
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
      # check if the required `sellingProgram` is null
      if (is.null(self$`sellingProgram`)) {
        return(FALSE)
      }

      # check if the required `status` is null
      if (is.null(self$`status`)) {
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
      # check if the required `sellingProgram` is null
      if (is.null(self$`sellingProgram`)) {
        invalid_fields["sellingProgram"] <- "Non-nullable required field `sellingProgram` cannot be null."
      }

      # check if the required `status` is null
      if (is.null(self$`status`)) {
        invalid_fields["status"] <- "Non-nullable required field `status` cannot be null."
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
# OfferSellingProgramDTO$unlock()
#
## Below is an example to define the print function
# OfferSellingProgramDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# OfferSellingProgramDTO$lock()

