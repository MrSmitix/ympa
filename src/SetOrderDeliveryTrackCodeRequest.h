/*
 * SetOrderDeliveryTrackCodeRequest.h
 *
 * 
 */

#ifndef _SetOrderDeliveryTrackCodeRequest_H_
#define _SetOrderDeliveryTrackCodeRequest_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class SetOrderDeliveryTrackCodeRequest : public Object {
public:
	/*! \brief Constructor.
	 */
	SetOrderDeliveryTrackCodeRequest();
	SetOrderDeliveryTrackCodeRequest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~SetOrderDeliveryTrackCodeRequest();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Трек‑номер посылки.
	 */
	std::string getTrackCode();

	/*! \brief Set Трек‑номер посылки.
	 */
	void setTrackCode(std::string  trackCode);
	/*! \brief Get Идентификатор службы доставки. Информацию о службе доставки можно получить с помощью запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md).
	 */
	long long getDeliveryServiceId();

	/*! \brief Set Идентификатор службы доставки. Информацию о службе доставки можно получить с помощью запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md).
	 */
	void setDeliveryServiceId(long long  deliveryServiceId);

private:
	std::string trackCode;
	long long deliveryServiceId;
	void __init();
	void __cleanup();

};
}
}

#endif /* _SetOrderDeliveryTrackCodeRequest_H_ */
