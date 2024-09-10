
/*
 * CategoryParameterUnitDTO.h
 *
 * Единицы измерения характеристики товара.
 */

#ifndef TINY_CPP_CLIENT_CategoryParameterUnitDTO_H_
#define TINY_CPP_CLIENT_CategoryParameterUnitDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "UnitDTO.h"
#include <list>

namespace Tiny {


/*! \brief Единицы измерения характеристики товара.
 *
 *  \ingroup Models
 *
 */

class CategoryParameterUnitDTO{
public:

    /*! \brief Constructor.
	 */
    CategoryParameterUnitDTO();
    CategoryParameterUnitDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CategoryParameterUnitDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Единица измерения по умолчанию.
	 */
	long getDefaultUnitId();

	/*! \brief Set Единица измерения по умолчанию.
	 */
	void setDefaultUnitId(long  defaultUnitId);
	/*! \brief Get Допустимые единицы измерения.
	 */
	std::list<UnitDTO> getUnits();

	/*! \brief Set Допустимые единицы измерения.
	 */
	void setUnits(std::list <UnitDTO> units);


    private:
    long defaultUnitId{};
    std::list<UnitDTO> units;
};
}

#endif /* TINY_CPP_CLIENT_CategoryParameterUnitDTO_H_ */
