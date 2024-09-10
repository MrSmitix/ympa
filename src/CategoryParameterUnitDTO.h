/*
 * CategoryParameterUnitDTO.h
 *
 * Единицы измерения характеристики товара.
 */

#ifndef _CategoryParameterUnitDTO_H_
#define _CategoryParameterUnitDTO_H_


#include <string>
#include "UnitDTO.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Единицы измерения характеристики товара.
 *
 *  \ingroup Models
 *
 */

class CategoryParameterUnitDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	CategoryParameterUnitDTO();
	CategoryParameterUnitDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CategoryParameterUnitDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Единица измерения по умолчанию.
	 */
	long long getDefaultUnitId();

	/*! \brief Set Единица измерения по умолчанию.
	 */
	void setDefaultUnitId(long long  defaultUnitId);
	/*! \brief Get Допустимые единицы измерения.
	 */
	std::list<UnitDTO> getUnits();

	/*! \brief Set Допустимые единицы измерения.
	 */
	void setUnits(std::list <UnitDTO> units);

private:
	long long defaultUnitId;
	std::list <UnitDTO>units;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CategoryParameterUnitDTO_H_ */
