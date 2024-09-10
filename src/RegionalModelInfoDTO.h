/*
 * RegionalModelInfoDTO.h
 *
 * Региональная информация.
 */

#ifndef _RegionalModelInfoDTO_H_
#define _RegionalModelInfoDTO_H_


#include <string>
#include "CurrencyType.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Региональная информация.
 *
 *  \ingroup Models
 *
 */

class RegionalModelInfoDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	RegionalModelInfoDTO();
	RegionalModelInfoDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~RegionalModelInfoDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	CurrencyType getCurrency();

	/*! \brief Set 
	 */
	void setCurrency(CurrencyType  currency);
	/*! \brief Get Идентификатор региона, для которого выводится информация о предложениях модели (доставляемых в этот регион).  Информацию о регионе по идентификатору можно получить с помощью запроса [GET regions/{regionId}](../../reference/regions/searchRegionsById.md). 
	 */
	long long getRegionId();

	/*! \brief Set Идентификатор региона, для которого выводится информация о предложениях модели (доставляемых в этот регион).  Информацию о регионе по идентификатору можно получить с помощью запроса [GET regions/{regionId}](../../reference/regions/searchRegionsById.md). 
	 */
	void setRegionId(long long  regionId);

private:
	CurrencyType currency;
	long long regionId;
	void __init();
	void __cleanup();

};
}
}

#endif /* _RegionalModelInfoDTO_H_ */
