/*
 * ParameterValueDTO.h
 *
 * Значение характеристики.  Вы можете указывать несколько значений одной характеристики при условии, что:  * Тип характеристики — &#x60;ENUM&#x60;. * В ответе на запрос [POST category/{categoryId}/parameters](../../reference/content/getCategoryContentParameters.md) у данной характеристики поле &#x60;multivalue&#x60; имеет значение &#x60;true&#x60;.  Для этого в &#x60;parameterValues&#x60; передавайте каждое значение отдельно — несколько объектов с параметрами &#x60;parameterId&#x60;, &#x60;valueId&#x60; и &#x60;value&#x60;. Параметр &#x60;parameterId&#x60; должен быть одинаковым. 
 */

#ifndef _ParameterValueDTO_H_
#define _ParameterValueDTO_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Значение характеристики.  Вы можете указывать несколько значений одной характеристики при условии, что:  * Тип характеристики — `ENUM`. * В ответе на запрос [POST category/{categoryId}/parameters](../../reference/content/getCategoryContentParameters.md) у данной характеристики поле `multivalue` имеет значение `true`.  Для этого в `parameterValues` передавайте каждое значение отдельно — несколько объектов с параметрами `parameterId`, `valueId` и `value`. Параметр `parameterId` должен быть одинаковым. 
 *
 *  \ingroup Models
 *
 */

class ParameterValueDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	ParameterValueDTO();
	ParameterValueDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ParameterValueDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Идентификатор характеристики.
	 */
	long long getParameterId();

	/*! \brief Set Идентификатор характеристики.
	 */
	void setParameterId(long long  parameterId);
	/*! \brief Get Идентификатор единицы измерения. Если вы не передали параметр `unitId`, используется единица измерения по умолчанию.
	 */
	long long getUnitId();

	/*! \brief Set Идентификатор единицы измерения. Если вы не передали параметр `unitId`, используется единица измерения по умолчанию.
	 */
	void setUnitId(long long  unitId);
	/*! \brief Get Идентификатор значения.  Обязательно указывайте идентификатор, если передаете значение из перечня допустимых значений, полученного от Маркета.  Только для характеристик типа `ENUM`. 
	 */
	long long getValueId();

	/*! \brief Set Идентификатор значения.  Обязательно указывайте идентификатор, если передаете значение из перечня допустимых значений, полученного от Маркета.  Только для характеристик типа `ENUM`. 
	 */
	void setValueId(long long  valueId);
	/*! \brief Get Значение.
	 */
	std::string getValue();

	/*! \brief Set Значение.
	 */
	void setValue(std::string  value);

private:
	long long parameterId;
	long long unitId;
	long long valueId;
	std::string value;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ParameterValueDTO_H_ */
