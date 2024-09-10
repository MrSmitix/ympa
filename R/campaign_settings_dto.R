#' Create a new CampaignSettingsDTO
#'
#' @description
#' Настройки магазина.
#'
#' @docType class
#' @title CampaignSettingsDTO
#' @description CampaignSettingsDTO Class
#' @format An \code{R6Class} generator object
#' @field countryRegion Идентификатор региона, в котором находится магазин. integer [optional]
#' @field shopName Наименование магазина на Яндекс Маркете. Если наименование отсутствует, значение параметра выводится — `null`. character [optional]
#' @field showInContext Признак размещения магазина на сайтах партнеров Яндекс Дистрибуции. Возможные значения: * `false` — магазин не размещен на сайтах партнеров Яндекс Дистрибуции. * `true` — магазин размещен на сайтах партнеров Яндекс Дистрибуции. character [optional]
#' @field showInPremium Признак показа предложений магазина в рекламном блоке над результатами поиска (cпецразмещение). Возможные значения: * `false` — предложения не показываются в блоке cпецразмещения. * `true` — предложения показываются в блоке cпецразмещения. character [optional]
#' @field useOpenStat Признак использования внешней интернет-статистики. Возможные значения: * `false` — внешняя интернет-статистика не используется. * `true` — внешняя интернет-статистика используется. character [optional]
#' @field localRegion  \link{CampaignSettingsLocalRegionDTO} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CampaignSettingsDTO <- R6::R6Class(
  "CampaignSettingsDTO",
  public = list(
    `countryRegion` = NULL,
    `shopName` = NULL,
    `showInContext` = NULL,
    `showInPremium` = NULL,
    `useOpenStat` = NULL,
    `localRegion` = NULL,
    #' Initialize a new CampaignSettingsDTO class.
    #'
    #' @description
    #' Initialize a new CampaignSettingsDTO class.
    #'
    #' @param countryRegion Идентификатор региона, в котором находится магазин.
    #' @param shopName Наименование магазина на Яндекс Маркете. Если наименование отсутствует, значение параметра выводится — `null`.
    #' @param showInContext Признак размещения магазина на сайтах партнеров Яндекс Дистрибуции. Возможные значения: * `false` — магазин не размещен на сайтах партнеров Яндекс Дистрибуции. * `true` — магазин размещен на сайтах партнеров Яндекс Дистрибуции.
    #' @param showInPremium Признак показа предложений магазина в рекламном блоке над результатами поиска (cпецразмещение). Возможные значения: * `false` — предложения не показываются в блоке cпецразмещения. * `true` — предложения показываются в блоке cпецразмещения.
    #' @param useOpenStat Признак использования внешней интернет-статистики. Возможные значения: * `false` — внешняя интернет-статистика не используется. * `true` — внешняя интернет-статистика используется.
    #' @param localRegion localRegion
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`countryRegion` = NULL, `shopName` = NULL, `showInContext` = NULL, `showInPremium` = NULL, `useOpenStat` = NULL, `localRegion` = NULL, ...) {
      if (!is.null(`countryRegion`)) {
        if (!(is.numeric(`countryRegion`) && length(`countryRegion`) == 1)) {
          stop(paste("Error! Invalid data for `countryRegion`. Must be an integer:", `countryRegion`))
        }
        self$`countryRegion` <- `countryRegion`
      }
      if (!is.null(`shopName`)) {
        if (!(is.character(`shopName`) && length(`shopName`) == 1)) {
          stop(paste("Error! Invalid data for `shopName`. Must be a string:", `shopName`))
        }
        self$`shopName` <- `shopName`
      }
      if (!is.null(`showInContext`)) {
        if (!(is.logical(`showInContext`) && length(`showInContext`) == 1)) {
          stop(paste("Error! Invalid data for `showInContext`. Must be a boolean:", `showInContext`))
        }
        self$`showInContext` <- `showInContext`
      }
      if (!is.null(`showInPremium`)) {
        if (!(is.logical(`showInPremium`) && length(`showInPremium`) == 1)) {
          stop(paste("Error! Invalid data for `showInPremium`. Must be a boolean:", `showInPremium`))
        }
        self$`showInPremium` <- `showInPremium`
      }
      if (!is.null(`useOpenStat`)) {
        if (!(is.logical(`useOpenStat`) && length(`useOpenStat`) == 1)) {
          stop(paste("Error! Invalid data for `useOpenStat`. Must be a boolean:", `useOpenStat`))
        }
        self$`useOpenStat` <- `useOpenStat`
      }
      if (!is.null(`localRegion`)) {
        stopifnot(R6::is.R6(`localRegion`))
        self$`localRegion` <- `localRegion`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return CampaignSettingsDTO in JSON format
    #' @export
    toJSON = function() {
      CampaignSettingsDTOObject <- list()
      if (!is.null(self$`countryRegion`)) {
        CampaignSettingsDTOObject[["countryRegion"]] <-
          self$`countryRegion`
      }
      if (!is.null(self$`shopName`)) {
        CampaignSettingsDTOObject[["shopName"]] <-
          self$`shopName`
      }
      if (!is.null(self$`showInContext`)) {
        CampaignSettingsDTOObject[["showInContext"]] <-
          self$`showInContext`
      }
      if (!is.null(self$`showInPremium`)) {
        CampaignSettingsDTOObject[["showInPremium"]] <-
          self$`showInPremium`
      }
      if (!is.null(self$`useOpenStat`)) {
        CampaignSettingsDTOObject[["useOpenStat"]] <-
          self$`useOpenStat`
      }
      if (!is.null(self$`localRegion`)) {
        CampaignSettingsDTOObject[["localRegion"]] <-
          self$`localRegion`$toJSON()
      }
      CampaignSettingsDTOObject
    },
    #' Deserialize JSON string into an instance of CampaignSettingsDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of CampaignSettingsDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of CampaignSettingsDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`countryRegion`)) {
        self$`countryRegion` <- this_object$`countryRegion`
      }
      if (!is.null(this_object$`shopName`)) {
        self$`shopName` <- this_object$`shopName`
      }
      if (!is.null(this_object$`showInContext`)) {
        self$`showInContext` <- this_object$`showInContext`
      }
      if (!is.null(this_object$`showInPremium`)) {
        self$`showInPremium` <- this_object$`showInPremium`
      }
      if (!is.null(this_object$`useOpenStat`)) {
        self$`useOpenStat` <- this_object$`useOpenStat`
      }
      if (!is.null(this_object$`localRegion`)) {
        `localregion_object` <- CampaignSettingsLocalRegionDTO$new()
        `localregion_object`$fromJSON(jsonlite::toJSON(this_object$`localRegion`, auto_unbox = TRUE, digits = NA))
        self$`localRegion` <- `localregion_object`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return CampaignSettingsDTO in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`countryRegion`)) {
          sprintf(
          '"countryRegion":
            %d
                    ',
          self$`countryRegion`
          )
        },
        if (!is.null(self$`shopName`)) {
          sprintf(
          '"shopName":
            "%s"
                    ',
          self$`shopName`
          )
        },
        if (!is.null(self$`showInContext`)) {
          sprintf(
          '"showInContext":
            %s
                    ',
          tolower(self$`showInContext`)
          )
        },
        if (!is.null(self$`showInPremium`)) {
          sprintf(
          '"showInPremium":
            %s
                    ',
          tolower(self$`showInPremium`)
          )
        },
        if (!is.null(self$`useOpenStat`)) {
          sprintf(
          '"useOpenStat":
            %s
                    ',
          tolower(self$`useOpenStat`)
          )
        },
        if (!is.null(self$`localRegion`)) {
          sprintf(
          '"localRegion":
          %s
          ',
          jsonlite::toJSON(self$`localRegion`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of CampaignSettingsDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of CampaignSettingsDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of CampaignSettingsDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`countryRegion` <- this_object$`countryRegion`
      self$`shopName` <- this_object$`shopName`
      self$`showInContext` <- this_object$`showInContext`
      self$`showInPremium` <- this_object$`showInPremium`
      self$`useOpenStat` <- this_object$`useOpenStat`
      self$`localRegion` <- CampaignSettingsLocalRegionDTO$new()$fromJSON(jsonlite::toJSON(this_object$`localRegion`, auto_unbox = TRUE, digits = NA))
      self
    },
    #' Validate JSON input with respect to CampaignSettingsDTO
    #'
    #' @description
    #' Validate JSON input with respect to CampaignSettingsDTO and throw an exception if invalid
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
    #' @return String representation of CampaignSettingsDTO
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
# CampaignSettingsDTO$unlock()
#
## Below is an example to define the print function
# CampaignSettingsDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CampaignSettingsDTO$lock()

