note
 description:"[
		Партнерский API Маркета
 		API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
  		The version of the OpenAPI document: LATEST
 	    

  	NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

 		 Do not edit the class manually.
 	]"
	date: "$Date$"
	revision: "$Revision$"
	EIS:"Eiffel openapi generator", "src=https://openapi-generator.tech", "protocol=uri"
class API_ERROR_RESPONSE




feature --Access

    status: detachable API_RESPONSE_STATUS_TYPE
      
    errors: detachable LIST [API_ERROR_DTO]
      -- Список ошибок.

feature -- Change Element

    set_status (a_name: like status)
        -- Set 'status' with 'a_name'.
      do
        status := a_name
      ensure
        status_set: status = a_name
      end

    set_errors (a_name: like errors)
        -- Set 'errors' with 'a_name'.
      do
        errors := a_name
      ensure
        errors_set: errors = a_name
      end


 feature -- Status Report

    output: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append("%Nclass API_ERROR_RESPONSE%N")
        if attached status as l_status then
          Result.append ("%Nstatus:")
          Result.append (l_status.out)
          Result.append ("%N")
        end
        if attached errors as l_errors then
          across l_errors as ic loop
            Result.append ("%N errors:")
            Result.append (ic.item.out)
            Result.append ("%N")
          end
        end
      end
end

