#' Create a new GenerateShipmentListDocumentReportRequest
#'
#' @description
#' Данные, необходимые для генерации документа. 
#'
#' @docType class
#' @title GenerateShipmentListDocumentReportRequest
#' @description GenerateShipmentListDocumentReportRequest Class
#' @format An \code{R6Class} generator object
#' @field campaignId Идентификатор кампании. integer
#' @field shipmentId Идентификатор отгрузки. integer [optional]
#' @field orderIds Фильтр по идентификаторам заказа в отгрузке. list(integer) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
GenerateShipmentListDocumentReportRequest <- R6::R6Class(
  "GenerateShipmentListDocumentReportRequest",
  public = list(
    `campaignId` = NULL,
    `shipmentId` = NULL,
    `orderIds` = NULL,
    #' Initialize a new GenerateShipmentListDocumentReportRequest class.
    #'
    #' @description
    #' Initialize a new GenerateShipmentListDocumentReportRequest class.
    #'
    #' @param campaignId Идентификатор кампании.
    #' @param shipmentId Идентификатор отгрузки.
    #' @param orderIds Фильтр по идентификаторам заказа в отгрузке.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`campaignId`, `shipmentId` = NULL, `orderIds` = NULL, ...) {
      if (!missing(`campaignId`)) {
        if (!(is.numeric(`campaignId`) && length(`campaignId`) == 1)) {
          stop(paste("Error! Invalid data for `campaignId`. Must be an integer:", `campaignId`))
        }
        self$`campaignId` <- `campaignId`
      }
      if (!is.null(`shipmentId`)) {
        if (!(is.numeric(`shipmentId`) && length(`shipmentId`) == 1)) {
          stop(paste("Error! Invalid data for `shipmentId`. Must be an integer:", `shipmentId`))
        }
        self$`shipmentId` <- `shipmentId`
      }
      if (!is.null(`orderIds`)) {
        stopifnot(is.vector(`orderIds`), length(`orderIds`) != 0)
        sapply(`orderIds`, function(x) stopifnot(is.character(x)))
        self$`orderIds` <- `orderIds`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return GenerateShipmentListDocumentReportRequest in JSON format
    #' @export
    toJSON = function() {
      GenerateShipmentListDocumentReportRequestObject <- list()
      if (!is.null(self$`campaignId`)) {
        GenerateShipmentListDocumentReportRequestObject[["campaignId"]] <-
          self$`campaignId`
      }
      if (!is.null(self$`shipmentId`)) {
        GenerateShipmentListDocumentReportRequestObject[["shipmentId"]] <-
          self$`shipmentId`
      }
      if (!is.null(self$`orderIds`)) {
        GenerateShipmentListDocumentReportRequestObject[["orderIds"]] <-
          self$`orderIds`
      }
      GenerateShipmentListDocumentReportRequestObject
    },
    #' Deserialize JSON string into an instance of GenerateShipmentListDocumentReportRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of GenerateShipmentListDocumentReportRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of GenerateShipmentListDocumentReportRequest
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`campaignId`)) {
        self$`campaignId` <- this_object$`campaignId`
      }
      if (!is.null(this_object$`shipmentId`)) {
        self$`shipmentId` <- this_object$`shipmentId`
      }
      if (!is.null(this_object$`orderIds`)) {
        self$`orderIds` <- ApiClient$new()$deserializeObj(this_object$`orderIds`, "array[integer]", loadNamespace("ympa_r_client"))
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return GenerateShipmentListDocumentReportRequest in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`campaignId`)) {
          sprintf(
          '"campaignId":
            %d
                    ',
          self$`campaignId`
          )
        },
        if (!is.null(self$`shipmentId`)) {
          sprintf(
          '"shipmentId":
            %d
                    ',
          self$`shipmentId`
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
    #' Deserialize JSON string into an instance of GenerateShipmentListDocumentReportRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of GenerateShipmentListDocumentReportRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of GenerateShipmentListDocumentReportRequest
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`campaignId` <- this_object$`campaignId`
      self$`shipmentId` <- this_object$`shipmentId`
      self$`orderIds` <- ApiClient$new()$deserializeObj(this_object$`orderIds`, "array[integer]", loadNamespace("ympa_r_client"))
      self
    },
    #' Validate JSON input with respect to GenerateShipmentListDocumentReportRequest
    #'
    #' @description
    #' Validate JSON input with respect to GenerateShipmentListDocumentReportRequest and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `campaignId`
      if (!is.null(input_json$`campaignId`)) {
        if (!(is.numeric(input_json$`campaignId`) && length(input_json$`campaignId`) == 1)) {
          stop(paste("Error! Invalid data for `campaignId`. Must be an integer:", input_json$`campaignId`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for GenerateShipmentListDocumentReportRequest: the required field `campaignId` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of GenerateShipmentListDocumentReportRequest
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
      # check if the required `campaignId` is null
      if (is.null(self$`campaignId`)) {
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
      # check if the required `campaignId` is null
      if (is.null(self$`campaignId`)) {
        invalid_fields["campaignId"] <- "Non-nullable required field `campaignId` cannot be null."
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
# GenerateShipmentListDocumentReportRequest$unlock()
#
## Below is an example to define the print function
# GenerateShipmentListDocumentReportRequest$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# GenerateShipmentListDocumentReportRequest$lock()

