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
class ORDER_DIGITAL_ITEM_DTO




feature --Access

    id: INTEGER_64
      -- Идентификатор товара в заказе.  Он приходит в ответе на запрос [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md) и в запросе Маркета [POST order/accept](../../pushapi/reference/orderAccept.md) — параметр `id` в `items`. 
    code: detachable STRING_32
      -- Сам ключ.
    slip: detachable STRING_32
      -- Инструкция по активации.
    activate_till: detachable DATE
      -- Дата, до которой нужно активировать ключ. Если ключ действует бессрочно, укажите любую дату в отдаленном будущем.  Формат даты: `ГГГГ-ММ-ДД`. 

feature -- Change Element

    set_id (a_name: like id)
        -- Set 'id' with 'a_name'.
      do
        id := a_name
      ensure
        id_set: id = a_name
      end

    set_code (a_name: like code)
        -- Set 'code' with 'a_name'.
      do
        code := a_name
      ensure
        code_set: code = a_name
      end

    set_slip (a_name: like slip)
        -- Set 'slip' with 'a_name'.
      do
        slip := a_name
      ensure
        slip_set: slip = a_name
      end

    set_activate_till (a_name: like activate_till)
        -- Set 'activate_till' with 'a_name'.
      do
        activate_till := a_name
      ensure
        activate_till_set: activate_till = a_name
      end


 feature -- Status Report

    output: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append("%Nclass ORDER_DIGITAL_ITEM_DTO%N")
        if attached id as l_id then
          Result.append ("%Nid:")
          Result.append (l_id.out)
          Result.append ("%N")
        end
        if attached code as l_code then
          Result.append ("%Ncode:")
          Result.append (l_code.out)
          Result.append ("%N")
        end
        if attached slip as l_slip then
          Result.append ("%Nslip:")
          Result.append (l_slip.out)
          Result.append ("%N")
        end
        if attached activate_till as l_activate_till then
          Result.append ("%Nactivate_till:")
          Result.append (l_activate_till.out)
          Result.append ("%N")
        end
      end
end

