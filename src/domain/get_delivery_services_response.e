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
class GET_DELIVERY_SERVICES_RESPONSE




feature --Access

    var_result: detachable DELIVERY_SERVICES_DTO
      

feature -- Change Element

    set_var_result (a_name: like var_result)
        -- Set 'var_result' with 'a_name'.
      do
        var_result := a_name
      ensure
        var_result_set: var_result = a_name
      end


 feature -- Status Report

    output: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append("%Nclass GET_DELIVERY_SERVICES_RESPONSE%N")
        if attached var_result as l_var_result then
          Result.append ("%Nvar_result:")
          Result.append (l_var_result.out)
          Result.append ("%N")
        end
      end
end

