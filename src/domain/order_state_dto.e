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
class ORDER_STATE_DTO




feature --Access

    id: INTEGER_64
      -- Идентификатор заказа.
    status: detachable ORDER_STATUS_TYPE
      
    substatus: detachable ORDER_SUBSTATUS_TYPE
      

feature -- Change Element

    set_id (a_name: like id)
        -- Set 'id' with 'a_name'.
      do
        id := a_name
      ensure
        id_set: id = a_name
      end

    set_status (a_name: like status)
        -- Set 'status' with 'a_name'.
      do
        status := a_name
      ensure
        status_set: status = a_name
      end

    set_substatus (a_name: like substatus)
        -- Set 'substatus' with 'a_name'.
      do
        substatus := a_name
      ensure
        substatus_set: substatus = a_name
      end


 feature -- Status Report

    output: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append("%Nclass ORDER_STATE_DTO%N")
        if attached id as l_id then
          Result.append ("%Nid:")
          Result.append (l_id.out)
          Result.append ("%N")
        end
        if attached status as l_status then
          Result.append ("%Nstatus:")
          Result.append (l_status.out)
          Result.append ("%N")
        end
        if attached substatus as l_substatus then
          Result.append ("%Nsubstatus:")
          Result.append (l_substatus.out)
          Result.append ("%N")
        end
      end
end

