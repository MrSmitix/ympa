
/*
 * OfferParamDTO.h
 *
 * Параметры товара.  Если у товара несколько значений одного параметра, передайте их с одним и тем же &#x60;name&#x60;, но разными &#x60;value&#x60;.  {% cut \&quot;Пример\&quot; %}  &#x60;&#x60;&#x60;json \&quot;params\&quot;: [   {     \&quot;name\&quot;: \&quot;Цвет\&quot;,     \&quot;value\&quot;: \&quot;Зеленый\&quot;   },   {     \&quot;name\&quot;: \&quot;Цвет\&quot;,     \&quot;value\&quot;: \&quot;Желтый\&quot;   } ] &#x60;&#x60;&#x60;  {% endcut %} 
 */

#ifndef TINY_CPP_CLIENT_OfferParamDTO_H_
#define TINY_CPP_CLIENT_OfferParamDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Параметры товара.  Если у товара несколько значений одного параметра, передайте их с одним и тем же `name`, но разными `value`.  {% cut \"Пример\" %}  ```json \"params\": [   {     \"name\": \"Цвет\",     \"value\": \"Зеленый\"   },   {     \"name\": \"Цвет\",     \"value\": \"Желтый\"   } ] ```  {% endcut %} 
 *
 *  \ingroup Models
 *
 */

class OfferParamDTO{
public:

    /*! \brief Constructor.
	 */
    OfferParamDTO();
    OfferParamDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OfferParamDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Название.  Должно совпадать с названием характеристики на Маркете. Узнать его можно из Excel-шаблона категории или через запрос [POST category/{categoryId}/parameters](../../reference/content/getCategoryContentParameters.md). 
	 */
	std::string getName();

	/*! \brief Set Название.  Должно совпадать с названием характеристики на Маркете. Узнать его можно из Excel-шаблона категории или через запрос [POST category/{categoryId}/parameters](../../reference/content/getCategoryContentParameters.md). 
	 */
	void setName(std::string  name);
	/*! \brief Get Значение. 
	 */
	std::string getValue();

	/*! \brief Set Значение. 
	 */
	void setValue(std::string  value);


    private:
    std::string name{};
    std::string value{};
};
}

#endif /* TINY_CPP_CLIENT_OfferParamDTO_H_ */
