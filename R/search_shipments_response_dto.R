#' Create a new SearchShipmentsResponseDTO
#'
#' @description
#' Информация об отгрузках.
#'
#' @docType class
#' @title SearchShipmentsResponseDTO
#' @description SearchShipmentsResponseDTO Class
#' @format An \code{R6Class} generator object
#' @field shipments Список с информацией об отгрузках. list(\link{ShipmentInfoDTO})
#' @field paging  \link{ForwardScrollingPagerDTO} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
SearchShipmentsResponseDTO <- R6::R6Class(
  "SearchShipmentsResponseDTO",
  public = list(
    `shipments` = NULL,
    `paging` = NULL,
    #' Initialize a new SearchShipmentsResponseDTO class.
    #'
    #' @description
    #' Initialize a new SearchShipmentsResponseDTO class.
    #'
    #' @param shipments Список с информацией об отгрузках.
    #' @param paging paging
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`shipments`, `paging` = NULL, ...) {
      if (!missing(`shipments`)) {
        stopifnot(is.vector(`shipments`), length(`shipments`) != 0)
        sapply(`shipments`, function(x) stopifnot(R6::is.R6(x)))
        self$`shipments` <- `shipments`
      }
      if (!is.null(`paging`)) {
        stopifnot(R6::is.R6(`paging`))
        self$`paging` <- `paging`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return SearchShipmentsResponseDTO in JSON format
    #' @export
    toJSON = function() {
      SearchShipmentsResponseDTOObject <- list()
      if (!is.null(self$`shipments`)) {
        SearchShipmentsResponseDTOObject[["shipments"]] <-
          lapply(self$`shipments`, function(x) x$toJSON())
      }
      if (!is.null(self$`paging`)) {
        SearchShipmentsResponseDTOObject[["paging"]] <-
          self$`paging`$toJSON()
      }
      SearchShipmentsResponseDTOObject
    },
    #' Deserialize JSON string into an instance of SearchShipmentsResponseDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of SearchShipmentsResponseDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of SearchShipmentsResponseDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`shipments`)) {
        self$`shipments` <- ApiClient$new()$deserializeObj(this_object$`shipments`, "array[ShipmentInfoDTO]", loadNamespace("ympa_r_client"))
      }
      if (!is.null(this_object$`paging`)) {
        `paging_object` <- ForwardScrollingPagerDTO$new()
        `paging_object`$fromJSON(jsonlite::toJSON(this_object$`paging`, auto_unbox = TRUE, digits = NA))
        self$`paging` <- `paging_object`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return SearchShipmentsResponseDTO in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`shipments`)) {
          sprintf(
          '"shipments":
          [%s]
',
          paste(sapply(self$`shipments`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        },
        if (!is.null(self$`paging`)) {
          sprintf(
          '"paging":
          %s
          ',
          jsonlite::toJSON(self$`paging`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of SearchShipmentsResponseDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of SearchShipmentsResponseDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of SearchShipmentsResponseDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`shipments` <- ApiClient$new()$deserializeObj(this_object$`shipments`, "array[ShipmentInfoDTO]", loadNamespace("ympa_r_client"))
      self$`paging` <- ForwardScrollingPagerDTO$new()$fromJSON(jsonlite::toJSON(this_object$`paging`, auto_unbox = TRUE, digits = NA))
      self
    },
    #' Validate JSON input with respect to SearchShipmentsResponseDTO
    #'
    #' @description
    #' Validate JSON input with respect to SearchShipmentsResponseDTO and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `shipments`
      if (!is.null(input_json$`shipments`)) {
        stopifnot(is.vector(input_json$`shipments`), length(input_json$`shipments`) != 0)
        tmp <- sapply(input_json$`shipments`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for SearchShipmentsResponseDTO: the required field `shipments` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of SearchShipmentsResponseDTO
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
      # check if the required `shipments` is null
      if (is.null(self$`shipments`)) {
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
      # check if the required `shipments` is null
      if (is.null(self$`shipments`)) {
        invalid_fields["shipments"] <- "Non-nullable required field `shipments` cannot be null."
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
# SearchShipmentsResponseDTO$unlock()
#
## Below is an example to define the print function
# SearchShipmentsResponseDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# SearchShipmentsResponseDTO$lock()

