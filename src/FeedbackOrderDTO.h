/*
 * FeedbackOrderDTO.h
 *
 * Информация о заказе, указанная в отзыве.
 */

#ifndef _FeedbackOrderDTO_H_
#define _FeedbackOrderDTO_H_


#include <string>
#include "FeedbackDeliveryType.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Информация о заказе, указанная в отзыве.
 *
 *  \ingroup Models
 *
 */

class FeedbackOrderDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	FeedbackOrderDTO();
	FeedbackOrderDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~FeedbackOrderDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

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
	std::string shopOrderId;
	FeedbackDeliveryType delivery;
	void __init();
	void __cleanup();

};
}
}

#endif /* _FeedbackOrderDTO_H_ */
