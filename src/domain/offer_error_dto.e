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
class OFFER_ERROR_DTO




feature --Access

    message: detachable STRING_32
      -- Тип ошибки.
    comment: detachable STRING_32
      -- Пояснение.

feature -- Change Element

    set_message (a_name: like message)
        -- Set 'message' with 'a_name'.
      do
        message := a_name
      ensure
        message_set: message = a_name
      end

    set_comment (a_name: like comment)
        -- Set 'comment' with 'a_name'.
      do
        comment := a_name
      ensure
        comment_set: comment = a_name
      end


 feature -- Status Report

    output: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append("%Nclass OFFER_ERROR_DTO%N")
        if attached message as l_message then
          Result.append ("%Nmessage:")
          Result.append (l_message.out)
          Result.append ("%N")
        end
        if attached comment as l_comment then
          Result.append ("%Ncomment:")
          Result.append (l_comment.out)
          Result.append ("%N")
        end
      end
end

