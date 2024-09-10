#' Create a new EacVerificationResultDTO
#'
#' @description
#' Результат выполнения запроса.
#'
#' @docType class
#' @title EacVerificationResultDTO
#' @description EacVerificationResultDTO Class
#' @format An \code{R6Class} generator object
#' @field verificationResult  \link{EacVerificationStatusType} [optional]
#' @field attemptsLeft Количество оставшихся попыток проверки кода.  Возвращается, если магазин отправил некорректный код.  Когда все попытки будут исчерпаны, код обновится. integer [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
EacVerificationResultDTO <- R6::R6Class(
  "EacVerificationResultDTO",
  public = list(
    `verificationResult` = NULL,
    `attemptsLeft` = NULL,
    #' Initialize a new EacVerificationResultDTO class.
    #'
    #' @description
    #' Initialize a new EacVerificationResultDTO class.
    #'
    #' @param verificationResult verificationResult
    #' @param attemptsLeft Количество оставшихся попыток проверки кода.  Возвращается, если магазин отправил некорректный код.  Когда все попытки будут исчерпаны, код обновится.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`verificationResult` = NULL, `attemptsLeft` = NULL, ...) {
      if (!is.null(`verificationResult`)) {
        if (!(`verificationResult` %in% c())) {
          stop(paste("Error! \"", `verificationResult`, "\" cannot be assigned to `verificationResult`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`verificationResult`))
        self$`verificationResult` <- `verificationResult`
      }
      if (!is.null(`attemptsLeft`)) {
        if (!(is.numeric(`attemptsLeft`) && length(`attemptsLeft`) == 1)) {
          stop(paste("Error! Invalid data for `attemptsLeft`. Must be an integer:", `attemptsLeft`))
        }
        self$`attemptsLeft` <- `attemptsLeft`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return EacVerificationResultDTO in JSON format
    #' @export
    toJSON = function() {
      EacVerificationResultDTOObject <- list()
      if (!is.null(self$`verificationResult`)) {
        EacVerificationResultDTOObject[["verificationResult"]] <-
          self$`verificationResult`$toJSON()
      }
      if (!is.null(self$`attemptsLeft`)) {
        EacVerificationResultDTOObject[["attemptsLeft"]] <-
          self$`attemptsLeft`
      }
      EacVerificationResultDTOObject
    },
    #' Deserialize JSON string into an instance of EacVerificationResultDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of EacVerificationResultDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of EacVerificationResultDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`verificationResult`)) {
        `verificationresult_object` <- EacVerificationStatusType$new()
        `verificationresult_object`$fromJSON(jsonlite::toJSON(this_object$`verificationResult`, auto_unbox = TRUE, digits = NA))
        self$`verificationResult` <- `verificationresult_object`
      }
      if (!is.null(this_object$`attemptsLeft`)) {
        self$`attemptsLeft` <- this_object$`attemptsLeft`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return EacVerificationResultDTO in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`verificationResult`)) {
          sprintf(
          '"verificationResult":
          %s
          ',
          jsonlite::toJSON(self$`verificationResult`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`attemptsLeft`)) {
          sprintf(
          '"attemptsLeft":
            %d
                    ',
          self$`attemptsLeft`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of EacVerificationResultDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of EacVerificationResultDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of EacVerificationResultDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`verificationResult` <- EacVerificationStatusType$new()$fromJSON(jsonlite::toJSON(this_object$`verificationResult`, auto_unbox = TRUE, digits = NA))
      self$`attemptsLeft` <- this_object$`attemptsLeft`
      self
    },
    #' Validate JSON input with respect to EacVerificationResultDTO
    #'
    #' @description
    #' Validate JSON input with respect to EacVerificationResultDTO and throw an exception if invalid
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
    #' @return String representation of EacVerificationResultDTO
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
# EacVerificationResultDTO$unlock()
#
## Below is an example to define the print function
# EacVerificationResultDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# EacVerificationResultDTO$lock()

