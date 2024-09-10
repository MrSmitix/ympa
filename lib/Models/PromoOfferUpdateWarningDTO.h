
/*
 * PromoOfferUpdateWarningDTO.h
 *
 * Предупреждение, которое появилось при добавлении товара в акцию или изменении его цен.
 */

#ifndef TINY_CPP_CLIENT_PromoOfferUpdateWarningDTO_H_
#define TINY_CPP_CLIENT_PromoOfferUpdateWarningDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "PromoOfferUpdateWarningCodeType.h"
#include <list>

namespace Tiny {


/*! \brief Предупреждение, которое появилось при добавлении товара в акцию или изменении его цен.
 *
 *  \ingroup Models
 *
 */

class PromoOfferUpdateWarningDTO{
public:

    /*! \brief Constructor.
	 */
    PromoOfferUpdateWarningDTO();
    PromoOfferUpdateWarningDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~PromoOfferUpdateWarningDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	PromoOfferUpdateWarningCodeType getCode();

	/*! \brief Set 
	 */
	void setCode(PromoOfferUpdateWarningCodeType  code);
	/*! \brief Get Идентификаторы магазинов в кабинете, для которых получены предупреждения.  Не возвращается, если предупреждения действуют для всех магазинов в кабинете. 
	 */
	std::list<long> getCampaignIds();

	/*! \brief Set Идентификаторы магазинов в кабинете, для которых получены предупреждения.  Не возвращается, если предупреждения действуют для всех магазинов в кабинете. 
	 */
	void setCampaignIds(std::list <long> campaignIds);


    private:
    PromoOfferUpdateWarningCodeType code;
    std::list<long> campaignIds;
};
}

#endif /* TINY_CPP_CLIENT_PromoOfferUpdateWarningDTO_H_ */
