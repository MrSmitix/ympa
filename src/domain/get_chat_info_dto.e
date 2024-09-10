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
class GET_CHAT_INFO_DTO




feature --Access

    chat_id: INTEGER_64
      -- Идентификатор чата.
    order_id: INTEGER_64
      -- Идентификатор заказа.
    type: detachable CHAT_TYPE
      
    status: detachable CHAT_STATUS_TYPE
      
    created_at: detachable DATE_TIME
      -- Дата и время создания чата.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:00:00+03:00`. 
    updated_at: detachable DATE_TIME
      -- Дата и время последнего сообщения в чате.

feature -- Change Element

    set_chat_id (a_name: like chat_id)
        -- Set 'chat_id' with 'a_name'.
      do
        chat_id := a_name
      ensure
        chat_id_set: chat_id = a_name
      end

    set_order_id (a_name: like order_id)
        -- Set 'order_id' with 'a_name'.
      do
        order_id := a_name
      ensure
        order_id_set: order_id = a_name
      end

    set_type (a_name: like type)
        -- Set 'type' with 'a_name'.
      do
        type := a_name
      ensure
        type_set: type = a_name
      end

    set_status (a_name: like status)
        -- Set 'status' with 'a_name'.
      do
        status := a_name
      ensure
        status_set: status = a_name
      end

    set_created_at (a_name: like created_at)
        -- Set 'created_at' with 'a_name'.
      do
        created_at := a_name
      ensure
        created_at_set: created_at = a_name
      end

    set_updated_at (a_name: like updated_at)
        -- Set 'updated_at' with 'a_name'.
      do
        updated_at := a_name
      ensure
        updated_at_set: updated_at = a_name
      end


 feature -- Status Report

    output: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append("%Nclass GET_CHAT_INFO_DTO%N")
        if attached chat_id as l_chat_id then
          Result.append ("%Nchat_id:")
          Result.append (l_chat_id.out)
          Result.append ("%N")
        end
        if attached order_id as l_order_id then
          Result.append ("%Norder_id:")
          Result.append (l_order_id.out)
          Result.append ("%N")
        end
        if attached type as l_type then
          Result.append ("%Ntype:")
          Result.append (l_type.out)
          Result.append ("%N")
        end
        if attached status as l_status then
          Result.append ("%Nstatus:")
          Result.append (l_status.out)
          Result.append ("%N")
        end
        if attached created_at as l_created_at then
          Result.append ("%Ncreated_at:")
          Result.append (l_created_at.out)
          Result.append ("%N")
        end
        if attached updated_at as l_updated_at then
          Result.append ("%Nupdated_at:")
          Result.append (l_updated_at.out)
          Result.append ("%N")
        end
      end
end

