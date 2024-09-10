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
class GENERATE_MASS_ORDER_LABELS_REQUEST




feature --Access

    business_id: INTEGER_64
      -- Идентификатор кабинета.
    order_ids: detachable LIST [INTEGER_64]
      -- Список идентификаторов заказов.

feature -- Change Element

    set_business_id (a_name: like business_id)
        -- Set 'business_id' with 'a_name'.
      do
        business_id := a_name
      ensure
        business_id_set: business_id = a_name
      end

    set_order_ids (a_name: like order_ids)
        -- Set 'order_ids' with 'a_name'.
      do
        order_ids := a_name
      ensure
        order_ids_set: order_ids = a_name
      end


 feature -- Status Report

    output: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append("%Nclass GENERATE_MASS_ORDER_LABELS_REQUEST%N")
        if attached business_id as l_business_id then
          Result.append ("%Nbusiness_id:")
          Result.append (l_business_id.out)
          Result.append ("%N")
        end
        if attached order_ids as l_order_ids then
          across l_order_ids as ic loop
            Result.append ("%N order_ids:")
            Result.append (ic.item.out)
            Result.append ("%N")
          end
        end
      end
end

