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
class PARTNER_SHIPMENT_WAREHOUSE_DTO




feature --Access

    id: INTEGER_64
      -- Идентификатор склада отправления.
    name: detachable STRING_32
      -- Наименование склада отправления.
    address: detachable STRING_32
      -- Адрес склада отправления.

feature -- Change Element

    set_id (a_name: like id)
        -- Set 'id' with 'a_name'.
      do
        id := a_name
      ensure
        id_set: id = a_name
      end

    set_name (a_name: like name)
        -- Set 'name' with 'a_name'.
      do
        name := a_name
      ensure
        name_set: name = a_name
      end

    set_address (a_name: like address)
        -- Set 'address' with 'a_name'.
      do
        address := a_name
      ensure
        address_set: address = a_name
      end


 feature -- Status Report

    output: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append("%Nclass PARTNER_SHIPMENT_WAREHOUSE_DTO%N")
        if attached id as l_id then
          Result.append ("%Nid:")
          Result.append (l_id.out)
          Result.append ("%N")
        end
        if attached name as l_name then
          Result.append ("%Nname:")
          Result.append (l_name.out)
          Result.append ("%N")
        end
        if attached address as l_address then
          Result.append ("%Naddress:")
          Result.append (l_address.out)
          Result.append ("%N")
        end
      end
end

