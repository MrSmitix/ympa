
/*
 * UpdatePromoOffersResultDTO.h
 *
 * Ошибки и предупреждения, которые появились при добавлении товаров в акцию.
 */

#ifndef TINY_CPP_CLIENT_UpdatePromoOffersResultDTO_H_
#define TINY_CPP_CLIENT_UpdatePromoOffersResultDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "RejectedPromoOfferUpdateDTO.h"
#include "WarningPromoOfferUpdateDTO.h"
#include <list>

namespace Tiny {


/*! \brief Ошибки и предупреждения, которые появились при добавлении товаров в акцию.
 *
 *  \ingroup Models
 *
 */

class UpdatePromoOffersResultDTO{
public:

    /*! \brief Constructor.
	 */
    UpdatePromoOffersResultDTO();
    UpdatePromoOffersResultDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~UpdatePromoOffersResultDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Изменения, которые были отклонены.  Возвращается, только если есть отклоненные изменения. 
	 */
	std::list<RejectedPromoOfferUpdateDTO> getRejectedOffers();

	/*! \brief Set Изменения, которые были отклонены.  Возвращается, только если есть отклоненные изменения. 
	 */
	void setRejectedOffers(std::list <RejectedPromoOfferUpdateDTO> rejectedOffers);
	/*! \brief Get Изменения, по которым есть предупреждения. Они информируют о возможных проблемах. Информация о товарах обновится.  Возвращается, только если есть предупреждения. 
	 */
	std::list<WarningPromoOfferUpdateDTO> getWarningOffers();

	/*! \brief Set Изменения, по которым есть предупреждения. Они информируют о возможных проблемах. Информация о товарах обновится.  Возвращается, только если есть предупреждения. 
	 */
	void setWarningOffers(std::list <WarningPromoOfferUpdateDTO> warningOffers);


    private:
    std::list<RejectedPromoOfferUpdateDTO> rejectedOffers;
    std::list<WarningPromoOfferUpdateDTO> warningOffers;
};
}

#endif /* TINY_CPP_CLIENT_UpdatePromoOffersResultDTO_H_ */
