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
class GENERATE_BOOST_CONSOLIDATED_REQUEST




feature --Access

    business_id: INTEGER_64
      -- Идентификатор бизнеса.
    date_from: detachable DATE
      -- Начало периода, включительно.
    date_to: detachable DATE
      -- Конец периода, включительно.

feature -- Change Element

    set_business_id (a_name: like business_id)
        -- Set 'business_id' with 'a_name'.
      do
        business_id := a_name
      ensure
        business_id_set: business_id = a_name
      end

    set_date_from (a_name: like date_from)
        -- Set 'date_from' with 'a_name'.
      do
        date_from := a_name
      ensure
        date_from_set: date_from = a_name
      end

    set_date_to (a_name: like date_to)
        -- Set 'date_to' with 'a_name'.
      do
        date_to := a_name
      ensure
        date_to_set: date_to = a_name
      end


 feature -- Status Report

    output: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append("%Nclass GENERATE_BOOST_CONSOLIDATED_REQUEST%N")
        if attached business_id as l_business_id then
          Result.append ("%Nbusiness_id:")
          Result.append (l_business_id.out)
          Result.append ("%N")
        end
        if attached date_from as l_date_from then
          Result.append ("%Ndate_from:")
          Result.append (l_date_from.out)
          Result.append ("%N")
        end
        if attached date_to as l_date_to then
          Result.append ("%Ndate_to:")
          Result.append (l_date_to.out)
          Result.append ("%N")
        end
      end
end

