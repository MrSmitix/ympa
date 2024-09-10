#' Create a new OutletAddressDTO
#'
#' @description
#' Адрес точки продаж. 
#'
#' @docType class
#' @title OutletAddressDTO
#' @description OutletAddressDTO Class
#' @format An \code{R6Class} generator object
#' @field regionId Идентификатор региона.  Идентификатор можно получить c помощью запроса [GET regions](../../reference/regions/searchRegionsByName.md).  {\% note alert \%}  При создании и редактировании точек продаж можно указывать только регионы типов `TOWN` (город), `CITY` (крупный город) и `REPUBLIC_AREA` (район субъекта федерации). Тип региона указан в выходных параметрах type запросов [GET regions](../../reference/regions/searchRegionsByName.md) и [GET regions/{regionId}](../../reference/regions/searchRegionsById.md).  {\% endnote \%} integer
#' @field street Улица. character [optional]
#' @field number Номер дома. character [optional]
#' @field building Номер строения. character [optional]
#' @field estate Номер владения. character [optional]
#' @field block Номер корпуса. character [optional]
#' @field additional Дополнительная информация. character [optional]
#' @field km Порядковый номер километра дороги, на котором располагается точка продаж, если отсутствует улица. integer [optional]
#' @field city {\% note warning \"\" \%}  Этот параметр устарел. Не используйте его. Город или населенный пункт возвращается в параметре `regionId`.  {\% endnote \%} character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
OutletAddressDTO <- R6::R6Class(
  "OutletAddressDTO",
  public = list(
    `regionId` = NULL,
    `street` = NULL,
    `number` = NULL,
    `building` = NULL,
    `estate` = NULL,
    `block` = NULL,
    `additional` = NULL,
    `km` = NULL,
    `city` = NULL,
    #' Initialize a new OutletAddressDTO class.
    #'
    #' @description
    #' Initialize a new OutletAddressDTO class.
    #'
    #' @param regionId Идентификатор региона.  Идентификатор можно получить c помощью запроса [GET regions](../../reference/regions/searchRegionsByName.md).  {\% note alert \%}  При создании и редактировании точек продаж можно указывать только регионы типов `TOWN` (город), `CITY` (крупный город) и `REPUBLIC_AREA` (район субъекта федерации). Тип региона указан в выходных параметрах type запросов [GET regions](../../reference/regions/searchRegionsByName.md) и [GET regions/{regionId}](../../reference/regions/searchRegionsById.md).  {\% endnote \%}
    #' @param street Улица.
    #' @param number Номер дома.
    #' @param building Номер строения.
    #' @param estate Номер владения.
    #' @param block Номер корпуса.
    #' @param additional Дополнительная информация.
    #' @param km Порядковый номер километра дороги, на котором располагается точка продаж, если отсутствует улица.
    #' @param city {\% note warning \"\" \%}  Этот параметр устарел. Не используйте его. Город или населенный пункт возвращается в параметре `regionId`.  {\% endnote \%}
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`regionId`, `street` = NULL, `number` = NULL, `building` = NULL, `estate` = NULL, `block` = NULL, `additional` = NULL, `km` = NULL, `city` = NULL, ...) {
      if (!missing(`regionId`)) {
        if (!(is.numeric(`regionId`) && length(`regionId`) == 1)) {
          stop(paste("Error! Invalid data for `regionId`. Must be an integer:", `regionId`))
        }
        self$`regionId` <- `regionId`
      }
      if (!is.null(`street`)) {
        if (!(is.character(`street`) && length(`street`) == 1)) {
          stop(paste("Error! Invalid data for `street`. Must be a string:", `street`))
        }
        self$`street` <- `street`
      }
      if (!is.null(`number`)) {
        if (!(is.character(`number`) && length(`number`) == 1)) {
          stop(paste("Error! Invalid data for `number`. Must be a string:", `number`))
        }
        self$`number` <- `number`
      }
      if (!is.null(`building`)) {
        if (!(is.character(`building`) && length(`building`) == 1)) {
          stop(paste("Error! Invalid data for `building`. Must be a string:", `building`))
        }
        self$`building` <- `building`
      }
      if (!is.null(`estate`)) {
        if (!(is.character(`estate`) && length(`estate`) == 1)) {
          stop(paste("Error! Invalid data for `estate`. Must be a string:", `estate`))
        }
        self$`estate` <- `estate`
      }
      if (!is.null(`block`)) {
        if (!(is.character(`block`) && length(`block`) == 1)) {
          stop(paste("Error! Invalid data for `block`. Must be a string:", `block`))
        }
        self$`block` <- `block`
      }
      if (!is.null(`additional`)) {
        if (!(is.character(`additional`) && length(`additional`) == 1)) {
          stop(paste("Error! Invalid data for `additional`. Must be a string:", `additional`))
        }
        self$`additional` <- `additional`
      }
      if (!is.null(`km`)) {
        if (!(is.numeric(`km`) && length(`km`) == 1)) {
          stop(paste("Error! Invalid data for `km`. Must be an integer:", `km`))
        }
        self$`km` <- `km`
      }
      if (!is.null(`city`)) {
        if (!(is.character(`city`) && length(`city`) == 1)) {
          stop(paste("Error! Invalid data for `city`. Must be a string:", `city`))
        }
        self$`city` <- `city`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return OutletAddressDTO in JSON format
    #' @export
    toJSON = function() {
      OutletAddressDTOObject <- list()
      if (!is.null(self$`regionId`)) {
        OutletAddressDTOObject[["regionId"]] <-
          self$`regionId`
      }
      if (!is.null(self$`street`)) {
        OutletAddressDTOObject[["street"]] <-
          self$`street`
      }
      if (!is.null(self$`number`)) {
        OutletAddressDTOObject[["number"]] <-
          self$`number`
      }
      if (!is.null(self$`building`)) {
        OutletAddressDTOObject[["building"]] <-
          self$`building`
      }
      if (!is.null(self$`estate`)) {
        OutletAddressDTOObject[["estate"]] <-
          self$`estate`
      }
      if (!is.null(self$`block`)) {
        OutletAddressDTOObject[["block"]] <-
          self$`block`
      }
      if (!is.null(self$`additional`)) {
        OutletAddressDTOObject[["additional"]] <-
          self$`additional`
      }
      if (!is.null(self$`km`)) {
        OutletAddressDTOObject[["km"]] <-
          self$`km`
      }
      if (!is.null(self$`city`)) {
        OutletAddressDTOObject[["city"]] <-
          self$`city`
      }
      OutletAddressDTOObject
    },
    #' Deserialize JSON string into an instance of OutletAddressDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of OutletAddressDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of OutletAddressDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`regionId`)) {
        self$`regionId` <- this_object$`regionId`
      }
      if (!is.null(this_object$`street`)) {
        self$`street` <- this_object$`street`
      }
      if (!is.null(this_object$`number`)) {
        self$`number` <- this_object$`number`
      }
      if (!is.null(this_object$`building`)) {
        self$`building` <- this_object$`building`
      }
      if (!is.null(this_object$`estate`)) {
        self$`estate` <- this_object$`estate`
      }
      if (!is.null(this_object$`block`)) {
        self$`block` <- this_object$`block`
      }
      if (!is.null(this_object$`additional`)) {
        self$`additional` <- this_object$`additional`
      }
      if (!is.null(this_object$`km`)) {
        self$`km` <- this_object$`km`
      }
      if (!is.null(this_object$`city`)) {
        self$`city` <- this_object$`city`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return OutletAddressDTO in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`regionId`)) {
          sprintf(
          '"regionId":
            %d
                    ',
          self$`regionId`
          )
        },
        if (!is.null(self$`street`)) {
          sprintf(
          '"street":
            "%s"
                    ',
          self$`street`
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
        if (!is.null(self$`building`)) {
          sprintf(
          '"building":
            "%s"
                    ',
          self$`building`
          )
        },
        if (!is.null(self$`estate`)) {
          sprintf(
          '"estate":
            "%s"
                    ',
          self$`estate`
          )
        },
        if (!is.null(self$`block`)) {
          sprintf(
          '"block":
            "%s"
                    ',
          self$`block`
          )
        },
        if (!is.null(self$`additional`)) {
          sprintf(
          '"additional":
            "%s"
                    ',
          self$`additional`
          )
        },
        if (!is.null(self$`km`)) {
          sprintf(
          '"km":
            %d
                    ',
          self$`km`
          )
        },
        if (!is.null(self$`city`)) {
          sprintf(
          '"city":
            "%s"
                    ',
          self$`city`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of OutletAddressDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of OutletAddressDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of OutletAddressDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`regionId` <- this_object$`regionId`
      self$`street` <- this_object$`street`
      self$`number` <- this_object$`number`
      self$`building` <- this_object$`building`
      self$`estate` <- this_object$`estate`
      self$`block` <- this_object$`block`
      self$`additional` <- this_object$`additional`
      self$`km` <- this_object$`km`
      self$`city` <- this_object$`city`
      self
    },
    #' Validate JSON input with respect to OutletAddressDTO
    #'
    #' @description
    #' Validate JSON input with respect to OutletAddressDTO and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `regionId`
      if (!is.null(input_json$`regionId`)) {
        if (!(is.numeric(input_json$`regionId`) && length(input_json$`regionId`) == 1)) {
          stop(paste("Error! Invalid data for `regionId`. Must be an integer:", input_json$`regionId`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for OutletAddressDTO: the required field `regionId` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of OutletAddressDTO
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
      # check if the required `regionId` is null
      if (is.null(self$`regionId`)) {
        return(FALSE)
      }

      if (nchar(self$`street`) > 512) {
        return(FALSE)
      }

      if (nchar(self$`number`) > 256) {
        return(FALSE)
      }

      if (nchar(self$`building`) > 16) {
        return(FALSE)
      }

      if (nchar(self$`estate`) > 16) {
        return(FALSE)
      }

      if (nchar(self$`block`) > 16) {
        return(FALSE)
      }

      if (nchar(self$`city`) > 200) {
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
      # check if the required `regionId` is null
      if (is.null(self$`regionId`)) {
        invalid_fields["regionId"] <- "Non-nullable required field `regionId` cannot be null."
      }

      if (nchar(self$`street`) > 512) {
        invalid_fields["street"] <- "Invalid length for `street`, must be smaller than or equal to 512."
      }

      if (nchar(self$`number`) > 256) {
        invalid_fields["number"] <- "Invalid length for `number`, must be smaller than or equal to 256."
      }

      if (nchar(self$`building`) > 16) {
        invalid_fields["building"] <- "Invalid length for `building`, must be smaller than or equal to 16."
      }

      if (nchar(self$`estate`) > 16) {
        invalid_fields["estate"] <- "Invalid length for `estate`, must be smaller than or equal to 16."
      }

      if (nchar(self$`block`) > 16) {
        invalid_fields["block"] <- "Invalid length for `block`, must be smaller than or equal to 16."
      }

      if (nchar(self$`city`) > 200) {
        invalid_fields["city"] <- "Invalid length for `city`, must be smaller than or equal to 200."
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
# OutletAddressDTO$unlock()
#
## Below is an example to define the print function
# OutletAddressDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# OutletAddressDTO$lock()

