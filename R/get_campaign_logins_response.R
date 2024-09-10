#' Create a new GetCampaignLoginsResponse
#'
#' @description
#' Ответ на запрос списка логинов, связанных с магазином.
#'
#' @docType class
#' @title GetCampaignLoginsResponse
#' @description GetCampaignLoginsResponse Class
#' @format An \code{R6Class} generator object
#' @field logins Список логинов. list(character)
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
GetCampaignLoginsResponse <- R6::R6Class(
  "GetCampaignLoginsResponse",
  public = list(
    `logins` = NULL,
    #' Initialize a new GetCampaignLoginsResponse class.
    #'
    #' @description
    #' Initialize a new GetCampaignLoginsResponse class.
    #'
    #' @param logins Список логинов.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`logins`, ...) {
      if (!missing(`logins`)) {
        stopifnot(is.vector(`logins`), length(`logins`) != 0)
        sapply(`logins`, function(x) stopifnot(is.character(x)))
        self$`logins` <- `logins`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return GetCampaignLoginsResponse in JSON format
    #' @export
    toJSON = function() {
      GetCampaignLoginsResponseObject <- list()
      if (!is.null(self$`logins`)) {
        GetCampaignLoginsResponseObject[["logins"]] <-
          self$`logins`
      }
      GetCampaignLoginsResponseObject
    },
    #' Deserialize JSON string into an instance of GetCampaignLoginsResponse
    #'
    #' @description
    #' Deserialize JSON string into an instance of GetCampaignLoginsResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of GetCampaignLoginsResponse
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`logins`)) {
        self$`logins` <- ApiClient$new()$deserializeObj(this_object$`logins`, "array[character]", loadNamespace("ympa_r_client"))
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return GetCampaignLoginsResponse in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`logins`)) {
          sprintf(
          '"logins":
             [%s]
          ',
          paste(unlist(lapply(self$`logins`, function(x) paste0('"', x, '"'))), collapse = ",")
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of GetCampaignLoginsResponse
    #'
    #' @description
    #' Deserialize JSON string into an instance of GetCampaignLoginsResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of GetCampaignLoginsResponse
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`logins` <- ApiClient$new()$deserializeObj(this_object$`logins`, "array[character]", loadNamespace("ympa_r_client"))
      self
    },
    #' Validate JSON input with respect to GetCampaignLoginsResponse
    #'
    #' @description
    #' Validate JSON input with respect to GetCampaignLoginsResponse and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `logins`
      if (!is.null(input_json$`logins`)) {
        stopifnot(is.vector(input_json$`logins`), length(input_json$`logins`) != 0)
        tmp <- sapply(input_json$`logins`, function(x) stopifnot(is.character(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for GetCampaignLoginsResponse: the required field `logins` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of GetCampaignLoginsResponse
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
      # check if the required `logins` is null
      if (is.null(self$`logins`)) {
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
      # check if the required `logins` is null
      if (is.null(self$`logins`)) {
        invalid_fields["logins"] <- "Non-nullable required field `logins` cannot be null."
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
# GetCampaignLoginsResponse$unlock()
#
## Below is an example to define the print function
# GetCampaignLoginsResponse$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# GetCampaignLoginsResponse$lock()

