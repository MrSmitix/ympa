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
class SET_ORDER_SHIPMENT_BOXES_REQUEST




feature --Access

    boxes: detachable LIST [PARCEL_BOX_DTO]
      -- Список грузовых мест. Маркет определяет количество мест по длине этого списка.

feature -- Change Element

    set_boxes (a_name: like boxes)
        -- Set 'boxes' with 'a_name'.
      do
        boxes := a_name
      ensure
        boxes_set: boxes = a_name
      end


 feature -- Status Report

    output: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append("%Nclass SET_ORDER_SHIPMENT_BOXES_REQUEST%N")
        if attached boxes as l_boxes then
          across l_boxes as ic loop
            Result.append ("%N boxes:")
            Result.append (ic.item.out)
            Result.append ("%N")
          end
        end
      end
end

