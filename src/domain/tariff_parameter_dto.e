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
class TARIFF_PARAMETER_DTO




feature --Access

    name: detachable STRING_32
      -- Название параметра.
    value: detachable STRING_32
      -- Значение параметра.

feature -- Change Element

    set_name (a_name: like name)
        -- Set 'name' with 'a_name'.
      do
        name := a_name
      ensure
        name_set: name = a_name
      end

    set_value (a_name: like value)
        -- Set 'value' with 'a_name'.
      do
        value := a_name
      ensure
        value_set: value = a_name
      end


 feature -- Status Report

    output: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append("%Nclass TARIFF_PARAMETER_DTO%N")
        if attached name as l_name then
          Result.append ("%Nname:")
          Result.append (l_name.out)
          Result.append ("%N")
        end
        if attached value as l_value then
          Result.append ("%Nvalue:")
          Result.append (l_value.out)
          Result.append ("%N")
        end
      end
end

