#' Create a new FullOutletLicenseDTO
#'
#' @description
#' Информация о лицензии.
#'
#' @docType class
#' @title FullOutletLicenseDTO
#' @description FullOutletLicenseDTO Class
#' @format An \code{R6Class} generator object
#' @field id Идентификатор лицензии.  Параметр указывается, только если нужно изменить информацию о существующей лицензии. Ее идентификатор можно узнать с помощью запроса [GET campaigns/{campaignId}/outlets/licenses](../../reference/outlets/getOutletLicenses.md). При передаче информации о новой лицензии указывать идентификатор не нужно.  Идентификатор лицензии присваивается Маркетом. Не путайте его с номером, указанным на лицензии: он передается в параметре `number`. integer [optional]
#' @field outletId Идентификатор точки продаж, для которой действительна лицензия. integer [optional]
#' @field licenseType  \link{LicenseType} [optional]
#' @field number Номер лицензии. character [optional]
#' @field dateOfIssue Дата выдачи лицензии.  Формат даты: ISO 8601 со смещением относительно UTC. Нужно передать дату, указанную на лицензии, время `00:00:00` и часовой пояс, соответствующий региону точки продаж. Например, если лицензия для точки продаж в Москве выдана 13 ноября 2017 года, то параметр должен иметь значение `2017-11-13T00:00:00+03:00`.  Обязательный параметр.  Не может быть позже даты окончания срока действия, указанной в параметре `dateOfExpiry`. character [optional]
#' @field dateOfExpiry Дата окончания действия лицензии.  Формат даты: ISO 8601 со смещением относительно UTC. Нужно передать дату, указанную на лицензии, время `00:00:00` и часовой пояс, соответствующий региону точки продаж. Например, если действие лицензии для точки продаж в Москве заканчивается 20 ноября 2022 года, то параметр должен иметь значение `2022-11-20T00:00:00+03:00`.  Обязательный параметр.  Не может быть раньше даты выдачи, указанной в параметре `dateOfIssue`. character [optional]
#' @field checkStatus  \link{LicenseCheckStatusType} [optional]
#' @field checkComment Причина, по которой лицензия не прошла проверку.  Параметр возвращается, только если параметр `checkStatus` имеет значение `FAIL`. character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
FullOutletLicenseDTO <- R6::R6Class(
  "FullOutletLicenseDTO",
  public = list(
    `id` = NULL,
    `outletId` = NULL,
    `licenseType` = NULL,
    `number` = NULL,
    `dateOfIssue` = NULL,
    `dateOfExpiry` = NULL,
    `checkStatus` = NULL,
    `checkComment` = NULL,
    #' Initialize a new FullOutletLicenseDTO class.
    #'
    #' @description
    #' Initialize a new FullOutletLicenseDTO class.
    #'
    #' @param id Идентификатор лицензии.  Параметр указывается, только если нужно изменить информацию о существующей лицензии. Ее идентификатор можно узнать с помощью запроса [GET campaigns/{campaignId}/outlets/licenses](../../reference/outlets/getOutletLicenses.md). При передаче информации о новой лицензии указывать идентификатор не нужно.  Идентификатор лицензии присваивается Маркетом. Не путайте его с номером, указанным на лицензии: он передается в параметре `number`.
    #' @param outletId Идентификатор точки продаж, для которой действительна лицензия.
    #' @param licenseType licenseType
    #' @param number Номер лицензии.
    #' @param dateOfIssue Дата выдачи лицензии.  Формат даты: ISO 8601 со смещением относительно UTC. Нужно передать дату, указанную на лицензии, время `00:00:00` и часовой пояс, соответствующий региону точки продаж. Например, если лицензия для точки продаж в Москве выдана 13 ноября 2017 года, то параметр должен иметь значение `2017-11-13T00:00:00+03:00`.  Обязательный параметр.  Не может быть позже даты окончания срока действия, указанной в параметре `dateOfExpiry`.
    #' @param dateOfExpiry Дата окончания действия лицензии.  Формат даты: ISO 8601 со смещением относительно UTC. Нужно передать дату, указанную на лицензии, время `00:00:00` и часовой пояс, соответствующий региону точки продаж. Например, если действие лицензии для точки продаж в Москве заканчивается 20 ноября 2022 года, то параметр должен иметь значение `2022-11-20T00:00:00+03:00`.  Обязательный параметр.  Не может быть раньше даты выдачи, указанной в параметре `dateOfIssue`.
    #' @param checkStatus checkStatus
    #' @param checkComment Причина, по которой лицензия не прошла проверку.  Параметр возвращается, только если параметр `checkStatus` имеет значение `FAIL`.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`id` = NULL, `outletId` = NULL, `licenseType` = NULL, `number` = NULL, `dateOfIssue` = NULL, `dateOfExpiry` = NULL, `checkStatus` = NULL, `checkComment` = NULL, ...) {
      if (!is.null(`id`)) {
        if (!(is.numeric(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be an integer:", `id`))
        }
        self$`id` <- `id`
      }
      if (!is.null(`outletId`)) {
        if (!(is.numeric(`outletId`) && length(`outletId`) == 1)) {
          stop(paste("Error! Invalid data for `outletId`. Must be an integer:", `outletId`))
        }
        self$`outletId` <- `outletId`
      }
      if (!is.null(`licenseType`)) {
        if (!(`licenseType` %in% c())) {
          stop(paste("Error! \"", `licenseType`, "\" cannot be assigned to `licenseType`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`licenseType`))
        self$`licenseType` <- `licenseType`
      }
      if (!is.null(`number`)) {
        if (!(is.character(`number`) && length(`number`) == 1)) {
          stop(paste("Error! Invalid data for `number`. Must be a string:", `number`))
        }
        self$`number` <- `number`
      }
      if (!is.null(`dateOfIssue`)) {
        if (!is.character(`dateOfIssue`)) {
          stop(paste("Error! Invalid data for `dateOfIssue`. Must be a string:", `dateOfIssue`))
        }
        self$`dateOfIssue` <- `dateOfIssue`
      }
      if (!is.null(`dateOfExpiry`)) {
        if (!is.character(`dateOfExpiry`)) {
          stop(paste("Error! Invalid data for `dateOfExpiry`. Must be a string:", `dateOfExpiry`))
        }
        self$`dateOfExpiry` <- `dateOfExpiry`
      }
      if (!is.null(`checkStatus`)) {
        if (!(`checkStatus` %in% c())) {
          stop(paste("Error! \"", `checkStatus`, "\" cannot be assigned to `checkStatus`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`checkStatus`))
        self$`checkStatus` <- `checkStatus`
      }
      if (!is.null(`checkComment`)) {
        if (!(is.character(`checkComment`) && length(`checkComment`) == 1)) {
          stop(paste("Error! Invalid data for `checkComment`. Must be a string:", `checkComment`))
        }
        self$`checkComment` <- `checkComment`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return FullOutletLicenseDTO in JSON format
    #' @export
    toJSON = function() {
      FullOutletLicenseDTOObject <- list()
      if (!is.null(self$`id`)) {
        FullOutletLicenseDTOObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`outletId`)) {
        FullOutletLicenseDTOObject[["outletId"]] <-
          self$`outletId`
      }
      if (!is.null(self$`licenseType`)) {
        FullOutletLicenseDTOObject[["licenseType"]] <-
          self$`licenseType`$toJSON()
      }
      if (!is.null(self$`number`)) {
        FullOutletLicenseDTOObject[["number"]] <-
          self$`number`
      }
      if (!is.null(self$`dateOfIssue`)) {
        FullOutletLicenseDTOObject[["dateOfIssue"]] <-
          self$`dateOfIssue`
      }
      if (!is.null(self$`dateOfExpiry`)) {
        FullOutletLicenseDTOObject[["dateOfExpiry"]] <-
          self$`dateOfExpiry`
      }
      if (!is.null(self$`checkStatus`)) {
        FullOutletLicenseDTOObject[["checkStatus"]] <-
          self$`checkStatus`$toJSON()
      }
      if (!is.null(self$`checkComment`)) {
        FullOutletLicenseDTOObject[["checkComment"]] <-
          self$`checkComment`
      }
      FullOutletLicenseDTOObject
    },
    #' Deserialize JSON string into an instance of FullOutletLicenseDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of FullOutletLicenseDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of FullOutletLicenseDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`outletId`)) {
        self$`outletId` <- this_object$`outletId`
      }
      if (!is.null(this_object$`licenseType`)) {
        `licensetype_object` <- LicenseType$new()
        `licensetype_object`$fromJSON(jsonlite::toJSON(this_object$`licenseType`, auto_unbox = TRUE, digits = NA))
        self$`licenseType` <- `licensetype_object`
      }
      if (!is.null(this_object$`number`)) {
        self$`number` <- this_object$`number`
      }
      if (!is.null(this_object$`dateOfIssue`)) {
        self$`dateOfIssue` <- this_object$`dateOfIssue`
      }
      if (!is.null(this_object$`dateOfExpiry`)) {
        self$`dateOfExpiry` <- this_object$`dateOfExpiry`
      }
      if (!is.null(this_object$`checkStatus`)) {
        `checkstatus_object` <- LicenseCheckStatusType$new()
        `checkstatus_object`$fromJSON(jsonlite::toJSON(this_object$`checkStatus`, auto_unbox = TRUE, digits = NA))
        self$`checkStatus` <- `checkstatus_object`
      }
      if (!is.null(this_object$`checkComment`)) {
        self$`checkComment` <- this_object$`checkComment`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return FullOutletLicenseDTO in JSON format
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
        if (!is.null(self$`outletId`)) {
          sprintf(
          '"outletId":
            %d
                    ',
          self$`outletId`
          )
        },
        if (!is.null(self$`licenseType`)) {
          sprintf(
          '"licenseType":
          %s
          ',
          jsonlite::toJSON(self$`licenseType`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`number`)) {
          sprintf(
          '"number":
            "%s"
                    ',
          self$`number`
          )
        },
        if (!is.null(self$`dateOfIssue`)) {
          sprintf(
          '"dateOfIssue":
            "%s"
                    ',
          self$`dateOfIssue`
          )
        },
        if (!is.null(self$`dateOfExpiry`)) {
          sprintf(
          '"dateOfExpiry":
            "%s"
                    ',
          self$`dateOfExpiry`
          )
        },
        if (!is.null(self$`checkStatus`)) {
          sprintf(
          '"checkStatus":
          %s
          ',
          jsonlite::toJSON(self$`checkStatus`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`checkComment`)) {
          sprintf(
          '"checkComment":
            "%s"
                    ',
          self$`checkComment`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of FullOutletLicenseDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of FullOutletLicenseDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of FullOutletLicenseDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`id` <- this_object$`id`
      self$`outletId` <- this_object$`outletId`
      self$`licenseType` <- LicenseType$new()$fromJSON(jsonlite::toJSON(this_object$`licenseType`, auto_unbox = TRUE, digits = NA))
      self$`number` <- this_object$`number`
      self$`dateOfIssue` <- this_object$`dateOfIssue`
      self$`dateOfExpiry` <- this_object$`dateOfExpiry`
      self$`checkStatus` <- LicenseCheckStatusType$new()$fromJSON(jsonlite::toJSON(this_object$`checkStatus`, auto_unbox = TRUE, digits = NA))
      self$`checkComment` <- this_object$`checkComment`
      self
    },
    #' Validate JSON input with respect to FullOutletLicenseDTO
    #'
    #' @description
    #' Validate JSON input with respect to FullOutletLicenseDTO and throw an exception if invalid
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
    #' @return String representation of FullOutletLicenseDTO
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
# FullOutletLicenseDTO$unlock()
#
## Below is an example to define the print function
# FullOutletLicenseDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# FullOutletLicenseDTO$lock()

