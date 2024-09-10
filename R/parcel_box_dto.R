#' Create a new ParcelBoxDTO
#'
#' @description
#' Элемент отображает одно грузовое место. Вложенные поля больше не используются, передавайте элемент пустым в запросах и не обращайте внимание на содержимое в ответах.
#'
#' @docType class
#' @title ParcelBoxDTO
#' @description ParcelBoxDTO Class
#' @format An \code{R6Class} generator object
#' @field id {\% note warning \"\" \%}  Этот параметр устарел. Не используйте его.  {\% endnote \%} integer [optional]
#' @field fulfilmentId {\% note warning \"\" \%}  Этот параметр устарел. Не используйте его.  {\% endnote \%} character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ParcelBoxDTO <- R6::R6Class(
  "ParcelBoxDTO",
  public = list(
    `id` = NULL,
    `fulfilmentId` = NULL,
    #' Initialize a new ParcelBoxDTO class.
    #'
    #' @description
    #' Initialize a new ParcelBoxDTO class.
    #'
    #' @param id {\% note warning \"\" \%}  Этот параметр устарел. Не используйте его.  {\% endnote \%}
    #' @param fulfilmentId {\% note warning \"\" \%}  Этот параметр устарел. Не используйте его.  {\% endnote \%}
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`id` = NULL, `fulfilmentId` = NULL, ...) {
      if (!is.null(`id`)) {
        if (!(is.numeric(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be an integer:", `id`))
        }
        self$`id` <- `id`
      }
      if (!is.null(`fulfilmentId`)) {
        if (!(is.character(`fulfilmentId`) && length(`fulfilmentId`) == 1)) {
          stop(paste("Error! Invalid data for `fulfilmentId`. Must be a string:", `fulfilmentId`))
        }
        self$`fulfilmentId` <- `fulfilmentId`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return ParcelBoxDTO in JSON format
    #' @export
    toJSON = function() {
      ParcelBoxDTOObject <- list()
      if (!is.null(self$`id`)) {
        ParcelBoxDTOObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`fulfilmentId`)) {
        ParcelBoxDTOObject[["fulfilmentId"]] <-
          self$`fulfilmentId`
      }
      ParcelBoxDTOObject
    },
    #' Deserialize JSON string into an instance of ParcelBoxDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of ParcelBoxDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of ParcelBoxDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`fulfilmentId`)) {
        self$`fulfilmentId` <- this_object$`fulfilmentId`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return ParcelBoxDTO in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`id`)) {
          sprintf(
          '"id":
            %d
                    ',
          self$`id`
          )
        },
        if (!is.null(self$`fulfilmentId`)) {
          sprintf(
          '"fulfilmentId":
            "%s"
                    ',
          self$`fulfilmentId`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of ParcelBoxDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of ParcelBoxDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of ParcelBoxDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`id` <- this_object$`id`
      self$`fulfilmentId` <- this_object$`fulfilmentId`
      self
    },
    #' Validate JSON input with respect to ParcelBoxDTO
    #'
    #' @description
    #' Validate JSON input with respect to ParcelBoxDTO and throw an exception if invalid
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
    #' @return String representation of ParcelBoxDTO
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
      if (!str_detect(self$`fulfilmentId`, "^[\\p{Alnum}- ]*$")) {
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
      if (!str_detect(self$`fulfilmentId`, "^[\\p{Alnum}- ]*$")) {
        invalid_fields["fulfilmentId"] <- "Invalid value for `fulfilmentId`, must conform to the pattern ^[\\p{Alnum}- ]*$."
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
# ParcelBoxDTO$unlock()
#
## Below is an example to define the print function
# ParcelBoxDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# ParcelBoxDTO$lock()

