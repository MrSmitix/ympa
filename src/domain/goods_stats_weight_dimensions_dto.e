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
class GOODS_STATS_WEIGHT_DIMENSIONS_DTO




feature --Access

    length: REAL_32
      -- Длина товара в сантиметрах.
    width: REAL_32
      -- Ширина товара в сантиметрах.
    height: REAL_32
      -- Высота товара в сантиметрах.
    weight: REAL_32
      -- Вес товара в килограммах.

feature -- Change Element

    set_length (a_name: like length)
        -- Set 'length' with 'a_name'.
      do
        length := a_name
      ensure
        length_set: length = a_name
      end

    set_width (a_name: like width)
        -- Set 'width' with 'a_name'.
      do
        width := a_name
      ensure
        width_set: width = a_name
      end

    set_height (a_name: like height)
        -- Set 'height' with 'a_name'.
      do
        height := a_name
      ensure
        height_set: height = a_name
      end

    set_weight (a_name: like weight)
        -- Set 'weight' with 'a_name'.
      do
        weight := a_name
      ensure
        weight_set: weight = a_name
      end


 feature -- Status Report

    output: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append("%Nclass GOODS_STATS_WEIGHT_DIMENSIONS_DTO%N")
        if attached length as l_length then
          Result.append ("%Nlength:")
          Result.append (l_length.out)
          Result.append ("%N")
        end
        if attached width as l_width then
          Result.append ("%Nwidth:")
          Result.append (l_width.out)
          Result.append ("%N")
        end
        if attached height as l_height then
          Result.append ("%Nheight:")
          Result.append (l_height.out)
          Result.append ("%N")
        end
        if attached weight as l_weight then
          Result.append ("%Nweight:")
          Result.append (l_weight.out)
          Result.append ("%N")
        end
      end
end

