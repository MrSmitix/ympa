
/*
 * ParameterValueDTO.h
 *
 * Значение характеристики.  Вы можете указывать несколько значений одной характеристики при условии, что:  * Тип характеристики — &#x60;ENUM&#x60;. * В ответе на запрос [POST category/{categoryId}/parameters](../../reference/content/getCategoryContentParameters.md) у данной характеристики поле &#x60;multivalue&#x60; имеет значение &#x60;true&#x60;.  Для этого в &#x60;parameterValues&#x60; передавайте каждое значение отдельно — несколько объектов с параметрами &#x60;parameterId&#x60;, &#x60;valueId&#x60; и &#x60;value&#x60;. Параметр &#x60;parameterId&#x60; должен быть одинаковым. 
 */

#ifndef TINY_CPP_CLIENT_ParameterValueDTO_H_
#define TINY_CPP_CLIENT_ParameterValueDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Значение характеристики.  Вы можете указывать несколько значений одной характеристики при условии, что:  * Тип характеристики — `ENUM`. * В ответе на запрос [POST category/{categoryId}/parameters](../../reference/content/getCategoryContentParameters.md) у данной характеристики поле `multivalue` имеет значение `true`.  Для этого в `parameterValues` передавайте каждое значение отдельно — несколько объектов с параметрами `parameterId`, `valueId` и `value`. Параметр `parameterId` должен быть одинаковым. 
 *
 *  \ingroup Models
 *
 */

class ParameterValueDTO{
public:

    /*! \brief Constructor.
	 */
    ParameterValueDTO();
    ParameterValueDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ParameterValueDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Идентификатор характеристики.
	 */
	long getParameterId();

	/*! \brief Set Идентификатор характеристики.
	 */
	void setParameterId(long  parameterId);
	/*! \brief Get Идентификатор единицы измерения. Если вы не передали параметр `unitId`, используется единица измерения по умолчанию.
	 */
	long getUnitId();

	/*! \brief Set Идентификатор единицы измерения. Если вы не передали параметр `unitId`, используется единица измерения по умолчанию.
	 */
	void setUnitId(long  unitId);
	/*! \brief Get Идентификатор значения.  Обязательно указывайте идентификатор, если передаете значение из перечня допустимых значений, полученного от Маркета.  Только для характеристик типа `ENUM`. 
	 */
	long getValueId();

	/*! \brief Set Идентификатор значения.  Обязательно указывайте идентификатор, если передаете значение из перечня допустимых значений, полученного от Маркета.  Только для характеристик типа `ENUM`. 
	 */
	void setValueId(long  valueId);
	/*! \brief Get Значение.
	 */
	std::string getValue();

	/*! \brief Set Значение.
	 */
	void setValue(std::string  value);


    private:
    long parameterId{};
    long unitId{};
    long valueId{};
    std::string value{};
};
}

#endif /* TINY_CPP_CLIENT_ParameterValueDTO_H_ */
