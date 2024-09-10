#' Create a new FullOutletDTO
#'
#' @description
#' Информация о точке продаж.
#'
#' @docType class
#' @title FullOutletDTO
#' @description FullOutletDTO Class
#' @format An \code{R6Class} generator object
#' @field name Название точки продаж. character
#' @field type  \link{OutletType}
#' @field coords Координаты точки продаж.  Формат: долгота, широта. Разделители: запятая и / или пробел. Например, `20.4522144, 54.7104264`.  Если параметр не передан, координаты будут определены по значениям параметров, вложенных в `address`. character [optional]
#' @field isMain Признак основной точки продаж.  Возможные значения:  * `false` — неосновная точка продаж. * `true` — основная точка продаж. character [optional]
#' @field shopOutletCode Идентификатор точки продаж, присвоенный магазином. character [optional]
#' @field visibility  \link{OutletVisibilityType} [optional]
#' @field address  \link{OutletAddressDTO}
#' @field phones Номера телефонов точки продаж. Передавайте в формате: `+7 (999) 999-99-99`. list(character)
#' @field workingSchedule  \link{OutletWorkingScheduleDTO}
#' @field deliveryRules Информация об условиях доставки для данной точки продаж.  Обязательный параметр, если параметр `type=DEPOT` или `type=MIXED`. list(\link{OutletDeliveryRuleDTO}) [optional]
#' @field storagePeriod Срок хранения заказа в собственном пункте выдачи заказов. Считается в днях. integer [optional]
#' @field id Идентификатор точки продаж, присвоенный Маркетом. integer [optional]
#' @field status  \link{OutletStatusType} [optional]
#' @field region  \link{RegionDTO} [optional]
#' @field shopOutletId Идентификатор точки продаж, заданный магазином. character [optional]
#' @field workingTime Рабочее время. character [optional]
#' @field moderationReason Статус модерации. character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
FullOutletDTO <- R6::R6Class(
  "FullOutletDTO",
  public = list(
    `name` = NULL,
    `type` = NULL,
    `coords` = NULL,
    `isMain` = NULL,
    `shopOutletCode` = NULL,
    `visibility` = NULL,
    `address` = NULL,
    `phones` = NULL,
    `workingSchedule` = NULL,
    `deliveryRules` = NULL,
    `storagePeriod` = NULL,
    `id` = NULL,
    `status` = NULL,
    `region` = NULL,
    `shopOutletId` = NULL,
    `workingTime` = NULL,
    `moderationReason` = NULL,
    #' Initialize a new FullOutletDTO class.
    #'
    #' @description
    #' Initialize a new FullOutletDTO class.
    #'
    #' @param name Название точки продаж.
    #' @param type type
    #' @param address address
    #' @param phones Номера телефонов точки продаж. Передавайте в формате: `+7 (999) 999-99-99`.
    #' @param workingSchedule workingSchedule
    #' @param coords Координаты точки продаж.  Формат: долгота, широта. Разделители: запятая и / или пробел. Например, `20.4522144, 54.7104264`.  Если параметр не передан, координаты будут определены по значениям параметров, вложенных в `address`.
    #' @param isMain Признак основной точки продаж.  Возможные значения:  * `false` — неосновная точка продаж. * `true` — основная точка продаж.
    #' @param shopOutletCode Идентификатор точки продаж, присвоенный магазином.
    #' @param visibility visibility
    #' @param deliveryRules Информация об условиях доставки для данной точки продаж.  Обязательный параметр, если параметр `type=DEPOT` или `type=MIXED`.
    #' @param storagePeriod Срок хранения заказа в собственном пункте выдачи заказов. Считается в днях.
    #' @param id Идентификатор точки продаж, присвоенный Маркетом.
    #' @param status status
    #' @param region region
    #' @param shopOutletId Идентификатор точки продаж, заданный магазином.
    #' @param workingTime Рабочее время.
    #' @param moderationReason Статус модерации.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`name`, `type`, `address`, `phones`, `workingSchedule`, `coords` = NULL, `isMain` = NULL, `shopOutletCode` = NULL, `visibility` = NULL, `deliveryRules` = NULL, `storagePeriod` = NULL, `id` = NULL, `status` = NULL, `region` = NULL, `shopOutletId` = NULL, `workingTime` = NULL, `moderationReason` = NULL, ...) {
      if (!missing(`name`)) {
        if (!(is.character(`name`) && length(`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", `name`))
        }
        self$`name` <- `name`
      }
      if (!missing(`type`)) {
        if (!(`type` %in% c())) {
          stop(paste("Error! \"", `type`, "\" cannot be assigned to `type`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`type`))
        self$`type` <- `type`
      }
      if (!missing(`address`)) {
        stopifnot(R6::is.R6(`address`))
        self$`address` <- `address`
      }
      if (!missing(`phones`)) {
        stopifnot(is.vector(`phones`), length(`phones`) != 0)
        sapply(`phones`, function(x) stopifnot(is.character(x)))
        self$`phones` <- `phones`
      }
      if (!missing(`workingSchedule`)) {
        stopifnot(R6::is.R6(`workingSchedule`))
        self$`workingSchedule` <- `workingSchedule`
      }
      if (!is.null(`coords`)) {
        if (!(is.character(`coords`) && length(`coords`) == 1)) {
          stop(paste("Error! Invalid data for `coords`. Must be a string:", `coords`))
        }
        self$`coords` <- `coords`
      }
      if (!is.null(`isMain`)) {
        if (!(is.logical(`isMain`) && length(`isMain`) == 1)) {
          stop(paste("Error! Invalid data for `isMain`. Must be a boolean:", `isMain`))
        }
        self$`isMain` <- `isMain`
      }
      if (!is.null(`shopOutletCode`)) {
        if (!(is.character(`shopOutletCode`) && length(`shopOutletCode`) == 1)) {
          stop(paste("Error! Invalid data for `shopOutletCode`. Must be a string:", `shopOutletCode`))
        }
        self$`shopOutletCode` <- `shopOutletCode`
      }
      if (!is.null(`visibility`)) {
        if (!(`visibility` %in% c())) {
          stop(paste("Error! \"", `visibility`, "\" cannot be assigned to `visibility`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`visibility`))
        self$`visibility` <- `visibility`
      }
      if (!is.null(`deliveryRules`)) {
        stopifnot(is.vector(`deliveryRules`), length(`deliveryRules`) != 0)
        sapply(`deliveryRules`, function(x) stopifnot(R6::is.R6(x)))
        self$`deliveryRules` <- `deliveryRules`
      }
      if (!is.null(`storagePeriod`)) {
        if (!(is.numeric(`storagePeriod`) && length(`storagePeriod`) == 1)) {
          stop(paste("Error! Invalid data for `storagePeriod`. Must be an integer:", `storagePeriod`))
        }
        self$`storagePeriod` <- `storagePeriod`
      }
      if (!is.null(`id`)) {
        if (!(is.numeric(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be an integer:", `id`))
        }
        self$`id` <- `id`
      }
      if (!is.null(`status`)) {
        if (!(`status` %in% c())) {
          stop(paste("Error! \"", `status`, "\" cannot be assigned to `status`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`status`))
        self$`status` <- `status`
      }
      if (!is.null(`region`)) {
        stopifnot(R6::is.R6(`region`))
        self$`region` <- `region`
      }
      if (!is.null(`shopOutletId`)) {
        if (!(is.character(`shopOutletId`) && length(`shopOutletId`) == 1)) {
          stop(paste("Error! Invalid data for `shopOutletId`. Must be a string:", `shopOutletId`))
        }
        self$`shopOutletId` <- `shopOutletId`
      }
      if (!is.null(`workingTime`)) {
        if (!(is.character(`workingTime`) && length(`workingTime`) == 1)) {
          stop(paste("Error! Invalid data for `workingTime`. Must be a string:", `workingTime`))
        }
        self$`workingTime` <- `workingTime`
      }
      if (!is.null(`moderationReason`)) {
        if (!(is.character(`moderationReason`) && length(`moderationReason`) == 1)) {
          stop(paste("Error! Invalid data for `moderationReason`. Must be a string:", `moderationReason`))
        }
        self$`moderationReason` <- `moderationReason`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return FullOutletDTO in JSON format
    #' @export
    toJSON = function() {
      FullOutletDTOObject <- list()
      if (!is.null(self$`name`)) {
        FullOutletDTOObject[["name"]] <-
          self$`name`
      }
      if (!is.null(self$`type`)) {
        FullOutletDTOObject[["type"]] <-
          self$`type`$toJSON()
      }
      if (!is.null(self$`coords`)) {
        FullOutletDTOObject[["coords"]] <-
          self$`coords`
      }
      if (!is.null(self$`isMain`)) {
        FullOutletDTOObject[["isMain"]] <-
          self$`isMain`
      }
      if (!is.null(self$`shopOutletCode`)) {
        FullOutletDTOObject[["shopOutletCode"]] <-
          self$`shopOutletCode`
      }
      if (!is.null(self$`visibility`)) {
        FullOutletDTOObject[["visibility"]] <-
          self$`visibility`$toJSON()
      }
      if (!is.null(self$`address`)) {
        FullOutletDTOObject[["address"]] <-
          self$`address`$toJSON()
      }
      if (!is.null(self$`phones`)) {
        FullOutletDTOObject[["phones"]] <-
          self$`phones`
      }
      if (!is.null(self$`workingSchedule`)) {
        FullOutletDTOObject[["workingSchedule"]] <-
          self$`workingSchedule`$toJSON()
      }
      if (!is.null(self$`deliveryRules`)) {
        FullOutletDTOObject[["deliveryRules"]] <-
          lapply(self$`deliveryRules`, function(x) x$toJSON())
      }
      if (!is.null(self$`storagePeriod`)) {
        FullOutletDTOObject[["storagePeriod"]] <-
          self$`storagePeriod`
      }
      if (!is.null(self$`id`)) {
        FullOutletDTOObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`status`)) {
        FullOutletDTOObject[["status"]] <-
          self$`status`$toJSON()
      }
      if (!is.null(self$`region`)) {
        FullOutletDTOObject[["region"]] <-
          self$`region`$toJSON()
      }
      if (!is.null(self$`shopOutletId`)) {
        FullOutletDTOObject[["shopOutletId"]] <-
          self$`shopOutletId`
      }
      if (!is.null(self$`workingTime`)) {
        FullOutletDTOObject[["workingTime"]] <-
          self$`workingTime`
      }
      if (!is.null(self$`moderationReason`)) {
        FullOutletDTOObject[["moderationReason"]] <-
          self$`moderationReason`
      }
      FullOutletDTOObject
    },
    #' Deserialize JSON string into an instance of FullOutletDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of FullOutletDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of FullOutletDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`name`)) {
        self$`name` <- this_object$`name`
      }
      if (!is.null(this_object$`type`)) {
        `type_object` <- OutletType$new()
        `type_object`$fromJSON(jsonlite::toJSON(this_object$`type`, auto_unbox = TRUE, digits = NA))
        self$`type` <- `type_object`
      }
      if (!is.null(this_object$`coords`)) {
        self$`coords` <- this_object$`coords`
      }
      if (!is.null(this_object$`isMain`)) {
        self$`isMain` <- this_object$`isMain`
      }
      if (!is.null(this_object$`shopOutletCode`)) {
        self$`shopOutletCode` <- this_object$`shopOutletCode`
      }
      if (!is.null(this_object$`visibility`)) {
        `visibility_object` <- OutletVisibilityType$new()
        `visibility_object`$fromJSON(jsonlite::toJSON(this_object$`visibility`, auto_unbox = TRUE, digits = NA))
        self$`visibility` <- `visibility_object`
      }
      if (!is.null(this_object$`address`)) {
        `address_object` <- OutletAddressDTO$new()
        `address_object`$fromJSON(jsonlite::toJSON(this_object$`address`, auto_unbox = TRUE, digits = NA))
        self$`address` <- `address_object`
      }
      if (!is.null(this_object$`phones`)) {
        self$`phones` <- ApiClient$new()$deserializeObj(this_object$`phones`, "array[character]", loadNamespace("ympa_r_client"))
      }
      if (!is.null(this_object$`workingSchedule`)) {
        `workingschedule_object` <- OutletWorkingScheduleDTO$new()
        `workingschedule_object`$fromJSON(jsonlite::toJSON(this_object$`workingSchedule`, auto_unbox = TRUE, digits = NA))
        self$`workingSchedule` <- `workingschedule_object`
      }
      if (!is.null(this_object$`deliveryRules`)) {
        self$`deliveryRules` <- ApiClient$new()$deserializeObj(this_object$`deliveryRules`, "array[OutletDeliveryRuleDTO]", loadNamespace("ympa_r_client"))
      }
      if (!is.null(this_object$`storagePeriod`)) {
        self$`storagePeriod` <- this_object$`storagePeriod`
      }
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`status`)) {
        `status_object` <- OutletStatusType$new()
        `status_object`$fromJSON(jsonlite::toJSON(this_object$`status`, auto_unbox = TRUE, digits = NA))
        self$`status` <- `status_object`
      }
      if (!is.null(this_object$`region`)) {
        `region_object` <- RegionDTO$new()
        `region_object`$fromJSON(jsonlite::toJSON(this_object$`region`, auto_unbox = TRUE, digits = NA))
        self$`region` <- `region_object`
      }
      if (!is.null(this_object$`shopOutletId`)) {
        self$`shopOutletId` <- this_object$`shopOutletId`
      }
      if (!is.null(this_object$`workingTime`)) {
        self$`workingTime` <- this_object$`workingTime`
      }
      if (!is.null(this_object$`moderationReason`)) {
        self$`moderationReason` <- this_object$`moderationReason`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return FullOutletDTO in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`name`)) {
          sprintf(
          '"name":
            "%s"
                    ',
          self$`name`
          )
        },
        if (!is.null(self$`type`)) {
          sprintf(
          '"type":
          %s
          ',
          jsonlite::toJSON(self$`type`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`coords`)) {
          sprintf(
          '"coords":
            "%s"
                    ',
          self$`coords`
          )
        },
        if (!is.null(self$`isMain`)) {
          sprintf(
          '"isMain":
            %s
                    ',
          tolower(self$`isMain`)
          )
        },
        if (!is.null(self$`shopOutletCode`)) {
          sprintf(
          '"shopOutletCode":
            "%s"
                    ',
          self$`shopOutletCode`
          )
        },
        if (!is.null(self$`visibility`)) {
          sprintf(
          '"visibility":
          %s
          ',
          jsonlite::toJSON(self$`visibility`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`address`)) {
          sprintf(
          '"address":
          %s
          ',
          jsonlite::toJSON(self$`address`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`phones`)) {
          sprintf(
          '"phones":
             [%s]
          ',
          paste(unlist(lapply(self$`phones`, function(x) paste0('"', x, '"'))), collapse = ",")
          )
        },
        if (!is.null(self$`workingSchedule`)) {
          sprintf(
          '"workingSchedule":
          %s
          ',
          jsonlite::toJSON(self$`workingSchedule`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`deliveryRules`)) {
          sprintf(
          '"deliveryRules":
          [%s]
',
          paste(sapply(self$`deliveryRules`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        },
        if (!is.null(self$`storagePeriod`)) {
          sprintf(
          '"storagePeriod":
            %d
                    ',
          self$`storagePeriod`
          )
        },
        if (!is.null(self$`id`)) {
          sprintf(
          '"id":
            %d
                    ',
          self$`id`
          )
        },
        if (!is.null(self$`status`)) {
          sprintf(
          '"status":
          %s
          ',
          jsonlite::toJSON(self$`status`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`region`)) {
          sprintf(
          '"region":
          %s
          ',
          jsonlite::toJSON(self$`region`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`shopOutletId`)) {
          sprintf(
          '"shopOutletId":
            "%s"
                    ',
          self$`shopOutletId`
          )
        },
        if (!is.null(self$`workingTime`)) {
          sprintf(
          '"workingTime":
            "%s"
                    ',
          self$`workingTime`
          )
        },
        if (!is.null(self$`moderationReason`)) {
          sprintf(
          '"moderationReason":
            "%s"
                    ',
          self$`moderationReason`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of FullOutletDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of FullOutletDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of FullOutletDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`name` <- this_object$`name`
      self$`type` <- OutletType$new()$fromJSON(jsonlite::toJSON(this_object$`type`, auto_unbox = TRUE, digits = NA))
      self$`coords` <- this_object$`coords`
      self$`isMain` <- this_object$`isMain`
      self$`shopOutletCode` <- this_object$`shopOutletCode`
      self$`visibility` <- OutletVisibilityType$new()$fromJSON(jsonlite::toJSON(this_object$`visibility`, auto_unbox = TRUE, digits = NA))
      self$`address` <- OutletAddressDTO$new()$fromJSON(jsonlite::toJSON(this_object$`address`, auto_unbox = TRUE, digits = NA))
      self$`phones` <- ApiClient$new()$deserializeObj(this_object$`phones`, "array[character]", loadNamespace("ympa_r_client"))
      self$`workingSchedule` <- OutletWorkingScheduleDTO$new()$fromJSON(jsonlite::toJSON(this_object$`workingSchedule`, auto_unbox = TRUE, digits = NA))
      self$`deliveryRules` <- ApiClient$new()$deserializeObj(this_object$`deliveryRules`, "array[OutletDeliveryRuleDTO]", loadNamespace("ympa_r_client"))
      self$`storagePeriod` <- this_object$`storagePeriod`
      self$`id` <- this_object$`id`
      self$`status` <- OutletStatusType$new()$fromJSON(jsonlite::toJSON(this_object$`status`, auto_unbox = TRUE, digits = NA))
      self$`region` <- RegionDTO$new()$fromJSON(jsonlite::toJSON(this_object$`region`, auto_unbox = TRUE, digits = NA))
      self$`shopOutletId` <- this_object$`shopOutletId`
      self$`workingTime` <- this_object$`workingTime`
      self$`moderationReason` <- this_object$`moderationReason`
      self
    },
    #' Validate JSON input with respect to FullOutletDTO
    #'
    #' @description
    #' Validate JSON input with respect to FullOutletDTO and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `name`
      if (!is.null(input_json$`name`)) {
        if (!(is.character(input_json$`name`) && length(input_json$`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", input_json$`name`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for FullOutletDTO: the required field `name` is missing."))
      }
      # check the required field `type`
      if (!is.null(input_json$`type`)) {
        stopifnot(R6::is.R6(input_json$`type`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for FullOutletDTO: the required field `type` is missing."))
      }
      # check the required field `address`
      if (!is.null(input_json$`address`)) {
        stopifnot(R6::is.R6(input_json$`address`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for FullOutletDTO: the required field `address` is missing."))
      }
      # check the required field `phones`
      if (!is.null(input_json$`phones`)) {
        stopifnot(is.vector(input_json$`phones`), length(input_json$`phones`) != 0)
        tmp <- sapply(input_json$`phones`, function(x) stopifnot(is.character(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for FullOutletDTO: the required field `phones` is missing."))
      }
      # check the required field `workingSchedule`
      if (!is.null(input_json$`workingSchedule`)) {
        stopifnot(R6::is.R6(input_json$`workingSchedule`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for FullOutletDTO: the required field `workingSchedule` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of FullOutletDTO
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
      # check if the required `name` is null
      if (is.null(self$`name`)) {
        return(FALSE)
      }

      # check if the required `type` is null
      if (is.null(self$`type`)) {
        return(FALSE)
      }

      # check if the required `address` is null
      if (is.null(self$`address`)) {
        return(FALSE)
      }

      # check if the required `phones` is null
      if (is.null(self$`phones`)) {
        return(FALSE)
      }

      if (length(self$`phones`) < 1) {
        return(FALSE)
      }

      # check if the required `workingSchedule` is null
      if (is.null(self$`workingSchedule`)) {
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
      # check if the required `name` is null
      if (is.null(self$`name`)) {
        invalid_fields["name"] <- "Non-nullable required field `name` cannot be null."
      }

      # check if the required `type` is null
      if (is.null(self$`type`)) {
        invalid_fields["type"] <- "Non-nullable required field `type` cannot be null."
      }

      # check if the required `address` is null
      if (is.null(self$`address`)) {
        invalid_fields["address"] <- "Non-nullable required field `address` cannot be null."
      }

      # check if the required `phones` is null
      if (is.null(self$`phones`)) {
        invalid_fields["phones"] <- "Non-nullable required field `phones` cannot be null."
      }

      if (length(self$`phones`) < 1) {
        invalid_fields["phones"] <- "Invalid length for ``, number of items must be greater than or equal to 1."
      }

      # check if the required `workingSchedule` is null
      if (is.null(self$`workingSchedule`)) {
        invalid_fields["workingSchedule"] <- "Non-nullable required field `workingSchedule` cannot be null."
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
# FullOutletDTO$unlock()
#
## Below is an example to define the print function
# FullOutletDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# FullOutletDTO$lock()

