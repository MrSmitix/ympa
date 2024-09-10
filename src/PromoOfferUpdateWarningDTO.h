/*
 * PromoOfferUpdateWarningDTO.h
 *
 * Предупреждение, которое появилось при добавлении товара в акцию или изменении его цен.
 */

#ifndef _PromoOfferUpdateWarningDTO_H_
#define _PromoOfferUpdateWarningDTO_H_


#include <string>
#include "PromoOfferUpdateWarningCodeType.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Предупреждение, которое появилось при добавлении товара в акцию или изменении его цен.
 *
 *  \ingroup Models
 *
 */

class PromoOfferUpdateWarningDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	PromoOfferUpdateWarningDTO();
	PromoOfferUpdateWarningDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~PromoOfferUpdateWarningDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	PromoOfferUpdateWarningCodeType getCode();

	/*! \brief Set 
	 */
	void setCode(PromoOfferUpdateWarningCodeType  code);
	/*! \brief Get Идентификаторы магазинов в кабинете, для которых получены предупреждения.  Не возвращается, если предупреждения действуют для всех магазинов в кабинете. 
	 */
	std::list<long long> getCampaignIds();

	/*! \brief Set Идентификаторы магазинов в кабинете, для которых получены предупреждения.  Не возвращается, если предупреждения действуют для всех магазинов в кабинете. 
	 */
	void setCampaignIds(std::list <long long> campaignIds);

private:
	PromoOfferUpdateWarningCodeType code;
	std::list <long long>campaignIds;
	void __init();
	void __cleanup();

};
}
}

#endif /* _PromoOfferUpdateWarningDTO_H_ */
