
/*
 * FeedbackOrderDTO.h
 *
 * Информация о заказе, указанная в отзыве.
 */

#ifndef TINY_CPP_CLIENT_FeedbackOrderDTO_H_
#define TINY_CPP_CLIENT_FeedbackOrderDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "FeedbackDeliveryType.h"

namespace Tiny {


/*! \brief Информация о заказе, указанная в отзыве.
 *
 *  \ingroup Models
 *
 */

class FeedbackOrderDTO{
public:

    /*! \brief Constructor.
	 */
    FeedbackOrderDTO();
    FeedbackOrderDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~FeedbackOrderDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Номер заказа, указанный в отзыве.
	 */
	std::string getShopOrderId();

	/*! \brief Set Номер заказа, указанный в отзыве.
	 */
	void setShopOrderId(std::string  shopOrderId);
	/*! \brief Get 
	 */
	FeedbackDeliveryType getDelivery();

	/*! \brief Set 
	 */
	void setDelivery(FeedbackDeliveryType  delivery);


    private:
    std::string shopOrderId{};
    FeedbackDeliveryType delivery;
};
}

#endif /* TINY_CPP_CLIENT_FeedbackOrderDTO_H_ */
