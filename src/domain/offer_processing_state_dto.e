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
class OFFER_PROCESSING_STATE_DTO




feature --Access

    status: detachable OFFER_PROCESSING_STATUS_TYPE
      
    notes: detachable LIST [OFFER_PROCESSING_NOTE_DTO]
      -- Причины, по которым товар не прошел модерацию.

feature -- Change Element

    set_status (a_name: like status)
        -- Set 'status' with 'a_name'.
      do
        status := a_name
      ensure
        status_set: status = a_name
      end

    set_notes (a_name: like notes)
        -- Set 'notes' with 'a_name'.
      do
        notes := a_name
      ensure
        notes_set: notes = a_name
      end


 feature -- Status Report

    output: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append("%Nclass OFFER_PROCESSING_STATE_DTO%N")
        if attached status as l_status then
          Result.append ("%Nstatus:")
          Result.append (l_status.out)
          Result.append ("%N")
        end
        if attached notes as l_notes then
          across l_notes as ic loop
            Result.append ("%N notes:")
            Result.append (ic.item.out)
            Result.append ("%N")
          end
        end
      end
end

