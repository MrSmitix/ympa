
/*
 * SetOrderDeliveryTrackCodeRequest.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_SetOrderDeliveryTrackCodeRequest_H_
#define TINY_CPP_CLIENT_SetOrderDeliveryTrackCodeRequest_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class SetOrderDeliveryTrackCodeRequest{
public:

    /*! \brief Constructor.
	 */
    SetOrderDeliveryTrackCodeRequest();
    SetOrderDeliveryTrackCodeRequest(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~SetOrderDeliveryTrackCodeRequest();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Трек‑номер посылки.
	 */
	std::string getTrackCode();

	/*! \brief Set Трек‑номер посылки.
	 */
	void setTrackCode(std::string  trackCode);
	/*! \brief Get Идентификатор службы доставки. Информацию о службе доставки можно получить с помощью запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md).
	 */
	long getDeliveryServiceId();

	/*! \brief Set Идентификатор службы доставки. Информацию о службе доставки можно получить с помощью запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md).
	 */
	void setDeliveryServiceId(long  deliveryServiceId);


    private:
    std::string trackCode{};
    long deliveryServiceId{};
};
}

#endif /* TINY_CPP_CLIENT_SetOrderDeliveryTrackCodeRequest_H_ */
