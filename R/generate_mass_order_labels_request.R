#' Create a new GenerateMassOrderLabelsRequest
#'
#' @description
#' Данные, необходимые для генерации файла. 
#'
#' @docType class
#' @title GenerateMassOrderLabelsRequest
#' @description GenerateMassOrderLabelsRequest Class
#' @format An \code{R6Class} generator object
#' @field businessId Идентификатор кабинета. integer
#' @field orderIds Список идентификаторов заказов. list(integer)
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
GenerateMassOrderLabelsRequest <- R6::R6Class(
  "GenerateMassOrderLabelsRequest",
  public = list(
    `businessId` = NULL,
    `orderIds` = NULL,
    #' Initialize a new GenerateMassOrderLabelsRequest class.
    #'
    #' @description
    #' Initialize a new GenerateMassOrderLabelsRequest class.
    #'
    #' @param businessId Идентификатор кабинета.
    #' @param orderIds Список идентификаторов заказов.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`businessId`, `orderIds`, ...) {
      if (!missing(`businessId`)) {
        if (!(is.numeric(`businessId`) && length(`businessId`) == 1)) {
          stop(paste("Error! Invalid data for `businessId`. Must be an integer:", `businessId`))
        }
        self$`businessId` <- `businessId`
      }
      if (!missing(`orderIds`)) {
        stopifnot(is.vector(`orderIds`), length(`orderIds`) != 0)
        sapply(`orderIds`, function(x) stopifnot(is.character(x)))
        if (!identical(`orderIds`, unique(`orderIds`))) {
          stop("Error! Items in `orderIds` are not unique.")
        }
        self$`orderIds` <- `orderIds`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return GenerateMassOrderLabelsRequest in JSON format
    #' @export
    toJSON = function() {
      GenerateMassOrderLabelsRequestObject <- list()
      if (!is.null(self$`businessId`)) {
        GenerateMassOrderLabelsRequestObject[["businessId"]] <-
          self$`businessId`
      }
      if (!is.null(self$`orderIds`)) {
        GenerateMassOrderLabelsRequestObject[["orderIds"]] <-
          self$`orderIds`
      }
      GenerateMassOrderLabelsRequestObject
    },
    #' Deserialize JSON string into an instance of GenerateMassOrderLabelsRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of GenerateMassOrderLabelsRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of GenerateMassOrderLabelsRequest
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`businessId`)) {
        self$`businessId` <- this_object$`businessId`
      }
      if (!is.null(this_object$`orderIds`)) {
        self$`orderIds` <- ApiClient$new()$deserializeObj(this_object$`orderIds`, "set[integer]", loadNamespace("ympa_r_client"))
        if (!identical(self$`orderIds`, unique(self$`orderIds`))) {
          stop("Error! Items in `orderIds` are not unique.")
        }
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return GenerateMassOrderLabelsRequest in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`businessId`)) {
          sprintf(
          '"businessId":
            %d
                    ',
          self$`businessId`
          )
        },
        if (!is.null(self$`orderIds`)) {
          sprintf(
          '"orderIds":
             [%s]
          ',
          paste(unlist(lapply(self$`orderIds`, function(x) paste0('"', x, '"'))), collapse = ",")
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of GenerateMassOrderLabelsRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of GenerateMassOrderLabelsRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of GenerateMassOrderLabelsRequest
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`businessId` <- this_object$`businessId`
      self$`orderIds` <- ApiClient$new()$deserializeObj(this_object$`orderIds`, "set[integer]", loadNamespace("ympa_r_client"))
      if (!identical(self$`orderIds`, unique(self$`orderIds`))) {
        stop("Error! Items in `orderIds` are not unique.")
      }
      self
    },
    #' Validate JSON input with respect to GenerateMassOrderLabelsRequest
    #'
    #' @description
    #' Validate JSON input with respect to GenerateMassOrderLabelsRequest and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `businessId`
      if (!is.null(input_json$`businessId`)) {
        if (!(is.numeric(input_json$`businessId`) && length(input_json$`businessId`) == 1)) {
          stop(paste("Error! Invalid data for `businessId`. Must be an integer:", input_json$`businessId`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for GenerateMassOrderLabelsRequest: the required field `businessId` is missing."))
      }
      # check the required field `orderIds`
      if (!is.null(input_json$`orderIds`)) {
        stopifnot(is.vector(input_json$`orderIds`), length(input_json$`orderIds`) != 0)
        if (!identical(input_json$`orderIds`, unique(input_json$`orderIds`))) {
          stop("Error! Items in `orderIds` are not unique.")
        }
        tmp <- sapply(input_json$`orderIds`, function(x) stopifnot(is.character(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for GenerateMassOrderLabelsRequest: the required field `orderIds` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of GenerateMassOrderLabelsRequest
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
      # check if the required `businessId` is null
      if (is.null(self$`businessId`)) {
        return(FALSE)
      }

      # check if the required `orderIds` is null
      if (is.null(self$`orderIds`)) {
        return(FALSE)
      }

      if (length(self$`orderIds`) > 1000) {
        return(FALSE)
      }
      if (length(self$`orderIds`) < 1) {
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
      # check if the required `businessId` is null
      if (is.null(self$`businessId`)) {
        invalid_fields["businessId"] <- "Non-nullable required field `businessId` cannot be null."
      }

      # check if the required `orderIds` is null
      if (is.null(self$`orderIds`)) {
        invalid_fields["orderIds"] <- "Non-nullable required field `orderIds` cannot be null."
      }

      if (length(self$`orderIds`) > 1000) {
        invalid_fields["orderIds"] <- "Invalid length for `orderIds`, number of items must be less than or equal to 1000."
      }
      if (length(self$`orderIds`) < 1) {
        invalid_fields["orderIds"] <- "Invalid length for ``, number of items must be greater than or equal to 1."
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
# GenerateMassOrderLabelsRequest$unlock()
#
## Below is an example to define the print function
# GenerateMassOrderLabelsRequest$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# GenerateMassOrderLabelsRequest$lock()

