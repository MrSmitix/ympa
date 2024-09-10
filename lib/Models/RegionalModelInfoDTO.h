
/*
 * RegionalModelInfoDTO.h
 *
 * Региональная информация.
 */

#ifndef TINY_CPP_CLIENT_RegionalModelInfoDTO_H_
#define TINY_CPP_CLIENT_RegionalModelInfoDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "CurrencyType.h"

namespace Tiny {


/*! \brief Региональная информация.
 *
 *  \ingroup Models
 *
 */

class RegionalModelInfoDTO{
public:

    /*! \brief Constructor.
	 */
    RegionalModelInfoDTO();
    RegionalModelInfoDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~RegionalModelInfoDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	CurrencyType getCurrency();

	/*! \brief Set 
	 */
	void setCurrency(CurrencyType  currency);
	/*! \brief Get Идентификатор региона, для которого выводится информация о предложениях модели (доставляемых в этот регион).  Информацию о регионе по идентификатору можно получить с помощью запроса [GET regions/{regionId}](../../reference/regions/searchRegionsById.md). 
	 */
	long getRegionId();

	/*! \brief Set Идентификатор региона, для которого выводится информация о предложениях модели (доставляемых в этот регион).  Информацию о регионе по идентификатору можно получить с помощью запроса [GET regions/{regionId}](../../reference/regions/searchRegionsById.md). 
	 */
	void setRegionId(long  regionId);


    private:
    CurrencyType currency;
    long regionId{};
};
}

#endif /* TINY_CPP_CLIENT_RegionalModelInfoDTO_H_ */
