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
class GET_MODELS_REQUEST




feature --Access

    models: detachable LIST [INTEGER_64]
      -- Список моделей.

feature -- Change Element

    set_models (a_name: like models)
        -- Set 'models' with 'a_name'.
      do
        models := a_name
      ensure
        models_set: models = a_name
      end


 feature -- Status Report

    output: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append("%Nclass GET_MODELS_REQUEST%N")
        if attached models as l_models then
          across l_models as ic loop
            Result.append ("%N models:")
            Result.append (ic.item.out)
            Result.append ("%N")
          end
        end
      end
end

