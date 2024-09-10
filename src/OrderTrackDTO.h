/*
 * OrderTrackDTO.h
 *
 * Информация о трек-номере посылки (DBS).
 */

#ifndef _OrderTrackDTO_H_
#define _OrderTrackDTO_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Информация о трек-номере посылки (DBS).
 *
 *  \ingroup Models
 *
 */

class OrderTrackDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	OrderTrackDTO();
	OrderTrackDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrderTrackDTO();

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

#endif /* _OrderTrackDTO_H_ */
